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

import com.bydan.erp.nomina.util.PlaniVacacionConstantesFunciones;
import com.bydan.erp.nomina.util.PlaniVacacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.PlaniVacacionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.PlaniVacacionBean;
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
public class PlaniVacacionBeanSwingJInternalFrame extends PlaniVacacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PlaniVacacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PlaniVacacion> planivacacionValidator = new ClassValidator<PlaniVacacion>(PlaniVacacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PlaniVacacion planivacacion;	
	public PlaniVacacion planivacacionAux;
	public PlaniVacacion planivacacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PlaniVacacion planivacacionTotales;
	public Long idPlaniVacacionActual;
	public Long iIdNuevoPlaniVacacion=0L;
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

	public String sFinalQueryComboEstructuraSeccion="";

	public List<Estructura> estructuraseccionsForeignKey;

	public List<Estructura> getestructuraseccionsForeignKey() {
		return estructuraseccionsForeignKey;
	}

	public void setestructuraseccionsForeignKey(List<Estructura> estructuraseccionsForeignKey) {
		this.estructuraseccionsForeignKey = estructuraseccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraseccionForeignKey;

	public Estructura getestructuraseccionForeignKey() {
		return estructuraseccionForeignKey;
	}

	public void setestructuraseccionForeignKey(Estructura estructuraseccionForeignKey) {
		this.estructuraseccionForeignKey = estructuraseccionForeignKey;
	}

	public String sFinalQueryComboEstructuraCargo="";

	public List<Estructura> estructuracargosForeignKey;

	public List<Estructura> getestructuracargosForeignKey() {
		return estructuracargosForeignKey;
	}

	public void setestructuracargosForeignKey(List<Estructura> estructuracargosForeignKey) {
		this.estructuracargosForeignKey = estructuracargosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuracargoForeignKey;

	public Estructura getestructuracargoForeignKey() {
		return estructuracargoForeignKey;
	}

	public void setestructuracargoForeignKey(Estructura estructuracargoForeignKey) {
		this.estructuracargoForeignKey = estructuracargoForeignKey;
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

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoPlaniVacacion;
	public Boolean isPermisoNuevoPlaniVacacion;
	public Boolean isPermisoActualizarPlaniVacacion;
	public Boolean isPermisoActualizarOriginalPlaniVacacion;
	public Boolean isPermisoEliminarPlaniVacacion;
	public Boolean isPermisoGuardarCambiosPlaniVacacion;
	public Boolean isPermisoConsultaPlaniVacacion;
	public Boolean isPermisoBusquedaPlaniVacacion;
	public Boolean isPermisoReportePlaniVacacion;
	public Boolean isPermisoPaginacionMedioPlaniVacacion;
	public Boolean isPermisoPaginacionAltoPlaniVacacion;
	public Boolean isPermisoPaginacionTodoPlaniVacacion;
	public Boolean isPermisoCopiarPlaniVacacion;
	public Boolean isPermisoVerFormPlaniVacacion;
	public Boolean isPermisoDuplicarPlaniVacacion;
	public Boolean isPermisoOrdenPlaniVacacion;
	
	
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
	
	public PlaniVacacionParameterReturnGeneral planivacacionReturnGeneral;
	public PlaniVacacionParameterReturnGeneral planivacacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPlaniVacacion=false;
	public Boolean esParaAccionDesdeFormularioPlaniVacacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PlaniVacacionSessionBeanAdditional planivacacionSessionBeanAdditional=null;
	
	public PlaniVacacionSessionBeanAdditional getPlaniVacacionSessionBeanAdditional() {
		return this.planivacacionSessionBeanAdditional;
	}
	
	public void setPlaniVacacionSessionBeanAdditional(PlaniVacacionSessionBeanAdditional planivacacionSessionBeanAdditional) {
		try {
			this.planivacacionSessionBeanAdditional=planivacacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PlaniVacacionBeanSwingJInternalFrameAdditional planivacacionBeanSwingJInternalFrameAdditional=null;
	//public class PlaniVacacionBeanSwingJInternalFrame
	
	public PlaniVacacionBeanSwingJInternalFrameAdditional getPlaniVacacionBeanSwingJInternalFrameAdditional() {
		return this.planivacacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setPlaniVacacionBeanSwingJInternalFrameAdditional(PlaniVacacionBeanSwingJInternalFrameAdditional planivacacionBeanSwingJInternalFrameAdditional) {
		try {
			this.planivacacionBeanSwingJInternalFrameAdditional=planivacacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PlaniVacacionLogic planivacacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PlaniVacacion planivacacionBean;
	public PlaniVacacionConstantesFunciones planivacacionConstantesFunciones;
	//public PlaniVacacionParameterReturnGeneral planivacacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public EstructuraLogic estructuraseccionLogic;
	public EstructuraLogic estructuracargoLogic;
	public EmpleadoLogic empleadoLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PlaniVacacion> planivacacions;	
	//public List<PlaniVacacion> planivacacionsEliminados;
	//public List<PlaniVacacion> planivacacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPlaniVacacion=false;
	public Boolean isVisibilidadCeldaDuplicarPlaniVacacion=true;
	public Boolean isVisibilidadCeldaCopiarPlaniVacacion=true;
	public Boolean isVisibilidadCeldaVerFormPlaniVacacion=true;
	public Boolean isVisibilidadCeldaOrdenPlaniVacacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
	public Boolean isVisibilidadCeldaModificarPlaniVacacion=false;
	public Boolean isVisibilidadCeldaActualizarPlaniVacacion=false;
	public Boolean isVisibilidadCeldaEliminarPlaniVacacion=false;
	public Boolean isVisibilidadCeldaCancelarPlaniVacacion=false;
	public Boolean isVisibilidadCeldaGuardarPlaniVacacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdEstructuraCargo=false;
	public Boolean isVisibilidadFK_IdEstructuraSeccion=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPlaniVacacion() {
		return this.iIdNuevoPlaniVacacion;
	}

	public void setiIdNuevoPlaniVacacion(Long iIdNuevoPlaniVacacion) {
		this.iIdNuevoPlaniVacacion = iIdNuevoPlaniVacacion;
	}
	
	public Long getidPlaniVacacionActual() {
		return this.idPlaniVacacionActual;
	}

	public void setidPlaniVacacionActual(Long idPlaniVacacionActual) {
		this.idPlaniVacacionActual = idPlaniVacacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PlaniVacacion getplanivacacion() {
		return this.planivacacion;
	}

	public void setplanivacacion(PlaniVacacion planivacacion) {
		this.planivacacion = planivacacion;
	}
	
	public PlaniVacacion getplanivacacionAux() {
		return this.planivacacionAux;
	}

	public void setplanivacacionAux(PlaniVacacion planivacacionAux) {
		this.planivacacionAux = planivacacionAux;
	}				
	
	public PlaniVacacion getplanivacacionAnterior() {
		return this.planivacacionAnterior;
	}

	public void setplanivacacionAnterior(PlaniVacacion planivacacionAnterior) {
		this.planivacacionAnterior = planivacacionAnterior;
	}	
	
	public PlaniVacacion getplanivacacionTotales() {
		return this.planivacacionTotales;
	}

	public void setplanivacacionTotales(PlaniVacacion planivacacionTotales) {
		this.planivacacionTotales = planivacacionTotales;
	}	
	
	public PlaniVacacion getplanivacacionBean() {
		return this.planivacacionBean;
	}

	public void setplanivacacionBean(PlaniVacacion planivacacionBean) {
		this.planivacacionBean = planivacacionBean;
	}	
	
	public PlaniVacacionParameterReturnGeneral getplanivacacionReturnGeneral() {
		return this.planivacacionReturnGeneral;
	}

	public void setplanivacacionReturnGeneral(PlaniVacacionParameterReturnGeneral planivacacionReturnGeneral) {
		this.planivacacionReturnGeneral = planivacacionReturnGeneral;
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

	public Long id_estructura_cargoFK_IdEstructuraCargo=-1L;

	public Long getid_estructura_cargoFK_IdEstructuraCargo() {
		return this.id_estructura_cargoFK_IdEstructuraCargo;
	}

	public void setid_estructura_cargoFK_IdEstructuraCargo(Long id_estructura_cargoFK_IdEstructuraCargo) {
		this.id_estructura_cargoFK_IdEstructuraCargo = id_estructura_cargoFK_IdEstructuraCargo;
	}

	public Long id_estructura_seccionFK_IdEstructuraSeccion=-1L;

	public Long getid_estructura_seccionFK_IdEstructuraSeccion() {
		return this.id_estructura_seccionFK_IdEstructuraSeccion;
	}

	public void setid_estructura_seccionFK_IdEstructuraSeccion(Long id_estructura_seccionFK_IdEstructuraSeccion) {
		this.id_estructura_seccionFK_IdEstructuraSeccion = id_estructura_seccionFK_IdEstructuraSeccion;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
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
	
	
	public PlaniVacacionLogic getPlaniVacacionLogic()	{		
		return planivacacionLogic;
	}

	public void setPlaniVacacionLogic(PlaniVacacionLogic planivacacionLogic) {
		this.planivacacionLogic = planivacacionLogic;
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
	
	public Boolean getIsEsNuevoPlaniVacacion() {
		return isEsNuevoPlaniVacacion;
	}

	public void setIsEsNuevoPlaniVacacion(Boolean isEsNuevoPlaniVacacion) {
		this.isEsNuevoPlaniVacacion = isEsNuevoPlaniVacacion;
	}

	public Boolean getEsParaAccionDesdeFormularioPlaniVacacion() {
		return esParaAccionDesdeFormularioPlaniVacacion;
	}
	
	public void setEsParaAccionDesdeFormularioPlaniVacacion(Boolean esParaAccionDesdeFormularioPlaniVacacion) {
		this.esParaAccionDesdeFormularioPlaniVacacion = esParaAccionDesdeFormularioPlaniVacacion;
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

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(planivacacionSessionBean.getlidEmpresaActual());
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

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(planivacacionSessionBean.getlidSucursalActual());
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

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(planivacacionSessionBean.getlidEstructuraActual());
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

	public void cargarCombosEstructuraSeccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructuraseccionsForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraseccionLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructuraseccionsForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructuraSeccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(planivacacionSessionBean.getlidEstructuraSeccionActual());
					this.estructuraseccionsForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosEstructuraCargosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructuracargosForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraCargo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuracargoLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructuracargosForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructuraCargo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(planivacacionSessionBean.getlidEstructuraCargoActual());
					this.estructuracargosForeignKey.add(estructuraLogic.getEstructura());
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

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(planivacacionSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(planivacacionSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.planivacacion!=null) {
						this.planivacacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPlaniVacacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPlaniVacacionGenerico)throws Exception
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
				jComboBoxid_empresaPlaniVacacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPlaniVacacionGenerico!=null && jComboBoxid_empresaPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaPlaniVacacionGenerico.setSelectedIndex(0);
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

					if(this.planivacacion!=null) {
						this.planivacacion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPlaniVacacion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPlaniVacacionGenerico)throws Exception
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
				jComboBoxid_sucursalPlaniVacacionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPlaniVacacionGenerico!=null && jComboBoxid_sucursalPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPlaniVacacionGenerico.setSelectedIndex(0);
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

					if(this.planivacacion!=null) {
						this.planivacacion.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraPlaniVacacion.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion!=null) {
						jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraPlaniVacacionGenerico)throws Exception
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
				jComboBoxid_estructuraPlaniVacacionGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraPlaniVacacionGenerico!=null && jComboBoxid_estructuraPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_estructuraPlaniVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraSeccionForeignKey(Long idEstructuraSeccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraseccionTemp!=null) {

					if(this.planivacacion!=null) {
						this.planivacacion.setEstructuraSeccion(estructuraseccionTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setSelectedItem(estructuraseccionTemp);
					}
				} else {
					//jComboBoxid_estructura_seccionPlaniVacacion.setSelectedItem(estructuraseccionTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructuraSeccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraseccionTemp!=null && jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion!=null) {
						jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setSelectedItem(estructuraseccionTemp);
					} else {
						if(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion!=null) {
							//jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setSelectedItem(estructuraseccionTemp);
							if(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.getItemCount()>0) {
								jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setSelectedIndex(0);
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

	public String getActualEstructuraSeccionForeignKeyDescripcion(Long idEstructuraSeccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraseccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraSeccionForeignKeyGenerico(Long idEstructuraSeccionSeleccionado,JComboBox jComboBoxid_estructura_seccionPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}

			if(estructuraseccionTemp!=null) {
				jComboBoxid_estructura_seccionPlaniVacacionGenerico.setSelectedItem(estructuraseccionTemp);
			} else {
				if(jComboBoxid_estructura_seccionPlaniVacacionGenerico!=null && jComboBoxid_estructura_seccionPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_estructura_seccionPlaniVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraCargoForeignKey(Long idEstructuraCargoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuracargoTemp=null;

			for(Estructura estructuracargoAux:estructuracargosForeignKey) {
				if(estructuracargoAux.getId()!=null && estructuracargoAux.getId().equals(idEstructuraCargoSeleccionado)) {
					estructuracargoTemp=estructuracargoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuracargoTemp!=null) {

					if(this.planivacacion!=null) {
						this.planivacacion.setEstructuraCargo(estructuracargoTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setSelectedItem(estructuracargoTemp);
					}
				} else {
					//jComboBoxid_estructura_cargoPlaniVacacion.setSelectedItem(estructuracargoTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructuraCargo") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuracargoTemp!=null && jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion!=null) {
						jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setSelectedItem(estructuracargoTemp);
					} else {
						if(jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion!=null) {
							//jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setSelectedItem(estructuracargoTemp);
							if(jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.getItemCount()>0) {
								jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setSelectedIndex(0);
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

	public String getActualEstructuraCargoForeignKeyDescripcion(Long idEstructuraCargoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuracargoTemp=null;

			for(Estructura estructuracargoAux:estructuracargosForeignKey) {
				if(estructuracargoAux.getId()!=null && estructuracargoAux.getId().equals(idEstructuraCargoSeleccionado)) {
					estructuracargoTemp=estructuracargoAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuracargoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraCargoForeignKeyGenerico(Long idEstructuraCargoSeleccionado,JComboBox jComboBoxid_estructura_cargoPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuracargoTemp=null;

			for(Estructura estructuracargoAux:estructuracargosForeignKey) {
				if(estructuracargoAux.getId()!=null && estructuracargoAux.getId().equals(idEstructuraCargoSeleccionado)) {
					estructuracargoTemp=estructuracargoAux;
					break;
				}
			}

			if(estructuracargoTemp!=null) {
				jComboBoxid_estructura_cargoPlaniVacacionGenerico.setSelectedItem(estructuracargoTemp);
			} else {
				if(jComboBoxid_estructura_cargoPlaniVacacionGenerico!=null && jComboBoxid_estructura_cargoPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_estructura_cargoPlaniVacacionGenerico.setSelectedIndex(0);
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

					if(this.planivacacion!=null) {
						this.planivacacion.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPlaniVacacion.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPlaniVacacionGenerico)throws Exception
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
				jComboBoxid_empleadoPlaniVacacionGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPlaniVacacionGenerico!=null && jComboBoxid_empleadoPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPlaniVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.planivacacion!=null) {
						this.planivacacion.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPlaniVacacion.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
						if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesPlaniVacacion!=null) {
						jComboBoxid_mesFK_IdMesPlaniVacacion.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesPlaniVacacion!=null) {
							//jComboBoxid_mesFK_IdMesPlaniVacacion.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesPlaniVacacion.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesPlaniVacacion.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesPlaniVacacionGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPlaniVacacionGenerico!=null && jComboBoxid_mesPlaniVacacionGenerico.getItemCount()>0) {
					jComboBoxid_mesPlaniVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_empresaPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPlaniVacacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPlaniVacacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				planivacacion.setid_empresa(empresaAux.getId());
				planivacacion.setempresa_descripcion(PlaniVacacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				planivacacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_sucursalPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPlaniVacacionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPlaniVacacionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				planivacacion.setid_sucursal(sucursalAux.getId());
				planivacacion.setsucursal_descripcion(PlaniVacacionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				planivacacion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_estructuraPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraPlaniVacacionGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraPlaniVacacionGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				planivacacion.setid_estructura(estructuraAux.getId());
				planivacacion.setestructura_descripcion(PlaniVacacionConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				planivacacion.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraSeccionForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_estructura_seccionPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructura_seccionPlaniVacacionGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructura_seccionPlaniVacacionGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				planivacacion.setid_estructura_seccion(estructuraAux.getId());
				planivacacion.setestructuraseccion_descripcion(PlaniVacacionConstantesFunciones.getEstructuraSeccionDescripcion(estructuraAux));
				planivacacion.setEstructuraSeccion(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraCargoForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_estructura_cargoPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructura_cargoPlaniVacacionGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructura_cargoPlaniVacacionGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				planivacacion.setid_estructura_cargo(estructuraAux.getId());
				planivacacion.setestructuracargo_descripcion(PlaniVacacionConstantesFunciones.getEstructuraCargoDescripcion(estructuraAux));
				planivacacion.setEstructuraCargo(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_empleadoPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPlaniVacacionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPlaniVacacionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				planivacacion.setid_empleado(empleadoAux.getId());
				planivacacion.setempleado_descripcion(PlaniVacacionConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				planivacacion.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PlaniVacacion planivacacion,JComboBox jComboBoxid_mesPlaniVacacionGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPlaniVacacionGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPlaniVacacionGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				planivacacion.setid_mes(mesAux.getId());
				planivacacion.setmes_descripcion(PlaniVacacionConstantesFunciones.getMesDescripcion(mesAux));
				planivacacion.setMes(mesAux);			}
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

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.addItem(estructura);
							}
						}

						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructuraSeccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.removeAllItems();

							for(Estructura estructuraseccion:this.estructuraseccionsForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.addItem(estructuraseccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructuraSeccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.removeAllItems();

							for(Estructura estructuraseccion:this.estructuraseccionsForeignKey) {
								this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.addItem(estructuraseccion);
							}
						}

						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructuraCargosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.removeAllItems();

							for(Estructura estructuracargo:this.estructuracargosForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.addItem(estructuracargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructuraCargo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.removeAllItems();

							for(Estructura estructuracargo:this.estructuracargosForeignKey) {
								this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.addItem(estructuracargo);
							}
						}

						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.addItem(empleado);
							}
						}

						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { 
					}

					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesPlaniVacacion.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesPlaniVacacion.addItem(mes);
							}
						}

						if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraSeccionForeignKey(Estructura estructuraseccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setSelectedItem(estructuraseccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setSelectedItem(estructuraseccion);
						} else {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraCargoForeignKey(Estructura estructuracargo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setSelectedItem(estructuracargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setSelectedItem(estructuracargo);
						} else {
							this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesPlaniVacacion.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesPlaniVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPlaniVacacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PlaniVacacionConstantesFunciones.refrescarForeignKeysDescripcionesPlaniVacacion(this.planivacacionLogic.getPlaniVacacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PlaniVacacionConstantesFunciones.refrescarForeignKeysDescripcionesPlaniVacacion(this.planivacacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//planivacacionLogic.setPlaniVacacions(this.planivacacions);
			planivacacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PlaniVacacionParameterReturnGeneral getPlaniVacacionParameterGeneral() {
		return this.planivacacionParameterGeneral;
	}
	
	public void setPlaniVacacionParameterGeneral(PlaniVacacionParameterReturnGeneral planivacacionParameterGeneral) {
		this.planivacacionParameterGeneral = planivacacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPlaniVacacion() {
		return isPermisoTodoPlaniVacacion;
	}

	public void setIsPermisoTodoPlaniVacacion(Boolean isPermisoTodoPlaniVacacion) {
		this.isPermisoTodoPlaniVacacion = isPermisoTodoPlaniVacacion;
	}

	public Boolean getIsPermisoNuevoPlaniVacacion() {
		return isPermisoNuevoPlaniVacacion;
	}

	public void setIsPermisoNuevoPlaniVacacion(Boolean isPermisoNuevoPlaniVacacion) {
		this.isPermisoNuevoPlaniVacacion = isPermisoNuevoPlaniVacacion;
	}

	public Boolean getIsPermisoActualizarPlaniVacacion() {
		return isPermisoActualizarPlaniVacacion;
	}

	public void setIsPermisoActualizarPlaniVacacion(Boolean isPermisoActualizarPlaniVacacion) {
		this.isPermisoActualizarPlaniVacacion = isPermisoActualizarPlaniVacacion;
	}

	public Boolean getIsPermisoEliminarPlaniVacacion() {
		return isPermisoEliminarPlaniVacacion;
	}

	public void setIsPermisoEliminarPlaniVacacion(Boolean isPermisoEliminarPlaniVacacion) {
		this.isPermisoEliminarPlaniVacacion = isPermisoEliminarPlaniVacacion;
	}

	public Boolean getIsPermisoGuardarCambiosPlaniVacacion() {
		return isPermisoGuardarCambiosPlaniVacacion;
	}

	public void setIsPermisoGuardarCambiosPlaniVacacion(Boolean isPermisoGuardarCambiosPlaniVacacion) {
		this.isPermisoGuardarCambiosPlaniVacacion = isPermisoGuardarCambiosPlaniVacacion;
	}
	
	public Boolean getIsPermisoConsultaPlaniVacacion() {
		return isPermisoConsultaPlaniVacacion;
	}

	public void setIsPermisoConsultaPlaniVacacion(Boolean isPermisoConsultaPlaniVacacion) {
		this.isPermisoConsultaPlaniVacacion = isPermisoConsultaPlaniVacacion;
	}

	public Boolean getIsPermisoBusquedaPlaniVacacion() {
		return isPermisoBusquedaPlaniVacacion;
	}

	public void setIsPermisoBusquedaPlaniVacacion(Boolean isPermisoBusquedaPlaniVacacion) {
		this.isPermisoBusquedaPlaniVacacion = isPermisoBusquedaPlaniVacacion;
	}

	public Boolean getIsPermisoReportePlaniVacacion() {
		return isPermisoReportePlaniVacacion;
	}

	public void setIsPermisoReportePlaniVacacion(Boolean isPermisoReportePlaniVacacion) {
		this.isPermisoReportePlaniVacacion = isPermisoReportePlaniVacacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioPlaniVacacion() {
		return isPermisoPaginacionMedioPlaniVacacion;
	}

	public void setIsPermisoPaginacionMedioPlaniVacacion(Boolean isPermisoPaginacionMedioPlaniVacacion) {
		this.isPermisoPaginacionMedioPlaniVacacion = isPermisoPaginacionMedioPlaniVacacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoPlaniVacacion() {
		return isPermisoPaginacionTodoPlaniVacacion;
	}

	public void setIsPermisoPaginacionTodoPlaniVacacion(Boolean isPermisoPaginacionTodoPlaniVacacion) {
		this.isPermisoPaginacionTodoPlaniVacacion = isPermisoPaginacionTodoPlaniVacacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoPlaniVacacion() {
		return isPermisoPaginacionAltoPlaniVacacion;
	}

	public void setIsPermisoPaginacionAltoPlaniVacacion(Boolean isPermisoPaginacionAltoPlaniVacacion) {
		this.isPermisoPaginacionAltoPlaniVacacion = isPermisoPaginacionAltoPlaniVacacion;
	}
	
	public Boolean getIsPermisoCopiarPlaniVacacion() {
		return isPermisoCopiarPlaniVacacion;
	}

	public void setIsPermisoCopiarPlaniVacacion(Boolean isPermisoCopiarPlaniVacacion) {
		this.isPermisoCopiarPlaniVacacion = isPermisoCopiarPlaniVacacion;
	}
	
	public Boolean getIsPermisoVerFormPlaniVacacion() {
		return isPermisoVerFormPlaniVacacion;
	}

	public void setIsPermisoVerFormPlaniVacacion(Boolean isPermisoVerFormPlaniVacacion) {
		this.isPermisoVerFormPlaniVacacion = isPermisoVerFormPlaniVacacion;
	}
	
	public Boolean getIsPermisoDuplicarPlaniVacacion() {
		return isPermisoDuplicarPlaniVacacion;
	}

	public void setIsPermisoDuplicarPlaniVacacion(Boolean isPermisoDuplicarPlaniVacacion) {
		this.isPermisoDuplicarPlaniVacacion = isPermisoDuplicarPlaniVacacion;
	}
	
	public Boolean getIsPermisoOrdenPlaniVacacion() {
		return isPermisoOrdenPlaniVacacion;
	}

	public void setIsPermisoOrdenPlaniVacacion(Boolean isPermisoOrdenPlaniVacacion) {
		this.isPermisoOrdenPlaniVacacion = isPermisoOrdenPlaniVacacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPlaniVacacion() {
		return isVisibilidadCeldaNuevoPlaniVacacion;
	}

	public void setIsVisibilidadCeldaNuevoPlaniVacacion(Boolean isVisibilidadCeldaNuevoPlaniVacacion) {
		this.isVisibilidadCeldaNuevoPlaniVacacion = isVisibilidadCeldaNuevoPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPlaniVacacion() {
		return isVisibilidadCeldaDuplicarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaDuplicarPlaniVacacion(Boolean isVisibilidadCeldaDuplicarPlaniVacacion) {
		this.isVisibilidadCeldaDuplicarPlaniVacacion = isVisibilidadCeldaDuplicarPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPlaniVacacion() {
		return isVisibilidadCeldaCopiarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaCopiarPlaniVacacion(Boolean isVisibilidadCeldaCopiarPlaniVacacion) {
		this.isVisibilidadCeldaCopiarPlaniVacacion = isVisibilidadCeldaCopiarPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPlaniVacacion() {
		return isVisibilidadCeldaVerFormPlaniVacacion;
	}

	public void setIsVisibilidadCeldaVerFormPlaniVacacion(Boolean isVisibilidadCeldaVerFormPlaniVacacion) {
		this.isVisibilidadCeldaVerFormPlaniVacacion = isVisibilidadCeldaVerFormPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPlaniVacacion() {
		return isVisibilidadCeldaOrdenPlaniVacacion;
	}

	public void setIsVisibilidadCeldaOrdenPlaniVacacion(Boolean isVisibilidadCeldaOrdenPlaniVacacion) {
		this.isVisibilidadCeldaOrdenPlaniVacacion = isVisibilidadCeldaOrdenPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPlaniVacacion() {
		return isVisibilidadCeldaNuevoRelacionesPlaniVacacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPlaniVacacion(Boolean isVisibilidadCeldaNuevoRelacionesPlaniVacacion) {
		this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion = isVisibilidadCeldaNuevoRelacionesPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPlaniVacacion() {
		return isVisibilidadCeldaModificarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaModificarPlaniVacacion(Boolean isVisibilidadCeldaModificarPlaniVacacion) {
		this.isVisibilidadCeldaModificarPlaniVacacion = isVisibilidadCeldaModificarPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPlaniVacacion() {
		return isVisibilidadCeldaActualizarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaActualizarPlaniVacacion(Boolean isVisibilidadCeldaActualizarPlaniVacacion) {
		this.isVisibilidadCeldaActualizarPlaniVacacion = isVisibilidadCeldaActualizarPlaniVacacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarPlaniVacacion() {
		return isVisibilidadCeldaEliminarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaEliminarPlaniVacacion(Boolean isVisibilidadCeldaEliminarPlaniVacacion) {
		this.isVisibilidadCeldaEliminarPlaniVacacion = isVisibilidadCeldaEliminarPlaniVacacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarPlaniVacacion() {
		return isVisibilidadCeldaCancelarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaCancelarPlaniVacacion(Boolean isVisibilidadCeldaCancelarPlaniVacacion) {
		this.isVisibilidadCeldaCancelarPlaniVacacion = isVisibilidadCeldaCancelarPlaniVacacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarPlaniVacacion() {
		return isVisibilidadCeldaGuardarPlaniVacacion;
	}

	public void setIsVisibilidadCeldaGuardarPlaniVacacion(Boolean isVisibilidadCeldaGuardarPlaniVacacion) {
		this.isVisibilidadCeldaGuardarPlaniVacacion = isVisibilidadCeldaGuardarPlaniVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPlaniVacacion() {
		return isVisibilidadCeldaGuardarCambiosPlaniVacacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPlaniVacacion(Boolean isVisibilidadCeldaGuardarCambiosPlaniVacacion) {
		this.isVisibilidadCeldaGuardarCambiosPlaniVacacion = isVisibilidadCeldaGuardarCambiosPlaniVacacion;
	}
		
	public PlaniVacacionSessionBean getplanivacacionSessionBean() {
		return this.planivacacionSessionBean;
	}
	
	public void setplanivacacionSessionBean(PlaniVacacionSessionBean planivacacionSessionBean) {
		this.planivacacionSessionBean=planivacacionSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstructuraCargo() {
		return this.isVisibilidadFK_IdEstructuraCargo;
	}

	public void setisVisibilidadFK_IdEstructuraCargo(Boolean isVisibilidadFK_IdEstructuraCargo) {
		this.isVisibilidadFK_IdEstructuraCargo=isVisibilidadFK_IdEstructuraCargo;
	}

	public Boolean getisVisibilidadFK_IdEstructuraSeccion() {
		return this.isVisibilidadFK_IdEstructuraSeccion;
	}

	public void setisVisibilidadFK_IdEstructuraSeccion(Boolean isVisibilidadFK_IdEstructuraSeccion) {
		this.isVisibilidadFK_IdEstructuraSeccion=isVisibilidadFK_IdEstructuraSeccion;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(PlaniVacacion planivacacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(planivacacion,null);
				this.setActualParaGuardarSucursalForeignKey(planivacacion,null);
				this.setActualParaGuardarEstructuraForeignKey(planivacacion,null);
				this.setActualParaGuardarEstructuraSeccionForeignKey(planivacacion,null);
				this.setActualParaGuardarEstructuraCargoForeignKey(planivacacion,null);
				this.setActualParaGuardarEmpleadoForeignKey(planivacacion,null);
				this.setActualParaGuardarMesForeignKey(planivacacion,null);
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
	
	public void bugActualizarReferenciaActual(PlaniVacacion planivacacion,PlaniVacacion planivacacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPlaniVacacion(planivacacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		planivacacionAux.setId(planivacacion.getId());
		planivacacionAux.setVersionRow(planivacacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPlaniVacacion();
		
			int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = planivacacionValidator.getInvalidValues(this.planivacacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			planivacacionLogic.setDatosCliente(datosCliente);
			planivacacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				planivacacionAux=new  PlaniVacacion();
				
				planivacacionAux.setIsNew(true);
				planivacacionAux.setIsChanged(true);
				
				planivacacionAux.setPlaniVacacionOriginal(this.planivacacion);
				
				planivacacionAux.setId(this.planivacacion.getId());	
				planivacacionAux.setVersionRow(this.planivacacion.getVersionRow());	
				planivacacionAux.setid_empresa(this.planivacacion.getid_empresa());	
				planivacacionAux.setid_sucursal(this.planivacacion.getid_sucursal());	
				planivacacionAux.setid_estructura(this.planivacacion.getid_estructura());	
				planivacacionAux.setid_estructura_seccion(this.planivacacion.getid_estructura_seccion());	
				planivacacionAux.setid_estructura_cargo(this.planivacacion.getid_estructura_cargo());	
				planivacacionAux.setid_empleado(this.planivacacion.getid_empleado());	
				planivacacionAux.setfecha_inicio(this.planivacacion.getfecha_inicio());	
				planivacacionAux.setfecha_fin(this.planivacacion.getfecha_fin());	
				planivacacionAux.setid_mes(this.planivacacion.getid_mes());	
				planivacacionAux.setdias_anio(this.planivacacion.getdias_anio());	
				planivacacionAux.setdias_realizadas(this.planivacacion.getdias_realizadas());	
				planivacacionAux.setdias_pendiente(this.planivacacion.getdias_pendiente());	
				planivacacionAux.setdias_tomados(this.planivacacion.getdias_tomados());	
				planivacacionAux.setdias_anticipadas(this.planivacacion.getdias_anticipadas());	
				planivacacionAux.setdescripcion(this.planivacacion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planivacacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planivacacionAux,planivacacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planivacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.savePlaniVacacions();//WithConnection
						//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);
					
					this.refrescarForeignKeysDescripcionesPlaniVacacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planivacacionLogic.savePlaniVacacionRelaciones(planivacacionAux);//WithConnection
								//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.planivacacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(planivacacionAux,planivacacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				planivacacionAux=new  PlaniVacacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.planivacacionSessionBean.getEsGuardarRelacionado() 
					|| (this.planivacacionSessionBean.getEsGuardarRelacionado() && this.planivacacion.getId()>=0)) {
						
					planivacacionAux.setIsNew(false);
				}
				
				planivacacionAux.setIsDeleted(false);
			
				planivacacionAux.setId(this.planivacacion.getId());	
				planivacacionAux.setVersionRow(this.planivacacion.getVersionRow());	
				planivacacionAux.setid_empresa(this.planivacacion.getid_empresa());	
				planivacacionAux.setid_sucursal(this.planivacacion.getid_sucursal());	
				planivacacionAux.setid_estructura(this.planivacacion.getid_estructura());	
				planivacacionAux.setid_estructura_seccion(this.planivacacion.getid_estructura_seccion());	
				planivacacionAux.setid_estructura_cargo(this.planivacacion.getid_estructura_cargo());	
				planivacacionAux.setid_empleado(this.planivacacion.getid_empleado());	
				planivacacionAux.setfecha_inicio(this.planivacacion.getfecha_inicio());	
				planivacacionAux.setfecha_fin(this.planivacacion.getfecha_fin());	
				planivacacionAux.setid_mes(this.planivacacion.getid_mes());	
				planivacacionAux.setdias_anio(this.planivacacion.getdias_anio());	
				planivacacionAux.setdias_realizadas(this.planivacacion.getdias_realizadas());	
				planivacacionAux.setdias_pendiente(this.planivacacion.getdias_pendiente());	
				planivacacionAux.setdias_tomados(this.planivacacion.getdias_tomados());	
				planivacacionAux.setdias_anticipadas(this.planivacacion.getdias_anticipadas());	
				planivacacionAux.setdescripcion(this.planivacacion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planivacacionAux,planivacacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planivacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.savePlaniVacacions();//WithConnection
						//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);
					
					this.refrescarForeignKeysDescripcionesPlaniVacacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planivacacionLogic.savePlaniVacacionRelaciones(planivacacionAux);//WithConnection
								//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.planivacacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(planivacacionAux,planivacacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.planivacacion,planivacacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				planivacacionAux=new  PlaniVacacion();
				
				planivacacionAux.setIsNew(false);
				planivacacionAux.setIsChanged(false);
				
				planivacacionAux.setIsDeleted(true);
				
				planivacacionAux.setId(this.planivacacion.getId());	
				planivacacionAux.setVersionRow(this.planivacacion.getVersionRow());	
				planivacacionAux.setid_empresa(this.planivacacion.getid_empresa());	
				planivacacionAux.setid_sucursal(this.planivacacion.getid_sucursal());	
				planivacacionAux.setid_estructura(this.planivacacion.getid_estructura());	
				planivacacionAux.setid_estructura_seccion(this.planivacacion.getid_estructura_seccion());	
				planivacacionAux.setid_estructura_cargo(this.planivacacion.getid_estructura_cargo());	
				planivacacionAux.setid_empleado(this.planivacacion.getid_empleado());	
				planivacacionAux.setfecha_inicio(this.planivacacion.getfecha_inicio());	
				planivacacionAux.setfecha_fin(this.planivacacion.getfecha_fin());	
				planivacacionAux.setid_mes(this.planivacacion.getid_mes());	
				planivacacionAux.setdias_anio(this.planivacacion.getdias_anio());	
				planivacacionAux.setdias_realizadas(this.planivacacion.getdias_realizadas());	
				planivacacionAux.setdias_pendiente(this.planivacacion.getdias_pendiente());	
				planivacacionAux.setdias_tomados(this.planivacacion.getdias_tomados());	
				planivacacionAux.setdias_anticipadas(this.planivacacion.getdias_anticipadas());	
				planivacacionAux.setdescripcion(this.planivacacion.getdescripcion());	
				
				if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.planivacacionAux.getId()>=0) {	
						this.planivacacionsEliminados.add(planivacacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planivacacionAux,planivacacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planivacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.savePlaniVacacions();//WithConnection
						//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planivacacionLogic.savePlaniVacacionRelaciones(planivacacionAux);//WithConnection
								//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
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
							if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.planivacacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(planivacacionAux,planivacacionLogic.getPlaniVacacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(planivacacionAux,planivacacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getPlaniVacacions().addAll(this.planivacacionsEliminados);
					
					planivacacionLogic.savePlaniVacacions();//WithConnection
					//planivacacionLogic.getSetVersionRowPlaniVacacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPlaniVacacion();
				
				this.planivacacionsEliminados= new ArrayList<PlaniVacacion>();		
			}
			
			if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Plani Vacacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.planivacacion=planivacacionAux;
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
      		//this.finishProcessPlaniVacacion();
      	}
		
	}	
	
	public void actualizarRelaciones(PlaniVacacion planivacacionLocal) throws Exception {
		
		if(this.planivacacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PlaniVacacion planivacacionLocal) throws Exception {	
		if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				planivacacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				planivacacionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				planivacacionLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraseccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraseccionBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraseccionBeanSwingJInternalFrameLocal.actualizarLista(estructuraseccionBeanSwingJInternalFrameLocal.estructura,this.estructuraseccionsForeignKey);

				estructuraseccionBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraseccionBeanSwingJInternalFrameLocal.estructura);

				planivacacionLocal.setEstructuraSeccion(estructuraseccionBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructuraSeccion();
				this.cargarCombosFrameEstructuraSeccionsForeignKey("Formulario");
				this.setActualEstructuraSeccionForeignKey(estructuraseccionBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuracargoBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuracargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuracargoBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuracargoBeanSwingJInternalFrameLocal.actualizarLista(estructuracargoBeanSwingJInternalFrameLocal.estructura,this.estructuracargosForeignKey);

				estructuracargoBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuracargoBeanSwingJInternalFrameLocal.estructura);

				planivacacionLocal.setEstructuraCargo(estructuracargoBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructuraCargo();
				this.cargarCombosFrameEstructuraCargosForeignKey("Formulario");
				this.setActualEstructuraCargoForeignKey(estructuracargoBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				planivacacionLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				planivacacionLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPlaniVacacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = planivacacionValidator.getInvalidValues(this.planivacacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PlaniVacacion planivacacion,List<PlaniVacacion> planivacacions) throws Exception {
		try	{		
			PlaniVacacionConstantesFunciones.actualizarLista(planivacacion,planivacacions,this.planivacacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PlaniVacacion planivacacion,List<PlaniVacacion> planivacacions) throws Exception {
		try	{			
			PlaniVacacionConstantesFunciones.actualizarSelectedLista(planivacacion,planivacacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PlaniVacacion> planivacacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				planivacacionsLocal=this.planivacacionLogic.getPlaniVacacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				planivacacionsLocal=this.planivacacions;
			}
			//ARCHITECTURE
		
			for(PlaniVacacion planivacacionLocal:planivacacionsLocal) {
				if(this.permiteMantenimiento(planivacacionLocal) && planivacacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PlaniVacacionConstantesFunciones.getPlaniVacacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_empresaPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_sucursalPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructuraPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDESTRUCTURASECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructura_seccionPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDESTRUCTURACARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructura_cargoPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_empleadoPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_inicioPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_finPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_mesPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DIASANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anioPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DIASREALIZADAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_realizadasPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DIASPENDIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_pendientePlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DIASTOMADOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_tomadosPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DIASANTICIPADAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anticipadasPlaniVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaniVacacionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldescripcionPlaniVacacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_empresaPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_sucursalPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructuraPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructura_seccionPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_estructura_cargoPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_empleadoPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_inicioPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_finPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabelid_mesPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anioPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_realizadasPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_pendientePlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_tomadosPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anticipadasPlaniVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldescripcionPlaniVacacion,"");
		
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
		this.iIdNuevoPlaniVacacion--;	
		
		
		this.planivacacionAux=new PlaniVacacion();
		
		this.planivacacionAux.setId(this.iIdNuevoPlaniVacacion);
		this.planivacacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planivacacionLogic.getPlaniVacacions().add(this.planivacacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.planivacacions.add(this.planivacacionAux);
		}
		//ARCHITECTURE
		
		this.planivacacion=this.planivacacionAux;
		
		if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPlaniVacacion(this.planivacacion);
			this.setVariablesObjetoActualToFormularioForeignKeyPlaniVacacion(this.planivacacion);
		}
				
		//this.setDefaultControlesPlaniVacacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPlaniVacacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPlaniVacacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaniVacacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaniVacacion(this.planivacacionBean,this.planivacacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PlaniVacacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
			classes=PlaniVacacionConstantesFunciones.getClassesRelationshipsOfPlaniVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.planivacacionReturnGeneral=planivacacionLogic.procesarEventosPlaniVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planivacacionLogic.getPlaniVacacions(),this.planivacacion,this.planivacacionParameterGeneral,this.isEsNuevoPlaniVacacion,classes);//this.planivacacionLogic.getPlaniVacacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPlaniVacacion(this.planivacacionReturnGeneral,this.planivacacionBean,false);
		
		if(this.planivacacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion());
		}
		
		if(this.planivacacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion(),classes);//this.planivacacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPlaniVacacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPlaniVacacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.RecargarFormPlaniVacacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPlaniVacacion(false);
						
			if(planivacacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaniVacacion();
			}
			
			this.actualizarVisualTableDatosPlaniVacacion();
			
			this.jTableDatosPlaniVacacion.setRowSelectionInterval(this.getIndiceNuevoPlaniVacacion(), this.getIndiceNuevoPlaniVacacion());
			
			this.seleccionarFilaTablaPlaniVacacionActual();
						
			this.actualizarEstadoCeldasBotonesPlaniVacacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPlaniVacacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarfecha_inicioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarfecha_finPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardias_anioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardias_realizadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardias_pendientePlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardias_tomadosPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardias_anticipadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activardescripcionPlaniVacacion);	
		//
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_empresaPlaniVacacion);//
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_sucursalPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_estructuraPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_estructura_seccionPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_estructura_cargoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_empleadoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setEnabled(isHabilitar && this.planivacacionConstantesFunciones.activarid_mesPlaniVacacion);
	};
	
	public void setDefaultControlesPlaniVacacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPlaniVacacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.planivacacionSessionBean.setConGuardarRelaciones(true);			
			this.planivacacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.setVisible(true);
			
					
		} else {
			//this.planivacacionSessionBean.setConGuardarRelaciones(false);			
			this.planivacacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPlaniVacacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
				if(planivacacionAux.getId().equals(this.iIdNuevoPlaniVacacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaniVacacion planivacacionAux:this.planivacacions) {
				if(planivacacionAux.getId().equals(this.iIdNuevoPlaniVacacion)) {
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
	
	public int getIndiceActualPlaniVacacion(PlaniVacacion planivacacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
				if(planivacacionAux.getId().equals(planivacacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaniVacacion planivacacionAux:this.planivacacions) {
				if(planivacacionAux.getId().equals(planivacacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPlaniVacacion(PlaniVacacion planivacacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
				if(planivacacionAux.getPlaniVacacionOriginal().getId().equals(planivacacionOriginal.getId())) {
					existe=true;
					planivacacionOriginal.setId(planivacacionAux.getId());
					planivacacionOriginal.setVersionRow(planivacacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaniVacacion planivacacionAux:this.planivacacions) {
				if(planivacacionAux.getPlaniVacacionOriginal().getId().equals(planivacacionOriginal.getId())) {
					existe=true;
					planivacacionOriginal.setId(planivacacionAux.getId());
					planivacacionOriginal.setVersionRow(planivacacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPlaniVacacion(Boolean esParaCancelar) throws Exception {
		planivacacionsAux=new ArrayList<PlaniVacacion>();
		planivacacionAux=new PlaniVacacion();
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
					if(planivacacionAux.getId()<0) {
						planivacacionsAux.add(planivacacionAux);
					}		
				}
				this.iIdNuevoPlaniVacacion=0L;
				this.planivacacionLogic.getPlaniVacacions().removeAll(planivacacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaniVacacion planivacacionAux:this.planivacacions) {
					if(planivacacionAux.getId()<0) {
						planivacacionsAux.add(planivacacionAux);
					}		
				}
				this.iIdNuevoPlaniVacacion=0L;
				this.planivacacions.removeAll(planivacacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPlaniVacacion 
					&& this.planivacacionLogic.getPlaniVacacions().size()>0
					) {
					planivacacionAux=this.planivacacionLogic.getPlaniVacacions().get(this.planivacacionLogic.getPlaniVacacions().size() - 1);
				
					if(planivacacionAux.getId()<0) {
						this.planivacacionLogic.getPlaniVacacions().remove(planivacacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPlaniVacacion && this.planivacacions.size()>0) {
					planivacacionAux=this.planivacacions.get(this.planivacacions.size() - 1);
				
					if(planivacacionAux.getId()<0) {
						this.planivacacions.remove(planivacacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPlaniVacacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(planivacacion.getId()<0) {
				this.planivacacionLogic.getPlaniVacacions().remove(this.planivacacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(planivacacion.getId()<0) {
				this.planivacacions.remove(this.planivacacion);
			}
		}			
	}
	
	public void setEstadosInicialesPlaniVacacion(List<PlaniVacacion> planivacacionsAux) throws Exception {
		PlaniVacacionConstantesFunciones.setEstadosInicialesPlaniVacacion(planivacacionsAux);
	}
	
	public void setEstadosInicialesPlaniVacacion(PlaniVacacion planivacacionAux) throws Exception {
		PlaniVacacionConstantesFunciones.setEstadosInicialesPlaniVacacion(planivacacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPlaniVacacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPlaniVacacionActual()) {
				if(!this.isEsNuevoPlaniVacacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPlaniVacacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPlaniVacacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Plani Vacacion ?", "MANTENIMIENTO DE Plani Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PlaniVacacion planivacacion) throws Exception {
		PlaniVacacionConstantesFunciones.seleccionarAsignar(this.planivacacion,planivacacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPlaniVacacion=this.isPermisoActualizarOriginalPlaniVacacion;
			
			
			this.seleccionarAsignar(planivacacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlaniVacacionConstantesFunciones.quitarEspaciosPlaniVacacion(this.planivacacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPlaniVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.planivacacionSessionBean.setsFuncionBusquedaRapida(this.planivacacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPlaniVacacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPlaniVacacion(esParaCancelar);				
				this.cancelarNuevoPlaniVacacion(esParaCancelar);								
			}
			
			this.planivacacion=new PlaniVacacion();
			
			this.inicializarPlaniVacacion();
			
			this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPlaniVacacion() throws Exception {
		try {
			PlaniVacacionConstantesFunciones.inicializarPlaniVacacion(this.planivacacion);
			
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
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.planivacacionLogic.getPlaniVacacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePlaniVacacions(String sAccionBusqueda,List<PlaniVacacion> planivacacionsParaReportes) throws Exception {
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
					sPathReporteFinal="PlaniVacacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PlaniVacacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PlaniVacacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PlaniVacacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Plani Vacaciones");		
		parameters.put("busquedapor", PlaniVacacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePlaniVacacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PlaniVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PlaniVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePlaniVacacion=new JRBeanArrayDataSource(PlaniVacacionJInternalFrame.TraerPlaniVacacionBeans(planivacacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePlaniVacacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PlaniVacacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PlaniVacacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PlaniVacacionBean.TraerPlaniVacacionBeans(planivacacionsParaReportes).toArray()));
							
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
				this.generarExcelReportePlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPlaniVacacionActionPerformed(null);
					//this.generarExcelReportePlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPlaniVacacions(sAccionBusqueda,sTipoArchivoReporte,planivacacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePlaniVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaniVacacion> planivacacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaniVacacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaniVacacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PlaniVacacion planivacacion : planivacacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PlaniVacacionConstantesFunciones.generarExcelReporteDataPlaniVacacion("NORMAL",row,workbook,planivacacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPlaniVacacion(String sTipo,Row row,Workbook workbook) {
		
		PlaniVacacionConstantesFunciones.generarExcelReporteHeaderPlaniVacacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPlaniVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaniVacacion> planivacacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaniVacacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PlaniVacacion planivacacion : planivacacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PlaniVacacionConstantesFunciones.getPlaniVacacionDescripcion(planivacacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getestructuraseccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getestructuracargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DIASANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdias_anio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdias_realizadas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdias_pendiente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdias_tomados());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdias_anticipadas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planivacacion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPlaniVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaniVacacion> planivacacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PlaniVacacion> planivacacionsRespaldo=null;
		
		classes=PlaniVacacionConstantesFunciones.getClassesRelationshipsOfPlaniVacacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.planivacacionLogic.setDatosCliente(this.datosCliente);
		this.planivacacionLogic.setDatosDeep(this.datosDeep);
		this.planivacacionLogic.setIsConDeep(true);
		
		planivacacionsRespaldo=this.planivacacionLogic.getPlaniVacacions();
		
		this.planivacacionLogic.setPlaniVacacions(planivacacionsParaReportes);	
		this.planivacacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		planivacacionsParaReportes=this.planivacacionLogic.getPlaniVacacions();
		this.planivacacionLogic.setPlaniVacacions(planivacacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaniVacacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaniVacacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PlaniVacacion planivacacion : planivacacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPlaniVacacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PlaniVacacionConstantesFunciones.generarExcelReporteDataPlaniVacacion("NORMAL",row,workbook,planivacacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PlaniVacacionConstantesFunciones.getPlaniVacacionDescripcion(planivacacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaniVacacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPlaniVacacion() throws Exception {		
		this.startProcessPlaniVacacion(true);
	}
	
	public void startProcessPlaniVacacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPlaniVacacion ,this.jPanelParametrosReportesPlaniVacacion, this.jScrollPanelDatosPlaniVacacion,this.jPanelPaginacionPlaniVacacion, this.jScrollPanelDatosEdicionPlaniVacacion, this.jPanelAccionesPlaniVacacion,this.jPanelAccionesFormularioPlaniVacacion,this.jmenuBarPlaniVacacion,this.jmenuBarDetallePlaniVacacion,this.jTtoolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaniVacacion=this.jTabbedPaneBusquedasPlaniVacacion; 
		
		final JPanel jPanelParametrosReportesPlaniVacacion=this.jPanelParametrosReportesPlaniVacacion;
		//final JScrollPane jScrollPanelDatosPlaniVacacion=this.jScrollPanelDatosPlaniVacacion;
		final JTable jTableDatosPlaniVacacion=this.jTableDatosPlaniVacacion;		
		final JPanel jPanelPaginacionPlaniVacacion=this.jPanelPaginacionPlaniVacacion;
		//final JScrollPane jScrollPanelDatosEdicionPlaniVacacion=this.jScrollPanelDatosEdicionPlaniVacacion;
		final JPanel jPanelAccionesPlaniVacacion=this.jPanelAccionesPlaniVacacion;
		
		JPanel jPanelCamposAuxiliarPlaniVacacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPlaniVacacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			jPanelCamposAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jPanelCamposPlaniVacacion;
			jPanelAccionesFormularioAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jPanelAccionesFormularioPlaniVacacion;
		}
		
		final JPanel jPanelCamposPlaniVacacion=jPanelCamposAuxiliarPlaniVacacion;
		final JPanel jPanelAccionesFormularioPlaniVacacion=jPanelAccionesFormularioAuxiliarPlaniVacacion;
		
		
		final JMenuBar jmenuBarPlaniVacacion=this.jmenuBarPlaniVacacion;
		final JToolBar jTtoolBarPlaniVacacion=this.jTtoolBarPlaniVacacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPlaniVacacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaniVacacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			jmenuBarDetalleAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jmenuBarDetallePlaniVacacion;
			jTtoolBarDetalleAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jTtoolBarDetallePlaniVacacion;
		}
		
		final JMenuBar jmenuBarDetallePlaniVacacion=jmenuBarDetalleAuxiliarPlaniVacacion;
		final JToolBar jTtoolBarDetallePlaniVacacion=jTtoolBarDetalleAuxiliarPlaniVacacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaniVacacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaniVacacion;
			processRunnable.jTableDatos=jTableDatosPlaniVacacion;
			processRunnable.jPanelCampos=jPanelCamposPlaniVacacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaniVacacion;
			processRunnable.jPanelAcciones=jPanelAccionesPlaniVacacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaniVacacion;
			
			
			processRunnable.jmenuBar=jmenuBarPlaniVacacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaniVacacion;
			processRunnable.jTtoolBar=jTtoolBarPlaniVacacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaniVacacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaniVacacion ,jPanelParametrosReportesPlaniVacacion,jTableDatosPlaniVacacion, /*jScrollPanelDatosPlaniVacacion,*/jPanelCamposPlaniVacacion,jPanelPaginacionPlaniVacacion, /*jScrollPanelDatosEdicionPlaniVacacion,*/ jPanelAccionesPlaniVacacion,jPanelAccionesFormularioPlaniVacacion,jmenuBarPlaniVacacion,jmenuBarDetallePlaniVacacion,jTtoolBarPlaniVacacion,jTtoolBarDetallePlaniVacacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaniVacacion ,jPanelParametrosReportesPlaniVacacion, jScrollPanelDatosPlaniVacacion,jPanelPaginacionPlaniVacacion, jScrollPanelDatosEdicionPlaniVacacion, jPanelAccionesPlaniVacacion,jPanelAccionesFormularioPlaniVacacion,jmenuBarPlaniVacacion,jmenuBarDetallePlaniVacacion,jTtoolBarPlaniVacacion,jTtoolBarDetallePlaniVacacion);
						
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
	
	public void finishProcessPlaniVacacion() {// throws Exception 
		this.finishProcessPlaniVacacion(true);
	}
	
	public void finishProcessPlaniVacacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPlaniVacacion ,this.jPanelParametrosReportesPlaniVacacion, this.jScrollPanelDatosPlaniVacacion,this.jPanelPaginacionPlaniVacacion, this.jScrollPanelDatosEdicionPlaniVacacion, this.jPanelAccionesPlaniVacacion,this.jPanelAccionesFormularioPlaniVacacion,this.jmenuBarPlaniVacacion,this.jmenuBarDetallePlaniVacacion,this.jTtoolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaniVacacion=this.jTabbedPaneBusquedasPlaniVacacion; 
		
		final JPanel jPanelParametrosReportesPlaniVacacion=this.jPanelParametrosReportesPlaniVacacion;
		//final JScrollPane jScrollPanelDatosPlaniVacacion=this.jScrollPanelDatosPlaniVacacion;
		final JTable jTableDatosPlaniVacacion=this.jTableDatosPlaniVacacion;		
		final JPanel jPanelPaginacionPlaniVacacion=this.jPanelPaginacionPlaniVacacion;
		//final JScrollPane jScrollPanelDatosEdicionPlaniVacacion=this.jScrollPanelDatosEdicionPlaniVacacion;
		final JPanel jPanelAccionesPlaniVacacion=this.jPanelAccionesPlaniVacacion;
		
		JPanel jPanelCamposAuxiliarPlaniVacacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPlaniVacacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			jPanelCamposAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jPanelCamposPlaniVacacion;
			jPanelAccionesFormularioAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jPanelAccionesFormularioPlaniVacacion;
		}
		
		final JPanel jPanelCamposPlaniVacacion=jPanelCamposAuxiliarPlaniVacacion;
		final JPanel jPanelAccionesFormularioPlaniVacacion=jPanelAccionesFormularioAuxiliarPlaniVacacion;
		
		
		final JMenuBar jmenuBarPlaniVacacion=this.jmenuBarPlaniVacacion;		
		final JToolBar jTtoolBarPlaniVacacion=this.jTtoolBarPlaniVacacion;
				
		JMenuBar jmenuBarDetalleAuxiliarPlaniVacacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaniVacacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			jmenuBarDetalleAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jmenuBarDetallePlaniVacacion;
			jTtoolBarDetalleAuxiliarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jTtoolBarDetallePlaniVacacion;		
		}
		
		final JMenuBar jmenuBarDetallePlaniVacacion=jmenuBarDetalleAuxiliarPlaniVacacion;
		final JToolBar jTtoolBarDetallePlaniVacacion=jTtoolBarDetalleAuxiliarPlaniVacacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaniVacacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaniVacacion;
			processRunnable.jTableDatos=jTableDatosPlaniVacacion;
			processRunnable.jPanelCampos=jPanelCamposPlaniVacacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaniVacacion;
			processRunnable.jPanelAcciones=jPanelAccionesPlaniVacacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaniVacacion;
			
			
			processRunnable.jmenuBar=jmenuBarPlaniVacacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaniVacacion;
			processRunnable.jTtoolBar=jTtoolBarPlaniVacacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaniVacacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPlaniVacacion ,jPanelParametrosReportesPlaniVacacion, jTableDatosPlaniVacacion,/*jScrollPanelDatosPlaniVacacion,*/jPanelCamposPlaniVacacion,jPanelPaginacionPlaniVacacion, /*jScrollPanelDatosEdicionPlaniVacacion,*/ jPanelAccionesPlaniVacacion,jPanelAccionesFormularioPlaniVacacion,jmenuBarPlaniVacacion,jmenuBarDetallePlaniVacacion,jTtoolBarPlaniVacacion,jTtoolBarDetallePlaniVacacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPlaniVacacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPlaniVacacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPlaniVacacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPlaniVacacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPlaniVacacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePlaniVacacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPlaniVacacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPlaniVacacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePlaniVacacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.planivacacionConstantesFunciones.getsFinalQueryPlaniVacacion();
		String  finalQueryPaginacionTodos=this.planivacacionConstantesFunciones.getsFinalQueryPlaniVacacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PlaniVacacionConstantesFunciones.getArrayColumnasGlobalesNoPlaniVacacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PlaniVacacionConstantesFunciones.getArrayColumnasGlobalesPlaniVacacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PlaniVacacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.planivacacionsEliminados= new ArrayList<PlaniVacacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPlaniVacacion();
		
				///*PlaniVacacionSessionBean*/this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			
			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
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
					this.iNumeroPaginacion=PlaniVacacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PlaniVacacionConstantesFunciones.getClassesForeignKeysOfPlaniVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/planivacacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			planivacacionsAux= new ArrayList<PlaniVacacion>();
			
				
			planivacacionLogic.setDatosCliente(this.datosCliente);
			planivacacionLogic.setDatosDeep(this.datosDeep);
			planivacacionLogic.setIsConDeep(true);
			
			
			planivacacionLogic.getPlaniVacacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					planivacacionLogic.getTodosPlaniVacacions(finalQueryGlobal,pagination);
					
					//planivacacionLogic.getTodosPlaniVacacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(planivacacionLogic.getPlaniVacacions()==null|| planivacacionLogic.getPlaniVacacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planivacacionsAux= new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux= new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planivacacionLogic.getTodosPlaniVacacions(finalQueryGlobal+"",this.pagination);												
							
							//planivacacionLogic.getTodosPlaniVacacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePlaniVacacions("Todos",planivacacionLogic.getPlaniVacacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());					
							planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPlaniVacacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPlaniVacacion=this.idActual;
				
				} else if(this.idPlaniVacacionActual!=null && this.idPlaniVacacionActual!=0L) {
					idPlaniVacacion=idPlaniVacacionActual;
				}
				
					
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndicePorId(idPlaniVacacion);
				
				this.planivacacions=new ArrayList<PlaniVacacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					planivacacionLogic.getEntity(idPlaniVacacion);
					
					//planivacacionLogic.getEntityWithConnection(idPlaniVacacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
					planivacacionLogic.getPlaniVacacions().add(planivacacionLogic.getPlaniVacacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacions=new ArrayList<PlaniVacacion>();
					this.planivacacions.add(planivacacion);
				}
				
				if(planivacacionLogic.getPlaniVacacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdEmpleado",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdEmpleado",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdEmpresa",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdEmpresa",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdEstructura",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdEstructura",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructuraCargo")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraCargo(id_estructura_cargoFK_IdEstructuraCargo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdEstructuraCargo(finalQueryGlobal,pagination,id_estructura_cargoFK_IdEstructuraCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraCargo(id_estructura_cargoFK_IdEstructuraCargo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraCargo(id_estructura_cargoFK_IdEstructuraCargo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdEstructuraCargo(finalQueryGlobal,pagination,id_estructura_cargoFK_IdEstructuraCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraCargo(id_estructura_cargoFK_IdEstructuraCargo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraCargo(id_estructura_cargoFK_IdEstructuraCargo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdEstructuraCargo",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdEstructuraCargo",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructuraSeccion")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdEstructuraSeccion(finalQueryGlobal,pagination,id_estructura_seccionFK_IdEstructuraSeccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdEstructuraSeccion(finalQueryGlobal,pagination,id_estructura_seccionFK_IdEstructuraSeccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdEstructuraSeccion",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdEstructuraSeccion",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdMes",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdMes",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planivacacionLogic.getPlaniVacacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planivacacionLogic.getPlaniVacacions()==null||planivacacionLogic.getPlaniVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planivacacions==null|| planivacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionsAux=new ArrayList<PlaniVacacion>();
						planivacacionsAux.addAll(planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionsAux=new ArrayList<PlaniVacacion>();
							planivacacionsAux.addAll(planivacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planivacacionLogic.getPlaniVacacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaniVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaniVacacions("FK_IdSucursal",planivacacionLogic.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaniVacacions("FK_IdSucursal",planivacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionLogic.setPlaniVacacions(new ArrayList<PlaniVacacion>());
						planivacacionLogic.getPlaniVacacions().addAll(planivacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacions=new ArrayList<PlaniVacacion>();
							planivacacions.addAll(planivacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPlaniVacacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPlaniVacacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planivacacionLogic.getPlaniVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planivacacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planivacacionLogic.getPlaniVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planivacacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PlaniVacacion planivacacion) {
		Boolean permite=true;
		
		if(this.planivacacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PlaniVacacionConstantesFunciones.getOrderByListaPlaniVacacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PlaniVacacionConstantesFunciones.getOrderByListaPlaniVacacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaniVacacion planivacacion:planivacacionLogic.getPlaniVacacions()) {
				if(planivacacion.getsType().equals(Constantes2.S_TOTALES)) {
					planivacacionTotales=planivacacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaniVacacion planivacacion:this.planivacacions) {
				if(planivacacion.getsType().equals(Constantes2.S_TOTALES)) {
					planivacacionTotales=planivacacion;
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
			this.planivacacionAux=new PlaniVacacion();
			this.planivacacionAux.setsType(Constantes2.S_TOTALES);
			this.planivacacionAux.setIsNew(false);
			this.planivacacionAux.setIsChanged(false);
			this.planivacacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PlaniVacacionConstantesFunciones.TotalizarValoresFilaPlaniVacacion(this.planivacacionLogic.getPlaniVacacions(),this.planivacacionAux);
				
				this.planivacacionLogic.getPlaniVacacions().add(this.planivacacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PlaniVacacionConstantesFunciones.TotalizarValoresFilaPlaniVacacion(this.planivacacions,this.planivacacionAux);
				
				this.planivacacions.add(this.planivacacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		planivacacionTotales=new PlaniVacacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planivacacionLogic.getPlaniVacacions().remove(planivacacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planivacacions.remove(planivacacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		planivacacionTotales=new PlaniVacacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaniVacacion planivacacion:planivacacionLogic.getPlaniVacacions()) {
				if(planivacacion.getsType().equals(Constantes2.S_TOTALES)) {
					planivacacionTotales=planivacacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaniVacacionConstantesFunciones.TotalizarValoresFilaPlaniVacacion(this.planivacacionLogic.getPlaniVacacions(),planivacacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaniVacacion planivacacion:this.planivacacions) {
				if(planivacacion.getsType().equals(Constantes2.S_TOTALES)) {
					planivacacionTotales=planivacacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaniVacacionConstantesFunciones.TotalizarValoresFilaPlaniVacacion(this.planivacacions,planivacacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPlaniVacacionsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdEstructuraCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructuraCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdEstructuraSeccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructuraSeccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaniVacacionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPlaniVacacionsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdEstructuraCargo(String sFinalQuery,Long id_estructura_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdEstructuraCargo(sFinalQuery,this.pagination,id_estructura_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdEstructuraSeccion(String sFinalQuery,Long id_estructura_seccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdEstructuraSeccion(sFinalQuery,this.pagination,id_estructura_seccion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaniVacacionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLogic.getPlaniVacacionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPlaniVacacion() {
		this.isPermisoTodoPlaniVacacion=false;
		this.isPermisoNuevoPlaniVacacion=false;
		this.isPermisoActualizarPlaniVacacion=false;
		this.isPermisoActualizarOriginalPlaniVacacion=false;
		this.isPermisoEliminarPlaniVacacion=false;
		this.isPermisoGuardarCambiosPlaniVacacion=false;
		this.isPermisoConsultaPlaniVacacion=false;
		this.isPermisoBusquedaPlaniVacacion=false;
		this.isPermisoReportePlaniVacacion=false;		
		this.isPermisoOrdenPlaniVacacion=false;		
		this.isPermisoPaginacionMedioPlaniVacacion=false;		
		this.isPermisoPaginacionAltoPlaniVacacion=false;
		this.isPermisoPaginacionTodoPlaniVacacion=false;
		this.isPermisoCopiarPlaniVacacion=false;		
		this.isPermisoVerFormPlaniVacacion=false;		
		this.isPermisoDuplicarPlaniVacacion=false;		
		this.isPermisoOrdenPlaniVacacion=false;		
	}
	
	public void setPermisosUsuarioPlaniVacacion(Boolean isPermiso) {
		this.isPermisoTodoPlaniVacacion=isPermiso;
		this.isPermisoNuevoPlaniVacacion=isPermiso;
		this.isPermisoActualizarPlaniVacacion=isPermiso;
		this.isPermisoActualizarOriginalPlaniVacacion=isPermiso;
		this.isPermisoEliminarPlaniVacacion=isPermiso;
		this.isPermisoGuardarCambiosPlaniVacacion=isPermiso;
		this.isPermisoConsultaPlaniVacacion=isPermiso;
		this.isPermisoBusquedaPlaniVacacion=isPermiso;
		this.isPermisoReportePlaniVacacion=isPermiso;
		this.isPermisoOrdenPlaniVacacion=isPermiso;		
		this.isPermisoPaginacionMedioPlaniVacacion=isPermiso;		
		this.isPermisoPaginacionAltoPlaniVacacion=isPermiso;		
		this.isPermisoPaginacionTodoPlaniVacacion=isPermiso;		
		this.isPermisoCopiarPlaniVacacion=isPermiso;		
		this.isPermisoVerFormPlaniVacacion=isPermiso;		
		this.isPermisoDuplicarPlaniVacacion=isPermiso;
		this.isPermisoOrdenPlaniVacacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPlaniVacacion(Boolean isPermiso) {
		//this.isPermisoTodoPlaniVacacion=isPermiso;
		this.isPermisoNuevoPlaniVacacion=isPermiso;
		this.isPermisoActualizarPlaniVacacion=isPermiso;
		this.isPermisoActualizarOriginalPlaniVacacion=isPermiso;
		this.isPermisoEliminarPlaniVacacion=isPermiso;
		this.isPermisoGuardarCambiosPlaniVacacion=isPermiso;
		//this.isPermisoConsultaPlaniVacacion=isPermiso;
		//this.isPermisoBusquedaPlaniVacacion=isPermiso;
		//this.isPermisoReportePlaniVacacion=isPermiso;
		//this.isPermisoOrdenPlaniVacacion=isPermiso;		
		//this.isPermisoPaginacionMedioPlaniVacacion=isPermiso;		
		//this.isPermisoPaginacionAltoPlaniVacacion=isPermiso;		
		//this.isPermisoPaginacionTodoPlaniVacacion=isPermiso;		
		//this.isPermisoCopiarPlaniVacacion=isPermiso;		
		//this.isPermisoDuplicarPlaniVacacion=isPermiso;
		//this.isPermisoOrdenPlaniVacacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPlaniVacacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PlaniVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPlaniVacacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPlaniVacacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPlaniVacacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPlaniVacacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPlaniVacacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPlaniVacacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PlaniVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PlaniVacacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPlaniVacacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPlaniVacacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPlaniVacacion=this.isPermisoActualizarPlaniVacacion;
			this.isPermisoEliminarPlaniVacacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPlaniVacacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPlaniVacacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPlaniVacacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPlaniVacacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePlaniVacacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaniVacacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPlaniVacacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPlaniVacacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPlaniVacacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPlaniVacacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPlaniVacacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPlaniVacacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaniVacacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPlaniVacacion.setToolTipText(this.jTableDatosPlaniVacacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPlaniVacacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPlaniVacacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PlaniVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PlaniVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPlaniVacacion() throws Exception {
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
	public void inicializarCombosForeignKeyPlaniVacacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.estructuraseccionsForeignKey=new ArrayList();
				this.estructuracargosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPlaniVacacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PlaniVacacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPlaniVacacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraSeccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstructuraSeccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructuraseccionsForeignKey==null||this.estructuraseccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructuraSeccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraCargoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructuracargosForeignKey==null||this.estructuracargosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructuraCargosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPlaniVacacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PlaniVacacionParameterReturnGeneral planivacacionReturnGeneral=new PlaniVacacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_empresaPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_empresaPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_sucursalPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_sucursalPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_estructuraPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_estructuraPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEstructuraSeccion="";

				if(((this.estructuraseccionsForeignKey==null||this.estructuraseccionsForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_estructura_seccionPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_estructura_seccionPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructuraSeccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructuraSeccion=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructuraSeccion, "");
						finalQueryGlobalEstructuraSeccion+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructuraSeccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructuraSeccion=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidEstructuraSeccionActual();
					}
				} else {
					finalQueryGlobalEstructuraSeccion="NONE";
				}


				String finalQueryGlobalEstructuraCargo="";

				if(((this.estructuracargosForeignKey==null||this.estructuracargosForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_estructura_cargoPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_estructura_cargoPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraCargo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructuraCargo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructuraCargo=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructuraCargo, "");
						finalQueryGlobalEstructuraCargo+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructuraCargosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructuraCargo=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidEstructuraCargoActual();
					}
				} else {
					finalQueryGlobalEstructuraCargo="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_empleadoPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_empleadoPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.planivacacionConstantesFunciones.cargarid_mesPlaniVacacion)
					 || (this.esRecargarFks && this.planivacacionConstantesFunciones.cargarid_mesPlaniVacacion)) {

					if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+planivacacionSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				planivacacionReturnGeneral=planivacacionLogic.cargarCombosLoteForeignKeyPlaniVacacion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalEstructuraSeccion,finalQueryGlobalEstructuraCargo,finalQueryGlobalEmpleado,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=planivacacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=planivacacionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=planivacacionReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEstructuraSeccion.equals("NONE")) {
				this.estructuraseccionsForeignKey=planivacacionReturnGeneral.getestructuraseccionsForeignKey();
			}

			if(!finalQueryGlobalEstructuraCargo.equals("NONE")) {
				this.estructuracargosForeignKey=planivacacionReturnGeneral.getestructuracargosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=planivacacionReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=planivacacionReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPlaniVacacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEstructuraSeccion();
			this.addItemDefectoCombosForeignKeyEstructuraCargo();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.planivacacionSessionBean==null) {
				this.planivacacionSessionBean=new PlaniVacacionSessionBean();
			}

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEstructuraSeccion()throws Exception {
		try {

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {
				Estructura estructuraseccion=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructuraseccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructuraseccion.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructuraseccionsForeignKey,estructuraseccion,true)) {

					this.estructuraseccionsForeignKey.add(0,estructuraseccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructuraCargo()throws Exception {
		try {

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraCargo()) {
				Estructura estructuracargo=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructuracargo,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructuracargo.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructuracargosForeignKey,estructuracargo,true)) {

					this.estructuracargosForeignKey.add(0,estructuracargo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.planivacacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPlaniVacacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPlaniVacacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPlaniVacacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.planivacacion.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.planivacacion.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaniVacacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPlaniVacacion(PlaniVacacion planivacacion)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(planivacacion.getid_estructura(),false,"Formulario");
			this.setActualEstructuraSeccionForeignKey(planivacacion.getid_estructura_seccion(),false,"Formulario");
			this.setActualEstructuraCargoForeignKey(planivacacion.getid_estructura_cargo(),false,"Formulario");
			this.setActualEmpleadoForeignKey(planivacacion.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPlaniVacacion(PlaniVacacion planivacacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPlaniVacacion()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.planivacacionConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEstructuraSeccionForeignKey(this.planivacacionConstantesFunciones.getid_estructura_seccion(),false,"Formulario");
			this.setActualEstructuraCargoForeignKey(this.planivacacionConstantesFunciones.getid_estructura_cargo(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.planivacacionConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPlaniVacacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPlaniVacacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPlaniVacacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPlaniVacacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPlaniVacacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEstructuraSeccionsForeignKey("Todos");
			this.cargarCombosFrameEstructuraCargosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPlaniVacacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructuraSeccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructuraCargosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPlaniVacacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public PlaniVacacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PlaniVacacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PlaniVacacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.planivacacionSessionBean=new PlaniVacacionSessionBean(); 
		this.planivacacionConstantesFunciones=new PlaniVacacionConstantesFunciones(); 
		this.planivacacionBean=new PlaniVacacion();//(this.planivacacionConstantesFunciones); 		
		this.planivacacionReturnGeneral=new PlaniVacacionParameterReturnGeneral(); 
		
		this.planivacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planivacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PlaniVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PlaniVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PlaniVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPlaniVacacion(true);
			
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
			
			this.planivacacionConstantesFunciones=new PlaniVacacionConstantesFunciones(); 
			this.planivacacionBean=new PlaniVacacion();//this.planivacacionConstantesFunciones); 			
			this.planivacacionReturnGeneral=new PlaniVacacionParameterReturnGeneral(); 
		
			PlaniVacacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Plani Vacacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.planivacacion=new PlaniVacacion();
			this.planivacacions = new ArrayList<PlaniVacacion>();
			this.planivacacionsAux = new ArrayList<PlaniVacacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic=new PlaniVacacionLogic();
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			//this.planivacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.planivacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPlaniVacacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaniVacacion);	
					}
					
					if(this.jInternalFrameImportacionPlaniVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaniVacacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPlaniVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPlaniVacacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaniVacacion);
				this.jInternalFrameDetalleFormPlaniVacacion.setVisible(false);
				this.jInternalFrameDetalleFormPlaniVacacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaniVacacion);
					this.jInternalFrameReporteDinamicoPlaniVacacion.setVisible(false);
					this.jInternalFrameReporteDinamicoPlaniVacacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPlaniVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPlaniVacacion);
					this.jInternalFrameImportacionPlaniVacacion.setVisible(false);
					this.jInternalFrameImportacionPlaniVacacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPlaniVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPlaniVacacion);
					this.jInternalFrameOrderByPlaniVacacion.setVisible(false);
					this.jInternalFrameOrderByPlaniVacacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPlaniVacacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PlaniVacacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.planivacacionReturnGeneral=new PlaniVacacionParameterReturnGeneral();
			
			this.planivacacionParameterGeneral=new PlaniVacacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.planivacacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PlaniVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaniVacacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planivacacionSessionBean.getEsGuardarRelacionado(),this.planivacacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaniVacacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planivacacionSessionBean.getEsGuardarRelacionado(),this.planivacacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaDuplicarPlaniVacacion=true;
			this.isVisibilidadCeldaCopiarPlaniVacacion=true;
			this.isVisibilidadCeldaVerFormPlaniVacacion=true;
			this.isVisibilidadCeldaOrdenPlaniVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdEstructuraCargo=true;
			this.isVisibilidadFK_IdEstructuraSeccion=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPlaniVacacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPlaniVacacion(false);
			
			this.setPermisosUsuarioPlaniVacacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado() 
				|| (this.planivacacionSessionBean.getEsGuardarRelacionado() && this.planivacacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPlaniVacacionClasesRelacionadas();
			}
			
			if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPlaniVacacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPlaniVacacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPlaniVacacion();
			}
			
			if(!this.isPermisoBusquedaPlaniVacacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPlaniVacacion,this.isPermisoPaginacionMedioPlaniVacacion,this.isPermisoPaginacionTodoPlaniVacacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PlaniVacacionConstantesFunciones.getTiposSeleccionarPlaniVacacion());
				
				this.tiposColumnasSelect=PlaniVacacionConstantesFunciones.getTiposSeleccionarPlaniVacacion(true);
				
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
			//if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPlaniVacacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPlaniVacacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPlaniVacacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaniVacacion() ;
			
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
			this.estructuraseccionLogic=new EstructuraLogic();
			this.estructuracargoLogic=new EstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				planivacacionImplementable= (PlaniVacacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaniVacacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				planivacacionImplementableHome= (PlaniVacacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaniVacacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.planivacacions= new ArrayList<PlaniVacacion>();
			this.planivacacionsEliminados= new ArrayList<PlaniVacacion>();
						
			this.isEsNuevoPlaniVacacion=false;
			this.esParaAccionDesdeFormularioPlaniVacacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.estructuraseccionsForeignKey=new ArrayList<Estructura>() ;
			this.estructuracargosForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPlaniVacacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPlaniVacacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PlaniVacacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PlaniVacacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPlaniVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPlaniVacacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPlaniVacacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPlaniVacacion();
			}
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPlaniVacacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPlaniVacacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PlaniVacacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPlaniVacacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPlaniVacacion")) {
				iIndex=this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPlaniVacacion();	
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
	
	public void cargarCombosForeignKeyPlaniVacacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPlaniVacacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPlaniVacacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPlaniVacacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPlaniVacacion();
		
		this.cargarCombosFrameForeignKeyPlaniVacacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPlaniVacacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPlaniVacacion();
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

	public void cargarCombosForeignKeyEstructuraSeccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraSeccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructuraSeccion();
				this.cargarCombosFrameEstructuraSeccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructuraSeccion(this.estructuraseccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructuraCargo();
				this.cargarCombosFrameEstructuraCargosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructuraCargo(this.estructuracargosForeignKey);

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

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPlaniVacacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			
			if(jTableDatosPlaniVacacion.getRowCount()>=1) {
				jTableDatosPlaniVacacion.removeRowSelectionInterval(0, jTableDatosPlaniVacacion.getRowCount()-1);						
			}
			
			this.isEsNuevoPlaniVacacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPlaniVacacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPlaniVacacion(true);			
			//this.planivacacion=new PlaniVacacion();
			//this.planivacacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaniVacacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaniVacacion() ;
			
			if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaniVacacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.planivacacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);				
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PlaniVacacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPlaniVacacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPlaniVacacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPlaniVacacion.getSelectedRows().length;			
			}
			
			planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPlaniVacacion--;			
				//PlaniVacacion planivacacionAux= new PlaniVacacion();			
				//planivacacionAux.setId(this.iIdNuevoPlaniVacacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PlaniVacacion planivacacionOrigen=new PlaniVacacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PlaniVacacion planivacacionOrigen : planivacacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							planivacacionOrigen =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planivacacionOrigen =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPlaniVacacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.planivacacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPlaniVacacion(planivacacionOrigen,this.planivacacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planivacacionLogic.getPlaniVacacions().add(this.planivacacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planivacacions.add(this.planivacacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
				
				this.jTableDatosPlaniVacacion.setRowSelectionInterval(this.getIndiceNuevoPlaniVacacion(), this.getIndiceNuevoPlaniVacacion());
				
				int iLastRow =  this.jTableDatosPlaniVacacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaniVacacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaniVacacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaniVacacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();									
		
			PlaniVacacion planivacacionOrigen=new PlaniVacacion();
			PlaniVacacion planivacacionDestino=new PlaniVacacion();
				
			planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPlaniVacacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || planivacacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPlaniVacacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionOrigen =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planivacacionOrigen =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planivacacionDestino =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planivacacionDestino =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				planivacacionOrigen =planivacacionsSeleccionados.get(0);
				planivacacionDestino =planivacacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPlaniVacacion(planivacacionOrigen,planivacacionDestino,true,false);
				
				planivacacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planivacacionDestino,planivacacionLogic.getPlaniVacacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planivacacionDestino,planivacacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
				
				//this.jTableDatosPlaniVacacion.setRowSelectionInterval(this.getIndiceNuevoPlaniVacacion(), this.getIndiceNuevoPlaniVacacion());
				
				int iLastRow =  this.jTableDatosPlaniVacacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaniVacacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaniVacacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaniVacacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPlaniVacacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPlaniVacacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPlaniVacacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPlaniVacacion.setVisible(!isVisible);
			this.jPanelPaginacionPlaniVacacion.setVisible(!isVisible);
			this.jPanelAccionesPlaniVacacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePlaniVacacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPlaniVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPlaniVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPlaniVacacion();
			
			this.abrirFrameOrderByPlaniVacacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPlaniVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePlaniVacacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaniVacacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPlaniVacacion.isMaximum()) {
					this.jInternalFrameDetalleFormPlaniVacacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPlaniVacacion.setSize(this.jInternalFrameDetalleFormPlaniVacacion.iWidthFormulario,this.jInternalFrameDetalleFormPlaniVacacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPlaniVacacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPlaniVacacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPlaniVacacion.isMaximum()) {
						this.jInternalFrameDetalleFormPlaniVacacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPlaniVacacion.jContentPaneDetallePlaniVacacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPlaniVacacion.jContentPaneDetallePlaniVacacion.getWidth(),PlaniVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPlaniVacacion.jContentPaneDetallePlaniVacacion.getWidth(),PlaniVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPlaniVacacion.jContentPaneDetallePlaniVacacion.getWidth(),PlaniVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPlaniVacacion.setVisible(true);
	        this.jInternalFrameDetalleFormPlaniVacacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPlaniVacacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPlaniVacacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPlaniVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaniVacacion,false,this);
				} else {
					this.jInternalFrameOrderByPlaniVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaniVacacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPlaniVacacion);
				this.jInternalFrameOrderByPlaniVacacion.setVisible(false);
				this.jInternalFrameOrderByPlaniVacacion.setSelected(false);
				
				this.jInternalFrameOrderByPlaniVacacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaniVacacion"));
				
				this.inicializarActualizarBindingTablaOrderByPlaniVacacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPlaniVacacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPlaniVacacion==null) {
				
				this.jInternalFrameImportacionPlaniVacacion=new ImportacionJInternalFrame(PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaniVacacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPlaniVacacion);
				this.jInternalFrameImportacionPlaniVacacion.setVisible(false);
				this.jInternalFrameImportacionPlaniVacacion.setSelected(false);


				this.jInternalFrameImportacionPlaniVacacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaniVacacion"));
				this.jInternalFrameImportacionPlaniVacacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaniVacacion"));
				this.jInternalFrameImportacionPlaniVacacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaniVacacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPlaniVacacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPlaniVacacion==null) {
				this.jInternalFrameReporteDinamicoPlaniVacacion=new ReporteDinamicoJInternalFrame(PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaniVacacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaniVacacion);
				this.jInternalFrameReporteDinamicoPlaniVacacion.setVisible(false);
				this.jInternalFrameReporteDinamicoPlaniVacacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaniVacacion"));
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaniVacacion"));
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaniVacacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaniVacacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePlaniVacacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaniVacacion);
			
	       	this.jInternalFrameDetalleFormPlaniVacacion.setVisible(false);
	        this.jInternalFrameDetalleFormPlaniVacacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormPlaniVacacion.dispose();
			//this.jInternalFrameDetalleFormPlaniVacacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPlaniVacacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPlaniVacacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoPlaniVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPlaniVacacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPlaniVacacion.setVisible(true);
	        this.jInternalFrameImportacionPlaniVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPlaniVacacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPlaniVacacion.setVisible(true);
	        this.jInternalFrameOrderByPlaniVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPlaniVacacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPlaniVacacion.setVisible(false);
	        this.jInternalFrameOrderByPlaniVacacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPlaniVacacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPlaniVacacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoPlaniVacacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPlaniVacacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPlaniVacacion.setVisible(false);
	        this.jInternalFrameImportacionPlaniVacacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


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

				public void abrirFrameTreeEstructuraSeccion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="EstructuraSeccion";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
						TitledBorder titledBorderEstructuraSeccion=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructuraSeccion.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructuraSeccion(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
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

				public void abrirFrameTreeEstructuraCargo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="EstructuraCargo";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
						TitledBorder titledBorderEstructuraCargo=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructuraCargo.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructuraCargo(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
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
	
	public void jButtonModificarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPlaniVacacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPlaniVacacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPlaniVacacion(true);
			//this.isEsNuevoPlaniVacacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPlaniVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaniVacacion(false) ;
			
			if(planivacacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaniVacacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaniVacacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPlaniVacacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPlaniVacacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPlaniVacacion(true);
			//this.isEsNuevoPlaniVacacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.planivacacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPlaniVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPlaniVacacion(false) ;
			
			if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaniVacacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaniVacacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructuraSeccion(List<Estructura> estructuraseccionsForeignKey)throws Exception{
		TableColumn tableColumnEstructuraSeccion=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION));
		TableCellEditor tableCellEditorEstructuraSeccion =tableColumnEstructuraSeccion.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructuraSeccion;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructuraseccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructuraseccionsForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructuraCargo(List<Estructura> estructuracargosForeignKey)throws Exception{
		TableColumn tableColumnEstructuraCargo=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO));
		TableCellEditor tableCellEditorEstructuraCargo =tableColumnEstructuraCargo.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructuraCargo;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructuracargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructuracargosForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPlaniVacacion(false);
			
			//if(!this.isEsNuevoPlaniVacacion) {								
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				
			}
			
			if(this.permiteMantenimiento(this.planivacacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPlaniVacacion=true;
					this.inicializarActualizarBindingTablaPlaniVacacion(false);
					this.isEsNuevoPlaniVacacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPlaniVacacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPlaniVacacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaniVacacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaniVacacion(false);
				
				this.habilitarDeshabilitarControlesPlaniVacacion(false);
			
												
				
				if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePlaniVacacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPlaniVacacionActionPerformed(evt,planivacacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPlaniVacacion(this.planivacacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,planivacacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.planivacacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				this.planivacacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				this.planivacacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.planivacacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PlaniVacacionModel) this.jTableDatosPlaniVacacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPlaniVacacion=true;
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
				this.isEsNuevoPlaniVacacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaniVacacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaniVacacion(false);
				
				this.habilitarDeshabilitarControlesPlaniVacacion(false);
				
				
				
				if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePlaniVacacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPlaniVacacion.getRowCount()>=1) {
				jTableDatosPlaniVacacion.removeRowSelectionInterval(0, jTableDatosPlaniVacacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPlaniVacacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPlaniVacacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaniVacacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaniVacacion(false) ;
			
			this.isEsNuevoPlaniVacacion=false;
			
			if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePlaniVacacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPlaniVacacion(false);
				
				//SI ES MANUAL
				if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPlaniVacacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPlaniVacacion--;			
			//PlaniVacacion planivacacionAux= new PlaniVacacion();			
			//planivacacionAux.setId(this.iIdNuevoPlaniVacacion);
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPlaniVacacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
			
			this.planivacacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.planivacacionLogic.getPlaniVacacions().add(this.planivacacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.planivacacions.add(this.planivacacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPlaniVacacion(false);
			
			this.jTableDatosPlaniVacacion.setRowSelectionInterval(this.getIndiceNuevoPlaniVacacion(), this.getIndiceNuevoPlaniVacacion());
			
			int iLastRow =  this.jTableDatosPlaniVacacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPlaniVacacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPlaniVacacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaniVacacion(false);
			
			//SI ES MANUAL
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaniVacacion();
			}
			
			//this.abrirFrameTreePlaniVacacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Plani VacacionES ?", "MANTENIMIENTO DE Plani Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPlaniVacacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPlaniVacacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.planivacacionReturnGeneral=planivacacionLogic.procesarImportacionPlaniVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.planivacacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPlaniVacacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPlaniVacacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPlaniVacacion.setFileImportacion(this.jInternalFrameImportacionPlaniVacacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPlaniVacacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPlaniVacacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPlaniVacacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPlaniVacacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		

		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PlaniVacacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PlaniVacacionBaseDesign.jrxml";
			
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
			
			this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstructuraSeccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstructuraSeccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstructuraSeccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstructuraSeccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstructuraCargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstructuraCargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstructuraCargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstructuraCargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asAnio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asAnio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asAnio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asAnio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asRealizadas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asRealizadas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asRealizadas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asRealizadas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asPendiente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asPendiente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asPendiente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asPendiente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asTomados_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asTomados_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asTomados_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asTomados_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asAnticipadas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asAnticipadas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asAnticipadas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asAnticipadas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					sNombreCampoCategoria="id_estructura_seccion";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO:
					sNombreCampoCategoria="id_estructura_cargo";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANIO:
					sNombreCampoCategoria="dias_anio";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS:
					sNombreCampoCategoria="dias_realizadas";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE:
					sNombreCampoCategoria="dias_pendiente";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS:
					sNombreCampoCategoria="dias_tomados";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS:
					sNombreCampoCategoria="dias_anticipadas";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					sNombreCampoCategoriaValor="id_estructura_seccion";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO:
					sNombreCampoCategoriaValor="id_estructura_cargo";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANIO:
					sNombreCampoCategoriaValor="dias_anio";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS:
					sNombreCampoCategoriaValor="dias_realizadas";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE:
					sNombreCampoCategoriaValor="dias_pendiente";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS:
					sNombreCampoCategoriaValor="dias_tomados";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS:
					sNombreCampoCategoriaValor="dias_anticipadas";
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura Seccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura_seccion");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura_cargo");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_anio");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Realizadas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_realizadas");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Pendiente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_pendiente");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Tomados",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_tomados");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Anticipadas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_anticipadas");
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PlaniVacacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getestructuraseccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getestructuracargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANIO);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdias_anio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdias_realizadas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdias_pendiente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdias_tomados());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdias_anticipadas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PlaniVacacion planivacacion:planivacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planivacacion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPlaniVacacion(row);				
			//	iRow++;
			//}				
			
			//for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPlaniVacacion(planivacacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaniVacacion(false);
			
			//SI ES MANUAL
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaniVacacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaniVacacion(false);
			
			//SI ES MANUAL
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaniVacacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaniVacacion(false);
			
			//SI ES MANUAL
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaniVacacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPlaniVacacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPlaniVacacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPlaniVacacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPlaniVacacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPlaniVacacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPlaniVacacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosPlaniVacacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosPlaniVacacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPlaniVacacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPlaniVacacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPlaniVacacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPlaniVacacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPlaniVacacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPlaniVacacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaniVacacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPlaniVacacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPlaniVacacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPlaniVacacion();
		
		this.inicializarActualizarBindingBotonesManualPlaniVacacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPlaniVacacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaniVacacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPlaniVacacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPlaniVacacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPlaniVacacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPlaniVacacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePlaniVacacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionNuevoPlaniVacacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionSinCerrarPlaniVacacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionSinMensajePlaniVacacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPlaniVacacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPlaniVacacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePlaniVacacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
				this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionNuevoPlaniVacacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionSinCerrarPlaniVacacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPlaniVacacion.jCheckBoxPostAccionSinMensajePlaniVacacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPlaniVacacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPlaniVacacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPlaniVacacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPlaniVacacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPlaniVacacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPlaniVacacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPlaniVacacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPlaniVacacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPlaniVacacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPlaniVacacion(Boolean esInicializar) throws Exception {
		try	{	
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPlaniVacacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPlaniVacacion() throws Exception {
		try	{
			if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaniVacacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaniVacacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaniVacacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPlaniVacacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPlaniVacacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPlaniVacacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPlaniVacacion.addItem(reporte);
			}
			
			
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPlaniVacacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPlaniVacacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPlaniVacacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPlaniVacacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPlaniVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPlaniVacacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPlaniVacacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaniVacacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaniVacacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PlaniVacacionConstantesFunciones.getTiposSeleccionarPlaniVacacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PlaniVacacionConstantesFunciones.getTiposSeleccionarPlaniVacacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PlaniVacacionConstantesFunciones.getTiposSeleccionarPlaniVacacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPlaniVacacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPlaniVacacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.getSelectedItem()!=null){this.id_estructura_cargoFK_IdEstructuraCargo=((Estructura)this.jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.getSelectedItem()!=null){this.id_estructura_seccionFK_IdEstructuraSeccion=((Estructura)this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesPlaniVacacion.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesPlaniVacacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPlaniVacacion(Boolean esInicializar) throws Exception {				
		if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPlaniVacacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPlaniVacacion() throws Exception {
		this.inicializarActualizarBindingTablaPlaniVacacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPlaniVacacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPlaniVacacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPlaniVacacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=planivacacionLogic.getPlaniVacacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=planivacacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPlaniVacacion.setModel(new PlaniVacacionModel(this.planivacacionLogic.getPlaniVacacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPlaniVacacion.setModel(new PlaniVacacionModel(this.planivacacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPlaniVacacion!=null && this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPlaniVacacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,planivacacionConstantesFunciones.resaltarSeleccionarPlaniVacacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,planivacacionConstantesFunciones.resaltarSeleccionarPlaniVacacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_ID));

		if(this.planivacacionConstantesFunciones.mostraridPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltaridPlaniVacacion,this.planivacacionConstantesFunciones.activaridPlaniVacacion,iSizeTabla,this,true,"idPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltaridPlaniVacacion,this.planivacacionConstantesFunciones.activaridPlaniVacacion,this,true,"idPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.planivacacionConstantesFunciones.mostrarid_empresaPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.planivacacionConstantesFunciones.resaltarid_empresaPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_empresaPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.planivacacionConstantesFunciones.resaltarid_empresaPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_empresaPlaniVacacion,false,"id_empresaPlaniVacacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.planivacacionConstantesFunciones.mostrarid_sucursalPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.planivacacionConstantesFunciones.resaltarid_sucursalPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_sucursalPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.planivacacionConstantesFunciones.resaltarid_sucursalPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_sucursalPlaniVacacion,false,"id_sucursalPlaniVacacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.planivacacionConstantesFunciones.mostrarid_estructuraPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructuraPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructuraPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructuraPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructuraPlaniVacacion,true,"id_estructuraPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION));

		if(this.planivacacionConstantesFunciones.mostrarid_estructura_seccionPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructuraseccionsForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructura_seccionPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructura_seccionPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructuraseccionsForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructura_seccionPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructura_seccionPlaniVacacion,true,"id_estructura_seccionPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO));

		if(this.planivacacionConstantesFunciones.mostrarid_estructura_cargoPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructuracargosForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructura_cargoPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructura_cargoPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructuracargosForeignKey,this.planivacacionConstantesFunciones.resaltarid_estructura_cargoPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_estructura_cargoPlaniVacacion,true,"id_estructura_cargoPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.planivacacionConstantesFunciones.mostrarid_empleadoPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.planivacacionConstantesFunciones.resaltarid_empleadoPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_empleadoPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.planivacacionConstantesFunciones.resaltarid_empleadoPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_empleadoPlaniVacacion,true,"id_empleadoPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO));

		if(this.planivacacionConstantesFunciones.mostrarfecha_inicioPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planivacacionConstantesFunciones.resaltarfecha_inicioPlaniVacacion,this.planivacacionConstantesFunciones.activarfecha_inicioPlaniVacacion,iSizeTabla,this,true,"fecha_inicioPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planivacacionConstantesFunciones.resaltarfecha_inicioPlaniVacacion,this.planivacacionConstantesFunciones.activarfecha_inicioPlaniVacacion,this,true,"fecha_inicioPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_FECHAFIN));

		if(this.planivacacionConstantesFunciones.mostrarfecha_finPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planivacacionConstantesFunciones.resaltarfecha_finPlaniVacacion,this.planivacacionConstantesFunciones.activarfecha_finPlaniVacacion,iSizeTabla,this,true,"fecha_finPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planivacacionConstantesFunciones.resaltarfecha_finPlaniVacacion,this.planivacacionConstantesFunciones.activarfecha_finPlaniVacacion,this,true,"fecha_finPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_IDMES));

		if(this.planivacacionConstantesFunciones.mostrarid_mesPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.planivacacionConstantesFunciones.resaltarid_mesPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_mesPlaniVacacion,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.planivacacionConstantesFunciones.resaltarid_mesPlaniVacacion,this,this.planivacacionConstantesFunciones.activarid_mesPlaniVacacion,true,"id_mesPlaniVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DIASANIO));

		if(this.planivacacionConstantesFunciones.mostrardias_anioPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DIASANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltardias_anioPlaniVacacion,this.planivacacionConstantesFunciones.activardias_anioPlaniVacacion,iSizeTabla,this,true,"dias_anioPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardias_anioPlaniVacacion,this.planivacacionConstantesFunciones.activardias_anioPlaniVacacion,this,true,"dias_anioPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS));

		if(this.planivacacionConstantesFunciones.mostrardias_realizadasPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltardias_realizadasPlaniVacacion,this.planivacacionConstantesFunciones.activardias_realizadasPlaniVacacion,iSizeTabla,this,true,"dias_realizadasPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardias_realizadasPlaniVacacion,this.planivacacionConstantesFunciones.activardias_realizadasPlaniVacacion,this,true,"dias_realizadasPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE));

		if(this.planivacacionConstantesFunciones.mostrardias_pendientePlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltardias_pendientePlaniVacacion,this.planivacacionConstantesFunciones.activardias_pendientePlaniVacacion,iSizeTabla,this,true,"dias_pendientePlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardias_pendientePlaniVacacion,this.planivacacionConstantesFunciones.activardias_pendientePlaniVacacion,this,true,"dias_pendientePlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS));

		if(this.planivacacionConstantesFunciones.mostrardias_tomadosPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltardias_tomadosPlaniVacacion,this.planivacacionConstantesFunciones.activardias_tomadosPlaniVacacion,iSizeTabla,this,true,"dias_tomadosPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardias_tomadosPlaniVacacion,this.planivacacionConstantesFunciones.activardias_tomadosPlaniVacacion,this,true,"dias_tomadosPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS));

		if(this.planivacacionConstantesFunciones.mostrardias_anticipadasPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planivacacionConstantesFunciones.resaltardias_anticipadasPlaniVacacion,this.planivacacionConstantesFunciones.activardias_anticipadasPlaniVacacion,iSizeTabla,this,true,"dias_anticipadasPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardias_anticipadasPlaniVacacion,this.planivacacionConstantesFunciones.activardias_anticipadasPlaniVacacion,this,true,"dias_anticipadasPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.planivacacionConstantesFunciones.mostrardescripcionPlaniVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planivacacionConstantesFunciones.resaltardescripcionPlaniVacacion,this.planivacacionConstantesFunciones.activardescripcionPlaniVacacion,iSizeTabla,this,true,"descripcionPlaniVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planivacacionConstantesFunciones.resaltardescripcionPlaniVacacion,this.planivacacionConstantesFunciones.activardescripcionPlaniVacacion,this,true,"descripcionPlaniVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaniVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaniVacacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaniVacacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.planivacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPlaniVacacion.addColumn(tableColumn);
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
			
			this.jTableDatosPlaniVacacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPlaniVacacion.moveColumn(this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPlaniVacacion.moveColumn(this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPlaniVacacion.moveColumn(this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPlaniVacacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPlaniVacacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPlaniVacacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPlaniVacacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPlaniVacacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPlaniVacacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPlaniVacacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=planivacacionLogic.getPlaniVacacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=planivacacions.size()-1;
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
		//this.jTableDatosPlaniVacacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPlaniVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPlaniVacacion();
			
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
				
				//this.isEsNuevoPlaniVacacion=false;
					
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
				if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPlaniVacacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaniVacacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.planivacacion.getsType().equals("DUPLICADO")
				   || this.planivacacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPlaniVacacion=true;
				
				} else {
					this.isEsNuevoPlaniVacacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					if(this.planivacacion.getId()>=0 && !this.planivacacion.getIsNew()) {						
						this.isEsNuevoPlaniVacacion=false;
						
					} else {
						this.isEsNuevoPlaniVacacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPlaniVacacion(esRelaciones);						
				
				this.seleccionarPlaniVacacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.planivacacion.getId()<0) {
					this.isEsNuevoPlaniVacacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPlaniVacacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPlaniVacacion(evt,rowIndex);
				}	
				
				if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PlaniVacacion: " + this.dDif); 
					}
				}								
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPlaniVacacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.planivacacion)) {
					if(this.planivacacion.getId()>0) {
						this.planivacacion.setIsDeleted(true);
						
						this.planivacacionsEliminados.add(this.planivacacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planivacacionLogic.getPlaniVacacions().remove(this.planivacacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planivacacions.remove(this.planivacacion);				
					}
					
					
					((PlaniVacacionModel) this.jTableDatosPlaniVacacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaniVacacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPlaniVacacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPlaniVacacion) {
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaniVacacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaniVacacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPlaniVacacion(this.planivacacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.planivacacionConstantesFunciones.cargarid_empresaPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_empresaPlaniVacacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.planivacacion.getid_empresa());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(planivacacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(planivacacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.planivacacion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.planivacacionConstantesFunciones.cargarid_sucursalPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_sucursalPlaniVacacion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.planivacacion.getid_sucursal());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(planivacacion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(planivacacion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.planivacacion.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.planivacacionConstantesFunciones.cargarid_estructuraPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_estructuraPlaniVacacion) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.planivacacion.getid_estructura());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(planivacacion.getEstructura()!=null) {
							this.estructurasForeignKey.add(planivacacion.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.planivacacion.getid_estructura(),false,"Formulario");

					//EstructuraSeccion
					if(!this.planivacacionConstantesFunciones.cargarid_estructura_seccionPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_estructura_seccionPlaniVacacion) {
						//this.cargarCombosEstructuraSeccionsForeignKeyLista(" where id="+this.planivacacion.getid_estructura_seccion());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.estructuraseccionsForeignKey=new ArrayList<Estructura>();

						if(planivacacion.getEstructuraSeccion()!=null) {
							this.estructuraseccionsForeignKey.add(planivacacion.getEstructuraSeccion());
						}

						this.addItemDefectoCombosForeignKeyEstructuraSeccion();
						this.cargarCombosFrameEstructuraSeccionsForeignKey("Todos");
					}
					this.setActualEstructuraSeccionForeignKey(this.planivacacion.getid_estructura_seccion(),false,"Formulario");

					//EstructuraCargo
					if(!this.planivacacionConstantesFunciones.cargarid_estructura_cargoPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_estructura_cargoPlaniVacacion) {
						//this.cargarCombosEstructuraCargosForeignKeyLista(" where id="+this.planivacacion.getid_estructura_cargo());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.estructuracargosForeignKey=new ArrayList<Estructura>();

						if(planivacacion.getEstructuraCargo()!=null) {
							this.estructuracargosForeignKey.add(planivacacion.getEstructuraCargo());
						}

						this.addItemDefectoCombosForeignKeyEstructuraCargo();
						this.cargarCombosFrameEstructuraCargosForeignKey("Todos");
					}
					this.setActualEstructuraCargoForeignKey(this.planivacacion.getid_estructura_cargo(),false,"Formulario");

					//Empleado
					if(!this.planivacacionConstantesFunciones.cargarid_empleadoPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_empleadoPlaniVacacion) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.planivacacion.getid_empleado());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(planivacacion.getEmpleado()!=null) {
							this.empleadosForeignKey.add(planivacacion.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.planivacacion.getid_empleado(),false,"Formulario");

					//Mes
					if(!this.planivacacionConstantesFunciones.cargarid_mesPlaniVacacion || this.planivacacionConstantesFunciones.event_dependid_mesPlaniVacacion) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.planivacacion.getid_mes());
									//this.inicializarActualizarBindingPlaniVacacion(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(planivacacion.getMes()!=null) {
							this.messForeignKey.add(planivacacion.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.planivacacion.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPlaniVacacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPlaniVacacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaniVacacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaniVacacion(PlaniVacacion planivacacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPlaniVacacion(planivacacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaniVacacion(PlaniVacacion planivacacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPlaniVacacion(planivacacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPlaniVacacion(planivacacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPlaniVacacion(planivacacion);
	}
	
	public void setVariablesObjetoActualToFormularioPlaniVacacion(PlaniVacacion planivacacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setText(planivacacion.getId().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setDate(planivacacion.getfecha_inicio());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setDate(planivacacion.getfecha_fin());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setText(planivacacion.getdias_anio().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setText(planivacacion.getdias_realizadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setText(planivacacion.getdias_pendiente().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setText(planivacacion.getdias_tomados().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setText(planivacacion.getdias_anticipadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setText(planivacacion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PlaniVacacion planivacacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,planivacacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PlaniVacacion planivacacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				planivacacionLocal=this.planivacacion;
			} else {
				planivacacionLocal=this.planivacacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(planivacacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPlaniVacacion(planivacacionLocal,true);
					
					if(planivacacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(planivacacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(planivacacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPlaniVacacion(PlaniVacacion planivacacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaniVacacion(planivacacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(planivacacion);
	}
	
	public void setVariablesFormularioToObjetoActualPlaniVacacion(PlaniVacacion planivacacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaniVacacion(planivacacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPlaniVacacion(PlaniVacacion planivacacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.getText()==null || this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.getText()=="" || this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.getText()=="Id") {
				this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setText("0");
			}

			if(conColumnasBase) {planivacacion.setId(Long.parseLong(this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelIdPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setfecha_inicio(this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_inicioPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setfecha_fin(this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabelfecha_finPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdias_anio(Double.parseDouble(this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DIASANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anioPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdias_realizadas(Double.parseDouble(this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_realizadasPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdias_pendiente(Double.parseDouble(this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_pendientePlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdias_tomados(Double.parseDouble(this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_tomadosPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdias_anticipadas(Double.parseDouble(this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldias_anticipadasPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planivacacion.setdescripcion(this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaniVacacion.jLabeldescripcionPlaniVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaniVacacion(PlaniVacacion planivacacionBean,PlaniVacacion planivacacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPlaniVacacion(PlaniVacacion planivacacionOrigen,PlaniVacacion planivacacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planivacacionOrigen.getId()!=null && !planivacacionOrigen.getId().equals(0L))) {planivacacion.setId(planivacacionOrigen.getId());}}
			if(conDefault || (!conDefault && planivacacionOrigen.getfecha_inicio()!=null && !planivacacionOrigen.getfecha_inicio().equals(new Date()))) {planivacacion.setfecha_inicio(planivacacionOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && planivacacionOrigen.getfecha_fin()!=null && !planivacacionOrigen.getfecha_fin().equals(new Date()))) {planivacacion.setfecha_fin(planivacacionOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdias_anio()!=null && !planivacacionOrigen.getdias_anio().equals(0.0))) {planivacacion.setdias_anio(planivacacionOrigen.getdias_anio());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdias_realizadas()!=null && !planivacacionOrigen.getdias_realizadas().equals(0.0))) {planivacacion.setdias_realizadas(planivacacionOrigen.getdias_realizadas());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdias_pendiente()!=null && !planivacacionOrigen.getdias_pendiente().equals(0.0))) {planivacacion.setdias_pendiente(planivacacionOrigen.getdias_pendiente());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdias_tomados()!=null && !planivacacionOrigen.getdias_tomados().equals(0.0))) {planivacacion.setdias_tomados(planivacacionOrigen.getdias_tomados());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdias_anticipadas()!=null && !planivacacionOrigen.getdias_anticipadas().equals(0.0))) {planivacacion.setdias_anticipadas(planivacacionOrigen.getdias_anticipadas());}
			if(conDefault || (!conDefault && planivacacionOrigen.getdescripcion()!=null && !planivacacionOrigen.getdescripcion().equals(""))) {planivacacion.setdescripcion(planivacacionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaniVacacion(PlaniVacacion planivacacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setText(planivacacion.getId().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setDate(planivacacion.getfecha_inicio());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setDate(planivacacion.getfecha_fin());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setText(planivacacion.getdias_anio().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setText(planivacacion.getdias_realizadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setText(planivacacion.getdias_pendiente().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setText(planivacacion.getdias_tomados().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setText(planivacacion.getdias_anticipadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setText(planivacacion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaniVacacion(PlaniVacacionBean planivacacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setText(planivacacionBean.getId().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setDate(planivacacionBean.getfecha_inicio());
			this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setDate(planivacacionBean.getfecha_fin());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setText(planivacacionBean.getdias_anio().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setText(planivacacionBean.getdias_realizadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setText(planivacacionBean.getdias_pendiente().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setText(planivacacionBean.getdias_tomados().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setText(planivacacionBean.getdias_anticipadas().toString());
			this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setText(planivacacionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPlaniVacacion(PlaniVacacionParameterReturnGeneral planivacacionReturnGeneral,PlaniVacacionBean planivacacionBean,Boolean conDefault) throws Exception { 
		try {
			PlaniVacacion planivacacionLocal=new PlaniVacacion();
			
			planivacacionLocal=planivacacionReturnGeneral.getPlaniVacacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planivacacionLocal.getId()!=null && !planivacacionLocal.getId().equals(0L))) {planivacacionBean.setId(planivacacionLocal.getId());}}
			if(conDefault || (!conDefault && planivacacionLocal.getfecha_inicio()!=null && !planivacacionLocal.getfecha_inicio().equals(new Date()))) {planivacacionBean.setfecha_inicio(planivacacionLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && planivacacionLocal.getfecha_fin()!=null && !planivacacionLocal.getfecha_fin().equals(new Date()))) {planivacacionBean.setfecha_fin(planivacacionLocal.getfecha_fin());}
			if(conDefault || (!conDefault && planivacacionLocal.getdias_anio()!=null && !planivacacionLocal.getdias_anio().equals(0.0))) {planivacacionBean.setdias_anio(planivacacionLocal.getdias_anio());}
			if(conDefault || (!conDefault && planivacacionLocal.getdias_realizadas()!=null && !planivacacionLocal.getdias_realizadas().equals(0.0))) {planivacacionBean.setdias_realizadas(planivacacionLocal.getdias_realizadas());}
			if(conDefault || (!conDefault && planivacacionLocal.getdias_pendiente()!=null && !planivacacionLocal.getdias_pendiente().equals(0.0))) {planivacacionBean.setdias_pendiente(planivacacionLocal.getdias_pendiente());}
			if(conDefault || (!conDefault && planivacacionLocal.getdias_tomados()!=null && !planivacacionLocal.getdias_tomados().equals(0.0))) {planivacacionBean.setdias_tomados(planivacacionLocal.getdias_tomados());}
			if(conDefault || (!conDefault && planivacacionLocal.getdias_anticipadas()!=null && !planivacacionLocal.getdias_anticipadas().equals(0.0))) {planivacacionBean.setdias_anticipadas(planivacacionLocal.getdias_anticipadas());}
			if(conDefault || (!conDefault && planivacacionLocal.getdescripcion()!=null && !planivacacionLocal.getdescripcion().equals(""))) {planivacacionBean.setdescripcion(planivacacionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPlaniVacacionGenerico(Long idPlaniVacacionSeleccionado,JComboBox jComboBoxPlaniVacacion,List<PlaniVacacion> planivacacionsLocal)throws Exception {
		try {
			PlaniVacacion  planivacacionTemp=null;

			for(PlaniVacacion planivacacionAux:planivacacionsLocal) {
				if(planivacacionAux.getId()!=null && planivacacionAux.getId().equals(idPlaniVacacionSeleccionado)) {
					planivacacionTemp=planivacacionAux;
					break;
				}
			}

			jComboBoxPlaniVacacion.setSelectedItem(planivacacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPlaniVacacionGenerico(JComboBox jComboBoxPlaniVacacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaniVacacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPlaniVacacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaniVacacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPlaniVacacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planivacacion=(PlaniVacacion) planivacacionLogic.getPlaniVacacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planivacacion =(PlaniVacacion) planivacacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EstructuraSeccion")) {
			//sDescripcion=this.getActualEstructuraSeccionForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getestructuraseccion_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraSeccionForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getestructuraseccion_descripcion();
			}
		}

		if(sTipo.equals("EstructuraCargo")) {
			//sDescripcion=this.getActualEstructuraCargoForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getestructuracargo_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraCargoForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getestructuracargo_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!planivacacion.getIsNew() && !planivacacion.getIsChanged() && !planivacacion.getIsDeleted()) {
				sDescripcion=planivacacion.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=planivacacion.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PlaniVacacion planivacacionRow=new PlaniVacacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planivacacionRow=(PlaniVacacion) planivacacionLogic.getPlaniVacacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planivacacionRow=(PlaniVacacion) planivacacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPlaniVacacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion));			
			this.jButtonDuplicarPlaniVacacion.setVisible((this.isVisibilidadCeldaDuplicarPlaniVacacion && this.isPermisoDuplicarPlaniVacacion));			
			this.jButtonCopiarPlaniVacacion.setVisible((this.isVisibilidadCeldaCopiarPlaniVacacion && this.isPermisoCopiarPlaniVacacion));
			this.jButtonVerFormPlaniVacacion.setVisible((this.isVisibilidadCeldaVerFormPlaniVacacion && this.isPermisoVerFormPlaniVacacion));
			
			this.jButtonAbrirOrderByPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));			
			
			this.jButtonNuevoRelacionesPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion && this.isPermisoNuevoPlaniVacacion));			
			this.jButtonNuevoGuardarCambiosPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarPlaniVacacion.setVisible((this.isVisibilidadCeldaModificarPlaniVacacion && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.setVisible((this.isVisibilidadCeldaActualizarPlaniVacacion && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.setVisible((this.isVisibilidadCeldaEliminarPlaniVacacion && this.isPermisoEliminarPlaniVacacion));
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.setVisible(this.isVisibilidadCeldaCancelarPlaniVacacion);							
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion));						
			this.jButtonDuplicarToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaDuplicarPlaniVacacion && this.isPermisoDuplicarPlaniVacacion));						
			this.jButtonCopiarToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaCopiarPlaniVacacion && this.isPermisoCopiarPlaniVacacion));			
			this.jButtonVerFormToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaVerFormPlaniVacacion && this.isPermisoVerFormPlaniVacacion));			
			this.jButtonAbrirOrderByToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));
			this.jButtonNuevoRelacionesToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion && this.isPermisoNuevoPlaniVacacion));			
			this.jButtonNuevoGuardarCambiosToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));			
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaModificarPlaniVacacion && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaActualizarPlaniVacacion  && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaEliminarPlaniVacacion && this.isPermisoEliminarPlaniVacacion));
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarToolBarPlaniVacacion.setVisible(this.isVisibilidadCeldaCancelarPlaniVacacion);				
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion));			
			this.jMenuItemDuplicarPlaniVacacion.setVisible((this.isVisibilidadCeldaDuplicarPlaniVacacion && this.isPermisoDuplicarPlaniVacacion));			
			this.jMenuItemCopiarPlaniVacacion.setVisible((this.isVisibilidadCeldaCopiarPlaniVacacion && this.isPermisoCopiarPlaniVacacion));			
			this.jMenuItemVerFormPlaniVacacion.setVisible((this.isVisibilidadCeldaVerFormPlaniVacacion && this.isPermisoVerFormPlaniVacacion));			
			this.jMenuItemAbrirOrderByPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));			
			//this.jMenuItemMostrarOcultarPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));
			this.jMenuItemDetalleAbrirOrderByPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));			
			//this.jMenuItemDetalleMostrarOcultarPlaniVacacion.setVisible((this.isVisibilidadCeldaOrdenPlaniVacacion && this.isPermisoOrdenPlaniVacacion));			
			this.jMenuItemNuevoRelacionesPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion && this.isPermisoNuevoPlaniVacacion));			
			this.jMenuItemNuevoGuardarCambiosPlaniVacacion.setVisible((this.isVisibilidadCeldaNuevoPlaniVacacion && this.isPermisoNuevoPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));									
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemModificarPlaniVacacion.setVisible((this.isVisibilidadCeldaModificarPlaniVacacion && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemActualizarPlaniVacacion.setVisible((this.isVisibilidadCeldaActualizarPlaniVacacion && this.isPermisoActualizarPlaniVacacion));	
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemEliminarPlaniVacacion.setVisible((this.isVisibilidadCeldaEliminarPlaniVacacion && this.isPermisoEliminarPlaniVacacion));
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemCancelarPlaniVacacion.setVisible(this.isVisibilidadCeldaCancelarPlaniVacacion);				
			}
			
			this.jMenuItemGuardarCambiosPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));						
			this.jMenuItemGuardarCambiosTablaPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPlaniVacacion=this.jButtonNuevoPlaniVacacion.isVisible();
			this.isVisibilidadCeldaDuplicarPlaniVacacion=this.jButtonDuplicarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaCopiarPlaniVacacion=this.jButtonCopiarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaVerFormPlaniVacacion=this.jButtonVerFormPlaniVacacion.isVisible();
			
			this.isVisibilidadCeldaOrdenPlaniVacacion=this.jButtonAbrirOrderByPlaniVacacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=this.jButtonNuevoRelacionesPlaniVacacion.isVisible();
			this.isVisibilidadCeldaModificarPlaniVacacion=this.jButtonModificarPlaniVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.isVisibilidadCeldaActualizarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaEliminarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaCancelarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaGuardarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=this.jButtonGuardarCambiosTablaPlaniVacacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPlaniVacacion=this.jButtonNuevoToolBarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=this.jButtonNuevoRelacionesToolBarPlaniVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.isVisibilidadCeldaModificarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarToolBarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaActualizarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarToolBarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaEliminarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarToolBarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaCancelarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarToolBarPlaniVacacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaniVacacion=this.jButtonGuardarCambiosToolBarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=this.jButtonGuardarCambiosTablaToolBarPlaniVacacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPlaniVacacion=this.jMenuItemNuevoPlaniVacacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=this.jMenuItemNuevoRelacionesPlaniVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.isVisibilidadCeldaModificarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemModificarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaActualizarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemActualizarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaEliminarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemEliminarPlaniVacacion.isVisible();
			this.isVisibilidadCeldaCancelarPlaniVacacion=this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemCancelarPlaniVacacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaniVacacion=this.jMenuItemGuardarCambiosPlaniVacacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=this.jMenuItemGuardarCambiosTablaPlaniVacacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPlaniVacacion(Boolean esInicializar) {
		if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
				//if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPlaniVacacion();
			}
			
			this.inicializarActualizarBindingBotonesManualPlaniVacacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPlaniVacacion() {
		this.jButtonNuevoPlaniVacacion.setVisible(this.isPermisoNuevoPlaniVacacion);			
		this.jButtonDuplicarPlaniVacacion.setVisible(this.isPermisoDuplicarPlaniVacacion);			
		this.jButtonCopiarPlaniVacacion.setVisible(this.isPermisoCopiarPlaniVacacion);			
		this.jButtonVerFormPlaniVacacion.setVisible(this.isPermisoVerFormPlaniVacacion);			
		
		this.jButtonAbrirOrderByPlaniVacacion.setVisible(this.isPermisoOrdenPlaniVacacion);					
		
		this.jButtonNuevoRelacionesPlaniVacacion.setVisible(this.isPermisoNuevoPlaniVacacion);			
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarPlaniVacacion.setVisible(this.isPermisoActualizarPlaniVacacion);	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.setVisible(this.isPermisoActualizarPlaniVacacion);	
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.setVisible(this.isPermisoEliminarPlaniVacacion);
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.setVisible(this.isVisibilidadCeldaCancelarPlaniVacacion);						
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.setVisible(this.isPermisoGuardarCambiosPlaniVacacion);							
		}
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.setVisible(this.isPermisoActualizarPlaniVacacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePlaniVacacion() {
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarPlaniVacacion.setVisible(this.isPermisoActualizarPlaniVacacion);	
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.setVisible(this.isPermisoActualizarPlaniVacacion);	
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.setVisible(this.isPermisoEliminarPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.setVisible(this.isVisibilidadCeldaCancelarPlaniVacacion);							
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.setVisible((this.isVisibilidadCeldaGuardarPlaniVacacion && this.isPermisoGuardarCambiosPlaniVacacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPlaniVacacion() {
		if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPlaniVacacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPlaniVacacion() {
	}
	
	public void jTableDatosPlaniVacacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPlaniVacacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.planivacacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.planivacacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.planivacacion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.planivacacion.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructura_seccionPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructuraseccion=true;

			idTienePermisoestructuraseccion=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructuraseccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.estructuraseccionBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraseccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraseccionBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_estructura_seccion()!=null) {
					this.estructuraseccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraseccionBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_estructura_seccion());
					this.estructuraseccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraseccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraseccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraseccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBorderestructuraseccion=(TitledBorder)this.estructuraseccionBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructuraseccion.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructura_seccionPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_estructura_seccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura_seccion = "+this.planivacacion.getid_estructura_seccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructura_cargoPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructuracargo=true;

			idTienePermisoestructuracargo=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructuracargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.estructuracargoBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuracargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuracargoBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_estructura_cargo()!=null) {
					this.estructuracargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuracargoBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_estructura_cargo());
					this.estructuracargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuracargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuracargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuracargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBorderestructuracargo=(TitledBorder)this.estructuracargoBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructuracargo.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructura_cargoPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_estructura_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura_cargo = "+this.planivacacion.getid_estructura_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.planivacacion.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.planivacacion.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.planivacacion.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPlaniVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPlaniVacacion(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaniVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaniVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.planivacacionLogic.getConnexion());

				if(this.planivacacion.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.planivacacion.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaniVacacion=(TitledBorder)this.jScrollPanelDatosPlaniVacacion.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPlaniVacacion.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.planivacacion.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_anioPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdias_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_anio = "+this.planivacacion.getdias_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_realizadasPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdias_realizadas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_realizadas = "+this.planivacacion.getdias_realizadas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_pendientePlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdias_pendiente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_pendiente = "+this.planivacacion.getdias_pendiente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_tomadosPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdias_tomados()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_tomados = "+this.planivacacion.getdias_tomados().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_anticipadasPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdias_anticipadas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_anticipadas = "+this.planivacacion.getdias_anticipadas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPlaniVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.getplanivacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planivacacion==null) {
						this.planivacacion = new PlaniVacacion();
					}

					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);
				}

				if(this.planivacacion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.planivacacion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaniVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdEmpleado();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdEmpresa();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdEstructura();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraCargoPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdEstructuraCargo();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraSeccionPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdEstructuraSeccion();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdMes();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPlaniVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaniVacacion(false,false);

			this.getPlaniVacacionsFK_IdSucursal();

			this.inicializarActualizarBindingPlaniVacacion(false);

			//if(PlaniVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaniVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planivacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePlaniVacacion() {
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
			this.jInternalFrameDetalleFormPlaniVacacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormPlaniVacacion.dispose();
			this.jInternalFrameDetalleFormPlaniVacacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
			this.jInternalFrameReporteDinamicoPlaniVacacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPlaniVacacion.dispose();
			this.jInternalFrameReporteDinamicoPlaniVacacion=null;
		}
		
		if(this.jInternalFrameImportacionPlaniVacacion!=null) {
			this.jInternalFrameImportacionPlaniVacacion.setVisible(false);	    			
			this.jInternalFrameImportacionPlaniVacacion.dispose();
			this.jInternalFrameImportacionPlaniVacacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPlaniVacacion();
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPlaniVacacion")) {
				jButtonDuplicarPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPlaniVacacion")) {
				jButtonCopiarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormPlaniVacacion")) {
				jButtonVerFormPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPlaniVacacion")) {
				jButtonDuplicarPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPlaniVacacion")) {
				jButtonDuplicarPlaniVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPlaniVacacion")) {
				jButtonModificarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPlaniVacacion")) {
				jButtonModificarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPlaniVacacion")) {
				jButtonModificarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPlaniVacacion")) {
				jButtonActualizarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPlaniVacacion")) {
				jButtonActualizarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPlaniVacacion")) {
				jButtonActualizarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarPlaniVacacion")) {
				jButtonEliminarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPlaniVacacion")) {
				jButtonEliminarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPlaniVacacion")) {
				jButtonEliminarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarPlaniVacacion")) {
				jButtonCancelarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPlaniVacacion")) {
				jButtonCancelarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPlaniVacacion")) {
				jButtonCancelarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarPlaniVacacion")) {
				jButtonCerrarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPlaniVacacion")) {
				jButtonCerrarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPlaniVacacion")) {
				jButtonCerrarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPlaniVacacion")) {
				jButtonMostrarOcultarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPlaniVacacion")) {
				jButtonCancelarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPlaniVacacion")) {
				jButtonCopiarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPlaniVacacion")) {
				jButtonVerFormPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPlaniVacacion")) {
				jButtonCopiarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPlaniVacacion")) {
				jButtonVerFormPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPlaniVacacion")) {
				jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPlaniVacacion")) {
				jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPlaniVacacion")) {
				jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPlaniVacacion")) {
				jButtonAnterioresPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPlaniVacacion")) {
				jButtonAnterioresPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePlaniVacacion")) {
				jButtonAnterioresPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPlaniVacacion")) {
				jButtonSiguientesPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPlaniVacacion")) {
				jButtonSiguientesPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPlaniVacacion")) {
				jButtonSiguientesPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPlaniVacacion") || sTipo.equals("MenuItemDetalleAbrirOrderByPlaniVacacion")) {
				jButtonAbrirOrderByPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPlaniVacacion") || sTipo.equals("MenuItemDetalleMostrarOcultarPlaniVacacion")) {
				jButtonMostrarOcultarPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPlaniVacacion")) {
				jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPlaniVacacion")) {
				jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPlaniVacacion")) {
				jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPlaniVacacion")) {
				jButtonCerrarReporteDinamicoPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPlaniVacacion")) {
				jButtonGenerarReporteDinamicoPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPlaniVacacion")) {
				
				jButtonGenerarExcelReporteDinamicoPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPlaniVacacion")) {
				jButtonCerrarImportacionPlaniVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPlaniVacacion")) {
				
				jButtonGenerarImportacionPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPlaniVacacion")) {
				
				jButtonAbrirImportacionPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPlaniVacacion")) {
				jComboBoxTiposAccionesPlaniVacacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPlaniVacacion")) {
				jComboBoxTiposRelacionesPlaniVacacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPlaniVacacion")) {
				jComboBoxTiposAccionesPlaniVacacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPlaniVacacion")) {
				
				jComboBoxTiposSeleccionarPlaniVacacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPlaniVacacion")) {
				jTextFieldValorCampoGeneralPlaniVacacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPlaniVacacion")) {
				jButtonAbrirOrderByPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPlaniVacacion")) {
				jButtonAbrirOrderByPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPlaniVacacion")) {
				jButtonCerrarOrderByPlaniVacacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaniVacacionBusqueda")) {
				this.jButtonidPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaniVacacionUpdate")) {
				this.jButtonid_empresaPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaniVacacionBusqueda")) {
				this.jButtonid_empresaPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPlaniVacacionUpdate")) {
				this.jButtonid_sucursalPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPlaniVacacionBusqueda")) {
				this.jButtonid_sucursalPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraPlaniVacacionUpdate")) {
				this.jButtonid_estructuraPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraPlaniVacacionBusqueda")) {
				this.jButtonid_estructuraPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_seccionPlaniVacacionUpdate")) {
				this.jButtonid_estructura_seccionPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_seccionPlaniVacacionBusqueda")) {
				this.jButtonid_estructura_seccionPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_cargoPlaniVacacionUpdate")) {
				this.jButtonid_estructura_cargoPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_cargoPlaniVacacionBusqueda")) {
				this.jButtonid_estructura_cargoPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPlaniVacacionUpdate")) {
				this.jButtonid_empleadoPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPlaniVacacionBusqueda")) {
				this.jButtonid_empleadoPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPlaniVacacionBusqueda")) {
				this.jButtonfecha_inicioPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPlaniVacacionBusqueda")) {
				this.jButtonfecha_finPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPlaniVacacionUpdate")) {
				this.jButtonid_mesPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPlaniVacacionBusqueda")) {
				this.jButtonid_mesPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_anioPlaniVacacionBusqueda")) {
				this.jButtondias_anioPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_realizadasPlaniVacacionBusqueda")) {
				this.jButtondias_realizadasPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_pendientePlaniVacacionBusqueda")) {
				this.jButtondias_pendientePlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_tomadosPlaniVacacionBusqueda")) {
				this.jButtondias_tomadosPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_anticipadasPlaniVacacionBusqueda")) {
				this.jButtondias_anticipadasPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPlaniVacacionBusqueda")) {
				this.jButtondescripcionPlaniVacacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoPlaniVacacion")) {
				this.jButtonFK_IdEmpleadoPlaniVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraPlaniVacacion")) {
				this.jButtonFK_IdEstructuraPlaniVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraCargoPlaniVacacion")) {
				this.jButtonFK_IdEstructuraCargoPlaniVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraSeccionPlaniVacacion")) {
				this.jButtonFK_IdEstructuraSeccionPlaniVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesPlaniVacacion")) {
				this.jButtonFK_IdMesPlaniVacacionActionPerformed(evt);
			}
			
			;
			
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPlaniVacacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PlaniVacacion planivacacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				planivacacionLocal=this.planivacacion;
			} else {
				planivacacionLocal=this.planivacacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
							
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
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
			
			


			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
								
						
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
								
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
							
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
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
			
			


			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
								
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPlaniVacacion")) {
					jCheckBoxSeleccionarTodosPlaniVacacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPlaniVacacion")) {
					jCheckBoxSeleccionadosPlaniVacacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPlaniVacacion")) {
					
				}
				
				


				
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
												
				
				


				
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
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
			
			


			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaniVacacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planivacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planivacacion);
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
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
				
				


				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaniVacacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaniVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaniVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planivacacionAnterior =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPlaniVacacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPlaniVacacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPlaniVacacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.planivacacion =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.planivacacion =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.planivacacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPlaniVacacion")) {
				
				}
				
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPlaniVacacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPlaniVacacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPlaniVacacion")) {
			
			}
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPlaniVacacion();
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			if(sTipo.equals("NuevoPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPlaniVacacion")) {
				jButtonDuplicarPlaniVacacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPlaniVacacion")) {
				jButtonCopiarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPlaniVacacion")) {
				jButtonVerFormPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPlaniVacacion")) {
				jButtonNuevoPlaniVacacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPlaniVacacion")) {
				jButtonModificarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPlaniVacacion")) {
				jButtonActualizarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPlaniVacacion")) {
				jButtonEliminarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPlaniVacacion")) {
				jButtonCancelarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPlaniVacacion")) {
				jButtonCerrarPlaniVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPlaniVacacion")) {
				jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPlaniVacacion")) {
				jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPlaniVacacion")) {
				jButtonAbrirOrderByPlaniVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPlaniVacacion")) {
				jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPlaniVacacion")) {
				jButtonAnterioresPlaniVacacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPlaniVacacion")) {
				jButtonSiguientesPlaniVacacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaniVacacionBusqueda")) {
				this.jButtonidPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaniVacacionUpdate")) {
				this.jButtonid_empresaPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaniVacacionBusqueda")) {
				this.jButtonid_empresaPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPlaniVacacionUpdate")) {
				this.jButtonid_sucursalPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPlaniVacacionBusqueda")) {
				this.jButtonid_sucursalPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraPlaniVacacionUpdate")) {
				this.jButtonid_estructuraPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraPlaniVacacionBusqueda")) {
				this.jButtonid_estructuraPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_seccionPlaniVacacionUpdate")) {
				this.jButtonid_estructura_seccionPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_seccionPlaniVacacionBusqueda")) {
				this.jButtonid_estructura_seccionPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_cargoPlaniVacacionUpdate")) {
				this.jButtonid_estructura_cargoPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_cargoPlaniVacacionBusqueda")) {
				this.jButtonid_estructura_cargoPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPlaniVacacionUpdate")) {
				this.jButtonid_empleadoPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPlaniVacacionBusqueda")) {
				this.jButtonid_empleadoPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPlaniVacacionBusqueda")) {
				this.jButtonfecha_inicioPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPlaniVacacionBusqueda")) {
				this.jButtonfecha_finPlaniVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPlaniVacacionUpdate")) {
				this.jButtonid_mesPlaniVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPlaniVacacionBusqueda")) {
				this.jButtonid_mesPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_anioPlaniVacacionBusqueda")) {
				this.jButtondias_anioPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_realizadasPlaniVacacionBusqueda")) {
				this.jButtondias_realizadasPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_pendientePlaniVacacionBusqueda")) {
				this.jButtondias_pendientePlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_tomadosPlaniVacacionBusqueda")) {
				this.jButtondias_tomadosPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_anticipadasPlaniVacacionBusqueda")) {
				this.jButtondias_anticipadasPlaniVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPlaniVacacionBusqueda")) {
				this.jButtondescripcionPlaniVacacionBusquedaActionPerformed(evt);
			}
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPlaniVacacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePlaniVacacion")) {
				closingInternalFramePlaniVacacion();
				
			} else if(sTipo.equals("jButtonCancelarPlaniVacacion")) {
				JInternalFrameBase jInternalFrameDetalleFormPlaniVacacion = (JInternalFrameBase)evt.getSource();
	            	
	            PlaniVacacionBeanSwingJInternalFrame jInternalFrameParent=(PlaniVacacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaniVacacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPlaniVacacionActionPerformed(null);
			}
			
			PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planivacacion,new Object(),this.planivacacionParameterGeneral,this.planivacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPlaniVacacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPlaniVacacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPlaniVacacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.planivacacion)) {
			if(!esControlTabla) {
				if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);			
				}
				
				if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPlaniVacacion(this.planivacacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planivacacionReturnGeneral=planivacacionLogic.procesarEventosPlaniVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planivacacionLogic.getPlaniVacacions(),this.planivacacion,this.planivacacionParameterGeneral,this.isEsNuevoPlaniVacacion,classes);//this.planivacacionLogic.getPlaniVacacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPlaniVacacion(this.planivacacionReturnGeneral,this.planivacacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPlaniVacacion(classes,this.planivacacionReturnGeneral,this.planivacacionBean,false);
					}
						
					if(this.planivacacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion());	
					}
						
					if(this.planivacacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion(),classes);//this.planivacacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPlaniVacacion(this.planivacacion,classes);//this.planivacacionBean);									
				}
			
				if(PlaniVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPlaniVacacion(this.planivacacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaniVacacion(this.planivacacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.planivacacionAnterior!=null) {
						this.planivacacion=this.planivacacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planivacacionReturnGeneral=planivacacionLogic.procesarEventosPlaniVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planivacacionLogic.getPlaniVacacions(),this.planivacacion,this.planivacacionParameterGeneral,this.isEsNuevoPlaniVacacion,classes);//this.planivacacionLogic.getPlaniVacacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planivacacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planivacacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.planivacacionReturnGeneral.getPlaniVacacion(),planivacacionLogic.getPlaniVacacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.planivacacionReturnGeneral.getPlaniVacacion(),this.planivacacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPlaniVacacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosPlaniVacacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPlaniVacacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosPlaniVacacion() throws Exception {
		
		PlaniVacacionModel planivacacionModel=(PlaniVacacionModel)this.jTableDatosPlaniVacacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planivacacionModel.planivacacions=this.planivacacionLogic.getPlaniVacacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			planivacacionModel.planivacacions=this.planivacacions;
		}
		
		
		((PlaniVacacionModel) this.jTableDatosPlaniVacacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPlaniVacacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getplanivacacionAnterior(),this.planivacacionLogic.getPlaniVacacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getplanivacacionAnterior(),this.planivacacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPlaniVacacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPlaniVacacion(PlaniVacacion planivacacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
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
										
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planivacacion,new Object(),generalEntityParameterGeneral,this.planivacacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PlaniVacacionConstantesFunciones.getClassesRelationshipsOfPlaniVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PlaniVacacionConstantesFunciones.getClassesRelationshipsFromStringsOfPlaniVacacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPlaniVacacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PlaniVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planivacacion,new Object(),generalEntityParameterGeneral,this.planivacacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPlaniVacacion(PlaniVacacionBean planivacacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPlaniVacacion(ArrayList<Classe> classes,PlaniVacacionReturnGeneral planivacacionReturnGeneral,PlaniVacacionBean planivacacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPlaniVacacion(PlaniVacacion planivacacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.planivacacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPlaniVacacion = new PlaniVacacionDetalleFormJInternalFrame(jDesktopPane,this.planivacacionSessionBean.getConGuardarRelaciones(),this.planivacacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.setVisible(false);
		this.jInternalFrameDetalleFormPlaniVacacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormPlaniVacacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPlaniVacacion.planivacacionLogic=this.planivacacionLogic;
		
		this.cargarCombosFrameForeignKeyPlaniVacacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePlaniVacacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaniVacacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPlaniVacacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPlaniVacacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPlaniVacacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaniVacacion"));
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ModificarPlaniVacacion"));

		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaniVacacion"));
					
		this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemModificarPlaniVacacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaniVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.addActionListener (new ButtonActionListener(this,"ActualizarPlaniVacacion"));
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaniVacacion"));
						
		this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemActualizarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaniVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.addActionListener (new ButtonActionListener(this,"EliminarPlaniVacacion"));
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaniVacacion"));
								
		this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemEliminarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaniVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CancelarPlaniVacacion"));
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaniVacacion"));
					
		this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemCancelarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaniVacacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemDetalleCerrarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaniVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaniVacacion"));
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaniVacacion"));
		
		
		
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaniVacacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonidPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_inicioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_finPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_realizadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_realizadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_pendientePlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_pendientePlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_tomadosPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_tomadosPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anticipadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anticipadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondescripcionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlaniVacacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaniVacacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePlaniVacacion"));
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaniVacacion"));
		}
		
		this.jTableDatosPlaniVacacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPlaniVacacion"));
		
		this.jTableDatosPlaniVacacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPlaniVacacion"));
		
		this.jButtonNuevoPlaniVacacion.addActionListener(new ButtonActionListener(this,"NuevoPlaniVacacion"));
		
		this.jButtonDuplicarPlaniVacacion.addActionListener(new ButtonActionListener(this,"DuplicarPlaniVacacion"));
		
		this.jButtonCopiarPlaniVacacion.addActionListener(new ButtonActionListener(this,"CopiarPlaniVacacion"));
		
		this.jButtonVerFormPlaniVacacion.addActionListener(new ButtonActionListener(this,"VerFormPlaniVacacion"));
		
		
		this.jButtonNuevoToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarPlaniVacacion"));
			
		this.jButtonDuplicarToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPlaniVacacion"));
			
		this.jMenuItemNuevoPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPlaniVacacion"));
			
		this.jMenuItemDuplicarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPlaniVacacion"));		
		
		
		this.jButtonNuevoRelacionesPlaniVacacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPlaniVacacion"));
		
		
		this.jButtonNuevoRelacionesToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPlaniVacacion"));
			
		this.jMenuItemNuevoRelacionesPlaniVacacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPlaniVacacion"));		
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ModificarPlaniVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonModificarToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaniVacacion"));
			
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemModificarPlaniVacacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaniVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarPlaniVacacion.addActionListener (new ButtonActionListener(this,"ActualizarPlaniVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonActualizarToolBarPlaniVacacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaniVacacion"));
				
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemActualizarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaniVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarPlaniVacacion.addActionListener (new ButtonActionListener(this,"EliminarPlaniVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonEliminarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaniVacacion"));
						
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemEliminarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaniVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CancelarPlaniVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonCancelarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaniVacacion"));
			
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemCancelarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaniVacacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPlaniVacacion"));		
		
		
		this.jButtonCerrarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CerrarPlaniVacacion"));
		
		
		this.jButtonCerrarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarPlaniVacacion"));
			
		this.jMenuItemCerrarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPlaniVacacion"));
			
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jMenuItemDetalleCerrarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaniVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosPlaniVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaniVacacion"));
		}
		
		this.jButtonCopiarToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarPlaniVacacion"));
			
		this.jButtonVerFormToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarPlaniVacacion"));
		
		this.jMenuItemGuardarCambiosPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPlaniVacacion"));
			
		this.jMenuItemCopiarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPlaniVacacion"));		
		
		this.jMenuItemVerFormPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPlaniVacacion"));		
		
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaniVacacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPlaniVacacion"));
			
		this.jMenuItemGuardarCambiosTablaPlaniVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaniVacacion"));		
		
		
		
		this.jButtonRecargarInformacionPlaniVacacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionPlaniVacacion"));
					
		this.jButtonRecargarInformacionToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPlaniVacacion"));
		
		this.jMenuItemRecargarInformacionPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPlaniVacacion"));		
		
		
		
		this.jButtonAnterioresPlaniVacacion.addActionListener (new ButtonActionListener(this,"AnterioresPlaniVacacion"));
		
		
		this.jButtonAnterioresToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPlaniVacacion"));
		
		this.jMenuItemAnterioresPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPlaniVacacion"));		
		
		
		this.jButtonSiguientesPlaniVacacion.addActionListener (new ButtonActionListener(this,"SiguientesPlaniVacacion"));
		
		
		this.jButtonSiguientesToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPlaniVacacion"));
			
		this.jMenuItemSiguientesPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPlaniVacacion"));
			
		this.jMenuItemAbrirOrderByPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPlaniVacacion"));
			
		this.jMenuItemMostrarOcultarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPlaniVacacion"));
			
		this.jMenuItemDetalleAbrirOrderByPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPlaniVacacion"));
			
		this.jMenuItemDetalleMostarOcultarPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPlaniVacacion"));		
		
		
		this.jButtonNuevoGuardarCambiosPlaniVacacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPlaniVacacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPlaniVacacion"));
			
		this.jMenuItemNuevoGuardarCambiosPlaniVacacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPlaniVacacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPlaniVacacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPlaniVacacion"));

		this.jCheckBoxSeleccionadosPlaniVacacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPlaniVacacion"));
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaniVacacion"));
		}
		
		
		this.jComboBoxTiposRelacionesPlaniVacacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesPlaniVacacion"));
			
		this.jComboBoxTiposAccionesPlaniVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesPlaniVacacion"));
					
		this.jComboBoxTiposSeleccionarPlaniVacacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPlaniVacacion"));
			
		this.jTextFieldValorCampoGeneralPlaniVacacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPlaniVacacion"));		
		
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonidPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_inicioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_finPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_realizadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_realizadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_pendientePlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_pendientePlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_tomadosPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_tomadosPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anticipadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anticipadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondescripcionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlaniVacacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPlaniVacacion"));

			this.jButtonFK_IdEstructuraPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraPlaniVacacion"));

			this.jButtonFK_IdEstructuraCargoPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraCargoPlaniVacacion"));

			this.jButtonFK_IdEstructuraSeccionPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSeccionPlaniVacacion"));

			this.jButtonFK_IdMesPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdMesPlaniVacacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPlaniVacacion!=null) {
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaniVacacion"));
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaniVacacion"));
				this.jInternalFrameReporteDinamicoPlaniVacacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaniVacacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoPlaniVacacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaniVacacion"));				
			//this.jButtonGenerarReporteDinamicoPlaniVacacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaniVacacion"));
			//this.jButtonGenerarExcelReporteDinamicoPlaniVacacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaniVacacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPlaniVacacion!=null) {
				this.jInternalFrameImportacionPlaniVacacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaniVacacion"));
				this.jInternalFrameImportacionPlaniVacacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaniVacacion"));
				this.jInternalFrameImportacionPlaniVacacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaniVacacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPlaniVacacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByPlaniVacacion"));
			
			this.jButtonAbrirOrderByToolBarPlaniVacacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPlaniVacacion"));			
			
			if(this.jInternalFrameOrderByPlaniVacacion!=null) {
				this.jInternalFrameOrderByPlaniVacacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaniVacacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaniVacacion.jTabbedPaneRelacionesPlaniVacacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaniVacacion"));
		
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
            		closingInternalFramePlaniVacacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPlaniVacacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPlaniVacacion = (JInternalFrameBase)event.getSource();
	            	
	            PlaniVacacionBeanSwingJInternalFrame jInternalFrameParent=(PlaniVacacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaniVacacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPlaniVacacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPlaniVacacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPlaniVacacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPlaniVacacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPlaniVacacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPlaniVacacion";
		inputMap = this.jButtonNuevoPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaniVacacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaniVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPlaniVacacion";
		inputMap = this.jButtonNuevoRelacionesPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaniVacacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPlaniVacacion";
		inputMap = this.jButtonModificarPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPlaniVacacion";
		inputMap = this.jButtonActualizarPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPlaniVacacion";
		inputMap = this.jButtonEliminarPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPlaniVacacion";
		inputMap = this.jButtonCancelarPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPlaniVacacion";
		inputMap = this.jButtonCerrarPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPlaniVacacion";
		inputMap = this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonGuardarCambiosPlaniVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPlaniVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPlaniVacacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPlaniVacacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPlaniVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPlaniVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPlaniVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPlaniVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPlaniVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPlaniVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonidPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empresaPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_sucursalPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructuraPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_seccionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_estructura_cargoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_cargoPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_empleadoPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_inicioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonfecha_finPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPlaniVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtonid_mesPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anioPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anioPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_realizadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_realizadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_pendientePlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_pendientePlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_tomadosPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_tomadosPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondias_anticipadasPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"dias_anticipadasPlaniVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaniVacacion.jButtondescripcionPlaniVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPlaniVacacionBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPlaniVacacion"));

		this.jButtonFK_IdEstructuraPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraPlaniVacacion"));

		this.jButtonFK_IdEstructuraCargoPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraCargoPlaniVacacion"));

		this.jButtonFK_IdEstructuraSeccionPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSeccionPlaniVacacion"));

		this.jButtonFK_IdMesPlaniVacacion.addActionListener(new ButtonActionListener(this,"FK_IdMesPlaniVacacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPlaniVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPlaniVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPlaniVacacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPlaniVacacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPlaniVacacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
					planivacacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaniVacacion planivacacionAux:planivacacions) {
					planivacacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPlaniVacacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
						planivacacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaniVacacion planivacacionAux:planivacacions) {
						planivacacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaniVacacion planivacacionAux:planivacacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaniVacacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaniVacacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPlaniVacacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPlaniVacacion.getSelectedRows();
			
			PlaniVacacion planivacacionLocal=new PlaniVacacion();
			
			//this.seleccionarTodosPlaniVacacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planivacacionLocal =(PlaniVacacion) this.planivacacionLogic.getPlaniVacacions().toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					planivacacionLocal =(PlaniVacacion) this.planivacacions.toArray()[this.jTableDatosPlaniVacacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				planivacacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
						planivacacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaniVacacion planivacacionAux:planivacacions) {
						planivacacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaniVacacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaniVacacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaniVacacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPlaniVacacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPlaniVacacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPlaniVacacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPlaniVacacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaniVacacion planivacacionAux:this.planivacacionLogic.getPlaniVacacions()) {
				
						if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							planivacacionAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							planivacacionAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASANIO)) {
							existe=true;
							planivacacionAux.setdias_anio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS)) {
							existe=true;
							planivacacionAux.setdias_realizadas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE)) {
							existe=true;
							planivacacionAux.setdias_pendiente(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS)) {
							existe=true;
							planivacacionAux.setdias_tomados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS)) {
							existe=true;
							planivacacionAux.setdias_anticipadas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							planivacacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaniVacacion planivacacionAux:planivacacions) {
					
						if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							planivacacionAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							planivacacionAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASANIO)) {
							existe=true;
							planivacacionAux.setdias_anio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS)) {
							existe=true;
							planivacacionAux.setdias_realizadas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE)) {
							existe=true;
							planivacacionAux.setdias_pendiente(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS)) {
							existe=true;
							planivacacionAux.setdias_tomados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS)) {
							existe=true;
							planivacacionAux.setdias_anticipadas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							planivacacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPlaniVacacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPlaniVacacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPlaniVacacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPlaniVacacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePlaniVacacion) {				
					conSplash=true;//false;										
					
					//this.startProcessPlaniVacacion(conSplash);
				
					this.generarReportePlaniVacacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPlaniVacacionsSeleccionados();
				//this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaniVacacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaniVacacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaniVacacion();
				
				this.exportarPlaniVacacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPlaniVacacions();
				//this.importarPlaniVacacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaniVacacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPlaniVacacionsSeleccionados();
				//this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Plani Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPlaniVacacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPlaniVacacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPlaniVacacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
				}	
			} 			
			else if(PlaniVacacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePlaniVacacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPlaniVacacion(conSplash);
					
						//this.actualizarParametrosGeneralPlaniVacacion();
						
						this.generarReporteProcesoAccionPlaniVacacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PlaniVacacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Plani VacacionES SELECCIONADOS?", "MANTENIMIENTO DE Plani Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPlaniVacacion();
				
						this.actualizarParametrosGeneralPlaniVacacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.planivacacionReturnGeneral=planivacacionLogic.procesarAccionPlaniVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.planivacacionLogic.getPlaniVacacions(),this.planivacacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPlaniVacacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPlaniVacacion();
					
					PlaniVacacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPlaniVacacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaniVacacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxTiposAccionesFormularioPlaniVacacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPlaniVacacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPlaniVacacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPlaniVacacion();
			
			if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
			PlaniVacacion planivacacion=new PlaniVacacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPlaniVacacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPlaniVacacion.getSelectedItem();
			
			
			
			
			planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(planivacacionsSeleccionados.size()==1) {
				for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
					planivacacion=planivacacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPlaniVacacion();
			
      		//this.finishProcessPlaniVacacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPlaniVacacionReturnGeneral() throws Exception {
		if(this.planivacacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.planivacacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.planivacacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.planivacacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.planivacacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.planivacacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPlaniVacacion(false);
		}
		
		if(this.planivacacionReturnGeneral.getConRetornoLista() || this.planivacacionReturnGeneral.getConRetornoObjeto()) {
			if(this.planivacacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planivacacionLogic.setPlaniVacacions(this.planivacacionReturnGeneral.getPlaniVacacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.planivacacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planivacacionLogic.setPlaniVacacion(this.planivacacionReturnGeneral.getPlaniVacacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPlaniVacacion(false);
		}
	}
	
	public void actualizarParametrosGeneralPlaniVacacion() throws Exception {
		
		
	}
	
	public ArrayList<PlaniVacacion> getPlaniVacacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPlaniVacacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PlaniVacacion planivacacionAux:planivacacionLogic.getPlaniVacacions()) {
					if(planivacacionAux.getIsSelected()) {
						planivacacionsSeleccionados.add(planivacacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaniVacacion planivacacionAux:this.planivacacions) {
					if(planivacacionAux.getIsSelected()) {
						planivacacionsSeleccionados.add(planivacacionAux);				
					}
				}
			}
			
			if(planivacacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						planivacacionsSeleccionados.addAll(this.planivacacionLogic.getPlaniVacacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						planivacacionsSeleccionados.addAll(this.planivacacions);				
					}
				}
			}
		} else {
			planivacacionsSeleccionados.add(this.planivacacion);
		}
		
		return planivacacionsSeleccionados;
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
	
	public void generarReportePlaniVacacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPlaniVacacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPlaniVacacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaniVacacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaniVacacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Plani Vacacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPlaniVacacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPlaniVacacion();
		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPlaniVacacion();
		
		
		//this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados ,planivacacionImplementable,planivacacionImplementableHome);
	}
	
	public void mostrarImportacionPlaniVacacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPlaniVacacion();
		
		this.abrirFrameImportacionPlaniVacacion();		
		
			
		//this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados ,planivacacionImplementable,planivacacionImplementableHome);
	}
	
	public void importarPlaniVacacions() throws Exception {		
	
	}
	
	public void exportarPlaniVacacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPlaniVacacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPlaniVacacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPlaniVacacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Plani Vacacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPlaniVacacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPlaniVacacion(planivacacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//planivacacionAux.setsDetalleGeneralEntityReporte(planivacacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPlaniVacacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DIASANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPlaniVacacion(PlaniVacacion planivacacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=planivacacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getestructuraseccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getestructuracargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdias_anio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdias_realizadas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdias_pendiente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdias_tomados().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdias_anticipadas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planivacacion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PlaniVacacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPlaniVacacion(row);				
				iRow++;
			}				
			
			for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPlaniVacacion(planivacacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPlaniVacacionsSeleccionados() throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();		
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planivacacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("planivacacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("planivacacion");
			//elementRoot.appendChild(element);
		
			for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
				element = document.createElement("planivacacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPlaniVacacion(planivacacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Plani Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPlaniVacacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPlaniVacacion(PlaniVacacion planivacacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getestructuraseccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getestructuracargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdias_anio());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdias_realizadas());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdias_pendiente());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdias_tomados());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdias_anticipadas());
		cell = row.createCell(iColumn++);cell.setCellValue(planivacacion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPlaniVacacion(PlaniVacacion planivacacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PlaniVacacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(planivacacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PlaniVacacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(planivacacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(planivacacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(planivacacion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestructura_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(planivacacion.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementestructuraseccion_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDESTRUCTURASECCION);
		elementestructuraseccion_descripcion.appendChild(document.createTextNode(planivacacion.getestructuraseccion_descripcion()));
		element.appendChild(elementestructuraseccion_descripcion);

		Element elementestructuracargo_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDESTRUCTURACARGO);
		elementestructuracargo_descripcion.appendChild(document.createTextNode(planivacacion.getestructuracargo_descripcion()));
		element.appendChild(elementestructuracargo_descripcion);

		Element elementempleado_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(planivacacion.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha_inicio = document.createElement(PlaniVacacionConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(planivacacion.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(PlaniVacacionConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(planivacacion.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementmes_descripcion = document.createElement(PlaniVacacionConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(planivacacion.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementdias_anio = document.createElement(PlaniVacacionConstantesFunciones.DIASANIO);
		elementdias_anio.appendChild(document.createTextNode(planivacacion.getdias_anio().toString().trim()));
		element.appendChild(elementdias_anio);

		Element elementdias_realizadas = document.createElement(PlaniVacacionConstantesFunciones.DIASREALIZADAS);
		elementdias_realizadas.appendChild(document.createTextNode(planivacacion.getdias_realizadas().toString().trim()));
		element.appendChild(elementdias_realizadas);

		Element elementdias_pendiente = document.createElement(PlaniVacacionConstantesFunciones.DIASPENDIENTE);
		elementdias_pendiente.appendChild(document.createTextNode(planivacacion.getdias_pendiente().toString().trim()));
		element.appendChild(elementdias_pendiente);

		Element elementdias_tomados = document.createElement(PlaniVacacionConstantesFunciones.DIASTOMADOS);
		elementdias_tomados.appendChild(document.createTextNode(planivacacion.getdias_tomados().toString().trim()));
		element.appendChild(elementdias_tomados);

		Element elementdias_anticipadas = document.createElement(PlaniVacacionConstantesFunciones.DIASANTICIPADAS);
		elementdias_anticipadas.appendChild(document.createTextNode(planivacacion.getdias_anticipadas().toString().trim()));
		element.appendChild(elementdias_anticipadas);

		Element elementdescripcion = document.createElement(PlaniVacacionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(planivacacion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPlaniVacacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PlaniVacacion> planivacacionsSeleccionados=new ArrayList<PlaniVacacion>();
		
		planivacacionsSeleccionados=this.getPlaniVacacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPlaniVacacion(planivacacionsSeleccionados);
		
		this.generarReportePlaniVacacions("Todos",planivacacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPlaniVacacion(ArrayList<PlaniVacacion> planivacacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PlaniVacacion planivacacionAux:planivacacionsSeleccionados) {
				planivacacionAux.setsDetalleGeneralEntityReporte(planivacacionAux.toString());
			
				if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getestructuraseccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getestructuracargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planivacacionAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planivacacionAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					planivacacionAux.setsDescripcionGeneralEntityReporte1(planivacacionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaniVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPlaniVacacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPlaniVacacion=true;
				this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=true;
				this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=true;
			}
			
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=true;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=true;
			this.isVisibilidadCeldaEliminarPlaniVacacion=true;
			this.isVisibilidadCeldaCancelarPlaniVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=true;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=true;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=true;
			this.isVisibilidadCeldaModificarPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
			this.isVisibilidadCeldaModificarPlaniVacacion=true;
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
			this.isVisibilidadCeldaCancelarPlaniVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaniVacacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPlaniVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=true;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=true;
		} else {
			this.actualizarEstadoPanelsPlaniVacacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPlaniVacacion=false;
			//this.isVisibilidadCeldaVerFormPlaniVacacion=false;
			this.isVisibilidadCeldaDuplicarPlaniVacacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!planivacacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
		} else {
			this.isVisibilidadCeldaNuevoPlaniVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosPlaniVacacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(planivacacionSessionBean.getEsGuardarRelacionado()) {
			if(!planivacacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;												
			}
			
			this.jButtonCerrarPlaniVacacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPlaniVacacion=false;
		}
		
		if(!this.permiteMantenimiento(this.planivacacion)) {
			this.isVisibilidadCeldaActualizarPlaniVacacion=false;
			this.isVisibilidadCeldaEliminarPlaniVacacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPlaniVacacion() {
	}
	
	public void actualizarEstadoPanelsPlaniVacacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPlaniVacacion!=null) {
				this.jScrollPanelDatosEdicionPlaniVacacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaniVacacion!=null) {
				this.jScrollPanelDatosPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaniVacacion!=null) {
				this.jPanelPaginacionPlaniVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
					this.jTabbedPaneBusquedasPlaniVacacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaniVacacion!=null) {
				this.jTabbedPaneBusquedasPlaniVacacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPlaniVacacion!=null) {
				this.jPanelParametrosReportesPlaniVacacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructuraSeccion(Boolean isParaEstructuraSeccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraSeccionNegation=!isParaEstructuraSeccion;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEstructuraSeccion;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructuraCargo(Boolean isParaEstructuraCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraCargoNegation=!isParaEstructuraCargo;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraCargoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEstructuraCargoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaEstructuraCargo;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEstructuraCargoNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaEstructuraCargoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEmpleadoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraCargo=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructuraCargo) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraCargoPlaniVacacion);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdEstructuraSeccionPlaniVacacion);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPlaniVacacion.remove(jPanelFK_IdMesPlaniVacacion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PlaniVacacionSessionBean planivacacionSessionBean=new PlaniVacacionSessionBean();
		
		if(this.planivacacionSessionBean==null) {
			this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		}
		
		this.planivacacionSessionBean.setsUltimaBusquedaPlaniVacacion(this.getsAccionBusqueda());
		this.planivacacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.planivacacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			planivacacionSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			planivacacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			planivacacionSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructuraCargo")) {
			planivacacionSessionBean.setid_estructura_cargo(this.getid_estructura_cargoFK_IdEstructuraCargo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructuraSeccion")) {
			planivacacionSessionBean.setid_estructura_seccion(this.getid_estructura_seccionFK_IdEstructuraSeccion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			planivacacionSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			planivacacionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PlaniVacacionSessionBean planivacacionSessionBean=new PlaniVacacionSessionBean();
		
		if(this.planivacacionSessionBean==null) {
			this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		}
		
		if(this.planivacacionSessionBean.getsUltimaBusquedaPlaniVacacion()!=null&&!this.planivacacionSessionBean.getsUltimaBusquedaPlaniVacacion().equals("")) {
			this.setsAccionBusqueda(planivacacionSessionBean.getsUltimaBusquedaPlaniVacacion());
			this.setiNumeroPaginacion(planivacacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(planivacacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(planivacacionSessionBean.getid_empleado());
				planivacacionSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(planivacacionSessionBean.getid_empresa());
				planivacacionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(planivacacionSessionBean.getid_estructura());
				planivacacionSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructuraCargo")) {
				this.setid_estructura_cargoFK_IdEstructuraCargo(planivacacionSessionBean.getid_estructura_cargo());
				planivacacionSessionBean.setid_estructura_cargo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructuraSeccion")) {
				this.setid_estructura_seccionFK_IdEstructuraSeccion(planivacacionSessionBean.getid_estructura_seccion());
				planivacacionSessionBean.setid_estructura_seccion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(planivacacionSessionBean.getid_mes());
				planivacacionSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(planivacacionSessionBean.getid_sucursal());
				planivacacionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.planivacacionSessionBean.setsUltimaBusquedaPlaniVacacion("");
		this.planivacacionSessionBean.setiNumeroPaginacion(PlaniVacacionConstantesFunciones.INUMEROPAGINACION);
		this.planivacacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPlaniVacacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPlaniVacacion() {
		this.updateBorderResaltarBusquedasFormularioPlaniVacacion();
		this.updateVisibilidadBusquedasFormularioPlaniVacacion();
		this.updateHabilitarBusquedasFormularioPlaniVacacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioPlaniVacacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPlaniVacacion.getComponents().length>0) {
	

		if(this.planivacacionConstantesFunciones.resaltarFK_IdEmpleadoPlaniVacacion!=null) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoPlaniVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEmpleadoPlaniVacacion);
			}
		}

		if(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraPlaniVacacion!=null) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraPlaniVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraPlaniVacacion);
			}
		}

		if(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraCargoPlaniVacacion!=null) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraCargoPlaniVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraCargoPlaniVacacion);
			}
		}

		if(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraSeccionPlaniVacacion!=null) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSeccionPlaniVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraSeccionPlaniVacacion);
			}
		}

		if(this.planivacacionConstantesFunciones.resaltarFK_IdMesPlaniVacacion!=null) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdMesPlaniVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdMesPlaniVacacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPlaniVacacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPlaniVacacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoPlaniVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planivacacionConstantesFunciones.mostrarFK_IdEmpleadoPlaniVacacion);
			if(!this.planivacacionConstantesFunciones.mostrarFK_IdEmpleadoPlaniVacacion && index>-1) {
				this.jTabbedPaneBusquedasPlaniVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraPlaniVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraPlaniVacacion);
			if(!this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraPlaniVacacion && index>-1) {
				this.jTabbedPaneBusquedasPlaniVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraCargoPlaniVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraCargoPlaniVacacion);
			if(!this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraCargoPlaniVacacion && index>-1) {
				this.jTabbedPaneBusquedasPlaniVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSeccionPlaniVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraSeccionPlaniVacacion);
			if(!this.planivacacionConstantesFunciones.mostrarFK_IdEstructuraSeccionPlaniVacacion && index>-1) {
				this.jTabbedPaneBusquedasPlaniVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdMesPlaniVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planivacacionConstantesFunciones.mostrarFK_IdMesPlaniVacacion);
			if(!this.planivacacionConstantesFunciones.mostrarFK_IdMesPlaniVacacion && index>-1) {
				this.jTabbedPaneBusquedasPlaniVacacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPlaniVacacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPlaniVacacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoPlaniVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planivacacionConstantesFunciones.activarFK_IdEmpleadoPlaniVacacion);
				this.jTabbedPaneBusquedasPlaniVacacion.setEnabledAt(index,this.planivacacionConstantesFunciones.activarFK_IdEmpleadoPlaniVacacion);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraPlaniVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planivacacionConstantesFunciones.activarFK_IdEstructuraPlaniVacacion);
				this.jTabbedPaneBusquedasPlaniVacacion.setEnabledAt(index,this.planivacacionConstantesFunciones.activarFK_IdEstructuraPlaniVacacion);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraCargoPlaniVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planivacacionConstantesFunciones.activarFK_IdEstructuraCargoPlaniVacacion);
				this.jTabbedPaneBusquedasPlaniVacacion.setEnabledAt(index,this.planivacacionConstantesFunciones.activarFK_IdEstructuraCargoPlaniVacacion);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSeccionPlaniVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planivacacionConstantesFunciones.activarFK_IdEstructuraSeccionPlaniVacacion);
				this.jTabbedPaneBusquedasPlaniVacacion.setEnabledAt(index,this.planivacacionConstantesFunciones.activarFK_IdEstructuraSeccionPlaniVacacion);
			}

			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdMesPlaniVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planivacacionConstantesFunciones.activarFK_IdMesPlaniVacacion);
				this.jTabbedPaneBusquedasPlaniVacacion.setEnabledAt(index,this.planivacacionConstantesFunciones.activarFK_IdMesPlaniVacacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPlaniVacacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoPlaniVacacion);

			this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);

			this.planivacacionConstantesFunciones.setResaltarFK_IdEmpleadoPlaniVacacion(resaltar);

			jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEmpleadoPlaniVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraPlaniVacacion);

			this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);

			this.planivacacionConstantesFunciones.setResaltarFK_IdEstructuraPlaniVacacion(resaltar);

			jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraPlaniVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructuraCargo")) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraCargoPlaniVacacion);

			this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);

			this.planivacacionConstantesFunciones.setResaltarFK_IdEstructuraCargoPlaniVacacion(resaltar);

			jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraCargoPlaniVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructuraSeccion")) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSeccionPlaniVacacion);

			this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);

			this.planivacacionConstantesFunciones.setResaltarFK_IdEstructuraSeccionPlaniVacacion(resaltar);

			jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdEstructuraSeccionPlaniVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasPlaniVacacion.indexOfComponent(this.jPanelFK_IdMesPlaniVacacion);

			this.jTabbedPaneBusquedasPlaniVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaniVacacion.getComponent(index);

			this.planivacacionConstantesFunciones.setResaltarFK_IdMesPlaniVacacion(resaltar);

			jPanel.setBorder(this.planivacacionConstantesFunciones.resaltarFK_IdMesPlaniVacacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPlaniVacacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPlaniVacacion() throws Exception {

		if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPlaniVacacion();
		this.updateVisibilidadResaltarControlesFormularioPlaniVacacion();
		this.updateHabilitarResaltarControlesFormularioPlaniVacacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioPlaniVacacion() throws Exception {
		if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.planivacacionConstantesFunciones.resaltaridPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltaridPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_empresaPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_empresaPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_sucursalPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_sucursalPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_estructuraPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_estructuraPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_estructura_seccionPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_estructura_seccionPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_estructura_cargoPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_estructura_cargoPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_empleadoPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_empleadoPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarfecha_inicioPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarfecha_inicioPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarfecha_finPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarfecha_finPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltarid_mesPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltarid_mesPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardias_anioPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardias_anioPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardias_realizadasPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardias_realizadasPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardias_pendientePlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardias_pendientePlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardias_tomadosPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardias_tomadosPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardias_anticipadasPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardias_anticipadasPlaniVacacion);}
		if(this.planivacacionConstantesFunciones.resaltardescripcionPlaniVacacion!=null && this.jInternalFrameDetalleFormPlaniVacacion!=null) {this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setBorder(this.planivacacionConstantesFunciones.resaltardescripcionPlaniVacacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPlaniVacacion() throws Exception {		
		if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
	
		//this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostraridPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelidPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostraridPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_empresaPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_empresaPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_empresaPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_sucursalPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_sucursalPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_sucursalPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructuraPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_estructuraPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructuraPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructura_seccionPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_estructura_seccionPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructura_seccionPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructura_cargoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_estructura_cargoPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_estructura_cargoPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_empleadoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_empleadoPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_empleadoPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarfecha_inicioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelfecha_inicioPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarfecha_inicioPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarfecha_finPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelfecha_finPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarfecha_finPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_mesPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPanelid_mesPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrarid_mesPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_anioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldias_anioPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_anioPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_realizadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldias_realizadasPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_realizadasPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_pendientePlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldias_pendientePlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_pendientePlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_tomadosPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldias_tomadosPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_tomadosPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_anticipadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldias_anticipadasPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardias_anticipadasPlaniVacacion);
		//this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardescripcionPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jPaneldescripcionPlaniVacacion.setVisible(this.planivacacionConstantesFunciones.mostrardescripcionPlaniVacacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPlaniVacacion() throws Exception {
		if(this.jInternalFrameDetalleFormPlaniVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaniVacacion!=null) {
	
		this.jInternalFrameDetalleFormPlaniVacacion.jLabelidPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activaridPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empresaPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_empresaPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_sucursalPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_sucursalPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructuraPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_estructuraPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_seccionPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_estructura_seccionPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_estructura_cargoPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_estructura_cargoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_empleadoPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_empleadoPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_inicioPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarfecha_inicioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jDateChooserfecha_finPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarfecha_finPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jComboBoxid_mesPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activarid_mesPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anioPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardias_anioPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_realizadasPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardias_realizadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_pendientePlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardias_pendientePlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_tomadosPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardias_tomadosPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextFielddias_anticipadasPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardias_anticipadasPlaniVacacion);
		this.jInternalFrameDetalleFormPlaniVacacion.jTextAreadescripcionPlaniVacacion.setEnabled(this.planivacacionConstantesFunciones.activardescripcionPlaniVacacion);
		}
	}
	
		
}