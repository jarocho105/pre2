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

import com.bydan.erp.nomina.util.EmpleadoEstructuraConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoEstructuraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoEstructuraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoEstructuraBean;
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
public class EmpleadoEstructuraBeanSwingJInternalFrame extends EmpleadoEstructuraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoEstructuraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoEstructura> empleadoestructuraValidator = new ClassValidator<EmpleadoEstructura>(EmpleadoEstructura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoEstructura empleadoestructura;	
	public EmpleadoEstructura empleadoestructuraAux;
	public EmpleadoEstructura empleadoestructuraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoEstructura empleadoestructuraTotales;
	public Long idEmpleadoEstructuraActual;
	public Long iIdNuevoEmpleadoEstructura=0L;
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

	public String sFinalQueryComboCargo="";

	public List<Cargo> cargosForeignKey;

	public List<Cargo> getcargosForeignKey() {
		return cargosForeignKey;
	}

	public void setcargosForeignKey(List<Cargo> cargosForeignKey) {
		this.cargosForeignKey = cargosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cargo cargoForeignKey;

	public Cargo getcargoForeignKey() {
		return cargoForeignKey;
	}

	public void setcargoForeignKey(Cargo cargoForeignKey) {
		this.cargoForeignKey = cargoForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoEstructura;
	public Boolean isPermisoNuevoEmpleadoEstructura;
	public Boolean isPermisoActualizarEmpleadoEstructura;
	public Boolean isPermisoActualizarOriginalEmpleadoEstructura;
	public Boolean isPermisoEliminarEmpleadoEstructura;
	public Boolean isPermisoGuardarCambiosEmpleadoEstructura;
	public Boolean isPermisoConsultaEmpleadoEstructura;
	public Boolean isPermisoBusquedaEmpleadoEstructura;
	public Boolean isPermisoReporteEmpleadoEstructura;
	public Boolean isPermisoPaginacionMedioEmpleadoEstructura;
	public Boolean isPermisoPaginacionAltoEmpleadoEstructura;
	public Boolean isPermisoPaginacionTodoEmpleadoEstructura;
	public Boolean isPermisoCopiarEmpleadoEstructura;
	public Boolean isPermisoVerFormEmpleadoEstructura;
	public Boolean isPermisoDuplicarEmpleadoEstructura;
	public Boolean isPermisoOrdenEmpleadoEstructura;
	
	
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
	
	public EmpleadoEstructuraParameterReturnGeneral empleadoestructuraReturnGeneral;
	public EmpleadoEstructuraParameterReturnGeneral empleadoestructuraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoEstructura=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoEstructura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoEstructuraSessionBeanAdditional empleadoestructuraSessionBeanAdditional=null;
	
	public EmpleadoEstructuraSessionBeanAdditional getEmpleadoEstructuraSessionBeanAdditional() {
		return this.empleadoestructuraSessionBeanAdditional;
	}
	
	public void setEmpleadoEstructuraSessionBeanAdditional(EmpleadoEstructuraSessionBeanAdditional empleadoestructuraSessionBeanAdditional) {
		try {
			this.empleadoestructuraSessionBeanAdditional=empleadoestructuraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoEstructuraBeanSwingJInternalFrameAdditional empleadoestructuraBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoEstructuraBeanSwingJInternalFrame
	
	public EmpleadoEstructuraBeanSwingJInternalFrameAdditional getEmpleadoEstructuraBeanSwingJInternalFrameAdditional() {
		return this.empleadoestructuraBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoEstructuraBeanSwingJInternalFrameAdditional(EmpleadoEstructuraBeanSwingJInternalFrameAdditional empleadoestructuraBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoestructuraBeanSwingJInternalFrameAdditional=empleadoestructuraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoEstructuraLogic empleadoestructuraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoEstructura empleadoestructuraBean;
	public EmpleadoEstructuraConstantesFunciones empleadoestructuraConstantesFunciones;
	//public EmpleadoEstructuraParameterReturnGeneral empleadoestructuraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public CargoLogic cargoLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoEstructura> empleadoestructuras;	
	//public List<EmpleadoEstructura> empleadoestructurasEliminados;
	//public List<EmpleadoEstructura> empleadoestructurasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoEstructura=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoEstructura=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoEstructura=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoEstructura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoEstructura=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoEstructura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;	
	
	
	public Boolean isVisibilidadFK_IdCargo=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoEmpleadoEstructura() {
		return this.iIdNuevoEmpleadoEstructura;
	}

	public void setiIdNuevoEmpleadoEstructura(Long iIdNuevoEmpleadoEstructura) {
		this.iIdNuevoEmpleadoEstructura = iIdNuevoEmpleadoEstructura;
	}
	
	public Long getidEmpleadoEstructuraActual() {
		return this.idEmpleadoEstructuraActual;
	}

	public void setidEmpleadoEstructuraActual(Long idEmpleadoEstructuraActual) {
		this.idEmpleadoEstructuraActual = idEmpleadoEstructuraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoEstructura getempleadoestructura() {
		return this.empleadoestructura;
	}

	public void setempleadoestructura(EmpleadoEstructura empleadoestructura) {
		this.empleadoestructura = empleadoestructura;
	}
	
	public EmpleadoEstructura getempleadoestructuraAux() {
		return this.empleadoestructuraAux;
	}

	public void setempleadoestructuraAux(EmpleadoEstructura empleadoestructuraAux) {
		this.empleadoestructuraAux = empleadoestructuraAux;
	}				
	
	public EmpleadoEstructura getempleadoestructuraAnterior() {
		return this.empleadoestructuraAnterior;
	}

	public void setempleadoestructuraAnterior(EmpleadoEstructura empleadoestructuraAnterior) {
		this.empleadoestructuraAnterior = empleadoestructuraAnterior;
	}	
	
	public EmpleadoEstructura getempleadoestructuraTotales() {
		return this.empleadoestructuraTotales;
	}

	public void setempleadoestructuraTotales(EmpleadoEstructura empleadoestructuraTotales) {
		this.empleadoestructuraTotales = empleadoestructuraTotales;
	}	
	
	public EmpleadoEstructura getempleadoestructuraBean() {
		return this.empleadoestructuraBean;
	}

	public void setempleadoestructuraBean(EmpleadoEstructura empleadoestructuraBean) {
		this.empleadoestructuraBean = empleadoestructuraBean;
	}	
	
	public EmpleadoEstructuraParameterReturnGeneral getempleadoestructuraReturnGeneral() {
		return this.empleadoestructuraReturnGeneral;
	}

	public void setempleadoestructuraReturnGeneral(EmpleadoEstructuraParameterReturnGeneral empleadoestructuraReturnGeneral) {
		this.empleadoestructuraReturnGeneral = empleadoestructuraReturnGeneral;
	}	
	
	
	public Long id_cargoFK_IdCargo=-1L;

	public Long getid_cargoFK_IdCargo() {
		return this.id_cargoFK_IdCargo;
	}

	public void setid_cargoFK_IdCargo(Long id_cargoFK_IdCargo) {
		this.id_cargoFK_IdCargo = id_cargoFK_IdCargo;
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
	
	
	public EmpleadoEstructuraLogic getEmpleadoEstructuraLogic()	{		
		return empleadoestructuraLogic;
	}

	public void setEmpleadoEstructuraLogic(EmpleadoEstructuraLogic empleadoestructuraLogic) {
		this.empleadoestructuraLogic = empleadoestructuraLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoEstructura() {
		return isEsNuevoEmpleadoEstructura;
	}

	public void setIsEsNuevoEmpleadoEstructura(Boolean isEsNuevoEmpleadoEstructura) {
		this.isEsNuevoEmpleadoEstructura = isEsNuevoEmpleadoEstructura;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoEstructura() {
		return esParaAccionDesdeFormularioEmpleadoEstructura;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoEstructura(Boolean esParaAccionDesdeFormularioEmpleadoEstructura) {
		this.esParaAccionDesdeFormularioEmpleadoEstructura = esParaAccionDesdeFormularioEmpleadoEstructura;
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

			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoestructuraSessionBean.getlidEmpresaActual());
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

			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(empleadoestructuraSessionBean.getlidSucursalActual());
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

			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoestructuraSessionBean.getlidEmpleadoActual());
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

			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(empleadoestructuraSessionBean.getlidEstructuraActual());
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

	public void cargarCombosCargosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cargosForeignKey=new ArrayList<Cargo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CargoLogic cargoLogic=new CargoLogic();

			//cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

					cargoLogic.getTodosCargosWithConnection(sFinalQuery,new Pagination());

					this.cargosForeignKey=cargoLogic.getCargos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCargo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getEntityWithConnection(empleadoestructuraSessionBean.getlidCargoActual());
					this.cargosForeignKey.add(cargoLogic.getCargo());
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

					if(this.empleadoestructura!=null) {
						this.empleadoestructura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoEstructura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoEstructuraGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoEstructuraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoEstructuraGenerico!=null && jComboBoxid_empresaEmpleadoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoEstructuraGenerico.setSelectedIndex(0);
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

					if(this.empleadoestructura!=null) {
						this.empleadoestructura.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEmpleadoEstructura.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEmpleadoEstructuraGenerico)throws Exception
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
				jComboBoxid_sucursalEmpleadoEstructuraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEmpleadoEstructuraGenerico!=null && jComboBoxid_sucursalEmpleadoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEmpleadoEstructuraGenerico.setSelectedIndex(0);
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

					if(this.empleadoestructura!=null) {
						this.empleadoestructura.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoEstructura.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoEstructuraGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoEstructuraGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoEstructuraGenerico!=null && jComboBoxid_empleadoEmpleadoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoEstructuraGenerico.setSelectedIndex(0);
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

					if(this.empleadoestructura!=null) {
						this.empleadoestructura.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEmpleadoEstructura.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura!=null) {
						jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEmpleadoEstructuraGenerico)throws Exception
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
				jComboBoxid_estructuraEmpleadoEstructuraGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEmpleadoEstructuraGenerico!=null && jComboBoxid_estructuraEmpleadoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEmpleadoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCargoForeignKey(Long idCargoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cargoTemp!=null) {

					if(this.empleadoestructura!=null) {
						this.empleadoestructura.setCargo(cargoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setSelectedItem(cargoTemp);
					}
				} else {
					//jComboBoxid_cargoEmpleadoEstructura.setSelectedItem(cargoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargoTemp!=null && jComboBoxid_cargoFK_IdCargoEmpleadoEstructura!=null) {
						jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setSelectedItem(cargoTemp);
					} else {
						if(jComboBoxid_cargoFK_IdCargoEmpleadoEstructura!=null) {
							//jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setSelectedItem(cargoTemp);
							if(jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.getItemCount()>0) {
								jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setSelectedIndex(0);
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

	public String getActualCargoForeignKeyDescripcion(Long idCargoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}


			sDescripcion=CargoConstantesFunciones.getCargoDescripcion(cargoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCargoForeignKeyGenerico(Long idCargoSeleccionado,JComboBox jComboBoxid_cargoEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(cargoTemp!=null) {
				jComboBoxid_cargoEmpleadoEstructuraGenerico.setSelectedItem(cargoTemp);
			} else {
				if(jComboBoxid_cargoEmpleadoEstructuraGenerico!=null && jComboBoxid_cargoEmpleadoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_cargoEmpleadoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoEstructura empleadoestructura,JComboBox jComboBoxid_empresaEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoEstructuraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoEstructuraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoestructura.setid_empresa(empresaAux.getId());
				empleadoestructura.setempresa_descripcion(EmpleadoEstructuraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoestructura.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EmpleadoEstructura empleadoestructura,JComboBox jComboBoxid_sucursalEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEmpleadoEstructuraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEmpleadoEstructuraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				empleadoestructura.setid_sucursal(sucursalAux.getId());
				empleadoestructura.setsucursal_descripcion(EmpleadoEstructuraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				empleadoestructura.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoEstructura empleadoestructura,JComboBox jComboBoxid_empleadoEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoEstructuraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoEstructuraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoestructura.setid_empleado(empleadoAux.getId());
				empleadoestructura.setempleado_descripcion(EmpleadoEstructuraConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoestructura.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EmpleadoEstructura empleadoestructura,JComboBox jComboBoxid_estructuraEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEmpleadoEstructuraGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEmpleadoEstructuraGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				empleadoestructura.setid_estructura(estructuraAux.getId());
				empleadoestructura.setestructura_descripcion(EmpleadoEstructuraConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				empleadoestructura.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoForeignKey(EmpleadoEstructura empleadoestructura,JComboBox jComboBoxid_cargoEmpleadoEstructuraGenerico)throws Exception
	{
		try
		{
			Cargo  cargoAux=new Cargo();

			if(jComboBoxid_cargoEmpleadoEstructuraGenerico==null) {
				cargoAux=(Cargo)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.getSelectedItem();
			} else {
				cargoAux=(Cargo)jComboBoxid_cargoEmpleadoEstructuraGenerico.getSelectedItem();
			}

			if(cargoAux!=null && cargoAux.getId()!=null) {
				empleadoestructura.setid_cargo(cargoAux.getId());
				empleadoestructura.setcargo_descripcion(EmpleadoEstructuraConstantesFunciones.getCargoDescripcion(cargoAux));
				empleadoestructura.setCargo(cargoAux);			}
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

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
					}

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
					}

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
					}

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.addItem(empleado);
							}
						}

						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
					}

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.addItem(estructura);
							}
						}

						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCargosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCargo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.addItem(cargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { 
					}

					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.addItem(cargo);
							}
						}

						if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCargoForeignKey(Cargo cargo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setSelectedItem(cargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setSelectedItem(cargo);
						} else {
							this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoEstructura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEstructura(this.empleadoestructuraLogic.getEmpleadoEstructuras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEstructura(this.empleadoestructuras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Cargo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoestructuraLogic.setEmpleadoEstructuras(this.empleadoestructuras);
			empleadoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoEstructuraParameterReturnGeneral getEmpleadoEstructuraParameterGeneral() {
		return this.empleadoestructuraParameterGeneral;
	}
	
	public void setEmpleadoEstructuraParameterGeneral(EmpleadoEstructuraParameterReturnGeneral empleadoestructuraParameterGeneral) {
		this.empleadoestructuraParameterGeneral = empleadoestructuraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoEstructura() {
		return isPermisoTodoEmpleadoEstructura;
	}

	public void setIsPermisoTodoEmpleadoEstructura(Boolean isPermisoTodoEmpleadoEstructura) {
		this.isPermisoTodoEmpleadoEstructura = isPermisoTodoEmpleadoEstructura;
	}

	public Boolean getIsPermisoNuevoEmpleadoEstructura() {
		return isPermisoNuevoEmpleadoEstructura;
	}

	public void setIsPermisoNuevoEmpleadoEstructura(Boolean isPermisoNuevoEmpleadoEstructura) {
		this.isPermisoNuevoEmpleadoEstructura = isPermisoNuevoEmpleadoEstructura;
	}

	public Boolean getIsPermisoActualizarEmpleadoEstructura() {
		return isPermisoActualizarEmpleadoEstructura;
	}

	public void setIsPermisoActualizarEmpleadoEstructura(Boolean isPermisoActualizarEmpleadoEstructura) {
		this.isPermisoActualizarEmpleadoEstructura = isPermisoActualizarEmpleadoEstructura;
	}

	public Boolean getIsPermisoEliminarEmpleadoEstructura() {
		return isPermisoEliminarEmpleadoEstructura;
	}

	public void setIsPermisoEliminarEmpleadoEstructura(Boolean isPermisoEliminarEmpleadoEstructura) {
		this.isPermisoEliminarEmpleadoEstructura = isPermisoEliminarEmpleadoEstructura;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoEstructura() {
		return isPermisoGuardarCambiosEmpleadoEstructura;
	}

	public void setIsPermisoGuardarCambiosEmpleadoEstructura(Boolean isPermisoGuardarCambiosEmpleadoEstructura) {
		this.isPermisoGuardarCambiosEmpleadoEstructura = isPermisoGuardarCambiosEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoEstructura() {
		return isPermisoConsultaEmpleadoEstructura;
	}

	public void setIsPermisoConsultaEmpleadoEstructura(Boolean isPermisoConsultaEmpleadoEstructura) {
		this.isPermisoConsultaEmpleadoEstructura = isPermisoConsultaEmpleadoEstructura;
	}

	public Boolean getIsPermisoBusquedaEmpleadoEstructura() {
		return isPermisoBusquedaEmpleadoEstructura;
	}

	public void setIsPermisoBusquedaEmpleadoEstructura(Boolean isPermisoBusquedaEmpleadoEstructura) {
		this.isPermisoBusquedaEmpleadoEstructura = isPermisoBusquedaEmpleadoEstructura;
	}

	public Boolean getIsPermisoReporteEmpleadoEstructura() {
		return isPermisoReporteEmpleadoEstructura;
	}

	public void setIsPermisoReporteEmpleadoEstructura(Boolean isPermisoReporteEmpleadoEstructura) {
		this.isPermisoReporteEmpleadoEstructura = isPermisoReporteEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoEstructura() {
		return isPermisoPaginacionMedioEmpleadoEstructura;
	}

	public void setIsPermisoPaginacionMedioEmpleadoEstructura(Boolean isPermisoPaginacionMedioEmpleadoEstructura) {
		this.isPermisoPaginacionMedioEmpleadoEstructura = isPermisoPaginacionMedioEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoEstructura() {
		return isPermisoPaginacionTodoEmpleadoEstructura;
	}

	public void setIsPermisoPaginacionTodoEmpleadoEstructura(Boolean isPermisoPaginacionTodoEmpleadoEstructura) {
		this.isPermisoPaginacionTodoEmpleadoEstructura = isPermisoPaginacionTodoEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoEstructura() {
		return isPermisoPaginacionAltoEmpleadoEstructura;
	}

	public void setIsPermisoPaginacionAltoEmpleadoEstructura(Boolean isPermisoPaginacionAltoEmpleadoEstructura) {
		this.isPermisoPaginacionAltoEmpleadoEstructura = isPermisoPaginacionAltoEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoEstructura() {
		return isPermisoCopiarEmpleadoEstructura;
	}

	public void setIsPermisoCopiarEmpleadoEstructura(Boolean isPermisoCopiarEmpleadoEstructura) {
		this.isPermisoCopiarEmpleadoEstructura = isPermisoCopiarEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoEstructura() {
		return isPermisoVerFormEmpleadoEstructura;
	}

	public void setIsPermisoVerFormEmpleadoEstructura(Boolean isPermisoVerFormEmpleadoEstructura) {
		this.isPermisoVerFormEmpleadoEstructura = isPermisoVerFormEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoEstructura() {
		return isPermisoDuplicarEmpleadoEstructura;
	}

	public void setIsPermisoDuplicarEmpleadoEstructura(Boolean isPermisoDuplicarEmpleadoEstructura) {
		this.isPermisoDuplicarEmpleadoEstructura = isPermisoDuplicarEmpleadoEstructura;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoEstructura() {
		return isPermisoOrdenEmpleadoEstructura;
	}

	public void setIsPermisoOrdenEmpleadoEstructura(Boolean isPermisoOrdenEmpleadoEstructura) {
		this.isPermisoOrdenEmpleadoEstructura = isPermisoOrdenEmpleadoEstructura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoEstructura() {
		return isVisibilidadCeldaNuevoEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoEstructura(Boolean isVisibilidadCeldaNuevoEmpleadoEstructura) {
		this.isVisibilidadCeldaNuevoEmpleadoEstructura = isVisibilidadCeldaNuevoEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoEstructura() {
		return isVisibilidadCeldaDuplicarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoEstructura(Boolean isVisibilidadCeldaDuplicarEmpleadoEstructura) {
		this.isVisibilidadCeldaDuplicarEmpleadoEstructura = isVisibilidadCeldaDuplicarEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoEstructura() {
		return isVisibilidadCeldaCopiarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoEstructura(Boolean isVisibilidadCeldaCopiarEmpleadoEstructura) {
		this.isVisibilidadCeldaCopiarEmpleadoEstructura = isVisibilidadCeldaCopiarEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoEstructura() {
		return isVisibilidadCeldaVerFormEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoEstructura(Boolean isVisibilidadCeldaVerFormEmpleadoEstructura) {
		this.isVisibilidadCeldaVerFormEmpleadoEstructura = isVisibilidadCeldaVerFormEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoEstructura() {
		return isVisibilidadCeldaOrdenEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoEstructura(Boolean isVisibilidadCeldaOrdenEmpleadoEstructura) {
		this.isVisibilidadCeldaOrdenEmpleadoEstructura = isVisibilidadCeldaOrdenEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoEstructura() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoEstructura(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura = isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoEstructura() {
		return isVisibilidadCeldaModificarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoEstructura(Boolean isVisibilidadCeldaModificarEmpleadoEstructura) {
		this.isVisibilidadCeldaModificarEmpleadoEstructura = isVisibilidadCeldaModificarEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoEstructura() {
		return isVisibilidadCeldaActualizarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoEstructura(Boolean isVisibilidadCeldaActualizarEmpleadoEstructura) {
		this.isVisibilidadCeldaActualizarEmpleadoEstructura = isVisibilidadCeldaActualizarEmpleadoEstructura;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoEstructura() {
		return isVisibilidadCeldaEliminarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoEstructura(Boolean isVisibilidadCeldaEliminarEmpleadoEstructura) {
		this.isVisibilidadCeldaEliminarEmpleadoEstructura = isVisibilidadCeldaEliminarEmpleadoEstructura;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoEstructura() {
		return isVisibilidadCeldaCancelarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoEstructura(Boolean isVisibilidadCeldaCancelarEmpleadoEstructura) {
		this.isVisibilidadCeldaCancelarEmpleadoEstructura = isVisibilidadCeldaCancelarEmpleadoEstructura;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoEstructura() {
		return isVisibilidadCeldaGuardarEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoEstructura(Boolean isVisibilidadCeldaGuardarEmpleadoEstructura) {
		this.isVisibilidadCeldaGuardarEmpleadoEstructura = isVisibilidadCeldaGuardarEmpleadoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoEstructura() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoEstructura(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEstructura) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura = isVisibilidadCeldaGuardarCambiosEmpleadoEstructura;
	}
		
	public EmpleadoEstructuraSessionBean getempleadoestructuraSessionBean() {
		return this.empleadoestructuraSessionBean;
	}
	
	public void setempleadoestructuraSessionBean(EmpleadoEstructuraSessionBean empleadoestructuraSessionBean) {
		this.empleadoestructuraSessionBean=empleadoestructuraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCargo() {
		return this.isVisibilidadFK_IdCargo;
	}

	public void setisVisibilidadFK_IdCargo(Boolean isVisibilidadFK_IdCargo) {
		this.isVisibilidadFK_IdCargo=isVisibilidadFK_IdCargo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(EmpleadoEstructura empleadoestructura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoestructura,null);
				this.setActualParaGuardarSucursalForeignKey(empleadoestructura,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoestructura,null);
				this.setActualParaGuardarEstructuraForeignKey(empleadoestructura,null);
				this.setActualParaGuardarCargoForeignKey(empleadoestructura,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoEstructura empleadoestructura,EmpleadoEstructura empleadoestructuraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoEstructura(empleadoestructura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoestructuraAux.setId(empleadoestructura.getId());
		empleadoestructuraAux.setVersionRow(empleadoestructura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoEstructura();
		
			int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoestructuraValidator.getInvalidValues(this.empleadoestructura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoestructuraLogic.setDatosCliente(datosCliente);
			empleadoestructuraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoestructuraAux=new  EmpleadoEstructura();
				
				empleadoestructuraAux.setIsNew(true);
				empleadoestructuraAux.setIsChanged(true);
				
				empleadoestructuraAux.setEmpleadoEstructuraOriginal(this.empleadoestructura);
				
				empleadoestructuraAux.setId(this.empleadoestructura.getId());	
				empleadoestructuraAux.setVersionRow(this.empleadoestructura.getVersionRow());	
				empleadoestructuraAux.setid_empresa(this.empleadoestructura.getid_empresa());	
				empleadoestructuraAux.setid_sucursal(this.empleadoestructura.getid_sucursal());	
				empleadoestructuraAux.setid_empleado(this.empleadoestructura.getid_empleado());	
				empleadoestructuraAux.setid_estructura(this.empleadoestructura.getid_estructura());	
				empleadoestructuraAux.setid_cargo(this.empleadoestructura.getid_cargo());	
				empleadoestructuraAux.setfecha_ingreso(this.empleadoestructura.getfecha_ingreso());	
				empleadoestructuraAux.setfecha_salida(this.empleadoestructura.getfecha_salida());	
				empleadoestructuraAux.setnumero_reingreso(this.empleadoestructura.getnumero_reingreso());	
				empleadoestructuraAux.setdescripcion(this.empleadoestructura.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoestructuraAux,empleadoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.saveEmpleadoEstructuras();//WithConnection
						//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoestructuraLogic.saveEmpleadoEstructuraRelaciones(empleadoestructuraAux);//WithConnection
								//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoestructuraAux,empleadoestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoestructuraAux=new  EmpleadoEstructura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoestructuraSessionBean.getEsGuardarRelacionado() && this.empleadoestructura.getId()>=0)) {
						
					empleadoestructuraAux.setIsNew(false);
				}
				
				empleadoestructuraAux.setIsDeleted(false);
			
				empleadoestructuraAux.setId(this.empleadoestructura.getId());	
				empleadoestructuraAux.setVersionRow(this.empleadoestructura.getVersionRow());	
				empleadoestructuraAux.setid_empresa(this.empleadoestructura.getid_empresa());	
				empleadoestructuraAux.setid_sucursal(this.empleadoestructura.getid_sucursal());	
				empleadoestructuraAux.setid_empleado(this.empleadoestructura.getid_empleado());	
				empleadoestructuraAux.setid_estructura(this.empleadoestructura.getid_estructura());	
				empleadoestructuraAux.setid_cargo(this.empleadoestructura.getid_cargo());	
				empleadoestructuraAux.setfecha_ingreso(this.empleadoestructura.getfecha_ingreso());	
				empleadoestructuraAux.setfecha_salida(this.empleadoestructura.getfecha_salida());	
				empleadoestructuraAux.setnumero_reingreso(this.empleadoestructura.getnumero_reingreso());	
				empleadoestructuraAux.setdescripcion(this.empleadoestructura.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoestructuraAux,empleadoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.saveEmpleadoEstructuras();//WithConnection
						//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoestructuraLogic.saveEmpleadoEstructuraRelaciones(empleadoestructuraAux);//WithConnection
								//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoestructuraAux,empleadoestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoestructura,empleadoestructuraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoestructuraAux=new  EmpleadoEstructura();
				
				empleadoestructuraAux.setIsNew(false);
				empleadoestructuraAux.setIsChanged(false);
				
				empleadoestructuraAux.setIsDeleted(true);
				
				empleadoestructuraAux.setId(this.empleadoestructura.getId());	
				empleadoestructuraAux.setVersionRow(this.empleadoestructura.getVersionRow());	
				empleadoestructuraAux.setid_empresa(this.empleadoestructura.getid_empresa());	
				empleadoestructuraAux.setid_sucursal(this.empleadoestructura.getid_sucursal());	
				empleadoestructuraAux.setid_empleado(this.empleadoestructura.getid_empleado());	
				empleadoestructuraAux.setid_estructura(this.empleadoestructura.getid_estructura());	
				empleadoestructuraAux.setid_cargo(this.empleadoestructura.getid_cargo());	
				empleadoestructuraAux.setfecha_ingreso(this.empleadoestructura.getfecha_ingreso());	
				empleadoestructuraAux.setfecha_salida(this.empleadoestructura.getfecha_salida());	
				empleadoestructuraAux.setnumero_reingreso(this.empleadoestructura.getnumero_reingreso());	
				empleadoestructuraAux.setdescripcion(this.empleadoestructura.getdescripcion());	
				
				if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoestructuraAux.getId()>=0) {	
						this.empleadoestructurasEliminados.add(empleadoestructuraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoestructuraAux,empleadoestructuras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.saveEmpleadoEstructuras();//WithConnection
						//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoestructuraLogic.saveEmpleadoEstructuraRelaciones(empleadoestructuraAux);//WithConnection
								//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
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
							if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoestructuraAux,empleadoestructuraLogic.getEmpleadoEstructuras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoestructuraAux,empleadoestructuras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getEmpleadoEstructuras().addAll(this.empleadoestructurasEliminados);
					
					empleadoestructuraLogic.saveEmpleadoEstructuras();//WithConnection
					//empleadoestructuraLogic.getSetVersionRowEmpleadoEstructuras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoEstructura();
				
				this.empleadoestructurasEliminados= new ArrayList<EmpleadoEstructura>();		
			}
			
			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Estructura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoestructura=empleadoestructuraAux;
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
      		//this.finishProcessEmpleadoEstructura();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoEstructura empleadoestructuraLocal) throws Exception {
		
		if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoEstructura empleadoestructuraLocal) throws Exception {	
		if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoestructuraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				empleadoestructuraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoestructuraLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				empleadoestructuraLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CargoDetalleFormJInternalFrame.class)) {
				CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrameLocal=(CargoBeanSwingJInternalFrame) ((CargoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargo(cargoBeanSwingJInternalFrameLocal.getcargo(),true);
				cargoBeanSwingJInternalFrameLocal.actualizarLista(cargoBeanSwingJInternalFrameLocal.cargo,this.cargosForeignKey);

				cargoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargoBeanSwingJInternalFrameLocal.cargo);

				empleadoestructuraLocal.setCargo(cargoBeanSwingJInternalFrameLocal.cargo);

				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey("Formulario");
				this.setActualCargoForeignKey(cargoBeanSwingJInternalFrameLocal.cargo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoEstructuraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoestructuraValidator.getInvalidValues(this.empleadoestructura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoEstructura empleadoestructura,List<EmpleadoEstructura> empleadoestructuras) throws Exception {
		try	{		
			EmpleadoEstructuraConstantesFunciones.actualizarLista(empleadoestructura,empleadoestructuras,this.empleadoestructuraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoEstructura empleadoestructura,List<EmpleadoEstructura> empleadoestructuras) throws Exception {
		try	{			
			EmpleadoEstructuraConstantesFunciones.actualizarSelectedLista(empleadoestructura,empleadoestructuras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoEstructura> empleadoestructurasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoestructurasLocal=this.empleadoestructuraLogic.getEmpleadoEstructuras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoestructurasLocal=this.empleadoestructuras;
			}
			//ARCHITECTURE
		
			for(EmpleadoEstructura empleadoestructuraLocal:empleadoestructurasLocal) {
				if(this.permiteMantenimiento(empleadoestructuraLocal) && empleadoestructuraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoEstructuraConstantesFunciones.getEmpleadoEstructuraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_empresaEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_sucursalEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_empleadoEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_estructuraEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.IDCARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_cargoEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.FECHAINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_ingresoEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.FECHASALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_salidaEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.NUMEROREINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelnumero_reingresoEmpleadoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEstructuraConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabeldescripcionEmpleadoEstructura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_empresaEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_sucursalEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_empleadoEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_estructuraEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelid_cargoEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_ingresoEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_salidaEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelnumero_reingresoEmpleadoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabeldescripcionEmpleadoEstructura,"");
		
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
		this.iIdNuevoEmpleadoEstructura--;	
		
		
		this.empleadoestructuraAux=new EmpleadoEstructura();
		
		this.empleadoestructuraAux.setId(this.iIdNuevoEmpleadoEstructura);
		this.empleadoestructuraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoestructuraLogic.getEmpleadoEstructuras().add(this.empleadoestructuraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoestructuras.add(this.empleadoestructuraAux);
		}
		//ARCHITECTURE
		
		this.empleadoestructura=this.empleadoestructuraAux;
		
		if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructura);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEstructura(this.empleadoestructura);
		}
				
		//this.setDefaultControlesEmpleadoEstructura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoEstructura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEstructura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEstructura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEstructura(this.empleadoestructuraBean,this.empleadoestructura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoEstructuraConstantesFunciones.getClassesRelationshipsOfEmpleadoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoestructuraReturnGeneral=empleadoestructuraLogic.procesarEventosEmpleadoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoestructuraLogic.getEmpleadoEstructuras(),this.empleadoestructura,this.empleadoestructuraParameterGeneral,this.isEsNuevoEmpleadoEstructura,classes);//this.empleadoestructuraLogic.getEmpleadoEstructura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEstructura(this.empleadoestructuraReturnGeneral,this.empleadoestructuraBean,false);
		
		if(this.empleadoestructuraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura());
		}
		
		if(this.empleadoestructuraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura(),classes);//this.empleadoestructuraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoEstructura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoEstructura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoEstructura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoEstructura(false);
						
			if(empleadoestructuraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEstructura();
			}
			
			this.actualizarVisualTableDatosEmpleadoEstructura();
			
			this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEstructura(), this.getIndiceNuevoEmpleadoEstructura());
			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoEstructura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoEstructura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarfecha_ingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarfecha_salidaEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarnumero_reingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activardescripcionEmpleadoEstructura);	
		//
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarid_empresaEmpleadoEstructura);//
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarid_sucursalEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarid_empleadoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarid_estructuraEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setEnabled(isHabilitar && this.empleadoestructuraConstantesFunciones.activarid_cargoEmpleadoEstructura);
	};
	
	public void setDefaultControlesEmpleadoEstructura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoEstructura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoestructuraSessionBean.setConGuardarRelaciones(true);			
			this.empleadoestructuraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.setVisible(true);
			
					
		} else {
			//this.empleadoestructuraSessionBean.setConGuardarRelaciones(false);			
			this.empleadoestructuraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoEstructura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
				if(empleadoestructuraAux.getId().equals(this.iIdNuevoEmpleadoEstructura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuras) {
				if(empleadoestructuraAux.getId().equals(this.iIdNuevoEmpleadoEstructura)) {
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
	
	public int getIndiceActualEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
				if(empleadoestructuraAux.getId().equals(empleadoestructura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuras) {
				if(empleadoestructuraAux.getId().equals(empleadoestructura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoEstructura(EmpleadoEstructura empleadoestructuraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
				if(empleadoestructuraAux.getEmpleadoEstructuraOriginal().getId().equals(empleadoestructuraOriginal.getId())) {
					existe=true;
					empleadoestructuraOriginal.setId(empleadoestructuraAux.getId());
					empleadoestructuraOriginal.setVersionRow(empleadoestructuraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuras) {
				if(empleadoestructuraAux.getEmpleadoEstructuraOriginal().getId().equals(empleadoestructuraOriginal.getId())) {
					existe=true;
					empleadoestructuraOriginal.setId(empleadoestructuraAux.getId());
					empleadoestructuraOriginal.setVersionRow(empleadoestructuraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoEstructura(Boolean esParaCancelar) throws Exception {
		empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
		empleadoestructuraAux=new EmpleadoEstructura();
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
					if(empleadoestructuraAux.getId()<0) {
						empleadoestructurasAux.add(empleadoestructuraAux);
					}		
				}
				this.iIdNuevoEmpleadoEstructura=0L;
				this.empleadoestructuraLogic.getEmpleadoEstructuras().removeAll(empleadoestructurasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuras) {
					if(empleadoestructuraAux.getId()<0) {
						empleadoestructurasAux.add(empleadoestructuraAux);
					}		
				}
				this.iIdNuevoEmpleadoEstructura=0L;
				this.empleadoestructuras.removeAll(empleadoestructurasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEstructura 
					&& this.empleadoestructuraLogic.getEmpleadoEstructuras().size()>0
					) {
					empleadoestructuraAux=this.empleadoestructuraLogic.getEmpleadoEstructuras().get(this.empleadoestructuraLogic.getEmpleadoEstructuras().size() - 1);
				
					if(empleadoestructuraAux.getId()<0) {
						this.empleadoestructuraLogic.getEmpleadoEstructuras().remove(empleadoestructuraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEstructura && this.empleadoestructuras.size()>0) {
					empleadoestructuraAux=this.empleadoestructuras.get(this.empleadoestructuras.size() - 1);
				
					if(empleadoestructuraAux.getId()<0) {
						this.empleadoestructuras.remove(empleadoestructuraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoEstructura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoestructura.getId()<0) {
				this.empleadoestructuraLogic.getEmpleadoEstructuras().remove(this.empleadoestructura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoestructura.getId()<0) {
				this.empleadoestructuras.remove(this.empleadoestructura);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoEstructura(List<EmpleadoEstructura> empleadoestructurasAux) throws Exception {
		EmpleadoEstructuraConstantesFunciones.setEstadosInicialesEmpleadoEstructura(empleadoestructurasAux);
	}
	
	public void setEstadosInicialesEmpleadoEstructura(EmpleadoEstructura empleadoestructuraAux) throws Exception {
		EmpleadoEstructuraConstantesFunciones.setEstadosInicialesEmpleadoEstructura(empleadoestructuraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoEstructuraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoEstructuraActual()) {
				if(!this.isEsNuevoEmpleadoEstructura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoEstructura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoEstructuraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Estructura ?", "MANTENIMIENTO DE Empleado Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoEstructura empleadoestructura) throws Exception {
		EmpleadoEstructuraConstantesFunciones.seleccionarAsignar(this.empleadoestructura,empleadoestructura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoEstructura=this.isPermisoActualizarOriginalEmpleadoEstructura;
			
			
			this.seleccionarAsignar(empleadoestructura);
			
			

			idEmpleadoActual=empleadoestructura.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEstructuraConstantesFunciones.quitarEspaciosEmpleadoEstructura(this.empleadoestructura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoestructuraSessionBean.setsFuncionBusquedaRapida(this.empleadoestructuraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoEmpleadoEstructura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoEstructura(esParaCancelar);				
				this.cancelarNuevoEmpleadoEstructura(esParaCancelar);								
			}
			
			this.empleadoestructura=new EmpleadoEstructura();
			
			this.inicializarEmpleadoEstructura();
			
			this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoEstructura() throws Exception {
		try {
			EmpleadoEstructuraConstantesFunciones.inicializarEmpleadoEstructura(this.empleadoestructura);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoestructuraLogic.getEmpleadoEstructuras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoEstructuras(String sAccionBusqueda,List<EmpleadoEstructura> empleadoestructurasParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoEstructura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoEstructuraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoEstructuraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoEstructura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Estructuras");		
		parameters.put("busquedapor", EmpleadoEstructuraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoEstructura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoEstructura=new JRBeanArrayDataSource(EmpleadoEstructuraJInternalFrame.TraerEmpleadoEstructuraBeans(empleadoestructurasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoEstructura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoEstructuraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoEstructuraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoEstructuraBean.TraerEmpleadoEstructuraBeans(empleadoestructurasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructuraActionPerformed(null);
					//this.generarExcelReporteEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoEstructuras(sAccionBusqueda,sTipoArchivoReporte,empleadoestructurasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEstructura> empleadoestructurasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEstructuras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEstructura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoEstructura empleadoestructura : empleadoestructurasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoEstructuraConstantesFunciones.generarExcelReporteDataEmpleadoEstructura("NORMAL",row,workbook,empleadoestructura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoEstructura(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoEstructuraConstantesFunciones.generarExcelReporteHeaderEmpleadoEstructura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEstructura> empleadoestructurasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoEstructura empleadoestructura : empleadoestructurasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoEstructuraConstantesFunciones.getEmpleadoEstructuraDescripcion(empleadoestructura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getcargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getfecha_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getfecha_salida());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getnumero_reingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoestructura.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEstructura> empleadoestructurasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoEstructura> empleadoestructurasRespaldo=null;
		
		classes=EmpleadoEstructuraConstantesFunciones.getClassesRelationshipsOfEmpleadoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoestructuraLogic.setDatosCliente(this.datosCliente);
		this.empleadoestructuraLogic.setDatosDeep(this.datosDeep);
		this.empleadoestructuraLogic.setIsConDeep(true);
		
		empleadoestructurasRespaldo=this.empleadoestructuraLogic.getEmpleadoEstructuras();
		
		this.empleadoestructuraLogic.setEmpleadoEstructuras(empleadoestructurasParaReportes);	
		this.empleadoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoestructurasParaReportes=this.empleadoestructuraLogic.getEmpleadoEstructuras();
		this.empleadoestructuraLogic.setEmpleadoEstructuras(empleadoestructurasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEstructura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoEstructura empleadoestructura : empleadoestructurasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoEstructura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoEstructuraConstantesFunciones.generarExcelReporteDataEmpleadoEstructura("NORMAL",row,workbook,empleadoestructura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoEstructuraConstantesFunciones.getEmpleadoEstructuraDescripcion(empleadoestructura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoEstructura() throws Exception {		
		this.startProcessEmpleadoEstructura(true);
	}
	
	public void startProcessEmpleadoEstructura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoEstructura ,this.jPanelParametrosReportesEmpleadoEstructura, this.jScrollPanelDatosEmpleadoEstructura,this.jPanelPaginacionEmpleadoEstructura, this.jScrollPanelDatosEdicionEmpleadoEstructura, this.jPanelAccionesEmpleadoEstructura,this.jPanelAccionesFormularioEmpleadoEstructura,this.jmenuBarEmpleadoEstructura,this.jmenuBarDetalleEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEstructura=this.jTabbedPaneBusquedasEmpleadoEstructura; 
		
		final JPanel jPanelParametrosReportesEmpleadoEstructura=this.jPanelParametrosReportesEmpleadoEstructura;
		//final JScrollPane jScrollPanelDatosEmpleadoEstructura=this.jScrollPanelDatosEmpleadoEstructura;
		final JTable jTableDatosEmpleadoEstructura=this.jTableDatosEmpleadoEstructura;		
		final JPanel jPanelPaginacionEmpleadoEstructura=this.jPanelPaginacionEmpleadoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEstructura=this.jScrollPanelDatosEdicionEmpleadoEstructura;
		final JPanel jPanelAccionesEmpleadoEstructura=this.jPanelAccionesEmpleadoEstructura;
		
		JPanel jPanelCamposAuxiliarEmpleadoEstructura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEstructura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			jPanelCamposAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelCamposEmpleadoEstructura;
			jPanelAccionesFormularioAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelAccionesFormularioEmpleadoEstructura;
		}
		
		final JPanel jPanelCamposEmpleadoEstructura=jPanelCamposAuxiliarEmpleadoEstructura;
		final JPanel jPanelAccionesFormularioEmpleadoEstructura=jPanelAccionesFormularioAuxiliarEmpleadoEstructura;
		
		
		final JMenuBar jmenuBarEmpleadoEstructura=this.jmenuBarEmpleadoEstructura;
		final JToolBar jTtoolBarEmpleadoEstructura=this.jTtoolBarEmpleadoEstructura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEstructura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jmenuBarDetalleEmpleadoEstructura;
			jTtoolBarDetalleAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jTtoolBarDetalleEmpleadoEstructura;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEstructura=jmenuBarDetalleAuxiliarEmpleadoEstructura;
		final JToolBar jTtoolBarDetalleEmpleadoEstructura=jTtoolBarDetalleAuxiliarEmpleadoEstructura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEstructura;
			processRunnable.jTableDatos=jTableDatosEmpleadoEstructura;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEstructura;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEstructura ,jPanelParametrosReportesEmpleadoEstructura,jTableDatosEmpleadoEstructura, /*jScrollPanelDatosEmpleadoEstructura,*/jPanelCamposEmpleadoEstructura,jPanelPaginacionEmpleadoEstructura, /*jScrollPanelDatosEdicionEmpleadoEstructura,*/ jPanelAccionesEmpleadoEstructura,jPanelAccionesFormularioEmpleadoEstructura,jmenuBarEmpleadoEstructura,jmenuBarDetalleEmpleadoEstructura,jTtoolBarEmpleadoEstructura,jTtoolBarDetalleEmpleadoEstructura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEstructura ,jPanelParametrosReportesEmpleadoEstructura, jScrollPanelDatosEmpleadoEstructura,jPanelPaginacionEmpleadoEstructura, jScrollPanelDatosEdicionEmpleadoEstructura, jPanelAccionesEmpleadoEstructura,jPanelAccionesFormularioEmpleadoEstructura,jmenuBarEmpleadoEstructura,jmenuBarDetalleEmpleadoEstructura,jTtoolBarEmpleadoEstructura,jTtoolBarDetalleEmpleadoEstructura);
						
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
	
	public void finishProcessEmpleadoEstructura() {// throws Exception 
		this.finishProcessEmpleadoEstructura(true);
	}
	
	public void finishProcessEmpleadoEstructura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoEstructura ,this.jPanelParametrosReportesEmpleadoEstructura, this.jScrollPanelDatosEmpleadoEstructura,this.jPanelPaginacionEmpleadoEstructura, this.jScrollPanelDatosEdicionEmpleadoEstructura, this.jPanelAccionesEmpleadoEstructura,this.jPanelAccionesFormularioEmpleadoEstructura,this.jmenuBarEmpleadoEstructura,this.jmenuBarDetalleEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,this.jTtoolBarDetalleEmpleadoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEstructura=this.jTabbedPaneBusquedasEmpleadoEstructura; 
		
		final JPanel jPanelParametrosReportesEmpleadoEstructura=this.jPanelParametrosReportesEmpleadoEstructura;
		//final JScrollPane jScrollPanelDatosEmpleadoEstructura=this.jScrollPanelDatosEmpleadoEstructura;
		final JTable jTableDatosEmpleadoEstructura=this.jTableDatosEmpleadoEstructura;		
		final JPanel jPanelPaginacionEmpleadoEstructura=this.jPanelPaginacionEmpleadoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEstructura=this.jScrollPanelDatosEdicionEmpleadoEstructura;
		final JPanel jPanelAccionesEmpleadoEstructura=this.jPanelAccionesEmpleadoEstructura;
		
		JPanel jPanelCamposAuxiliarEmpleadoEstructura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEstructura=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			jPanelCamposAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelCamposEmpleadoEstructura;
			jPanelAccionesFormularioAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelAccionesFormularioEmpleadoEstructura;
		}
		
		final JPanel jPanelCamposEmpleadoEstructura=jPanelCamposAuxiliarEmpleadoEstructura;
		final JPanel jPanelAccionesFormularioEmpleadoEstructura=jPanelAccionesFormularioAuxiliarEmpleadoEstructura;
		
		
		final JMenuBar jmenuBarEmpleadoEstructura=this.jmenuBarEmpleadoEstructura;		
		final JToolBar jTtoolBarEmpleadoEstructura=this.jTtoolBarEmpleadoEstructura;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEstructura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jmenuBarDetalleEmpleadoEstructura;
			jTtoolBarDetalleAuxiliarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jTtoolBarDetalleEmpleadoEstructura;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEstructura=jmenuBarDetalleAuxiliarEmpleadoEstructura;
		final JToolBar jTtoolBarDetalleEmpleadoEstructura=jTtoolBarDetalleAuxiliarEmpleadoEstructura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEstructura;
			processRunnable.jTableDatos=jTableDatosEmpleadoEstructura;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEstructura;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoEstructura ,jPanelParametrosReportesEmpleadoEstructura, jTableDatosEmpleadoEstructura,/*jScrollPanelDatosEmpleadoEstructura,*/jPanelCamposEmpleadoEstructura,jPanelPaginacionEmpleadoEstructura, /*jScrollPanelDatosEdicionEmpleadoEstructura,*/ jPanelAccionesEmpleadoEstructura,jPanelAccionesFormularioEmpleadoEstructura,jmenuBarEmpleadoEstructura,jmenuBarDetalleEmpleadoEstructura,jTtoolBarEmpleadoEstructura,jTtoolBarDetalleEmpleadoEstructura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoEstructura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoEstructura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoEstructura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoEstructura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoestructuraConstantesFunciones.getsFinalQueryEmpleadoEstructura();
		String  finalQueryPaginacionTodos=this.empleadoestructuraConstantesFunciones.getsFinalQueryEmpleadoEstructura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoEstructuraConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoEstructura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoEstructuraConstantesFunciones.getArrayColumnasGlobalesEmpleadoEstructura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoEstructuraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoestructurasEliminados= new ArrayList<EmpleadoEstructura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoEstructura();
		
				///*EmpleadoEstructuraSessionBean*/this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			
			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
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
					this.iNumeroPaginacion=EmpleadoEstructuraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoEstructuraConstantesFunciones.getClassesForeignKeysOfEmpleadoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoestructura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoestructurasAux= new ArrayList<EmpleadoEstructura>();
			
				
			empleadoestructuraLogic.setDatosCliente(this.datosCliente);
			empleadoestructuraLogic.setDatosDeep(this.datosDeep);
			empleadoestructuraLogic.setIsConDeep(true);
			
			
			empleadoestructuraLogic.getEmpleadoEstructuraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoestructuraLogic.getTodosEmpleadoEstructuras(finalQueryGlobal,pagination);
					
					//empleadoestructuraLogic.getTodosEmpleadoEstructurasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoestructuraLogic.getEmpleadoEstructuras()==null|| empleadoestructuraLogic.getEmpleadoEstructuras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoestructurasAux= new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux= new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoestructuraLogic.getTodosEmpleadoEstructuras(finalQueryGlobal+"",this.pagination);												
							
							//empleadoestructuraLogic.getTodosEmpleadoEstructurasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoEstructuras("Todos",empleadoestructuraLogic.getEmpleadoEstructuras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());					
							empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoEstructura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoEstructura=this.idActual;
				
				} else if(this.idEmpleadoEstructuraActual!=null && this.idEmpleadoEstructuraActual!=0L) {
					idEmpleadoEstructura=idEmpleadoEstructuraActual;
				}
				
					
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndicePorId(idEmpleadoEstructura);
				
				this.empleadoestructuras=new ArrayList<EmpleadoEstructura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoestructuraLogic.getEntity(idEmpleadoEstructura);
					
					//empleadoestructuraLogic.getEntityWithConnection(idEmpleadoEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
					empleadoestructuraLogic.getEmpleadoEstructuras().add(empleadoestructuraLogic.getEmpleadoEstructura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructuras=new ArrayList<EmpleadoEstructura>();
					this.empleadoestructuras.add(empleadoestructura);
				}
				
				if(empleadoestructuraLogic.getEmpleadoEstructura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCargo")) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras()==null||empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoestructuras==null|| empleadoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
						empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoestructuraLogic.getEmpleadoEstructurasFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEstructuras("FK_IdCargo",empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEstructuras("FK_IdCargo",empleadoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
						empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras()==null||empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoestructuras==null|| empleadoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
						empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEstructuras("FK_IdEmpleado",empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEstructuras("FK_IdEmpleado",empleadoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
						empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras()==null||empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoestructuras==null|| empleadoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
						empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEstructuras("FK_IdEmpresa",empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEstructuras("FK_IdEmpresa",empleadoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
						empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras()==null||empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoestructuras==null|| empleadoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
						empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEstructuras("FK_IdEstructura",empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEstructuras("FK_IdEstructura",empleadoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
						empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras()==null||empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoestructuras==null|| empleadoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
						empleadoestructurasAux.addAll(empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructurasAux=new ArrayList<EmpleadoEstructura>();
							empleadoestructurasAux.addAll(empleadoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoestructuraLogic.getEmpleadoEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEstructuras("FK_IdSucursal",empleadoestructuraLogic.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEstructuras("FK_IdSucursal",empleadoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
						empleadoestructuraLogic.getEmpleadoEstructuras().addAll(empleadoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuras=new ArrayList<EmpleadoEstructura>();
							empleadoestructuras.addAll(empleadoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoEstructura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoEstructura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoestructuraLogic.getEmpleadoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoestructuras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoestructuraLogic.getEmpleadoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoestructuras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoEstructura empleadoestructura) {
		Boolean permite=true;
		
		if(this.empleadoestructura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoEstructuraConstantesFunciones.getOrderByListaEmpleadoEstructura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoEstructuraConstantesFunciones.getOrderByListaEmpleadoEstructura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEstructura empleadoestructura:empleadoestructuraLogic.getEmpleadoEstructuras()) {
				if(empleadoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoestructuraTotales=empleadoestructura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEstructura empleadoestructura:this.empleadoestructuras) {
				if(empleadoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoestructuraTotales=empleadoestructura;
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
			this.empleadoestructuraAux=new EmpleadoEstructura();
			this.empleadoestructuraAux.setsType(Constantes2.S_TOTALES);
			this.empleadoestructuraAux.setIsNew(false);
			this.empleadoestructuraAux.setIsChanged(false);
			this.empleadoestructuraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoEstructuraConstantesFunciones.TotalizarValoresFilaEmpleadoEstructura(this.empleadoestructuraLogic.getEmpleadoEstructuras(),this.empleadoestructuraAux);
				
				this.empleadoestructuraLogic.getEmpleadoEstructuras().add(this.empleadoestructuraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoEstructuraConstantesFunciones.TotalizarValoresFilaEmpleadoEstructura(this.empleadoestructuras,this.empleadoestructuraAux);
				
				this.empleadoestructuras.add(this.empleadoestructuraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoestructuraTotales=new EmpleadoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoestructuraLogic.getEmpleadoEstructuras().remove(empleadoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoestructuras.remove(empleadoestructuraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoestructuraTotales=new EmpleadoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEstructura empleadoestructura:empleadoestructuraLogic.getEmpleadoEstructuras()) {
				if(empleadoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoestructuraTotales=empleadoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEstructuraConstantesFunciones.TotalizarValoresFilaEmpleadoEstructura(this.empleadoestructuraLogic.getEmpleadoEstructuras(),empleadoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEstructura empleadoestructura:this.empleadoestructuras) {
				if(empleadoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoestructuraTotales=empleadoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEstructuraConstantesFunciones.TotalizarValoresFilaEmpleadoEstructura(this.empleadoestructuras,empleadoestructuraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoEstructurasFK_IdCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEstructurasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEstructurasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEstructurasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEstructurasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoEstructurasFK_IdCargo(String sFinalQuery,Long id_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdCargo(sFinalQuery,this.pagination,id_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEstructurasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEstructurasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEstructurasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEstructurasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLogic.getEmpleadoEstructurasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosEmpleadoEstructura() {
		this.isPermisoTodoEmpleadoEstructura=false;
		this.isPermisoNuevoEmpleadoEstructura=false;
		this.isPermisoActualizarEmpleadoEstructura=false;
		this.isPermisoActualizarOriginalEmpleadoEstructura=false;
		this.isPermisoEliminarEmpleadoEstructura=false;
		this.isPermisoGuardarCambiosEmpleadoEstructura=false;
		this.isPermisoConsultaEmpleadoEstructura=false;
		this.isPermisoBusquedaEmpleadoEstructura=false;
		this.isPermisoReporteEmpleadoEstructura=false;		
		this.isPermisoOrdenEmpleadoEstructura=false;		
		this.isPermisoPaginacionMedioEmpleadoEstructura=false;		
		this.isPermisoPaginacionAltoEmpleadoEstructura=false;
		this.isPermisoPaginacionTodoEmpleadoEstructura=false;
		this.isPermisoCopiarEmpleadoEstructura=false;		
		this.isPermisoVerFormEmpleadoEstructura=false;		
		this.isPermisoDuplicarEmpleadoEstructura=false;		
		this.isPermisoOrdenEmpleadoEstructura=false;		
	}
	
	public void setPermisosUsuarioEmpleadoEstructura(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoEstructura=isPermiso;
		this.isPermisoNuevoEmpleadoEstructura=isPermiso;
		this.isPermisoActualizarEmpleadoEstructura=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEstructura=isPermiso;
		this.isPermisoEliminarEmpleadoEstructura=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEstructura=isPermiso;
		this.isPermisoConsultaEmpleadoEstructura=isPermiso;
		this.isPermisoBusquedaEmpleadoEstructura=isPermiso;
		this.isPermisoReporteEmpleadoEstructura=isPermiso;
		this.isPermisoOrdenEmpleadoEstructura=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoEstructura=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoEstructura=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoEstructura=isPermiso;		
		this.isPermisoCopiarEmpleadoEstructura=isPermiso;		
		this.isPermisoVerFormEmpleadoEstructura=isPermiso;		
		this.isPermisoDuplicarEmpleadoEstructura=isPermiso;
		this.isPermisoOrdenEmpleadoEstructura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoEstructura(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoEstructura=isPermiso;
		this.isPermisoNuevoEmpleadoEstructura=isPermiso;
		this.isPermisoActualizarEmpleadoEstructura=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEstructura=isPermiso;
		this.isPermisoEliminarEmpleadoEstructura=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEstructura=isPermiso;
		//this.isPermisoConsultaEmpleadoEstructura=isPermiso;
		//this.isPermisoBusquedaEmpleadoEstructura=isPermiso;
		//this.isPermisoReporteEmpleadoEstructura=isPermiso;
		//this.isPermisoOrdenEmpleadoEstructura=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoEstructura=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoEstructura=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoEstructura=isPermiso;		
		//this.isPermisoCopiarEmpleadoEstructura=isPermiso;		
		//this.isPermisoDuplicarEmpleadoEstructura=isPermiso;
		//this.isPermisoOrdenEmpleadoEstructura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEstructuraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEstructuraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoEstructuraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoEstructuraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoEstructuraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoEstructura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoEstructura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoEstructura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoEstructura=this.isPermisoActualizarEmpleadoEstructura;
			this.isPermisoEliminarEmpleadoEstructura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoEstructura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoEstructura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoEstructura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoEstructura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoEstructura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoEstructura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoEstructura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoEstructura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoEstructura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoEstructura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoEstructura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoEstructura.setToolTipText(this.jTableDatosEmpleadoEstructura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoEstructura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoEstructura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoEstructura() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoEstructuraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.cargosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoEstructuraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoEstructuraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCargoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CargoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoEstructuraParameterReturnGeneral empleadoestructuraReturnGeneral=new EmpleadoEstructuraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoestructuraConstantesFunciones.cargarid_empresaEmpleadoEstructura)
					 || (this.esRecargarFks && this.empleadoestructuraConstantesFunciones.cargarid_empresaEmpleadoEstructura)) {

					if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoestructuraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.empleadoestructuraConstantesFunciones.cargarid_sucursalEmpleadoEstructura)
					 || (this.esRecargarFks && this.empleadoestructuraConstantesFunciones.cargarid_sucursalEmpleadoEstructura)) {

					if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+empleadoestructuraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoestructuraConstantesFunciones.cargarid_empleadoEmpleadoEstructura)
					 || (this.esRecargarFks && this.empleadoestructuraConstantesFunciones.cargarid_empleadoEmpleadoEstructura)) {

					if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoestructuraSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.empleadoestructuraConstantesFunciones.cargarid_estructuraEmpleadoEstructura)
					 || (this.esRecargarFks && this.empleadoestructuraConstantesFunciones.cargarid_estructuraEmpleadoEstructura)) {

					if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+empleadoestructuraSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalCargo="";

				if(((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0) && this.empleadoestructuraConstantesFunciones.cargarid_cargoEmpleadoEstructura)
					 || (this.esRecargarFks && this.empleadoestructuraConstantesFunciones.cargarid_cargoEmpleadoEstructura)) {

					if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCargo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

						finalQueryGlobalCargo=Funciones.GetFinalQueryAppend(finalQueryGlobalCargo, "");
						finalQueryGlobalCargo+=CargoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCargo=" WHERE " + ConstantesSql.ID + "="+empleadoestructuraSessionBean.getlidCargoActual();
					}
				} else {
					finalQueryGlobalCargo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoestructuraReturnGeneral=empleadoestructuraLogic.cargarCombosLoteForeignKeyEmpleadoEstructura(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalCargo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoestructuraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=empleadoestructuraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoestructuraReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=empleadoestructuraReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalCargo.equals("NONE")) {
				this.cargosForeignKey=empleadoestructuraReturnGeneral.getcargosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoEstructura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyCargo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoestructuraSessionBean==null) {
				this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyCargo()throws Exception {
		try {

			if(!this.empleadoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				Cargo cargo=new Cargo();
				CargoConstantesFunciones.setCargoDescripcion(cargo,Constantes.SMENSAJE_ESCOJA_OPCION);
				cargo.setId(null);

				if(!CargoConstantesFunciones.ExisteEnLista(this.cargosForeignKey,cargo,true)) {

					this.cargosForeignKey.add(0,cargo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoEstructura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoEstructura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.empleadoestructura.setfecha_ingreso(this.parametroGeneralUsuario.getfecha_sistema());
				this.empleadoestructura.setfecha_salida(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEstructura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoEstructura(EmpleadoEstructura empleadoestructura)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoestructura.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(empleadoestructura.getid_estructura(),false,"Formulario");
			this.setActualCargoForeignKey(empleadoestructura.getid_cargo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoEstructura(EmpleadoEstructura empleadoestructura,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadoestructura.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoEstructura")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadoestructura.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoEstructura()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoestructuraConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.empleadoestructuraConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualCargoForeignKey(this.empleadoestructuraConstantesFunciones.getid_cargo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEstructura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoEstructura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoEstructura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameCargosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoEstructura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public EmpleadoEstructuraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoEstructuraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoEstructuraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean(); 
		this.empleadoestructuraConstantesFunciones=new EmpleadoEstructuraConstantesFunciones(); 
		this.empleadoestructuraBean=new EmpleadoEstructura();//(this.empleadoestructuraConstantesFunciones); 		
		this.empleadoestructuraReturnGeneral=new EmpleadoEstructuraParameterReturnGeneral(); 
		
		this.empleadoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoEstructura(true);
			
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
			
			this.empleadoestructuraConstantesFunciones=new EmpleadoEstructuraConstantesFunciones(); 
			this.empleadoestructuraBean=new EmpleadoEstructura();//this.empleadoestructuraConstantesFunciones); 			
			this.empleadoestructuraReturnGeneral=new EmpleadoEstructuraParameterReturnGeneral(); 
		
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Estructura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoestructura=new EmpleadoEstructura();
			this.empleadoestructuras = new ArrayList<EmpleadoEstructura>();
			this.empleadoestructurasAux = new ArrayList<EmpleadoEstructura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic=new EmpleadoEstructuraLogic();
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoEstructura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEstructura);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEstructura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoEstructura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEstructura);
				this.jInternalFrameDetalleFormEmpleadoEstructura.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoEstructura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEstructura);
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEstructura);
					this.jInternalFrameImportacionEmpleadoEstructura.setVisible(false);
					this.jInternalFrameImportacionEmpleadoEstructura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEstructura);
					this.jInternalFrameOrderByEmpleadoEstructura.setVisible(false);
					this.jInternalFrameOrderByEmpleadoEstructura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoEstructuraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoEstructuraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoestructuraReturnGeneral=new EmpleadoEstructuraParameterReturnGeneral();
			
			this.empleadoestructuraParameterGeneral=new EmpleadoEstructuraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoestructuraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoestructuraSessionBean.getEsGuardarRelacionado(),this.empleadoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoestructuraSessionBean.getEsGuardarRelacionado(),this.empleadoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEstructura=true;
			this.isVisibilidadCeldaCopiarEmpleadoEstructura=true;
			this.isVisibilidadCeldaVerFormEmpleadoEstructura=true;
			this.isVisibilidadCeldaOrdenEmpleadoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			
			
			this.isVisibilidadFK_IdCargo=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoEstructura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoEstructura(false);
			
			this.setPermisosUsuarioEmpleadoEstructura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoestructuraSessionBean.getEsGuardarRelacionado() && this.empleadoestructuraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoEstructuraClasesRelacionadas();
			}
			
			if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoEstructuraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoEstructura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEstructura();
			}
			
			if(!this.isPermisoBusquedaEmpleadoEstructura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoEstructura,this.isPermisoPaginacionMedioEmpleadoEstructura,this.isPermisoPaginacionTodoEmpleadoEstructura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoEstructuraConstantesFunciones.getTiposSeleccionarEmpleadoEstructura());
				
				this.tiposColumnasSelect=EmpleadoEstructuraConstantesFunciones.getTiposSeleccionarEmpleadoEstructura(true);
				
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
			//if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoEstructura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoEstructura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoEstructura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEstructura() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.cargoLogic=new CargoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoestructuraImplementable= (EmpleadoEstructuraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoestructuraImplementableHome= (EmpleadoEstructuraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoestructuras= new ArrayList<EmpleadoEstructura>();
			this.empleadoestructurasEliminados= new ArrayList<EmpleadoEstructura>();
						
			this.isEsNuevoEmpleadoEstructura=false;
			this.esParaAccionDesdeFormularioEmpleadoEstructura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.cargosForeignKey=new ArrayList<Cargo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoEstructura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoEstructura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoEstructuraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoEstructura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoEstructura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoEstructura();
			}
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoEstructura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoEstructura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoEstructura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoEstructura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoEstructura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoEstructura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoEstructura")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoEstructura();	
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
	
	public void cargarCombosForeignKeyEmpleadoEstructura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoEstructura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoEstructuraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoEstructura();
		
		this.cargarCombosFrameForeignKeyEmpleadoEstructura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoEstructura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoEstructura();
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

	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCargo(this.cargosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			
			if(jTableDatosEmpleadoEstructura.getRowCount()>=1) {
				jTableDatosEmpleadoEstructura.removeRowSelectionInterval(0, jTableDatosEmpleadoEstructura.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoEstructura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoEstructura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoEstructura(true);			
			//this.empleadoestructura=new EmpleadoEstructura();
			//this.empleadoestructura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEstructura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura() ;
			
			if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEstructura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoestructura);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);				
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoEstructura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoEstructura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEstructura.getSelectedRows().length;			
			}
			
			empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoEstructura--;			
				//EmpleadoEstructura empleadoestructuraAux= new EmpleadoEstructura();			
				//empleadoestructuraAux.setId(this.iIdNuevoEmpleadoEstructura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoEstructura empleadoestructuraOrigen=new EmpleadoEstructura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoEstructura empleadoestructuraOrigen : empleadoestructurasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoestructuraOrigen =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoestructuraOrigen =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoEstructura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoestructura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoEstructura(empleadoestructuraOrigen,this.empleadoestructura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoestructuraLogic.getEmpleadoEstructuras().add(this.empleadoestructuraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoestructuras.add(this.empleadoestructuraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
				
				this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEstructura(), this.getIndiceNuevoEmpleadoEstructura());
				
				int iLastRow =  this.jTableDatosEmpleadoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();									
		
			EmpleadoEstructura empleadoestructuraOrigen=new EmpleadoEstructura();
			EmpleadoEstructura empleadoestructuraDestino=new EmpleadoEstructura();
				
			empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEstructura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoestructurasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoEstructura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraOrigen =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoestructuraOrigen =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoestructuraDestino =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoestructuraDestino =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoestructuraOrigen =empleadoestructurasSeleccionados.get(0);
				empleadoestructuraDestino =empleadoestructurasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoEstructura(empleadoestructuraOrigen,empleadoestructuraDestino,true,false);
				
				empleadoestructuraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoestructuraDestino,empleadoestructuraLogic.getEmpleadoEstructuras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoestructuraDestino,empleadoestructuras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
				
				//this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEstructura(), this.getIndiceNuevoEmpleadoEstructura());
				
				int iLastRow =  this.jTableDatosEmpleadoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoEstructura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoEstructura.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoEstructura.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoEstructura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoEstructura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoEstructura();
			
			this.abrirFrameOrderByEmpleadoEstructura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoEstructura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEstructura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoEstructura.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoEstructura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoEstructura.setSize(this.jInternalFrameDetalleFormEmpleadoEstructura.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoEstructura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoEstructura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoEstructura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoEstructura.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoEstructura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEstructura.jContentPaneDetalleEmpleadoEstructura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEstructura.jContentPaneDetalleEmpleadoEstructura.getWidth(),EmpleadoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEstructura.jContentPaneDetalleEmpleadoEstructura.getWidth(),EmpleadoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEstructura.jContentPaneDetalleEmpleadoEstructura.getWidth(),EmpleadoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoEstructura.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoEstructura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoEstructura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEstructura,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEstructura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEstructura);
				this.jInternalFrameOrderByEmpleadoEstructura.setVisible(false);
				this.jInternalFrameOrderByEmpleadoEstructura.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEstructura"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoEstructura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoEstructura==null) {
				
				this.jInternalFrameImportacionEmpleadoEstructura=new ImportacionJInternalFrame(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEstructura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEstructura);
				this.jInternalFrameImportacionEmpleadoEstructura.setVisible(false);
				this.jInternalFrameImportacionEmpleadoEstructura.setSelected(false);


				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEstructura"));
				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEstructura"));
				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEstructura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoEstructura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEstructura==null) {
				this.jInternalFrameReporteDinamicoEmpleadoEstructura=new ReporteDinamicoJInternalFrame(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEstructura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEstructura);
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEstructura"));
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEstructura"));
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEstructura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEstructura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoEstructura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEstructura);
			
	       	this.jInternalFrameDetalleFormEmpleadoEstructura.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoEstructura.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoEstructura.dispose();
			//this.jInternalFrameDetalleFormEmpleadoEstructura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoEstructura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoEstructura.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoEstructura.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoEstructura.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoEstructura.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoEstructura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoEstructura.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoEstructura.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoEstructura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Estructura");


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

				public void abrirFrameTreeCargo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCargo);
						CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.sTipoBusqueda="Cargo";
						}

						cargoBeanSwingJInternalFrame.getTodosCargoArbol();
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.setCargos(cargoBeanSwingJInternalFrame.cargosArbol);
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.CargarTreeCargo();
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.setVisible(true);
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cargoBeanSwingJInternalFrame.jInternalFrameTreeCargo.jInternalFrameParent=this;
						TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
						TitledBorder titledBorderCargo=(TitledBorder)cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

						titledBorderCargo.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Cargo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cargoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCargo(CargoBeanSwingJInternalFrame jInternalFrameTreeCargo) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCargo);
						jInternalFrameTreeCargo.setVisible(false);
						jInternalFrameTreeCargo.setSelected(false);
						//jInternalFrameTreeCargo.dispose();
						//jInternalFrameTreeCargo=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoEstructura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoEstructura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoEstructura(true);
			//this.isEsNuevoEmpleadoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEstructura(false) ;
			
			if(empleadoestructuraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEstructura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoEstructuraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoEstructura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoEstructura(true);
			//this.isEsNuevoEmpleadoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoestructura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoEstructura(false) ;
			
			if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEstructura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadoestructuraConstantesFunciones.cargarid_empleadoEmpleadoEstructura) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEstructura.getSelectedRow();

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
		TableColumn tableColumnEstructura=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCargo(List<Cargo> cargosForeignKey)throws Exception{
		TableColumn tableColumnCargo=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO));
		TableCellEditor tableCellEditorCargo =tableColumnCargo.getCellEditor();

		CargoTableCell cargoTableCellFk=(CargoTableCell)tableCellEditorCargo;

		if(cargoTableCellFk!=null) {
			cargoTableCellFk.setcargosForeignKey(cargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargoTableCellFk.setRowActual(intSelectedRow);
			//cargoTableCellFk.setcargosForeignKeyActual(cargosForeignKey);
		//}


		if(cargoTableCellFk!=null) {
			cargoTableCellFk.RecargarCargosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEstructura(false);
			
			//if(!this.isEsNuevoEmpleadoEstructura) {								
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoestructura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoEstructura=true;
					this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
					this.isEsNuevoEmpleadoEstructura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoEstructura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoEstructura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEstructura(false);
			
												
				
				if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoEstructura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoEstructuraActionPerformed(evt,empleadoestructuraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoEstructura(this.empleadoestructura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoestructuraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoestructura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.empleadoestructura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.empleadoestructura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoestructura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoEstructuraModel) this.jTableDatosEmpleadoEstructura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoEstructura=true;
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
				this.isEsNuevoEmpleadoEstructura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEstructura(false);
				
				
				
				if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoEstructura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoEstructura.getRowCount()>=1) {
				jTableDatosEmpleadoEstructura.removeRowSelectionInterval(0, jTableDatosEmpleadoEstructura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoEstructura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEstructura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(false) ;
			
			this.isEsNuevoEmpleadoEstructura=false;
			
			if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoEstructura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoEstructura(false);
				
				//SI ES MANUAL
				if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoEstructura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoEstructura--;			
			//EmpleadoEstructura empleadoestructuraAux= new EmpleadoEstructura();			
			//empleadoestructuraAux.setId(this.iIdNuevoEmpleadoEstructura);
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoEstructura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
			
			this.empleadoestructura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoestructuraLogic.getEmpleadoEstructuras().add(this.empleadoestructuraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoestructuras.add(this.empleadoestructuraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			
			this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEstructura(), this.getIndiceNuevoEmpleadoEstructura());
			
			int iLastRow =  this.jTableDatosEmpleadoEstructura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoEstructura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoEstructura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEstructura(false);
			
			//SI ES MANUAL
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEstructura();
			}
			
			//this.abrirFrameTreeEmpleadoEstructura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado EstructuraS ?", "MANTENIMIENTO DE Empleado Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoEstructura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoEstructura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoestructuraReturnGeneral=empleadoestructuraLogic.procesarImportacionEmpleadoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoestructuraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoEstructuraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoEstructura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoEstructura.setFileImportacion(this.jInternalFrameImportacionEmpleadoEstructura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoEstructura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoEstructura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoEstructura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoEstructura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		

		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoEstructuraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoEstructuraBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSalida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSalida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSalida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSalida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroReingreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroReingreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroReingreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroReingreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoria="id_cargo";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoria="fecha_ingreso";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoria="fecha_salida";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO:
					sNombreCampoCategoria="numero_reingreso";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoriaValor="id_cargo";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoriaValor="fecha_ingreso";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoriaValor="fecha_salida";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO:
					sNombreCampoCategoriaValor="numero_reingreso";
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"A",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cargo");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ingreso");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Salida",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_salida");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Reingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_reingreso");
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getcargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getfecha_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getfecha_salida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getnumero_reingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EmpleadoEstructura empleadoestructura:empleadoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoestructura.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoEstructura(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoEstructura(empleadoestructuraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEstructura(false);
			
			//SI ES MANUAL
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEstructura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEstructura(false);
			
			//SI ES MANUAL
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEstructura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEstructura(false);
			
			//SI ES MANUAL
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEstructura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoEstructura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoEstructura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoEstructura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoEstructura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoEstructura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoEstructura.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoEstructura.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoEstructura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoEstructura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoEstructura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoEstructura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoEstructura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoEstructura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoEstructura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEstructura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEstructura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoEstructura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoEstructura();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEstructura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEstructura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEstructura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEstructura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoEstructura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoEstructura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoEstructura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionNuevoEmpleadoEstructura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionSinCerrarEmpleadoEstructura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionSinMensajeEmpleadoEstructura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoEstructura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoEstructura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionNuevoEmpleadoEstructura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionSinCerrarEmpleadoEstructura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoEstructura.jCheckBoxPostAccionSinMensajeEmpleadoEstructura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoEstructura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoEstructura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoEstructura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoEstructura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoEstructura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoEstructura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoEstructura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoEstructura(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEstructura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEstructura() throws Exception {
		try	{
			if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEstructura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEstructura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEstructura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoEstructura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoEstructura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoEstructura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoEstructura.addItem(reporte);
			}
			
			
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoEstructura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoEstructura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEstructura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEstructura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoEstructura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.getSelectedItem()!=null){this.id_cargoFK_IdCargo=((Cargo)this.jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoEstructura(Boolean esInicializar) throws Exception {				
		if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEstructura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoEstructura() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoEstructura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoEstructuraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructuraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoEstructura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoestructuraLogic.getEmpleadoEstructuras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoestructuras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoEstructura.setModel(new EmpleadoEstructuraModel(this.empleadoestructuraLogic.getEmpleadoEstructuras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoEstructura.setModel(new EmpleadoEstructuraModel(this.empleadoestructuras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoEstructura!=null && this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoEstructura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,empleadoestructuraConstantesFunciones.resaltarSeleccionarEmpleadoEstructura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,empleadoestructuraConstantesFunciones.resaltarSeleccionarEmpleadoEstructura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_ID));

		if(this.empleadoestructuraConstantesFunciones.mostraridEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoestructuraConstantesFunciones.resaltaridEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activaridEmpleadoEstructura,this,true,"idEmpleadoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoestructuraConstantesFunciones.resaltaridEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activaridEmpleadoEstructura,this,true,"idEmpleadoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoestructuraConstantesFunciones.mostrarid_empresaEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_empresaEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_empresaEmpleadoEstructura));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_empresaEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_empresaEmpleadoEstructura,false,"id_empresaEmpleadoEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.empleadoestructuraConstantesFunciones.mostrarid_sucursalEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_sucursalEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_sucursalEmpleadoEstructura));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_sucursalEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_sucursalEmpleadoEstructura,false,"id_sucursalEmpleadoEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoestructuraConstantesFunciones.mostrarid_empleadoEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_empleadoEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_empleadoEmpleadoEstructura));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_empleadoEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_empleadoEmpleadoEstructura,true,"id_empleadoEmpleadoEstructura","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.empleadoestructuraConstantesFunciones.mostrarid_estructuraEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_estructuraEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_estructuraEmpleadoEstructura));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_estructuraEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_estructuraEmpleadoEstructura,true,"id_estructuraEmpleadoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO));

		if(this.empleadoestructuraConstantesFunciones.mostrarid_cargoEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CargoTableCell(this.cargosForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_cargoEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_cargoEmpleadoEstructura));
			tableColumn.setCellEditor(new CargoTableCell(this.cargosForeignKey,this.empleadoestructuraConstantesFunciones.resaltarid_cargoEmpleadoEstructura,this,this.empleadoestructuraConstantesFunciones.activarid_cargoEmpleadoEstructura,true,"id_cargoEmpleadoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO));

		if(this.empleadoestructuraConstantesFunciones.mostrarfecha_ingresoEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadoestructuraConstantesFunciones.resaltarfecha_ingresoEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarfecha_ingresoEmpleadoEstructura,this,true,"fecha_ingresoEmpleadoEstructura","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadoestructuraConstantesFunciones.resaltarfecha_ingresoEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarfecha_ingresoEmpleadoEstructura,this,true,"fecha_ingresoEmpleadoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA));

		if(this.empleadoestructuraConstantesFunciones.mostrarfecha_salidaEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadoestructuraConstantesFunciones.resaltarfecha_salidaEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarfecha_salidaEmpleadoEstructura,this,true,"fecha_salidaEmpleadoEstructura","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadoestructuraConstantesFunciones.resaltarfecha_salidaEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarfecha_salidaEmpleadoEstructura,this,true,"fecha_salidaEmpleadoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO));

		if(this.empleadoestructuraConstantesFunciones.mostrarnumero_reingresoEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoestructuraConstantesFunciones.resaltarnumero_reingresoEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarnumero_reingresoEmpleadoEstructura,this,true,"numero_reingresoEmpleadoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoestructuraConstantesFunciones.resaltarnumero_reingresoEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activarnumero_reingresoEmpleadoEstructura,this,true,"numero_reingresoEmpleadoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empleadoestructuraConstantesFunciones.mostrardescripcionEmpleadoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoestructuraConstantesFunciones.resaltardescripcionEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activardescripcionEmpleadoEstructura,this,true,"descripcionEmpleadoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoestructuraConstantesFunciones.resaltardescripcionEmpleadoEstructura,this.empleadoestructuraConstantesFunciones.activardescripcionEmpleadoEstructura,this,true,"descripcionEmpleadoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEstructura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEstructura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoestructuraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoEstructura.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoEstructura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoEstructura.moveColumn(this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoEstructura.moveColumn(this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoEstructura.moveColumn(this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoEstructura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoEstructura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoEstructura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoEstructura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoEstructura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoEstructura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoestructuraLogic.getEmpleadoEstructuras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoestructuras.size()-1;
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
		//this.jTableDatosEmpleadoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoEstructura();
			
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
				
				//this.isEsNuevoEmpleadoEstructura=false;
					
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
				if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEstructura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoestructura.getsType().equals("DUPLICADO")
				   || this.empleadoestructura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoEstructura=true;
				
				} else {
					this.isEsNuevoEmpleadoEstructura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoestructura.getId()>=0 && !this.empleadoestructura.getIsNew()) {						
						this.isEsNuevoEmpleadoEstructura=false;
						
					} else {
						this.isEsNuevoEmpleadoEstructura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoEstructura(esRelaciones);						
				
				this.seleccionarEmpleadoEstructura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoestructura.getId()<0) {
					this.isEsNuevoEmpleadoEstructura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoEstructura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoEstructura(evt,rowIndex);
				}	
				
				if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoEstructura: " + this.dDif); 
					}
				}								
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoEstructura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoestructura)) {
					if(this.empleadoestructura.getId()>0) {
						this.empleadoestructura.setIsDeleted(true);
						
						this.empleadoestructurasEliminados.add(this.empleadoestructura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoestructuraLogic.getEmpleadoEstructuras().remove(this.empleadoestructura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoestructuras.remove(this.empleadoestructura);				
					}
					
					
					((EmpleadoEstructuraModel) this.jTableDatosEmpleadoEstructura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEstructura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoEstructura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoEstructura) {
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEstructura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructura);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoestructuraConstantesFunciones.cargarid_empresaEmpleadoEstructura || this.empleadoestructuraConstantesFunciones.event_dependid_empresaEmpleadoEstructura) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoestructura.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoestructura.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoestructura.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoestructura.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.empleadoestructuraConstantesFunciones.cargarid_sucursalEmpleadoEstructura || this.empleadoestructuraConstantesFunciones.event_dependid_sucursalEmpleadoEstructura) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.empleadoestructura.getid_sucursal());
									//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(empleadoestructura.getSucursal()!=null) {
							this.sucursalsForeignKey.add(empleadoestructura.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.empleadoestructura.getid_sucursal(),false,"Formulario");

					//Empleado
					if(!this.empleadoestructuraConstantesFunciones.cargarid_empleadoEmpleadoEstructura || this.empleadoestructuraConstantesFunciones.event_dependid_empleadoEmpleadoEstructura) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoestructura.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoestructura.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoestructura.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoestructura.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.empleadoestructuraConstantesFunciones.cargarid_estructuraEmpleadoEstructura || this.empleadoestructuraConstantesFunciones.event_dependid_estructuraEmpleadoEstructura) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.empleadoestructura.getid_estructura());
									//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(empleadoestructura.getEstructura()!=null) {
							this.estructurasForeignKey.add(empleadoestructura.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.empleadoestructura.getid_estructura(),false,"Formulario");

					//Cargo
					if(!this.empleadoestructuraConstantesFunciones.cargarid_cargoEmpleadoEstructura || this.empleadoestructuraConstantesFunciones.event_dependid_cargoEmpleadoEstructura) {
						//this.cargarCombosCargosForeignKeyLista(" where id="+this.empleadoestructura.getid_cargo());
									//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
						this.cargosForeignKey=new ArrayList<Cargo>();

						if(empleadoestructura.getCargo()!=null) {
							this.cargosForeignKey.add(empleadoestructura.getCargo());
						}

						this.addItemDefectoCombosForeignKeyCargo();
						this.cargarCombosFrameCargosForeignKey("Todos");
					}
					this.setActualCargoForeignKey(this.empleadoestructura.getid_cargo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoEstructura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoEstructura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEstructura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEstructura(EmpleadoEstructura empleadoestructura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoEstructura(empleadoestructura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoEstructura(empleadoestructura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoEstructura(empleadoestructura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEstructura(empleadoestructura);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoEstructura(EmpleadoEstructura empleadoestructura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setText(empleadoestructura.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setDate(empleadoestructura.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setDate(empleadoestructura.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setText(empleadoestructura.getnumero_reingreso().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setText(empleadoestructura.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoEstructura empleadoestructuraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoestructuraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoEstructura empleadoestructuraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoestructuraLocal=this.empleadoestructura;
			} else {
				empleadoestructuraLocal=this.empleadoestructuraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoestructuraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoEstructura(empleadoestructuraLocal,true);
					
					if(empleadoestructuraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoestructuraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoestructuraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEstructura(empleadoestructura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(empleadoestructura);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEstructura(empleadoestructura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.getText()==null || this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.getText()=="" || this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setText("0");
			}

			if(conColumnasBase) {empleadoestructura.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEstructuraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelIdEmpleadoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoestructura.setfecha_ingreso(this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_ingresoEmpleadoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoestructura.setfecha_salida(this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelfecha_salidaEmpleadoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoestructura.setnumero_reingreso(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelnumero_reingresoEmpleadoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoestructura.setdescripcion(this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEstructura.jLabeldescripcionEmpleadoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEstructura(EmpleadoEstructura empleadoestructuraBean,EmpleadoEstructura empleadoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoestructuraBean.getid_empleado()!=null && !empleadoestructuraBean.getid_empleado().equals(-1L))) {empleadoestructura.setid_empleado(empleadoestructuraBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadoestructuraBean.getid_estructura()!=null && !empleadoestructuraBean.getid_estructura().equals(-1L))) {empleadoestructura.setid_estructura(empleadoestructuraBean.getid_estructura());}
			if(conDefault || (!conDefault && empleadoestructuraBean.getid_cargo()!=null && !empleadoestructuraBean.getid_cargo().equals(-1L))) {empleadoestructura.setid_cargo(empleadoestructuraBean.getid_cargo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoEstructura(EmpleadoEstructura empleadoestructuraOrigen,EmpleadoEstructura empleadoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoestructuraOrigen.getId()!=null && !empleadoestructuraOrigen.getId().equals(0L))) {empleadoestructura.setId(empleadoestructuraOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getid_empleado()!=null && !empleadoestructuraOrigen.getid_empleado().equals(-1L))) {empleadoestructura.setid_empleado(empleadoestructuraOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getid_estructura()!=null && !empleadoestructuraOrigen.getid_estructura().equals(-1L))) {empleadoestructura.setid_estructura(empleadoestructuraOrigen.getid_estructura());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getid_cargo()!=null && !empleadoestructuraOrigen.getid_cargo().equals(-1L))) {empleadoestructura.setid_cargo(empleadoestructuraOrigen.getid_cargo());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getfecha_ingreso()!=null && !empleadoestructuraOrigen.getfecha_ingreso().equals(new Date()))) {empleadoestructura.setfecha_ingreso(empleadoestructuraOrigen.getfecha_ingreso());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getfecha_salida()!=null && !empleadoestructuraOrigen.getfecha_salida().equals(new Date()))) {empleadoestructura.setfecha_salida(empleadoestructuraOrigen.getfecha_salida());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getnumero_reingreso()!=null && !empleadoestructuraOrigen.getnumero_reingreso().equals(0))) {empleadoestructura.setnumero_reingreso(empleadoestructuraOrigen.getnumero_reingreso());}
			if(conDefault || (!conDefault && empleadoestructuraOrigen.getdescripcion()!=null && !empleadoestructuraOrigen.getdescripcion().equals(""))) {empleadoestructura.setdescripcion(empleadoestructuraOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEstructura(EmpleadoEstructura empleadoestructura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setText(empleadoestructura.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setDate(empleadoestructura.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setDate(empleadoestructura.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setText(empleadoestructura.getnumero_reingreso().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setText(empleadoestructura.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEstructura(EmpleadoEstructuraBean empleadoestructuraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setText(empleadoestructuraBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setDate(empleadoestructuraBean.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setDate(empleadoestructuraBean.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setText(empleadoestructuraBean.getnumero_reingreso().toString());
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setText(empleadoestructuraBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoEstructura(EmpleadoEstructuraParameterReturnGeneral empleadoestructuraReturnGeneral,EmpleadoEstructuraBean empleadoestructuraBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoEstructura empleadoestructuraLocal=new EmpleadoEstructura();
			
			empleadoestructuraLocal=empleadoestructuraReturnGeneral.getEmpleadoEstructura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoestructuraLocal.getId()!=null && !empleadoestructuraLocal.getId().equals(0L))) {empleadoestructuraBean.setId(empleadoestructuraLocal.getId());}}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getid_empleado()!=null && !empleadoestructuraLocal.getid_empleado().equals(-1L))) {empleadoestructuraBean.setid_empleado(empleadoestructuraLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getid_estructura()!=null && !empleadoestructuraLocal.getid_estructura().equals(-1L))) {empleadoestructuraBean.setid_estructura(empleadoestructuraLocal.getid_estructura());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getid_cargo()!=null && !empleadoestructuraLocal.getid_cargo().equals(-1L))) {empleadoestructuraBean.setid_cargo(empleadoestructuraLocal.getid_cargo());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getfecha_ingreso()!=null && !empleadoestructuraLocal.getfecha_ingreso().equals(new Date()))) {empleadoestructuraBean.setfecha_ingreso(empleadoestructuraLocal.getfecha_ingreso());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getfecha_salida()!=null && !empleadoestructuraLocal.getfecha_salida().equals(new Date()))) {empleadoestructuraBean.setfecha_salida(empleadoestructuraLocal.getfecha_salida());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getnumero_reingreso()!=null && !empleadoestructuraLocal.getnumero_reingreso().equals(0))) {empleadoestructuraBean.setnumero_reingreso(empleadoestructuraLocal.getnumero_reingreso());}
			if(conDefault || (!conDefault && empleadoestructuraLocal.getdescripcion()!=null && !empleadoestructuraLocal.getdescripcion().equals(""))) {empleadoestructuraBean.setdescripcion(empleadoestructuraLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoEstructuraGenerico(Long idEmpleadoEstructuraSeleccionado,JComboBox jComboBoxEmpleadoEstructura,List<EmpleadoEstructura> empleadoestructurasLocal)throws Exception {
		try {
			EmpleadoEstructura  empleadoestructuraTemp=null;

			for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasLocal) {
				if(empleadoestructuraAux.getId()!=null && empleadoestructuraAux.getId().equals(idEmpleadoEstructuraSeleccionado)) {
					empleadoestructuraTemp=empleadoestructuraAux;
					break;
				}
			}

			jComboBoxEmpleadoEstructura.setSelectedItem(empleadoestructuraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoEstructuraGenerico(JComboBox jComboBoxEmpleadoEstructura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEstructura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEstructura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoestructura=(EmpleadoEstructura) empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoestructura =(EmpleadoEstructura) empleadoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoestructura.getIsNew() && !empleadoestructura.getIsChanged() && !empleadoestructura.getIsDeleted()) {
				sDescripcion=empleadoestructura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoestructura.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!empleadoestructura.getIsNew() && !empleadoestructura.getIsChanged() && !empleadoestructura.getIsDeleted()) {
				sDescripcion=empleadoestructura.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoestructura.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoestructura.getIsNew() && !empleadoestructura.getIsChanged() && !empleadoestructura.getIsDeleted()) {
				sDescripcion=empleadoestructura.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoestructura.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!empleadoestructura.getIsNew() && !empleadoestructura.getIsChanged() && !empleadoestructura.getIsDeleted()) {
				sDescripcion=empleadoestructura.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoestructura.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Cargo")) {
			//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
			if(!empleadoestructura.getIsNew() && !empleadoestructura.getIsChanged() && !empleadoestructura.getIsDeleted()) {
				sDescripcion=empleadoestructura.getcargo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoestructura.getcargo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoEstructura empleadoestructuraRow=new EmpleadoEstructura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoestructuraRow=(EmpleadoEstructura) empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoestructuraRow=(EmpleadoEstructura) empleadoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoEstructura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));			
			this.jButtonDuplicarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEstructura && this.isPermisoDuplicarEmpleadoEstructura));			
			this.jButtonCopiarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEstructura && this.isPermisoCopiarEmpleadoEstructura));
			this.jButtonVerFormEmpleadoEstructura.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEstructura && this.isPermisoVerFormEmpleadoEstructura));
			
			this.jButtonAbrirOrderByEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));			
			
			this.jButtonNuevoRelacionesEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));			
			this.jButtonNuevoGuardarCambiosEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaModificarEmpleadoEstructura && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEstructura && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEstructura && this.isPermisoEliminarEmpleadoEstructura));
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEstructura);							
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));						
			this.jButtonDuplicarToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEstructura && this.isPermisoDuplicarEmpleadoEstructura));						
			this.jButtonCopiarToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEstructura && this.isPermisoCopiarEmpleadoEstructura));			
			this.jButtonVerFormToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEstructura && this.isPermisoVerFormEmpleadoEstructura));			
			this.jButtonAbrirOrderByToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));
			this.jButtonNuevoRelacionesToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));			
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaModificarEmpleadoEstructura && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEstructura  && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEstructura && this.isPermisoEliminarEmpleadoEstructura));
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarToolBarEmpleadoEstructura.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEstructura);				
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));			
			this.jMenuItemDuplicarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEstructura && this.isPermisoDuplicarEmpleadoEstructura));			
			this.jMenuItemCopiarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEstructura && this.isPermisoCopiarEmpleadoEstructura));			
			this.jMenuItemVerFormEmpleadoEstructura.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEstructura && this.isPermisoVerFormEmpleadoEstructura));			
			this.jMenuItemAbrirOrderByEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));			
			//this.jMenuItemMostrarOcultarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));
			this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEstructura && this.isPermisoOrdenEmpleadoEstructura));			
			this.jMenuItemNuevoRelacionesEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEstructura && this.isPermisoNuevoEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));									
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemModificarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaModificarEmpleadoEstructura && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemActualizarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEstructura && this.isPermisoActualizarEmpleadoEstructura));	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemEliminarEmpleadoEstructura.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEstructura && this.isPermisoEliminarEmpleadoEstructura));
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemCancelarEmpleadoEstructura.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEstructura);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));						
			this.jMenuItemGuardarCambiosTablaEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=this.jButtonNuevoEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoEstructura=this.jButtonDuplicarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoEstructura=this.jButtonCopiarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoEstructura=this.jButtonVerFormEmpleadoEstructura.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoEstructura=this.jButtonAbrirOrderByEmpleadoEstructura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=this.jButtonNuevoRelacionesEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoEstructura=this.jButtonModificarEmpleadoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=this.jButtonGuardarCambiosTablaEmpleadoEstructura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=this.jButtonNuevoToolBarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=this.jButtonNuevoRelacionesToolBarEmpleadoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarToolBarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarToolBarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarToolBarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarToolBarEmpleadoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEstructura=this.jButtonGuardarCambiosToolBarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=this.jMenuItemNuevoEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=this.jMenuItemNuevoRelacionesEmpleadoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemModificarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemActualizarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemEliminarEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemCancelarEmpleadoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEstructura=this.jMenuItemGuardarCambiosEmpleadoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=this.jMenuItemGuardarCambiosTablaEmpleadoEstructura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoEstructura(Boolean esInicializar) {
		if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEstructura();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoEstructura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoEstructura() {
		this.jButtonNuevoEmpleadoEstructura.setVisible(this.isPermisoNuevoEmpleadoEstructura);			
		this.jButtonDuplicarEmpleadoEstructura.setVisible(this.isPermisoDuplicarEmpleadoEstructura);			
		this.jButtonCopiarEmpleadoEstructura.setVisible(this.isPermisoCopiarEmpleadoEstructura);			
		this.jButtonVerFormEmpleadoEstructura.setVisible(this.isPermisoVerFormEmpleadoEstructura);			
		
		this.jButtonAbrirOrderByEmpleadoEstructura.setVisible(this.isPermisoOrdenEmpleadoEstructura);					
		
		this.jButtonNuevoRelacionesEmpleadoEstructura.setVisible(this.isPermisoNuevoEmpleadoEstructura);			
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarEmpleadoEstructura.setVisible(this.isPermisoActualizarEmpleadoEstructura);	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.setVisible(this.isPermisoActualizarEmpleadoEstructura);	
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.setVisible(this.isPermisoEliminarEmpleadoEstructura);
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEstructura);						
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.setVisible(this.isPermisoGuardarCambiosEmpleadoEstructura);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.setVisible(this.isPermisoActualizarEmpleadoEstructura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEstructura() {
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarEmpleadoEstructura.setVisible(this.isPermisoActualizarEmpleadoEstructura);	
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.setVisible(this.isPermisoActualizarEmpleadoEstructura);	
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.setVisible(this.isPermisoEliminarEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEstructura);							
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEstructura && this.isPermisoGuardarCambiosEmpleadoEstructura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoEstructura() {
		if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEstructura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoEstructura() {
	}
	
	public void jTableDatosEmpleadoEstructuraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoEstructura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoestructura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoestructuraLogic.getConnexion());

				if(this.empleadoestructura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoestructura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoestructura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEmpleadoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.empleadoestructuraLogic.getConnexion());

				if(this.empleadoestructura.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.empleadoestructura.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.empleadoestructura.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoEstructuraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEmpleadoEstructura=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoEstructura.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoestructuraLogic.getConnexion());

				if(this.empleadoestructura.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoestructura.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoestructura.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEmpleadoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.empleadoestructuraLogic.getConnexion());

				if(this.empleadoestructura.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.empleadoestructura.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.empleadoestructura.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargoEmpleadoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargo=true;

			idTienePermisocargo=this.tienePermisosUsuarioEnPaginaWebEmpleadoEstructura(CargoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.empleadoestructuraLogic.getConnexion());

				if(this.empleadoestructura.getid_cargo()!=null) {
					this.cargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargoBeanSwingJInternalFrame.setIdActual(this.empleadoestructura.getid_cargo());
					this.cargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo();
				}

				JInternalFrameBase jinternalFrame =this.cargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)this.jScrollPanelDatosEmpleadoEstructura.getBorder();
				TitledBorder titledBordercargo=(TitledBorder)this.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

				titledBordercargo.setTitle(titledBorderEmpleadoEstructura.getTitle() + " -> Cargo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargoEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getid_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo = "+this.empleadoestructura.getid_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ingresoEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getfecha_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ingreso = '"+Funciones2.getStringPostgresDate(this.empleadoestructura.getfecha_ingreso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_salidaEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getfecha_salida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_salida = '"+Funciones2.getStringPostgresDate(this.empleadoestructura.getfecha_salida())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_reingresoEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getnumero_reingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_reingreso = "+this.empleadoestructura.getnumero_reingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpleadoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.getempleadoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoestructura==null) {
						this.empleadoestructura = new EmpleadoEstructura();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);
				}

				if(this.empleadoestructura.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empleadoestructura.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCargoEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);

			this.getEmpleadoEstructurasFK_IdCargo();

			this.inicializarActualizarBindingEmpleadoEstructura(false);

			//if(EmpleadoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);

			this.getEmpleadoEstructurasFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoEstructura(false);

			//if(EmpleadoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);

			this.getEmpleadoEstructurasFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoEstructura(false);

			//if(EmpleadoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);

			this.getEmpleadoEstructurasFK_IdEstructura();

			this.inicializarActualizarBindingEmpleadoEstructura(false);

			//if(EmpleadoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEmpleadoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);

			this.getEmpleadoEstructurasFK_IdSucursal();

			this.inicializarActualizarBindingEmpleadoEstructura(false);

			//if(EmpleadoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoEstructura() {
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoEstructura.dispose();
			this.jInternalFrameDetalleFormEmpleadoEstructura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoEstructura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoEstructura.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoEstructura=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoEstructura!=null) {
			this.jInternalFrameImportacionEmpleadoEstructura.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoEstructura.dispose();
			this.jInternalFrameImportacionEmpleadoEstructura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoEstructura();
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoEstructura")) {
				jButtonDuplicarEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoEstructura")) {
				jButtonCopiarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoEstructura")) {
				jButtonVerFormEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoEstructura")) {
				jButtonDuplicarEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoEstructura")) {
				jButtonDuplicarEmpleadoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoEstructura")) {
				jButtonModificarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoEstructura")) {
				jButtonModificarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoEstructura")) {
				jButtonModificarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoEstructura")) {
				jButtonActualizarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoEstructura")) {
				jButtonActualizarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoEstructura")) {
				jButtonActualizarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoEstructura")) {
				jButtonEliminarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoEstructura")) {
				jButtonEliminarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoEstructura")) {
				jButtonEliminarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoEstructura")) {
				jButtonCancelarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoEstructura")) {
				jButtonCancelarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoEstructura")) {
				jButtonCancelarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoEstructura")) {
				jButtonCerrarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoEstructura")) {
				jButtonCerrarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoEstructura")) {
				jButtonCerrarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoEstructura")) {
				jButtonMostrarOcultarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoEstructura")) {
				jButtonCancelarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoEstructura")) {
				jButtonCopiarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoEstructura")) {
				jButtonVerFormEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoEstructura")) {
				jButtonCopiarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoEstructura")) {
				jButtonVerFormEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoEstructura")) {
				jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoEstructura")) {
				jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoEstructura")) {
				jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoEstructura")) {
				jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoEstructura")) {
				jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoEstructura")) {
				jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoEstructura")) {
				jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoEstructura")) {
				jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoEstructura")) {
				jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoEstructura") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoEstructura")) {
				jButtonAbrirOrderByEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoEstructura") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoEstructura")) {
				jButtonMostrarOcultarEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEstructura")) {
				jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoEstructura")) {
				jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoEstructura")) {
				jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoEstructura")) {
				jButtonCerrarReporteDinamicoEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoEstructura")) {
				jButtonGenerarReporteDinamicoEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoEstructura")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoEstructura")) {
				jButtonCerrarImportacionEmpleadoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoEstructura")) {
				
				jButtonGenerarImportacionEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoEstructura")) {
				
				jButtonAbrirImportacionEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoEstructura")) {
				jComboBoxTiposAccionesEmpleadoEstructuraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoEstructura")) {
				jComboBoxTiposRelacionesEmpleadoEstructuraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoEstructura")) {
				jComboBoxTiposAccionesEmpleadoEstructuraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoEstructura")) {
				
				jComboBoxTiposSeleccionarEmpleadoEstructuraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoEstructura")) {
				jTextFieldValorCampoGeneralEmpleadoEstructuraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoEstructura")) {
				jButtonAbrirOrderByEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoEstructura")) {
				jButtonAbrirOrderByEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoEstructura")) {
				jButtonCerrarOrderByEmpleadoEstructuraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEstructuraBusqueda")) {
				this.jButtonidEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEstructuraUpdate")) {
				this.jButtonid_empresaEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEstructuraBusqueda")) {
				this.jButtonid_empresaEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoEstructuraUpdate")) {
				this.jButtonid_sucursalEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoEstructuraBusqueda")) {
				this.jButtonid_sucursalEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructura")) {
				this.jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructuraUpdate")) {
				this.jButtonid_empleadoEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructuraBusqueda")) {
				this.jButtonid_empleadoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoEstructuraUpdate")) {
				this.jButtonid_estructuraEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoEstructuraBusqueda")) {
				this.jButtonid_estructuraEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoEmpleadoEstructuraUpdate")) {
				this.jButtonid_cargoEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoEmpleadoEstructuraBusqueda")) {
				this.jButtonid_cargoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoEmpleadoEstructuraBusqueda")) {
				this.jButtonfecha_ingresoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaEmpleadoEstructuraBusqueda")) {
				this.jButtonfecha_salidaEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_reingresoEmpleadoEstructuraBusqueda")) {
				this.jButtonnumero_reingresoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEstructuraBusqueda")) {
				this.jButtondescripcionEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoEstructura")) {
				this.jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCargoEmpleadoEstructura")) {
				this.jButtonFK_IdCargoEmpleadoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoEstructura")) {
				this.jButtonFK_IdEmpleadoEmpleadoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraEmpleadoEstructura")) {
				this.jButtonFK_IdEstructuraEmpleadoEstructuraActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoEstructura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoEstructura empleadoestructuraLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoestructuraLocal=this.empleadoestructura;
			} else {
				empleadoestructuraLocal=this.empleadoestructuraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
							
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
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
			
			


			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
								
						
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
								
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
							
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
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
			
			


			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
								
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoEstructura")) {
					jCheckBoxSeleccionarTodosEmpleadoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoEstructura")) {
					jCheckBoxSeleccionadosEmpleadoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoEstructura")) {
					
				}
				
				


				
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
												
				
				


				
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
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
			
			


			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoestructura);
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
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
				
				


				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEstructura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoestructuraAnterior =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoEstructura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoEstructura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoestructura =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoestructura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoEstructura")) {
				
				}
				
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoEstructura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoEstructura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoEstructura")) {
			
			}
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoEstructura();
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoEstructura")) {
				jButtonDuplicarEmpleadoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoEstructura")) {
				jButtonCopiarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoEstructura")) {
				jButtonVerFormEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEstructura")) {
				jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoEstructura")) {
				jButtonModificarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoEstructura")) {
				jButtonActualizarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoEstructura")) {
				jButtonEliminarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoEstructura")) {
				jButtonCancelarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoEstructura")) {
				jButtonCerrarEmpleadoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoEstructura")) {
				jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEstructura")) {
				jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoEstructura")) {
				jButtonAbrirOrderByEmpleadoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoEstructura")) {
				jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoEstructura")) {
				jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoEstructura")) {
				jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEstructuraBusqueda")) {
				this.jButtonidEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEstructuraUpdate")) {
				this.jButtonid_empresaEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEstructuraBusqueda")) {
				this.jButtonid_empresaEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoEstructuraUpdate")) {
				this.jButtonid_sucursalEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoEstructuraBusqueda")) {
				this.jButtonid_sucursalEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructura")) {
				this.jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructuraUpdate")) {
				this.jButtonid_empleadoEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEstructuraBusqueda")) {
				this.jButtonid_empleadoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoEstructuraUpdate")) {
				this.jButtonid_estructuraEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoEstructuraBusqueda")) {
				this.jButtonid_estructuraEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoEmpleadoEstructuraUpdate")) {
				this.jButtonid_cargoEmpleadoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoEmpleadoEstructuraBusqueda")) {
				this.jButtonid_cargoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoEmpleadoEstructuraBusqueda")) {
				this.jButtonfecha_ingresoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaEmpleadoEstructuraBusqueda")) {
				this.jButtonfecha_salidaEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_reingresoEmpleadoEstructuraBusqueda")) {
				this.jButtonnumero_reingresoEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEstructuraBusqueda")) {
				this.jButtondescripcionEmpleadoEstructuraBusquedaActionPerformed(evt);
			}
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoEstructura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoEstructura")) {
				closingInternalFrameEmpleadoEstructura();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoEstructura")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoEstructura = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEstructura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoEstructuraActionPerformed(null);
			}
			
			EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoestructura,new Object(),this.empleadoestructuraParameterGeneral,this.empleadoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoestructura)) {
			if(!esControlTabla) {
				if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);			
				}
				
				if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoEstructura(this.empleadoestructura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoestructuraReturnGeneral=empleadoestructuraLogic.procesarEventosEmpleadoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoestructuraLogic.getEmpleadoEstructuras(),this.empleadoestructura,this.empleadoestructuraParameterGeneral,this.isEsNuevoEmpleadoEstructura,classes);//this.empleadoestructuraLogic.getEmpleadoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEstructura(this.empleadoestructuraReturnGeneral,this.empleadoestructuraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEstructura(classes,this.empleadoestructuraReturnGeneral,this.empleadoestructuraBean,false);
					}
						
					if(this.empleadoestructuraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura());	
					}
						
					if(this.empleadoestructuraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura(),classes);//this.empleadoestructuraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEstructura(this.empleadoestructura,classes);//this.empleadoestructuraBean);									
				}
			
				if(EmpleadoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoEstructura(this.empleadoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEstructura(this.empleadoestructura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoestructuraAnterior!=null) {
						this.empleadoestructura=this.empleadoestructuraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoestructuraReturnGeneral=empleadoestructuraLogic.procesarEventosEmpleadoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoestructuraLogic.getEmpleadoEstructuras(),this.empleadoestructura,this.empleadoestructuraParameterGeneral,this.isEsNuevoEmpleadoEstructura,classes);//this.empleadoestructuraLogic.getEmpleadoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura(),empleadoestructuraLogic.getEmpleadoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura(),this.empleadoestructuras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoEstructura.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoEstructura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoEstructura();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoEstructura() throws Exception {
		
		EmpleadoEstructuraModel empleadoestructuraModel=(EmpleadoEstructuraModel)this.jTableDatosEmpleadoEstructura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoestructuraModel.empleadoestructuras=this.empleadoestructuraLogic.getEmpleadoEstructuras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoestructuraModel.empleadoestructuras=this.empleadoestructuras;
		}
		
		
		((EmpleadoEstructuraModel) this.jTableDatosEmpleadoEstructura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoEstructura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoestructuraAnterior(),this.empleadoestructuraLogic.getEmpleadoEstructuras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoestructuraAnterior(),this.empleadoestructuras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoEstructura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoEstructura(EmpleadoEstructura empleadoestructura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
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
										
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoestructura,new Object(),generalEntityParameterGeneral,this.empleadoestructuraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoestructuraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoEstructuraConstantesFunciones.getClassesRelationshipsOfEmpleadoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoEstructuraConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoEstructura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoestructura,new Object(),generalEntityParameterGeneral,this.empleadoestructuraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoEstructura(EmpleadoEstructuraBean empleadoestructuraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEstructura(ArrayList<Classe> classes,EmpleadoEstructuraReturnGeneral empleadoestructuraReturnGeneral,EmpleadoEstructuraBean empleadoestructuraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoEstructura(EmpleadoEstructura empleadoestructura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoestructura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEstructura = new EmpleadoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.empleadoestructuraSessionBean.getConGuardarRelaciones(),this.empleadoestructuraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoEstructura.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.empleadoestructuraLogic=this.empleadoestructuraLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoEstructura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEstructura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEstructura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoEstructura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEstructura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEstructura"));
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEstructura"));

		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEstructura"));
					
		this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemModificarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEstructura"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEstructura"));
						
		this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemActualizarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEstructura"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEstructura"));
								
		this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemEliminarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEstructura"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEstructura"));
					
		this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemCancelarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEstructura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemDetalleCerrarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEstructura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonidEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraBusqueda"));
		//jButtonid_empleadoEmpleadoEstructura.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructura"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_salidaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"numero_reingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtondescripcionEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEstructuraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEstructura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoEstructura"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEstructura"));
		}
		
		this.jTableDatosEmpleadoEstructura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoEstructura"));
		
		this.jTableDatosEmpleadoEstructura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoEstructura"));
		
		this.jButtonNuevoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoEstructura"));
		
		this.jButtonDuplicarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoEstructura"));
		
		this.jButtonCopiarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoEstructura"));
		
		this.jButtonVerFormEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoEstructura"));
		
		
		this.jButtonNuevoToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoEstructura"));
			
		this.jButtonDuplicarToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoEstructura"));
			
		this.jMenuItemNuevoEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoEstructura"));
			
		this.jMenuItemDuplicarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoEstructura"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoEstructura"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoEstructura"));
			
		this.jMenuItemNuevoRelacionesEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonModificarToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEstructura"));
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemModificarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonActualizarToolBarEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEstructura"));
				
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemActualizarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonEliminarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEstructura"));
						
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemEliminarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonCancelarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEstructura"));
			
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemCancelarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEstructura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoEstructura"));		
		
		
		this.jButtonCerrarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoEstructura"));
		
		
		this.jButtonCerrarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoEstructura"));
			
		this.jMenuItemCerrarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoEstructura"));
			
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jMenuItemDetalleCerrarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEstructura"));
		}
		
		this.jButtonCopiarToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoEstructura"));
			
		this.jButtonVerFormToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoEstructura"));
		
		this.jMenuItemGuardarCambiosEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoEstructura"));
			
		this.jMenuItemCopiarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoEstructura"));		
		
		this.jMenuItemVerFormEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoEstructura"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEstructura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoEstructura"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEstructura"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoEstructura"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoEstructura"));
		
		this.jMenuItemRecargarInformacionEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoEstructura"));		
		
		
		
		this.jButtonAnterioresEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoEstructura"));
		
		
		this.jButtonAnterioresToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoEstructura"));
		
		this.jMenuItemAnterioresEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoEstructura"));		
		
		
		this.jButtonSiguientesEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoEstructura"));
		
		
		this.jButtonSiguientesToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoEstructura"));
			
		this.jMenuItemSiguientesEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoEstructura"));
			
		this.jMenuItemAbrirOrderByEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoEstructura"));
			
		this.jMenuItemMostrarOcultarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoEstructura"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoEstructura"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoEstructura"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoEstructura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoEstructura"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoEstructura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoEstructura"));

		this.jCheckBoxSeleccionadosEmpleadoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoEstructura"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEstructura"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoEstructura"));
			
		this.jComboBoxTiposAccionesEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoEstructura"));
					
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoEstructura"));
			
		this.jTextFieldValorCampoGeneralEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonidEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraBusqueda"));
		//jButtonid_empleadoEmpleadoEstructura.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructura"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_salidaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"numero_reingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtondescripcionEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEstructuraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCargoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdCargoEmpleadoEstructura"));

			this.jButtonFK_IdEmpleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEstructura"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructura"));

			this.jButtonFK_IdEstructuraEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoEstructura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEstructura!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEstructura"));
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEstructura"));
				this.jInternalFrameReporteDinamicoEmpleadoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEstructura"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEstructura"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEstructura"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEstructura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoEstructura!=null) {
				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEstructura"));
				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEstructura"));
				this.jInternalFrameImportacionEmpleadoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEstructura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoEstructura"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoEstructura"));			
			
			if(this.jInternalFrameOrderByEmpleadoEstructura!=null) {
				this.jInternalFrameOrderByEmpleadoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEstructura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEstructura.jTabbedPaneRelacionesEmpleadoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEstructura"));
		
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
            		closingInternalFrameEmpleadoEstructura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoEstructura = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEstructura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoEstructuraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoEstructura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoEstructura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoEstructura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoEstructura";
		inputMap = this.jButtonNuevoEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoEstructura";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEstructuraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoEstructura";
		inputMap = this.jButtonModificarEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoEstructura";
		inputMap = this.jButtonActualizarEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoEstructura";
		inputMap = this.jButtonEliminarEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoEstructura";
		inputMap = this.jButtonCancelarEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoEstructura";
		inputMap = this.jButtonCerrarEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoEstructura";
		inputMap = this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonGuardarCambiosEmpleadoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoEstructuraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonidEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empresaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_sucursalEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoEstructuraBusqueda"));
		//jButtonid_empleadoEmpleadoEstructura.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEstructuraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructura"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_estructuraEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_cargoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_ingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonfecha_salidaEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonnumero_reingresoEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"numero_reingresoEmpleadoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEstructura.jButtondescripcionEmpleadoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEstructuraBusqueda"));
		
		
		this.jButtonFK_IdCargoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdCargoEmpleadoEstructura"));

		this.jButtonFK_IdEmpleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEstructura"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEstructura"));

		this.jButtonFK_IdEstructuraEmpleadoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoEstructura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoEstructura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoEstructura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
					empleadoestructuraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuras) {
					empleadoestructuraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
						empleadoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuras) {
						empleadoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoEstructura.getSelectedRows();
			
			EmpleadoEstructura empleadoestructuraLocal=new EmpleadoEstructura();
			
			//this.seleccionarTodosEmpleadoEstructura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoestructuraLocal =(EmpleadoEstructura) this.empleadoestructuraLogic.getEmpleadoEstructuras().toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoestructuraLocal =(EmpleadoEstructura) this.empleadoestructuras.toArray()[this.jTableDatosEmpleadoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoestructuraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
						empleadoestructuraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuras) {
						empleadoestructuraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoEstructuraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoEstructuraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoEstructura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuraLogic.getEmpleadoEstructuras()) {
				
						if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							empleadoestructuraAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							empleadoestructuraAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO)) {
							existe=true;
							empleadoestructuraAux.setnumero_reingreso(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoestructuraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuras) {
					
						if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							empleadoestructuraAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							empleadoestructuraAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO)) {
							existe=true;
							empleadoestructuraAux.setnumero_reingreso(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoestructuraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoEstructuraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoEstructura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoEstructura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoEstructura) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoEstructura(conSplash);
				
					this.generarReporteEmpleadoEstructurasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEstructurasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEstructurasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEstructura();
				
				this.exportarEmpleadoEstructurasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoEstructuras();
				//this.importarEmpleadoEstructuras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEstructura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoEstructura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoEstructura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoEstructura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoEstructuraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoEstructura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoEstructura(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoEstructura();
						
						this.generarReporteProcesoAccionEmpleadoEstructurasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoEstructuraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado EstructuraS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoEstructura();
				
						this.actualizarParametrosGeneralEmpleadoEstructura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoestructuraReturnGeneral=empleadoestructuraLogic.procesarAccionEmpleadoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoestructuraLogic.getEmpleadoEstructuras(),this.empleadoestructuraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoEstructura();
					
					EmpleadoEstructuraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxTiposAccionesFormularioEmpleadoEstructura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoEstructura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoEstructuraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoEstructura();
			
			if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
			EmpleadoEstructura empleadoestructura=new EmpleadoEstructura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoEstructura.getSelectedItem();
			
			
			
			
			empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoestructurasSeleccionados.size()==1) {
				for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
					empleadoestructura=empleadoestructuraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoEstructura();
			
      		//this.finishProcessEmpleadoEstructura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoEstructuraReturnGeneral() throws Exception {
		if(this.empleadoestructuraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoestructuraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoestructuraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoestructuraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoEstructura(false);
		}
		
		if(this.empleadoestructuraReturnGeneral.getConRetornoLista() || this.empleadoestructuraReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoestructuraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoestructuraLogic.setEmpleadoEstructuras(this.empleadoestructuraReturnGeneral.getEmpleadoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoestructuraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoestructuraLogic.setEmpleadoEstructura(this.empleadoestructuraReturnGeneral.getEmpleadoEstructura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoEstructura(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoEstructura() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoEstructura> getEmpleadoEstructurasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoEstructura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoEstructura empleadoestructuraAux:empleadoestructuraLogic.getEmpleadoEstructuras()) {
					if(empleadoestructuraAux.getIsSelected()) {
						empleadoestructurasSeleccionados.add(empleadoestructuraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEstructura empleadoestructuraAux:this.empleadoestructuras) {
					if(empleadoestructuraAux.getIsSelected()) {
						empleadoestructurasSeleccionados.add(empleadoestructuraAux);				
					}
				}
			}
			
			if(empleadoestructurasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoestructurasSeleccionados.addAll(this.empleadoestructuraLogic.getEmpleadoEstructuras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoestructurasSeleccionados.addAll(this.empleadoestructuras);				
					}
				}
			}
		} else {
			empleadoestructurasSeleccionados.add(this.empleadoestructura);
		}
		
		return empleadoestructurasSeleccionados;
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
	
	public void generarReporteEmpleadoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEstructurasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEstructurasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoEstructurasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoEstructura();
		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoEstructura();
		
		
		//this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados ,empleadoestructuraImplementable,empleadoestructuraImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoEstructuras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoEstructura();
		
		this.abrirFrameImportacionEmpleadoEstructura();		
		
			
		//this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados ,empleadoestructuraImplementable,empleadoestructuraImplementableHome);
	}
	
	public void importarEmpleadoEstructuras() throws Exception {		
	
	}
	
	public void exportarEmpleadoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoEstructurasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoEstructurasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoEstructurasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoEstructura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoEstructura(empleadoestructuraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoestructuraAux.setsDetalleGeneralEntityReporte(empleadoestructuraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoEstructura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoEstructura(EmpleadoEstructura empleadoestructura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoestructura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getcargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getfecha_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getfecha_salida().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getnumero_reingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoestructura.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoEstructura(row);				
				iRow++;
			}				
			
			for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoEstructura(empleadoestructuraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoEstructurasSeleccionados() throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();		
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoestructura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoestructuras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoestructura");
			//elementRoot.appendChild(element);
		
			for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
				element = document.createElement("empleadoestructura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoEstructura(empleadoestructuraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoEstructura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoEstructura(EmpleadoEstructura empleadoestructura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getcargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getfecha_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getfecha_salida());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getnumero_reingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoestructura.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoEstructura(EmpleadoEstructura empleadoestructura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoEstructuraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoestructura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoEstructuraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoestructura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoestructura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(empleadoestructura.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoestructura.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(empleadoestructura.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcargo_descripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.IDCARGO);
		elementcargo_descripcion.appendChild(document.createTextNode(empleadoestructura.getcargo_descripcion()));
		element.appendChild(elementcargo_descripcion);

		Element elementfecha_ingreso = document.createElement(EmpleadoEstructuraConstantesFunciones.FECHAINGRESO);
		elementfecha_ingreso.appendChild(document.createTextNode(empleadoestructura.getfecha_ingreso().toString().trim()));
		element.appendChild(elementfecha_ingreso);

		Element elementfecha_salida = document.createElement(EmpleadoEstructuraConstantesFunciones.FECHASALIDA);
		elementfecha_salida.appendChild(document.createTextNode(empleadoestructura.getfecha_salida().toString().trim()));
		element.appendChild(elementfecha_salida);

		Element elementnumero_reingreso = document.createElement(EmpleadoEstructuraConstantesFunciones.NUMEROREINGRESO);
		elementnumero_reingreso.appendChild(document.createTextNode(empleadoestructura.getnumero_reingreso().toString().trim()));
		element.appendChild(elementnumero_reingreso);

		Element elementdescripcion = document.createElement(EmpleadoEstructuraConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empleadoestructura.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEmpleadoEstructurasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados=new ArrayList<EmpleadoEstructura>();
		
		empleadoestructurasSeleccionados=this.getEmpleadoEstructurasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoEstructura(empleadoestructurasSeleccionados);
		
		this.generarReporteEmpleadoEstructuras("Todos",empleadoestructurasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoEstructura(ArrayList<EmpleadoEstructura> empleadoestructurasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoEstructura empleadoestructuraAux:empleadoestructurasSeleccionados) {
				empleadoestructuraAux.setsDetalleGeneralEntityReporte(empleadoestructuraAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_IDCARGO)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getcargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHAINGRESO)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadoestructuraAux.getfecha_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_FECHASALIDA)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadoestructuraAux.getfecha_salida()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_NUMEROREINGRESO)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getnumero_reingreso().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEstructuraConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empleadoestructuraAux.setsDescripcionGeneralEntityReporte1(empleadoestructuraAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoEstructura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoEstructura=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=true;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=true;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=true;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=true;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=true;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
			this.isVisibilidadCeldaModificarEmpleadoEstructura=true;
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
			this.isVisibilidadCeldaCancelarEmpleadoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEstructura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoEstructura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoEstructura=false;
			//this.isVisibilidadCeldaVerFormEmpleadoEstructura=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoestructuraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoestructuraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;												
			}
			
			this.jButtonCerrarEmpleadoEstructura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEstructura=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoestructura)) {
			this.isVisibilidadCeldaActualizarEmpleadoEstructura=false;
			this.isVisibilidadCeldaEliminarEmpleadoEstructura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEstructura() {
	}
	
	public void actualizarEstadoPanelsEmpleadoEstructura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEstructura!=null) {
				this.jScrollPanelDatosEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEstructura!=null) {
				this.jPanelPaginacionEmpleadoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
					this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEstructura!=null) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoEstructura!=null) {
				this.jPanelParametrosReportesEmpleadoEstructura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCargo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdCargoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEmpleadoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEstructuraEmpleadoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCargo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdCargoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEmpleadoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEstructuraEmpleadoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdCargo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdCargoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEmpleadoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEstructuraEmpleadoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdCargo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdCargoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEmpleadoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEstructuraEmpleadoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaCargo(Boolean isParaCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoNegation=!isParaCargo;

			this.isVisibilidadFK_IdCargo=isParaCargo;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdCargoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEmpleado=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEmpleadoEmpleadoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoEstructura.remove(jPanelFK_IdEstructuraEmpleadoEstructura);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoEstructuraParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadoestructuraSessionBean==null) {
				empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadoestructuraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadoestructuraFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoEstructura(true);
			//empleadoSessionBean.setlidEmpleadoEstructuraActual(this.idEmpleadoEstructuraActual);

			empleadoestructuraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoEstructura(true);
			empleadoestructuraSessionBean.setlIdEmpleadoEstructuraActualForeignKey(this.idEmpleadoEstructuraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoEstructuraSessionBean empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		
		if(this.empleadoestructuraSessionBean==null) {
			this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		}
		
		this.empleadoestructuraSessionBean.setsUltimaBusquedaEmpleadoEstructura(this.getsAccionBusqueda());
		this.empleadoestructuraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoestructuraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
			empleadoestructuraSessionBean.setid_cargo(this.getid_cargoFK_IdCargo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoestructuraSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoestructuraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			empleadoestructuraSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			empleadoestructuraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoEstructuraSessionBean empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		
		if(this.empleadoestructuraSessionBean==null) {
			this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		}
		
		if(this.empleadoestructuraSessionBean.getsUltimaBusquedaEmpleadoEstructura()!=null&&!this.empleadoestructuraSessionBean.getsUltimaBusquedaEmpleadoEstructura().equals("")) {
			this.setsAccionBusqueda(empleadoestructuraSessionBean.getsUltimaBusquedaEmpleadoEstructura());
			this.setiNumeroPaginacion(empleadoestructuraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoestructuraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
				this.setid_cargoFK_IdCargo(empleadoestructuraSessionBean.getid_cargo());
				empleadoestructuraSessionBean.setid_cargo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoestructuraSessionBean.getid_empleado());
				empleadoestructuraSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoestructuraSessionBean.getid_empresa());
				empleadoestructuraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(empleadoestructuraSessionBean.getid_estructura());
				empleadoestructuraSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(empleadoestructuraSessionBean.getid_sucursal());
				empleadoestructuraSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.empleadoestructuraSessionBean.setsUltimaBusquedaEmpleadoEstructura("");
		this.empleadoestructuraSessionBean.setiNumeroPaginacion(EmpleadoEstructuraConstantesFunciones.INUMEROPAGINACION);
		this.empleadoestructuraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoEstructura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoEstructura() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoEstructura();
		this.updateVisibilidadBusquedasFormularioEmpleadoEstructura();
		this.updateHabilitarBusquedasFormularioEmpleadoEstructura();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoEstructura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoEstructura.getComponents().length>0) {
	

		if(this.empleadoestructuraConstantesFunciones.resaltarFK_IdCargoEmpleadoEstructura!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdCargoEmpleadoEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdCargoEmpleadoEstructura);
			}
		}

		if(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEstructura!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEstructura);
			}
		}

		if(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEstructuraEmpleadoEstructura!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEstructuraEmpleadoEstructura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoEstructura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdCargoEmpleadoEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoestructuraConstantesFunciones.mostrarFK_IdCargoEmpleadoEstructura);
			if(!this.empleadoestructuraConstantesFunciones.mostrarFK_IdCargoEmpleadoEstructura && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoestructuraConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEstructura);
			if(!this.empleadoestructuraConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEstructura && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoestructuraConstantesFunciones.mostrarFK_IdEstructuraEmpleadoEstructura);
			if(!this.empleadoestructuraConstantesFunciones.mostrarFK_IdEstructuraEmpleadoEstructura && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEstructura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoEstructura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdCargoEmpleadoEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoestructuraConstantesFunciones.activarFK_IdCargoEmpleadoEstructura);
				this.jTabbedPaneBusquedasEmpleadoEstructura.setEnabledAt(index,this.empleadoestructuraConstantesFunciones.activarFK_IdCargoEmpleadoEstructura);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoestructuraConstantesFunciones.activarFK_IdEmpleadoEmpleadoEstructura);
				this.jTabbedPaneBusquedasEmpleadoEstructura.setEnabledAt(index,this.empleadoestructuraConstantesFunciones.activarFK_IdEmpleadoEmpleadoEstructura);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoestructuraConstantesFunciones.activarFK_IdEstructuraEmpleadoEstructura);
				this.jTabbedPaneBusquedasEmpleadoEstructura.setEnabledAt(index,this.empleadoestructuraConstantesFunciones.activarFK_IdEstructuraEmpleadoEstructura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoEstructura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCargo")) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdCargoEmpleadoEstructura);

			this.jTabbedPaneBusquedasEmpleadoEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);

			this.empleadoestructuraConstantesFunciones.setResaltarFK_IdCargoEmpleadoEstructura(resaltar);

			jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdCargoEmpleadoEstructura);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEstructura);

			this.jTabbedPaneBusquedasEmpleadoEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);

			this.empleadoestructuraConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoEstructura(resaltar);

			jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEstructura);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasEmpleadoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoEstructura);

			this.jTabbedPaneBusquedasEmpleadoEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEstructura.getComponent(index);

			this.empleadoestructuraConstantesFunciones.setResaltarFK_IdEstructuraEmpleadoEstructura(resaltar);

			jPanel.setBorder(this.empleadoestructuraConstantesFunciones.resaltarFK_IdEstructuraEmpleadoEstructura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoEstructura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoEstructura() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoEstructura();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoEstructura();
		this.updateHabilitarResaltarControlesFormularioEmpleadoEstructura();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoestructuraConstantesFunciones.resaltaridEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltaridEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarid_empresaEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarid_empresaEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarid_sucursalEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarid_sucursalEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarid_empleadoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarid_empleadoEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarid_estructuraEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarid_estructuraEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarid_cargoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarid_cargoEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarfecha_ingresoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarfecha_ingresoEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarfecha_salidaEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarfecha_salidaEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltarnumero_reingresoEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltarnumero_reingresoEmpleadoEstructura);}
		if(this.empleadoestructuraConstantesFunciones.resaltardescripcionEmpleadoEstructura!=null && this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setBorder(this.empleadoestructuraConstantesFunciones.resaltardescripcionEmpleadoEstructura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoEstructura() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostraridEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelidEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostraridEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_empresaEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelid_empresaEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_empresaEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_sucursalEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelid_sucursalEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_sucursalEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_empleadoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelid_empleadoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_empleadoEmpleadoEstructura);
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_empleadoEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_estructuraEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelid_estructuraEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_estructuraEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_cargoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelid_cargoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarid_cargoEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarfecha_ingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelfecha_ingresoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarfecha_ingresoEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarfecha_salidaEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelfecha_salidaEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarfecha_salidaEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarnumero_reingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPanelnumero_reingresoEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrarnumero_reingresoEmpleadoEstructura);
		//this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrardescripcionEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jPaneldescripcionEmpleadoEstructura.setVisible(this.empleadoestructuraConstantesFunciones.mostrardescripcionEmpleadoEstructura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEstructura!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoEstructura.jLabelidEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activaridEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empresaEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_empresaEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_sucursalEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_sucursalEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_empleadoEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_empleadoEmpleadoEstructura);
			this.jInternalFrameDetalleFormEmpleadoEstructura.jButtonid_empleadoEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_empleadoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_estructuraEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_estructuraEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jComboBoxid_cargoEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarid_cargoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_ingresoEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarfecha_ingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jDateChooserfecha_salidaEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarfecha_salidaEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jTextFieldnumero_reingresoEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activarnumero_reingresoEmpleadoEstructura);
		this.jInternalFrameDetalleFormEmpleadoEstructura.jTextAreadescripcionEmpleadoEstructura.setEnabled(this.empleadoestructuraConstantesFunciones.activardescripcionEmpleadoEstructura);
		}
	}
	
		
}