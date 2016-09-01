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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.ResponsableActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.ResponsableActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.ResponsableActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.ResponsableActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class ResponsableActivoFijoBeanSwingJInternalFrame extends ResponsableActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResponsableActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ResponsableActivoFijo> responsableactivofijoValidator = new ClassValidator<ResponsableActivoFijo>(ResponsableActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ResponsableActivoFijo responsableactivofijo;	
	public ResponsableActivoFijo responsableactivofijoAux;
	public ResponsableActivoFijo responsableactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ResponsableActivoFijo responsableactivofijoTotales;
	public Long idResponsableActivoFijoActual;
	public Long iIdNuevoResponsableActivoFijo=0L;
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

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
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
	
	public Boolean isPermisoTodoResponsableActivoFijo;
	public Boolean isPermisoNuevoResponsableActivoFijo;
	public Boolean isPermisoActualizarResponsableActivoFijo;
	public Boolean isPermisoActualizarOriginalResponsableActivoFijo;
	public Boolean isPermisoEliminarResponsableActivoFijo;
	public Boolean isPermisoGuardarCambiosResponsableActivoFijo;
	public Boolean isPermisoConsultaResponsableActivoFijo;
	public Boolean isPermisoBusquedaResponsableActivoFijo;
	public Boolean isPermisoReporteResponsableActivoFijo;
	public Boolean isPermisoPaginacionMedioResponsableActivoFijo;
	public Boolean isPermisoPaginacionAltoResponsableActivoFijo;
	public Boolean isPermisoPaginacionTodoResponsableActivoFijo;
	public Boolean isPermisoCopiarResponsableActivoFijo;
	public Boolean isPermisoVerFormResponsableActivoFijo;
	public Boolean isPermisoDuplicarResponsableActivoFijo;
	public Boolean isPermisoOrdenResponsableActivoFijo;
	
	
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
	
	public ResponsableActivoFijoParameterReturnGeneral responsableactivofijoReturnGeneral;
	public ResponsableActivoFijoParameterReturnGeneral responsableactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResponsableActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioResponsableActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResponsableActivoFijoSessionBeanAdditional responsableactivofijoSessionBeanAdditional=null;
	
	public ResponsableActivoFijoSessionBeanAdditional getResponsableActivoFijoSessionBeanAdditional() {
		return this.responsableactivofijoSessionBeanAdditional;
	}
	
	public void setResponsableActivoFijoSessionBeanAdditional(ResponsableActivoFijoSessionBeanAdditional responsableactivofijoSessionBeanAdditional) {
		try {
			this.responsableactivofijoSessionBeanAdditional=responsableactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResponsableActivoFijoBeanSwingJInternalFrameAdditional responsableactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class ResponsableActivoFijoBeanSwingJInternalFrame
	
	public ResponsableActivoFijoBeanSwingJInternalFrameAdditional getResponsableActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.responsableactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setResponsableActivoFijoBeanSwingJInternalFrameAdditional(ResponsableActivoFijoBeanSwingJInternalFrameAdditional responsableactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.responsableactivofijoBeanSwingJInternalFrameAdditional=responsableactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResponsableActivoFijoLogic responsableactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ResponsableActivoFijo responsableactivofijoBean;
	public ResponsableActivoFijoConstantesFunciones responsableactivofijoConstantesFunciones;
	//public ResponsableActivoFijoParameterReturnGeneral responsableactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<ResponsableActivoFijo> responsableactivofijos;	
	//public List<ResponsableActivoFijo> responsableactivofijosEliminados;
	//public List<ResponsableActivoFijo> responsableactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarResponsableActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarResponsableActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormResponsableActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenResponsableActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarResponsableActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarResponsableActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoResponsableActivoFijo() {
		return this.iIdNuevoResponsableActivoFijo;
	}

	public void setiIdNuevoResponsableActivoFijo(Long iIdNuevoResponsableActivoFijo) {
		this.iIdNuevoResponsableActivoFijo = iIdNuevoResponsableActivoFijo;
	}
	
	public Long getidResponsableActivoFijoActual() {
		return this.idResponsableActivoFijoActual;
	}

	public void setidResponsableActivoFijoActual(Long idResponsableActivoFijoActual) {
		this.idResponsableActivoFijoActual = idResponsableActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ResponsableActivoFijo getresponsableactivofijo() {
		return this.responsableactivofijo;
	}

	public void setresponsableactivofijo(ResponsableActivoFijo responsableactivofijo) {
		this.responsableactivofijo = responsableactivofijo;
	}
	
	public ResponsableActivoFijo getresponsableactivofijoAux() {
		return this.responsableactivofijoAux;
	}

	public void setresponsableactivofijoAux(ResponsableActivoFijo responsableactivofijoAux) {
		this.responsableactivofijoAux = responsableactivofijoAux;
	}				
	
	public ResponsableActivoFijo getresponsableactivofijoAnterior() {
		return this.responsableactivofijoAnterior;
	}

	public void setresponsableactivofijoAnterior(ResponsableActivoFijo responsableactivofijoAnterior) {
		this.responsableactivofijoAnterior = responsableactivofijoAnterior;
	}	
	
	public ResponsableActivoFijo getresponsableactivofijoTotales() {
		return this.responsableactivofijoTotales;
	}

	public void setresponsableactivofijoTotales(ResponsableActivoFijo responsableactivofijoTotales) {
		this.responsableactivofijoTotales = responsableactivofijoTotales;
	}	
	
	public ResponsableActivoFijo getresponsableactivofijoBean() {
		return this.responsableactivofijoBean;
	}

	public void setresponsableactivofijoBean(ResponsableActivoFijo responsableactivofijoBean) {
		this.responsableactivofijoBean = responsableactivofijoBean;
	}	
	
	public ResponsableActivoFijoParameterReturnGeneral getresponsableactivofijoReturnGeneral() {
		return this.responsableactivofijoReturnGeneral;
	}

	public void setresponsableactivofijoReturnGeneral(ResponsableActivoFijoParameterReturnGeneral responsableactivofijoReturnGeneral) {
		this.responsableactivofijoReturnGeneral = responsableactivofijoReturnGeneral;
	}	
	
	
	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
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
	
	
	public ResponsableActivoFijoLogic getResponsableActivoFijoLogic()	{		
		return responsableactivofijoLogic;
	}

	public void setResponsableActivoFijoLogic(ResponsableActivoFijoLogic responsableactivofijoLogic) {
		this.responsableactivofijoLogic = responsableactivofijoLogic;
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
	
	public Boolean getIsEsNuevoResponsableActivoFijo() {
		return isEsNuevoResponsableActivoFijo;
	}

	public void setIsEsNuevoResponsableActivoFijo(Boolean isEsNuevoResponsableActivoFijo) {
		this.isEsNuevoResponsableActivoFijo = isEsNuevoResponsableActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioResponsableActivoFijo() {
		return esParaAccionDesdeFormularioResponsableActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioResponsableActivoFijo(Boolean esParaAccionDesdeFormularioResponsableActivoFijo) {
		this.esParaAccionDesdeFormularioResponsableActivoFijo = esParaAccionDesdeFormularioResponsableActivoFijo;
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

			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(responsableactivofijoSessionBean.getlidEmpresaActual());
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

			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(responsableactivofijoSessionBean.getlidSucursalActual());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(responsableactivofijoSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(responsableactivofijoSessionBean.getlidEstructuraActual());
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

			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(responsableactivofijoSessionBean.getlidEmpleadoActual());
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

					if(this.responsableactivofijo!=null) {
						this.responsableactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaResponsableActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaResponsableActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaResponsableActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaResponsableActivoFijoGenerico!=null && jComboBoxid_empresaResponsableActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaResponsableActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.responsableactivofijo!=null) {
						this.responsableactivofijo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalResponsableActivoFijo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalResponsableActivoFijoGenerico)throws Exception
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
				jComboBoxid_sucursalResponsableActivoFijoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalResponsableActivoFijoGenerico!=null && jComboBoxid_sucursalResponsableActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalResponsableActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.responsableactivofijo!=null) {
						this.responsableactivofijo.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico!=null && jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.responsableactivofijo!=null) {
						this.responsableactivofijo.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraResponsableActivoFijo.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo!=null) {
						jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraResponsableActivoFijoGenerico)throws Exception
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
				jComboBoxid_estructuraResponsableActivoFijoGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraResponsableActivoFijoGenerico!=null && jComboBoxid_estructuraResponsableActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_estructuraResponsableActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.responsableactivofijo!=null) {
						this.responsableactivofijo.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoResponsableActivoFijo.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoResponsableActivoFijoGenerico)throws Exception
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
				jComboBoxid_empleadoResponsableActivoFijoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoResponsableActivoFijoGenerico!=null && jComboBoxid_empleadoResponsableActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoResponsableActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ResponsableActivoFijo responsableactivofijo,JComboBox jComboBoxid_empresaResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaResponsableActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaResponsableActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				responsableactivofijo.setid_empresa(empresaAux.getId());
				responsableactivofijo.setempresa_descripcion(ResponsableActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				responsableactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ResponsableActivoFijo responsableactivofijo,JComboBox jComboBoxid_sucursalResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalResponsableActivoFijoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalResponsableActivoFijoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				responsableactivofijo.setid_sucursal(sucursalAux.getId());
				responsableactivofijo.setsucursal_descripcion(ResponsableActivoFijoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				responsableactivofijo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(ResponsableActivoFijo responsableactivofijo,JComboBox jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoResponsableActivoFijoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				responsableactivofijo.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				responsableactivofijo.setdetalleactivofijo_descripcion(ResponsableActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				responsableactivofijo.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(ResponsableActivoFijo responsableactivofijo,JComboBox jComboBoxid_estructuraResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraResponsableActivoFijoGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraResponsableActivoFijoGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				responsableactivofijo.setid_estructura(estructuraAux.getId());
				responsableactivofijo.setestructura_descripcion(ResponsableActivoFijoConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				responsableactivofijo.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ResponsableActivoFijo responsableactivofijo,JComboBox jComboBoxid_empleadoResponsableActivoFijoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoResponsableActivoFijoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoResponsableActivoFijoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				responsableactivofijo.setid_empleado(empleadoAux.getId());
				responsableactivofijo.setempleado_descripcion(ResponsableActivoFijoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				responsableactivofijo.setEmpleado(empleadoAux);			}
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

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
					}

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
					}

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
					}

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.addItem(detalleactivofijo);
							}
						}

						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
					}

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.addItem(estructura);
							}
						}

						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { 
					}

					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.addItem(empleado);
							}
						}

						if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesResponsableActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ResponsableActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesResponsableActivoFijo(this.responsableactivofijoLogic.getResponsableActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ResponsableActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesResponsableActivoFijo(this.responsableactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//responsableactivofijoLogic.setResponsableActivoFijos(this.responsableactivofijos);
			responsableactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ResponsableActivoFijoParameterReturnGeneral getResponsableActivoFijoParameterGeneral() {
		return this.responsableactivofijoParameterGeneral;
	}
	
	public void setResponsableActivoFijoParameterGeneral(ResponsableActivoFijoParameterReturnGeneral responsableactivofijoParameterGeneral) {
		this.responsableactivofijoParameterGeneral = responsableactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResponsableActivoFijo() {
		return isPermisoTodoResponsableActivoFijo;
	}

	public void setIsPermisoTodoResponsableActivoFijo(Boolean isPermisoTodoResponsableActivoFijo) {
		this.isPermisoTodoResponsableActivoFijo = isPermisoTodoResponsableActivoFijo;
	}

	public Boolean getIsPermisoNuevoResponsableActivoFijo() {
		return isPermisoNuevoResponsableActivoFijo;
	}

	public void setIsPermisoNuevoResponsableActivoFijo(Boolean isPermisoNuevoResponsableActivoFijo) {
		this.isPermisoNuevoResponsableActivoFijo = isPermisoNuevoResponsableActivoFijo;
	}

	public Boolean getIsPermisoActualizarResponsableActivoFijo() {
		return isPermisoActualizarResponsableActivoFijo;
	}

	public void setIsPermisoActualizarResponsableActivoFijo(Boolean isPermisoActualizarResponsableActivoFijo) {
		this.isPermisoActualizarResponsableActivoFijo = isPermisoActualizarResponsableActivoFijo;
	}

	public Boolean getIsPermisoEliminarResponsableActivoFijo() {
		return isPermisoEliminarResponsableActivoFijo;
	}

	public void setIsPermisoEliminarResponsableActivoFijo(Boolean isPermisoEliminarResponsableActivoFijo) {
		this.isPermisoEliminarResponsableActivoFijo = isPermisoEliminarResponsableActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosResponsableActivoFijo() {
		return isPermisoGuardarCambiosResponsableActivoFijo;
	}

	public void setIsPermisoGuardarCambiosResponsableActivoFijo(Boolean isPermisoGuardarCambiosResponsableActivoFijo) {
		this.isPermisoGuardarCambiosResponsableActivoFijo = isPermisoGuardarCambiosResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaResponsableActivoFijo() {
		return isPermisoConsultaResponsableActivoFijo;
	}

	public void setIsPermisoConsultaResponsableActivoFijo(Boolean isPermisoConsultaResponsableActivoFijo) {
		this.isPermisoConsultaResponsableActivoFijo = isPermisoConsultaResponsableActivoFijo;
	}

	public Boolean getIsPermisoBusquedaResponsableActivoFijo() {
		return isPermisoBusquedaResponsableActivoFijo;
	}

	public void setIsPermisoBusquedaResponsableActivoFijo(Boolean isPermisoBusquedaResponsableActivoFijo) {
		this.isPermisoBusquedaResponsableActivoFijo = isPermisoBusquedaResponsableActivoFijo;
	}

	public Boolean getIsPermisoReporteResponsableActivoFijo() {
		return isPermisoReporteResponsableActivoFijo;
	}

	public void setIsPermisoReporteResponsableActivoFijo(Boolean isPermisoReporteResponsableActivoFijo) {
		this.isPermisoReporteResponsableActivoFijo = isPermisoReporteResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioResponsableActivoFijo() {
		return isPermisoPaginacionMedioResponsableActivoFijo;
	}

	public void setIsPermisoPaginacionMedioResponsableActivoFijo(Boolean isPermisoPaginacionMedioResponsableActivoFijo) {
		this.isPermisoPaginacionMedioResponsableActivoFijo = isPermisoPaginacionMedioResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoResponsableActivoFijo() {
		return isPermisoPaginacionTodoResponsableActivoFijo;
	}

	public void setIsPermisoPaginacionTodoResponsableActivoFijo(Boolean isPermisoPaginacionTodoResponsableActivoFijo) {
		this.isPermisoPaginacionTodoResponsableActivoFijo = isPermisoPaginacionTodoResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoResponsableActivoFijo() {
		return isPermisoPaginacionAltoResponsableActivoFijo;
	}

	public void setIsPermisoPaginacionAltoResponsableActivoFijo(Boolean isPermisoPaginacionAltoResponsableActivoFijo) {
		this.isPermisoPaginacionAltoResponsableActivoFijo = isPermisoPaginacionAltoResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarResponsableActivoFijo() {
		return isPermisoCopiarResponsableActivoFijo;
	}

	public void setIsPermisoCopiarResponsableActivoFijo(Boolean isPermisoCopiarResponsableActivoFijo) {
		this.isPermisoCopiarResponsableActivoFijo = isPermisoCopiarResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormResponsableActivoFijo() {
		return isPermisoVerFormResponsableActivoFijo;
	}

	public void setIsPermisoVerFormResponsableActivoFijo(Boolean isPermisoVerFormResponsableActivoFijo) {
		this.isPermisoVerFormResponsableActivoFijo = isPermisoVerFormResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarResponsableActivoFijo() {
		return isPermisoDuplicarResponsableActivoFijo;
	}

	public void setIsPermisoDuplicarResponsableActivoFijo(Boolean isPermisoDuplicarResponsableActivoFijo) {
		this.isPermisoDuplicarResponsableActivoFijo = isPermisoDuplicarResponsableActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenResponsableActivoFijo() {
		return isPermisoOrdenResponsableActivoFijo;
	}

	public void setIsPermisoOrdenResponsableActivoFijo(Boolean isPermisoOrdenResponsableActivoFijo) {
		this.isPermisoOrdenResponsableActivoFijo = isPermisoOrdenResponsableActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResponsableActivoFijo() {
		return isVisibilidadCeldaNuevoResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoResponsableActivoFijo(Boolean isVisibilidadCeldaNuevoResponsableActivoFijo) {
		this.isVisibilidadCeldaNuevoResponsableActivoFijo = isVisibilidadCeldaNuevoResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResponsableActivoFijo() {
		return isVisibilidadCeldaDuplicarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarResponsableActivoFijo(Boolean isVisibilidadCeldaDuplicarResponsableActivoFijo) {
		this.isVisibilidadCeldaDuplicarResponsableActivoFijo = isVisibilidadCeldaDuplicarResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResponsableActivoFijo() {
		return isVisibilidadCeldaCopiarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarResponsableActivoFijo(Boolean isVisibilidadCeldaCopiarResponsableActivoFijo) {
		this.isVisibilidadCeldaCopiarResponsableActivoFijo = isVisibilidadCeldaCopiarResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResponsableActivoFijo() {
		return isVisibilidadCeldaVerFormResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormResponsableActivoFijo(Boolean isVisibilidadCeldaVerFormResponsableActivoFijo) {
		this.isVisibilidadCeldaVerFormResponsableActivoFijo = isVisibilidadCeldaVerFormResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResponsableActivoFijo() {
		return isVisibilidadCeldaOrdenResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenResponsableActivoFijo(Boolean isVisibilidadCeldaOrdenResponsableActivoFijo) {
		this.isVisibilidadCeldaOrdenResponsableActivoFijo = isVisibilidadCeldaOrdenResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResponsableActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResponsableActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo = isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResponsableActivoFijo() {
		return isVisibilidadCeldaModificarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarResponsableActivoFijo(Boolean isVisibilidadCeldaModificarResponsableActivoFijo) {
		this.isVisibilidadCeldaModificarResponsableActivoFijo = isVisibilidadCeldaModificarResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResponsableActivoFijo() {
		return isVisibilidadCeldaActualizarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarResponsableActivoFijo(Boolean isVisibilidadCeldaActualizarResponsableActivoFijo) {
		this.isVisibilidadCeldaActualizarResponsableActivoFijo = isVisibilidadCeldaActualizarResponsableActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarResponsableActivoFijo() {
		return isVisibilidadCeldaEliminarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarResponsableActivoFijo(Boolean isVisibilidadCeldaEliminarResponsableActivoFijo) {
		this.isVisibilidadCeldaEliminarResponsableActivoFijo = isVisibilidadCeldaEliminarResponsableActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarResponsableActivoFijo() {
		return isVisibilidadCeldaCancelarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarResponsableActivoFijo(Boolean isVisibilidadCeldaCancelarResponsableActivoFijo) {
		this.isVisibilidadCeldaCancelarResponsableActivoFijo = isVisibilidadCeldaCancelarResponsableActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarResponsableActivoFijo() {
		return isVisibilidadCeldaGuardarResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarResponsableActivoFijo(Boolean isVisibilidadCeldaGuardarResponsableActivoFijo) {
		this.isVisibilidadCeldaGuardarResponsableActivoFijo = isVisibilidadCeldaGuardarResponsableActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResponsableActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosResponsableActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResponsableActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosResponsableActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo = isVisibilidadCeldaGuardarCambiosResponsableActivoFijo;
	}
		
	public ResponsableActivoFijoSessionBean getresponsableactivofijoSessionBean() {
		return this.responsableactivofijoSessionBean;
	}
	
	public void setresponsableactivofijoSessionBean(ResponsableActivoFijoSessionBean responsableactivofijoSessionBean) {
		this.responsableactivofijoSessionBean=responsableactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(responsableactivofijo,null);
				this.setActualParaGuardarSucursalForeignKey(responsableactivofijo,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(responsableactivofijo,null);
				this.setActualParaGuardarEstructuraForeignKey(responsableactivofijo,null);
				this.setActualParaGuardarEmpleadoForeignKey(responsableactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(ResponsableActivoFijo responsableactivofijo,ResponsableActivoFijo responsableactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResponsableActivoFijo(responsableactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		responsableactivofijoAux.setId(responsableactivofijo.getId());
		responsableactivofijoAux.setVersionRow(responsableactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessResponsableActivoFijo();
		
			int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = responsableactivofijoValidator.getInvalidValues(this.responsableactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			responsableactivofijoLogic.setDatosCliente(datosCliente);
			responsableactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				responsableactivofijoAux=new  ResponsableActivoFijo();
				
				responsableactivofijoAux.setIsNew(true);
				responsableactivofijoAux.setIsChanged(true);
				
				responsableactivofijoAux.setResponsableActivoFijoOriginal(this.responsableactivofijo);
				
				responsableactivofijoAux.setId(this.responsableactivofijo.getId());	
				responsableactivofijoAux.setVersionRow(this.responsableactivofijo.getVersionRow());	
				responsableactivofijoAux.setid_empresa(this.responsableactivofijo.getid_empresa());	
				responsableactivofijoAux.setid_sucursal(this.responsableactivofijo.getid_sucursal());	
				responsableactivofijoAux.setid_detalle_activo_fijo(this.responsableactivofijo.getid_detalle_activo_fijo());	
				responsableactivofijoAux.setid_estructura(this.responsableactivofijo.getid_estructura());	
				responsableactivofijoAux.setid_empleado(this.responsableactivofijo.getid_empleado());	
				responsableactivofijoAux.setubicacion(this.responsableactivofijo.getubicacion());	
				responsableactivofijoAux.setfecha(this.responsableactivofijo.getfecha());	
				responsableactivofijoAux.setdescripcion(this.responsableactivofijo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableactivofijoAux,responsableactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.saveResponsableActivoFijos();//WithConnection
						//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesResponsableActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableactivofijoLogic.saveResponsableActivoFijoRelaciones(responsableactivofijoAux);//WithConnection
								//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsableactivofijoAux,responsableactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				responsableactivofijoAux=new  ResponsableActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.responsableactivofijoSessionBean.getEsGuardarRelacionado() && this.responsableactivofijo.getId()>=0)) {
						
					responsableactivofijoAux.setIsNew(false);
				}
				
				responsableactivofijoAux.setIsDeleted(false);
			
				responsableactivofijoAux.setId(this.responsableactivofijo.getId());	
				responsableactivofijoAux.setVersionRow(this.responsableactivofijo.getVersionRow());	
				responsableactivofijoAux.setid_empresa(this.responsableactivofijo.getid_empresa());	
				responsableactivofijoAux.setid_sucursal(this.responsableactivofijo.getid_sucursal());	
				responsableactivofijoAux.setid_detalle_activo_fijo(this.responsableactivofijo.getid_detalle_activo_fijo());	
				responsableactivofijoAux.setid_estructura(this.responsableactivofijo.getid_estructura());	
				responsableactivofijoAux.setid_empleado(this.responsableactivofijo.getid_empleado());	
				responsableactivofijoAux.setubicacion(this.responsableactivofijo.getubicacion());	
				responsableactivofijoAux.setfecha(this.responsableactivofijo.getfecha());	
				responsableactivofijoAux.setdescripcion(this.responsableactivofijo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableactivofijoAux,responsableactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.saveResponsableActivoFijos();//WithConnection
						//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesResponsableActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableactivofijoLogic.saveResponsableActivoFijoRelaciones(responsableactivofijoAux);//WithConnection
								//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsableactivofijoAux,responsableactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsableactivofijo,responsableactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				responsableactivofijoAux=new  ResponsableActivoFijo();
				
				responsableactivofijoAux.setIsNew(false);
				responsableactivofijoAux.setIsChanged(false);
				
				responsableactivofijoAux.setIsDeleted(true);
				
				responsableactivofijoAux.setId(this.responsableactivofijo.getId());	
				responsableactivofijoAux.setVersionRow(this.responsableactivofijo.getVersionRow());	
				responsableactivofijoAux.setid_empresa(this.responsableactivofijo.getid_empresa());	
				responsableactivofijoAux.setid_sucursal(this.responsableactivofijo.getid_sucursal());	
				responsableactivofijoAux.setid_detalle_activo_fijo(this.responsableactivofijo.getid_detalle_activo_fijo());	
				responsableactivofijoAux.setid_estructura(this.responsableactivofijo.getid_estructura());	
				responsableactivofijoAux.setid_empleado(this.responsableactivofijo.getid_empleado());	
				responsableactivofijoAux.setubicacion(this.responsableactivofijo.getubicacion());	
				responsableactivofijoAux.setfecha(this.responsableactivofijo.getfecha());	
				responsableactivofijoAux.setdescripcion(this.responsableactivofijo.getdescripcion());	
				
				if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.responsableactivofijoAux.getId()>=0) {	
						this.responsableactivofijosEliminados.add(responsableactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableactivofijoAux,responsableactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.saveResponsableActivoFijos();//WithConnection
						//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsableactivofijoLogic.saveResponsableActivoFijoRelaciones(responsableactivofijoAux);//WithConnection
								//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
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
							if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(responsableactivofijoAux,responsableactivofijoLogic.getResponsableActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(responsableactivofijoAux,responsableactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getResponsableActivoFijos().addAll(this.responsableactivofijosEliminados);
					
					responsableactivofijoLogic.saveResponsableActivoFijos();//WithConnection
					//responsableactivofijoLogic.getSetVersionRowResponsableActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesResponsableActivoFijo();
				
				this.responsableactivofijosEliminados= new ArrayList<ResponsableActivoFijo>();		
			}
			
			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Responsable Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.responsableactivofijo=responsableactivofijoAux;
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
      		//this.finishProcessResponsableActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(ResponsableActivoFijo responsableactivofijoLocal) throws Exception {
		
		if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ResponsableActivoFijo responsableactivofijoLocal) throws Exception {	
		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				responsableactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				responsableactivofijoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				responsableactivofijoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				responsableactivofijoLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				responsableactivofijoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResponsableActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = responsableactivofijoValidator.getInvalidValues(this.responsableactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ResponsableActivoFijo responsableactivofijo,List<ResponsableActivoFijo> responsableactivofijos) throws Exception {
		try	{		
			ResponsableActivoFijoConstantesFunciones.actualizarLista(responsableactivofijo,responsableactivofijos,this.responsableactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ResponsableActivoFijo responsableactivofijo,List<ResponsableActivoFijo> responsableactivofijos) throws Exception {
		try	{			
			ResponsableActivoFijoConstantesFunciones.actualizarSelectedLista(responsableactivofijo,responsableactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ResponsableActivoFijo> responsableactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				responsableactivofijosLocal=this.responsableactivofijoLogic.getResponsableActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				responsableactivofijosLocal=this.responsableactivofijos;
			}
			//ARCHITECTURE
		
			for(ResponsableActivoFijo responsableactivofijoLocal:responsableactivofijosLocal) {
				if(this.permiteMantenimiento(responsableactivofijoLocal) && responsableactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResponsableActivoFijoConstantesFunciones.getResponsableActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_empresaResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_sucursalResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_detalle_activo_fijoResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_estructuraResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_empleadoResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.UBICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelubicacionResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelfechaResponsableActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableActivoFijoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabeldescripcionResponsableActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_empresaResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_sucursalResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_detalle_activo_fijoResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_estructuraResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelid_empleadoResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelubicacionResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelfechaResponsableActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabeldescripcionResponsableActivoFijo,"");
		
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
		this.iIdNuevoResponsableActivoFijo--;	
		
		
		this.responsableactivofijoAux=new ResponsableActivoFijo();
		
		this.responsableactivofijoAux.setId(this.iIdNuevoResponsableActivoFijo);
		this.responsableactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsableactivofijoLogic.getResponsableActivoFijos().add(this.responsableactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.responsableactivofijos.add(this.responsableactivofijoAux);
		}
		//ARCHITECTURE
		
		this.responsableactivofijo=this.responsableactivofijoAux;
		
		if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyResponsableActivoFijo(this.responsableactivofijo);
		}
				
		//this.setDefaultControlesResponsableActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResponsableActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResponsableActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsableActivoFijo(this.responsableactivofijoBean,this.responsableactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=ResponsableActivoFijoConstantesFunciones.getClassesRelationshipsOfResponsableActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.responsableactivofijoReturnGeneral=responsableactivofijoLogic.procesarEventosResponsableActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsableactivofijoLogic.getResponsableActivoFijos(),this.responsableactivofijo,this.responsableactivofijoParameterGeneral,this.isEsNuevoResponsableActivoFijo,classes);//this.responsableactivofijoLogic.getResponsableActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResponsableActivoFijo(this.responsableactivofijoReturnGeneral,this.responsableactivofijoBean,false);
		
		if(this.responsableactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo());
		}
		
		if(this.responsableactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo(),classes);//this.responsableactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResponsableActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResponsableActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormResponsableActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResponsableActivoFijo(false);
						
			if(responsableactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableActivoFijo();
			}
			
			this.actualizarVisualTableDatosResponsableActivoFijo();
			
			this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(this.getIndiceNuevoResponsableActivoFijo(), this.getIndiceNuevoResponsableActivoFijo());
			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesResponsableActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResponsableActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarubicacionResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarfechaResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activardescripcionResponsableActivoFijo);	
		//
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarid_empresaResponsableActivoFijo);//
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarid_sucursalResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarid_detalle_activo_fijoResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarid_estructuraResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setEnabled(isHabilitar && this.responsableactivofijoConstantesFunciones.activarid_empleadoResponsableActivoFijo);
	};
	
	public void setDefaultControlesResponsableActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResponsableActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.responsableactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.responsableactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.setVisible(true);
			
					
		} else {
			//this.responsableactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.responsableactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoResponsableActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
				if(responsableactivofijoAux.getId().equals(this.iIdNuevoResponsableActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijos) {
				if(responsableactivofijoAux.getId().equals(this.iIdNuevoResponsableActivoFijo)) {
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
	
	public int getIndiceActualResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
				if(responsableactivofijoAux.getId().equals(responsableactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijos) {
				if(responsableactivofijoAux.getId().equals(responsableactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResponsableActivoFijo(ResponsableActivoFijo responsableactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
				if(responsableactivofijoAux.getResponsableActivoFijoOriginal().getId().equals(responsableactivofijoOriginal.getId())) {
					existe=true;
					responsableactivofijoOriginal.setId(responsableactivofijoAux.getId());
					responsableactivofijoOriginal.setVersionRow(responsableactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijos) {
				if(responsableactivofijoAux.getResponsableActivoFijoOriginal().getId().equals(responsableactivofijoOriginal.getId())) {
					existe=true;
					responsableactivofijoOriginal.setId(responsableactivofijoAux.getId());
					responsableactivofijoOriginal.setVersionRow(responsableactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResponsableActivoFijo(Boolean esParaCancelar) throws Exception {
		responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
		responsableactivofijoAux=new ResponsableActivoFijo();
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
					if(responsableactivofijoAux.getId()<0) {
						responsableactivofijosAux.add(responsableactivofijoAux);
					}		
				}
				this.iIdNuevoResponsableActivoFijo=0L;
				this.responsableactivofijoLogic.getResponsableActivoFijos().removeAll(responsableactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijos) {
					if(responsableactivofijoAux.getId()<0) {
						responsableactivofijosAux.add(responsableactivofijoAux);
					}		
				}
				this.iIdNuevoResponsableActivoFijo=0L;
				this.responsableactivofijos.removeAll(responsableactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResponsableActivoFijo 
					&& this.responsableactivofijoLogic.getResponsableActivoFijos().size()>0
					) {
					responsableactivofijoAux=this.responsableactivofijoLogic.getResponsableActivoFijos().get(this.responsableactivofijoLogic.getResponsableActivoFijos().size() - 1);
				
					if(responsableactivofijoAux.getId()<0) {
						this.responsableactivofijoLogic.getResponsableActivoFijos().remove(responsableactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResponsableActivoFijo && this.responsableactivofijos.size()>0) {
					responsableactivofijoAux=this.responsableactivofijos.get(this.responsableactivofijos.size() - 1);
				
					if(responsableactivofijoAux.getId()<0) {
						this.responsableactivofijos.remove(responsableactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResponsableActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(responsableactivofijo.getId()<0) {
				this.responsableactivofijoLogic.getResponsableActivoFijos().remove(this.responsableactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(responsableactivofijo.getId()<0) {
				this.responsableactivofijos.remove(this.responsableactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesResponsableActivoFijo(List<ResponsableActivoFijo> responsableactivofijosAux) throws Exception {
		ResponsableActivoFijoConstantesFunciones.setEstadosInicialesResponsableActivoFijo(responsableactivofijosAux);
	}
	
	public void setEstadosInicialesResponsableActivoFijo(ResponsableActivoFijo responsableactivofijoAux) throws Exception {
		ResponsableActivoFijoConstantesFunciones.setEstadosInicialesResponsableActivoFijo(responsableactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResponsableActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResponsableActivoFijoActual()) {
				if(!this.isEsNuevoResponsableActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResponsableActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResponsableActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Responsable Activo Fijo ?", "MANTENIMIENTO DE Responsable Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ResponsableActivoFijo responsableactivofijo) throws Exception {
		ResponsableActivoFijoConstantesFunciones.seleccionarAsignar(this.responsableactivofijo,responsableactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResponsableActivoFijo=this.isPermisoActualizarOriginalResponsableActivoFijo;
			
			
			this.seleccionarAsignar(responsableactivofijo);
			
			

			idEmpleadoActual=responsableactivofijo.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableActivoFijoConstantesFunciones.quitarEspaciosResponsableActivoFijo(this.responsableactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesResponsableActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.responsableactivofijoSessionBean.setsFuncionBusquedaRapida(this.responsableactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoResponsableActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResponsableActivoFijo(esParaCancelar);				
				this.cancelarNuevoResponsableActivoFijo(esParaCancelar);								
			}
			
			this.responsableactivofijo=new ResponsableActivoFijo();
			
			this.inicializarResponsableActivoFijo();
			
			this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResponsableActivoFijo() throws Exception {
		try {
			ResponsableActivoFijoConstantesFunciones.inicializarResponsableActivoFijo(this.responsableactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.responsableactivofijoLogic.getResponsableActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResponsableActivoFijos(String sAccionBusqueda,List<ResponsableActivoFijo> responsableactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="ResponsableActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResponsableActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResponsableActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ResponsableActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Responsable Activo Fijos");		
		parameters.put("busquedapor", ResponsableActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResponsableActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResponsableActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResponsableActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResponsableActivoFijo=new JRBeanArrayDataSource(ResponsableActivoFijoJInternalFrame.TraerResponsableActivoFijoBeans(responsableactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResponsableActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResponsableActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResponsableActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResponsableActivoFijoBean.TraerResponsableActivoFijoBeans(responsableactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijoActionPerformed(null);
					//this.generarExcelReporteResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResponsableActivoFijos(sAccionBusqueda,sTipoArchivoReporte,responsableactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResponsableActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableActivoFijo> responsableactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsableActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ResponsableActivoFijo responsableactivofijo : responsableactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResponsableActivoFijoConstantesFunciones.generarExcelReporteDataResponsableActivoFijo("NORMAL",row,workbook,responsableactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResponsableActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		ResponsableActivoFijoConstantesFunciones.generarExcelReporteHeaderResponsableActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResponsableActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableActivoFijo> responsableactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ResponsableActivoFijo responsableactivofijo : responsableactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResponsableActivoFijoConstantesFunciones.getResponsableActivoFijoDescripcion(responsableactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getubicacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsableactivofijo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResponsableActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableActivoFijo> responsableactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ResponsableActivoFijo> responsableactivofijosRespaldo=null;
		
		classes=ResponsableActivoFijoConstantesFunciones.getClassesRelationshipsOfResponsableActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.responsableactivofijoLogic.setDatosCliente(this.datosCliente);
		this.responsableactivofijoLogic.setDatosDeep(this.datosDeep);
		this.responsableactivofijoLogic.setIsConDeep(true);
		
		responsableactivofijosRespaldo=this.responsableactivofijoLogic.getResponsableActivoFijos();
		
		this.responsableactivofijoLogic.setResponsableActivoFijos(responsableactivofijosParaReportes);	
		this.responsableactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		responsableactivofijosParaReportes=this.responsableactivofijoLogic.getResponsableActivoFijos();
		this.responsableactivofijoLogic.setResponsableActivoFijos(responsableactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsableActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ResponsableActivoFijo responsableactivofijo : responsableactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResponsableActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResponsableActivoFijoConstantesFunciones.generarExcelReporteDataResponsableActivoFijo("NORMAL",row,workbook,responsableactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ResponsableActivoFijoConstantesFunciones.getResponsableActivoFijoDescripcion(responsableactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResponsableActivoFijo() throws Exception {		
		this.startProcessResponsableActivoFijo(true);
	}
	
	public void startProcessResponsableActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResponsableActivoFijo ,this.jPanelParametrosReportesResponsableActivoFijo, this.jScrollPanelDatosResponsableActivoFijo,this.jPanelPaginacionResponsableActivoFijo, this.jScrollPanelDatosEdicionResponsableActivoFijo, this.jPanelAccionesResponsableActivoFijo,this.jPanelAccionesFormularioResponsableActivoFijo,this.jmenuBarResponsableActivoFijo,this.jmenuBarDetalleResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsableActivoFijo=this.jTabbedPaneBusquedasResponsableActivoFijo; 
		
		final JPanel jPanelParametrosReportesResponsableActivoFijo=this.jPanelParametrosReportesResponsableActivoFijo;
		//final JScrollPane jScrollPanelDatosResponsableActivoFijo=this.jScrollPanelDatosResponsableActivoFijo;
		final JTable jTableDatosResponsableActivoFijo=this.jTableDatosResponsableActivoFijo;		
		final JPanel jPanelPaginacionResponsableActivoFijo=this.jPanelPaginacionResponsableActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionResponsableActivoFijo=this.jScrollPanelDatosEdicionResponsableActivoFijo;
		final JPanel jPanelAccionesResponsableActivoFijo=this.jPanelAccionesResponsableActivoFijo;
		
		JPanel jPanelCamposAuxiliarResponsableActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResponsableActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			jPanelCamposAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelCamposResponsableActivoFijo;
			jPanelAccionesFormularioAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelAccionesFormularioResponsableActivoFijo;
		}
		
		final JPanel jPanelCamposResponsableActivoFijo=jPanelCamposAuxiliarResponsableActivoFijo;
		final JPanel jPanelAccionesFormularioResponsableActivoFijo=jPanelAccionesFormularioAuxiliarResponsableActivoFijo;
		
		
		final JMenuBar jmenuBarResponsableActivoFijo=this.jmenuBarResponsableActivoFijo;
		final JToolBar jTtoolBarResponsableActivoFijo=this.jTtoolBarResponsableActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResponsableActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsableActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			jmenuBarDetalleAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jmenuBarDetalleResponsableActivoFijo;
			jTtoolBarDetalleAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jTtoolBarDetalleResponsableActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleResponsableActivoFijo=jmenuBarDetalleAuxiliarResponsableActivoFijo;
		final JToolBar jTtoolBarDetalleResponsableActivoFijo=jTtoolBarDetalleAuxiliarResponsableActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsableActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsableActivoFijo;
			processRunnable.jTableDatos=jTableDatosResponsableActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposResponsableActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsableActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesResponsableActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsableActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarResponsableActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsableActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarResponsableActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsableActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsableActivoFijo ,jPanelParametrosReportesResponsableActivoFijo,jTableDatosResponsableActivoFijo, /*jScrollPanelDatosResponsableActivoFijo,*/jPanelCamposResponsableActivoFijo,jPanelPaginacionResponsableActivoFijo, /*jScrollPanelDatosEdicionResponsableActivoFijo,*/ jPanelAccionesResponsableActivoFijo,jPanelAccionesFormularioResponsableActivoFijo,jmenuBarResponsableActivoFijo,jmenuBarDetalleResponsableActivoFijo,jTtoolBarResponsableActivoFijo,jTtoolBarDetalleResponsableActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsableActivoFijo ,jPanelParametrosReportesResponsableActivoFijo, jScrollPanelDatosResponsableActivoFijo,jPanelPaginacionResponsableActivoFijo, jScrollPanelDatosEdicionResponsableActivoFijo, jPanelAccionesResponsableActivoFijo,jPanelAccionesFormularioResponsableActivoFijo,jmenuBarResponsableActivoFijo,jmenuBarDetalleResponsableActivoFijo,jTtoolBarResponsableActivoFijo,jTtoolBarDetalleResponsableActivoFijo);
						
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
	
	public void finishProcessResponsableActivoFijo() {// throws Exception 
		this.finishProcessResponsableActivoFijo(true);
	}
	
	public void finishProcessResponsableActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResponsableActivoFijo ,this.jPanelParametrosReportesResponsableActivoFijo, this.jScrollPanelDatosResponsableActivoFijo,this.jPanelPaginacionResponsableActivoFijo, this.jScrollPanelDatosEdicionResponsableActivoFijo, this.jPanelAccionesResponsableActivoFijo,this.jPanelAccionesFormularioResponsableActivoFijo,this.jmenuBarResponsableActivoFijo,this.jmenuBarDetalleResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsableActivoFijo=this.jTabbedPaneBusquedasResponsableActivoFijo; 
		
		final JPanel jPanelParametrosReportesResponsableActivoFijo=this.jPanelParametrosReportesResponsableActivoFijo;
		//final JScrollPane jScrollPanelDatosResponsableActivoFijo=this.jScrollPanelDatosResponsableActivoFijo;
		final JTable jTableDatosResponsableActivoFijo=this.jTableDatosResponsableActivoFijo;		
		final JPanel jPanelPaginacionResponsableActivoFijo=this.jPanelPaginacionResponsableActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionResponsableActivoFijo=this.jScrollPanelDatosEdicionResponsableActivoFijo;
		final JPanel jPanelAccionesResponsableActivoFijo=this.jPanelAccionesResponsableActivoFijo;
		
		JPanel jPanelCamposAuxiliarResponsableActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResponsableActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			jPanelCamposAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelCamposResponsableActivoFijo;
			jPanelAccionesFormularioAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelAccionesFormularioResponsableActivoFijo;
		}
		
		final JPanel jPanelCamposResponsableActivoFijo=jPanelCamposAuxiliarResponsableActivoFijo;
		final JPanel jPanelAccionesFormularioResponsableActivoFijo=jPanelAccionesFormularioAuxiliarResponsableActivoFijo;
		
		
		final JMenuBar jmenuBarResponsableActivoFijo=this.jmenuBarResponsableActivoFijo;		
		final JToolBar jTtoolBarResponsableActivoFijo=this.jTtoolBarResponsableActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarResponsableActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsableActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			jmenuBarDetalleAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jmenuBarDetalleResponsableActivoFijo;
			jTtoolBarDetalleAuxiliarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jTtoolBarDetalleResponsableActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleResponsableActivoFijo=jmenuBarDetalleAuxiliarResponsableActivoFijo;
		final JToolBar jTtoolBarDetalleResponsableActivoFijo=jTtoolBarDetalleAuxiliarResponsableActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsableActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsableActivoFijo;
			processRunnable.jTableDatos=jTableDatosResponsableActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposResponsableActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsableActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesResponsableActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsableActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarResponsableActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsableActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarResponsableActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsableActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResponsableActivoFijo ,jPanelParametrosReportesResponsableActivoFijo, jTableDatosResponsableActivoFijo,/*jScrollPanelDatosResponsableActivoFijo,*/jPanelCamposResponsableActivoFijo,jPanelPaginacionResponsableActivoFijo, /*jScrollPanelDatosEdicionResponsableActivoFijo,*/ jPanelAccionesResponsableActivoFijo,jPanelAccionesFormularioResponsableActivoFijo,jmenuBarResponsableActivoFijo,jmenuBarDetalleResponsableActivoFijo,jTtoolBarResponsableActivoFijo,jTtoolBarDetalleResponsableActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResponsableActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResponsableActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResponsableActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResponsableActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResponsableActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResponsableActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResponsableActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResponsableActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResponsableActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.responsableactivofijoConstantesFunciones.getsFinalQueryResponsableActivoFijo();
		String  finalQueryPaginacionTodos=this.responsableactivofijoConstantesFunciones.getsFinalQueryResponsableActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResponsableActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoResponsableActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResponsableActivoFijoConstantesFunciones.getArrayColumnasGlobalesResponsableActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResponsableActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.responsableactivofijosEliminados= new ArrayList<ResponsableActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResponsableActivoFijo();
		
				///*ResponsableActivoFijoSessionBean*/this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			
			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
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
					this.iNumeroPaginacion=ResponsableActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResponsableActivoFijoConstantesFunciones.getClassesForeignKeysOfResponsableActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/responsableactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			responsableactivofijosAux= new ArrayList<ResponsableActivoFijo>();
			
				
			responsableactivofijoLogic.setDatosCliente(this.datosCliente);
			responsableactivofijoLogic.setDatosDeep(this.datosDeep);
			responsableactivofijoLogic.setIsConDeep(true);
			
			
			responsableactivofijoLogic.getResponsableActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					responsableactivofijoLogic.getTodosResponsableActivoFijos(finalQueryGlobal,pagination);
					
					//responsableactivofijoLogic.getTodosResponsableActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(responsableactivofijoLogic.getResponsableActivoFijos()==null|| responsableactivofijoLogic.getResponsableActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsableactivofijosAux= new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux= new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsableactivofijoLogic.getTodosResponsableActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//responsableactivofijoLogic.getTodosResponsableActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteResponsableActivoFijos("Todos",responsableactivofijoLogic.getResponsableActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());					
							responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idResponsableActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idResponsableActivoFijo=this.idActual;
				
				} else if(this.idResponsableActivoFijoActual!=null && this.idResponsableActivoFijoActual!=0L) {
					idResponsableActivoFijo=idResponsableActivoFijoActual;
				}
				
					
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndicePorId(idResponsableActivoFijo);
				
				this.responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					responsableactivofijoLogic.getEntity(idResponsableActivoFijo);
					
					//responsableactivofijoLogic.getEntityWithConnection(idResponsableActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
					responsableactivofijoLogic.getResponsableActivoFijos().add(responsableactivofijoLogic.getResponsableActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
					this.responsableactivofijos.add(responsableactivofijo);
				}
				
				if(responsableactivofijoLogic.getResponsableActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableactivofijoLogic.getResponsableActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos()==null||responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsableactivofijos==null|| responsableactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
						responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableactivofijoLogic.getResponsableActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableActivoFijos("FK_IdDetalleActivoFijo",responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableActivoFijos("FK_IdDetalleActivoFijo",responsableactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
						responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos()==null||responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsableactivofijos==null|| responsableactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
						responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableActivoFijos("FK_IdEmpleado",responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableActivoFijos("FK_IdEmpleado",responsableactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
						responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos()==null||responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsableactivofijos==null|| responsableactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
						responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableActivoFijos("FK_IdEmpresa",responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableActivoFijos("FK_IdEmpresa",responsableactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
						responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos()==null||responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsableactivofijos==null|| responsableactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
						responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableactivofijoLogic.getResponsableActivoFijosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableActivoFijos("FK_IdEstructura",responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableActivoFijos("FK_IdEstructura",responsableactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
						responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsableactivofijoLogic.getResponsableActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos()==null||responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsableactivofijos==null|| responsableactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
						responsableactivofijosAux.addAll(responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijosAux=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijosAux.addAll(responsableactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsableactivofijoLogic.getResponsableActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableActivoFijos("FK_IdSucursal",responsableactivofijoLogic.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableActivoFijos("FK_IdSucursal",responsableactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoLogic.setResponsableActivoFijos(new ArrayList<ResponsableActivoFijo>());
						responsableactivofijoLogic.getResponsableActivoFijos().addAll(responsableactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijos=new ArrayList<ResponsableActivoFijo>();
							responsableactivofijos.addAll(responsableactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResponsableActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResponsableActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsableactivofijoLogic.getResponsableActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsableactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsableactivofijoLogic.getResponsableActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsableactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ResponsableActivoFijo responsableactivofijo) {
		Boolean permite=true;
		
		if(this.responsableactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResponsableActivoFijoConstantesFunciones.getOrderByListaResponsableActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResponsableActivoFijoConstantesFunciones.getOrderByListaResponsableActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableActivoFijo responsableactivofijo:responsableactivofijoLogic.getResponsableActivoFijos()) {
				if(responsableactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					responsableactivofijoTotales=responsableactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableActivoFijo responsableactivofijo:this.responsableactivofijos) {
				if(responsableactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					responsableactivofijoTotales=responsableactivofijo;
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
			this.responsableactivofijoAux=new ResponsableActivoFijo();
			this.responsableactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.responsableactivofijoAux.setIsNew(false);
			this.responsableactivofijoAux.setIsChanged(false);
			this.responsableactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ResponsableActivoFijoConstantesFunciones.TotalizarValoresFilaResponsableActivoFijo(this.responsableactivofijoLogic.getResponsableActivoFijos(),this.responsableactivofijoAux);
				
				this.responsableactivofijoLogic.getResponsableActivoFijos().add(this.responsableactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResponsableActivoFijoConstantesFunciones.TotalizarValoresFilaResponsableActivoFijo(this.responsableactivofijos,this.responsableactivofijoAux);
				
				this.responsableactivofijos.add(this.responsableactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		responsableactivofijoTotales=new ResponsableActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsableactivofijoLogic.getResponsableActivoFijos().remove(responsableactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsableactivofijos.remove(responsableactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		responsableactivofijoTotales=new ResponsableActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableActivoFijo responsableactivofijo:responsableactivofijoLogic.getResponsableActivoFijos()) {
				if(responsableactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					responsableactivofijoTotales=responsableactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableActivoFijoConstantesFunciones.TotalizarValoresFilaResponsableActivoFijo(this.responsableactivofijoLogic.getResponsableActivoFijos(),responsableactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableActivoFijo responsableactivofijo:this.responsableactivofijos) {
				if(responsableactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					responsableactivofijoTotales=responsableactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableActivoFijoConstantesFunciones.TotalizarValoresFilaResponsableActivoFijo(this.responsableactivofijos,responsableactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResponsableActivoFijosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableActivoFijosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableActivoFijosFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableActivoFijosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getResponsableActivoFijosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.getResponsableActivoFijosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableActivoFijosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableActivoFijosFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.getResponsableActivoFijosFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableActivoFijosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLogic.getResponsableActivoFijosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosResponsableActivoFijo() {
		this.isPermisoTodoResponsableActivoFijo=false;
		this.isPermisoNuevoResponsableActivoFijo=false;
		this.isPermisoActualizarResponsableActivoFijo=false;
		this.isPermisoActualizarOriginalResponsableActivoFijo=false;
		this.isPermisoEliminarResponsableActivoFijo=false;
		this.isPermisoGuardarCambiosResponsableActivoFijo=false;
		this.isPermisoConsultaResponsableActivoFijo=false;
		this.isPermisoBusquedaResponsableActivoFijo=false;
		this.isPermisoReporteResponsableActivoFijo=false;		
		this.isPermisoOrdenResponsableActivoFijo=false;		
		this.isPermisoPaginacionMedioResponsableActivoFijo=false;		
		this.isPermisoPaginacionAltoResponsableActivoFijo=false;
		this.isPermisoPaginacionTodoResponsableActivoFijo=false;
		this.isPermisoCopiarResponsableActivoFijo=false;		
		this.isPermisoVerFormResponsableActivoFijo=false;		
		this.isPermisoDuplicarResponsableActivoFijo=false;		
		this.isPermisoOrdenResponsableActivoFijo=false;		
	}
	
	public void setPermisosUsuarioResponsableActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoResponsableActivoFijo=isPermiso;
		this.isPermisoNuevoResponsableActivoFijo=isPermiso;
		this.isPermisoActualizarResponsableActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalResponsableActivoFijo=isPermiso;
		this.isPermisoEliminarResponsableActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosResponsableActivoFijo=isPermiso;
		this.isPermisoConsultaResponsableActivoFijo=isPermiso;
		this.isPermisoBusquedaResponsableActivoFijo=isPermiso;
		this.isPermisoReporteResponsableActivoFijo=isPermiso;
		this.isPermisoOrdenResponsableActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioResponsableActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoResponsableActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoResponsableActivoFijo=isPermiso;		
		this.isPermisoCopiarResponsableActivoFijo=isPermiso;		
		this.isPermisoVerFormResponsableActivoFijo=isPermiso;		
		this.isPermisoDuplicarResponsableActivoFijo=isPermiso;
		this.isPermisoOrdenResponsableActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResponsableActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoResponsableActivoFijo=isPermiso;
		this.isPermisoNuevoResponsableActivoFijo=isPermiso;
		this.isPermisoActualizarResponsableActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalResponsableActivoFijo=isPermiso;
		this.isPermisoEliminarResponsableActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosResponsableActivoFijo=isPermiso;
		//this.isPermisoConsultaResponsableActivoFijo=isPermiso;
		//this.isPermisoBusquedaResponsableActivoFijo=isPermiso;
		//this.isPermisoReporteResponsableActivoFijo=isPermiso;
		//this.isPermisoOrdenResponsableActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioResponsableActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoResponsableActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoResponsableActivoFijo=isPermiso;		
		//this.isPermisoCopiarResponsableActivoFijo=isPermiso;		
		//this.isPermisoDuplicarResponsableActivoFijo=isPermiso;
		//this.isPermisoOrdenResponsableActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResponsableActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ResponsableActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResponsableActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioResponsableActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResponsableActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResponsableActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioResponsableActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResponsableActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResponsableActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResponsableActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResponsableActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResponsableActivoFijo=this.isPermisoActualizarResponsableActivoFijo;
			this.isPermisoEliminarResponsableActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResponsableActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResponsableActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResponsableActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResponsableActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResponsableActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsableActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResponsableActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResponsableActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResponsableActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResponsableActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResponsableActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResponsableActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsableActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResponsableActivoFijo.setToolTipText(this.jTableDatosResponsableActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResponsableActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResponsableActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResponsableActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResponsableActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResponsableActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyResponsableActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResponsableActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResponsableActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyResponsableActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyResponsableActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ResponsableActivoFijoParameterReturnGeneral responsableactivofijoReturnGeneral=new ResponsableActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.responsableactivofijoConstantesFunciones.cargarid_empresaResponsableActivoFijo)
					 || (this.esRecargarFks && this.responsableactivofijoConstantesFunciones.cargarid_empresaResponsableActivoFijo)) {

					if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+responsableactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.responsableactivofijoConstantesFunciones.cargarid_sucursalResponsableActivoFijo)
					 || (this.esRecargarFks && this.responsableactivofijoConstantesFunciones.cargarid_sucursalResponsableActivoFijo)) {

					if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+responsableactivofijoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.responsableactivofijoConstantesFunciones.cargarid_detalle_activo_fijoResponsableActivoFijo)
					 || (this.esRecargarFks && this.responsableactivofijoConstantesFunciones.cargarid_detalle_activo_fijoResponsableActivoFijo)) {

					if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+responsableactivofijoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.responsableactivofijoConstantesFunciones.cargarid_estructuraResponsableActivoFijo)
					 || (this.esRecargarFks && this.responsableactivofijoConstantesFunciones.cargarid_estructuraResponsableActivoFijo)) {

					if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+responsableactivofijoSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.responsableactivofijoConstantesFunciones.cargarid_empleadoResponsableActivoFijo)
					 || (this.esRecargarFks && this.responsableactivofijoConstantesFunciones.cargarid_empleadoResponsableActivoFijo)) {

					if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+responsableactivofijoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				responsableactivofijoReturnGeneral=responsableactivofijoLogic.cargarCombosLoteForeignKeyResponsableActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalEstructura,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=responsableactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=responsableactivofijoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=responsableactivofijoReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=responsableactivofijoReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=responsableactivofijoReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyResponsableActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.responsableactivofijoSessionBean==null) {
				this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

			if(!this.responsableactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyResponsableActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResponsableActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResponsableActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.responsableactivofijo.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo)throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(responsableactivofijo.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualEstructuraForeignKey(responsableactivofijo.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(responsableactivofijo.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(responsableactivofijo.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoResponsableActivoFijo")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(responsableactivofijo.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResponsableActivoFijo()throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(this.responsableactivofijoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.responsableactivofijoConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.responsableactivofijoConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResponsableActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResponsableActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResponsableActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResponsableActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResponsableActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResponsableActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ResponsableActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResponsableActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResponsableActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean(); 
		this.responsableactivofijoConstantesFunciones=new ResponsableActivoFijoConstantesFunciones(); 
		this.responsableactivofijoBean=new ResponsableActivoFijo();//(this.responsableactivofijoConstantesFunciones); 		
		this.responsableactivofijoReturnGeneral=new ResponsableActivoFijoParameterReturnGeneral(); 
		
		this.responsableactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResponsableActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResponsableActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResponsableActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResponsableActivoFijo(true);
			
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
			
			this.responsableactivofijoConstantesFunciones=new ResponsableActivoFijoConstantesFunciones(); 
			this.responsableactivofijoBean=new ResponsableActivoFijo();//this.responsableactivofijoConstantesFunciones); 			
			this.responsableactivofijoReturnGeneral=new ResponsableActivoFijoParameterReturnGeneral(); 
		
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.responsableactivofijo=new ResponsableActivoFijo();
			this.responsableactivofijos = new ArrayList<ResponsableActivoFijo>();
			this.responsableactivofijosAux = new ArrayList<ResponsableActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic=new ResponsableActivoFijoLogic();
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.responsableactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.responsableactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResponsableActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsableActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionResponsableActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsableActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResponsableActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResponsableActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsableActivoFijo);
				this.jInternalFrameDetalleFormResponsableActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormResponsableActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsableActivoFijo);
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResponsableActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResponsableActivoFijo);
					this.jInternalFrameImportacionResponsableActivoFijo.setVisible(false);
					this.jInternalFrameImportacionResponsableActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResponsableActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResponsableActivoFijo);
					this.jInternalFrameOrderByResponsableActivoFijo.setVisible(false);
					this.jInternalFrameOrderByResponsableActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResponsableActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResponsableActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.responsableactivofijoReturnGeneral=new ResponsableActivoFijoParameterReturnGeneral();
			
			this.responsableactivofijoParameterGeneral=new ResponsableActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.responsableactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResponsableActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsableactivofijoSessionBean.getEsGuardarRelacionado(),this.responsableactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsableactivofijoSessionBean.getEsGuardarRelacionado(),this.responsableactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaDuplicarResponsableActivoFijo=true;
			this.isVisibilidadCeldaCopiarResponsableActivoFijo=true;
			this.isVisibilidadCeldaVerFormResponsableActivoFijo=true;
			this.isVisibilidadCeldaOrdenResponsableActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			
			
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResponsableActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResponsableActivoFijo(false);
			
			this.setPermisosUsuarioResponsableActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.responsableactivofijoSessionBean.getEsGuardarRelacionado() && this.responsableactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResponsableActivoFijoClasesRelacionadas();
			}
			
			if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResponsableActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResponsableActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResponsableActivoFijo();
			}
			
			if(!this.isPermisoBusquedaResponsableActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioResponsableActivoFijo,this.isPermisoPaginacionMedioResponsableActivoFijo,this.isPermisoPaginacionTodoResponsableActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResponsableActivoFijoConstantesFunciones.getTiposSeleccionarResponsableActivoFijo());
				
				this.tiposColumnasSelect=ResponsableActivoFijoConstantesFunciones.getTiposSeleccionarResponsableActivoFijo(true);
				
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
			//if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResponsableActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioResponsableActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioResponsableActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableActivoFijo() ;
			
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
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
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
				responsableactivofijoImplementable= (ResponsableActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				responsableactivofijoImplementableHome= (ResponsableActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.responsableactivofijos= new ArrayList<ResponsableActivoFijo>();
			this.responsableactivofijosEliminados= new ArrayList<ResponsableActivoFijo>();
						
			this.isEsNuevoResponsableActivoFijo=false;
			this.esParaAccionDesdeFormularioResponsableActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResponsableActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResponsableActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResponsableActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResponsableActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResponsableActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResponsableActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResponsableActivoFijo();
			}
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResponsableActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResponsableActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResponsableActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResponsableActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ResponsableActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResponsableActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesResponsableActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResponsableActivoFijo();	
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
	
	public void cargarCombosForeignKeyResponsableActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResponsableActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResponsableActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResponsableActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResponsableActivoFijo();
		
		this.cargarCombosFrameForeignKeyResponsableActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResponsableActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResponsableActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

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
	
	public void jButtonNuevoResponsableActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			
			if(jTableDatosResponsableActivoFijo.getRowCount()>=1) {
				jTableDatosResponsableActivoFijo.removeRowSelectionInterval(0, jTableDatosResponsableActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoResponsableActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResponsableActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResponsableActivoFijo(true);			
			//this.responsableactivofijo=new ResponsableActivoFijo();
			//this.responsableactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo() ;
			
			if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.responsableactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);				
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ResponsableActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResponsableActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResponsableActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResponsableActivoFijo.getSelectedRows().length;			
			}
			
			responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResponsableActivoFijo--;			
				//ResponsableActivoFijo responsableactivofijoAux= new ResponsableActivoFijo();			
				//responsableactivofijoAux.setId(this.iIdNuevoResponsableActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ResponsableActivoFijo responsableactivofijoOrigen=new ResponsableActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ResponsableActivoFijo responsableactivofijoOrigen : responsableactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							responsableactivofijoOrigen =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsableactivofijoOrigen =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResponsableActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.responsableactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResponsableActivoFijo(responsableactivofijoOrigen,this.responsableactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsableactivofijoLogic.getResponsableActivoFijos().add(this.responsableactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsableactivofijos.add(this.responsableactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
				
				this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(this.getIndiceNuevoResponsableActivoFijo(), this.getIndiceNuevoResponsableActivoFijo());
				
				int iLastRow =  this.jTableDatosResponsableActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsableActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsableActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();									
		
			ResponsableActivoFijo responsableactivofijoOrigen=new ResponsableActivoFijo();
			ResponsableActivoFijo responsableactivofijoDestino=new ResponsableActivoFijo();
				
			responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResponsableActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || responsableactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResponsableActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoOrigen =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsableactivofijoOrigen =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsableactivofijoDestino =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsableactivofijoDestino =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				responsableactivofijoOrigen =responsableactivofijosSeleccionados.get(0);
				responsableactivofijoDestino =responsableactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResponsableActivoFijo(responsableactivofijoOrigen,responsableactivofijoDestino,true,false);
				
				responsableactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsableactivofijoDestino,responsableactivofijoLogic.getResponsableActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsableactivofijoDestino,responsableactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
				
				//this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(this.getIndiceNuevoResponsableActivoFijo(), this.getIndiceNuevoResponsableActivoFijo());
				
				int iLastRow =  this.jTableDatosResponsableActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsableActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsableActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResponsableActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResponsableActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionResponsableActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesResponsableActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResponsableActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResponsableActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResponsableActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResponsableActivoFijo();
			
			this.abrirFrameOrderByResponsableActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResponsableActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResponsableActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsableActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResponsableActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormResponsableActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResponsableActivoFijo.setSize(this.jInternalFrameDetalleFormResponsableActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormResponsableActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResponsableActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResponsableActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResponsableActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormResponsableActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResponsableActivoFijo.jContentPaneDetalleResponsableActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResponsableActivoFijo.jContentPaneDetalleResponsableActivoFijo.getWidth(),ResponsableActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResponsableActivoFijo.jContentPaneDetalleResponsableActivoFijo.getWidth(),ResponsableActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResponsableActivoFijo.jContentPaneDetalleResponsableActivoFijo.getWidth(),ResponsableActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResponsableActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormResponsableActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResponsableActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResponsableActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResponsableActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByResponsableActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResponsableActivoFijo);
				this.jInternalFrameOrderByResponsableActivoFijo.setVisible(false);
				this.jInternalFrameOrderByResponsableActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByResponsableActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsableActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByResponsableActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResponsableActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResponsableActivoFijo==null) {
				
				this.jInternalFrameImportacionResponsableActivoFijo=new ImportacionJInternalFrame(ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsableActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResponsableActivoFijo);
				this.jInternalFrameImportacionResponsableActivoFijo.setVisible(false);
				this.jInternalFrameImportacionResponsableActivoFijo.setSelected(false);


				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsableActivoFijo"));
				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsableActivoFijo"));
				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsableActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResponsableActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResponsableActivoFijo==null) {
				this.jInternalFrameReporteDinamicoResponsableActivoFijo=new ReporteDinamicoJInternalFrame(ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsableActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsableActivoFijo);
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableActivoFijo"));
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableActivoFijo"));
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleResponsableActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsableActivoFijo);
			
	       	this.jInternalFrameDetalleFormResponsableActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormResponsableActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormResponsableActivoFijo.dispose();
			//this.jInternalFrameDetalleFormResponsableActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResponsableActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResponsableActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoResponsableActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResponsableActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResponsableActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionResponsableActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResponsableActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResponsableActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByResponsableActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResponsableActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResponsableActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByResponsableActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResponsableActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResponsableActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoResponsableActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResponsableActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResponsableActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionResponsableActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResponsableActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResponsableActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResponsableActivoFijo(true);
			//this.isEsNuevoResponsableActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResponsableActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableActivoFijo(false) ;
			
			if(responsableactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResponsableActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResponsableActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResponsableActivoFijo(true);
			//this.isEsNuevoResponsableActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.responsableactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResponsableActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResponsableActivoFijo(false) ;
			
			if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.responsableactivofijoConstantesFunciones.cargarid_empleadoResponsableActivoFijo) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResponsableActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResponsableActivoFijo.getSelectedRow();

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
		TableColumn tableColumnEmpleado=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResponsableActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResponsableActivoFijo(false);
			
			//if(!this.isEsNuevoResponsableActivoFijo) {								
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.responsableactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResponsableActivoFijo=true;
					this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
					this.isEsNuevoResponsableActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResponsableActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResponsableActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsableActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(false);
				
				this.habilitarDeshabilitarControlesResponsableActivoFijo(false);
			
												
				
				if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResponsableActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResponsableActivoFijoActionPerformed(evt,responsableactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResponsableActivoFijo(this.responsableactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,responsableactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.responsableactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.responsableactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.responsableactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.responsableactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResponsableActivoFijoModel) this.jTableDatosResponsableActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResponsableActivoFijo=true;
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
				this.isEsNuevoResponsableActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsableActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(false);
				
				this.habilitarDeshabilitarControlesResponsableActivoFijo(false);
				
				
				
				if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResponsableActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResponsableActivoFijo.getRowCount()>=1) {
				jTableDatosResponsableActivoFijo.removeRowSelectionInterval(0, jTableDatosResponsableActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResponsableActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(false) ;
			
			this.isEsNuevoResponsableActivoFijo=false;
			
			if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResponsableActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResponsableActivoFijo(false);
				
				//SI ES MANUAL
				if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResponsableActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResponsableActivoFijo--;			
			//ResponsableActivoFijo responsableactivofijoAux= new ResponsableActivoFijo();			
			//responsableactivofijoAux.setId(this.iIdNuevoResponsableActivoFijo);
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResponsableActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
			
			this.responsableactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.responsableactivofijoLogic.getResponsableActivoFijos().add(this.responsableactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.responsableactivofijos.add(this.responsableactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			
			this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(this.getIndiceNuevoResponsableActivoFijo(), this.getIndiceNuevoResponsableActivoFijo());
			
			int iLastRow =  this.jTableDatosResponsableActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResponsableActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResponsableActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableActivoFijo(false);
			
			//SI ES MANUAL
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableActivoFijo();
			}
			
			//this.abrirFrameTreeResponsableActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Responsable Activo FijoS ?", "MANTENIMIENTO DE Responsable Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionResponsableActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralResponsableActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.responsableactivofijoReturnGeneral=responsableactivofijoLogic.procesarImportacionResponsableActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.responsableactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarResponsableActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResponsableActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResponsableActivoFijo.setFileImportacion(this.jInternalFrameImportacionResponsableActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResponsableActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResponsableActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResponsableActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResponsableActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		

		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResponsableActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResponsableActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_icacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_icacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_icacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_icacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoria="ubicacion";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoriaValor="ubicacion";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ubicacion");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ResponsableActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getubicacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ResponsableActivoFijo responsableactivofijo:responsableactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsableactivofijo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelResponsableActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResponsableActivoFijo(responsableactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableActivoFijo(false);
			
			//SI ES MANUAL
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableActivoFijo(false);
			
			//SI ES MANUAL
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsableActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableActivoFijo(false);
			
			//SI ES MANUAL
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsableActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResponsableActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResponsableActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResponsableActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResponsableActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResponsableActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResponsableActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosResponsableActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosResponsableActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResponsableActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResponsableActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResponsableActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResponsableActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResponsableActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResponsableActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResponsableActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResponsableActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResponsableActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResponsableActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResponsableActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResponsableActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResponsableActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionNuevoResponsableActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionSinCerrarResponsableActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionSinMensajeResponsableActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResponsableActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResponsableActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionNuevoResponsableActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionSinCerrarResponsableActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResponsableActivoFijo.jCheckBoxPostAccionSinMensajeResponsableActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResponsableActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResponsableActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResponsableActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResponsableActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResponsableActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResponsableActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResponsableActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResponsableActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResponsableActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResponsableActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResponsableActivoFijo() throws Exception {
		try	{
			if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsableActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsableActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsableActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResponsableActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResponsableActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResponsableActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResponsableActivoFijo.addItem(reporte);
			}
			
			
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResponsableActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResponsableActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResponsableActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResponsableActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResponsableActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResponsableActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResponsableActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResponsableActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResponsableActivoFijo(Boolean esInicializar) throws Exception {				
		if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResponsableActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResponsableActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResponsableActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResponsableActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResponsableActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=responsableactivofijoLogic.getResponsableActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=responsableactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResponsableActivoFijo.setModel(new ResponsableActivoFijoModel(this.responsableactivofijoLogic.getResponsableActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResponsableActivoFijo.setModel(new ResponsableActivoFijoModel(this.responsableactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResponsableActivoFijo!=null && this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResponsableActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,responsableactivofijoConstantesFunciones.resaltarSeleccionarResponsableActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,responsableactivofijoConstantesFunciones.resaltarSeleccionarResponsableActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_ID));

		if(this.responsableactivofijoConstantesFunciones.mostraridResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsableactivofijoConstantesFunciones.resaltaridResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activaridResponsableActivoFijo,this,true,"idResponsableActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableactivofijoConstantesFunciones.resaltaridResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activaridResponsableActivoFijo,this,true,"idResponsableActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.responsableactivofijoConstantesFunciones.mostrarid_empresaResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_empresaResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_empresaResponsableActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_empresaResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_empresaResponsableActivoFijo,false,"id_empresaResponsableActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.responsableactivofijoConstantesFunciones.mostrarid_sucursalResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_sucursalResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_sucursalResponsableActivoFijo));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_sucursalResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_sucursalResponsableActivoFijo,false,"id_sucursalResponsableActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.responsableactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_detalle_activo_fijoResponsableActivoFijo));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_detalle_activo_fijoResponsableActivoFijo,true,"id_detalle_activo_fijoResponsableActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.responsableactivofijoConstantesFunciones.mostrarid_estructuraResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_estructuraResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_estructuraResponsableActivoFijo));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_estructuraResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_estructuraResponsableActivoFijo,true,"id_estructuraResponsableActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.responsableactivofijoConstantesFunciones.mostrarid_empleadoResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_empleadoResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_empleadoResponsableActivoFijo));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.responsableactivofijoConstantesFunciones.resaltarid_empleadoResponsableActivoFijo,this,this.responsableactivofijoConstantesFunciones.activarid_empleadoResponsableActivoFijo,true,"id_empleadoResponsableActivoFijo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION));

		if(this.responsableactivofijoConstantesFunciones.mostrarubicacionResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableactivofijoConstantesFunciones.resaltarubicacionResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activarubicacionResponsableActivoFijo,this,true,"ubicacionResponsableActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableactivofijoConstantesFunciones.resaltarubicacionResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activarubicacionResponsableActivoFijo,this,true,"ubicacionResponsableActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_FECHA));

		if(this.responsableactivofijoConstantesFunciones.mostrarfechaResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.responsableactivofijoConstantesFunciones.resaltarfechaResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activarfechaResponsableActivoFijo,this,true,"fechaResponsableActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.responsableactivofijoConstantesFunciones.resaltarfechaResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activarfechaResponsableActivoFijo,this,true,"fechaResponsableActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.responsableactivofijoConstantesFunciones.mostrardescripcionResponsableActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsableactivofijoConstantesFunciones.resaltardescripcionResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activardescripcionResponsableActivoFijo,this,true,"descripcionResponsableActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsableactivofijoConstantesFunciones.resaltardescripcionResponsableActivoFijo,this.responsableactivofijoConstantesFunciones.activardescripcionResponsableActivoFijo,this,true,"descripcionResponsableActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsableActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsableActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.responsableactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResponsableActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosResponsableActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResponsableActivoFijo.moveColumn(this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResponsableActivoFijo.moveColumn(this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResponsableActivoFijo.moveColumn(this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResponsableActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResponsableActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResponsableActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResponsableActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResponsableActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResponsableActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=responsableactivofijoLogic.getResponsableActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=responsableactivofijos.size()-1;
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
		//this.jTableDatosResponsableActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResponsableActivoFijo();
			
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
				
				//this.isEsNuevoResponsableActivoFijo=false;
					
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
				if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsableActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsableActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.responsableactivofijo.getsType().equals("DUPLICADO")
				   || this.responsableactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResponsableActivoFijo=true;
				
				} else {
					this.isEsNuevoResponsableActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.responsableactivofijo.getId()>=0 && !this.responsableactivofijo.getIsNew()) {						
						this.isEsNuevoResponsableActivoFijo=false;
						
					} else {
						this.isEsNuevoResponsableActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResponsableActivoFijo(esRelaciones);						
				
				this.seleccionarResponsableActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.responsableactivofijo.getId()<0) {
					this.isEsNuevoResponsableActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResponsableActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResponsableActivoFijo(evt,rowIndex);
				}	
				
				if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ResponsableActivoFijo: " + this.dDif); 
					}
				}								
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResponsableActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.responsableactivofijo)) {
					if(this.responsableactivofijo.getId()>0) {
						this.responsableactivofijo.setIsDeleted(true);
						
						this.responsableactivofijosEliminados.add(this.responsableactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsableactivofijoLogic.getResponsableActivoFijos().remove(this.responsableactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsableactivofijos.remove(this.responsableactivofijo);				
					}
					
					
					((ResponsableActivoFijoModel) this.jTableDatosResponsableActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResponsableActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResponsableActivoFijo) {
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsableActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsableActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.responsableactivofijoConstantesFunciones.cargarid_empresaResponsableActivoFijo || this.responsableactivofijoConstantesFunciones.event_dependid_empresaResponsableActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.responsableactivofijo.getid_empresa());
									//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(responsableactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(responsableactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.responsableactivofijo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.responsableactivofijoConstantesFunciones.cargarid_sucursalResponsableActivoFijo || this.responsableactivofijoConstantesFunciones.event_dependid_sucursalResponsableActivoFijo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.responsableactivofijo.getid_sucursal());
									//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(responsableactivofijo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(responsableactivofijo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.responsableactivofijo.getid_sucursal(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.responsableactivofijoConstantesFunciones.cargarid_detalle_activo_fijoResponsableActivoFijo || this.responsableactivofijoConstantesFunciones.event_dependid_detalle_activo_fijoResponsableActivoFijo) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.responsableactivofijo.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(responsableactivofijo.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(responsableactivofijo.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.responsableactivofijo.getid_detalle_activo_fijo(),false,"Formulario");

					//Estructura
					if(!this.responsableactivofijoConstantesFunciones.cargarid_estructuraResponsableActivoFijo || this.responsableactivofijoConstantesFunciones.event_dependid_estructuraResponsableActivoFijo) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.responsableactivofijo.getid_estructura());
									//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(responsableactivofijo.getEstructura()!=null) {
							this.estructurasForeignKey.add(responsableactivofijo.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.responsableactivofijo.getid_estructura(),false,"Formulario");

					//Empleado
					if(!this.responsableactivofijoConstantesFunciones.cargarid_empleadoResponsableActivoFijo || this.responsableactivofijoConstantesFunciones.event_dependid_empleadoResponsableActivoFijo) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.responsableactivofijo.getid_empleado());
									//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(responsableactivofijo.getEmpleado()!=null) {
							this.empleadosForeignKey.add(responsableactivofijo.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.responsableactivofijo.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResponsableActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResponsableActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResponsableActivoFijo(responsableactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResponsableActivoFijo(responsableactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResponsableActivoFijo(responsableactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResponsableActivoFijo(responsableactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setText(responsableactivofijo.getId().toString());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setText(responsableactivofijo.getubicacion());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setDate(responsableactivofijo.getfecha());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setText(responsableactivofijo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ResponsableActivoFijo responsableactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,responsableactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ResponsableActivoFijo responsableactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				responsableactivofijoLocal=this.responsableactivofijo;
			} else {
				responsableactivofijoLocal=this.responsableactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(responsableactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResponsableActivoFijo(responsableactivofijoLocal,true);
					
					if(responsableactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(responsableactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(responsableactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsableActivoFijo(responsableactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(responsableactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsableActivoFijo(responsableactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.getText()==null || this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.getText()=="" || this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setText("0");
			}

			if(conColumnasBase) {responsableactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelIdResponsableActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsableactivofijo.setubicacion(this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelubicacionResponsableActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsableactivofijo.setfecha(this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableActivoFijoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelfechaResponsableActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsableactivofijo.setdescripcion(this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableActivoFijo.jLabeldescripcionResponsableActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsableActivoFijo(ResponsableActivoFijo responsableactivofijoBean,ResponsableActivoFijo responsableactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && responsableactivofijoBean.getid_detalle_activo_fijo()!=null && !responsableactivofijoBean.getid_detalle_activo_fijo().equals(-1L))) {responsableactivofijo.setid_detalle_activo_fijo(responsableactivofijoBean.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && responsableactivofijoBean.getid_estructura()!=null && !responsableactivofijoBean.getid_estructura().equals(-1L))) {responsableactivofijo.setid_estructura(responsableactivofijoBean.getid_estructura());}
			if(conDefault || (!conDefault && responsableactivofijoBean.getid_empleado()!=null && !responsableactivofijoBean.getid_empleado().equals(-1L))) {responsableactivofijo.setid_empleado(responsableactivofijoBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResponsableActivoFijo(ResponsableActivoFijo responsableactivofijoOrigen,ResponsableActivoFijo responsableactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsableactivofijoOrigen.getId()!=null && !responsableactivofijoOrigen.getId().equals(0L))) {responsableactivofijo.setId(responsableactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getid_detalle_activo_fijo()!=null && !responsableactivofijoOrigen.getid_detalle_activo_fijo().equals(-1L))) {responsableactivofijo.setid_detalle_activo_fijo(responsableactivofijoOrigen.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getid_estructura()!=null && !responsableactivofijoOrigen.getid_estructura().equals(-1L))) {responsableactivofijo.setid_estructura(responsableactivofijoOrigen.getid_estructura());}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getid_empleado()!=null && !responsableactivofijoOrigen.getid_empleado().equals(-1L))) {responsableactivofijo.setid_empleado(responsableactivofijoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getubicacion()!=null && !responsableactivofijoOrigen.getubicacion().equals(""))) {responsableactivofijo.setubicacion(responsableactivofijoOrigen.getubicacion());}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getfecha()!=null && !responsableactivofijoOrigen.getfecha().equals(new Date()))) {responsableactivofijo.setfecha(responsableactivofijoOrigen.getfecha());}
			if(conDefault || (!conDefault && responsableactivofijoOrigen.getdescripcion()!=null && !responsableactivofijoOrigen.getdescripcion().equals(""))) {responsableactivofijo.setdescripcion(responsableactivofijoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setText(responsableactivofijo.getId().toString());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setText(responsableactivofijo.getubicacion());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setDate(responsableactivofijo.getfecha());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setText(responsableactivofijo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsableActivoFijo(ResponsableActivoFijoBean responsableactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setText(responsableactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setText(responsableactivofijoBean.getubicacion());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setDate(responsableactivofijoBean.getfecha());
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setText(responsableactivofijoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResponsableActivoFijo(ResponsableActivoFijoParameterReturnGeneral responsableactivofijoReturnGeneral,ResponsableActivoFijoBean responsableactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			ResponsableActivoFijo responsableactivofijoLocal=new ResponsableActivoFijo();
			
			responsableactivofijoLocal=responsableactivofijoReturnGeneral.getResponsableActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsableactivofijoLocal.getId()!=null && !responsableactivofijoLocal.getId().equals(0L))) {responsableactivofijoBean.setId(responsableactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getid_detalle_activo_fijo()!=null && !responsableactivofijoLocal.getid_detalle_activo_fijo().equals(-1L))) {responsableactivofijoBean.setid_detalle_activo_fijo(responsableactivofijoLocal.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getid_estructura()!=null && !responsableactivofijoLocal.getid_estructura().equals(-1L))) {responsableactivofijoBean.setid_estructura(responsableactivofijoLocal.getid_estructura());}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getid_empleado()!=null && !responsableactivofijoLocal.getid_empleado().equals(-1L))) {responsableactivofijoBean.setid_empleado(responsableactivofijoLocal.getid_empleado());}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getubicacion()!=null && !responsableactivofijoLocal.getubicacion().equals(""))) {responsableactivofijoBean.setubicacion(responsableactivofijoLocal.getubicacion());}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getfecha()!=null && !responsableactivofijoLocal.getfecha().equals(new Date()))) {responsableactivofijoBean.setfecha(responsableactivofijoLocal.getfecha());}
			if(conDefault || (!conDefault && responsableactivofijoLocal.getdescripcion()!=null && !responsableactivofijoLocal.getdescripcion().equals(""))) {responsableactivofijoBean.setdescripcion(responsableactivofijoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResponsableActivoFijoGenerico(Long idResponsableActivoFijoSeleccionado,JComboBox jComboBoxResponsableActivoFijo,List<ResponsableActivoFijo> responsableactivofijosLocal)throws Exception {
		try {
			ResponsableActivoFijo  responsableactivofijoTemp=null;

			for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosLocal) {
				if(responsableactivofijoAux.getId()!=null && responsableactivofijoAux.getId().equals(idResponsableActivoFijoSeleccionado)) {
					responsableactivofijoTemp=responsableactivofijoAux;
					break;
				}
			}

			jComboBoxResponsableActivoFijo.setSelectedItem(responsableactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResponsableActivoFijoGenerico(JComboBox jComboBoxResponsableActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsableActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResponsableActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsableActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResponsableActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsableactivofijo=(ResponsableActivoFijo) responsableactivofijoLogic.getResponsableActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsableactivofijo =(ResponsableActivoFijo) responsableactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!responsableactivofijo.getIsNew() && !responsableactivofijo.getIsChanged() && !responsableactivofijo.getIsDeleted()) {
				sDescripcion=responsableactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=responsableactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!responsableactivofijo.getIsNew() && !responsableactivofijo.getIsChanged() && !responsableactivofijo.getIsDeleted()) {
				sDescripcion=responsableactivofijo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=responsableactivofijo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!responsableactivofijo.getIsNew() && !responsableactivofijo.getIsChanged() && !responsableactivofijo.getIsDeleted()) {
				sDescripcion=responsableactivofijo.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=responsableactivofijo.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!responsableactivofijo.getIsNew() && !responsableactivofijo.getIsChanged() && !responsableactivofijo.getIsDeleted()) {
				sDescripcion=responsableactivofijo.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=responsableactivofijo.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!responsableactivofijo.getIsNew() && !responsableactivofijo.getIsChanged() && !responsableactivofijo.getIsDeleted()) {
				sDescripcion=responsableactivofijo.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=responsableactivofijo.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ResponsableActivoFijo responsableactivofijoRow=new ResponsableActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsableactivofijoRow=(ResponsableActivoFijo) responsableactivofijoLogic.getResponsableActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsableactivofijoRow=(ResponsableActivoFijo) responsableactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResponsableActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));			
			this.jButtonDuplicarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarResponsableActivoFijo && this.isPermisoDuplicarResponsableActivoFijo));			
			this.jButtonCopiarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaCopiarResponsableActivoFijo && this.isPermisoCopiarResponsableActivoFijo));
			this.jButtonVerFormResponsableActivoFijo.setVisible((this.isVisibilidadCeldaVerFormResponsableActivoFijo && this.isPermisoVerFormResponsableActivoFijo));
			
			this.jButtonAbrirOrderByResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));			
			
			this.jButtonNuevoRelacionesResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));			
			this.jButtonNuevoGuardarCambiosResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaModificarResponsableActivoFijo && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaActualizarResponsableActivoFijo && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaEliminarResponsableActivoFijo && this.isPermisoEliminarResponsableActivoFijo));
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.setVisible(this.isVisibilidadCeldaCancelarResponsableActivoFijo);							
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));						
			this.jButtonDuplicarToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarResponsableActivoFijo && this.isPermisoDuplicarResponsableActivoFijo));						
			this.jButtonCopiarToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaCopiarResponsableActivoFijo && this.isPermisoCopiarResponsableActivoFijo));			
			this.jButtonVerFormToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaVerFormResponsableActivoFijo && this.isPermisoVerFormResponsableActivoFijo));			
			this.jButtonAbrirOrderByToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));
			this.jButtonNuevoRelacionesToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));			
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaModificarResponsableActivoFijo && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaActualizarResponsableActivoFijo  && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaEliminarResponsableActivoFijo && this.isPermisoEliminarResponsableActivoFijo));
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarToolBarResponsableActivoFijo.setVisible(this.isVisibilidadCeldaCancelarResponsableActivoFijo);				
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));			
			this.jMenuItemDuplicarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarResponsableActivoFijo && this.isPermisoDuplicarResponsableActivoFijo));			
			this.jMenuItemCopiarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaCopiarResponsableActivoFijo && this.isPermisoCopiarResponsableActivoFijo));			
			this.jMenuItemVerFormResponsableActivoFijo.setVisible((this.isVisibilidadCeldaVerFormResponsableActivoFijo && this.isPermisoVerFormResponsableActivoFijo));			
			this.jMenuItemAbrirOrderByResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));			
			//this.jMenuItemMostrarOcultarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));
			this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaOrdenResponsableActivoFijo && this.isPermisoOrdenResponsableActivoFijo));			
			this.jMenuItemNuevoRelacionesResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo.setVisible((this.isVisibilidadCeldaNuevoResponsableActivoFijo && this.isPermisoNuevoResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));									
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemModificarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaModificarResponsableActivoFijo && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemActualizarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaActualizarResponsableActivoFijo && this.isPermisoActualizarResponsableActivoFijo));	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemEliminarResponsableActivoFijo.setVisible((this.isVisibilidadCeldaEliminarResponsableActivoFijo && this.isPermisoEliminarResponsableActivoFijo));
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemCancelarResponsableActivoFijo.setVisible(this.isVisibilidadCeldaCancelarResponsableActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));						
			this.jMenuItemGuardarCambiosTablaResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=this.jButtonNuevoResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarResponsableActivoFijo=this.jButtonDuplicarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarResponsableActivoFijo=this.jButtonCopiarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormResponsableActivoFijo=this.jButtonVerFormResponsableActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenResponsableActivoFijo=this.jButtonAbrirOrderByResponsableActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=this.jButtonNuevoRelacionesResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarResponsableActivoFijo=this.jButtonModificarResponsableActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=this.jButtonGuardarCambiosTablaResponsableActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=this.jButtonNuevoToolBarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=this.jButtonNuevoRelacionesToolBarResponsableActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.isVisibilidadCeldaModificarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarToolBarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarToolBarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarToolBarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarToolBarResponsableActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsableActivoFijo=this.jButtonGuardarCambiosToolBarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=this.jMenuItemNuevoResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=this.jMenuItemNuevoRelacionesResponsableActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.isVisibilidadCeldaModificarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemModificarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemActualizarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemEliminarResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemCancelarResponsableActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsableActivoFijo=this.jMenuItemGuardarCambiosResponsableActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=this.jMenuItemGuardarCambiosTablaResponsableActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResponsableActivoFijo(Boolean esInicializar) {
		if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResponsableActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualResponsableActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResponsableActivoFijo() {
		this.jButtonNuevoResponsableActivoFijo.setVisible(this.isPermisoNuevoResponsableActivoFijo);			
		this.jButtonDuplicarResponsableActivoFijo.setVisible(this.isPermisoDuplicarResponsableActivoFijo);			
		this.jButtonCopiarResponsableActivoFijo.setVisible(this.isPermisoCopiarResponsableActivoFijo);			
		this.jButtonVerFormResponsableActivoFijo.setVisible(this.isPermisoVerFormResponsableActivoFijo);			
		
		this.jButtonAbrirOrderByResponsableActivoFijo.setVisible(this.isPermisoOrdenResponsableActivoFijo);					
		
		this.jButtonNuevoRelacionesResponsableActivoFijo.setVisible(this.isPermisoNuevoResponsableActivoFijo);			
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarResponsableActivoFijo.setVisible(this.isPermisoActualizarResponsableActivoFijo);	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.setVisible(this.isPermisoActualizarResponsableActivoFijo);	
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.setVisible(this.isPermisoEliminarResponsableActivoFijo);
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.setVisible(this.isVisibilidadCeldaCancelarResponsableActivoFijo);						
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.setVisible(this.isPermisoGuardarCambiosResponsableActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.setVisible(this.isPermisoActualizarResponsableActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsableActivoFijo() {
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarResponsableActivoFijo.setVisible(this.isPermisoActualizarResponsableActivoFijo);	
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.setVisible(this.isPermisoActualizarResponsableActivoFijo);	
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.setVisible(this.isPermisoEliminarResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.setVisible(this.isVisibilidadCeldaCancelarResponsableActivoFijo);							
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.setVisible((this.isVisibilidadCeldaGuardarResponsableActivoFijo && this.isPermisoGuardarCambiosResponsableActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResponsableActivoFijo() {
		if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResponsableActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResponsableActivoFijo() {
	}
	
	public void jTableDatosResponsableActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResponsableActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.responsableactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaResponsableActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.responsableactivofijoLogic.getConnexion());

				if(this.responsableactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.responsableactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.responsableactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalResponsableActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.responsableactivofijoLogic.getConnexion());

				if(this.responsableactivofijo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.responsableactivofijo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.responsableactivofijo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoResponsableActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.responsableactivofijoLogic.getConnexion());

				if(this.responsableactivofijo.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.responsableactivofijo.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.responsableactivofijo.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraResponsableActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.responsableactivofijoLogic.getConnexion());

				if(this.responsableactivofijo.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.responsableactivofijo.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.responsableactivofijo.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoResponsableActivoFijoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderResponsableActivoFijo=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosResponsableActivoFijo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoResponsableActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebResponsableActivoFijo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.responsableactivofijoLogic.getConnexion());

				if(this.responsableactivofijo.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.responsableactivofijo.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableActivoFijo=(TitledBorder)this.jScrollPanelDatosResponsableActivoFijo.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderResponsableActivoFijo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.responsableactivofijo.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonubicacionResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getubicacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ubicacion like '%"+this.responsableactivofijo.getubicacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.responsableactivofijo.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionResponsableActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.getresponsableactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsableactivofijo==null) {
						this.responsableactivofijo = new ResponsableActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);
				}

				if(this.responsableactivofijo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.responsableactivofijo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleActivoFijoResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);

			this.getResponsableActivoFijosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingResponsableActivoFijo(false);

			//if(ResponsableActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);

			this.getResponsableActivoFijosFK_IdEmpleado();

			this.inicializarActualizarBindingResponsableActivoFijo(false);

			//if(ResponsableActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);

			this.getResponsableActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingResponsableActivoFijo(false);

			//if(ResponsableActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);

			this.getResponsableActivoFijosFK_IdEstructura();

			this.inicializarActualizarBindingResponsableActivoFijo(false);

			//if(ResponsableActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalResponsableActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);

			this.getResponsableActivoFijosFK_IdSucursal();

			this.inicializarActualizarBindingResponsableActivoFijo(false);

			//if(ResponsableActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsableactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResponsableActivoFijo() {
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormResponsableActivoFijo.dispose();
			this.jInternalFrameDetalleFormResponsableActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoResponsableActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResponsableActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoResponsableActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionResponsableActivoFijo!=null) {
			this.jInternalFrameImportacionResponsableActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionResponsableActivoFijo.dispose();
			this.jInternalFrameImportacionResponsableActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResponsableActivoFijo();
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResponsableActivoFijo")) {
				jButtonDuplicarResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResponsableActivoFijo")) {
				jButtonCopiarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormResponsableActivoFijo")) {
				jButtonVerFormResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResponsableActivoFijo")) {
				jButtonDuplicarResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResponsableActivoFijo")) {
				jButtonDuplicarResponsableActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResponsableActivoFijo")) {
				jButtonModificarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResponsableActivoFijo")) {
				jButtonModificarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResponsableActivoFijo")) {
				jButtonModificarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResponsableActivoFijo")) {
				jButtonActualizarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResponsableActivoFijo")) {
				jButtonActualizarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResponsableActivoFijo")) {
				jButtonActualizarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarResponsableActivoFijo")) {
				jButtonEliminarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResponsableActivoFijo")) {
				jButtonEliminarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResponsableActivoFijo")) {
				jButtonEliminarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarResponsableActivoFijo")) {
				jButtonCancelarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResponsableActivoFijo")) {
				jButtonCancelarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResponsableActivoFijo")) {
				jButtonCancelarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarResponsableActivoFijo")) {
				jButtonCerrarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResponsableActivoFijo")) {
				jButtonCerrarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResponsableActivoFijo")) {
				jButtonCerrarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResponsableActivoFijo")) {
				jButtonMostrarOcultarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResponsableActivoFijo")) {
				jButtonCancelarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResponsableActivoFijo")) {
				jButtonCopiarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResponsableActivoFijo")) {
				jButtonVerFormResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResponsableActivoFijo")) {
				jButtonCopiarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResponsableActivoFijo")) {
				jButtonVerFormResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResponsableActivoFijo")) {
				jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResponsableActivoFijo")) {
				jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResponsableActivoFijo")) {
				jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResponsableActivoFijo")) {
				jButtonAnterioresResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResponsableActivoFijo")) {
				jButtonAnterioresResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResponsableActivoFijo")) {
				jButtonAnterioresResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResponsableActivoFijo")) {
				jButtonSiguientesResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResponsableActivoFijo")) {
				jButtonSiguientesResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResponsableActivoFijo")) {
				jButtonSiguientesResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResponsableActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByResponsableActivoFijo")) {
				jButtonAbrirOrderByResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResponsableActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarResponsableActivoFijo")) {
				jButtonMostrarOcultarResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResponsableActivoFijo")) {
				jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResponsableActivoFijo")) {
				jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResponsableActivoFijo")) {
				jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResponsableActivoFijo")) {
				jButtonCerrarReporteDinamicoResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResponsableActivoFijo")) {
				jButtonGenerarReporteDinamicoResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResponsableActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResponsableActivoFijo")) {
				jButtonCerrarImportacionResponsableActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResponsableActivoFijo")) {
				
				jButtonGenerarImportacionResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResponsableActivoFijo")) {
				
				jButtonAbrirImportacionResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResponsableActivoFijo")) {
				jComboBoxTiposAccionesResponsableActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResponsableActivoFijo")) {
				jComboBoxTiposRelacionesResponsableActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResponsableActivoFijo")) {
				jComboBoxTiposAccionesResponsableActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResponsableActivoFijo")) {
				
				jComboBoxTiposSeleccionarResponsableActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResponsableActivoFijo")) {
				jTextFieldValorCampoGeneralResponsableActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResponsableActivoFijo")) {
				jButtonAbrirOrderByResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResponsableActivoFijo")) {
				jButtonAbrirOrderByResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResponsableActivoFijo")) {
				jButtonCerrarOrderByResponsableActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableActivoFijoBusqueda")) {
				this.jButtonidResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableActivoFijoUpdate")) {
				this.jButtonid_empresaResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableActivoFijoBusqueda")) {
				this.jButtonid_empresaResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableActivoFijoUpdate")) {
				this.jButtonid_sucursalResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableActivoFijoBusqueda")) {
				this.jButtonid_sucursalResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoResponsableActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoResponsableActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraResponsableActivoFijoUpdate")) {
				this.jButtonid_estructuraResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraResponsableActivoFijoBusqueda")) {
				this.jButtonid_estructuraResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijo")) {
				this.jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijoUpdate")) {
				this.jButtonid_empleadoResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijoBusqueda")) {
				this.jButtonid_empleadoResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionResponsableActivoFijoBusqueda")) {
				this.jButtonubicacionResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResponsableActivoFijoBusqueda")) {
				this.jButtonfechaResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionResponsableActivoFijoBusqueda")) {
				this.jButtondescripcionResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoResponsableActivoFijo")) {
				this.jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdDetalleActivoFijoResponsableActivoFijo")) {
				this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoResponsableActivoFijo")) {
				this.jButtonFK_IdEmpleadoResponsableActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraResponsableActivoFijo")) {
				this.jButtonFK_IdEstructuraResponsableActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResponsableActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ResponsableActivoFijo responsableactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				responsableactivofijoLocal=this.responsableactivofijo;
			} else {
				responsableactivofijoLocal=this.responsableactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
							
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
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
			
			


			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
								
						
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
								
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
							
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
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
			
			


			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
								
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResponsableActivoFijo")) {
					jCheckBoxSeleccionarTodosResponsableActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResponsableActivoFijo")) {
					jCheckBoxSeleccionadosResponsableActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResponsableActivoFijo")) {
					
				}
				
				


				
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
												
				
				


				
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
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
			
			


			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsableactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsableactivofijo);
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
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
				
				


				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsableactivofijoAnterior =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResponsableActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResponsableActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResponsableActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.responsableactivofijo =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.responsableactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResponsableActivoFijo")) {
				
				}
				
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResponsableActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResponsableActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResponsableActivoFijo")) {
			
			}
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResponsableActivoFijo();
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResponsableActivoFijo")) {
				jButtonDuplicarResponsableActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResponsableActivoFijo")) {
				jButtonCopiarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResponsableActivoFijo")) {
				jButtonVerFormResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResponsableActivoFijo")) {
				jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResponsableActivoFijo")) {
				jButtonModificarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResponsableActivoFijo")) {
				jButtonActualizarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResponsableActivoFijo")) {
				jButtonEliminarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResponsableActivoFijo")) {
				jButtonCancelarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResponsableActivoFijo")) {
				jButtonCerrarResponsableActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResponsableActivoFijo")) {
				jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResponsableActivoFijo")) {
				jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResponsableActivoFijo")) {
				jButtonAbrirOrderByResponsableActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResponsableActivoFijo")) {
				jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResponsableActivoFijo")) {
				jButtonAnterioresResponsableActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResponsableActivoFijo")) {
				jButtonSiguientesResponsableActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableActivoFijoBusqueda")) {
				this.jButtonidResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableActivoFijoUpdate")) {
				this.jButtonid_empresaResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableActivoFijoBusqueda")) {
				this.jButtonid_empresaResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableActivoFijoUpdate")) {
				this.jButtonid_sucursalResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableActivoFijoBusqueda")) {
				this.jButtonid_sucursalResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoResponsableActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoResponsableActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraResponsableActivoFijoUpdate")) {
				this.jButtonid_estructuraResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraResponsableActivoFijoBusqueda")) {
				this.jButtonid_estructuraResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijo")) {
				this.jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijoUpdate")) {
				this.jButtonid_empleadoResponsableActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoResponsableActivoFijoBusqueda")) {
				this.jButtonid_empleadoResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionResponsableActivoFijoBusqueda")) {
				this.jButtonubicacionResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResponsableActivoFijoBusqueda")) {
				this.jButtonfechaResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionResponsableActivoFijoBusqueda")) {
				this.jButtondescripcionResponsableActivoFijoBusquedaActionPerformed(evt);
			}
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResponsableActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResponsableActivoFijo")) {
				closingInternalFrameResponsableActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarResponsableActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormResponsableActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            ResponsableActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(ResponsableActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsableActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResponsableActivoFijoActionPerformed(null);
			}
			
			ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsableactivofijo,new Object(),this.responsableactivofijoParameterGeneral,this.responsableactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResponsableActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResponsableActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResponsableActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.responsableactivofijo)) {
			if(!esControlTabla) {
				if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);			
				}
				
				if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResponsableActivoFijo(this.responsableactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsableactivofijoReturnGeneral=responsableactivofijoLogic.procesarEventosResponsableActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableactivofijoLogic.getResponsableActivoFijos(),this.responsableactivofijo,this.responsableactivofijoParameterGeneral,this.isEsNuevoResponsableActivoFijo,classes);//this.responsableactivofijoLogic.getResponsableActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResponsableActivoFijo(this.responsableactivofijoReturnGeneral,this.responsableactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResponsableActivoFijo(classes,this.responsableactivofijoReturnGeneral,this.responsableactivofijoBean,false);
					}
						
					if(this.responsableactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo());	
					}
						
					if(this.responsableactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo(),classes);//this.responsableactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResponsableActivoFijo(this.responsableactivofijo,classes);//this.responsableactivofijoBean);									
				}
			
				if(ResponsableActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResponsableActivoFijo(this.responsableactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableActivoFijo(this.responsableactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.responsableactivofijoAnterior!=null) {
						this.responsableactivofijo=this.responsableactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsableactivofijoReturnGeneral=responsableactivofijoLogic.procesarEventosResponsableActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableactivofijoLogic.getResponsableActivoFijos(),this.responsableactivofijo,this.responsableactivofijoParameterGeneral,this.isEsNuevoResponsableActivoFijo,classes);//this.responsableactivofijoLogic.getResponsableActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsableactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo(),responsableactivofijoLogic.getResponsableActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo(),this.responsableactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResponsableActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosResponsableActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResponsableActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosResponsableActivoFijo() throws Exception {
		
		ResponsableActivoFijoModel responsableactivofijoModel=(ResponsableActivoFijoModel)this.jTableDatosResponsableActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsableactivofijoModel.responsableactivofijos=this.responsableactivofijoLogic.getResponsableActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			responsableactivofijoModel.responsableactivofijos=this.responsableactivofijos;
		}
		
		
		((ResponsableActivoFijoModel) this.jTableDatosResponsableActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResponsableActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresponsableactivofijoAnterior(),this.responsableactivofijoLogic.getResponsableActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresponsableactivofijoAnterior(),this.responsableactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResponsableActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
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
										
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableactivofijo,new Object(),generalEntityParameterGeneral,this.responsableactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResponsableActivoFijoConstantesFunciones.getClassesRelationshipsOfResponsableActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResponsableActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfResponsableActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResponsableActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResponsableActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsableactivofijo,new Object(),generalEntityParameterGeneral,this.responsableactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResponsableActivoFijo(ResponsableActivoFijoBean responsableactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResponsableActivoFijo(ArrayList<Classe> classes,ResponsableActivoFijoReturnGeneral responsableactivofijoReturnGeneral,ResponsableActivoFijoBean responsableactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.responsableactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResponsableActivoFijo = new ResponsableActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.responsableactivofijoSessionBean.getConGuardarRelaciones(),this.responsableactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormResponsableActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.responsableactivofijoLogic=this.responsableactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyResponsableActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsableActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsableActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResponsableActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResponsableActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsableActivoFijo"));
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarResponsableActivoFijo"));

		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsableActivoFijo"));
					
		this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemModificarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsableActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarResponsableActivoFijo"));
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsableActivoFijo"));
						
		this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemActualizarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsableActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarResponsableActivoFijo"));
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsableActivoFijo"));
								
		this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemEliminarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsableActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarResponsableActivoFijo"));
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsableActivoFijo"));
					
		this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemCancelarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsableActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemDetalleCerrarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsableActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsableActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonidResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoBusqueda"));
		//jButtonid_empleadoResponsableActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonubicacionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonfechaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtondescripcionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsableActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsableActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResponsableActivoFijo"));
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsableActivoFijo"));
		}
		
		this.jTableDatosResponsableActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResponsableActivoFijo"));
		
		this.jTableDatosResponsableActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResponsableActivoFijo"));
		
		this.jButtonNuevoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoResponsableActivoFijo"));
		
		this.jButtonDuplicarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarResponsableActivoFijo"));
		
		this.jButtonCopiarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarResponsableActivoFijo"));
		
		this.jButtonVerFormResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormResponsableActivoFijo"));
		
		
		this.jButtonNuevoToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarResponsableActivoFijo"));
			
		this.jButtonDuplicarToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResponsableActivoFijo"));
			
		this.jMenuItemNuevoResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResponsableActivoFijo"));
			
		this.jMenuItemDuplicarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResponsableActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResponsableActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResponsableActivoFijo"));
			
		this.jMenuItemNuevoRelacionesResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResponsableActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarResponsableActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonModificarToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsableActivoFijo"));
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemModificarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsableActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarResponsableActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonActualizarToolBarResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsableActivoFijo"));
				
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemActualizarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsableActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarResponsableActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonEliminarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsableActivoFijo"));
						
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemEliminarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsableActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarResponsableActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonCancelarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsableActivoFijo"));
			
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemCancelarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsableActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResponsableActivoFijo"));		
		
		
		this.jButtonCerrarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarResponsableActivoFijo"));
		
		
		this.jButtonCerrarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarResponsableActivoFijo"));
			
		this.jMenuItemCerrarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResponsableActivoFijo"));
			
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jMenuItemDetalleCerrarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsableActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosResponsableActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableActivoFijo"));
		}
		
		this.jButtonCopiarToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarResponsableActivoFijo"));
			
		this.jButtonVerFormToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarResponsableActivoFijo"));
		
		this.jMenuItemGuardarCambiosResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResponsableActivoFijo"));
			
		this.jMenuItemCopiarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResponsableActivoFijo"));		
		
		this.jMenuItemVerFormResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResponsableActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsableActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResponsableActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsableActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionResponsableActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResponsableActivoFijo"));
		
		this.jMenuItemRecargarInformacionResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResponsableActivoFijo"));		
		
		
		
		this.jButtonAnterioresResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresResponsableActivoFijo"));
		
		
		this.jButtonAnterioresToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResponsableActivoFijo"));
		
		this.jMenuItemAnterioresResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResponsableActivoFijo"));		
		
		
		this.jButtonSiguientesResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesResponsableActivoFijo"));
		
		
		this.jButtonSiguientesToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResponsableActivoFijo"));
			
		this.jMenuItemSiguientesResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResponsableActivoFijo"));
			
		this.jMenuItemAbrirOrderByResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResponsableActivoFijo"));
			
		this.jMenuItemMostrarOcultarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResponsableActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResponsableActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResponsableActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResponsableActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResponsableActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResponsableActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResponsableActivoFijo"));

		this.jCheckBoxSeleccionadosResponsableActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResponsableActivoFijo"));
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsableActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesResponsableActivoFijo"));
			
		this.jComboBoxTiposAccionesResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesResponsableActivoFijo"));
					
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResponsableActivoFijo"));
			
		this.jTextFieldValorCampoGeneralResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResponsableActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonidResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoBusqueda"));
		//jButtonid_empleadoResponsableActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonubicacionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonfechaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtondescripcionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsableActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoResponsableActivoFijo"));

			this.jButtonFK_IdEmpleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableActivoFijo"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijo"));

			this.jButtonFK_IdEstructuraResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraResponsableActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResponsableActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableActivoFijo"));
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableActivoFijo"));
				this.jInternalFrameReporteDinamicoResponsableActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResponsableActivoFijo!=null) {
				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsableActivoFijo"));
				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsableActivoFijo"));
				this.jInternalFrameImportacionResponsableActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsableActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByResponsableActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarResponsableActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResponsableActivoFijo"));			
			
			if(this.jInternalFrameOrderByResponsableActivoFijo!=null) {
				this.jInternalFrameOrderByResponsableActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsableActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableActivoFijo.jTabbedPaneRelacionesResponsableActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsableActivoFijo"));
		
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
            		closingInternalFrameResponsableActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResponsableActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            ResponsableActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(ResponsableActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsableActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResponsableActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResponsableActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResponsableActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResponsableActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResponsableActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResponsableActivoFijo";
		inputMap = this.jButtonNuevoResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResponsableActivoFijo";
		inputMap = this.jButtonNuevoRelacionesResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResponsableActivoFijo";
		inputMap = this.jButtonModificarResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResponsableActivoFijo";
		inputMap = this.jButtonActualizarResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResponsableActivoFijo";
		inputMap = this.jButtonEliminarResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResponsableActivoFijo";
		inputMap = this.jButtonCancelarResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResponsableActivoFijo";
		inputMap = this.jButtonCerrarResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResponsableActivoFijo";
		inputMap = this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonGuardarCambiosResponsableActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResponsableActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResponsableActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResponsableActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResponsableActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResponsableActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResponsableActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResponsableActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonidResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empresaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_sucursalResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoResponsableActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_estructuraResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraResponsableActivoFijoBusqueda"));
		//jButtonid_empleadoResponsableActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonubicacionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonfechaResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsableActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableActivoFijo.jButtondescripcionResponsableActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsableActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoResponsableActivoFijo"));

		this.jButtonFK_IdEmpleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableActivoFijo"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableActivoFijo"));

		this.jButtonFK_IdEstructuraResponsableActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraResponsableActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResponsableActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResponsableActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResponsableActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResponsableActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResponsableActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
					responsableactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijos) {
					responsableactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResponsableActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
						responsableactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijos) {
						responsableactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsableActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsableActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResponsableActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResponsableActivoFijo.getSelectedRows();
			
			ResponsableActivoFijo responsableactivofijoLocal=new ResponsableActivoFijo();
			
			//this.seleccionarTodosResponsableActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsableactivofijoLocal =(ResponsableActivoFijo) this.responsableactivofijoLogic.getResponsableActivoFijos().toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					responsableactivofijoLocal =(ResponsableActivoFijo) this.responsableactivofijos.toArray()[this.jTableDatosResponsableActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				responsableactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
						responsableactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijos) {
						responsableactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsableActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsableActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsableActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResponsableActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResponsableActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResponsableActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResponsableActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijoLogic.getResponsableActivoFijos()) {
				
						if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							responsableactivofijoAux.setubicacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							responsableactivofijoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							responsableactivofijoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijos) {
					
						if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							responsableactivofijoAux.setubicacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							responsableactivofijoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							responsableactivofijoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResponsableActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResponsableActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResponsableActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResponsableActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessResponsableActivoFijo(conSplash);
				
					this.generarReporteResponsableActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResponsableActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsableActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsableActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsableActivoFijo();
				
				this.exportarResponsableActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResponsableActivoFijos();
				//this.importarResponsableActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsableActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResponsableActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Responsable Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResponsableActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResponsableActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResponsableActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(ResponsableActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResponsableActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResponsableActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralResponsableActivoFijo();
						
						this.generarReporteProcesoAccionResponsableActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResponsableActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Responsable Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Responsable Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResponsableActivoFijo();
				
						this.actualizarParametrosGeneralResponsableActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.responsableactivofijoReturnGeneral=responsableactivofijoLogic.procesarAccionResponsableActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.responsableactivofijoLogic.getResponsableActivoFijos(),this.responsableactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResponsableActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResponsableActivoFijo();
					
					ResponsableActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResponsableActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsableActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResponsableActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResponsableActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResponsableActivoFijo();
			
			if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
			ResponsableActivoFijo responsableactivofijo=new ResponsableActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResponsableActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResponsableActivoFijo.getSelectedItem();
			
			
			
			
			responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(responsableactivofijosSeleccionados.size()==1) {
				for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
					responsableactivofijo=responsableactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResponsableActivoFijo();
			
      		//this.finishProcessResponsableActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResponsableActivoFijoReturnGeneral() throws Exception {
		if(this.responsableactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.responsableactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.responsableactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.responsableactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.responsableactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.responsableactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResponsableActivoFijo(false);
		}
		
		if(this.responsableactivofijoReturnGeneral.getConRetornoLista() || this.responsableactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.responsableactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsableactivofijoLogic.setResponsableActivoFijos(this.responsableactivofijoReturnGeneral.getResponsableActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.responsableactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsableactivofijoLogic.setResponsableActivoFijo(this.responsableactivofijoReturnGeneral.getResponsableActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingResponsableActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralResponsableActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<ResponsableActivoFijo> getResponsableActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResponsableActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijoLogic.getResponsableActivoFijos()) {
					if(responsableactivofijoAux.getIsSelected()) {
						responsableactivofijosSeleccionados.add(responsableactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableActivoFijo responsableactivofijoAux:this.responsableactivofijos) {
					if(responsableactivofijoAux.getIsSelected()) {
						responsableactivofijosSeleccionados.add(responsableactivofijoAux);				
					}
				}
			}
			
			if(responsableactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						responsableactivofijosSeleccionados.addAll(this.responsableactivofijoLogic.getResponsableActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						responsableactivofijosSeleccionados.addAll(this.responsableactivofijos);				
					}
				}
			}
		} else {
			responsableactivofijosSeleccionados.add(this.responsableactivofijo);
		}
		
		return responsableactivofijosSeleccionados;
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
	
	public void generarReporteResponsableActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResponsableActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResponsableActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsableActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsableActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Responsable Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResponsableActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResponsableActivoFijo();
		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResponsableActivoFijo();
		
		
		//this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados ,responsableactivofijoImplementable,responsableactivofijoImplementableHome);
	}
	
	public void mostrarImportacionResponsableActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResponsableActivoFijo();
		
		this.abrirFrameImportacionResponsableActivoFijo();		
		
			
		//this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados ,responsableactivofijoImplementable,responsableactivofijoImplementableHome);
	}
	
	public void importarResponsableActivoFijos() throws Exception {		
	
	}
	
	public void exportarResponsableActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResponsableActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResponsableActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResponsableActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Responsable Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResponsableActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResponsableActivoFijo(responsableactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//responsableactivofijoAux.setsDetalleGeneralEntityReporte(responsableactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResponsableActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=responsableactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getubicacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsableactivofijo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ResponsableActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResponsableActivoFijo(row);				
				iRow++;
			}				
			
			for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResponsableActivoFijo(responsableactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResponsableActivoFijosSeleccionados() throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();		
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsableactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("responsableactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("responsableactivofijo");
			//elementRoot.appendChild(element);
		
			for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
				element = document.createElement("responsableactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResponsableActivoFijo(responsableactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResponsableActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getubicacion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(responsableactivofijo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlResponsableActivoFijo(ResponsableActivoFijo responsableactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResponsableActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(responsableactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResponsableActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(responsableactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(responsableactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(responsableactivofijo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(responsableactivofijo.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementestructura_descripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(responsableactivofijo.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleado_descripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(responsableactivofijo.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementubicacion = document.createElement(ResponsableActivoFijoConstantesFunciones.UBICACION);
		elementubicacion.appendChild(document.createTextNode(responsableactivofijo.getubicacion().trim()));
		element.appendChild(elementubicacion);

		Element elementfecha = document.createElement(ResponsableActivoFijoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(responsableactivofijo.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdescripcion = document.createElement(ResponsableActivoFijoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(responsableactivofijo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoResponsableActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados=new ArrayList<ResponsableActivoFijo>();
		
		responsableactivofijosSeleccionados=this.getResponsableActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResponsableActivoFijo(responsableactivofijosSeleccionados);
		
		this.generarReporteResponsableActivoFijos("Todos",responsableactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResponsableActivoFijo(ArrayList<ResponsableActivoFijo> responsableactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ResponsableActivoFijo responsableactivofijoAux:responsableactivofijosSeleccionados) {
				responsableactivofijoAux.setsDetalleGeneralEntityReporte(responsableactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getubicacion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(responsableactivofijoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					responsableactivofijoAux.setsDescripcionGeneralEntityReporte1(responsableactivofijoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResponsableActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResponsableActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=true;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=true;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=true;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=true;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=true;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
			this.isVisibilidadCeldaModificarResponsableActivoFijo=true;
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
			this.isVisibilidadCeldaCancelarResponsableActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsResponsableActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResponsableActivoFijo=false;
			//this.isVisibilidadCeldaVerFormResponsableActivoFijo=false;
			this.isVisibilidadCeldaDuplicarResponsableActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!responsableactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoResponsableActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!responsableactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;												
			}
			
			this.jButtonCerrarResponsableActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResponsableActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.responsableactivofijo)) {
			this.isVisibilidadCeldaActualizarResponsableActivoFijo=false;
			this.isVisibilidadCeldaEliminarResponsableActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResponsableActivoFijo() {
	}
	
	public void actualizarEstadoPanelsResponsableActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResponsableActivoFijo!=null) {
				this.jScrollPanelDatosEdicionResponsableActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableActivoFijo!=null) {
				this.jScrollPanelDatosResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableActivoFijo!=null) {
				this.jPanelPaginacionResponsableActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
					this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableActivoFijo!=null) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResponsableActivoFijo!=null) {
				this.jPanelParametrosReportesResponsableActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEmpleadoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEstructuraResponsableActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEmpleadoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEstructuraResponsableActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEmpleado=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEmpleadoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEstructura=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEstructuraResponsableActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEmpleadoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEstructuraResponsableActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEmpleadoResponsableActivoFijo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasResponsableActivoFijo.remove(jPanelFK_IdEstructuraResponsableActivoFijo);}
		}
		
	}
	
	
	
	

	public String registrarSesionResponsableActivoFijoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(responsableactivofijoSessionBean==null) {
				responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(responsableactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.responsableactivofijoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ResponsableActivoFijoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionResponsableActivoFijo(true);
			//empleadoSessionBean.setlidResponsableActivoFijoActual(this.idResponsableActivoFijoActual);

			responsableactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsableActivoFijo(true);
			responsableactivofijoSessionBean.setlIdResponsableActivoFijoActualForeignKey(this.idResponsableActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ResponsableActivoFijoSessionBean responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		
		if(this.responsableactivofijoSessionBean==null) {
			this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		}
		
		this.responsableactivofijoSessionBean.setsUltimaBusquedaResponsableActivoFijo(this.getsAccionBusqueda());
		this.responsableactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.responsableactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			responsableactivofijoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			responsableactivofijoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			responsableactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			responsableactivofijoSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			responsableactivofijoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ResponsableActivoFijoSessionBean responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		
		if(this.responsableactivofijoSessionBean==null) {
			this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		}
		
		if(this.responsableactivofijoSessionBean.getsUltimaBusquedaResponsableActivoFijo()!=null&&!this.responsableactivofijoSessionBean.getsUltimaBusquedaResponsableActivoFijo().equals("")) {
			this.setsAccionBusqueda(responsableactivofijoSessionBean.getsUltimaBusquedaResponsableActivoFijo());
			this.setiNumeroPaginacion(responsableactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(responsableactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(responsableactivofijoSessionBean.getid_detalle_activo_fijo());
				responsableactivofijoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(responsableactivofijoSessionBean.getid_empleado());
				responsableactivofijoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(responsableactivofijoSessionBean.getid_empresa());
				responsableactivofijoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(responsableactivofijoSessionBean.getid_estructura());
				responsableactivofijoSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(responsableactivofijoSessionBean.getid_sucursal());
				responsableactivofijoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.responsableactivofijoSessionBean.setsUltimaBusquedaResponsableActivoFijo("");
		this.responsableactivofijoSessionBean.setiNumeroPaginacion(ResponsableActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.responsableactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaResponsableActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResponsableActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioResponsableActivoFijo();
		this.updateVisibilidadBusquedasFormularioResponsableActivoFijo();
		this.updateHabilitarBusquedasFormularioResponsableActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioResponsableActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResponsableActivoFijo.getComponents().length>0) {
	

		if(this.responsableactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoResponsableActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoResponsableActivoFijo);
			}
		}

		if(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEmpleadoResponsableActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEmpleadoResponsableActivoFijo);
			}
		}

		if(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEstructuraResponsableActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEstructuraResponsableActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEstructuraResponsableActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResponsableActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResponsableActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoResponsableActivoFijo);
			if(!this.responsableactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoResponsableActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableactivofijoConstantesFunciones.mostrarFK_IdEmpleadoResponsableActivoFijo);
			if(!this.responsableactivofijoConstantesFunciones.mostrarFK_IdEmpleadoResponsableActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEstructuraResponsableActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsableactivofijoConstantesFunciones.mostrarFK_IdEstructuraResponsableActivoFijo);
			if(!this.responsableactivofijoConstantesFunciones.mostrarFK_IdEstructuraResponsableActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasResponsableActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResponsableActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResponsableActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoResponsableActivoFijo);
				this.jTabbedPaneBusquedasResponsableActivoFijo.setEnabledAt(index,this.responsableactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoResponsableActivoFijo);
			}

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableactivofijoConstantesFunciones.activarFK_IdEmpleadoResponsableActivoFijo);
				this.jTabbedPaneBusquedasResponsableActivoFijo.setEnabledAt(index,this.responsableactivofijoConstantesFunciones.activarFK_IdEmpleadoResponsableActivoFijo);
			}

			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEstructuraResponsableActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsableactivofijoConstantesFunciones.activarFK_IdEstructuraResponsableActivoFijo);
				this.jTabbedPaneBusquedasResponsableActivoFijo.setEnabledAt(index,this.responsableactivofijoConstantesFunciones.activarFK_IdEstructuraResponsableActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResponsableActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);

			this.jTabbedPaneBusquedasResponsableActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);

			this.responsableactivofijoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoResponsableActivoFijo(resaltar);

			jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoResponsableActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableActivoFijo);

			this.jTabbedPaneBusquedasResponsableActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);

			this.responsableactivofijoConstantesFunciones.setResaltarFK_IdEmpleadoResponsableActivoFijo(resaltar);

			jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEmpleadoResponsableActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasResponsableActivoFijo.indexOfComponent(this.jPanelFK_IdEstructuraResponsableActivoFijo);

			this.jTabbedPaneBusquedasResponsableActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableActivoFijo.getComponent(index);

			this.responsableactivofijoConstantesFunciones.setResaltarFK_IdEstructuraResponsableActivoFijo(resaltar);

			jPanel.setBorder(this.responsableactivofijoConstantesFunciones.resaltarFK_IdEstructuraResponsableActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarResponsableActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResponsableActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResponsableActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioResponsableActivoFijo();
		this.updateHabilitarResaltarControlesFormularioResponsableActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioResponsableActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.responsableactivofijoConstantesFunciones.resaltaridResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltaridResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarid_empresaResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarid_empresaResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarid_sucursalResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarid_sucursalResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarid_estructuraResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarid_estructuraResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarid_empleadoResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarid_empleadoResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarubicacionResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarubicacionResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltarfechaResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltarfechaResponsableActivoFijo);}
		if(this.responsableactivofijoConstantesFunciones.resaltardescripcionResponsableActivoFijo!=null && this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setBorder(this.responsableactivofijoConstantesFunciones.resaltardescripcionResponsableActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResponsableActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostraridResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelidResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostraridResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_empresaResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelid_empresaResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_empresaResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_sucursalResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelid_sucursalResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_sucursalResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelid_detalle_activo_fijoResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_estructuraResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelid_estructuraResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_estructuraResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_empleadoResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelid_empleadoResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_empleadoResponsableActivoFijo);
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarid_empleadoResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarubicacionResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelubicacionResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarubicacionResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarfechaResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPanelfechaResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrarfechaResponsableActivoFijo);
		//this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrardescripcionResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jPaneldescripcionResponsableActivoFijo.setVisible(this.responsableactivofijoConstantesFunciones.mostrardescripcionResponsableActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResponsableActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormResponsableActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsableActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormResponsableActivoFijo.jLabelidResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activaridResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empresaResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_empresaResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_sucursalResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_sucursalResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_detalle_activo_fijoResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_estructuraResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_estructuraResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jComboBoxid_empleadoResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_empleadoResponsableActivoFijo);
			this.jInternalFrameDetalleFormResponsableActivoFijo.jButtonid_empleadoResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarid_empleadoResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreaubicacionResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarubicacionResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jDateChooserfechaResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activarfechaResponsableActivoFijo);
		this.jInternalFrameDetalleFormResponsableActivoFijo.jTextAreadescripcionResponsableActivoFijo.setEnabled(this.responsableactivofijoConstantesFunciones.activardescripcionResponsableActivoFijo);
		}
	}
	
		
}