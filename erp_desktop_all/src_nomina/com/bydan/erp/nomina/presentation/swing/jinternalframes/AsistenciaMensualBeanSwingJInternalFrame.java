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

import com.bydan.erp.nomina.util.AsistenciaMensualConstantesFunciones;
import com.bydan.erp.nomina.util.AsistenciaMensualParameterReturnGeneral;
//import com.bydan.erp.nomina.util.AsistenciaMensualParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.AsistenciaMensualBean;
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
public class AsistenciaMensualBeanSwingJInternalFrame extends AsistenciaMensualJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AsistenciaMensualBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AsistenciaMensual> asistenciamensualValidator = new ClassValidator<AsistenciaMensual>(AsistenciaMensual.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AsistenciaMensual asistenciamensual;	
	public AsistenciaMensual asistenciamensualAux;
	public AsistenciaMensual asistenciamensualAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AsistenciaMensual asistenciamensualTotales;
	public Long idAsistenciaMensualActual;
	public Long iIdNuevoAsistenciaMensual=0L;
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
	
	public Boolean isPermisoTodoAsistenciaMensual;
	public Boolean isPermisoNuevoAsistenciaMensual;
	public Boolean isPermisoActualizarAsistenciaMensual;
	public Boolean isPermisoActualizarOriginalAsistenciaMensual;
	public Boolean isPermisoEliminarAsistenciaMensual;
	public Boolean isPermisoGuardarCambiosAsistenciaMensual;
	public Boolean isPermisoConsultaAsistenciaMensual;
	public Boolean isPermisoBusquedaAsistenciaMensual;
	public Boolean isPermisoReporteAsistenciaMensual;
	public Boolean isPermisoPaginacionMedioAsistenciaMensual;
	public Boolean isPermisoPaginacionAltoAsistenciaMensual;
	public Boolean isPermisoPaginacionTodoAsistenciaMensual;
	public Boolean isPermisoCopiarAsistenciaMensual;
	public Boolean isPermisoVerFormAsistenciaMensual;
	public Boolean isPermisoDuplicarAsistenciaMensual;
	public Boolean isPermisoOrdenAsistenciaMensual;
	
	
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
	
	public AsistenciaMensualParameterReturnGeneral asistenciamensualReturnGeneral;
	public AsistenciaMensualParameterReturnGeneral asistenciamensualParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAsistenciaMensual=false;
	public Boolean esParaAccionDesdeFormularioAsistenciaMensual=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AsistenciaMensualSessionBeanAdditional asistenciamensualSessionBeanAdditional=null;
	
	public AsistenciaMensualSessionBeanAdditional getAsistenciaMensualSessionBeanAdditional() {
		return this.asistenciamensualSessionBeanAdditional;
	}
	
	public void setAsistenciaMensualSessionBeanAdditional(AsistenciaMensualSessionBeanAdditional asistenciamensualSessionBeanAdditional) {
		try {
			this.asistenciamensualSessionBeanAdditional=asistenciamensualSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AsistenciaMensualBeanSwingJInternalFrameAdditional asistenciamensualBeanSwingJInternalFrameAdditional=null;
	//public class AsistenciaMensualBeanSwingJInternalFrame
	
	public AsistenciaMensualBeanSwingJInternalFrameAdditional getAsistenciaMensualBeanSwingJInternalFrameAdditional() {
		return this.asistenciamensualBeanSwingJInternalFrameAdditional;
	}
	
	public void setAsistenciaMensualBeanSwingJInternalFrameAdditional(AsistenciaMensualBeanSwingJInternalFrameAdditional asistenciamensualBeanSwingJInternalFrameAdditional) {
		try {
			this.asistenciamensualBeanSwingJInternalFrameAdditional=asistenciamensualBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AsistenciaMensualLogic asistenciamensualLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AsistenciaMensual asistenciamensualBean;
	public AsistenciaMensualConstantesFunciones asistenciamensualConstantesFunciones;
	//public AsistenciaMensualParameterReturnGeneral asistenciamensualReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public CargoLogic cargoLogic;
	public EstructuraLogic estructuraLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<AsistenciaMensual> asistenciamensuals;	
	//public List<AsistenciaMensual> asistenciamensualsEliminados;
	//public List<AsistenciaMensual> asistenciamensualsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaDuplicarAsistenciaMensual=true;
	public Boolean isVisibilidadCeldaCopiarAsistenciaMensual=true;
	public Boolean isVisibilidadCeldaVerFormAsistenciaMensual=true;
	public Boolean isVisibilidadCeldaOrdenAsistenciaMensual=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaModificarAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaActualizarAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaEliminarAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaCancelarAsistenciaMensual=false;
	public Boolean isVisibilidadCeldaGuardarAsistenciaMensual=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCargo=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoAsistenciaMensual() {
		return this.iIdNuevoAsistenciaMensual;
	}

	public void setiIdNuevoAsistenciaMensual(Long iIdNuevoAsistenciaMensual) {
		this.iIdNuevoAsistenciaMensual = iIdNuevoAsistenciaMensual;
	}
	
	public Long getidAsistenciaMensualActual() {
		return this.idAsistenciaMensualActual;
	}

	public void setidAsistenciaMensualActual(Long idAsistenciaMensualActual) {
		this.idAsistenciaMensualActual = idAsistenciaMensualActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AsistenciaMensual getasistenciamensual() {
		return this.asistenciamensual;
	}

	public void setasistenciamensual(AsistenciaMensual asistenciamensual) {
		this.asistenciamensual = asistenciamensual;
	}
	
	public AsistenciaMensual getasistenciamensualAux() {
		return this.asistenciamensualAux;
	}

	public void setasistenciamensualAux(AsistenciaMensual asistenciamensualAux) {
		this.asistenciamensualAux = asistenciamensualAux;
	}				
	
	public AsistenciaMensual getasistenciamensualAnterior() {
		return this.asistenciamensualAnterior;
	}

	public void setasistenciamensualAnterior(AsistenciaMensual asistenciamensualAnterior) {
		this.asistenciamensualAnterior = asistenciamensualAnterior;
	}	
	
	public AsistenciaMensual getasistenciamensualTotales() {
		return this.asistenciamensualTotales;
	}

	public void setasistenciamensualTotales(AsistenciaMensual asistenciamensualTotales) {
		this.asistenciamensualTotales = asistenciamensualTotales;
	}	
	
	public AsistenciaMensual getasistenciamensualBean() {
		return this.asistenciamensualBean;
	}

	public void setasistenciamensualBean(AsistenciaMensual asistenciamensualBean) {
		this.asistenciamensualBean = asistenciamensualBean;
	}	
	
	public AsistenciaMensualParameterReturnGeneral getasistenciamensualReturnGeneral() {
		return this.asistenciamensualReturnGeneral;
	}

	public void setasistenciamensualReturnGeneral(AsistenciaMensualParameterReturnGeneral asistenciamensualReturnGeneral) {
		this.asistenciamensualReturnGeneral = asistenciamensualReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AsistenciaMensualLogic getAsistenciaMensualLogic()	{		
		return asistenciamensualLogic;
	}

	public void setAsistenciaMensualLogic(AsistenciaMensualLogic asistenciamensualLogic) {
		this.asistenciamensualLogic = asistenciamensualLogic;
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
	
	public Boolean getIsEsNuevoAsistenciaMensual() {
		return isEsNuevoAsistenciaMensual;
	}

	public void setIsEsNuevoAsistenciaMensual(Boolean isEsNuevoAsistenciaMensual) {
		this.isEsNuevoAsistenciaMensual = isEsNuevoAsistenciaMensual;
	}

	public Boolean getEsParaAccionDesdeFormularioAsistenciaMensual() {
		return esParaAccionDesdeFormularioAsistenciaMensual;
	}
	
	public void setEsParaAccionDesdeFormularioAsistenciaMensual(Boolean esParaAccionDesdeFormularioAsistenciaMensual) {
		this.esParaAccionDesdeFormularioAsistenciaMensual = esParaAccionDesdeFormularioAsistenciaMensual;
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

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidEmpresaActual());
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

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidEmpleadoActual());
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

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
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
					cargoLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidCargoActual());
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

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidEstructuraActual());
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

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

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
					anioLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidAnioActual());
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

			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(asistenciamensualSessionBean.getlidMesActual());
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAsistenciaMensual.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_empresaAsistenciaMensualGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAsistenciaMensualGenerico!=null && jComboBoxid_empresaAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_empresaAsistenciaMensualGenerico.setSelectedIndex(0);
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoAsistenciaMensual.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_empleadoAsistenciaMensualGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAsistenciaMensualGenerico!=null && jComboBoxid_empleadoAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAsistenciaMensualGenerico.setSelectedIndex(0);
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setCargo(cargoTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setSelectedItem(cargoTemp);
					}
				} else {
					//jComboBoxid_cargoAsistenciaMensual.setSelectedItem(cargoTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargoTemp!=null && jComboBoxid_cargoFK_IdCargoAsistenciaMensual!=null) {
						jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setSelectedItem(cargoTemp);
					} else {
						if(jComboBoxid_cargoFK_IdCargoAsistenciaMensual!=null) {
							//jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setSelectedItem(cargoTemp);
							if(jComboBoxid_cargoFK_IdCargoAsistenciaMensual.getItemCount()>0) {
								jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualCargoForeignKeyGenerico(Long idCargoSeleccionado,JComboBox jComboBoxid_cargoAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_cargoAsistenciaMensualGenerico.setSelectedItem(cargoTemp);
			} else {
				if(jComboBoxid_cargoAsistenciaMensualGenerico!=null && jComboBoxid_cargoAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_cargoAsistenciaMensualGenerico.setSelectedIndex(0);
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraAsistenciaMensual.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual!=null) {
						jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_estructuraAsistenciaMensualGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraAsistenciaMensualGenerico!=null && jComboBoxid_estructuraAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_estructuraAsistenciaMensualGenerico.setSelectedIndex(0);
				}
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioAsistenciaMensual.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioAsistenciaMensual!=null) {
						jComboBoxid_anioFK_IdAnioAsistenciaMensual.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioAsistenciaMensual!=null) {
							//jComboBoxid_anioFK_IdAnioAsistenciaMensual.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioAsistenciaMensual.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_anioAsistenciaMensualGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioAsistenciaMensualGenerico!=null && jComboBoxid_anioAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_anioAsistenciaMensualGenerico.setSelectedIndex(0);
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

					if(this.asistenciamensual!=null) {
						this.asistenciamensual.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesAsistenciaMensual.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesAsistenciaMensual!=null) {
						jComboBoxid_mesFK_IdMesAsistenciaMensual.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesAsistenciaMensual!=null) {
							//jComboBoxid_mesFK_IdMesAsistenciaMensual.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesAsistenciaMensual.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesAsistenciaMensual.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesAsistenciaMensualGenerico)throws Exception
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
				jComboBoxid_mesAsistenciaMensualGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesAsistenciaMensualGenerico!=null && jComboBoxid_mesAsistenciaMensualGenerico.getItemCount()>0) {
					jComboBoxid_mesAsistenciaMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_empresaAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAsistenciaMensualGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAsistenciaMensualGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				asistenciamensual.setid_empresa(empresaAux.getId());
				asistenciamensual.setempresa_descripcion(AsistenciaMensualConstantesFunciones.getEmpresaDescripcion(empresaAux));
				asistenciamensual.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_empleadoAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAsistenciaMensualGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAsistenciaMensualGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				asistenciamensual.setid_empleado(empleadoAux.getId());
				asistenciamensual.setempleado_descripcion(AsistenciaMensualConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				asistenciamensual.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_cargoAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Cargo  cargoAux=new Cargo();

			if(jComboBoxid_cargoAsistenciaMensualGenerico==null) {
				cargoAux=(Cargo)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.getSelectedItem();
			} else {
				cargoAux=(Cargo)jComboBoxid_cargoAsistenciaMensualGenerico.getSelectedItem();
			}

			if(cargoAux!=null && cargoAux.getId()!=null) {
				asistenciamensual.setid_cargo(cargoAux.getId());
				asistenciamensual.setcargo_descripcion(AsistenciaMensualConstantesFunciones.getCargoDescripcion(cargoAux));
				asistenciamensual.setCargo(cargoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_estructuraAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraAsistenciaMensualGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraAsistenciaMensualGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				asistenciamensual.setid_estructura(estructuraAux.getId());
				asistenciamensual.setestructura_descripcion(AsistenciaMensualConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				asistenciamensual.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_anioAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioAsistenciaMensualGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioAsistenciaMensualGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				asistenciamensual.setid_anio(anioAux.getId());
				asistenciamensual.setanio_descripcion(AsistenciaMensualConstantesFunciones.getAnioDescripcion(anioAux));
				asistenciamensual.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(AsistenciaMensual asistenciamensual,JComboBox jComboBoxid_mesAsistenciaMensualGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesAsistenciaMensualGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesAsistenciaMensualGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				asistenciamensual.setid_mes(mesAux.getId());
				asistenciamensual.setmes_descripcion(AsistenciaMensualConstantesFunciones.getMesDescripcion(mesAux));
				asistenciamensual.setMes(mesAux);			}
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

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.addItem(empleado);
							}
						}

						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.addItem(cargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.addItem(cargo);
							}
						}

						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.addItem(estructura);
							}
						}

						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.addItem(anio);
							}
						}

						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { 
					}

					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesAsistenciaMensual.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesAsistenciaMensual.addItem(mes);
							}
						}

						if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setSelectedItem(cargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setSelectedItem(cargo);
						} else {
							this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesAsistenciaMensual.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesAsistenciaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAsistenciaMensual() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AsistenciaMensualConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaMensual(this.asistenciamensualLogic.getAsistenciaMensuals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AsistenciaMensualConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaMensual(this.asistenciamensuals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Cargo.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//asistenciamensualLogic.setAsistenciaMensuals(this.asistenciamensuals);
			asistenciamensualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AsistenciaMensualParameterReturnGeneral getAsistenciaMensualParameterGeneral() {
		return this.asistenciamensualParameterGeneral;
	}
	
	public void setAsistenciaMensualParameterGeneral(AsistenciaMensualParameterReturnGeneral asistenciamensualParameterGeneral) {
		this.asistenciamensualParameterGeneral = asistenciamensualParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAsistenciaMensual() {
		return isPermisoTodoAsistenciaMensual;
	}

	public void setIsPermisoTodoAsistenciaMensual(Boolean isPermisoTodoAsistenciaMensual) {
		this.isPermisoTodoAsistenciaMensual = isPermisoTodoAsistenciaMensual;
	}

	public Boolean getIsPermisoNuevoAsistenciaMensual() {
		return isPermisoNuevoAsistenciaMensual;
	}

	public void setIsPermisoNuevoAsistenciaMensual(Boolean isPermisoNuevoAsistenciaMensual) {
		this.isPermisoNuevoAsistenciaMensual = isPermisoNuevoAsistenciaMensual;
	}

	public Boolean getIsPermisoActualizarAsistenciaMensual() {
		return isPermisoActualizarAsistenciaMensual;
	}

	public void setIsPermisoActualizarAsistenciaMensual(Boolean isPermisoActualizarAsistenciaMensual) {
		this.isPermisoActualizarAsistenciaMensual = isPermisoActualizarAsistenciaMensual;
	}

	public Boolean getIsPermisoEliminarAsistenciaMensual() {
		return isPermisoEliminarAsistenciaMensual;
	}

	public void setIsPermisoEliminarAsistenciaMensual(Boolean isPermisoEliminarAsistenciaMensual) {
		this.isPermisoEliminarAsistenciaMensual = isPermisoEliminarAsistenciaMensual;
	}

	public Boolean getIsPermisoGuardarCambiosAsistenciaMensual() {
		return isPermisoGuardarCambiosAsistenciaMensual;
	}

	public void setIsPermisoGuardarCambiosAsistenciaMensual(Boolean isPermisoGuardarCambiosAsistenciaMensual) {
		this.isPermisoGuardarCambiosAsistenciaMensual = isPermisoGuardarCambiosAsistenciaMensual;
	}
	
	public Boolean getIsPermisoConsultaAsistenciaMensual() {
		return isPermisoConsultaAsistenciaMensual;
	}

	public void setIsPermisoConsultaAsistenciaMensual(Boolean isPermisoConsultaAsistenciaMensual) {
		this.isPermisoConsultaAsistenciaMensual = isPermisoConsultaAsistenciaMensual;
	}

	public Boolean getIsPermisoBusquedaAsistenciaMensual() {
		return isPermisoBusquedaAsistenciaMensual;
	}

	public void setIsPermisoBusquedaAsistenciaMensual(Boolean isPermisoBusquedaAsistenciaMensual) {
		this.isPermisoBusquedaAsistenciaMensual = isPermisoBusquedaAsistenciaMensual;
	}

	public Boolean getIsPermisoReporteAsistenciaMensual() {
		return isPermisoReporteAsistenciaMensual;
	}

	public void setIsPermisoReporteAsistenciaMensual(Boolean isPermisoReporteAsistenciaMensual) {
		this.isPermisoReporteAsistenciaMensual = isPermisoReporteAsistenciaMensual;
	}
	
	public Boolean getIsPermisoPaginacionMedioAsistenciaMensual() {
		return isPermisoPaginacionMedioAsistenciaMensual;
	}

	public void setIsPermisoPaginacionMedioAsistenciaMensual(Boolean isPermisoPaginacionMedioAsistenciaMensual) {
		this.isPermisoPaginacionMedioAsistenciaMensual = isPermisoPaginacionMedioAsistenciaMensual;
	}
	
	public Boolean getIsPermisoPaginacionTodoAsistenciaMensual() {
		return isPermisoPaginacionTodoAsistenciaMensual;
	}

	public void setIsPermisoPaginacionTodoAsistenciaMensual(Boolean isPermisoPaginacionTodoAsistenciaMensual) {
		this.isPermisoPaginacionTodoAsistenciaMensual = isPermisoPaginacionTodoAsistenciaMensual;
	}
	
	public Boolean getIsPermisoPaginacionAltoAsistenciaMensual() {
		return isPermisoPaginacionAltoAsistenciaMensual;
	}

	public void setIsPermisoPaginacionAltoAsistenciaMensual(Boolean isPermisoPaginacionAltoAsistenciaMensual) {
		this.isPermisoPaginacionAltoAsistenciaMensual = isPermisoPaginacionAltoAsistenciaMensual;
	}
	
	public Boolean getIsPermisoCopiarAsistenciaMensual() {
		return isPermisoCopiarAsistenciaMensual;
	}

	public void setIsPermisoCopiarAsistenciaMensual(Boolean isPermisoCopiarAsistenciaMensual) {
		this.isPermisoCopiarAsistenciaMensual = isPermisoCopiarAsistenciaMensual;
	}
	
	public Boolean getIsPermisoVerFormAsistenciaMensual() {
		return isPermisoVerFormAsistenciaMensual;
	}

	public void setIsPermisoVerFormAsistenciaMensual(Boolean isPermisoVerFormAsistenciaMensual) {
		this.isPermisoVerFormAsistenciaMensual = isPermisoVerFormAsistenciaMensual;
	}
	
	public Boolean getIsPermisoDuplicarAsistenciaMensual() {
		return isPermisoDuplicarAsistenciaMensual;
	}

	public void setIsPermisoDuplicarAsistenciaMensual(Boolean isPermisoDuplicarAsistenciaMensual) {
		this.isPermisoDuplicarAsistenciaMensual = isPermisoDuplicarAsistenciaMensual;
	}
	
	public Boolean getIsPermisoOrdenAsistenciaMensual() {
		return isPermisoOrdenAsistenciaMensual;
	}

	public void setIsPermisoOrdenAsistenciaMensual(Boolean isPermisoOrdenAsistenciaMensual) {
		this.isPermisoOrdenAsistenciaMensual = isPermisoOrdenAsistenciaMensual;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAsistenciaMensual() {
		return isVisibilidadCeldaNuevoAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaNuevoAsistenciaMensual(Boolean isVisibilidadCeldaNuevoAsistenciaMensual) {
		this.isVisibilidadCeldaNuevoAsistenciaMensual = isVisibilidadCeldaNuevoAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAsistenciaMensual() {
		return isVisibilidadCeldaDuplicarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaDuplicarAsistenciaMensual(Boolean isVisibilidadCeldaDuplicarAsistenciaMensual) {
		this.isVisibilidadCeldaDuplicarAsistenciaMensual = isVisibilidadCeldaDuplicarAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAsistenciaMensual() {
		return isVisibilidadCeldaCopiarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaCopiarAsistenciaMensual(Boolean isVisibilidadCeldaCopiarAsistenciaMensual) {
		this.isVisibilidadCeldaCopiarAsistenciaMensual = isVisibilidadCeldaCopiarAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAsistenciaMensual() {
		return isVisibilidadCeldaVerFormAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaVerFormAsistenciaMensual(Boolean isVisibilidadCeldaVerFormAsistenciaMensual) {
		this.isVisibilidadCeldaVerFormAsistenciaMensual = isVisibilidadCeldaVerFormAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAsistenciaMensual() {
		return isVisibilidadCeldaOrdenAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaOrdenAsistenciaMensual(Boolean isVisibilidadCeldaOrdenAsistenciaMensual) {
		this.isVisibilidadCeldaOrdenAsistenciaMensual = isVisibilidadCeldaOrdenAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAsistenciaMensual() {
		return isVisibilidadCeldaNuevoRelacionesAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAsistenciaMensual(Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaMensual) {
		this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual = isVisibilidadCeldaNuevoRelacionesAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAsistenciaMensual() {
		return isVisibilidadCeldaModificarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaModificarAsistenciaMensual(Boolean isVisibilidadCeldaModificarAsistenciaMensual) {
		this.isVisibilidadCeldaModificarAsistenciaMensual = isVisibilidadCeldaModificarAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAsistenciaMensual() {
		return isVisibilidadCeldaActualizarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaActualizarAsistenciaMensual(Boolean isVisibilidadCeldaActualizarAsistenciaMensual) {
		this.isVisibilidadCeldaActualizarAsistenciaMensual = isVisibilidadCeldaActualizarAsistenciaMensual;
	}

	public Boolean getIsVisibilidadCeldaEliminarAsistenciaMensual() {
		return isVisibilidadCeldaEliminarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaEliminarAsistenciaMensual(Boolean isVisibilidadCeldaEliminarAsistenciaMensual) {
		this.isVisibilidadCeldaEliminarAsistenciaMensual = isVisibilidadCeldaEliminarAsistenciaMensual;
	}

	public Boolean getIsVisibilidadCeldaCancelarAsistenciaMensual() {
		return isVisibilidadCeldaCancelarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaCancelarAsistenciaMensual(Boolean isVisibilidadCeldaCancelarAsistenciaMensual) {
		this.isVisibilidadCeldaCancelarAsistenciaMensual = isVisibilidadCeldaCancelarAsistenciaMensual;
	}

	public Boolean getIsVisibilidadCeldaGuardarAsistenciaMensual() {
		return isVisibilidadCeldaGuardarAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaGuardarAsistenciaMensual(Boolean isVisibilidadCeldaGuardarAsistenciaMensual) {
		this.isVisibilidadCeldaGuardarAsistenciaMensual = isVisibilidadCeldaGuardarAsistenciaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAsistenciaMensual() {
		return isVisibilidadCeldaGuardarCambiosAsistenciaMensual;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAsistenciaMensual(Boolean isVisibilidadCeldaGuardarCambiosAsistenciaMensual) {
		this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual = isVisibilidadCeldaGuardarCambiosAsistenciaMensual;
	}
		
	public AsistenciaMensualSessionBean getasistenciamensualSessionBean() {
		return this.asistenciamensualSessionBean;
	}
	
	public void setasistenciamensualSessionBean(AsistenciaMensualSessionBean asistenciamensualSessionBean) {
		this.asistenciamensualSessionBean=asistenciamensualSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(AsistenciaMensual asistenciamensual)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(asistenciamensual,null);
				this.setActualParaGuardarEmpleadoForeignKey(asistenciamensual,null);
				this.setActualParaGuardarCargoForeignKey(asistenciamensual,null);
				this.setActualParaGuardarEstructuraForeignKey(asistenciamensual,null);
				this.setActualParaGuardarAnioForeignKey(asistenciamensual,null);
				this.setActualParaGuardarMesForeignKey(asistenciamensual,null);
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
	
	public void bugActualizarReferenciaActual(AsistenciaMensual asistenciamensual,AsistenciaMensual asistenciamensualAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAsistenciaMensual(asistenciamensual);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		asistenciamensualAux.setId(asistenciamensual.getId());
		asistenciamensualAux.setVersionRow(asistenciamensual.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAsistenciaMensual();
		
			int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = asistenciamensualValidator.getInvalidValues(this.asistenciamensual);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			asistenciamensualLogic.setDatosCliente(datosCliente);
			asistenciamensualLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				asistenciamensualAux=new  AsistenciaMensual();
				
				asistenciamensualAux.setIsNew(true);
				asistenciamensualAux.setIsChanged(true);
				
				asistenciamensualAux.setAsistenciaMensualOriginal(this.asistenciamensual);
				
				asistenciamensualAux.setId(this.asistenciamensual.getId());	
				asistenciamensualAux.setVersionRow(this.asistenciamensual.getVersionRow());	
				asistenciamensualAux.setid_empresa(this.asistenciamensual.getid_empresa());	
				asistenciamensualAux.setid_empleado(this.asistenciamensual.getid_empleado());	
				asistenciamensualAux.setid_cargo(this.asistenciamensual.getid_cargo());	
				asistenciamensualAux.setid_estructura(this.asistenciamensual.getid_estructura());	
				asistenciamensualAux.setid_anio(this.asistenciamensual.getid_anio());	
				asistenciamensualAux.setid_mes(this.asistenciamensual.getid_mes());	
				asistenciamensualAux.setfecha(this.asistenciamensual.getfecha());	
				asistenciamensualAux.sethoras_trabajo(this.asistenciamensual.gethoras_trabajo());	
				asistenciamensualAux.sethoras_atraso(this.asistenciamensual.gethoras_atraso());	
				asistenciamensualAux.sethoras_faltas(this.asistenciamensual.gethoras_faltas());	
				asistenciamensualAux.sethoras_permiso(this.asistenciamensual.gethoras_permiso());	
				asistenciamensualAux.sethoras_extra25(this.asistenciamensual.gethoras_extra25());	
				asistenciamensualAux.sethoras_extra50(this.asistenciamensual.gethoras_extra50());	
				asistenciamensualAux.sethoras_extra100(this.asistenciamensual.gethoras_extra100());	
				asistenciamensualAux.sethoras_extra150(this.asistenciamensual.gethoras_extra150());	
				asistenciamensualAux.sethoras_extra0(this.asistenciamensual.gethoras_extra0());	
				asistenciamensualAux.sethoras_enfermo(this.asistenciamensual.gethoras_enfermo());	
				asistenciamensualAux.sethoras_maternidad(this.asistenciamensual.gethoras_maternidad());	
				asistenciamensualAux.sethoras_vacacion(this.asistenciamensual.gethoras_vacacion());	
				asistenciamensualAux.setnumero_dias(this.asistenciamensual.getnumero_dias());	
				asistenciamensualAux.setnumero_noches(this.asistenciamensual.getnumero_noches());	
				asistenciamensualAux.setnumero_feriados(this.asistenciamensual.getnumero_feriados());	
				asistenciamensualAux.setnumero_trabajo(this.asistenciamensual.getnumero_trabajo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciamensualAux,asistenciamensuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.saveAsistenciaMensuals();//WithConnection
						//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaMensual();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciamensualLogic.saveAsistenciaMensualRelaciones(asistenciamensualAux);//WithConnection
								//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciamensualAux,asistenciamensuals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				asistenciamensualAux=new  AsistenciaMensual();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado() 
					|| (this.asistenciamensualSessionBean.getEsGuardarRelacionado() && this.asistenciamensual.getId()>=0)) {
						
					asistenciamensualAux.setIsNew(false);
				}
				
				asistenciamensualAux.setIsDeleted(false);
			
				asistenciamensualAux.setId(this.asistenciamensual.getId());	
				asistenciamensualAux.setVersionRow(this.asistenciamensual.getVersionRow());	
				asistenciamensualAux.setid_empresa(this.asistenciamensual.getid_empresa());	
				asistenciamensualAux.setid_empleado(this.asistenciamensual.getid_empleado());	
				asistenciamensualAux.setid_cargo(this.asistenciamensual.getid_cargo());	
				asistenciamensualAux.setid_estructura(this.asistenciamensual.getid_estructura());	
				asistenciamensualAux.setid_anio(this.asistenciamensual.getid_anio());	
				asistenciamensualAux.setid_mes(this.asistenciamensual.getid_mes());	
				asistenciamensualAux.setfecha(this.asistenciamensual.getfecha());	
				asistenciamensualAux.sethoras_trabajo(this.asistenciamensual.gethoras_trabajo());	
				asistenciamensualAux.sethoras_atraso(this.asistenciamensual.gethoras_atraso());	
				asistenciamensualAux.sethoras_faltas(this.asistenciamensual.gethoras_faltas());	
				asistenciamensualAux.sethoras_permiso(this.asistenciamensual.gethoras_permiso());	
				asistenciamensualAux.sethoras_extra25(this.asistenciamensual.gethoras_extra25());	
				asistenciamensualAux.sethoras_extra50(this.asistenciamensual.gethoras_extra50());	
				asistenciamensualAux.sethoras_extra100(this.asistenciamensual.gethoras_extra100());	
				asistenciamensualAux.sethoras_extra150(this.asistenciamensual.gethoras_extra150());	
				asistenciamensualAux.sethoras_extra0(this.asistenciamensual.gethoras_extra0());	
				asistenciamensualAux.sethoras_enfermo(this.asistenciamensual.gethoras_enfermo());	
				asistenciamensualAux.sethoras_maternidad(this.asistenciamensual.gethoras_maternidad());	
				asistenciamensualAux.sethoras_vacacion(this.asistenciamensual.gethoras_vacacion());	
				asistenciamensualAux.setnumero_dias(this.asistenciamensual.getnumero_dias());	
				asistenciamensualAux.setnumero_noches(this.asistenciamensual.getnumero_noches());	
				asistenciamensualAux.setnumero_feriados(this.asistenciamensual.getnumero_feriados());	
				asistenciamensualAux.setnumero_trabajo(this.asistenciamensual.getnumero_trabajo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciamensualAux,asistenciamensuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.saveAsistenciaMensuals();//WithConnection
						//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaMensual();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciamensualLogic.saveAsistenciaMensualRelaciones(asistenciamensualAux);//WithConnection
								//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciamensualAux,asistenciamensuals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciamensual,asistenciamensualAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				asistenciamensualAux=new  AsistenciaMensual();
				
				asistenciamensualAux.setIsNew(false);
				asistenciamensualAux.setIsChanged(false);
				
				asistenciamensualAux.setIsDeleted(true);
				
				asistenciamensualAux.setId(this.asistenciamensual.getId());	
				asistenciamensualAux.setVersionRow(this.asistenciamensual.getVersionRow());	
				asistenciamensualAux.setid_empresa(this.asistenciamensual.getid_empresa());	
				asistenciamensualAux.setid_empleado(this.asistenciamensual.getid_empleado());	
				asistenciamensualAux.setid_cargo(this.asistenciamensual.getid_cargo());	
				asistenciamensualAux.setid_estructura(this.asistenciamensual.getid_estructura());	
				asistenciamensualAux.setid_anio(this.asistenciamensual.getid_anio());	
				asistenciamensualAux.setid_mes(this.asistenciamensual.getid_mes());	
				asistenciamensualAux.setfecha(this.asistenciamensual.getfecha());	
				asistenciamensualAux.sethoras_trabajo(this.asistenciamensual.gethoras_trabajo());	
				asistenciamensualAux.sethoras_atraso(this.asistenciamensual.gethoras_atraso());	
				asistenciamensualAux.sethoras_faltas(this.asistenciamensual.gethoras_faltas());	
				asistenciamensualAux.sethoras_permiso(this.asistenciamensual.gethoras_permiso());	
				asistenciamensualAux.sethoras_extra25(this.asistenciamensual.gethoras_extra25());	
				asistenciamensualAux.sethoras_extra50(this.asistenciamensual.gethoras_extra50());	
				asistenciamensualAux.sethoras_extra100(this.asistenciamensual.gethoras_extra100());	
				asistenciamensualAux.sethoras_extra150(this.asistenciamensual.gethoras_extra150());	
				asistenciamensualAux.sethoras_extra0(this.asistenciamensual.gethoras_extra0());	
				asistenciamensualAux.sethoras_enfermo(this.asistenciamensual.gethoras_enfermo());	
				asistenciamensualAux.sethoras_maternidad(this.asistenciamensual.gethoras_maternidad());	
				asistenciamensualAux.sethoras_vacacion(this.asistenciamensual.gethoras_vacacion());	
				asistenciamensualAux.setnumero_dias(this.asistenciamensual.getnumero_dias());	
				asistenciamensualAux.setnumero_noches(this.asistenciamensual.getnumero_noches());	
				asistenciamensualAux.setnumero_feriados(this.asistenciamensual.getnumero_feriados());	
				asistenciamensualAux.setnumero_trabajo(this.asistenciamensual.getnumero_trabajo());	
				
				if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.asistenciamensualAux.getId()>=0) {	
						this.asistenciamensualsEliminados.add(asistenciamensualAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciamensualAux,asistenciamensuals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.saveAsistenciaMensuals();//WithConnection
						//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciamensualLogic.saveAsistenciaMensualRelaciones(asistenciamensualAux);//WithConnection
								//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
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
							if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
								|| this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(asistenciamensualAux,asistenciamensualLogic.getAsistenciaMensuals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(asistenciamensualAux,asistenciamensuals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getAsistenciaMensuals().addAll(this.asistenciamensualsEliminados);
					
					asistenciamensualLogic.saveAsistenciaMensuals();//WithConnection
					//asistenciamensualLogic.getSetVersionRowAsistenciaMensuals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAsistenciaMensual();
				
				this.asistenciamensualsEliminados= new ArrayList<AsistenciaMensual>();		
			}
			
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Asistencia Mensual GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.asistenciamensual=asistenciamensualAux;
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
      		//this.finishProcessAsistenciaMensual();
      	}
		
	}	
	
	public void actualizarRelaciones(AsistenciaMensual asistenciamensualLocal) throws Exception {
		
		if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AsistenciaMensual asistenciamensualLocal) throws Exception {	
		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				asistenciamensualLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				asistenciamensualLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CargoDetalleFormJInternalFrame.class)) {
				CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrameLocal=(CargoBeanSwingJInternalFrame) ((CargoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargo(cargoBeanSwingJInternalFrameLocal.getcargo(),true);
				cargoBeanSwingJInternalFrameLocal.actualizarLista(cargoBeanSwingJInternalFrameLocal.cargo,this.cargosForeignKey);

				cargoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargoBeanSwingJInternalFrameLocal.cargo);

				asistenciamensualLocal.setCargo(cargoBeanSwingJInternalFrameLocal.cargo);

				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey("Formulario");
				this.setActualCargoForeignKey(cargoBeanSwingJInternalFrameLocal.cargo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				asistenciamensualLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				asistenciamensualLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				asistenciamensualLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAsistenciaMensualActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = asistenciamensualValidator.getInvalidValues(this.asistenciamensual);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AsistenciaMensual asistenciamensual,List<AsistenciaMensual> asistenciamensuals) throws Exception {
		try	{		
			AsistenciaMensualConstantesFunciones.actualizarLista(asistenciamensual,asistenciamensuals,this.asistenciamensualSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AsistenciaMensual asistenciamensual,List<AsistenciaMensual> asistenciamensuals) throws Exception {
		try	{			
			AsistenciaMensualConstantesFunciones.actualizarSelectedLista(asistenciamensual,asistenciamensuals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AsistenciaMensual> asistenciamensualsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				asistenciamensualsLocal=this.asistenciamensualLogic.getAsistenciaMensuals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				asistenciamensualsLocal=this.asistenciamensuals;
			}
			//ARCHITECTURE
		
			for(AsistenciaMensual asistenciamensualLocal:asistenciamensualsLocal) {
				if(this.permiteMantenimiento(asistenciamensualLocal) && asistenciamensualLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AsistenciaMensualConstantesFunciones.getAsistenciaMensualLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_empresaAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_empleadoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDCARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_cargoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_estructuraAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_anioAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_mesAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelfechaAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASTRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_trabajoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASATRASO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_atrasoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASFALTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_faltasAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASPERMISO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_permisoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASEXTRA25)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra25AsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASEXTRA50)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra50AsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASEXTRA100)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra100AsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASEXTRA150)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra150AsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASEXTRA0)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra0AsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASENFERMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_enfermoAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASMATERNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_maternidadAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.HORASVACACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_vacacionAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_diasAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.NUMERONOCHES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_nochesAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.NUMEROFERIADOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_feriadosAsistenciaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaMensualConstantesFunciones.NUMEROTRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_trabajoAsistenciaMensual,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_empresaAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_empleadoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_cargoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_estructuraAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_anioAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelid_mesAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelfechaAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_trabajoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_atrasoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_faltasAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_permisoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra25AsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra50AsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra100AsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra150AsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra0AsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_enfermoAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_maternidadAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_vacacionAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_diasAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_nochesAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_feriadosAsistenciaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_trabajoAsistenciaMensual,"");
		
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
		this.iIdNuevoAsistenciaMensual--;	
		
		
		this.asistenciamensualAux=new AsistenciaMensual();
		
		this.asistenciamensualAux.setId(this.iIdNuevoAsistenciaMensual);
		this.asistenciamensualAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciamensualLogic.getAsistenciaMensuals().add(this.asistenciamensualAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.asistenciamensuals.add(this.asistenciamensualAux);
		}
		//ARCHITECTURE
		
		this.asistenciamensual=this.asistenciamensualAux;
		
		if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensual);
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaMensual(this.asistenciamensual);
		}
				
		//this.setDefaultControlesAsistenciaMensual();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAsistenciaMensual();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAsistenciaMensual();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaMensual();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaMensual(this.asistenciamensualBean,this.asistenciamensual,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AsistenciaMensualConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
			classes=AsistenciaMensualConstantesFunciones.getClassesRelationshipsOfAsistenciaMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.asistenciamensualReturnGeneral=asistenciamensualLogic.procesarEventosAsistenciaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciamensualLogic.getAsistenciaMensuals(),this.asistenciamensual,this.asistenciamensualParameterGeneral,this.isEsNuevoAsistenciaMensual,classes);//this.asistenciamensualLogic.getAsistenciaMensual()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAsistenciaMensual(this.asistenciamensualReturnGeneral,this.asistenciamensualBean,false);
		
		if(this.asistenciamensualReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual());
		}
		
		if(this.asistenciamensualReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual(),classes);//this.asistenciamensualBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAsistenciaMensual();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAsistenciaMensual();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.RecargarFormAsistenciaMensual(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAsistenciaMensual(false);
						
			if(asistenciamensualSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaMensual();
			}
			
			this.actualizarVisualTableDatosAsistenciaMensual();
			
			this.jTableDatosAsistenciaMensual.setRowSelectionInterval(this.getIndiceNuevoAsistenciaMensual(), this.getIndiceNuevoAsistenciaMensual());
			
			this.seleccionarFilaTablaAsistenciaMensualActual();
						
			this.actualizarEstadoCeldasBotonesAsistenciaMensual("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAsistenciaMensual(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarfechaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_trabajoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_atrasoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_faltasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_permisoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_extra25AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_extra50AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_extra100AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_extra150AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_extra0AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_enfermoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_maternidadAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarhoras_vacacionAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarnumero_diasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarnumero_nochesAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarnumero_feriadosAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarnumero_trabajoAsistenciaMensual);	
		//
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_empresaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_empleadoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_cargoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_estructuraAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_anioAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setEnabled(isHabilitar && this.asistenciamensualConstantesFunciones.activarid_mesAsistenciaMensual);
	};
	
	public void setDefaultControlesAsistenciaMensual() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAsistenciaMensual(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.asistenciamensualSessionBean.setConGuardarRelaciones(true);			
			this.asistenciamensualSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.setVisible(true);
			
					
		} else {
			//this.asistenciamensualSessionBean.setConGuardarRelaciones(false);			
			this.asistenciamensualSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAsistenciaMensual() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
				if(asistenciamensualAux.getId().equals(this.iIdNuevoAsistenciaMensual)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensuals) {
				if(asistenciamensualAux.getId().equals(this.iIdNuevoAsistenciaMensual)) {
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
	
	public int getIndiceActualAsistenciaMensual(AsistenciaMensual asistenciamensual,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
				if(asistenciamensualAux.getId().equals(asistenciamensual.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensuals) {
				if(asistenciamensualAux.getId().equals(asistenciamensual.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAsistenciaMensual(AsistenciaMensual asistenciamensualOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
				if(asistenciamensualAux.getAsistenciaMensualOriginal().getId().equals(asistenciamensualOriginal.getId())) {
					existe=true;
					asistenciamensualOriginal.setId(asistenciamensualAux.getId());
					asistenciamensualOriginal.setVersionRow(asistenciamensualAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaMensual asistenciamensualAux:this.asistenciamensuals) {
				if(asistenciamensualAux.getAsistenciaMensualOriginal().getId().equals(asistenciamensualOriginal.getId())) {
					existe=true;
					asistenciamensualOriginal.setId(asistenciamensualAux.getId());
					asistenciamensualOriginal.setVersionRow(asistenciamensualAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAsistenciaMensual(Boolean esParaCancelar) throws Exception {
		asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
		asistenciamensualAux=new AsistenciaMensual();
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
					if(asistenciamensualAux.getId()<0) {
						asistenciamensualsAux.add(asistenciamensualAux);
					}		
				}
				this.iIdNuevoAsistenciaMensual=0L;
				this.asistenciamensualLogic.getAsistenciaMensuals().removeAll(asistenciamensualsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaMensual asistenciamensualAux:this.asistenciamensuals) {
					if(asistenciamensualAux.getId()<0) {
						asistenciamensualsAux.add(asistenciamensualAux);
					}		
				}
				this.iIdNuevoAsistenciaMensual=0L;
				this.asistenciamensuals.removeAll(asistenciamensualsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAsistenciaMensual 
					&& this.asistenciamensualLogic.getAsistenciaMensuals().size()>0
					) {
					asistenciamensualAux=this.asistenciamensualLogic.getAsistenciaMensuals().get(this.asistenciamensualLogic.getAsistenciaMensuals().size() - 1);
				
					if(asistenciamensualAux.getId()<0) {
						this.asistenciamensualLogic.getAsistenciaMensuals().remove(asistenciamensualAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAsistenciaMensual && this.asistenciamensuals.size()>0) {
					asistenciamensualAux=this.asistenciamensuals.get(this.asistenciamensuals.size() - 1);
				
					if(asistenciamensualAux.getId()<0) {
						this.asistenciamensuals.remove(asistenciamensualAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAsistenciaMensual(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(asistenciamensual.getId()<0) {
				this.asistenciamensualLogic.getAsistenciaMensuals().remove(this.asistenciamensual);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(asistenciamensual.getId()<0) {
				this.asistenciamensuals.remove(this.asistenciamensual);
			}
		}			
	}
	
	public void setEstadosInicialesAsistenciaMensual(List<AsistenciaMensual> asistenciamensualsAux) throws Exception {
		AsistenciaMensualConstantesFunciones.setEstadosInicialesAsistenciaMensual(asistenciamensualsAux);
	}
	
	public void setEstadosInicialesAsistenciaMensual(AsistenciaMensual asistenciamensualAux) throws Exception {
		AsistenciaMensualConstantesFunciones.setEstadosInicialesAsistenciaMensual(asistenciamensualAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAsistenciaMensualActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAsistenciaMensualActual()) {
				if(!this.isEsNuevoAsistenciaMensual) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAsistenciaMensual=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAsistenciaMensualActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Asistencia Mensual ?", "MANTENIMIENTO DE Asistencia Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AsistenciaMensual asistenciamensual) throws Exception {
		AsistenciaMensualConstantesFunciones.seleccionarAsignar(this.asistenciamensual,asistenciamensual);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAsistenciaMensual=this.isPermisoActualizarOriginalAsistenciaMensual;
			
			
			this.seleccionarAsignar(asistenciamensual);
			
			

			idEmpleadoActual=asistenciamensual.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaMensualConstantesFunciones.quitarEspaciosAsistenciaMensual(this.asistenciamensual,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAsistenciaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.asistenciamensualSessionBean.setsFuncionBusquedaRapida(this.asistenciamensualSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoAsistenciaMensual) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAsistenciaMensual(esParaCancelar);				
				this.cancelarNuevoAsistenciaMensual(esParaCancelar);								
			}
			
			this.asistenciamensual=new AsistenciaMensual();
			
			this.inicializarAsistenciaMensual();
			
			this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAsistenciaMensual() throws Exception {
		try {
			AsistenciaMensualConstantesFunciones.inicializarAsistenciaMensual(this.asistenciamensual);
			
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
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.asistenciamensualLogic.getAsistenciaMensuals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAsistenciaMensuals(String sAccionBusqueda,List<AsistenciaMensual> asistenciamensualsParaReportes) throws Exception {
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
					sPathReporteFinal="AsistenciaMensual"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AsistenciaMensualMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AsistenciaMensualMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AsistenciaMensual"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Asistencia Mensuales");		
		parameters.put("busquedapor", AsistenciaMensualConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAsistenciaMensual=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AsistenciaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AsistenciaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAsistenciaMensual=new JRBeanArrayDataSource(AsistenciaMensualJInternalFrame.TraerAsistenciaMensualBeans(asistenciamensualsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAsistenciaMensual);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AsistenciaMensualConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AsistenciaMensualConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AsistenciaMensualBean.TraerAsistenciaMensualBeans(asistenciamensualsParaReportes).toArray()));
							
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
				this.generarExcelReporteAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAsistenciaMensualActionPerformed(null);
					//this.generarExcelReporteAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAsistenciaMensuals(sAccionBusqueda,sTipoArchivoReporte,asistenciamensualsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAsistenciaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaMensual> asistenciamensualsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaMensuals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaMensual("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AsistenciaMensual asistenciamensual : asistenciamensualsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AsistenciaMensualConstantesFunciones.generarExcelReporteDataAsistenciaMensual("NORMAL",row,workbook,asistenciamensual,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAsistenciaMensual(String sTipo,Row row,Workbook workbook) {
		
		AsistenciaMensualConstantesFunciones.generarExcelReporteHeaderAsistenciaMensual(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAsistenciaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaMensual> asistenciamensualsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AsistenciaMensual asistenciamensual : asistenciamensualsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AsistenciaMensualConstantesFunciones.getAsistenciaMensualDescripcion(asistenciamensual));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getcargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_trabajo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_atraso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_faltas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_permiso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_extra25());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_extra50());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_extra100());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_extra150());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_extra0());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_enfermo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_maternidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.gethoras_vacacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getnumero_dias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getnumero_noches());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getnumero_feriados());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciamensual.getnumero_trabajo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAsistenciaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaMensual> asistenciamensualsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AsistenciaMensual> asistenciamensualsRespaldo=null;
		
		classes=AsistenciaMensualConstantesFunciones.getClassesRelationshipsOfAsistenciaMensual(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.asistenciamensualLogic.setDatosCliente(this.datosCliente);
		this.asistenciamensualLogic.setDatosDeep(this.datosDeep);
		this.asistenciamensualLogic.setIsConDeep(true);
		
		asistenciamensualsRespaldo=this.asistenciamensualLogic.getAsistenciaMensuals();
		
		this.asistenciamensualLogic.setAsistenciaMensuals(asistenciamensualsParaReportes);	
		this.asistenciamensualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		asistenciamensualsParaReportes=this.asistenciamensualLogic.getAsistenciaMensuals();
		this.asistenciamensualLogic.setAsistenciaMensuals(asistenciamensualsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaMensual("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AsistenciaMensual asistenciamensual : asistenciamensualsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAsistenciaMensual("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AsistenciaMensualConstantesFunciones.generarExcelReporteDataAsistenciaMensual("NORMAL",row,workbook,asistenciamensual,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AsistenciaMensualConstantesFunciones.getAsistenciaMensualDescripcion(asistenciamensual));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAsistenciaMensual() throws Exception {		
		this.startProcessAsistenciaMensual(true);
	}
	
	public void startProcessAsistenciaMensual(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAsistenciaMensual ,this.jPanelParametrosReportesAsistenciaMensual, this.jScrollPanelDatosAsistenciaMensual,this.jPanelPaginacionAsistenciaMensual, this.jScrollPanelDatosEdicionAsistenciaMensual, this.jPanelAccionesAsistenciaMensual,this.jPanelAccionesFormularioAsistenciaMensual,this.jmenuBarAsistenciaMensual,this.jmenuBarDetalleAsistenciaMensual,this.jTtoolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaMensual=this.jTabbedPaneBusquedasAsistenciaMensual; 
		
		final JPanel jPanelParametrosReportesAsistenciaMensual=this.jPanelParametrosReportesAsistenciaMensual;
		//final JScrollPane jScrollPanelDatosAsistenciaMensual=this.jScrollPanelDatosAsistenciaMensual;
		final JTable jTableDatosAsistenciaMensual=this.jTableDatosAsistenciaMensual;		
		final JPanel jPanelPaginacionAsistenciaMensual=this.jPanelPaginacionAsistenciaMensual;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaMensual=this.jScrollPanelDatosEdicionAsistenciaMensual;
		final JPanel jPanelAccionesAsistenciaMensual=this.jPanelAccionesAsistenciaMensual;
		
		JPanel jPanelCamposAuxiliarAsistenciaMensual=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaMensual=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			jPanelCamposAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jPanelCamposAsistenciaMensual;
			jPanelAccionesFormularioAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jPanelAccionesFormularioAsistenciaMensual;
		}
		
		final JPanel jPanelCamposAsistenciaMensual=jPanelCamposAuxiliarAsistenciaMensual;
		final JPanel jPanelAccionesFormularioAsistenciaMensual=jPanelAccionesFormularioAuxiliarAsistenciaMensual;
		
		
		final JMenuBar jmenuBarAsistenciaMensual=this.jmenuBarAsistenciaMensual;
		final JToolBar jTtoolBarAsistenciaMensual=this.jTtoolBarAsistenciaMensual;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaMensual=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			jmenuBarDetalleAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jmenuBarDetalleAsistenciaMensual;
			jTtoolBarDetalleAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jTtoolBarDetalleAsistenciaMensual;
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaMensual=jmenuBarDetalleAuxiliarAsistenciaMensual;
		final JToolBar jTtoolBarDetalleAsistenciaMensual=jTtoolBarDetalleAuxiliarAsistenciaMensual;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaMensual;
			processRunnable.jTableDatos=jTableDatosAsistenciaMensual;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaMensual;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaMensual;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaMensual;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaMensual ,jPanelParametrosReportesAsistenciaMensual,jTableDatosAsistenciaMensual, /*jScrollPanelDatosAsistenciaMensual,*/jPanelCamposAsistenciaMensual,jPanelPaginacionAsistenciaMensual, /*jScrollPanelDatosEdicionAsistenciaMensual,*/ jPanelAccionesAsistenciaMensual,jPanelAccionesFormularioAsistenciaMensual,jmenuBarAsistenciaMensual,jmenuBarDetalleAsistenciaMensual,jTtoolBarAsistenciaMensual,jTtoolBarDetalleAsistenciaMensual);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaMensual ,jPanelParametrosReportesAsistenciaMensual, jScrollPanelDatosAsistenciaMensual,jPanelPaginacionAsistenciaMensual, jScrollPanelDatosEdicionAsistenciaMensual, jPanelAccionesAsistenciaMensual,jPanelAccionesFormularioAsistenciaMensual,jmenuBarAsistenciaMensual,jmenuBarDetalleAsistenciaMensual,jTtoolBarAsistenciaMensual,jTtoolBarDetalleAsistenciaMensual);
						
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
	
	public void finishProcessAsistenciaMensual() {// throws Exception 
		this.finishProcessAsistenciaMensual(true);
	}
	
	public void finishProcessAsistenciaMensual(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAsistenciaMensual ,this.jPanelParametrosReportesAsistenciaMensual, this.jScrollPanelDatosAsistenciaMensual,this.jPanelPaginacionAsistenciaMensual, this.jScrollPanelDatosEdicionAsistenciaMensual, this.jPanelAccionesAsistenciaMensual,this.jPanelAccionesFormularioAsistenciaMensual,this.jmenuBarAsistenciaMensual,this.jmenuBarDetalleAsistenciaMensual,this.jTtoolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaMensual=this.jTabbedPaneBusquedasAsistenciaMensual; 
		
		final JPanel jPanelParametrosReportesAsistenciaMensual=this.jPanelParametrosReportesAsistenciaMensual;
		//final JScrollPane jScrollPanelDatosAsistenciaMensual=this.jScrollPanelDatosAsistenciaMensual;
		final JTable jTableDatosAsistenciaMensual=this.jTableDatosAsistenciaMensual;		
		final JPanel jPanelPaginacionAsistenciaMensual=this.jPanelPaginacionAsistenciaMensual;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaMensual=this.jScrollPanelDatosEdicionAsistenciaMensual;
		final JPanel jPanelAccionesAsistenciaMensual=this.jPanelAccionesAsistenciaMensual;
		
		JPanel jPanelCamposAuxiliarAsistenciaMensual=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaMensual=new JPanel();
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			jPanelCamposAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jPanelCamposAsistenciaMensual;
			jPanelAccionesFormularioAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jPanelAccionesFormularioAsistenciaMensual;
		}
		
		final JPanel jPanelCamposAsistenciaMensual=jPanelCamposAuxiliarAsistenciaMensual;
		final JPanel jPanelAccionesFormularioAsistenciaMensual=jPanelAccionesFormularioAuxiliarAsistenciaMensual;
		
		
		final JMenuBar jmenuBarAsistenciaMensual=this.jmenuBarAsistenciaMensual;		
		final JToolBar jTtoolBarAsistenciaMensual=this.jTtoolBarAsistenciaMensual;
				
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaMensual=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			jmenuBarDetalleAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jmenuBarDetalleAsistenciaMensual;
			jTtoolBarDetalleAuxiliarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jTtoolBarDetalleAsistenciaMensual;		
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaMensual=jmenuBarDetalleAuxiliarAsistenciaMensual;
		final JToolBar jTtoolBarDetalleAsistenciaMensual=jTtoolBarDetalleAuxiliarAsistenciaMensual;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaMensual;
			processRunnable.jTableDatos=jTableDatosAsistenciaMensual;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaMensual;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaMensual;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaMensual;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAsistenciaMensual ,jPanelParametrosReportesAsistenciaMensual, jTableDatosAsistenciaMensual,/*jScrollPanelDatosAsistenciaMensual,*/jPanelCamposAsistenciaMensual,jPanelPaginacionAsistenciaMensual, /*jScrollPanelDatosEdicionAsistenciaMensual,*/ jPanelAccionesAsistenciaMensual,jPanelAccionesFormularioAsistenciaMensual,jmenuBarAsistenciaMensual,jmenuBarDetalleAsistenciaMensual,jTtoolBarAsistenciaMensual,jTtoolBarDetalleAsistenciaMensual));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAsistenciaMensual(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAsistenciaMensual(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAsistenciaMensual(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAsistenciaMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAsistenciaMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAsistenciaMensual,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAsistenciaMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAsistenciaMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAsistenciaMensual,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.asistenciamensualConstantesFunciones.getsFinalQueryAsistenciaMensual();
		String  finalQueryPaginacionTodos=this.asistenciamensualConstantesFunciones.getsFinalQueryAsistenciaMensual();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AsistenciaMensualConstantesFunciones.getArrayColumnasGlobalesNoAsistenciaMensual(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AsistenciaMensualConstantesFunciones.getArrayColumnasGlobalesAsistenciaMensual(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AsistenciaMensualConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.asistenciamensualsEliminados= new ArrayList<AsistenciaMensual>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAsistenciaMensual();
		
				///*AsistenciaMensualSessionBean*/this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			
			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
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
					this.iNumeroPaginacion=AsistenciaMensualConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AsistenciaMensualConstantesFunciones.getClassesForeignKeysOfAsistenciaMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/asistenciamensual."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			asistenciamensualsAux= new ArrayList<AsistenciaMensual>();
			
				
			asistenciamensualLogic.setDatosCliente(this.datosCliente);
			asistenciamensualLogic.setDatosDeep(this.datosDeep);
			asistenciamensualLogic.setIsConDeep(true);
			
			
			asistenciamensualLogic.getAsistenciaMensualDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					asistenciamensualLogic.getTodosAsistenciaMensuals(finalQueryGlobal,pagination);
					
					//asistenciamensualLogic.getTodosAsistenciaMensualsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(asistenciamensualLogic.getAsistenciaMensuals()==null|| asistenciamensualLogic.getAsistenciaMensuals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciamensualsAux= new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux= new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciamensualLogic.getTodosAsistenciaMensuals(finalQueryGlobal+"",this.pagination);												
							
							//asistenciamensualLogic.getTodosAsistenciaMensualsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAsistenciaMensuals("Todos",asistenciamensualLogic.getAsistenciaMensuals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());					
							asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAsistenciaMensual=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAsistenciaMensual=this.idActual;
				
				} else if(this.idAsistenciaMensualActual!=null && this.idAsistenciaMensualActual!=0L) {
					idAsistenciaMensual=idAsistenciaMensualActual;
				}
				
					
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndicePorId(idAsistenciaMensual);
				
				this.asistenciamensuals=new ArrayList<AsistenciaMensual>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					asistenciamensualLogic.getEntity(idAsistenciaMensual);
					
					//asistenciamensualLogic.getEntityWithConnection(idAsistenciaMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
					asistenciamensualLogic.getAsistenciaMensuals().add(asistenciamensualLogic.getAsistenciaMensual());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensuals=new ArrayList<AsistenciaMensual>();
					this.asistenciamensuals.add(asistenciamensual);
				}
				
				if(asistenciamensualLogic.getAsistenciaMensual()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdAnio",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdAnio",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCargo")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdCargo",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdCargo",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdEmpleado",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdEmpleado",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdEmpresa",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdEmpresa",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdEstructura",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdEstructura",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciamensualLogic.getAsistenciaMensualsFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciamensualLogic.getAsistenciaMensuals()==null||asistenciamensualLogic.getAsistenciaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciamensuals==null|| asistenciamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
						asistenciamensualsAux.addAll(asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualsAux=new ArrayList<AsistenciaMensual>();
							asistenciamensualsAux.addAll(asistenciamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciamensualLogic.getAsistenciaMensualsFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaMensualConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaMensuals("FK_IdMes",asistenciamensualLogic.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaMensuals("FK_IdMes",asistenciamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
						asistenciamensualLogic.getAsistenciaMensuals().addAll(asistenciamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensuals=new ArrayList<AsistenciaMensual>();
							asistenciamensuals.addAll(asistenciamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAsistenciaMensual();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAsistenciaMensual();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciamensualLogic.getAsistenciaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciamensuals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciamensualLogic.getAsistenciaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciamensuals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AsistenciaMensual asistenciamensual) {
		Boolean permite=true;
		
		if(this.asistenciamensual.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AsistenciaMensualConstantesFunciones.getOrderByListaAsistenciaMensual();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AsistenciaMensualConstantesFunciones.getOrderByListaAsistenciaMensual();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaMensual asistenciamensual:asistenciamensualLogic.getAsistenciaMensuals()) {
				if(asistenciamensual.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciamensualTotales=asistenciamensual;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaMensual asistenciamensual:this.asistenciamensuals) {
				if(asistenciamensual.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciamensualTotales=asistenciamensual;
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
			this.asistenciamensualAux=new AsistenciaMensual();
			this.asistenciamensualAux.setsType(Constantes2.S_TOTALES);
			this.asistenciamensualAux.setIsNew(false);
			this.asistenciamensualAux.setIsChanged(false);
			this.asistenciamensualAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AsistenciaMensualConstantesFunciones.TotalizarValoresFilaAsistenciaMensual(this.asistenciamensualLogic.getAsistenciaMensuals(),this.asistenciamensualAux);
				
				this.asistenciamensualLogic.getAsistenciaMensuals().add(this.asistenciamensualAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AsistenciaMensualConstantesFunciones.TotalizarValoresFilaAsistenciaMensual(this.asistenciamensuals,this.asistenciamensualAux);
				
				this.asistenciamensuals.add(this.asistenciamensualAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		asistenciamensualTotales=new AsistenciaMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciamensualLogic.getAsistenciaMensuals().remove(asistenciamensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciamensuals.remove(asistenciamensualTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		asistenciamensualTotales=new AsistenciaMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaMensual asistenciamensual:asistenciamensualLogic.getAsistenciaMensuals()) {
				if(asistenciamensual.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciamensualTotales=asistenciamensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaMensualConstantesFunciones.TotalizarValoresFilaAsistenciaMensual(this.asistenciamensualLogic.getAsistenciaMensuals(),asistenciamensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaMensual asistenciamensual:this.asistenciamensuals) {
				if(asistenciamensual.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciamensualTotales=asistenciamensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaMensualConstantesFunciones.TotalizarValoresFilaAsistenciaMensual(this.asistenciamensuals,asistenciamensualTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAsistenciaMensualsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaMensualsFK_IdCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaMensualsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaMensualsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaMensualsFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaMensualsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAsistenciaMensualsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaMensualsFK_IdCargo(String sFinalQuery,Long id_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdCargo(sFinalQuery,this.pagination,id_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaMensualsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaMensualsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaMensualsFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaMensualsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLogic.getAsistenciaMensualsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosAsistenciaMensual() {
		this.isPermisoTodoAsistenciaMensual=false;
		this.isPermisoNuevoAsistenciaMensual=false;
		this.isPermisoActualizarAsistenciaMensual=false;
		this.isPermisoActualizarOriginalAsistenciaMensual=false;
		this.isPermisoEliminarAsistenciaMensual=false;
		this.isPermisoGuardarCambiosAsistenciaMensual=false;
		this.isPermisoConsultaAsistenciaMensual=false;
		this.isPermisoBusquedaAsistenciaMensual=false;
		this.isPermisoReporteAsistenciaMensual=false;		
		this.isPermisoOrdenAsistenciaMensual=false;		
		this.isPermisoPaginacionMedioAsistenciaMensual=false;		
		this.isPermisoPaginacionAltoAsistenciaMensual=false;
		this.isPermisoPaginacionTodoAsistenciaMensual=false;
		this.isPermisoCopiarAsistenciaMensual=false;		
		this.isPermisoVerFormAsistenciaMensual=false;		
		this.isPermisoDuplicarAsistenciaMensual=false;		
		this.isPermisoOrdenAsistenciaMensual=false;		
	}
	
	public void setPermisosUsuarioAsistenciaMensual(Boolean isPermiso) {
		this.isPermisoTodoAsistenciaMensual=isPermiso;
		this.isPermisoNuevoAsistenciaMensual=isPermiso;
		this.isPermisoActualizarAsistenciaMensual=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaMensual=isPermiso;
		this.isPermisoEliminarAsistenciaMensual=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaMensual=isPermiso;
		this.isPermisoConsultaAsistenciaMensual=isPermiso;
		this.isPermisoBusquedaAsistenciaMensual=isPermiso;
		this.isPermisoReporteAsistenciaMensual=isPermiso;
		this.isPermisoOrdenAsistenciaMensual=isPermiso;		
		this.isPermisoPaginacionMedioAsistenciaMensual=isPermiso;		
		this.isPermisoPaginacionAltoAsistenciaMensual=isPermiso;		
		this.isPermisoPaginacionTodoAsistenciaMensual=isPermiso;		
		this.isPermisoCopiarAsistenciaMensual=isPermiso;		
		this.isPermisoVerFormAsistenciaMensual=isPermiso;		
		this.isPermisoDuplicarAsistenciaMensual=isPermiso;
		this.isPermisoOrdenAsistenciaMensual=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAsistenciaMensual(Boolean isPermiso) {
		//this.isPermisoTodoAsistenciaMensual=isPermiso;
		this.isPermisoNuevoAsistenciaMensual=isPermiso;
		this.isPermisoActualizarAsistenciaMensual=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaMensual=isPermiso;
		this.isPermisoEliminarAsistenciaMensual=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaMensual=isPermiso;
		//this.isPermisoConsultaAsistenciaMensual=isPermiso;
		//this.isPermisoBusquedaAsistenciaMensual=isPermiso;
		//this.isPermisoReporteAsistenciaMensual=isPermiso;
		//this.isPermisoOrdenAsistenciaMensual=isPermiso;		
		//this.isPermisoPaginacionMedioAsistenciaMensual=isPermiso;		
		//this.isPermisoPaginacionAltoAsistenciaMensual=isPermiso;		
		//this.isPermisoPaginacionTodoAsistenciaMensual=isPermiso;		
		//this.isPermisoCopiarAsistenciaMensual=isPermiso;		
		//this.isPermisoDuplicarAsistenciaMensual=isPermiso;
		//this.isPermisoOrdenAsistenciaMensual=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaMensualClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AsistenciaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAsistenciaMensual(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaMensualClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAsistenciaMensualClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAsistenciaMensualClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAsistenciaMensualClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAsistenciaMensual() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AsistenciaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AsistenciaMensualConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAsistenciaMensual=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAsistenciaMensual=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAsistenciaMensual=this.isPermisoActualizarAsistenciaMensual;
			this.isPermisoEliminarAsistenciaMensual=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAsistenciaMensual=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAsistenciaMensual=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAsistenciaMensual=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAsistenciaMensual=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAsistenciaMensual=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAsistenciaMensual=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAsistenciaMensual=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAsistenciaMensual=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAsistenciaMensual=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAsistenciaMensual=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAsistenciaMensual=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAsistenciaMensual.setToolTipText(this.jTableDatosAsistenciaMensual.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAsistenciaMensual(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAsistenciaMensual(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AsistenciaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AsistenciaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAsistenciaMensual() throws Exception {
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
	public void inicializarCombosForeignKeyAsistenciaMensualListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.cargosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAsistenciaMensualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AsistenciaMensualJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAsistenciaMensualListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyAsistenciaMensualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AsistenciaMensualParameterReturnGeneral asistenciamensualReturnGeneral=new AsistenciaMensualParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_empresaAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_empresaAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_empleadoAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_empleadoAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalCargo="";

				if(((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_cargoAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_cargoAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCargo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

						finalQueryGlobalCargo=Funciones.GetFinalQueryAppend(finalQueryGlobalCargo, "");
						finalQueryGlobalCargo+=CargoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCargo=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidCargoActual();
					}
				} else {
					finalQueryGlobalCargo="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_estructuraAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_estructuraAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_anioAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_anioAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.asistenciamensualConstantesFunciones.cargarid_mesAsistenciaMensual)
					 || (this.esRecargarFks && this.asistenciamensualConstantesFunciones.cargarid_mesAsistenciaMensual)) {

					if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+asistenciamensualSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				asistenciamensualReturnGeneral=asistenciamensualLogic.cargarCombosLoteForeignKeyAsistenciaMensual(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalCargo,finalQueryGlobalEstructura,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=asistenciamensualReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=asistenciamensualReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalCargo.equals("NONE")) {
				this.cargosForeignKey=asistenciamensualReturnGeneral.getcargosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=asistenciamensualReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=asistenciamensualReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=asistenciamensualReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAsistenciaMensual()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyCargo();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.asistenciamensualSessionBean==null) {
				this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyCargo()throws Exception {
		try {

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.asistenciamensualSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyAsistenciaMensual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAsistenciaMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAsistenciaMensual()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.asistenciamensual.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaMensual();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAsistenciaMensual(AsistenciaMensual asistenciamensual)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(asistenciamensual.getid_empleado(),false,"Formulario");
			this.setActualCargoForeignKey(asistenciamensual.getid_cargo(),false,"Formulario");
			this.setActualEstructuraForeignKey(asistenciamensual.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAsistenciaMensual(AsistenciaMensual asistenciamensual,String sTipoEvento)throws Exception {	
		try {
			
			

				if(asistenciamensual.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoAsistenciaMensual")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(asistenciamensual.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAsistenciaMensual()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.asistenciamensualConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualCargoForeignKey(this.asistenciamensualConstantesFunciones.getid_cargo(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.asistenciamensualConstantesFunciones.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaMensual()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAsistenciaMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAsistenciaMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAsistenciaMensual()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAsistenciaMensual()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameCargosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAsistenciaMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAsistenciaMensual()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public AsistenciaMensualBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AsistenciaMensualBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AsistenciaMensualBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean(); 
		this.asistenciamensualConstantesFunciones=new AsistenciaMensualConstantesFunciones(); 
		this.asistenciamensualBean=new AsistenciaMensual();//(this.asistenciamensualConstantesFunciones); 		
		this.asistenciamensualReturnGeneral=new AsistenciaMensualParameterReturnGeneral(); 
		
		this.asistenciamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AsistenciaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AsistenciaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AsistenciaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAsistenciaMensual(true);
			
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
			
			this.asistenciamensualConstantesFunciones=new AsistenciaMensualConstantesFunciones(); 
			this.asistenciamensualBean=new AsistenciaMensual();//this.asistenciamensualConstantesFunciones); 			
			this.asistenciamensualReturnGeneral=new AsistenciaMensualParameterReturnGeneral(); 
		
			AsistenciaMensualBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Mensual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.asistenciamensual=new AsistenciaMensual();
			this.asistenciamensuals = new ArrayList<AsistenciaMensual>();
			this.asistenciamensualsAux = new ArrayList<AsistenciaMensual>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic=new AsistenciaMensualLogic();
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			//this.asistenciamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.asistenciamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAsistenciaMensual);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaMensual);	
					}
					
					if(this.jInternalFrameImportacionAsistenciaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaMensual);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAsistenciaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAsistenciaMensual);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaMensual);
				this.jInternalFrameDetalleFormAsistenciaMensual.setVisible(false);
				this.jInternalFrameDetalleFormAsistenciaMensual.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaMensual);
					this.jInternalFrameReporteDinamicoAsistenciaMensual.setVisible(false);
					this.jInternalFrameReporteDinamicoAsistenciaMensual.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAsistenciaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaMensual);
					this.jInternalFrameImportacionAsistenciaMensual.setVisible(false);
					this.jInternalFrameImportacionAsistenciaMensual.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAsistenciaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaMensual);
					this.jInternalFrameOrderByAsistenciaMensual.setVisible(false);
					this.jInternalFrameOrderByAsistenciaMensual.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAsistenciaMensualActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AsistenciaMensualConstantesFunciones.INUMEROPAGINACION;
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
			
			this.asistenciamensualReturnGeneral=new AsistenciaMensualParameterReturnGeneral();
			
			this.asistenciamensualParameterGeneral=new AsistenciaMensualParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.asistenciamensualLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AsistenciaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),this.asistenciamensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),this.asistenciamensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaDuplicarAsistenciaMensual=true;
			this.isVisibilidadCeldaCopiarAsistenciaMensual=true;
			this.isVisibilidadCeldaVerFormAsistenciaMensual=true;
			this.isVisibilidadCeldaOrdenAsistenciaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCargo=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAsistenciaMensual();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAsistenciaMensual(false);
			
			this.setPermisosUsuarioAsistenciaMensual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado() 
				|| (this.asistenciamensualSessionBean.getEsGuardarRelacionado() && this.asistenciamensualSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAsistenciaMensualClasesRelacionadas();
			}
			
			if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAsistenciaMensualClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAsistenciaMensual();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAsistenciaMensual();
			}
			
			if(!this.isPermisoBusquedaAsistenciaMensual) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAsistenciaMensual,this.isPermisoPaginacionMedioAsistenciaMensual,this.isPermisoPaginacionTodoAsistenciaMensual);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AsistenciaMensualConstantesFunciones.getTiposSeleccionarAsistenciaMensual());
				
				this.tiposColumnasSelect=AsistenciaMensualConstantesFunciones.getTiposSeleccionarAsistenciaMensual(true);
				
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
			//if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAsistenciaMensual();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioAsistenciaMensual(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioAsistenciaMensual(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaMensual() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.cargoLogic=new CargoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.anioLogic=new AnioLogic();
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
				asistenciamensualImplementable= (AsistenciaMensualImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				asistenciamensualImplementableHome= (AsistenciaMensualImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.asistenciamensuals= new ArrayList<AsistenciaMensual>();
			this.asistenciamensualsEliminados= new ArrayList<AsistenciaMensual>();
						
			this.isEsNuevoAsistenciaMensual=false;
			this.esParaAccionDesdeFormularioAsistenciaMensual=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.cargosForeignKey=new ArrayList<Cargo>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAsistenciaMensual(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAsistenciaMensual();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AsistenciaMensualBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AsistenciaMensualConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAsistenciaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAsistenciaMensual(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAsistenciaMensual();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAsistenciaMensual();
			}
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAsistenciaMensual.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAsistenciaMensual(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AsistenciaMensual: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAsistenciaMensual() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAsistenciaMensual")) {
				iIndex=this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAsistenciaMensual();	
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
	
	public void cargarCombosForeignKeyAsistenciaMensual(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAsistenciaMensual(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAsistenciaMensual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAsistenciaMensualListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAsistenciaMensual();
		
		this.cargarCombosFrameForeignKeyAsistenciaMensual();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAsistenciaMensual();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAsistenciaMensual();
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
	
	public void jButtonNuevoAsistenciaMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			
			if(jTableDatosAsistenciaMensual.getRowCount()>=1) {
				jTableDatosAsistenciaMensual.removeRowSelectionInterval(0, jTableDatosAsistenciaMensual.getRowCount()-1);						
			}
			
			this.isEsNuevoAsistenciaMensual=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAsistenciaMensual(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAsistenciaMensual(true);			
			//this.asistenciamensual=new AsistenciaMensual();
			//this.asistenciamensual.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaMensual(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaMensual() ;
			
			if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaMensual(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.asistenciamensual);	
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);				
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AsistenciaMensual: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAsistenciaMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAsistenciaMensual.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAsistenciaMensual.getSelectedRows().length;			
			}
			
			asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAsistenciaMensual--;			
				//AsistenciaMensual asistenciamensualAux= new AsistenciaMensual();			
				//asistenciamensualAux.setId(this.iIdNuevoAsistenciaMensual);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AsistenciaMensual asistenciamensualOrigen=new AsistenciaMensual();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AsistenciaMensual asistenciamensualOrigen : asistenciamensualsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							asistenciamensualOrigen =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciamensualOrigen =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAsistenciaMensual();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.asistenciamensual.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAsistenciaMensual(asistenciamensualOrigen,this.asistenciamensual,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciamensualLogic.getAsistenciaMensuals().add(this.asistenciamensualAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciamensuals.add(this.asistenciamensualAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
				
				this.jTableDatosAsistenciaMensual.setRowSelectionInterval(this.getIndiceNuevoAsistenciaMensual(), this.getIndiceNuevoAsistenciaMensual());
				
				int iLastRow =  this.jTableDatosAsistenciaMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaMensual(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();									
		
			AsistenciaMensual asistenciamensualOrigen=new AsistenciaMensual();
			AsistenciaMensual asistenciamensualDestino=new AsistenciaMensual();
				
			asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAsistenciaMensual.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || asistenciamensualsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAsistenciaMensual.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualOrigen =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciamensualOrigen =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciamensualDestino =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciamensualDestino =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				asistenciamensualOrigen =asistenciamensualsSeleccionados.get(0);
				asistenciamensualDestino =asistenciamensualsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAsistenciaMensual(asistenciamensualOrigen,asistenciamensualDestino,true,false);
				
				asistenciamensualDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciamensualDestino,asistenciamensualLogic.getAsistenciaMensuals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciamensualDestino,asistenciamensuals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
				
				//this.jTableDatosAsistenciaMensual.setRowSelectionInterval(this.getIndiceNuevoAsistenciaMensual(), this.getIndiceNuevoAsistenciaMensual());
				
				int iLastRow =  this.jTableDatosAsistenciaMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaMensual(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAsistenciaMensual.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAsistenciaMensual.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAsistenciaMensual.setVisible(!isVisible);
			this.jPanelPaginacionAsistenciaMensual.setVisible(!isVisible);
			this.jPanelAccionesAsistenciaMensual.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAsistenciaMensual();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAsistenciaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAsistenciaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAsistenciaMensual();
			
			this.abrirFrameOrderByAsistenciaMensual();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAsistenciaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAsistenciaMensual(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaMensual);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAsistenciaMensual.isMaximum()) {
					this.jInternalFrameDetalleFormAsistenciaMensual.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAsistenciaMensual.setSize(this.jInternalFrameDetalleFormAsistenciaMensual.iWidthFormulario,this.jInternalFrameDetalleFormAsistenciaMensual.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAsistenciaMensual.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAsistenciaMensual.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAsistenciaMensual.isMaximum()) {
						this.jInternalFrameDetalleFormAsistenciaMensual.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaMensual.jContentPaneDetalleAsistenciaMensual.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaMensual.jContentPaneDetalleAsistenciaMensual.getWidth(),AsistenciaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaMensual.jContentPaneDetalleAsistenciaMensual.getWidth(),AsistenciaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaMensual.jContentPaneDetalleAsistenciaMensual.getWidth(),AsistenciaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAsistenciaMensual.setVisible(true);
	        this.jInternalFrameDetalleFormAsistenciaMensual.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAsistenciaMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAsistenciaMensual==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAsistenciaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaMensual,false,this);
				} else {
					this.jInternalFrameOrderByAsistenciaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaMensual,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaMensual);
				this.jInternalFrameOrderByAsistenciaMensual.setVisible(false);
				this.jInternalFrameOrderByAsistenciaMensual.setSelected(false);
				
				this.jInternalFrameOrderByAsistenciaMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaMensual"));
				
				this.inicializarActualizarBindingTablaOrderByAsistenciaMensual();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAsistenciaMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAsistenciaMensual==null) {
				
				this.jInternalFrameImportacionAsistenciaMensual=new ImportacionJInternalFrame(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaMensual);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaMensual);
				this.jInternalFrameImportacionAsistenciaMensual.setVisible(false);
				this.jInternalFrameImportacionAsistenciaMensual.setSelected(false);


				this.jInternalFrameImportacionAsistenciaMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaMensual"));
				this.jInternalFrameImportacionAsistenciaMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaMensual"));
				this.jInternalFrameImportacionAsistenciaMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaMensual"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAsistenciaMensual() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAsistenciaMensual==null) {
				this.jInternalFrameReporteDinamicoAsistenciaMensual=new ReporteDinamicoJInternalFrame(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaMensual);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaMensual);
				this.jInternalFrameReporteDinamicoAsistenciaMensual.setVisible(false);
				this.jInternalFrameReporteDinamicoAsistenciaMensual.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaMensual"));
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaMensual"));
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaMensual"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaMensual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAsistenciaMensual() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaMensual);
			
	       	this.jInternalFrameDetalleFormAsistenciaMensual.setVisible(false);
	        this.jInternalFrameDetalleFormAsistenciaMensual.setSelected(false);
			
			//this.jInternalFrameDetalleFormAsistenciaMensual.dispose();
			//this.jInternalFrameDetalleFormAsistenciaMensual=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAsistenciaMensual() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAsistenciaMensual.setVisible(true);
	        this.jInternalFrameReporteDinamicoAsistenciaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAsistenciaMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAsistenciaMensual.setVisible(true);
	        this.jInternalFrameImportacionAsistenciaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAsistenciaMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAsistenciaMensual.setVisible(true);
	        this.jInternalFrameOrderByAsistenciaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAsistenciaMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAsistenciaMensual.setVisible(false);
	        this.jInternalFrameOrderByAsistenciaMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAsistenciaMensual() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAsistenciaMensual.setVisible(false);
	        this.jInternalFrameReporteDinamicoAsistenciaMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAsistenciaMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAsistenciaMensual.setVisible(false);
	        this.jInternalFrameImportacionAsistenciaMensual.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
						TitledBorder titledBorderCargo=(TitledBorder)cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

						titledBorderCargo.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Cargo");


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
						TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAsistenciaMensual(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAsistenciaMensual(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAsistenciaMensual(true);
			//this.isEsNuevoAsistenciaMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAsistenciaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaMensual(false) ;
			
			if(asistenciamensualSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaMensual(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAsistenciaMensualActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAsistenciaMensual(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAsistenciaMensual(true);
			//this.isEsNuevoAsistenciaMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.asistenciamensual.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAsistenciaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAsistenciaMensual(false) ;
			
			if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaMensual(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.asistenciamensualConstantesFunciones.cargarid_empleadoAsistenciaMensual) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAsistenciaMensual(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCargo(List<Cargo> cargosForeignKey)throws Exception{
		TableColumn tableColumnCargo=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDCARGO));
		TableCellEditor tableCellEditorCargo =tableColumnCargo.getCellEditor();

		CargoTableCell cargoTableCellFk=(CargoTableCell)tableCellEditorCargo;

		if(cargoTableCellFk!=null) {
			cargoTableCellFk.setcargosForeignKey(cargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargoTableCellFk.setRowActual(intSelectedRow);
			//cargoTableCellFk.setcargosForeignKeyActual(cargosForeignKey);
		//}


		if(cargoTableCellFk!=null) {
			cargoTableCellFk.RecargarCargosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaMensual(false);
			
			//if(!this.isEsNuevoAsistenciaMensual) {								
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				
			}
			
			if(this.permiteMantenimiento(this.asistenciamensual)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAsistenciaMensual=true;
					this.inicializarActualizarBindingTablaAsistenciaMensual(false);
					this.isEsNuevoAsistenciaMensual=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAsistenciaMensual=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAsistenciaMensual=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaMensual(false);
				
				this.habilitarDeshabilitarControlesAsistenciaMensual(false);
			
												
				
				if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAsistenciaMensual();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAsistenciaMensualActionPerformed(evt,asistenciamensualSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAsistenciaMensual(this.asistenciamensual,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,asistenciamensualSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.asistenciamensual.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				this.asistenciamensual.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				this.asistenciamensual.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.asistenciamensual)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AsistenciaMensualModel) this.jTableDatosAsistenciaMensual.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAsistenciaMensual=true;
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
				this.isEsNuevoAsistenciaMensual=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaMensual(false);
				
				this.habilitarDeshabilitarControlesAsistenciaMensual(false);
				
				
				
				if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAsistenciaMensual();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAsistenciaMensual.getRowCount()>=1) {
				jTableDatosAsistenciaMensual.removeRowSelectionInterval(0, jTableDatosAsistenciaMensual.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAsistenciaMensual(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaMensual(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaMensual(false) ;
			
			this.isEsNuevoAsistenciaMensual=false;
			
			if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAsistenciaMensual();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAsistenciaMensual(false);
				
				//SI ES MANUAL
				if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAsistenciaMensual();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAsistenciaMensual--;			
			//AsistenciaMensual asistenciamensualAux= new AsistenciaMensual();			
			//asistenciamensualAux.setId(this.iIdNuevoAsistenciaMensual);
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAsistenciaMensual();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
			
			this.asistenciamensual.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.asistenciamensualLogic.getAsistenciaMensuals().add(this.asistenciamensualAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.asistenciamensuals.add(this.asistenciamensualAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			
			this.jTableDatosAsistenciaMensual.setRowSelectionInterval(this.getIndiceNuevoAsistenciaMensual(), this.getIndiceNuevoAsistenciaMensual());
			
			int iLastRow =  this.jTableDatosAsistenciaMensual.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAsistenciaMensual.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAsistenciaMensual.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaMensual(false);
			
			//SI ES MANUAL
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaMensual();
			}
			
			//this.abrirFrameTreeAsistenciaMensual();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Asistencia MensualES ?", "MANTENIMIENTO DE Asistencia Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAsistenciaMensual.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAsistenciaMensual();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.asistenciamensualReturnGeneral=asistenciamensualLogic.procesarImportacionAsistenciaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.asistenciamensualParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAsistenciaMensualReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAsistenciaMensual.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAsistenciaMensual.setFileImportacion(this.jInternalFrameImportacionAsistenciaMensual.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAsistenciaMensual.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAsistenciaMensual.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAsistenciaMensual.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAsistenciaMensual.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		

		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AsistenciaMensualBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AsistenciaMensualBaseDesign.jrxml";
			
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
			
			this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDCARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasTrabajo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasAtraso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasAtraso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasAtraso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasAtraso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasFaltas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasFaltas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasFaltas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasFaltas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasPermiso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasPermiso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasPermiso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasPermiso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra25_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra25_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra25_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra25_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra50_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra50_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra50_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra50_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra100_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra100_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra100_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra100_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra150_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra150_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra150_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra150_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra0_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra0_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra0_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra0_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasEnfermo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasEnfermo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasEnfermo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasEnfermo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasMaternidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasMaternidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasMaternidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasMaternidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasVacacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasVacacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasVacacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasVacacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroNoches_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroNoches_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroNoches_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroNoches_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFeriados_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFeriados_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFeriados_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFeriados_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroTrabajo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoria="id_cargo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO:
					sNombreCampoCategoria="horas_trabajo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO:
					sNombreCampoCategoria="horas_atraso";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS:
					sNombreCampoCategoria="horas_faltas";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO:
					sNombreCampoCategoria="horas_permiso";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25:
					sNombreCampoCategoria="horas_extra25";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50:
					sNombreCampoCategoria="horas_extra50";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100:
					sNombreCampoCategoria="horas_extra100";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150:
					sNombreCampoCategoria="horas_extra150";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0:
					sNombreCampoCategoria="horas_extra0";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO:
					sNombreCampoCategoria="horas_enfermo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD:
					sNombreCampoCategoria="horas_maternidad";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION:
					sNombreCampoCategoria="horas_vacacion";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES:
					sNombreCampoCategoria="numero_noches";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS:
					sNombreCampoCategoria="numero_feriados";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO:
					sNombreCampoCategoria="numero_trabajo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoriaValor="id_cargo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO:
					sNombreCampoCategoriaValor="horas_trabajo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO:
					sNombreCampoCategoriaValor="horas_atraso";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS:
					sNombreCampoCategoriaValor="horas_faltas";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO:
					sNombreCampoCategoriaValor="horas_permiso";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25:
					sNombreCampoCategoriaValor="horas_extra25";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50:
					sNombreCampoCategoriaValor="horas_extra50";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100:
					sNombreCampoCategoriaValor="horas_extra100";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150:
					sNombreCampoCategoriaValor="horas_extra150";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0:
					sNombreCampoCategoriaValor="horas_extra0";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO:
					sNombreCampoCategoriaValor="horas_enfermo";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD:
					sNombreCampoCategoriaValor="horas_maternidad";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION:
					sNombreCampoCategoriaValor="horas_vacacion";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES:
					sNombreCampoCategoriaValor="numero_noches";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS:
					sNombreCampoCategoriaValor="numero_feriados";
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO:
					sNombreCampoCategoriaValor="numero_trabajo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDCARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cargo");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_trabajo");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Atraso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_atraso");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Faltas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_faltas");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Permiso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_permiso");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra25",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra25");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra50",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra50");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra100",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra100");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra150",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra150");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra0",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra0");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Enfermo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_enfermo");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Maternidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_maternidad");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Vacacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_vacacion");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Noches",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_noches");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Feriados",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_feriados");
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_trabajo");
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
	
	public void jButtonGenerarExcelReporteDinamicoAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AsistenciaMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getcargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_trabajo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_atraso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_faltas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_permiso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_extra25());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_extra50());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_extra100());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_extra150());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_extra0());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_enfermo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_maternidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.gethoras_vacacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getnumero_dias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getnumero_noches());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getnumero_feriados());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO);
					iRow++;

					for(AsistenciaMensual asistenciamensual:asistenciamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciamensual.getnumero_trabajo());
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
			//	this.getFilaCabeceraExportarExcelAsistenciaMensual(row);				
			//	iRow++;
			//}				
			
			//for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAsistenciaMensual(asistenciamensualAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
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
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaMensual(false);
			
			//SI ES MANUAL
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaMensual();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaMensual(false);
			
			//SI ES MANUAL
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaMensual();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaMensual(false);
			
			//SI ES MANUAL
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaMensual();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAsistenciaMensual() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAsistenciaMensual.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAsistenciaMensual.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAsistenciaMensual.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAsistenciaMensual.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAsistenciaMensual.setMinimumSize(dimensionMinimum);
		this.jTableDatosAsistenciaMensual.setMaximumSize(dimensionMaximum);
		this.jTableDatosAsistenciaMensual.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAsistenciaMensual(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAsistenciaMensual(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAsistenciaMensual(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAsistenciaMensual(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAsistenciaMensual(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAsistenciaMensual(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaMensual(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaMensual(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAsistenciaMensual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAsistenciaMensual();
		
		this.inicializarActualizarBindingBotonesManualAsistenciaMensual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaMensual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaMensual() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaMensual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaMensual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAsistenciaMensual.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAsistenciaMensual.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAsistenciaMensual.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionNuevoAsistenciaMensual.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionSinCerrarAsistenciaMensual.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionSinMensajeAsistenciaMensual.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAsistenciaMensual.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAsistenciaMensual.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAsistenciaMensual.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionNuevoAsistenciaMensual.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionSinCerrarAsistenciaMensual.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAsistenciaMensual.jCheckBoxPostAccionSinMensajeAsistenciaMensual.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAsistenciaMensual.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAsistenciaMensual.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAsistenciaMensual.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAsistenciaMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAsistenciaMensual.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAsistenciaMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAsistenciaMensual.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAsistenciaMensual.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAsistenciaMensual.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAsistenciaMensual(Boolean esInicializar) throws Exception {
		try	{	
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaMensual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaMensual() throws Exception {
		try	{
			if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaMensual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaMensual() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaMensual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAsistenciaMensual.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAsistenciaMensual.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAsistenciaMensual.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAsistenciaMensual.addItem(reporte);
			}
			
			
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAsistenciaMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAsistenciaMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAsistenciaMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAsistenciaMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAsistenciaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAsistenciaMensual.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAsistenciaMensual.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaMensual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaMensual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
				
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AsistenciaMensualConstantesFunciones.getTiposSeleccionarAsistenciaMensual(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AsistenciaMensualConstantesFunciones.getTiposSeleccionarAsistenciaMensual(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AsistenciaMensualConstantesFunciones.getTiposSeleccionarAsistenciaMensual(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAsistenciaMensual.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAsistenciaMensual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioAsistenciaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.getSelectedItem()!=null){this.id_cargoFK_IdCargo=((Cargo)this.jComboBoxid_cargoFK_IdCargoAsistenciaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesAsistenciaMensual.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesAsistenciaMensual.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAsistenciaMensual(Boolean esInicializar) throws Exception {				
		if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaMensual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAsistenciaMensual() throws Exception {
		this.inicializarActualizarBindingTablaAsistenciaMensual(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAsistenciaMensual() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAsistenciaMensualOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensualOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAsistenciaMensual(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=asistenciamensualLogic.getAsistenciaMensuals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=asistenciamensuals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAsistenciaMensual.setModel(new AsistenciaMensualModel(this.asistenciamensualLogic.getAsistenciaMensuals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAsistenciaMensual.setModel(new AsistenciaMensualModel(this.asistenciamensuals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAsistenciaMensual!=null && this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAsistenciaMensual();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,asistenciamensualConstantesFunciones.resaltarSeleccionarAsistenciaMensual,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,asistenciamensualConstantesFunciones.resaltarSeleccionarAsistenciaMensual,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_ID));

		if(this.asistenciamensualConstantesFunciones.mostraridAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltaridAsistenciaMensual,this.asistenciamensualConstantesFunciones.activaridAsistenciaMensual,iSizeTabla,this,true,"idAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltaridAsistenciaMensual,this.asistenciamensualConstantesFunciones.activaridAsistenciaMensual,this,true,"idAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA));

		if(this.asistenciamensualConstantesFunciones.mostrarid_empresaAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_empresaAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_empresaAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_empresaAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_empresaAsistenciaMensual,false,"id_empresaAsistenciaMensual","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.asistenciamensualConstantesFunciones.mostrarid_empleadoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_empleadoAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_empleadoAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_empleadoAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_empleadoAsistenciaMensual,true,"id_empleadoAsistenciaMensual","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDCARGO));

		if(this.asistenciamensualConstantesFunciones.mostrarid_cargoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDCARGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CargoTableCell(this.cargosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_cargoAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_cargoAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new CargoTableCell(this.cargosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_cargoAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_cargoAsistenciaMensual,true,"id_cargoAsistenciaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.asistenciamensualConstantesFunciones.mostrarid_estructuraAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_estructuraAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_estructuraAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_estructuraAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_estructuraAsistenciaMensual,true,"id_estructuraAsistenciaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDANIO));

		if(this.asistenciamensualConstantesFunciones.mostrarid_anioAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_anioAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_anioAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_anioAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_anioAsistenciaMensual,true,"id_anioAsistenciaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_IDMES));

		if(this.asistenciamensualConstantesFunciones.mostrarid_mesAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_mesAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_mesAsistenciaMensual,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.asistenciamensualConstantesFunciones.resaltarid_mesAsistenciaMensual,this,this.asistenciamensualConstantesFunciones.activarid_mesAsistenciaMensual,true,"id_mesAsistenciaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_FECHA));

		if(this.asistenciamensualConstantesFunciones.mostrarfechaAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.asistenciamensualConstantesFunciones.resaltarfechaAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarfechaAsistenciaMensual,iSizeTabla,this,true,"fechaAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarfechaAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarfechaAsistenciaMensual,this,true,"fechaAsistenciaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_trabajoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_trabajoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_trabajoAsistenciaMensual,iSizeTabla,this,true,"horas_trabajoAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_trabajoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_trabajoAsistenciaMensual,this,true,"horas_trabajoAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_atrasoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_atrasoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_atrasoAsistenciaMensual,iSizeTabla,this,true,"horas_atrasoAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_atrasoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_atrasoAsistenciaMensual,this,true,"horas_atrasoAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_faltasAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_faltasAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_faltasAsistenciaMensual,iSizeTabla,this,true,"horas_faltasAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_faltasAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_faltasAsistenciaMensual,this,true,"horas_faltasAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_permisoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_permisoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_permisoAsistenciaMensual,iSizeTabla,this,true,"horas_permisoAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_permisoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_permisoAsistenciaMensual,this,true,"horas_permisoAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_extra25AsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra25AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra25AsistenciaMensual,iSizeTabla,this,true,"horas_extra25AsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra25AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra25AsistenciaMensual,this,true,"horas_extra25AsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_extra50AsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra50AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra50AsistenciaMensual,iSizeTabla,this,true,"horas_extra50AsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra50AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra50AsistenciaMensual,this,true,"horas_extra50AsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_extra100AsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra100AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra100AsistenciaMensual,iSizeTabla,this,true,"horas_extra100AsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra100AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra100AsistenciaMensual,this,true,"horas_extra100AsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_extra150AsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra150AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra150AsistenciaMensual,iSizeTabla,this,true,"horas_extra150AsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra150AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra150AsistenciaMensual,this,true,"horas_extra150AsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_extra0AsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra0AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra0AsistenciaMensual,iSizeTabla,this,true,"horas_extra0AsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_extra0AsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_extra0AsistenciaMensual,this,true,"horas_extra0AsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_enfermoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_enfermoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_enfermoAsistenciaMensual,iSizeTabla,this,true,"horas_enfermoAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_enfermoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_enfermoAsistenciaMensual,this,true,"horas_enfermoAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_maternidadAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_maternidadAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_maternidadAsistenciaMensual,iSizeTabla,this,true,"horas_maternidadAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_maternidadAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_maternidadAsistenciaMensual,this,true,"horas_maternidadAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION));

		if(this.asistenciamensualConstantesFunciones.mostrarhoras_vacacionAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_vacacionAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_vacacionAsistenciaMensual,iSizeTabla,this,true,"horas_vacacionAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarhoras_vacacionAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarhoras_vacacionAsistenciaMensual,this,true,"horas_vacacionAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS));

		if(this.asistenciamensualConstantesFunciones.mostrarnumero_diasAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_diasAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_diasAsistenciaMensual,iSizeTabla,this,true,"numero_diasAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_diasAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_diasAsistenciaMensual,this,true,"numero_diasAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES));

		if(this.asistenciamensualConstantesFunciones.mostrarnumero_nochesAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_nochesAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_nochesAsistenciaMensual,iSizeTabla,this,true,"numero_nochesAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_nochesAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_nochesAsistenciaMensual,this,true,"numero_nochesAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS));

		if(this.asistenciamensualConstantesFunciones.mostrarnumero_feriadosAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_feriadosAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_feriadosAsistenciaMensual,iSizeTabla,this,true,"numero_feriadosAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_feriadosAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_feriadosAsistenciaMensual,this,true,"numero_feriadosAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO));

		if(this.asistenciamensualConstantesFunciones.mostrarnumero_trabajoAsistenciaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_trabajoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_trabajoAsistenciaMensual,iSizeTabla,this,true,"numero_trabajoAsistenciaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciamensualConstantesFunciones.resaltarnumero_trabajoAsistenciaMensual,this.asistenciamensualConstantesFunciones.activarnumero_trabajoAsistenciaMensual,this,true,"numero_trabajoAsistenciaMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaMensual.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaMensual.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.asistenciamensualSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAsistenciaMensual.addColumn(tableColumn);
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
			
			this.jTableDatosAsistenciaMensual.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAsistenciaMensual.moveColumn(this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAsistenciaMensual.moveColumn(this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAsistenciaMensual.moveColumn(this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAsistenciaMensual.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAsistenciaMensual.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAsistenciaMensual,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAsistenciaMensual.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAsistenciaMensual.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAsistenciaMensual.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=asistenciamensualLogic.getAsistenciaMensuals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=asistenciamensuals.size()-1;
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
		//this.jTableDatosAsistenciaMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAsistenciaMensual();
			
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
				
				//this.isEsNuevoAsistenciaMensual=false;
					
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
				if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaMensual==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.asistenciamensual.getsType().equals("DUPLICADO")
				   || this.asistenciamensual.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAsistenciaMensual=true;
				
				} else {
					this.isEsNuevoAsistenciaMensual=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					if(this.asistenciamensual.getId()>=0 && !this.asistenciamensual.getIsNew()) {						
						this.isEsNuevoAsistenciaMensual=false;
						
					} else {
						this.isEsNuevoAsistenciaMensual=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAsistenciaMensual(esRelaciones);						
				
				this.seleccionarAsistenciaMensual(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.asistenciamensual.getId()<0) {
					this.isEsNuevoAsistenciaMensual=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAsistenciaMensual(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAsistenciaMensual(evt,rowIndex);
				}	
				
				if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AsistenciaMensual: " + this.dDif); 
					}
				}								
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAsistenciaMensual(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.asistenciamensual)) {
					if(this.asistenciamensual.getId()>0) {
						this.asistenciamensual.setIsDeleted(true);
						
						this.asistenciamensualsEliminados.add(this.asistenciamensual);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciamensualLogic.getAsistenciaMensuals().remove(this.asistenciamensual);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciamensuals.remove(this.asistenciamensual);				
					}
					
					
					((AsistenciaMensualModel) this.jTableDatosAsistenciaMensual.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaMensual(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAsistenciaMensual(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAsistenciaMensual) {
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaMensual.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensual);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.asistenciamensualConstantesFunciones.cargarid_empresaAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_empresaAsistenciaMensual) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.asistenciamensual.getid_empresa());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(asistenciamensual.getEmpresa()!=null) {
							this.empresasForeignKey.add(asistenciamensual.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.asistenciamensual.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.asistenciamensualConstantesFunciones.cargarid_empleadoAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_empleadoAsistenciaMensual) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.asistenciamensual.getid_empleado());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(asistenciamensual.getEmpleado()!=null) {
							this.empleadosForeignKey.add(asistenciamensual.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.asistenciamensual.getid_empleado(),false,"Formulario");

					//Cargo
					if(!this.asistenciamensualConstantesFunciones.cargarid_cargoAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_cargoAsistenciaMensual) {
						//this.cargarCombosCargosForeignKeyLista(" where id="+this.asistenciamensual.getid_cargo());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.cargosForeignKey=new ArrayList<Cargo>();

						if(asistenciamensual.getCargo()!=null) {
							this.cargosForeignKey.add(asistenciamensual.getCargo());
						}

						this.addItemDefectoCombosForeignKeyCargo();
						this.cargarCombosFrameCargosForeignKey("Todos");
					}
					this.setActualCargoForeignKey(this.asistenciamensual.getid_cargo(),false,"Formulario");

					//Estructura
					if(!this.asistenciamensualConstantesFunciones.cargarid_estructuraAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_estructuraAsistenciaMensual) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.asistenciamensual.getid_estructura());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(asistenciamensual.getEstructura()!=null) {
							this.estructurasForeignKey.add(asistenciamensual.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.asistenciamensual.getid_estructura(),false,"Formulario");

					//Anio
					if(!this.asistenciamensualConstantesFunciones.cargarid_anioAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_anioAsistenciaMensual) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.asistenciamensual.getid_anio());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(asistenciamensual.getAnio()!=null) {
							this.aniosForeignKey.add(asistenciamensual.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.asistenciamensual.getid_anio(),false,"Formulario");

					//Mes
					if(!this.asistenciamensualConstantesFunciones.cargarid_mesAsistenciaMensual || this.asistenciamensualConstantesFunciones.event_dependid_mesAsistenciaMensual) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.asistenciamensual.getid_mes());
									//this.inicializarActualizarBindingAsistenciaMensual(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(asistenciamensual.getMes()!=null) {
							this.messForeignKey.add(asistenciamensual.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.asistenciamensual.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAsistenciaMensual("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAsistenciaMensual(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaMensual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaMensual(AsistenciaMensual asistenciamensual) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAsistenciaMensual(asistenciamensual,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaMensual(AsistenciaMensual asistenciamensual,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAsistenciaMensual(asistenciamensual);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAsistenciaMensual(asistenciamensual,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaMensual(asistenciamensual);
	}
	
	public void setVariablesObjetoActualToFormularioAsistenciaMensual(AsistenciaMensual asistenciamensual) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setText(asistenciamensual.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setDate(asistenciamensual.getfecha());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setText(asistenciamensual.gethoras_trabajo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setText(asistenciamensual.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setText(asistenciamensual.gethoras_faltas().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setText(asistenciamensual.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setText(asistenciamensual.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setText(asistenciamensual.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setText(asistenciamensual.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setText(asistenciamensual.gethoras_extra150().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setText(asistenciamensual.gethoras_extra0().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setText(asistenciamensual.gethoras_enfermo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setText(asistenciamensual.gethoras_maternidad().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setText(asistenciamensual.gethoras_vacacion().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setText(asistenciamensual.getnumero_dias().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setText(asistenciamensual.getnumero_noches().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setText(asistenciamensual.getnumero_feriados().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setText(asistenciamensual.getnumero_trabajo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AsistenciaMensual asistenciamensualLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,asistenciamensualLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AsistenciaMensual asistenciamensualLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				asistenciamensualLocal=this.asistenciamensual;
			} else {
				asistenciamensualLocal=this.asistenciamensualAnterior;
			}
		}
		
		if(this.permiteMantenimiento(asistenciamensualLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAsistenciaMensual(asistenciamensualLocal,true);
					
					if(asistenciamensualSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(asistenciamensualLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(asistenciamensualLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAsistenciaMensual(AsistenciaMensual asistenciamensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaMensual(asistenciamensual,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(asistenciamensual);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaMensual(AsistenciaMensual asistenciamensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaMensual(asistenciamensual,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaMensual(AsistenciaMensual asistenciamensual,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.getText()==null || this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.getText()=="" || this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.getText()=="Id") {
				this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setText("0");
			}

			if(conColumnasBase) {asistenciamensual.setId(Long.parseLong(this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelIdAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.setfecha(this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelfechaAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_trabajo(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_trabajoAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_atraso(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_atrasoAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_faltas(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_faltasAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_permiso(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_permisoAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_extra25(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra25AsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_extra50(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra50AsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_extra100(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra100AsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_extra150(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra150AsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_extra0(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_extra0AsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_enfermo(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_enfermoAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_maternidad(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_maternidadAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.sethoras_vacacion(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelhoras_vacacionAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.setnumero_dias(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_diasAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.setnumero_noches(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_nochesAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.setnumero_feriados(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_feriadosAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciamensual.setnumero_trabajo(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaMensual.jLabelnumero_trabajoAsistenciaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaMensual(AsistenciaMensual asistenciamensualBean,AsistenciaMensual asistenciamensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAsistenciaMensual(AsistenciaMensual asistenciamensualOrigen,AsistenciaMensual asistenciamensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciamensualOrigen.getId()!=null && !asistenciamensualOrigen.getId().equals(0L))) {asistenciamensual.setId(asistenciamensualOrigen.getId());}}
			if(conDefault || (!conDefault && asistenciamensualOrigen.getfecha()!=null && !asistenciamensualOrigen.getfecha().equals(new Date()))) {asistenciamensual.setfecha(asistenciamensualOrigen.getfecha());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_trabajo()!=null && !asistenciamensualOrigen.gethoras_trabajo().equals(0.0))) {asistenciamensual.sethoras_trabajo(asistenciamensualOrigen.gethoras_trabajo());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_atraso()!=null && !asistenciamensualOrigen.gethoras_atraso().equals(0.0))) {asistenciamensual.sethoras_atraso(asistenciamensualOrigen.gethoras_atraso());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_faltas()!=null && !asistenciamensualOrigen.gethoras_faltas().equals(0.0))) {asistenciamensual.sethoras_faltas(asistenciamensualOrigen.gethoras_faltas());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_permiso()!=null && !asistenciamensualOrigen.gethoras_permiso().equals(0.0))) {asistenciamensual.sethoras_permiso(asistenciamensualOrigen.gethoras_permiso());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_extra25()!=null && !asistenciamensualOrigen.gethoras_extra25().equals(0.0))) {asistenciamensual.sethoras_extra25(asistenciamensualOrigen.gethoras_extra25());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_extra50()!=null && !asistenciamensualOrigen.gethoras_extra50().equals(0.0))) {asistenciamensual.sethoras_extra50(asistenciamensualOrigen.gethoras_extra50());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_extra100()!=null && !asistenciamensualOrigen.gethoras_extra100().equals(0.0))) {asistenciamensual.sethoras_extra100(asistenciamensualOrigen.gethoras_extra100());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_extra150()!=null && !asistenciamensualOrigen.gethoras_extra150().equals(0.0))) {asistenciamensual.sethoras_extra150(asistenciamensualOrigen.gethoras_extra150());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_extra0()!=null && !asistenciamensualOrigen.gethoras_extra0().equals(0.0))) {asistenciamensual.sethoras_extra0(asistenciamensualOrigen.gethoras_extra0());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_enfermo()!=null && !asistenciamensualOrigen.gethoras_enfermo().equals(0.0))) {asistenciamensual.sethoras_enfermo(asistenciamensualOrigen.gethoras_enfermo());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_maternidad()!=null && !asistenciamensualOrigen.gethoras_maternidad().equals(0.0))) {asistenciamensual.sethoras_maternidad(asistenciamensualOrigen.gethoras_maternidad());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.gethoras_vacacion()!=null && !asistenciamensualOrigen.gethoras_vacacion().equals(0.0))) {asistenciamensual.sethoras_vacacion(asistenciamensualOrigen.gethoras_vacacion());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.getnumero_dias()!=null && !asistenciamensualOrigen.getnumero_dias().equals(0.0))) {asistenciamensual.setnumero_dias(asistenciamensualOrigen.getnumero_dias());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.getnumero_noches()!=null && !asistenciamensualOrigen.getnumero_noches().equals(0.0))) {asistenciamensual.setnumero_noches(asistenciamensualOrigen.getnumero_noches());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.getnumero_feriados()!=null && !asistenciamensualOrigen.getnumero_feriados().equals(0.0))) {asistenciamensual.setnumero_feriados(asistenciamensualOrigen.getnumero_feriados());}
			if(conDefault || (!conDefault && asistenciamensualOrigen.getnumero_trabajo()!=null && !asistenciamensualOrigen.getnumero_trabajo().equals(0.0))) {asistenciamensual.setnumero_trabajo(asistenciamensualOrigen.getnumero_trabajo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaMensual(AsistenciaMensual asistenciamensual) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setText(asistenciamensual.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setDate(asistenciamensual.getfecha());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setText(asistenciamensual.gethoras_trabajo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setText(asistenciamensual.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setText(asistenciamensual.gethoras_faltas().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setText(asistenciamensual.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setText(asistenciamensual.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setText(asistenciamensual.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setText(asistenciamensual.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setText(asistenciamensual.gethoras_extra150().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setText(asistenciamensual.gethoras_extra0().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setText(asistenciamensual.gethoras_enfermo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setText(asistenciamensual.gethoras_maternidad().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setText(asistenciamensual.gethoras_vacacion().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setText(asistenciamensual.getnumero_dias().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setText(asistenciamensual.getnumero_noches().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setText(asistenciamensual.getnumero_feriados().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setText(asistenciamensual.getnumero_trabajo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaMensual(AsistenciaMensualBean asistenciamensualBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setText(asistenciamensualBean.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setDate(asistenciamensualBean.getfecha());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setText(asistenciamensualBean.gethoras_trabajo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setText(asistenciamensualBean.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setText(asistenciamensualBean.gethoras_faltas().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setText(asistenciamensualBean.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setText(asistenciamensualBean.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setText(asistenciamensualBean.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setText(asistenciamensualBean.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setText(asistenciamensualBean.gethoras_extra150().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setText(asistenciamensualBean.gethoras_extra0().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setText(asistenciamensualBean.gethoras_enfermo().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setText(asistenciamensualBean.gethoras_maternidad().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setText(asistenciamensualBean.gethoras_vacacion().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setText(asistenciamensualBean.getnumero_dias().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setText(asistenciamensualBean.getnumero_noches().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setText(asistenciamensualBean.getnumero_feriados().toString());
			this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setText(asistenciamensualBean.getnumero_trabajo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAsistenciaMensual(AsistenciaMensualParameterReturnGeneral asistenciamensualReturnGeneral,AsistenciaMensualBean asistenciamensualBean,Boolean conDefault) throws Exception { 
		try {
			AsistenciaMensual asistenciamensualLocal=new AsistenciaMensual();
			
			asistenciamensualLocal=asistenciamensualReturnGeneral.getAsistenciaMensual();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciamensualLocal.getId()!=null && !asistenciamensualLocal.getId().equals(0L))) {asistenciamensualBean.setId(asistenciamensualLocal.getId());}}
			if(conDefault || (!conDefault && asistenciamensualLocal.getfecha()!=null && !asistenciamensualLocal.getfecha().equals(new Date()))) {asistenciamensualBean.setfecha(asistenciamensualLocal.getfecha());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_trabajo()!=null && !asistenciamensualLocal.gethoras_trabajo().equals(0.0))) {asistenciamensualBean.sethoras_trabajo(asistenciamensualLocal.gethoras_trabajo());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_atraso()!=null && !asistenciamensualLocal.gethoras_atraso().equals(0.0))) {asistenciamensualBean.sethoras_atraso(asistenciamensualLocal.gethoras_atraso());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_faltas()!=null && !asistenciamensualLocal.gethoras_faltas().equals(0.0))) {asistenciamensualBean.sethoras_faltas(asistenciamensualLocal.gethoras_faltas());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_permiso()!=null && !asistenciamensualLocal.gethoras_permiso().equals(0.0))) {asistenciamensualBean.sethoras_permiso(asistenciamensualLocal.gethoras_permiso());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_extra25()!=null && !asistenciamensualLocal.gethoras_extra25().equals(0.0))) {asistenciamensualBean.sethoras_extra25(asistenciamensualLocal.gethoras_extra25());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_extra50()!=null && !asistenciamensualLocal.gethoras_extra50().equals(0.0))) {asistenciamensualBean.sethoras_extra50(asistenciamensualLocal.gethoras_extra50());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_extra100()!=null && !asistenciamensualLocal.gethoras_extra100().equals(0.0))) {asistenciamensualBean.sethoras_extra100(asistenciamensualLocal.gethoras_extra100());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_extra150()!=null && !asistenciamensualLocal.gethoras_extra150().equals(0.0))) {asistenciamensualBean.sethoras_extra150(asistenciamensualLocal.gethoras_extra150());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_extra0()!=null && !asistenciamensualLocal.gethoras_extra0().equals(0.0))) {asistenciamensualBean.sethoras_extra0(asistenciamensualLocal.gethoras_extra0());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_enfermo()!=null && !asistenciamensualLocal.gethoras_enfermo().equals(0.0))) {asistenciamensualBean.sethoras_enfermo(asistenciamensualLocal.gethoras_enfermo());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_maternidad()!=null && !asistenciamensualLocal.gethoras_maternidad().equals(0.0))) {asistenciamensualBean.sethoras_maternidad(asistenciamensualLocal.gethoras_maternidad());}
			if(conDefault || (!conDefault && asistenciamensualLocal.gethoras_vacacion()!=null && !asistenciamensualLocal.gethoras_vacacion().equals(0.0))) {asistenciamensualBean.sethoras_vacacion(asistenciamensualLocal.gethoras_vacacion());}
			if(conDefault || (!conDefault && asistenciamensualLocal.getnumero_dias()!=null && !asistenciamensualLocal.getnumero_dias().equals(0.0))) {asistenciamensualBean.setnumero_dias(asistenciamensualLocal.getnumero_dias());}
			if(conDefault || (!conDefault && asistenciamensualLocal.getnumero_noches()!=null && !asistenciamensualLocal.getnumero_noches().equals(0.0))) {asistenciamensualBean.setnumero_noches(asistenciamensualLocal.getnumero_noches());}
			if(conDefault || (!conDefault && asistenciamensualLocal.getnumero_feriados()!=null && !asistenciamensualLocal.getnumero_feriados().equals(0.0))) {asistenciamensualBean.setnumero_feriados(asistenciamensualLocal.getnumero_feriados());}
			if(conDefault || (!conDefault && asistenciamensualLocal.getnumero_trabajo()!=null && !asistenciamensualLocal.getnumero_trabajo().equals(0.0))) {asistenciamensualBean.setnumero_trabajo(asistenciamensualLocal.getnumero_trabajo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAsistenciaMensualGenerico(Long idAsistenciaMensualSeleccionado,JComboBox jComboBoxAsistenciaMensual,List<AsistenciaMensual> asistenciamensualsLocal)throws Exception {
		try {
			AsistenciaMensual  asistenciamensualTemp=null;

			for(AsistenciaMensual asistenciamensualAux:asistenciamensualsLocal) {
				if(asistenciamensualAux.getId()!=null && asistenciamensualAux.getId().equals(idAsistenciaMensualSeleccionado)) {
					asistenciamensualTemp=asistenciamensualAux;
					break;
				}
			}

			jComboBoxAsistenciaMensual.setSelectedItem(asistenciamensualTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAsistenciaMensualGenerico(JComboBox jComboBoxAsistenciaMensual,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaMensual.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAsistenciaMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaMensual.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAsistenciaMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciamensual=(AsistenciaMensual) asistenciamensualLogic.getAsistenciaMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciamensual =(AsistenciaMensual) asistenciamensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Cargo")) {
			//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getcargo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getcargo_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!asistenciamensual.getIsNew() && !asistenciamensual.getIsChanged() && !asistenciamensual.getIsDeleted()) {
				sDescripcion=asistenciamensual.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciamensual.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AsistenciaMensual asistenciamensualRow=new AsistenciaMensual();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciamensualRow=(AsistenciaMensual) asistenciamensualLogic.getAsistenciaMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciamensualRow=(AsistenciaMensual) asistenciamensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAsistenciaMensual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));			
			this.jButtonDuplicarAsistenciaMensual.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaMensual && this.isPermisoDuplicarAsistenciaMensual));			
			this.jButtonCopiarAsistenciaMensual.setVisible((this.isVisibilidadCeldaCopiarAsistenciaMensual && this.isPermisoCopiarAsistenciaMensual));
			this.jButtonVerFormAsistenciaMensual.setVisible((this.isVisibilidadCeldaVerFormAsistenciaMensual && this.isPermisoVerFormAsistenciaMensual));
			
			this.jButtonAbrirOrderByAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));			
			
			this.jButtonNuevoRelacionesAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));			
			this.jButtonNuevoGuardarCambiosAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarAsistenciaMensual.setVisible((this.isVisibilidadCeldaModificarAsistenciaMensual && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.setVisible((this.isVisibilidadCeldaActualizarAsistenciaMensual && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.setVisible((this.isVisibilidadCeldaEliminarAsistenciaMensual && this.isPermisoEliminarAsistenciaMensual));
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.setVisible(this.isVisibilidadCeldaCancelarAsistenciaMensual);							
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));			
			
			}
						
			this.jButtonGuardarCambiosTablaAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));						
			this.jButtonDuplicarToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaMensual && this.isPermisoDuplicarAsistenciaMensual));						
			this.jButtonCopiarToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaCopiarAsistenciaMensual && this.isPermisoCopiarAsistenciaMensual));			
			this.jButtonVerFormToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaVerFormAsistenciaMensual && this.isPermisoVerFormAsistenciaMensual));			
			this.jButtonAbrirOrderByToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));
			this.jButtonNuevoRelacionesToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));			
			this.jButtonNuevoGuardarCambiosToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));			
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaModificarAsistenciaMensual && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaActualizarAsistenciaMensual  && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaEliminarAsistenciaMensual && this.isPermisoEliminarAsistenciaMensual));
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarToolBarAsistenciaMensual.setVisible(this.isVisibilidadCeldaCancelarAsistenciaMensual);				
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));			
			this.jMenuItemDuplicarAsistenciaMensual.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaMensual && this.isPermisoDuplicarAsistenciaMensual));			
			this.jMenuItemCopiarAsistenciaMensual.setVisible((this.isVisibilidadCeldaCopiarAsistenciaMensual && this.isPermisoCopiarAsistenciaMensual));			
			this.jMenuItemVerFormAsistenciaMensual.setVisible((this.isVisibilidadCeldaVerFormAsistenciaMensual && this.isPermisoVerFormAsistenciaMensual));			
			this.jMenuItemAbrirOrderByAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));			
			//this.jMenuItemMostrarOcultarAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));
			this.jMenuItemDetalleAbrirOrderByAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));			
			//this.jMenuItemDetalleMostrarOcultarAsistenciaMensual.setVisible((this.isVisibilidadCeldaOrdenAsistenciaMensual && this.isPermisoOrdenAsistenciaMensual));			
			this.jMenuItemNuevoRelacionesAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual));			
			this.jMenuItemNuevoGuardarCambiosAsistenciaMensual.setVisible((this.isVisibilidadCeldaNuevoAsistenciaMensual && this.isPermisoNuevoAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));									
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemModificarAsistenciaMensual.setVisible((this.isVisibilidadCeldaModificarAsistenciaMensual && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemActualizarAsistenciaMensual.setVisible((this.isVisibilidadCeldaActualizarAsistenciaMensual && this.isPermisoActualizarAsistenciaMensual));	
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemEliminarAsistenciaMensual.setVisible((this.isVisibilidadCeldaEliminarAsistenciaMensual && this.isPermisoEliminarAsistenciaMensual));
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemCancelarAsistenciaMensual.setVisible(this.isVisibilidadCeldaCancelarAsistenciaMensual);				
			}
			
			this.jMenuItemGuardarCambiosAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));						
			this.jMenuItemGuardarCambiosTablaAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=this.jButtonNuevoAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaDuplicarAsistenciaMensual=this.jButtonDuplicarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaCopiarAsistenciaMensual=this.jButtonCopiarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaVerFormAsistenciaMensual=this.jButtonVerFormAsistenciaMensual.isVisible();
			
			this.isVisibilidadCeldaOrdenAsistenciaMensual=this.jButtonAbrirOrderByAsistenciaMensual.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=this.jButtonNuevoRelacionesAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaModificarAsistenciaMensual=this.jButtonModificarAsistenciaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.isVisibilidadCeldaActualizarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaGuardarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=this.jButtonGuardarCambiosTablaAsistenciaMensual.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAsistenciaMensual=this.jButtonNuevoToolBarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=this.jButtonNuevoRelacionesToolBarAsistenciaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.isVisibilidadCeldaModificarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarToolBarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarToolBarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarToolBarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarToolBarAsistenciaMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaMensual=this.jButtonGuardarCambiosToolBarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAsistenciaMensual=this.jMenuItemNuevoAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=this.jMenuItemNuevoRelacionesAsistenciaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.isVisibilidadCeldaModificarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemModificarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemActualizarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemEliminarAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaMensual=this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemCancelarAsistenciaMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaMensual=this.jMenuItemGuardarCambiosAsistenciaMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=this.jMenuItemGuardarCambiosTablaAsistenciaMensual.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAsistenciaMensual(Boolean esInicializar) {
		if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {			
			if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
				//if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaMensual();
			}
			
			this.inicializarActualizarBindingBotonesManualAsistenciaMensual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAsistenciaMensual() {
		this.jButtonNuevoAsistenciaMensual.setVisible(this.isPermisoNuevoAsistenciaMensual);			
		this.jButtonDuplicarAsistenciaMensual.setVisible(this.isPermisoDuplicarAsistenciaMensual);			
		this.jButtonCopiarAsistenciaMensual.setVisible(this.isPermisoCopiarAsistenciaMensual);			
		this.jButtonVerFormAsistenciaMensual.setVisible(this.isPermisoVerFormAsistenciaMensual);			
		
		this.jButtonAbrirOrderByAsistenciaMensual.setVisible(this.isPermisoOrdenAsistenciaMensual);					
		
		this.jButtonNuevoRelacionesAsistenciaMensual.setVisible(this.isPermisoNuevoAsistenciaMensual);			
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarAsistenciaMensual.setVisible(this.isPermisoActualizarAsistenciaMensual);	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.setVisible(this.isPermisoActualizarAsistenciaMensual);	
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.setVisible(this.isPermisoEliminarAsistenciaMensual);
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.setVisible(this.isVisibilidadCeldaCancelarAsistenciaMensual);						
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.setVisible(this.isPermisoGuardarCambiosAsistenciaMensual);							
		}
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.setVisible(this.isPermisoActualizarAsistenciaMensual);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaMensual() {
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarAsistenciaMensual.setVisible(this.isPermisoActualizarAsistenciaMensual);	
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.setVisible(this.isPermisoActualizarAsistenciaMensual);	
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.setVisible(this.isPermisoEliminarAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.setVisible(this.isVisibilidadCeldaCancelarAsistenciaMensual);							
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.setVisible((this.isVisibilidadCeldaGuardarAsistenciaMensual && this.isPermisoGuardarCambiosAsistenciaMensual));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAsistenciaMensual() {
		if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAsistenciaMensual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAsistenciaMensual() {
	}
	
	public void jTableDatosAsistenciaMensualListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAsistenciaMensual(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.asistenciamensual.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.asistenciamensual.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAsistenciaMensualActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderAsistenciaMensual=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosAsistenciaMensual.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.asistenciamensual.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargoAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargo=true;

			idTienePermisocargo=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(CargoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_cargo()!=null) {
					this.cargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargoBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_cargo());
					this.cargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo();
				}

				JInternalFrameBase jinternalFrame =this.cargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBordercargo=(TitledBorder)this.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

				titledBordercargo.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Cargo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo = "+this.asistenciamensual.getid_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.asistenciamensual.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.asistenciamensual.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesAsistenciaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebAsistenciaMensual(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.asistenciamensualLogic.getConnexion());

				if(this.asistenciamensual.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.asistenciamensual.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaMensual=(TitledBorder)this.jScrollPanelDatosAsistenciaMensual.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderAsistenciaMensual.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.asistenciamensual.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.asistenciamensual.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_trabajoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_trabajo = "+this.asistenciamensual.gethoras_trabajo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_atrasoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_atraso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_atraso = "+this.asistenciamensual.gethoras_atraso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_faltasAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_faltas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_faltas = "+this.asistenciamensual.gethoras_faltas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_permisoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_permiso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_permiso = "+this.asistenciamensual.gethoras_permiso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra25AsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_extra25()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra25 = "+this.asistenciamensual.gethoras_extra25().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra50AsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_extra50()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra50 = "+this.asistenciamensual.gethoras_extra50().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra100AsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_extra100()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra100 = "+this.asistenciamensual.gethoras_extra100().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra150AsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_extra150()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra150 = "+this.asistenciamensual.gethoras_extra150().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra0AsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_extra0()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra0 = "+this.asistenciamensual.gethoras_extra0().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_enfermoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_enfermo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_enfermo = "+this.asistenciamensual.gethoras_enfermo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_maternidadAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_maternidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_maternidad = "+this.asistenciamensual.gethoras_maternidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_vacacionAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.gethoras_vacacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_vacacion = "+this.asistenciamensual.gethoras_vacacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.asistenciamensual.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_nochesAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getnumero_noches()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_noches = "+this.asistenciamensual.getnumero_noches().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_feriadosAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getnumero_feriados()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_feriados = "+this.asistenciamensual.getnumero_feriados().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_trabajoAsistenciaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.getasistenciamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciamensual==null) {
						this.asistenciamensual = new AsistenciaMensual();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);
				}

				if(this.asistenciamensual.getnumero_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_trabajo = "+this.asistenciamensual.getnumero_trabajo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdAnio();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCargoAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdCargo();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdEmpleado();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdEmpresa();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdEstructura();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesAsistenciaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaMensual(false,false);

			this.getAsistenciaMensualsFK_IdMes();

			this.inicializarActualizarBindingAsistenciaMensual(false);

			//if(AsistenciaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAsistenciaMensual() {
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
			this.jInternalFrameDetalleFormAsistenciaMensual.setVisible(false);	    			
			this.jInternalFrameDetalleFormAsistenciaMensual.dispose();
			this.jInternalFrameDetalleFormAsistenciaMensual=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
			this.jInternalFrameReporteDinamicoAsistenciaMensual.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAsistenciaMensual.dispose();
			this.jInternalFrameReporteDinamicoAsistenciaMensual=null;
		}
		
		if(this.jInternalFrameImportacionAsistenciaMensual!=null) {
			this.jInternalFrameImportacionAsistenciaMensual.setVisible(false);	    			
			this.jInternalFrameImportacionAsistenciaMensual.dispose();
			this.jInternalFrameImportacionAsistenciaMensual=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAsistenciaMensual();
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			
			if(sTipo.equals("NuevoAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAsistenciaMensual")) {
				jButtonDuplicarAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAsistenciaMensual")) {
				jButtonCopiarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormAsistenciaMensual")) {
				jButtonVerFormAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAsistenciaMensual")) {
				jButtonDuplicarAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAsistenciaMensual")) {
				jButtonDuplicarAsistenciaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAsistenciaMensual")) {
				jButtonModificarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAsistenciaMensual")) {
				jButtonModificarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAsistenciaMensual")) {
				jButtonModificarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAsistenciaMensual")) {
				jButtonActualizarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAsistenciaMensual")) {
				jButtonActualizarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAsistenciaMensual")) {
				jButtonActualizarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarAsistenciaMensual")) {
				jButtonEliminarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAsistenciaMensual")) {
				jButtonEliminarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAsistenciaMensual")) {
				jButtonEliminarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarAsistenciaMensual")) {
				jButtonCancelarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAsistenciaMensual")) {
				jButtonCancelarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAsistenciaMensual")) {
				jButtonCancelarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarAsistenciaMensual")) {
				jButtonCerrarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAsistenciaMensual")) {
				jButtonCerrarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAsistenciaMensual")) {
				jButtonCerrarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAsistenciaMensual")) {
				jButtonMostrarOcultarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAsistenciaMensual")) {
				jButtonCancelarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAsistenciaMensual")) {
				jButtonCopiarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAsistenciaMensual")) {
				jButtonVerFormAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAsistenciaMensual")) {
				jButtonCopiarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAsistenciaMensual")) {
				jButtonVerFormAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAsistenciaMensual")) {
				jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAsistenciaMensual")) {
				jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAsistenciaMensual")) {
				jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAsistenciaMensual")) {
				jButtonAnterioresAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAsistenciaMensual")) {
				jButtonAnterioresAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAsistenciaMensual")) {
				jButtonAnterioresAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAsistenciaMensual")) {
				jButtonSiguientesAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAsistenciaMensual")) {
				jButtonSiguientesAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAsistenciaMensual")) {
				jButtonSiguientesAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAsistenciaMensual") || sTipo.equals("MenuItemDetalleAbrirOrderByAsistenciaMensual")) {
				jButtonAbrirOrderByAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAsistenciaMensual") || sTipo.equals("MenuItemDetalleMostrarOcultarAsistenciaMensual")) {
				jButtonMostrarOcultarAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaMensual")) {
				jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAsistenciaMensual")) {
				jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAsistenciaMensual")) {
				jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAsistenciaMensual")) {
				jButtonCerrarReporteDinamicoAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAsistenciaMensual")) {
				jButtonGenerarReporteDinamicoAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAsistenciaMensual")) {
				
				jButtonGenerarExcelReporteDinamicoAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAsistenciaMensual")) {
				jButtonCerrarImportacionAsistenciaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAsistenciaMensual")) {
				
				jButtonGenerarImportacionAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAsistenciaMensual")) {
				
				jButtonAbrirImportacionAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAsistenciaMensual")) {
				jComboBoxTiposAccionesAsistenciaMensualActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAsistenciaMensual")) {
				jComboBoxTiposRelacionesAsistenciaMensualActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAsistenciaMensual")) {
				jComboBoxTiposAccionesAsistenciaMensualActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAsistenciaMensual")) {
				
				jComboBoxTiposSeleccionarAsistenciaMensualActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAsistenciaMensual")) {
				jTextFieldValorCampoGeneralAsistenciaMensualActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAsistenciaMensual")) {
				jButtonAbrirOrderByAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAsistenciaMensual")) {
				jButtonAbrirOrderByAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAsistenciaMensual")) {
				jButtonCerrarOrderByAsistenciaMensualActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaMensualBusqueda")) {
				this.jButtonidAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaMensualUpdate")) {
				this.jButtonid_empresaAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaMensualBusqueda")) {
				this.jButtonid_empresaAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensual")) {
				this.jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensualUpdate")) {
				this.jButtonid_empleadoAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensualBusqueda")) {
				this.jButtonid_empleadoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoAsistenciaMensualUpdate")) {
				this.jButtonid_cargoAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoAsistenciaMensualBusqueda")) {
				this.jButtonid_cargoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaMensualUpdate")) {
				this.jButtonid_estructuraAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaMensualBusqueda")) {
				this.jButtonid_estructuraAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioAsistenciaMensualUpdate")) {
				this.jButtonid_anioAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioAsistenciaMensualBusqueda")) {
				this.jButtonid_anioAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesAsistenciaMensualUpdate")) {
				this.jButtonid_mesAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesAsistenciaMensualBusqueda")) {
				this.jButtonid_mesAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaMensualBusqueda")) {
				this.jButtonfechaAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_trabajoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_trabajoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_atrasoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_atrasoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_faltasAsistenciaMensualBusqueda")) {
				this.jButtonhoras_faltasAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_permisoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_permisoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra25AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra25AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra50AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra50AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra100AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra100AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra150AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra150AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra0AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra0AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_enfermoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_enfermoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_maternidadAsistenciaMensualBusqueda")) {
				this.jButtonhoras_maternidadAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_vacacionAsistenciaMensualBusqueda")) {
				this.jButtonhoras_vacacionAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasAsistenciaMensualBusqueda")) {
				this.jButtonnumero_diasAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_nochesAsistenciaMensualBusqueda")) {
				this.jButtonnumero_nochesAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_feriadosAsistenciaMensualBusqueda")) {
				this.jButtonnumero_feriadosAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_trabajoAsistenciaMensualBusqueda")) {
				this.jButtonnumero_trabajoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoAsistenciaMensual")) {
				this.jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAnioAsistenciaMensual")) {
				this.jButtonFK_IdAnioAsistenciaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCargoAsistenciaMensual")) {
				this.jButtonFK_IdCargoAsistenciaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoAsistenciaMensual")) {
				this.jButtonFK_IdEmpleadoAsistenciaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraAsistenciaMensual")) {
				this.jButtonFK_IdEstructuraAsistenciaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesAsistenciaMensual")) {
				this.jButtonFK_IdMesAsistenciaMensualActionPerformed(evt);
			}
			
			;
			
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAsistenciaMensual();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AsistenciaMensual asistenciamensualLocal=null;
			
			if(!this.getEsControlTabla()) {
				asistenciamensualLocal=this.asistenciamensual;
			} else {
				asistenciamensualLocal=this.asistenciamensualAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
							
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
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
			
			


			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
								
						
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
								
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
							
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
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
			
			


			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
								
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAsistenciaMensual")) {
					jCheckBoxSeleccionarTodosAsistenciaMensualItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAsistenciaMensual")) {
					jCheckBoxSeleccionadosAsistenciaMensualItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAsistenciaMensual")) {
					
				}
				
				


				
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
												
				
				


				
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
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
			
			


			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciamensual);
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
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
				
				


				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaMensual.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciamensualAnterior =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAsistenciaMensual")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAsistenciaMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAsistenciaMensual.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.asistenciamensual =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.asistenciamensual =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.asistenciamensual);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAsistenciaMensual")) {
				
				}
				
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAsistenciaMensual")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAsistenciaMensual.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAsistenciaMensual")) {
			
			}
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAsistenciaMensual();
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			if(sTipo.equals("NuevoAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAsistenciaMensual")) {
				jButtonDuplicarAsistenciaMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAsistenciaMensual")) {
				jButtonCopiarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAsistenciaMensual")) {
				jButtonVerFormAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAsistenciaMensual")) {
				jButtonNuevoAsistenciaMensualActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAsistenciaMensual")) {
				jButtonModificarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAsistenciaMensual")) {
				jButtonActualizarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAsistenciaMensual")) {
				jButtonEliminarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAsistenciaMensual")) {
				jButtonCancelarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAsistenciaMensual")) {
				jButtonCerrarAsistenciaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAsistenciaMensual")) {
				jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaMensual")) {
				jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAsistenciaMensual")) {
				jButtonAbrirOrderByAsistenciaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAsistenciaMensual")) {
				jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAsistenciaMensual")) {
				jButtonAnterioresAsistenciaMensualActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAsistenciaMensual")) {
				jButtonSiguientesAsistenciaMensualActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaMensualBusqueda")) {
				this.jButtonidAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaMensualUpdate")) {
				this.jButtonid_empresaAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaMensualBusqueda")) {
				this.jButtonid_empresaAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensual")) {
				this.jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensualUpdate")) {
				this.jButtonid_empleadoAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaMensualBusqueda")) {
				this.jButtonid_empleadoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoAsistenciaMensualUpdate")) {
				this.jButtonid_cargoAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoAsistenciaMensualBusqueda")) {
				this.jButtonid_cargoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaMensualUpdate")) {
				this.jButtonid_estructuraAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaMensualBusqueda")) {
				this.jButtonid_estructuraAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioAsistenciaMensualUpdate")) {
				this.jButtonid_anioAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioAsistenciaMensualBusqueda")) {
				this.jButtonid_anioAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesAsistenciaMensualUpdate")) {
				this.jButtonid_mesAsistenciaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesAsistenciaMensualBusqueda")) {
				this.jButtonid_mesAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaMensualBusqueda")) {
				this.jButtonfechaAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_trabajoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_trabajoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_atrasoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_atrasoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_faltasAsistenciaMensualBusqueda")) {
				this.jButtonhoras_faltasAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_permisoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_permisoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra25AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra25AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra50AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra50AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra100AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra100AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra150AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra150AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra0AsistenciaMensualBusqueda")) {
				this.jButtonhoras_extra0AsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_enfermoAsistenciaMensualBusqueda")) {
				this.jButtonhoras_enfermoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_maternidadAsistenciaMensualBusqueda")) {
				this.jButtonhoras_maternidadAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_vacacionAsistenciaMensualBusqueda")) {
				this.jButtonhoras_vacacionAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasAsistenciaMensualBusqueda")) {
				this.jButtonnumero_diasAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_nochesAsistenciaMensualBusqueda")) {
				this.jButtonnumero_nochesAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_feriadosAsistenciaMensualBusqueda")) {
				this.jButtonnumero_feriadosAsistenciaMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_trabajoAsistenciaMensualBusqueda")) {
				this.jButtonnumero_trabajoAsistenciaMensualBusquedaActionPerformed(evt);
			}
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAsistenciaMensual();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAsistenciaMensual")) {
				closingInternalFrameAsistenciaMensual();
				
			} else if(sTipo.equals("jButtonCancelarAsistenciaMensual")) {
				JInternalFrameBase jInternalFrameDetalleFormAsistenciaMensual = (JInternalFrameBase)evt.getSource();
	            	
	            AsistenciaMensualBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaMensual.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAsistenciaMensualActionPerformed(null);
			}
			
			AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciamensual,new Object(),this.asistenciamensualParameterGeneral,this.asistenciamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAsistenciaMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAsistenciaMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAsistenciaMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.asistenciamensual)) {
			if(!esControlTabla) {
				if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);			
				}
				
				if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAsistenciaMensual(this.asistenciamensual,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciamensualReturnGeneral=asistenciamensualLogic.procesarEventosAsistenciaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciamensualLogic.getAsistenciaMensuals(),this.asistenciamensual,this.asistenciamensualParameterGeneral,this.isEsNuevoAsistenciaMensual,classes);//this.asistenciamensualLogic.getAsistenciaMensual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAsistenciaMensual(this.asistenciamensualReturnGeneral,this.asistenciamensualBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaMensual(classes,this.asistenciamensualReturnGeneral,this.asistenciamensualBean,false);
					}
						
					if(this.asistenciamensualReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual());	
					}
						
					if(this.asistenciamensualReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual(),classes);//this.asistenciamensualBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAsistenciaMensual(this.asistenciamensual,classes);//this.asistenciamensualBean);									
				}
			
				if(AsistenciaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAsistenciaMensual(this.asistenciamensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaMensual(this.asistenciamensual);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.asistenciamensualAnterior!=null) {
						this.asistenciamensual=this.asistenciamensualAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciamensualReturnGeneral=asistenciamensualLogic.procesarEventosAsistenciaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciamensualLogic.getAsistenciaMensuals(),this.asistenciamensual,this.asistenciamensualParameterGeneral,this.isEsNuevoAsistenciaMensual,classes);//this.asistenciamensualLogic.getAsistenciaMensual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciamensualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.asistenciamensualReturnGeneral.getAsistenciaMensual(),asistenciamensualLogic.getAsistenciaMensuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.asistenciamensualReturnGeneral.getAsistenciaMensual(),this.asistenciamensuals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAsistenciaMensual.repaint();
				
				//((AbstractTableModel) this.jTableDatosAsistenciaMensual.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAsistenciaMensual();
			}
		}
	}
	
	public void actualizarVisualTableDatosAsistenciaMensual() throws Exception {
		
		AsistenciaMensualModel asistenciamensualModel=(AsistenciaMensualModel)this.jTableDatosAsistenciaMensual.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciamensualModel.asistenciamensuals=this.asistenciamensualLogic.getAsistenciaMensuals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			asistenciamensualModel.asistenciamensuals=this.asistenciamensuals;
		}
		
		
		((AsistenciaMensualModel) this.jTableDatosAsistenciaMensual.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAsistenciaMensual() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getasistenciamensualAnterior(),this.asistenciamensualLogic.getAsistenciaMensuals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getasistenciamensualAnterior(),this.asistenciamensuals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAsistenciaMensual();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAsistenciaMensual(AsistenciaMensual asistenciamensual,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
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
										
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciamensual,new Object(),generalEntityParameterGeneral,this.asistenciamensualReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AsistenciaMensualConstantesFunciones.getClassesRelationshipsOfAsistenciaMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AsistenciaMensualConstantesFunciones.getClassesRelationshipsFromStringsOfAsistenciaMensual(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAsistenciaMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AsistenciaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciamensual,new Object(),generalEntityParameterGeneral,this.asistenciamensualReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAsistenciaMensual(AsistenciaMensualBean asistenciamensualBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaMensual(ArrayList<Classe> classes,AsistenciaMensualReturnGeneral asistenciamensualReturnGeneral,AsistenciaMensualBean asistenciamensualBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAsistenciaMensual(AsistenciaMensual asistenciamensual,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.asistenciamensual)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaMensual = new AsistenciaMensualDetalleFormJInternalFrame(jDesktopPane,this.asistenciamensualSessionBean.getConGuardarRelaciones(),this.asistenciamensualSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.setVisible(false);
		this.jInternalFrameDetalleFormAsistenciaMensual.setSelected(false);						
		
		this.jInternalFrameDetalleFormAsistenciaMensual.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAsistenciaMensual.asistenciamensualLogic=this.asistenciamensualLogic;
		
		this.cargarCombosFrameForeignKeyAsistenciaMensual("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaMensual();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaMensual();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAsistenciaMensual("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAsistenciaMensual();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAsistenciaMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaMensual"));
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaMensual"));

		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaMensual"));
					
		this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemModificarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaMensual"));
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaMensual"));
						
		this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemActualizarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaMensual"));
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaMensual"));
								
		this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemEliminarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaMensual"));
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaMensual"));
					
		this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemCancelarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaMensual"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemDetalleCerrarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaMensual"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaMensual"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaMensual"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonidAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualBusqueda"));
		//jButtonid_empleadoAsistenciaMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonfechaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_trabajoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_atrasoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_faltasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_permisoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra25AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra50AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra100AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra150AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra150AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra0AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra0AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_enfermoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_enfermoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_maternidadAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_maternidadAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_vacacionAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_diasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_nochesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_nochesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_feriadosAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_feriadosAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_trabajoAsistenciaMensualBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaMensual"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAsistenciaMensual"));
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaMensual"));
		}
		
		this.jTableDatosAsistenciaMensual.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAsistenciaMensual"));
		
		this.jTableDatosAsistenciaMensual.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAsistenciaMensual"));
		
		this.jButtonNuevoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"NuevoAsistenciaMensual"));
		
		this.jButtonDuplicarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"DuplicarAsistenciaMensual"));
		
		this.jButtonCopiarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"CopiarAsistenciaMensual"));
		
		this.jButtonVerFormAsistenciaMensual.addActionListener(new ButtonActionListener(this,"VerFormAsistenciaMensual"));
		
		
		this.jButtonNuevoToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"NuevoToolBarAsistenciaMensual"));
			
		this.jButtonDuplicarToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAsistenciaMensual"));
			
		this.jMenuItemNuevoAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAsistenciaMensual"));
			
		this.jMenuItemDuplicarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAsistenciaMensual"));		
		
		
		this.jButtonNuevoRelacionesAsistenciaMensual.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAsistenciaMensual"));
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAsistenciaMensual"));
			
		this.jMenuItemNuevoRelacionesAsistenciaMensual.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAsistenciaMensual"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonModificarToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaMensual"));
			
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemModificarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonActualizarToolBarAsistenciaMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaMensual"));
				
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemActualizarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonEliminarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaMensual"));
						
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemEliminarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonCancelarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaMensual"));
			
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemCancelarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaMensual"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAsistenciaMensual"));		
		
		
		this.jButtonCerrarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CerrarAsistenciaMensual"));
		
		
		this.jButtonCerrarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CerrarToolBarAsistenciaMensual"));
			
		this.jMenuItemCerrarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAsistenciaMensual"));
			
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jMenuItemDetalleCerrarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosAsistenciaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaMensual"));
		}
		
		this.jButtonCopiarToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CopiarToolBarAsistenciaMensual"));
			
		this.jButtonVerFormToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"VerFormToolBarAsistenciaMensual"));
		
		this.jMenuItemGuardarCambiosAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAsistenciaMensual"));
			
		this.jMenuItemCopiarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAsistenciaMensual"));		
		
		this.jMenuItemVerFormAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAsistenciaMensual"));		
		
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaMensual"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAsistenciaMensual"));
			
		this.jMenuItemGuardarCambiosTablaAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaMensual"));		
		
		
		
		this.jButtonRecargarInformacionAsistenciaMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionAsistenciaMensual"));
					
		this.jButtonRecargarInformacionToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAsistenciaMensual"));
		
		this.jMenuItemRecargarInformacionAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAsistenciaMensual"));		
		
		
		
		this.jButtonAnterioresAsistenciaMensual.addActionListener (new ButtonActionListener(this,"AnterioresAsistenciaMensual"));
		
		
		this.jButtonAnterioresToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAsistenciaMensual"));
		
		this.jMenuItemAnterioresAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAsistenciaMensual"));		
		
		
		this.jButtonSiguientesAsistenciaMensual.addActionListener (new ButtonActionListener(this,"SiguientesAsistenciaMensual"));
		
		
		this.jButtonSiguientesToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAsistenciaMensual"));
			
		this.jMenuItemSiguientesAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAsistenciaMensual"));
			
		this.jMenuItemAbrirOrderByAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAsistenciaMensual"));
			
		this.jMenuItemMostrarOcultarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAsistenciaMensual"));
			
		this.jMenuItemDetalleAbrirOrderByAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAsistenciaMensual"));
			
		this.jMenuItemDetalleMostarOcultarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAsistenciaMensual"));		
		
		
		this.jButtonNuevoGuardarCambiosAsistenciaMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAsistenciaMensual"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAsistenciaMensual"));
			
		this.jMenuItemNuevoGuardarCambiosAsistenciaMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAsistenciaMensual"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAsistenciaMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAsistenciaMensual"));

		this.jCheckBoxSeleccionadosAsistenciaMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAsistenciaMensual"));
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaMensual"));
		}
		
		
		this.jComboBoxTiposRelacionesAsistenciaMensual.addActionListener (new ButtonActionListener(this,"TiposRelacionesAsistenciaMensual"));
			
		this.jComboBoxTiposAccionesAsistenciaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesAsistenciaMensual"));
					
		this.jComboBoxTiposSeleccionarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAsistenciaMensual"));
			
		this.jTextFieldValorCampoGeneralAsistenciaMensual.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAsistenciaMensual"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonidAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualBusqueda"));
		//jButtonid_empleadoAsistenciaMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonfechaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_trabajoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_atrasoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_faltasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_permisoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra25AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra50AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra100AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra150AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra150AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra0AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra0AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_enfermoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_enfermoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_maternidadAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_maternidadAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_vacacionAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_diasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_nochesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_nochesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_feriadosAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_feriadosAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_trabajoAsistenciaMensualBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdAnioAsistenciaMensual"));

			this.jButtonFK_IdCargoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdCargoAsistenciaMensual"));

			this.jButtonFK_IdEmpleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaMensual"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensual"));

			this.jButtonFK_IdEstructuraAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraAsistenciaMensual"));

			this.jButtonFK_IdMesAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdMesAsistenciaMensual"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAsistenciaMensual!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaMensual"));
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaMensual"));
				this.jInternalFrameReporteDinamicoAsistenciaMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaMensual"));
			}
			
			//this.jButtonCerrarReporteDinamicoAsistenciaMensual.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaMensual"));				
			//this.jButtonGenerarReporteDinamicoAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaMensual"));
			//this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaMensual"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAsistenciaMensual!=null) {
				this.jInternalFrameImportacionAsistenciaMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaMensual"));
				this.jInternalFrameImportacionAsistenciaMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaMensual"));
				this.jInternalFrameImportacionAsistenciaMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaMensual"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAsistenciaMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByAsistenciaMensual"));
			
			this.jButtonAbrirOrderByToolBarAsistenciaMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAsistenciaMensual"));			
			
			if(this.jInternalFrameOrderByAsistenciaMensual!=null) {
				this.jInternalFrameOrderByAsistenciaMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaMensual"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaMensual.jTabbedPaneRelacionesAsistenciaMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaMensual"));
		
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
            		closingInternalFrameAsistenciaMensual();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAsistenciaMensual.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAsistenciaMensual = (JInternalFrameBase)event.getSource();
	            	
	            AsistenciaMensualBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaMensual.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAsistenciaMensualActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAsistenciaMensual.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAsistenciaMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAsistenciaMensual.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAsistenciaMensual.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAsistenciaMensual";
		inputMap = this.jButtonNuevoAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaMensualActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAsistenciaMensual";
		inputMap = this.jButtonNuevoRelacionesAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaMensualActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAsistenciaMensual";
		inputMap = this.jButtonModificarAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAsistenciaMensual";
		inputMap = this.jButtonActualizarAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAsistenciaMensual";
		inputMap = this.jButtonEliminarAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAsistenciaMensual";
		inputMap = this.jButtonCancelarAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAsistenciaMensual";
		inputMap = this.jButtonCerrarAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAsistenciaMensual";
		inputMap = this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonGuardarCambiosAsistenciaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAsistenciaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAsistenciaMensual.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAsistenciaMensualItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAsistenciaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAsistenciaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAsistenciaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAsistenciaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAsistenciaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAsistenciaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonidAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empresaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaMensualBusqueda"));
		//jButtonid_empleadoAsistenciaMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_cargoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_estructuraAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_anioAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioAsistenciaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_mesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonfechaAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_trabajoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_atrasoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_faltasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_permisoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra25AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra50AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra100AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra150AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra150AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_extra0AsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra0AsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_enfermoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_enfermoAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_maternidadAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_maternidadAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonhoras_vacacionAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_diasAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_nochesAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_nochesAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_feriadosAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_feriadosAsistenciaMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaMensual.jButtonnumero_trabajoAsistenciaMensualBusqueda.addActionListener(new ButtonActionListener(this,"numero_trabajoAsistenciaMensualBusqueda"));
		
		
		this.jButtonFK_IdAnioAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdAnioAsistenciaMensual"));

		this.jButtonFK_IdCargoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdCargoAsistenciaMensual"));

		this.jButtonFK_IdEmpleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaMensual"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaMensual"));

		this.jButtonFK_IdEstructuraAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraAsistenciaMensual"));

		this.jButtonFK_IdMesAsistenciaMensual.addActionListener(new ButtonActionListener(this,"FK_IdMesAsistenciaMensual"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAsistenciaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAsistenciaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAsistenciaMensualActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAsistenciaMensual.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAsistenciaMensual(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
					asistenciamensualAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaMensual asistenciamensualAux:asistenciamensuals) {
					asistenciamensualAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAsistenciaMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
						asistenciamensualAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaMensual asistenciamensualAux:asistenciamensuals) {
						asistenciamensualAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaMensual asistenciamensualAux:asistenciamensuals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAsistenciaMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAsistenciaMensual.getSelectedRows();
			
			AsistenciaMensual asistenciamensualLocal=new AsistenciaMensual();
			
			//this.seleccionarTodosAsistenciaMensual(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciamensualLocal =(AsistenciaMensual) this.asistenciamensualLogic.getAsistenciaMensuals().toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					asistenciamensualLocal =(AsistenciaMensual) this.asistenciamensuals.toArray()[this.jTableDatosAsistenciaMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				asistenciamensualLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
						asistenciamensualAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaMensual asistenciamensualAux:asistenciamensuals) {
						asistenciamensualAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAsistenciaMensualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAsistenciaMensualParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAsistenciaMensualActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAsistenciaMensual.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaMensual asistenciamensualAux:this.asistenciamensualLogic.getAsistenciaMensuals()) {
				
						if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciamensualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO)) {
							existe=true;
							asistenciamensualAux.sethoras_trabajo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO)) {
							existe=true;
							asistenciamensualAux.sethoras_atraso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS)) {
							existe=true;
							asistenciamensualAux.sethoras_faltas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO)) {
							existe=true;
							asistenciamensualAux.sethoras_permiso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25)) {
							existe=true;
							asistenciamensualAux.sethoras_extra25(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50)) {
							existe=true;
							asistenciamensualAux.sethoras_extra50(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100)) {
							existe=true;
							asistenciamensualAux.sethoras_extra100(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150)) {
							existe=true;
							asistenciamensualAux.sethoras_extra150(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0)) {
							existe=true;
							asistenciamensualAux.sethoras_extra0(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO)) {
							existe=true;
							asistenciamensualAux.sethoras_enfermo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD)) {
							existe=true;
							asistenciamensualAux.sethoras_maternidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION)) {
							existe=true;
							asistenciamensualAux.sethoras_vacacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							asistenciamensualAux.setnumero_dias(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES)) {
							existe=true;
							asistenciamensualAux.setnumero_noches(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS)) {
							existe=true;
							asistenciamensualAux.setnumero_feriados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO)) {
							existe=true;
							asistenciamensualAux.setnumero_trabajo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaMensual asistenciamensualAux:asistenciamensuals) {
					
						if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciamensualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO)) {
							existe=true;
							asistenciamensualAux.sethoras_trabajo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO)) {
							existe=true;
							asistenciamensualAux.sethoras_atraso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS)) {
							existe=true;
							asistenciamensualAux.sethoras_faltas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO)) {
							existe=true;
							asistenciamensualAux.sethoras_permiso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25)) {
							existe=true;
							asistenciamensualAux.sethoras_extra25(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50)) {
							existe=true;
							asistenciamensualAux.sethoras_extra50(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100)) {
							existe=true;
							asistenciamensualAux.sethoras_extra100(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150)) {
							existe=true;
							asistenciamensualAux.sethoras_extra150(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0)) {
							existe=true;
							asistenciamensualAux.sethoras_extra0(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO)) {
							existe=true;
							asistenciamensualAux.sethoras_enfermo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD)) {
							existe=true;
							asistenciamensualAux.sethoras_maternidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION)) {
							existe=true;
							asistenciamensualAux.sethoras_vacacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							asistenciamensualAux.setnumero_dias(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES)) {
							existe=true;
							asistenciamensualAux.setnumero_noches(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS)) {
							existe=true;
							asistenciamensualAux.setnumero_feriados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO)) {
							existe=true;
							asistenciamensualAux.setnumero_trabajo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAsistenciaMensualActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAsistenciaMensual=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAsistenciaMensual.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAsistenciaMensual) {				
					conSplash=true;//false;										
					
					//this.startProcessAsistenciaMensual(conSplash);
				
					this.generarReporteAsistenciaMensualsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAsistenciaMensualsSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaMensualsSeleccionados(false);
				//this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaMensualsSeleccionados(true);
				//this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaMensual();
				
				this.exportarAsistenciaMensualsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAsistenciaMensuals();
				//this.importarAsistenciaMensuals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaMensual();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAsistenciaMensualsSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Asistencia Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAsistenciaMensual();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAsistenciaMensual)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAsistenciaMensual(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
				}	
			} 			
			else if(AsistenciaMensualBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAsistenciaMensual) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAsistenciaMensual(conSplash);
					
						//this.actualizarParametrosGeneralAsistenciaMensual();
						
						this.generarReporteProcesoAccionAsistenciaMensualsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AsistenciaMensualBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Asistencia MensualES SELECCIONADOS?", "MANTENIMIENTO DE Asistencia Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAsistenciaMensual();
				
						this.actualizarParametrosGeneralAsistenciaMensual();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.asistenciamensualReturnGeneral=asistenciamensualLogic.procesarAccionAsistenciaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.asistenciamensualLogic.getAsistenciaMensuals(),this.asistenciamensualParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAsistenciaMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAsistenciaMensual();
					
					AsistenciaMensualBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAsistenciaMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxTiposAccionesFormularioAsistenciaMensual.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAsistenciaMensual(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAsistenciaMensualActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAsistenciaMensual();
			
			if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
			AsistenciaMensual asistenciamensual=new AsistenciaMensual();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAsistenciaMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAsistenciaMensual.getSelectedItem();
			
			
			
			
			asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
			//this.sTipoAccion;
			
			if(asistenciamensualsSeleccionados.size()==1) {
				for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
					asistenciamensual=asistenciamensualAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAsistenciaMensual();
			
      		//this.finishProcessAsistenciaMensual(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAsistenciaMensualReturnGeneral() throws Exception {
		if(this.asistenciamensualReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.asistenciamensualReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.asistenciamensualReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.asistenciamensualReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.asistenciamensualReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.asistenciamensualReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAsistenciaMensual(false);
		}
		
		if(this.asistenciamensualReturnGeneral.getConRetornoLista() || this.asistenciamensualReturnGeneral.getConRetornoObjeto()) {
			if(this.asistenciamensualReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciamensualLogic.setAsistenciaMensuals(this.asistenciamensualReturnGeneral.getAsistenciaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.asistenciamensualReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciamensualLogic.setAsistenciaMensual(this.asistenciamensualReturnGeneral.getAsistenciaMensual());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAsistenciaMensual(false);
		}
	}
	
	public void actualizarParametrosGeneralAsistenciaMensual() throws Exception {
		
		
	}
	
	public ArrayList<AsistenciaMensual> getAsistenciaMensualsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAsistenciaMensual) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AsistenciaMensual asistenciamensualAux:asistenciamensualLogic.getAsistenciaMensuals()) {
					if(asistenciamensualAux.getIsSelected()) {
						asistenciamensualsSeleccionados.add(asistenciamensualAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaMensual asistenciamensualAux:this.asistenciamensuals) {
					if(asistenciamensualAux.getIsSelected()) {
						asistenciamensualsSeleccionados.add(asistenciamensualAux);				
					}
				}
			}
			
			if(asistenciamensualsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						asistenciamensualsSeleccionados.addAll(this.asistenciamensualLogic.getAsistenciaMensuals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						asistenciamensualsSeleccionados.addAll(this.asistenciamensuals);				
					}
				}
			}
		} else {
			asistenciamensualsSeleccionados.add(this.asistenciamensual);
		}
		
		return asistenciamensualsSeleccionados;
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
	
	public void generarReporteAsistenciaMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAsistenciaMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAsistenciaMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaMensualsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaMensualsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Asistencia Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados);
		
	}	
	
	public void generarReporteNormalAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAsistenciaMensualsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAsistenciaMensual();
		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAsistenciaMensual();
		
		
		//this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados ,asistenciamensualImplementable,asistenciamensualImplementableHome);
	}
	
	public void mostrarImportacionAsistenciaMensuals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAsistenciaMensual();
		
		this.abrirFrameImportacionAsistenciaMensual();		
		
			
		//this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados ,asistenciamensualImplementable,asistenciamensualImplementableHome);
	}
	
	public void importarAsistenciaMensuals() throws Exception {		
	
	}
	
	public void exportarAsistenciaMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAsistenciaMensualsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAsistenciaMensualsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAsistenciaMensualsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Asistencia Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAsistenciaMensual(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAsistenciaMensual(asistenciamensualAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//asistenciamensualAux.setsDetalleGeneralEntityReporte(asistenciamensualAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAsistenciaMensual(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAsistenciaMensual(AsistenciaMensual asistenciamensual,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=asistenciamensual.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getcargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_trabajo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_atraso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_faltas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_permiso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_extra25().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_extra50().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_extra100().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_extra150().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_extra0().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_enfermo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_maternidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.gethoras_vacacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getnumero_dias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getnumero_noches().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getnumero_feriados().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciamensual.getnumero_trabajo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AsistenciaMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAsistenciaMensual(row);				
				iRow++;
			}				
			
			for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAsistenciaMensual(asistenciamensualAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAsistenciaMensualsSeleccionados() throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();		
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciamensual.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("asistenciamensuals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("asistenciamensual");
			//elementRoot.appendChild(element);
		
			for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
				element = document.createElement("asistenciamensual");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAsistenciaMensual(asistenciamensualAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAsistenciaMensual(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAsistenciaMensual(AsistenciaMensual asistenciamensual,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getcargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_trabajo());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_atraso());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_faltas());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_permiso());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_extra25());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_extra50());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_extra100());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_extra150());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_extra0());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_enfermo());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_maternidad());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.gethoras_vacacion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getnumero_dias());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getnumero_noches());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getnumero_feriados());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciamensual.getnumero_trabajo());				
	}
	
	public void setFilaDatosExportarXmlAsistenciaMensual(AsistenciaMensual asistenciamensual,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AsistenciaMensualConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(asistenciamensual.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AsistenciaMensualConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(asistenciamensual.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(asistenciamensual.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(asistenciamensual.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementcargo_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDCARGO);
		elementcargo_descripcion.appendChild(document.createTextNode(asistenciamensual.getcargo_descripcion()));
		element.appendChild(elementcargo_descripcion);

		Element elementestructura_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(asistenciamensual.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementanio_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(asistenciamensual.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(AsistenciaMensualConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(asistenciamensual.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementfecha = document.createElement(AsistenciaMensualConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(asistenciamensual.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementhoras_trabajo = document.createElement(AsistenciaMensualConstantesFunciones.HORASTRABAJO);
		elementhoras_trabajo.appendChild(document.createTextNode(asistenciamensual.gethoras_trabajo().toString().trim()));
		element.appendChild(elementhoras_trabajo);

		Element elementhoras_atraso = document.createElement(AsistenciaMensualConstantesFunciones.HORASATRASO);
		elementhoras_atraso.appendChild(document.createTextNode(asistenciamensual.gethoras_atraso().toString().trim()));
		element.appendChild(elementhoras_atraso);

		Element elementhoras_faltas = document.createElement(AsistenciaMensualConstantesFunciones.HORASFALTAS);
		elementhoras_faltas.appendChild(document.createTextNode(asistenciamensual.gethoras_faltas().toString().trim()));
		element.appendChild(elementhoras_faltas);

		Element elementhoras_permiso = document.createElement(AsistenciaMensualConstantesFunciones.HORASPERMISO);
		elementhoras_permiso.appendChild(document.createTextNode(asistenciamensual.gethoras_permiso().toString().trim()));
		element.appendChild(elementhoras_permiso);

		Element elementhoras_extra25 = document.createElement(AsistenciaMensualConstantesFunciones.HORASEXTRA25);
		elementhoras_extra25.appendChild(document.createTextNode(asistenciamensual.gethoras_extra25().toString().trim()));
		element.appendChild(elementhoras_extra25);

		Element elementhoras_extra50 = document.createElement(AsistenciaMensualConstantesFunciones.HORASEXTRA50);
		elementhoras_extra50.appendChild(document.createTextNode(asistenciamensual.gethoras_extra50().toString().trim()));
		element.appendChild(elementhoras_extra50);

		Element elementhoras_extra100 = document.createElement(AsistenciaMensualConstantesFunciones.HORASEXTRA100);
		elementhoras_extra100.appendChild(document.createTextNode(asistenciamensual.gethoras_extra100().toString().trim()));
		element.appendChild(elementhoras_extra100);

		Element elementhoras_extra150 = document.createElement(AsistenciaMensualConstantesFunciones.HORASEXTRA150);
		elementhoras_extra150.appendChild(document.createTextNode(asistenciamensual.gethoras_extra150().toString().trim()));
		element.appendChild(elementhoras_extra150);

		Element elementhoras_extra0 = document.createElement(AsistenciaMensualConstantesFunciones.HORASEXTRA0);
		elementhoras_extra0.appendChild(document.createTextNode(asistenciamensual.gethoras_extra0().toString().trim()));
		element.appendChild(elementhoras_extra0);

		Element elementhoras_enfermo = document.createElement(AsistenciaMensualConstantesFunciones.HORASENFERMO);
		elementhoras_enfermo.appendChild(document.createTextNode(asistenciamensual.gethoras_enfermo().toString().trim()));
		element.appendChild(elementhoras_enfermo);

		Element elementhoras_maternidad = document.createElement(AsistenciaMensualConstantesFunciones.HORASMATERNIDAD);
		elementhoras_maternidad.appendChild(document.createTextNode(asistenciamensual.gethoras_maternidad().toString().trim()));
		element.appendChild(elementhoras_maternidad);

		Element elementhoras_vacacion = document.createElement(AsistenciaMensualConstantesFunciones.HORASVACACION);
		elementhoras_vacacion.appendChild(document.createTextNode(asistenciamensual.gethoras_vacacion().toString().trim()));
		element.appendChild(elementhoras_vacacion);

		Element elementnumero_dias = document.createElement(AsistenciaMensualConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(asistenciamensual.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);

		Element elementnumero_noches = document.createElement(AsistenciaMensualConstantesFunciones.NUMERONOCHES);
		elementnumero_noches.appendChild(document.createTextNode(asistenciamensual.getnumero_noches().toString().trim()));
		element.appendChild(elementnumero_noches);

		Element elementnumero_feriados = document.createElement(AsistenciaMensualConstantesFunciones.NUMEROFERIADOS);
		elementnumero_feriados.appendChild(document.createTextNode(asistenciamensual.getnumero_feriados().toString().trim()));
		element.appendChild(elementnumero_feriados);

		Element elementnumero_trabajo = document.createElement(AsistenciaMensualConstantesFunciones.NUMEROTRABAJO);
		elementnumero_trabajo.appendChild(document.createTextNode(asistenciamensual.getnumero_trabajo().toString().trim()));
		element.appendChild(elementnumero_trabajo);
	}
	
	public void generarReporteGroupGenericoAsistenciaMensualsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados=new ArrayList<AsistenciaMensual>();
		
		asistenciamensualsSeleccionados=this.getAsistenciaMensualsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAsistenciaMensual(asistenciamensualsSeleccionados);
		
		this.generarReporteAsistenciaMensuals("Todos",asistenciamensualsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAsistenciaMensual(ArrayList<AsistenciaMensual> asistenciamensualsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AsistenciaMensual asistenciamensualAux:asistenciamensualsSeleccionados) {
				asistenciamensualAux.setsDetalleGeneralEntityReporte(asistenciamensualAux.toString());
			
				if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getcargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(asistenciamensualAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaMensualConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					asistenciamensualAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(asistenciamensualAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAsistenciaMensual(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAsistenciaMensual=true;
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=true;
				this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=true;
			}
			
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=true;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=true;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=true;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=true;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=true;
			this.isVisibilidadCeldaModificarAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
			this.isVisibilidadCeldaModificarAsistenciaMensual=true;
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
			this.isVisibilidadCeldaCancelarAsistenciaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaMensual=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAsistenciaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=true;
		} else {
			this.actualizarEstadoPanelsAsistenciaMensual(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAsistenciaMensual=false;
			//this.isVisibilidadCeldaVerFormAsistenciaMensual=false;
			this.isVisibilidadCeldaDuplicarAsistenciaMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!asistenciamensualSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			if(!asistenciamensualSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;												
			}
			
			this.jButtonCerrarAsistenciaMensual.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaMensual=false;
		}
		
		if(!this.permiteMantenimiento(this.asistenciamensual)) {
			this.isVisibilidadCeldaActualizarAsistenciaMensual=false;
			this.isVisibilidadCeldaEliminarAsistenciaMensual=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaMensual() {
	}
	
	public void actualizarEstadoPanelsAsistenciaMensual(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAsistenciaMensual!=null) {
				this.jScrollPanelDatosEdicionAsistenciaMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaMensual!=null) {
				this.jScrollPanelDatosAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaMensual!=null) {
				this.jPanelPaginacionAsistenciaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
					this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaMensual!=null) {
				this.jTabbedPaneBusquedasAsistenciaMensual.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAsistenciaMensual!=null) {
				this.jPanelParametrosReportesAsistenciaMensual.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaCargo(Boolean isParaCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoNegation=!isParaCargo;

			this.isVisibilidadFK_IdAnio=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaCargo;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdAnio=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdAnioAsistenciaMensual);}

			this.isVisibilidadFK_IdCargo=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdCargoAsistenciaMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEmpleadoAsistenciaMensual);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdEstructuraAsistenciaMensual);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasAsistenciaMensual.remove(jPanelFK_IdMesAsistenciaMensual);}
		}
		
	}
	
	
	
	

	public String registrarSesionAsistenciaMensualParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(asistenciamensualSessionBean==null) {
				asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(asistenciamensualSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.asistenciamensualFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AsistenciaMensualConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionAsistenciaMensual(true);
			//empleadoSessionBean.setlidAsistenciaMensualActual(this.idAsistenciaMensualActual);

			asistenciamensualSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaMensual(true);
			asistenciamensualSessionBean.setlIdAsistenciaMensualActualForeignKey(this.idAsistenciaMensualActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AsistenciaMensualSessionBean asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		
		if(this.asistenciamensualSessionBean==null) {
			this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		}
		
		this.asistenciamensualSessionBean.setsUltimaBusquedaAsistenciaMensual(this.getsAccionBusqueda());
		this.asistenciamensualSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.asistenciamensualSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			asistenciamensualSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
			asistenciamensualSessionBean.setid_cargo(this.getid_cargoFK_IdCargo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			asistenciamensualSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			asistenciamensualSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			asistenciamensualSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			asistenciamensualSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AsistenciaMensualSessionBean asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		
		if(this.asistenciamensualSessionBean==null) {
			this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		}
		
		if(this.asistenciamensualSessionBean.getsUltimaBusquedaAsistenciaMensual()!=null&&!this.asistenciamensualSessionBean.getsUltimaBusquedaAsistenciaMensual().equals("")) {
			this.setsAccionBusqueda(asistenciamensualSessionBean.getsUltimaBusquedaAsistenciaMensual());
			this.setiNumeroPaginacion(asistenciamensualSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(asistenciamensualSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(asistenciamensualSessionBean.getid_anio());
				asistenciamensualSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
				this.setid_cargoFK_IdCargo(asistenciamensualSessionBean.getid_cargo());
				asistenciamensualSessionBean.setid_cargo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(asistenciamensualSessionBean.getid_empleado());
				asistenciamensualSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(asistenciamensualSessionBean.getid_empresa());
				asistenciamensualSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(asistenciamensualSessionBean.getid_estructura());
				asistenciamensualSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(asistenciamensualSessionBean.getid_mes());
				asistenciamensualSessionBean.setid_mes(null);
			}
		}
		
		this.asistenciamensualSessionBean.setsUltimaBusquedaAsistenciaMensual("");
		this.asistenciamensualSessionBean.setiNumeroPaginacion(AsistenciaMensualConstantesFunciones.INUMEROPAGINACION);
		this.asistenciamensualSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAsistenciaMensual(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAsistenciaMensual() {
		this.updateBorderResaltarBusquedasFormularioAsistenciaMensual();
		this.updateVisibilidadBusquedasFormularioAsistenciaMensual();
		this.updateHabilitarBusquedasFormularioAsistenciaMensual();
	}
	
	public void updateBorderResaltarBusquedasFormularioAsistenciaMensual() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAsistenciaMensual.getComponents().length>0) {
	

		if(this.asistenciamensualConstantesFunciones.resaltarFK_IdAnioAsistenciaMensual!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdAnioAsistenciaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdAnioAsistenciaMensual);
			}
		}

		if(this.asistenciamensualConstantesFunciones.resaltarFK_IdCargoAsistenciaMensual!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdCargoAsistenciaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdCargoAsistenciaMensual);
			}
		}

		if(this.asistenciamensualConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaMensual!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaMensual);
			}
		}

		if(this.asistenciamensualConstantesFunciones.resaltarFK_IdEstructuraAsistenciaMensual!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdEstructuraAsistenciaMensual);
			}
		}

		if(this.asistenciamensualConstantesFunciones.resaltarFK_IdMesAsistenciaMensual!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdMesAsistenciaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdMesAsistenciaMensual);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAsistenciaMensual() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAsistenciaMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdAnioAsistenciaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciamensualConstantesFunciones.mostrarFK_IdAnioAsistenciaMensual);
			if(!this.asistenciamensualConstantesFunciones.mostrarFK_IdAnioAsistenciaMensual && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdCargoAsistenciaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciamensualConstantesFunciones.mostrarFK_IdCargoAsistenciaMensual);
			if(!this.asistenciamensualConstantesFunciones.mostrarFK_IdCargoAsistenciaMensual && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciamensualConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaMensual);
			if(!this.asistenciamensualConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaMensual && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciamensualConstantesFunciones.mostrarFK_IdEstructuraAsistenciaMensual);
			if(!this.asistenciamensualConstantesFunciones.mostrarFK_IdEstructuraAsistenciaMensual && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdMesAsistenciaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciamensualConstantesFunciones.mostrarFK_IdMesAsistenciaMensual);
			if(!this.asistenciamensualConstantesFunciones.mostrarFK_IdMesAsistenciaMensual && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaMensual.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAsistenciaMensual() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAsistenciaMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdAnioAsistenciaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciamensualConstantesFunciones.activarFK_IdAnioAsistenciaMensual);
				this.jTabbedPaneBusquedasAsistenciaMensual.setEnabledAt(index,this.asistenciamensualConstantesFunciones.activarFK_IdAnioAsistenciaMensual);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdCargoAsistenciaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciamensualConstantesFunciones.activarFK_IdCargoAsistenciaMensual);
				this.jTabbedPaneBusquedasAsistenciaMensual.setEnabledAt(index,this.asistenciamensualConstantesFunciones.activarFK_IdCargoAsistenciaMensual);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciamensualConstantesFunciones.activarFK_IdEmpleadoAsistenciaMensual);
				this.jTabbedPaneBusquedasAsistenciaMensual.setEnabledAt(index,this.asistenciamensualConstantesFunciones.activarFK_IdEmpleadoAsistenciaMensual);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciamensualConstantesFunciones.activarFK_IdEstructuraAsistenciaMensual);
				this.jTabbedPaneBusquedasAsistenciaMensual.setEnabledAt(index,this.asistenciamensualConstantesFunciones.activarFK_IdEstructuraAsistenciaMensual);
			}

			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdMesAsistenciaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciamensualConstantesFunciones.activarFK_IdMesAsistenciaMensual);
				this.jTabbedPaneBusquedasAsistenciaMensual.setEnabledAt(index,this.asistenciamensualConstantesFunciones.activarFK_IdMesAsistenciaMensual);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAsistenciaMensual(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdAnioAsistenciaMensual);

			this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);

			this.asistenciamensualConstantesFunciones.setResaltarFK_IdAnioAsistenciaMensual(resaltar);

			jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdAnioAsistenciaMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCargo")) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdCargoAsistenciaMensual);

			this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);

			this.asistenciamensualConstantesFunciones.setResaltarFK_IdCargoAsistenciaMensual(resaltar);

			jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdCargoAsistenciaMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaMensual);

			this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);

			this.asistenciamensualConstantesFunciones.setResaltarFK_IdEmpleadoAsistenciaMensual(resaltar);

			jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaMensual);

			this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);

			this.asistenciamensualConstantesFunciones.setResaltarFK_IdEstructuraAsistenciaMensual(resaltar);

			jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdEstructuraAsistenciaMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasAsistenciaMensual.indexOfComponent(this.jPanelFK_IdMesAsistenciaMensual);

			this.jTabbedPaneBusquedasAsistenciaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaMensual.getComponent(index);

			this.asistenciamensualConstantesFunciones.setResaltarFK_IdMesAsistenciaMensual(resaltar);

			jPanel.setBorder(this.asistenciamensualConstantesFunciones.resaltarFK_IdMesAsistenciaMensual);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAsistenciaMensual.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAsistenciaMensual() throws Exception {

		if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAsistenciaMensual();
		this.updateVisibilidadResaltarControlesFormularioAsistenciaMensual();
		this.updateHabilitarResaltarControlesFormularioAsistenciaMensual();
		
	}
	
	public void updateBorderResaltarControlesFormularioAsistenciaMensual() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.asistenciamensualConstantesFunciones.resaltaridAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltaridAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_empresaAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_empresaAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_empleadoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_empleadoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_cargoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_cargoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_estructuraAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_estructuraAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_anioAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_anioAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarid_mesAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarid_mesAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarfechaAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarfechaAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_trabajoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_trabajoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_atrasoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_atrasoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_faltasAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_faltasAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_permisoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_permisoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_extra25AsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_extra25AsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_extra50AsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_extra50AsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_extra100AsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_extra100AsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_extra150AsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_extra150AsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_extra0AsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_extra0AsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_enfermoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_enfermoAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_maternidadAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_maternidadAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarhoras_vacacionAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarhoras_vacacionAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarnumero_diasAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarnumero_diasAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarnumero_nochesAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarnumero_nochesAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarnumero_feriadosAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarnumero_feriadosAsistenciaMensual);}
		if(this.asistenciamensualConstantesFunciones.resaltarnumero_trabajoAsistenciaMensual!=null && this.jInternalFrameDetalleFormAsistenciaMensual!=null) {this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setBorder(this.asistenciamensualConstantesFunciones.resaltarnumero_trabajoAsistenciaMensual);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAsistenciaMensual() throws Exception {		
		if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
	
		//this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostraridAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelidAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostraridAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_empresaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_empresaAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_empresaAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_empleadoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_empleadoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_empleadoAsistenciaMensual);
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_empleadoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_cargoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_cargoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_cargoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_estructuraAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_estructuraAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_estructuraAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_anioAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_anioAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_anioAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_mesAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelid_mesAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarid_mesAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarfechaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelfechaAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarfechaAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_trabajoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_trabajoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_trabajoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_atrasoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_atrasoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_atrasoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_faltasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_faltasAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_faltasAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_permisoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_permisoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_permisoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra25AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_extra25AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra25AsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra50AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_extra50AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra50AsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra100AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_extra100AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra100AsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra150AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_extra150AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra150AsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra0AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_extra0AsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_extra0AsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_enfermoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_enfermoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_enfermoAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_maternidadAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_maternidadAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_maternidadAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_vacacionAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelhoras_vacacionAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarhoras_vacacionAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_diasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelnumero_diasAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_diasAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_nochesAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelnumero_nochesAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_nochesAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_feriadosAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelnumero_feriadosAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_feriadosAsistenciaMensual);
		//this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_trabajoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jPanelnumero_trabajoAsistenciaMensual.setVisible(this.asistenciamensualConstantesFunciones.mostrarnumero_trabajoAsistenciaMensual);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAsistenciaMensual() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaMensual!=null) {
	
		this.jInternalFrameDetalleFormAsistenciaMensual.jLabelidAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activaridAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empresaAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_empresaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_empleadoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_empleadoAsistenciaMensual);
			this.jInternalFrameDetalleFormAsistenciaMensual.jButtonid_empleadoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_empleadoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_cargoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_cargoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_estructuraAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_estructuraAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_anioAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_anioAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jComboBoxid_mesAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarid_mesAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jDateChooserfechaAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarfechaAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_trabajoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_trabajoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_atrasoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_atrasoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_faltasAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_faltasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_permisoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_permisoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra25AsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_extra25AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra50AsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_extra50AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra100AsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_extra100AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra150AsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_extra150AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_extra0AsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_extra0AsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_enfermoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_enfermoAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_maternidadAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_maternidadAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldhoras_vacacionAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarhoras_vacacionAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_diasAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarnumero_diasAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_nochesAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarnumero_nochesAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_feriadosAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarnumero_feriadosAsistenciaMensual);
		this.jInternalFrameDetalleFormAsistenciaMensual.jTextFieldnumero_trabajoAsistenciaMensual.setEnabled(this.asistenciamensualConstantesFunciones.activarnumero_trabajoAsistenciaMensual);
		}
	}
	
		
}