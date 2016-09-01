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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.seguridad.util.ProcesoCambiarEmpresaSucursalConstantesFunciones;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEmpresaSucursalParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.report.ProcesoCambiarEmpresaSucursalParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.report.ProcesoCambiarEmpresaSucursalBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.seguridad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.seguridad.util.*;

import com.bydan.erp.seguridad.util.report.*;
import com.bydan.erp.seguridad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.entity.report.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame extends ProcesoCambiarEmpresaSucursalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalValidator = new ClassValidator<ProcesoCambiarEmpresaSucursal>(ProcesoCambiarEmpresaSucursal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal;	
	public ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux;
	public ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalTotales;
	public Long idProcesoCambiarEmpresaSucursalActual;
	public Long iIdNuevoProcesoCambiarEmpresaSucursal=0L;
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
	
	public Boolean isPermisoTodoProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoNuevoProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoActualizarProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoEliminarProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoConsultaProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoBusquedaProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoReporteProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoCopiarProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoVerFormProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoDuplicarProcesoCambiarEmpresaSucursal;
	public Boolean isPermisoOrdenProcesoCambiarEmpresaSucursal;
	
	
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
	
	public ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalReturnGeneral;
	public ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCambiarEmpresaSucursal=false;
	public Boolean esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCambiarEmpresaSucursalSessionBeanAdditional procesocambiarempresasucursalSessionBeanAdditional=null;
	
	public ProcesoCambiarEmpresaSucursalSessionBeanAdditional getProcesoCambiarEmpresaSucursalSessionBeanAdditional() {
		return this.procesocambiarempresasucursalSessionBeanAdditional;
	}
	
	public void setProcesoCambiarEmpresaSucursalSessionBeanAdditional(ProcesoCambiarEmpresaSucursalSessionBeanAdditional procesocambiarempresasucursalSessionBeanAdditional) {
		try {
			this.procesocambiarempresasucursalSessionBeanAdditional=procesocambiarempresasucursalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional procesocambiarempresasucursalBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame
	
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional getProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional() {
		return this.procesocambiarempresasucursalBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional procesocambiarempresasucursalBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocambiarempresasucursalBeanSwingJInternalFrameAdditional=procesocambiarempresasucursalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCambiarEmpresaSucursalLogic procesocambiarempresasucursalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalBean;
	public ProcesoCambiarEmpresaSucursalConstantesFunciones procesocambiarempresasucursalConstantesFunciones;
	//public ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals;	
	//public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsEliminados;
	//public List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCambiarEmpresaSucursal=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoCambiarEmpresaSucursal() {
		return this.iIdNuevoProcesoCambiarEmpresaSucursal;
	}

	public void setiIdNuevoProcesoCambiarEmpresaSucursal(Long iIdNuevoProcesoCambiarEmpresaSucursal) {
		this.iIdNuevoProcesoCambiarEmpresaSucursal = iIdNuevoProcesoCambiarEmpresaSucursal;
	}
	
	public Long getidProcesoCambiarEmpresaSucursalActual() {
		return this.idProcesoCambiarEmpresaSucursalActual;
	}

	public void setidProcesoCambiarEmpresaSucursalActual(Long idProcesoCambiarEmpresaSucursalActual) {
		this.idProcesoCambiarEmpresaSucursalActual = idProcesoCambiarEmpresaSucursalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCambiarEmpresaSucursal getprocesocambiarempresasucursal() {
		return this.procesocambiarempresasucursal;
	}

	public void setprocesocambiarempresasucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) {
		this.procesocambiarempresasucursal = procesocambiarempresasucursal;
	}
	
	public ProcesoCambiarEmpresaSucursal getprocesocambiarempresasucursalAux() {
		return this.procesocambiarempresasucursalAux;
	}

	public void setprocesocambiarempresasucursalAux(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux) {
		this.procesocambiarempresasucursalAux = procesocambiarempresasucursalAux;
	}				
	
	public ProcesoCambiarEmpresaSucursal getprocesocambiarempresasucursalAnterior() {
		return this.procesocambiarempresasucursalAnterior;
	}

	public void setprocesocambiarempresasucursalAnterior(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAnterior) {
		this.procesocambiarempresasucursalAnterior = procesocambiarempresasucursalAnterior;
	}	
	
	public ProcesoCambiarEmpresaSucursal getprocesocambiarempresasucursalTotales() {
		return this.procesocambiarempresasucursalTotales;
	}

	public void setprocesocambiarempresasucursalTotales(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalTotales) {
		this.procesocambiarempresasucursalTotales = procesocambiarempresasucursalTotales;
	}	
	
	public ProcesoCambiarEmpresaSucursal getprocesocambiarempresasucursalBean() {
		return this.procesocambiarempresasucursalBean;
	}

	public void setprocesocambiarempresasucursalBean(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalBean) {
		this.procesocambiarempresasucursalBean = procesocambiarempresasucursalBean;
	}	
	
	public ProcesoCambiarEmpresaSucursalParameterReturnGeneral getprocesocambiarempresasucursalReturnGeneral() {
		return this.procesocambiarempresasucursalReturnGeneral;
	}

	public void setprocesocambiarempresasucursalReturnGeneral(ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalReturnGeneral) {
		this.procesocambiarempresasucursalReturnGeneral = procesocambiarempresasucursalReturnGeneral;
	}	
	
	
	public Long id_empresaBusquedaProcesoCambiarEmpresaSucursal=-1L;

	public Long getid_empresaBusquedaProcesoCambiarEmpresaSucursal() {
		return this.id_empresaBusquedaProcesoCambiarEmpresaSucursal;
	}

	public void setid_empresaBusquedaProcesoCambiarEmpresaSucursal(Long id_empresaBusquedaProcesoCambiarEmpresaSucursal) {
		this.id_empresaBusquedaProcesoCambiarEmpresaSucursal = id_empresaBusquedaProcesoCambiarEmpresaSucursal;
	}

;
	public Long id_sucursalBusquedaProcesoCambiarEmpresaSucursal=-1L;

	public Long getid_sucursalBusquedaProcesoCambiarEmpresaSucursal() {
		return this.id_sucursalBusquedaProcesoCambiarEmpresaSucursal;
	}

	public void setid_sucursalBusquedaProcesoCambiarEmpresaSucursal(Long id_sucursalBusquedaProcesoCambiarEmpresaSucursal) {
		this.id_sucursalBusquedaProcesoCambiarEmpresaSucursal = id_sucursalBusquedaProcesoCambiarEmpresaSucursal;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public ProcesoCambiarEmpresaSucursalLogic getProcesoCambiarEmpresaSucursalLogic()	{		
		return procesocambiarempresasucursalLogic;
	}

	public void setProcesoCambiarEmpresaSucursalLogic(ProcesoCambiarEmpresaSucursalLogic procesocambiarempresasucursalLogic) {
		this.procesocambiarempresasucursalLogic = procesocambiarempresasucursalLogic;
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
	
	public Boolean getIsEsNuevoProcesoCambiarEmpresaSucursal() {
		return isEsNuevoProcesoCambiarEmpresaSucursal;
	}

	public void setIsEsNuevoProcesoCambiarEmpresaSucursal(Boolean isEsNuevoProcesoCambiarEmpresaSucursal) {
		this.isEsNuevoProcesoCambiarEmpresaSucursal = isEsNuevoProcesoCambiarEmpresaSucursal;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal() {
		return esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal(Boolean esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal) {
		this.esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal = esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal;
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

			if(this.procesocambiarempresasucursalSessionBean==null) {
				this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
			}

			if(!this.procesocambiarempresasucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesocambiarempresasucursalSessionBean.getlidEmpresaActual());
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

			if(this.procesocambiarempresasucursalSessionBean==null) {
				this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
			}

			if(!this.procesocambiarempresasucursalSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesocambiarempresasucursalSessionBean.getlidSucursalActual());
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

					if(this.procesocambiarempresasucursal!=null) {
						this.procesocambiarempresasucursal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresaTemp!=null && jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal!=null) {
						jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(empresaTemp);
					} else {
						if(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal!=null) {
							//jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(empresaTemp);
							if(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getItemCount()>0) {
								jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico)throws Exception
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
				jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico!=null && jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico.setSelectedIndex(0);
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

					if(this.procesocambiarempresasucursal!=null) {
						this.procesocambiarempresasucursal.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal") || sFormularioTipoBusqueda.equals("Todos")){
					if(sucursalTemp!=null && jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal!=null) {
						jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursalTemp);
					} else {
						if(jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal!=null) {
							//jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursalTemp);
							if(jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getItemCount()>0) {
								jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico!=null && jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,JComboBox jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoCambiarEmpresaSucursalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesocambiarempresasucursal.setid_empresa(empresaAux.getId());
				procesocambiarempresasucursal.setempresa_descripcion(ProcesoCambiarEmpresaSucursalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesocambiarempresasucursal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,JComboBox jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoCambiarEmpresaSucursalGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesocambiarempresasucursal.setid_sucursal(sucursalAux.getId());
				procesocambiarempresasucursal.setsucursal_descripcion(ProcesoCambiarEmpresaSucursalConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesocambiarempresasucursal.setSucursal(sucursalAux);			}
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

					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { 
					}

					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addItem(empresa);
							}
						}

						if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { 
					}

					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addItem(sucursal);
							}
						}

						if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(empresa);
						} else {
							this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedItem(sucursal);
						} else {
							this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCambiarEmpresaSucursal() throws Exception {
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
		
	public ProcesoCambiarEmpresaSucursalParameterReturnGeneral getProcesoCambiarEmpresaSucursalParameterGeneral() {
		return this.procesocambiarempresasucursalParameterGeneral;
	}
	
	public void setProcesoCambiarEmpresaSucursalParameterGeneral(ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalParameterGeneral) {
		this.procesocambiarempresasucursalParameterGeneral = procesocambiarempresasucursalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCambiarEmpresaSucursal() {
		return isPermisoTodoProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoTodoProcesoCambiarEmpresaSucursal(Boolean isPermisoTodoProcesoCambiarEmpresaSucursal) {
		this.isPermisoTodoProcesoCambiarEmpresaSucursal = isPermisoTodoProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoNuevoProcesoCambiarEmpresaSucursal() {
		return isPermisoNuevoProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoNuevoProcesoCambiarEmpresaSucursal(Boolean isPermisoNuevoProcesoCambiarEmpresaSucursal) {
		this.isPermisoNuevoProcesoCambiarEmpresaSucursal = isPermisoNuevoProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoActualizarProcesoCambiarEmpresaSucursal() {
		return isPermisoActualizarProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoActualizarProcesoCambiarEmpresaSucursal(Boolean isPermisoActualizarProcesoCambiarEmpresaSucursal) {
		this.isPermisoActualizarProcesoCambiarEmpresaSucursal = isPermisoActualizarProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoEliminarProcesoCambiarEmpresaSucursal() {
		return isPermisoEliminarProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoEliminarProcesoCambiarEmpresaSucursal(Boolean isPermisoEliminarProcesoCambiarEmpresaSucursal) {
		this.isPermisoEliminarProcesoCambiarEmpresaSucursal = isPermisoEliminarProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCambiarEmpresaSucursal() {
		return isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoGuardarCambiosProcesoCambiarEmpresaSucursal(Boolean isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal) {
		this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal = isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoConsultaProcesoCambiarEmpresaSucursal() {
		return isPermisoConsultaProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoConsultaProcesoCambiarEmpresaSucursal(Boolean isPermisoConsultaProcesoCambiarEmpresaSucursal) {
		this.isPermisoConsultaProcesoCambiarEmpresaSucursal = isPermisoConsultaProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoBusquedaProcesoCambiarEmpresaSucursal() {
		return isPermisoBusquedaProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoBusquedaProcesoCambiarEmpresaSucursal(Boolean isPermisoBusquedaProcesoCambiarEmpresaSucursal) {
		this.isPermisoBusquedaProcesoCambiarEmpresaSucursal = isPermisoBusquedaProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsPermisoReporteProcesoCambiarEmpresaSucursal() {
		return isPermisoReporteProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoReporteProcesoCambiarEmpresaSucursal(Boolean isPermisoReporteProcesoCambiarEmpresaSucursal) {
		this.isPermisoReporteProcesoCambiarEmpresaSucursal = isPermisoReporteProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCambiarEmpresaSucursal() {
		return isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoPaginacionMedioProcesoCambiarEmpresaSucursal(Boolean isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal) {
		this.isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal = isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCambiarEmpresaSucursal() {
		return isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoPaginacionTodoProcesoCambiarEmpresaSucursal(Boolean isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal) {
		this.isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal = isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCambiarEmpresaSucursal() {
		return isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoPaginacionAltoProcesoCambiarEmpresaSucursal(Boolean isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal) {
		this.isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal = isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoCopiarProcesoCambiarEmpresaSucursal() {
		return isPermisoCopiarProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoCopiarProcesoCambiarEmpresaSucursal(Boolean isPermisoCopiarProcesoCambiarEmpresaSucursal) {
		this.isPermisoCopiarProcesoCambiarEmpresaSucursal = isPermisoCopiarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoVerFormProcesoCambiarEmpresaSucursal() {
		return isPermisoVerFormProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoVerFormProcesoCambiarEmpresaSucursal(Boolean isPermisoVerFormProcesoCambiarEmpresaSucursal) {
		this.isPermisoVerFormProcesoCambiarEmpresaSucursal = isPermisoVerFormProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCambiarEmpresaSucursal() {
		return isPermisoDuplicarProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoDuplicarProcesoCambiarEmpresaSucursal(Boolean isPermisoDuplicarProcesoCambiarEmpresaSucursal) {
		this.isPermisoDuplicarProcesoCambiarEmpresaSucursal = isPermisoDuplicarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsPermisoOrdenProcesoCambiarEmpresaSucursal() {
		return isPermisoOrdenProcesoCambiarEmpresaSucursal;
	}

	public void setIsPermisoOrdenProcesoCambiarEmpresaSucursal(Boolean isPermisoOrdenProcesoCambiarEmpresaSucursal) {
		this.isPermisoOrdenProcesoCambiarEmpresaSucursal = isPermisoOrdenProcesoCambiarEmpresaSucursal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal = isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal = isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal = isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal = isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal = isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal() {
		return isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal(Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal = isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal;
	}
		
	public ProcesoCambiarEmpresaSucursalSessionBean getprocesocambiarempresasucursalSessionBean() {
		return this.procesocambiarempresasucursalSessionBean;
	}
	
	public void setprocesocambiarempresasucursalSessionBean(ProcesoCambiarEmpresaSucursalSessionBean procesocambiarempresasucursalSessionBean) {
		this.procesocambiarempresasucursalSessionBean=procesocambiarempresasucursalSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCambiarEmpresaSucursal() {
		return this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal;
	}

	public void setisVisibilidadBusquedaProcesoCambiarEmpresaSucursal(Boolean isVisibilidadBusquedaProcesoCambiarEmpresaSucursal) {
		this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal=isVisibilidadBusquedaProcesoCambiarEmpresaSucursal;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesocambiarempresasucursal,null);
				this.setActualParaGuardarSucursalForeignKey(procesocambiarempresasucursal,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocambiarempresasucursalAux.setId(procesocambiarempresasucursal.getId());
		procesocambiarempresasucursalAux.setVersionRow(procesocambiarempresasucursal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal) throws Exception {
		
		if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal) throws Exception {	
		if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesocambiarempresasucursalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesocambiarempresasucursalLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCambiarEmpresaSucursalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocambiarempresasucursalValidator.getInvalidValues(this.procesocambiarempresasucursal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursals) throws Exception {
		try	{			
			ProcesoCambiarEmpresaSucursalConstantesFunciones.actualizarSelectedLista(procesocambiarempresasucursal,procesocambiarempresasucursals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocambiarempresasucursalsLocal=this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocambiarempresasucursalsLocal=this.procesocambiarempresasucursals;
			}
			//ARCHITECTURE
		
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal:procesocambiarempresasucursalsLocal) {
				if(this.permiteMantenimiento(procesocambiarempresasucursalLocal) && procesocambiarempresasucursalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCambiarEmpresaSucursalConstantesFunciones.getProcesoCambiarEmpresaSucursalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
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
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		
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
		this.iIdNuevoProcesoCambiarEmpresaSucursal--;	
		
		
		this.procesocambiarempresasucursalAux=new ProcesoCambiarEmpresaSucursal();
		
		this.procesocambiarempresasucursalAux.setId(this.iIdNuevoProcesoCambiarEmpresaSucursal);
		this.procesocambiarempresasucursalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().add(this.procesocambiarempresasucursalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocambiarempresasucursals.add(this.procesocambiarempresasucursalAux);
		}
		//ARCHITECTURE
		
		this.procesocambiarempresasucursal=this.procesocambiarempresasucursalAux;
		
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
		}
				
		//this.setDefaultControlesProcesoCambiarEmpresaSucursal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalBean,this.procesocambiarempresasucursal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral,this.procesocambiarempresasucursalBean,false);
		
		if(this.procesocambiarempresasucursalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal());
		}
		
		if(this.procesocambiarempresasucursalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal(),classes);//this.procesocambiarempresasucursalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCambiarEmpresaSucursal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.RecargarFormProcesoCambiarEmpresaSucursal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
						
			if(procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();
			}
			
			this.actualizarVisualTableDatosProcesoCambiarEmpresaSucursal();
			
			this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEmpresaSucursal(), this.getIndiceNuevoProcesoCambiarEmpresaSucursal());
			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setEnabled(isHabilitar && this.procesocambiarempresasucursalConstantesFunciones.activarid_empresaProcesoCambiarEmpresaSucursal);//
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setEnabled(isHabilitar && this.procesocambiarempresasucursalConstantesFunciones.activarid_sucursalProcesoCambiarEmpresaSucursal);
	};
	
	public void setDefaultControlesProcesoCambiarEmpresaSucursal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCambiarEmpresaSucursal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(true);			
			this.procesocambiarempresasucursalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setVisible(true);
			
					
		} else {
			//this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(false);			
			this.procesocambiarempresasucursalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCambiarEmpresaSucursal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				if(procesocambiarempresasucursalAux.getId().equals(this.iIdNuevoProcesoCambiarEmpresaSucursal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursals) {
				if(procesocambiarempresasucursalAux.getId().equals(this.iIdNuevoProcesoCambiarEmpresaSucursal)) {
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
	
	public int getIndiceActualProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				if(procesocambiarempresasucursalAux.getId().equals(procesocambiarempresasucursal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursals) {
				if(procesocambiarempresasucursalAux.getId().equals(procesocambiarempresasucursal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				if(procesocambiarempresasucursalAux.getProcesoCambiarEmpresaSucursalOriginal().getId().equals(procesocambiarempresasucursalOriginal.getId())) {
					existe=true;
					procesocambiarempresasucursalOriginal.setId(procesocambiarempresasucursalAux.getId());
					procesocambiarempresasucursalOriginal.setVersionRow(procesocambiarempresasucursalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursals) {
				if(procesocambiarempresasucursalAux.getProcesoCambiarEmpresaSucursalOriginal().getId().equals(procesocambiarempresasucursalOriginal.getId())) {
					existe=true;
					procesocambiarempresasucursalOriginal.setId(procesocambiarempresasucursalAux.getId());
					procesocambiarempresasucursalOriginal.setVersionRow(procesocambiarempresasucursalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCambiarEmpresaSucursal(Boolean esParaCancelar) throws Exception {
		procesocambiarempresasucursalsAux=new ArrayList<ProcesoCambiarEmpresaSucursal>();
		procesocambiarempresasucursalAux=new ProcesoCambiarEmpresaSucursal();
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
					if(procesocambiarempresasucursalAux.getId()<0) {
						procesocambiarempresasucursalsAux.add(procesocambiarempresasucursalAux);
					}		
				}
				this.iIdNuevoProcesoCambiarEmpresaSucursal=0L;
				this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().removeAll(procesocambiarempresasucursalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursals) {
					if(procesocambiarempresasucursalAux.getId()<0) {
						procesocambiarempresasucursalsAux.add(procesocambiarempresasucursalAux);
					}		
				}
				this.iIdNuevoProcesoCambiarEmpresaSucursal=0L;
				this.procesocambiarempresasucursals.removeAll(procesocambiarempresasucursalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarEmpresaSucursal 
					&& this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size()>0
					) {
					procesocambiarempresasucursalAux=this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().get(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size() - 1);
				
					if(procesocambiarempresasucursalAux.getId()<0) {
						this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().remove(procesocambiarempresasucursalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarEmpresaSucursal && this.procesocambiarempresasucursals.size()>0) {
					procesocambiarempresasucursalAux=this.procesocambiarempresasucursals.get(this.procesocambiarempresasucursals.size() - 1);
				
					if(procesocambiarempresasucursalAux.getId()<0) {
						this.procesocambiarempresasucursals.remove(procesocambiarempresasucursalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCambiarEmpresaSucursal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocambiarempresasucursal.getId()<0) {
				this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().remove(this.procesocambiarempresasucursal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocambiarempresasucursal.getId()<0) {
				this.procesocambiarempresasucursals.remove(this.procesocambiarempresasucursal);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCambiarEmpresaSucursal(List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsAux) throws Exception {
		ProcesoCambiarEmpresaSucursalConstantesFunciones.setEstadosInicialesProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalsAux);
	}
	
	public void setEstadosInicialesProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux) throws Exception {
		ProcesoCambiarEmpresaSucursalConstantesFunciones.setEstadosInicialesProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCambiarEmpresaSucursalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCambiarEmpresaSucursalActual()) {
				if(!this.isEsNuevoProcesoCambiarEmpresaSucursal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCambiarEmpresaSucursalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cambiar Empresa Sucursal ?", "MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) throws Exception {
		ProcesoCambiarEmpresaSucursalConstantesFunciones.seleccionarAsignar(this.procesocambiarempresasucursal,procesocambiarempresasucursal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCambiarEmpresaSucursal=this.isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal;
			
			
			this.seleccionarAsignar(procesocambiarempresasucursal);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocambiarempresasucursalSessionBean.setsFuncionBusquedaRapida(this.procesocambiarempresasucursalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCambiarEmpresaSucursal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCambiarEmpresaSucursal(esParaCancelar);				
				this.cancelarNuevoProcesoCambiarEmpresaSucursal(esParaCancelar);								
			}
			
			this.procesocambiarempresasucursal=new ProcesoCambiarEmpresaSucursal();
			
			this.inicializarProcesoCambiarEmpresaSucursal();
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCambiarEmpresaSucursal() throws Exception {
		try {
			ProcesoCambiarEmpresaSucursalConstantesFunciones.inicializarProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCambiarEmpresaSucursals(String sAccionBusqueda,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCambiarEmpresaSucursal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCambiarEmpresaSucursalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCambiarEmpresaSucursalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCambiarEmpresaSucursal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cambiar Empresa Sucursales");		
		parameters.put("busquedapor", ProcesoCambiarEmpresaSucursalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCambiarEmpresaSucursal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCambiarEmpresaSucursal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCambiarEmpresaSucursalBean.TraerProcesoCambiarEmpresaSucursalBeans(procesocambiarempresasucursalsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(null);
					//this.generarExcelReporteProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCambiarEmpresaSucursals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarempresasucursalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCambiarEmpresaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEmpresaSucursals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarEmpresaSucursal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal : procesocambiarempresasucursalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCambiarEmpresaSucursalConstantesFunciones.generarExcelReporteDataProcesoCambiarEmpresaSucursal("NORMAL",row,workbook,procesocambiarempresasucursal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCambiarEmpresaSucursal(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCambiarEmpresaSucursalConstantesFunciones.generarExcelReporteHeaderProcesoCambiarEmpresaSucursal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCambiarEmpresaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEmpresaSucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal : procesocambiarempresasucursalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.getProcesoCambiarEmpresaSucursalDescripcion(procesocambiarempresasucursal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarempresasucursal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarempresasucursal.getsucursal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCambiarEmpresaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsRespaldo=null;
		
		classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocambiarempresasucursalLogic.setDatosCliente(this.datosCliente);
		this.procesocambiarempresasucursalLogic.setDatosDeep(this.datosDeep);
		this.procesocambiarempresasucursalLogic.setIsConDeep(true);
		
		procesocambiarempresasucursalsRespaldo=this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals();
		
		this.procesocambiarempresasucursalLogic.setProcesoCambiarEmpresaSucursals(procesocambiarempresasucursalsParaReportes);	
		this.procesocambiarempresasucursalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocambiarempresasucursalsParaReportes=this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals();
		this.procesocambiarempresasucursalLogic.setProcesoCambiarEmpresaSucursals(procesocambiarempresasucursalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEmpresaSucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarEmpresaSucursal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal : procesocambiarempresasucursalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCambiarEmpresaSucursal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCambiarEmpresaSucursalConstantesFunciones.generarExcelReporteDataProcesoCambiarEmpresaSucursal("NORMAL",row,workbook,procesocambiarempresasucursal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.getProcesoCambiarEmpresaSucursalDescripcion(procesocambiarempresasucursal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCambiarEmpresaSucursal() throws Exception {		
		this.startProcessProcesoCambiarEmpresaSucursal(true);
	}
	
	public void startProcessProcesoCambiarEmpresaSucursal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal ,this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal, this.jScrollPanelDatosProcesoCambiarEmpresaSucursal,this.jPanelPaginacionProcesoCambiarEmpresaSucursal, this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal, this.jPanelAccionesProcesoCambiarEmpresaSucursal,this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal,this.jmenuBarProcesoCambiarEmpresaSucursal,this.jmenuBarDetalleProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal=this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarEmpresaSucursal=this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal;
		//final JScrollPane jScrollPanelDatosProcesoCambiarEmpresaSucursal=this.jScrollPanelDatosProcesoCambiarEmpresaSucursal;
		final JTable jTableDatosProcesoCambiarEmpresaSucursal=this.jTableDatosProcesoCambiarEmpresaSucursal;		
		final JPanel jPanelPaginacionProcesoCambiarEmpresaSucursal=this.jPanelPaginacionProcesoCambiarEmpresaSucursal;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal=this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal;
		final JPanel jPanelAccionesProcesoCambiarEmpresaSucursal=this.jPanelAccionesProcesoCambiarEmpresaSucursal;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelCamposProcesoCambiarEmpresaSucursal;
			jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal;
		}
		
		final JPanel jPanelCamposProcesoCambiarEmpresaSucursal=jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal;
		final JPanel jPanelAccionesFormularioProcesoCambiarEmpresaSucursal=jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal;
		
		
		final JMenuBar jmenuBarProcesoCambiarEmpresaSucursal=this.jmenuBarProcesoCambiarEmpresaSucursal;
		final JToolBar jTtoolBarProcesoCambiarEmpresaSucursal=this.jTtoolBarProcesoCambiarEmpresaSucursal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jmenuBarDetalleProcesoCambiarEmpresaSucursal;
			jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTtoolBarDetalleProcesoCambiarEmpresaSucursal;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarEmpresaSucursal=jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal;
		final JToolBar jTtoolBarDetalleProcesoCambiarEmpresaSucursal=jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarEmpresaSucursal;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarEmpresaSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarEmpresaSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarEmpresaSucursal;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarEmpresaSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarEmpresaSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal ,jPanelParametrosReportesProcesoCambiarEmpresaSucursal,jTableDatosProcesoCambiarEmpresaSucursal, /*jScrollPanelDatosProcesoCambiarEmpresaSucursal,*/jPanelCamposProcesoCambiarEmpresaSucursal,jPanelPaginacionProcesoCambiarEmpresaSucursal, /*jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal,*/ jPanelAccionesProcesoCambiarEmpresaSucursal,jPanelAccionesFormularioProcesoCambiarEmpresaSucursal,jmenuBarProcesoCambiarEmpresaSucursal,jmenuBarDetalleProcesoCambiarEmpresaSucursal,jTtoolBarProcesoCambiarEmpresaSucursal,jTtoolBarDetalleProcesoCambiarEmpresaSucursal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal ,jPanelParametrosReportesProcesoCambiarEmpresaSucursal, jScrollPanelDatosProcesoCambiarEmpresaSucursal,jPanelPaginacionProcesoCambiarEmpresaSucursal, jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal, jPanelAccionesProcesoCambiarEmpresaSucursal,jPanelAccionesFormularioProcesoCambiarEmpresaSucursal,jmenuBarProcesoCambiarEmpresaSucursal,jmenuBarDetalleProcesoCambiarEmpresaSucursal,jTtoolBarProcesoCambiarEmpresaSucursal,jTtoolBarDetalleProcesoCambiarEmpresaSucursal);
						
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
	
	public void finishProcessProcesoCambiarEmpresaSucursal() {// throws Exception 
		this.finishProcessProcesoCambiarEmpresaSucursal(true);
	}
	
	public void finishProcessProcesoCambiarEmpresaSucursal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal ,this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal, this.jScrollPanelDatosProcesoCambiarEmpresaSucursal,this.jPanelPaginacionProcesoCambiarEmpresaSucursal, this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal, this.jPanelAccionesProcesoCambiarEmpresaSucursal,this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal,this.jmenuBarProcesoCambiarEmpresaSucursal,this.jmenuBarDetalleProcesoCambiarEmpresaSucursal,this.jTtoolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal=this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarEmpresaSucursal=this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal;
		//final JScrollPane jScrollPanelDatosProcesoCambiarEmpresaSucursal=this.jScrollPanelDatosProcesoCambiarEmpresaSucursal;
		final JTable jTableDatosProcesoCambiarEmpresaSucursal=this.jTableDatosProcesoCambiarEmpresaSucursal;		
		final JPanel jPanelPaginacionProcesoCambiarEmpresaSucursal=this.jPanelPaginacionProcesoCambiarEmpresaSucursal;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal=this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal;
		final JPanel jPanelAccionesProcesoCambiarEmpresaSucursal=this.jPanelAccionesProcesoCambiarEmpresaSucursal;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelCamposProcesoCambiarEmpresaSucursal;
			jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal;
		}
		
		final JPanel jPanelCamposProcesoCambiarEmpresaSucursal=jPanelCamposAuxiliarProcesoCambiarEmpresaSucursal;
		final JPanel jPanelAccionesFormularioProcesoCambiarEmpresaSucursal=jPanelAccionesFormularioAuxiliarProcesoCambiarEmpresaSucursal;
		
		
		final JMenuBar jmenuBarProcesoCambiarEmpresaSucursal=this.jmenuBarProcesoCambiarEmpresaSucursal;		
		final JToolBar jTtoolBarProcesoCambiarEmpresaSucursal=this.jTtoolBarProcesoCambiarEmpresaSucursal;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jmenuBarDetalleProcesoCambiarEmpresaSucursal;
			jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTtoolBarDetalleProcesoCambiarEmpresaSucursal;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarEmpresaSucursal=jmenuBarDetalleAuxiliarProcesoCambiarEmpresaSucursal;
		final JToolBar jTtoolBarDetalleProcesoCambiarEmpresaSucursal=jTtoolBarDetalleAuxiliarProcesoCambiarEmpresaSucursal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarEmpresaSucursal;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarEmpresaSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarEmpresaSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarEmpresaSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarEmpresaSucursal;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarEmpresaSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarEmpresaSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal ,jPanelParametrosReportesProcesoCambiarEmpresaSucursal, jTableDatosProcesoCambiarEmpresaSucursal,/*jScrollPanelDatosProcesoCambiarEmpresaSucursal,*/jPanelCamposProcesoCambiarEmpresaSucursal,jPanelPaginacionProcesoCambiarEmpresaSucursal, /*jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal,*/ jPanelAccionesProcesoCambiarEmpresaSucursal,jPanelAccionesFormularioProcesoCambiarEmpresaSucursal,jmenuBarProcesoCambiarEmpresaSucursal,jmenuBarDetalleProcesoCambiarEmpresaSucursal,jTtoolBarProcesoCambiarEmpresaSucursal,jTtoolBarDetalleProcesoCambiarEmpresaSucursal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCambiarEmpresaSucursal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCambiarEmpresaSucursal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCambiarEmpresaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCambiarEmpresaSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCambiarEmpresaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCambiarEmpresaSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCambiarEmpresaSucursal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocambiarempresasucursalConstantesFunciones.getsFinalQueryProcesoCambiarEmpresaSucursal();
		String  finalQueryPaginacionTodos=this.procesocambiarempresasucursalConstantesFunciones.getsFinalQueryProcesoCambiarEmpresaSucursal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCambiarEmpresaSucursalConstantesFunciones.getArrayColumnasGlobalesNoProcesoCambiarEmpresaSucursal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCambiarEmpresaSucursalConstantesFunciones.getArrayColumnasGlobalesProcesoCambiarEmpresaSucursal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCambiarEmpresaSucursalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocambiarempresasucursalsEliminados= new ArrayList<ProcesoCambiarEmpresaSucursal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCambiarEmpresaSucursal();
		
				///*ProcesoCambiarEmpresaSucursalSessionBean*/this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
			
			if(this.procesocambiarempresasucursalSessionBean==null) {
				this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
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
					this.iNumeroPaginacion=ProcesoCambiarEmpresaSucursalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesForeignKeysOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocambiarempresasucursal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocambiarempresasucursalsAux= new ArrayList<ProcesoCambiarEmpresaSucursal>();
			
				
			procesocambiarempresasucursalLogic.setDatosCliente(this.datosCliente);
			procesocambiarempresasucursalLogic.setDatosDeep(this.datosDeep);
			procesocambiarempresasucursalLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal")) {
				this.sDetalleReporte=ProcesoCambiarEmpresaSucursalConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEmpresaSucursal(id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarEmpresaSucursalConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEmpresaSucursal(id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarEmpresaSucursalConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEmpresaSucursal(id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()==null||procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocambiarempresasucursals==null|| procesocambiarempresasucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarempresasucursalsAux=new ArrayList<ProcesoCambiarEmpresaSucursal>();
						procesocambiarempresasucursalsAux.addAll(procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarempresasucursalsAux=new ArrayList<ProcesoCambiarEmpresaSucursal>();
							procesocambiarempresasucursalsAux.addAll(procesocambiarempresasucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarEmpresaSucursalConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEmpresaSucursal(id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarEmpresaSucursalConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEmpresaSucursal(id_empresaBusquedaProcesoCambiarEmpresaSucursal,id_sucursalBusquedaProcesoCambiarEmpresaSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCambiarEmpresaSucursals("BusquedaProcesoCambiarEmpresaSucursal",procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCambiarEmpresaSucursals("BusquedaProcesoCambiarEmpresaSucursal",procesocambiarempresasucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarempresasucursalLogic.setProcesoCambiarEmpresaSucursals(new ArrayList<ProcesoCambiarEmpresaSucursal>());
						procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().addAll(procesocambiarempresasucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarempresasucursals=new ArrayList<ProcesoCambiarEmpresaSucursal>();
							procesocambiarempresasucursals.addAll(procesocambiarempresasucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCambiarEmpresaSucursal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCambiarEmpresaSucursal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarempresasucursals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarempresasucursals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) {
		Boolean permite=true;
		
		if(this.procesocambiarempresasucursal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCambiarEmpresaSucursalConstantesFunciones.getOrderByListaProcesoCambiarEmpresaSucursal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCambiarEmpresaSucursalConstantesFunciones.getOrderByListaProcesoCambiarEmpresaSucursal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				if(procesocambiarempresasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarempresasucursalTotales=procesocambiarempresasucursal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:this.procesocambiarempresasucursals) {
				if(procesocambiarempresasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarempresasucursalTotales=procesocambiarempresasucursal;
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
			this.procesocambiarempresasucursalAux=new ProcesoCambiarEmpresaSucursal();
			this.procesocambiarempresasucursalAux.setsType(Constantes2.S_TOTALES);
			this.procesocambiarempresasucursalAux.setIsNew(false);
			this.procesocambiarempresasucursalAux.setIsChanged(false);
			this.procesocambiarempresasucursalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCambiarEmpresaSucursalConstantesFunciones.TotalizarValoresFilaProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals(),this.procesocambiarempresasucursalAux);
				
				//this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().add(this.procesocambiarempresasucursalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCambiarEmpresaSucursalConstantesFunciones.TotalizarValoresFilaProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursals,this.procesocambiarempresasucursalAux);
				
				this.procesocambiarempresasucursals.add(this.procesocambiarempresasucursalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocambiarempresasucursalTotales=new ProcesoCambiarEmpresaSucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().remove(procesocambiarempresasucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarempresasucursals.remove(procesocambiarempresasucursalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocambiarempresasucursalTotales=new ProcesoCambiarEmpresaSucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				if(procesocambiarempresasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarempresasucursalTotales=procesocambiarempresasucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarEmpresaSucursalConstantesFunciones.TotalizarValoresFilaProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals(),procesocambiarempresasucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:this.procesocambiarempresasucursals) {
				if(procesocambiarempresasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarempresasucursalTotales=procesocambiarempresasucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarEmpresaSucursalConstantesFunciones.TotalizarValoresFilaProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursals,procesocambiarempresasucursalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCambiarEmpresaSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarEmpresaSucursalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarEmpresaSucursalsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal(String sFinalQuery,Long id_empresa,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal(sFinalQuery,this.pagination,id_empresa,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarEmpresaSucursalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarEmpresaSucursalsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursalsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoCambiarEmpresaSucursal() {
		this.isPermisoTodoProcesoCambiarEmpresaSucursal=false;
		this.isPermisoNuevoProcesoCambiarEmpresaSucursal=false;
		this.isPermisoActualizarProcesoCambiarEmpresaSucursal=false;
		this.isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal=false;
		this.isPermisoEliminarProcesoCambiarEmpresaSucursal=false;
		this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal=false;
		this.isPermisoConsultaProcesoCambiarEmpresaSucursal=true;
		this.isPermisoBusquedaProcesoCambiarEmpresaSucursal=true;
		this.isPermisoReporteProcesoCambiarEmpresaSucursal=true;
		this.isPermisoOrdenProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoCopiarProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoVerFormProcesoCambiarEmpresaSucursal=false;		
		this.isPermisoDuplicarProcesoCambiarEmpresaSucursal=false;
		this.isPermisoOrdenProcesoCambiarEmpresaSucursal=false;
	}
	
	public void setPermisosUsuarioProcesoCambiarEmpresaSucursal(Boolean isPermiso) {
		this.isPermisoTodoProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoNuevoProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoActualizarProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoEliminarProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoConsultaProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoBusquedaProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoReporteProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoOrdenProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoCopiarProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoVerFormProcesoCambiarEmpresaSucursal=isPermiso;		
		this.isPermisoDuplicarProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoOrdenProcesoCambiarEmpresaSucursal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCambiarEmpresaSucursal(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoNuevoProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoActualizarProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoEliminarProcesoCambiarEmpresaSucursal=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal=isPermiso;
		//this.isPermisoConsultaProcesoCambiarEmpresaSucursal=isPermiso;
		//this.isPermisoBusquedaProcesoCambiarEmpresaSucursal=isPermiso;
		//this.isPermisoReporteProcesoCambiarEmpresaSucursal=isPermiso;
		//this.isPermisoOrdenProcesoCambiarEmpresaSucursal=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal=isPermiso;		
		//this.isPermisoCopiarProcesoCambiarEmpresaSucursal=isPermiso;		
		//this.isPermisoDuplicarProcesoCambiarEmpresaSucursal=isPermiso;
		//this.isPermisoOrdenProcesoCambiarEmpresaSucursal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarEmpresaSucursalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCambiarEmpresaSucursal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarEmpresaSucursalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCambiarEmpresaSucursalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCambiarEmpresaSucursalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCambiarEmpresaSucursalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCambiarEmpresaSucursal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCambiarEmpresaSucursalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCambiarEmpresaSucursal=this.isPermisoActualizarProcesoCambiarEmpresaSucursal;
			this.isPermisoEliminarProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCambiarEmpresaSucursal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarEmpresaSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.setToolTipText(this.jTableDatosProcesoCambiarEmpresaSucursal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCambiarEmpresaSucursal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCambiarEmpresaSucursal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCambiarEmpresaSucursal() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCambiarEmpresaSucursalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCambiarEmpresaSucursalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if(cargarCombosDependencia && (this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.procesocambiarempresasucursalSessionBean==null) {
				this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
			}

			if(!this.procesocambiarempresasucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesocambiarempresasucursalSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEmpresa("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCambiarEmpresaSucursal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEmpresa(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyEmpresa(JComboBox jComboBoxEmpresaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Empresa empresaLocal=(Empresa)jComboBoxEmpresaGenerico.getSelectedItem();

			if(empresaLocal!=null  && empresaLocal.getId()!=null  && empresaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_empresa="+empresaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboSucursal=sFinalQueryCombo;

			this.sucursalsForeignKey=new ArrayList<Sucursal>();
			this.cargarCombosForeignKeySucursal(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.addItemListener(new ComboBoxItemListener(this,"id_empresaProcesoCambiarEmpresaSucursal"));
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.addFocusListener(new ComboBoxFocusListener(this,"id_empresaProcesoCambiarEmpresaSucursal"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.addActionListener(new ComboBoxActionListener(this,"id_empresaProcesoCambiarEmpresaSucursal"));
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.addFocusListener(new ComboBoxFocusListener(this,"id_empresaProcesoCambiarEmpresaSucursal"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));

						this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));

					} else {
						this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));

						this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCambiarEmpresaSucursal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCambiarEmpresaSucursal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCambiarEmpresaSucursal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormProcesoCambiarEmpresaSucursalEmpresa(JComboBox<?> jComboBoxGenericoEmpresa,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProcesoCambiarEmpresaSucursalid_sucursal(jComboBoxGenericoEmpresa,sFormularioTipoBusqueda,"Empresa",false);
	}


	
	



	public void recargarFormProcesoCambiarEmpresaSucursalid_sucursal(JComboBox<?> jComboBoxGenericoSucursal,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Empresa")){
				this.setActualParaGuardarEmpresaForeignKey(this.procesocambiarempresasucursal,jComboBoxGenericoSucursal);
			}

			if(this.procesocambiarempresasucursal.getid_empresa()!=null && this.procesocambiarempresasucursal.getid_empresa()!=0L) {
				sFinalQuery+="  WHERE  id_empresa="+this.procesocambiarempresasucursal.getid_empresa();
			} else {
				sFinalQuery+="  WHERE  id_empresa=-1";
			}



			//BUCLE RECURSIVO
			this.setActualSucursalForeignKey(this.procesocambiarempresasucursal.getid_empresa(),true,sFormularioTipoBusqueda);

			this.cargarCombosSucursalsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean(); 
		this.procesocambiarempresasucursalConstantesFunciones=new ProcesoCambiarEmpresaSucursalConstantesFunciones(); 
		this.procesocambiarempresasucursalBean=new ProcesoCambiarEmpresaSucursal();//(this.procesocambiarempresasucursalConstantesFunciones); 		
		this.procesocambiarempresasucursalReturnGeneral=new ProcesoCambiarEmpresaSucursalParameterReturnGeneral(); 
		
		this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarempresasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCambiarEmpresaSucursal(true);
			
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
			
			this.procesocambiarempresasucursalConstantesFunciones=new ProcesoCambiarEmpresaSucursalConstantesFunciones(); 
			this.procesocambiarempresasucursalBean=new ProcesoCambiarEmpresaSucursal();//this.procesocambiarempresasucursalConstantesFunciones); 			
			this.procesocambiarempresasucursalReturnGeneral=new ProcesoCambiarEmpresaSucursalParameterReturnGeneral(); 
		
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Empresa Sucursal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocambiarempresasucursal=new ProcesoCambiarEmpresaSucursal();
			this.procesocambiarempresasucursals = new ArrayList<ProcesoCambiarEmpresaSucursal>();
			this.procesocambiarempresasucursalsAux = new ArrayList<ProcesoCambiarEmpresaSucursal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic=new ProcesoCambiarEmpresaSucursalLogic();
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocambiarempresasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal);	
					}
					
					if(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal);
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal);
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal);
					this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setVisible(false);
					this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal);
					this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setVisible(false);
					this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCambiarEmpresaSucursalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCambiarEmpresaSucursalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocambiarempresasucursalReturnGeneral=new ProcesoCambiarEmpresaSucursalParameterReturnGeneral();
			
			this.procesocambiarempresasucursalParameterGeneral=new ProcesoCambiarEmpresaSucursalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocambiarempresasucursalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarEmpresaSucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado(),this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarEmpresaSucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado(),this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			
			
			this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCambiarEmpresaSucursal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCambiarEmpresaSucursal(false);
			
			this.setPermisosUsuarioProcesoCambiarEmpresaSucursal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado() && this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCambiarEmpresaSucursalClasesRelacionadas();
			}
			
			if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCambiarEmpresaSucursalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCambiarEmpresaSucursal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEmpresaSucursal();
			}
			
			if(!this.isPermisoBusquedaProcesoCambiarEmpresaSucursal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCambiarEmpresaSucursalConstantesFunciones.getTiposSeleccionarProcesoCambiarEmpresaSucursal());
				
				this.tiposColumnasSelect=ProcesoCambiarEmpresaSucursalConstantesFunciones.getTiposSeleccionarProcesoCambiarEmpresaSucursal(true);
				
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
			//if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCambiarEmpresaSucursal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCambiarEmpresaSucursal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCambiarEmpresaSucursal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEmpresaSucursal() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocambiarempresasucursalImplementable= (ProcesoCambiarEmpresaSucursalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarEmpresaSucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocambiarempresasucursalImplementableHome= (ProcesoCambiarEmpresaSucursalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarEmpresaSucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocambiarempresasucursals= new ArrayList<ProcesoCambiarEmpresaSucursal>();
			this.procesocambiarempresasucursalsEliminados= new ArrayList<ProcesoCambiarEmpresaSucursal>();
						
			this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
			this.esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCambiarEmpresaSucursal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCambiarEmpresaSucursal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCambiarEmpresaSucursalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCambiarEmpresaSucursal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCambiarEmpresaSucursal();
			}
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCambiarEmpresaSucursal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCambiarEmpresaSucursal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCambiarEmpresaSucursal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCambiarEmpresaSucursal")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCambiarEmpresaSucursal();	
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
	
	public void cargarCombosForeignKeyProcesoCambiarEmpresaSucursal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCambiarEmpresaSucursal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCambiarEmpresaSucursal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCambiarEmpresaSucursalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCambiarEmpresaSucursal();
		
		this.cargarCombosFrameForeignKeyProcesoCambiarEmpresaSucursal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCambiarEmpresaSucursal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEmpresaSucursal();
		}
	}
	
	

	public void cargarCombosForeignKeySucursal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEmpresa("Todos");
				}

			this.recargarComboTablaSucursal(this.sucursalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			
			if(jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()>=1) {
				jTableDatosProcesoCambiarEmpresaSucursal.removeRowSelectionInterval(0, jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarEmpresaSucursal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(true);			
			//this.procesocambiarempresasucursal=new ProcesoCambiarEmpresaSucursal();
			//this.procesocambiarempresasucursal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal() ;
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEmpresaSucursal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocambiarempresasucursal);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);				
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCambiarEmpresaSucursal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRows().length;			
			}
			
			procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCambiarEmpresaSucursal--;			
				//ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux= new ProcesoCambiarEmpresaSucursal();			
				//procesocambiarempresasucursalAux.setId(this.iIdNuevoProcesoCambiarEmpresaSucursal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalOrigen=new ProcesoCambiarEmpresaSucursal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalOrigen : procesocambiarempresasucursalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocambiarempresasucursalOrigen =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarempresasucursalOrigen =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCambiarEmpresaSucursal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocambiarempresasucursal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalOrigen,this.procesocambiarempresasucursal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().add(this.procesocambiarempresasucursalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarempresasucursals.add(this.procesocambiarempresasucursalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEmpresaSucursal(), this.getIndiceNuevoProcesoCambiarEmpresaSucursal());
				
				int iLastRow =  this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarEmpresaSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();									
		
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalOrigen=new ProcesoCambiarEmpresaSucursal();
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalDestino=new ProcesoCambiarEmpresaSucursal();
				
			procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocambiarempresasucursalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarempresasucursalOrigen =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarempresasucursalOrigen =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarempresasucursalDestino =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarempresasucursalDestino =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocambiarempresasucursalOrigen =procesocambiarempresasucursalsSeleccionados.get(0);
				procesocambiarempresasucursalDestino =procesocambiarempresasucursalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalOrigen,procesocambiarempresasucursalDestino,true,false);
				
				procesocambiarempresasucursalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocambiarempresasucursalDestino,procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocambiarempresasucursalDestino,procesocambiarempresasucursals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
				
				//this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEmpresaSucursal(), this.getIndiceNuevoProcesoCambiarEmpresaSucursal());
				
				int iLastRow =  this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarEmpresaSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(!isVisible);
			this.jPanelAccionesProcesoCambiarEmpresaSucursal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCambiarEmpresaSucursal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCambiarEmpresaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCambiarEmpresaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCambiarEmpresaSucursal();
			
			this.abrirFrameOrderByProcesoCambiarEmpresaSucursal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCambiarEmpresaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCambiarEmpresaSucursal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSize(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jContentPaneDetalleProcesoCambiarEmpresaSucursal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jContentPaneDetalleProcesoCambiarEmpresaSucursal.getWidth(),ProcesoCambiarEmpresaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jContentPaneDetalleProcesoCambiarEmpresaSucursal.getWidth(),ProcesoCambiarEmpresaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jContentPaneDetalleProcesoCambiarEmpresaSucursal.getWidth(),ProcesoCambiarEmpresaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCambiarEmpresaSucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal);
				this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setVisible(false);
				this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarEmpresaSucursal"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarEmpresaSucursal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCambiarEmpresaSucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal==null) {
				
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal=new ImportacionJInternalFrame(ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal);
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setVisible(false);
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSelected(false);


				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarEmpresaSucursal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCambiarEmpresaSucursal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal==null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal=new ReporteDinamicoJInternalFrame(ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal);
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEmpresaSucursal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCambiarEmpresaSucursal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal);
			
	       	this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.dispose();
			//this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCambiarEmpresaSucursal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCambiarEmpresaSucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setVisible(true);
	        this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCambiarEmpresaSucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setVisible(true);
	        this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCambiarEmpresaSucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setVisible(false);
	        this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCambiarEmpresaSucursal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCambiarEmpresaSucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setVisible(false);
	        this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCambiarEmpresaSucursal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCambiarEmpresaSucursal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(true);
			//this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false) ;
			
			if(procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEmpresaSucursal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCambiarEmpresaSucursal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(true);
			//this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocambiarempresasucursal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false) ;
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEmpresaSucursal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaSucursal(List<Sucursal> sucursalsForeignKey)throws Exception{
		TableColumn tableColumnSucursal=this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursal,ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL));
		TableCellEditor tableCellEditorSucursal =tableColumnSucursal.getCellEditor();

		SucursalTableCell sucursalTableCellFk=(SucursalTableCell)tableCellEditorSucursal;

		if(sucursalTableCellFk!=null) {
			sucursalTableCellFk.setsucursalsForeignKey(sucursalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sucursalTableCellFk.setRowActual(intSelectedRow);
			//sucursalTableCellFk.setsucursalsForeignKeyActual(sucursalsForeignKey);
		//}


		if(sucursalTableCellFk!=null) {
			sucursalTableCellFk.RecargarSucursalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarEmpresaSucursal(false);
			
			//if(!this.isEsNuevoProcesoCambiarEmpresaSucursal) {								
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				
			}
			
			if(this.permiteMantenimiento(this.procesocambiarempresasucursal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
					this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
					this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(false);
			
												
				
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCambiarEmpresaSucursal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,procesocambiarempresasucursalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocambiarempresasucursalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocambiarempresasucursal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarempresasucursal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarempresasucursal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocambiarempresasucursal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCambiarEmpresaSucursalModel) this.jTableDatosProcesoCambiarEmpresaSucursal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
				this.isEsNuevoProcesoCambiarEmpresaSucursal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(false);
				
				
				
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCambiarEmpresaSucursal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()>=1) {
				jTableDatosProcesoCambiarEmpresaSucursal.removeRowSelectionInterval(0, jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCambiarEmpresaSucursal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(false) ;
			
			this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
			
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCambiarEmpresaSucursal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
				
				//SI ES MANUAL
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCambiarEmpresaSucursal--;			
			//ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux= new ProcesoCambiarEmpresaSucursal();			
			//procesocambiarempresasucursalAux.setId(this.iIdNuevoProcesoCambiarEmpresaSucursal);
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCambiarEmpresaSucursal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
			
			this.procesocambiarempresasucursal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().add(this.procesocambiarempresasucursalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocambiarempresasucursals.add(this.procesocambiarempresasucursalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			
			this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEmpresaSucursal(), this.getIndiceNuevoProcesoCambiarEmpresaSucursal());
			
			int iLastRow =  this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCambiarEmpresaSucursal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCambiarEmpresaSucursal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();
			}
			
			//this.abrirFrameTreeProcesoCambiarEmpresaSucursal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setFileImportacion(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCambiarEmpresaSucursal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		

		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCambiarEmpresaSucursalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCambiarEmpresaSucursalBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
									
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
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
								
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
								
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
									
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCambiarEmpresaSucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:procesocambiarempresasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarempresasucursal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal:procesocambiarempresasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarempresasucursal.getsucursal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoCambiarEmpresaSucursal(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCambiarEmpresaSucursal(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCambiarEmpresaSucursal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCambiarEmpresaSucursal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCambiarEmpresaSucursal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCambiarEmpresaSucursal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCambiarEmpresaSucursal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCambiarEmpresaSucursal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCambiarEmpresaSucursal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCambiarEmpresaSucursal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCambiarEmpresaSucursal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEmpresaSucursal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarEmpresaSucursal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCambiarEmpresaSucursal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal();
		
		this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarEmpresaSucursal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEmpresaSucursal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEmpresaSucursal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEmpresaSucursal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCambiarEmpresaSucursal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCambiarEmpresaSucursal(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEmpresaSucursal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEmpresaSucursal() throws Exception {
		try	{
			if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarEmpresaSucursal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarEmpresaSucursal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarEmpresaSucursal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			
			if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCambiarEmpresaSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEmpresaSucursal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEmpresaSucursal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCambiarEmpresaSucursal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getSelectedItem()!=null){this.id_empresaBusquedaProcesoCambiarEmpresaSucursal=((Empresa)this.jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getSelectedItem()).getId();}
		if(this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getSelectedItem()!=null){this.id_sucursalBusquedaProcesoCambiarEmpresaSucursal=((Sucursal)this.jComboBoxid_sucursalBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCambiarEmpresaSucursal(Boolean esInicializar) throws Exception {				
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarEmpresaSucursal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCambiarEmpresaSucursal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEmpresaSucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEmpresaSucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCambiarEmpresaSucursalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEmpresaSucursalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocambiarempresasucursals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCambiarEmpresaSucursal.setModel(new ProcesoCambiarEmpresaSucursalModel(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCambiarEmpresaSucursal.setModel(new ProcesoCambiarEmpresaSucursalModel(this.procesocambiarempresasucursals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarEmpresaSucursal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarEmpresaSucursalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,procesocambiarempresasucursalConstantesFunciones.resaltarSeleccionarProcesoCambiarEmpresaSucursal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO,procesocambiarempresasucursalConstantesFunciones.resaltarSeleccionarProcesoCambiarEmpresaSucursal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursal,ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID));

		if(this.procesocambiarempresasucursalConstantesFunciones.mostraridProcesoCambiarEmpresaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocambiarempresasucursalConstantesFunciones.resaltaridProcesoCambiarEmpresaSucursal,this.procesocambiarempresasucursalConstantesFunciones.activaridProcesoCambiarEmpresaSucursal,this,true,"idProcesoCambiarEmpresaSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocambiarempresasucursalConstantesFunciones.resaltaridProcesoCambiarEmpresaSucursal,this.procesocambiarempresasucursalConstantesFunciones.activaridProcesoCambiarEmpresaSucursal,this,true,"idProcesoCambiarEmpresaSucursal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarEmpresaSucursal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCambiarEmpresaSucursal.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCambiarEmpresaSucursal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCambiarEmpresaSucursal.moveColumn(this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCambiarEmpresaSucursal.moveColumn(this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCambiarEmpresaSucursal.moveColumn(this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCambiarEmpresaSucursal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCambiarEmpresaSucursal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCambiarEmpresaSucursal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCambiarEmpresaSucursal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocambiarempresasucursals.size()-1;
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
		//this.jTableDatosProcesoCambiarEmpresaSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCambiarEmpresaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCambiarEmpresaSucursal();
			
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
				
				//this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
					
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocambiarempresasucursal.getsType().equals("DUPLICADO")
				   || this.procesocambiarempresasucursal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
				
				} else {
					this.isEsNuevoProcesoCambiarEmpresaSucursal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocambiarempresasucursal.getId()>=0 && !this.procesocambiarempresasucursal.getIsNew()) {						
						this.isEsNuevoProcesoCambiarEmpresaSucursal=false;
						
					} else {
						this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarEmpresaSucursal(esRelaciones);						
				
				this.seleccionarProcesoCambiarEmpresaSucursal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocambiarempresasucursal.getId()<0) {
					this.isEsNuevoProcesoCambiarEmpresaSucursal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCambiarEmpresaSucursal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCambiarEmpresaSucursal(evt,rowIndex);
				}	
				
				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCambiarEmpresaSucursal: " + this.dDif); 
					}
				}								
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCambiarEmpresaSucursal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocambiarempresasucursal)) {
					if(this.procesocambiarempresasucursal.getId()>0) {
						this.procesocambiarempresasucursal.setIsDeleted(true);
						
						this.procesocambiarempresasucursalsEliminados.add(this.procesocambiarempresasucursal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().remove(this.procesocambiarempresasucursal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarempresasucursals.remove(this.procesocambiarempresasucursal);				
					}
					
					
					((ProcesoCambiarEmpresaSucursalModel) this.jTableDatosProcesoCambiarEmpresaSucursal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCambiarEmpresaSucursal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCambiarEmpresaSucursal) {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setText(procesocambiarempresasucursal.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocambiarempresasucursalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocambiarempresasucursalLocal=this.procesocambiarempresasucursal;
			} else {
				procesocambiarempresasucursalLocal=this.procesocambiarempresasucursalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocambiarempresasucursalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalLocal,true);
					
					if(procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocambiarempresasucursalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocambiarempresasucursalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(procesocambiarempresasucursal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.getText()==null || this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.getText()=="" || this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setText("0");
			}

			if(conColumnasBase) {procesocambiarempresasucursal.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelIdProcesoCambiarEmpresaSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalBean,ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalOrigen,ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarempresasucursalOrigen.getId()!=null && !procesocambiarempresasucursalOrigen.getId().equals(0L))) {procesocambiarempresasucursal.setId(procesocambiarempresasucursalOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setText(procesocambiarempresasucursal.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursalBean procesocambiarempresasucursalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setText(procesocambiarempresasucursalBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursalParameterReturnGeneral procesocambiarempresasucursalReturnGeneral,ProcesoCambiarEmpresaSucursalBean procesocambiarempresasucursalBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal=new ProcesoCambiarEmpresaSucursal();
			
			procesocambiarempresasucursalLocal=procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarempresasucursalLocal.getId()!=null && !procesocambiarempresasucursalLocal.getId().equals(0L))) {procesocambiarempresasucursalBean.setId(procesocambiarempresasucursalLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCambiarEmpresaSucursalGenerico(Long idProcesoCambiarEmpresaSucursalSeleccionado,JComboBox jComboBoxProcesoCambiarEmpresaSucursal,List<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsLocal)throws Exception {
		try {
			ProcesoCambiarEmpresaSucursal  procesocambiarempresasucursalTemp=null;

			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsLocal) {
				if(procesocambiarempresasucursalAux.getId()!=null && procesocambiarempresasucursalAux.getId().equals(idProcesoCambiarEmpresaSucursalSeleccionado)) {
					procesocambiarempresasucursalTemp=procesocambiarempresasucursalAux;
					break;
				}
			}

			jComboBoxProcesoCambiarEmpresaSucursal.setSelectedItem(procesocambiarempresasucursalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCambiarEmpresaSucursalGenerico(JComboBox jComboBoxProcesoCambiarEmpresaSucursal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarEmpresaSucursal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCambiarEmpresaSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarEmpresaSucursal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCambiarEmpresaSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarempresasucursal=(ProcesoCambiarEmpresaSucursal) procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) procesocambiarempresasucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesocambiarempresasucursal.getIsNew() && !procesocambiarempresasucursal.getIsChanged() && !procesocambiarempresasucursal.getIsDeleted()) {
				sDescripcion=procesocambiarempresasucursal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarempresasucursal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesocambiarempresasucursal.getIsNew() && !procesocambiarempresasucursal.getIsChanged() && !procesocambiarempresasucursal.getIsDeleted()) {
				sDescripcion=procesocambiarempresasucursal.getsucursal_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=procesocambiarempresasucursal.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalRow=new ProcesoCambiarEmpresaSucursal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarempresasucursalRow=(ProcesoCambiarEmpresaSucursal) procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarempresasucursalRow=(ProcesoCambiarEmpresaSucursal) procesocambiarempresasucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));			
			this.jButtonDuplicarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal && this.isPermisoDuplicarProcesoCambiarEmpresaSucursal));			
			this.jButtonCopiarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal && this.isPermisoCopiarProcesoCambiarEmpresaSucursal));
			this.jButtonVerFormProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal && this.isPermisoVerFormProcesoCambiarEmpresaSucursal));
			
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));			
			
			this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));			
			this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal && this.isPermisoEliminarProcesoCambiarEmpresaSucursal));
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal);							
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));						
			this.jButtonDuplicarToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal && this.isPermisoDuplicarProcesoCambiarEmpresaSucursal));						
			this.jButtonCopiarToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal && this.isPermisoCopiarProcesoCambiarEmpresaSucursal));			
			this.jButtonVerFormToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal && this.isPermisoVerFormProcesoCambiarEmpresaSucursal));			
			this.jButtonAbrirOrderByToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));
			this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal  && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal && this.isPermisoEliminarProcesoCambiarEmpresaSucursal));
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal);				
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));			
			this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal && this.isPermisoDuplicarProcesoCambiarEmpresaSucursal));			
			this.jMenuItemCopiarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal && this.isPermisoCopiarProcesoCambiarEmpresaSucursal));			
			this.jMenuItemVerFormProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal && this.isPermisoVerFormProcesoCambiarEmpresaSucursal));			
			this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));			
			//this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));
			this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal && this.isPermisoOrdenProcesoCambiarEmpresaSucursal));			
			this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal));			
			this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal && this.isPermisoNuevoProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));									
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemModificarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemActualizarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal && this.isPermisoActualizarProcesoCambiarEmpresaSucursal));	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemEliminarProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal && this.isPermisoEliminarProcesoCambiarEmpresaSucursal));
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemCancelarProcesoCambiarEmpresaSucursal.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));						
			this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=this.jButtonNuevoProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal=this.jButtonDuplicarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal=this.jButtonCopiarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal=this.jButtonVerFormProcesoCambiarEmpresaSucursal.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCambiarEmpresaSucursal=this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=this.jButtonModificarProcesoCambiarEmpresaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarToolBarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=this.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemModificarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemActualizarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemEliminarProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemCancelarProcesoCambiarEmpresaSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCambiarEmpresaSucursal(Boolean esInicializar) {
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarEmpresaSucursal();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCambiarEmpresaSucursal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEmpresaSucursal() {
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoNuevoProcesoCambiarEmpresaSucursal);			
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoDuplicarProcesoCambiarEmpresaSucursal);			
		this.jButtonCopiarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoCopiarProcesoCambiarEmpresaSucursal);			
		this.jButtonVerFormProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoVerFormProcesoCambiarEmpresaSucursal);			
		
		this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoOrdenProcesoCambiarEmpresaSucursal);					
		
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoNuevoProcesoCambiarEmpresaSucursal);			
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoActualizarProcesoCambiarEmpresaSucursal);	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoActualizarProcesoCambiarEmpresaSucursal);	
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoEliminarProcesoCambiarEmpresaSucursal);
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal);						
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoActualizarProcesoCambiarEmpresaSucursal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarEmpresaSucursal() {
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoActualizarProcesoCambiarEmpresaSucursal);	
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoActualizarProcesoCambiarEmpresaSucursal);	
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.setVisible(this.isPermisoEliminarProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal);							
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal && this.isPermisoGuardarCambiosProcesoCambiarEmpresaSucursal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCambiarEmpresaSucursal() {
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEmpresaSucursal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCambiarEmpresaSucursal() {
	}
	
	public void jTableDatosProcesoCambiarEmpresaSucursalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCambiarEmpresaSucursal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCambiarEmpresaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.getprocesocambiarempresasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarempresasucursal==null) {
						this.procesocambiarempresasucursal = new ProcesoCambiarEmpresaSucursal();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				}

				if(this.procesocambiarempresasucursal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocambiarempresasucursal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoCambiarEmpresaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarEmpresaSucursal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.getprocesocambiarempresasucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesocambiarempresasucursalLogic.getConnexion());

				if(this.procesocambiarempresasucursal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesocambiarempresasucursal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarEmpresaSucursal=(TitledBorder)this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoCambiarEmpresaSucursal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoCambiarEmpresaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.getprocesocambiarempresasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarempresasucursal==null) {
						this.procesocambiarempresasucursal = new ProcesoCambiarEmpresaSucursal();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				}

				if(this.procesocambiarempresasucursal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesocambiarempresasucursal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarEmpresaSucursal(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarEmpresaSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.getprocesocambiarempresasucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesocambiarempresasucursalLogic.getConnexion());

				if(this.procesocambiarempresasucursal.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesocambiarempresasucursal.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarEmpresaSucursal=(TitledBorder)this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoCambiarEmpresaSucursal.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoCambiarEmpresaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.getprocesocambiarempresasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarempresasucursal==null) {
						this.procesocambiarempresasucursal = new ProcesoCambiarEmpresaSucursal();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);
				}

				if(this.procesocambiarempresasucursal.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesocambiarempresasucursal.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);

			this.getProcesoCambiarEmpresaSucursalsBusquedaProcesoCambiarEmpresaSucursal();

			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);

			//if(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);

			this.getProcesoCambiarEmpresaSucursalsFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);

			//if(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoCambiarEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);

			this.getProcesoCambiarEmpresaSucursalsFK_IdSucursal();

			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);

			//if(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarempresasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCambiarEmpresaSucursal() {
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.dispose();
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.dispose();
			this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal!=null) {
			this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.dispose();
			this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCambiarEmpresaSucursal();
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCambiarEmpresaSucursal")) {
				jButtonDuplicarProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCambiarEmpresaSucursal")) {
				jButtonCopiarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCambiarEmpresaSucursal")) {
				jButtonVerFormProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonDuplicarProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCambiarEmpresaSucursal")) {
				jButtonDuplicarProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCambiarEmpresaSucursal")) {
				jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCambiarEmpresaSucursal")) {
				jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCambiarEmpresaSucursal")) {
				jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCambiarEmpresaSucursal")) {
				jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCambiarEmpresaSucursal")) {
				jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCambiarEmpresaSucursal")) {
				jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCambiarEmpresaSucursal")) {
				jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCambiarEmpresaSucursal")) {
				jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonMostrarOcultarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCambiarEmpresaSucursal")) {
				jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonCopiarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonVerFormProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCambiarEmpresaSucursal")) {
				jButtonCopiarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCambiarEmpresaSucursal")) {
				jButtonVerFormProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarEmpresaSucursal")) {
				jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCambiarEmpresaSucursal")) {
				jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCambiarEmpresaSucursal")) {
				jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCambiarEmpresaSucursal")) {
				jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCambiarEmpresaSucursal")) {
				jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCambiarEmpresaSucursal")) {
				jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCambiarEmpresaSucursal") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal")) {
				jButtonAbrirOrderByProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCambiarEmpresaSucursal") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCambiarEmpresaSucursal")) {
				jButtonMostrarOcultarProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCambiarEmpresaSucursal")) {
				jButtonProcesarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCambiarEmpresaSucursal")) {
				jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCambiarEmpresaSucursal")) {
				
				jButtonGenerarImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCambiarEmpresaSucursal")) {
				
				jButtonAbrirImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCambiarEmpresaSucursal")) {
				jComboBoxTiposAccionesProcesoCambiarEmpresaSucursalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCambiarEmpresaSucursal")) {
				jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCambiarEmpresaSucursal")) {
				jComboBoxTiposAccionesProcesoCambiarEmpresaSucursalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCambiarEmpresaSucursal")) {
				
				jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCambiarEmpresaSucursal")) {
				jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCambiarEmpresaSucursal")) {
				jButtonAbrirOrderByProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCambiarEmpresaSucursal")) {
				jButtonAbrirOrderByProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarOrderByProcesoCambiarEmpresaSucursalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonidProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursalUpdate")) {
				this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCambiarEmpresaSucursalUpdate")) {
				this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal")) {
				this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursalActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCambiarEmpresaSucursal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocambiarempresasucursalLocal=this.procesocambiarempresasucursal;
			} else {
				procesocambiarempresasucursalLocal=this.procesocambiarempresasucursalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
							
				
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
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
			
			


			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
								
						
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
								
				
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
							
				
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
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
			
			


			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
								
				
				


				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCambiarEmpresaSucursal")) {
					jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCambiarEmpresaSucursal")) {
					jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCambiarEmpresaSucursal")) {
					
				}
				
				


				
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
												
				
				


				
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
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
			
			


			if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal;
				}

				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCambiarEmpresaSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal")) {
				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
				//recargarFormProcesoCambiarEmpresaSucursalEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
			}
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal;
				}

				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCambiarEmpresaSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal")) {
				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
				//recargarFormProcesoCambiarEmpresaSucursalEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
			}
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarempresasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarempresasucursal);
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
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
				
				


			if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal;
				}

				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCambiarEmpresaSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal")) {
				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
				//recargarFormProcesoCambiarEmpresaSucursalEmpresa(jComboBoxid_empresaBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal,"BusquedaProcesoCambiarEmpresaSucursal");
			}
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEmpresaSucursal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEmpresaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEmpresaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarempresasucursalAnterior =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCambiarEmpresaSucursal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCambiarEmpresaSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocambiarempresasucursal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocambiarempresasucursal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCambiarEmpresaSucursal")) {
				
				}
				
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCambiarEmpresaSucursal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarEmpresaSucursal")) {
			
			}
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCambiarEmpresaSucursal();
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCambiarEmpresaSucursal")) {
				jButtonDuplicarProcesoCambiarEmpresaSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCambiarEmpresaSucursal")) {
				jButtonCopiarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCambiarEmpresaSucursal")) {
				jButtonVerFormProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCambiarEmpresaSucursal")) {
				jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCambiarEmpresaSucursal")) {
				jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCambiarEmpresaSucursal")) {
				jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCambiarEmpresaSucursal")) {
				jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCambiarEmpresaSucursal")) {
				jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarEmpresaSucursal")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCambiarEmpresaSucursal")) {
				jButtonAbrirOrderByProcesoCambiarEmpresaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarEmpresaSucursal")) {
				jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCambiarEmpresaSucursal")) {
				jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCambiarEmpresaSucursal")) {
				jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonidProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursalUpdate")) {
				this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCambiarEmpresaSucursalUpdate")) {
				this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCambiarEmpresaSucursalBusqueda")) {
				this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusquedaActionPerformed(evt);
			}
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCambiarEmpresaSucursal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCambiarEmpresaSucursal")) {
				closingInternalFrameProcesoCambiarEmpresaSucursal();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarEmpresaSucursal")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(null);
			}
			
			ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarempresasucursal,new Object(),this.procesocambiarempresasucursalParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCambiarEmpresaSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCambiarEmpresaSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCambiarEmpresaSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocambiarempresasucursal)) {
			if(!esControlTabla) {
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);			
				}
				
				if(this.procesocambiarempresasucursalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral,this.procesocambiarempresasucursalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocambiarempresasucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarEmpresaSucursal(classes,this.procesocambiarempresasucursalReturnGeneral,this.procesocambiarempresasucursalBean,false);
					}
						
					if(this.procesocambiarempresasucursalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal());	
					}
						
					if(this.procesocambiarempresasucursalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal(),classes);//this.procesocambiarempresasucursalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,classes);//this.procesocambiarempresasucursalBean);									
				}
			
				if(ProcesoCambiarEmpresaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEmpresaSucursal(this.procesocambiarempresasucursal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocambiarempresasucursalAnterior!=null) {
						this.procesocambiarempresasucursal=this.procesocambiarempresasucursalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocambiarempresasucursalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal(),procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursal(),this.procesocambiarempresasucursals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCambiarEmpresaSucursal.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCambiarEmpresaSucursal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCambiarEmpresaSucursal();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCambiarEmpresaSucursal() throws Exception {
		
		ProcesoCambiarEmpresaSucursalModel procesocambiarempresasucursalModel=(ProcesoCambiarEmpresaSucursalModel)this.jTableDatosProcesoCambiarEmpresaSucursal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarempresasucursalModel.procesocambiarempresasucursals=this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocambiarempresasucursalModel.procesocambiarempresasucursals=this.procesocambiarempresasucursals;
		}
		
		
		((ProcesoCambiarEmpresaSucursalModel) this.jTableDatosProcesoCambiarEmpresaSucursal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCambiarEmpresaSucursal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocambiarempresasucursalAnterior(),this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocambiarempresasucursalAnterior(),this.procesocambiarempresasucursals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCambiarEmpresaSucursal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
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
										
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarempresasucursal,new Object(),generalEntityParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEmpresaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCambiarEmpresaSucursalConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCambiarEmpresaSucursal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCambiarEmpresaSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarempresasucursal,new Object(),generalEntityParameterGeneral,this.procesocambiarempresasucursalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursalBean procesocambiarempresasucursalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarEmpresaSucursal(ArrayList<Classe> classes,ProcesoCambiarEmpresaSucursalReturnGeneral procesocambiarempresasucursalReturnGeneral,ProcesoCambiarEmpresaSucursalBean procesocambiarempresasucursalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocambiarempresasucursal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal = new ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones(),this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.procesocambiarempresasucursalLogic=this.procesocambiarempresasucursalLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCambiarEmpresaSucursal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarEmpresaSucursal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarEmpresaSucursal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCambiarEmpresaSucursal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEmpresaSucursal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarEmpresaSucursal"));
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarEmpresaSucursal"));

		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarEmpresaSucursal"));
					
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemModificarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarEmpresaSucursal"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarEmpresaSucursal"));
						
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemActualizarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarEmpresaSucursal"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarEmpresaSucursal"));
								
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemEliminarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarEmpresaSucursal"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarEmpresaSucursal"));
					
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemCancelarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarEmpresaSucursal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEmpresaSucursal"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEmpresaSucursal"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarEmpresaSucursal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonidProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarEmpresaSucursal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCambiarEmpresaSucursal"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarEmpresaSucursal"));
		}
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCambiarEmpresaSucursal"));
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCambiarEmpresaSucursal"));
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"NuevoProcesoCambiarEmpresaSucursal"));
		
		this.jButtonDuplicarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCambiarEmpresaSucursal"));
		
		this.jButtonCopiarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"CopiarProcesoCambiarEmpresaSucursal"));
		
		this.jButtonVerFormProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"VerFormProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jButtonDuplicarToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemDuplicarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarEmpresaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonModificarToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarEmpresaSucursal"));
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemModificarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarEmpresaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarEmpresaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarEmpresaSucursal"));
				
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemActualizarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarEmpresaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarEmpresaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarEmpresaSucursal"));
						
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemEliminarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarEmpresaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarEmpresaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarEmpresaSucursal"));
			
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemCancelarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarEmpresaSucursal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CerrarProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonCerrarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCambiarEmpresaSucursal"));
			
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarEmpresaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCambiarEmpresaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEmpresaSucursal"));
		}
		
		this.jButtonCopiarToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jButtonVerFormToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCambiarEmpresaSucursal"));
		
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemCopiarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCambiarEmpresaSucursal"));		
		
		this.jMenuItemVerFormProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCambiarEmpresaSucursal"));
					
		this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCambiarEmpresaSucursal"));
		
		this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCambiarEmpresaSucursal"));		
		
		
		
		this.jButtonAnterioresProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonAnterioresToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCambiarEmpresaSucursal"));
		
		this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonSiguientesProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonSiguientesToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemAbrirOrderByProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCambiarEmpresaSucursal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal"));		
		
		
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCambiarEmpresaSucursal"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCambiarEmpresaSucursal"));

		this.jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCambiarEmpresaSucursal"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarEmpresaSucursal"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCambiarEmpresaSucursal"));
			
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCambiarEmpresaSucursal"));
					
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCambiarEmpresaSucursal"));
			
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCambiarEmpresaSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonidProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEmpresaSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEmpresaSucursal"));				
			//this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEmpresaSucursal"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarEmpresaSucursal"));
				this.jInternalFrameImportacionProcesoCambiarEmpresaSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarEmpresaSucursal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCambiarEmpresaSucursal"));
			
			this.jButtonAbrirOrderByToolBarProcesoCambiarEmpresaSucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCambiarEmpresaSucursal"));			
			
			if(this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal!=null) {
				this.jInternalFrameOrderByProcesoCambiarEmpresaSucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarEmpresaSucursal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarEmpresaSucursal"));
		
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
            		closingInternalFrameProcesoCambiarEmpresaSucursal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCambiarEmpresaSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCambiarEmpresaSucursal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarEmpresaSucursalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonModificarProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonActualizarProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonEliminarProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCancelarProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCerrarProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCambiarEmpresaSucursal";
		inputMap = this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCambiarEmpresaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonidProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCambiarEmpresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCambiarEmpresaSucursalBusqueda"));
		
		
		this.jButtonBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCambiarEmpresaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCambiarEmpresaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCambiarEmpresaSucursal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
					procesocambiarempresasucursalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursals) {
					procesocambiarempresasucursalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCambiarEmpresaSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
						procesocambiarempresasucursalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursals) {
						procesocambiarempresasucursalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarEmpresaSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCambiarEmpresaSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarEmpresaSucursal.getSelectedRows();
			
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalLocal=new ProcesoCambiarEmpresaSucursal();
			
			//this.seleccionarTodosProcesoCambiarEmpresaSucursal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocambiarempresasucursalLocal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals().toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocambiarempresasucursalLocal =(ProcesoCambiarEmpresaSucursal) this.procesocambiarempresasucursals.toArray()[this.jTableDatosProcesoCambiarEmpresaSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocambiarempresasucursalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
						procesocambiarempresasucursalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursals) {
						procesocambiarempresasucursalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarEmpresaSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarEmpresaSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEmpresaSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCambiarEmpresaSucursalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCambiarEmpresaSucursalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCambiarEmpresaSucursal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursals) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCambiarEmpresaSucursalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCambiarEmpresaSucursal) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCambiarEmpresaSucursal(conSplash);
				
					this.generarReporteProcesoCambiarEmpresaSucursalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCambiarEmpresaSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarEmpresaSucursalsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarEmpresaSucursalsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarEmpresaSucursal();
				
				this.exportarProcesoCambiarEmpresaSucursalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCambiarEmpresaSucursals();
				//this.importarProcesoCambiarEmpresaSucursals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarEmpresaSucursal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCambiarEmpresaSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCambiarEmpresaSucursal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCambiarEmpresaSucursal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCambiarEmpresaSucursal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCambiarEmpresaSucursal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCambiarEmpresaSucursal(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCambiarEmpresaSucursal();
						
						this.generarReporteProcesoAccionProcesoCambiarEmpresaSucursalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cambiar Empresa SucursalES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCambiarEmpresaSucursal();
				
						this.actualizarParametrosGeneralProcesoCambiarEmpresaSucursal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocambiarempresasucursalReturnGeneral=procesocambiarempresasucursalLogic.procesarAccionProcesoCambiarEmpresaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals(),this.procesocambiarempresasucursalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCambiarEmpresaSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCambiarEmpresaSucursal();
					
					ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCambiarEmpresaSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCambiarEmpresaSucursal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCambiarEmpresaSucursal();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
			ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal=new ProcesoCambiarEmpresaSucursal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal.getSelectedItem();
			
			
			
			
			procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocambiarempresasucursalsSeleccionados.size()==1) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
					procesocambiarempresasucursal=procesocambiarempresasucursalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCambiarEmpresaSucursal();
			
      		//this.finishProcessProcesoCambiarEmpresaSucursal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCambiarEmpresaSucursalReturnGeneral() throws Exception {
		if(this.procesocambiarempresasucursalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarempresasucursalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocambiarempresasucursalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarempresasucursalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocambiarempresasucursalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocambiarempresasucursalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
		}
		
		if(this.procesocambiarempresasucursalReturnGeneral.getConRetornoLista() || this.procesocambiarempresasucursalReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocambiarempresasucursalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocambiarempresasucursalLogic.setProcesoCambiarEmpresaSucursals(this.procesocambiarempresasucursalReturnGeneral.getProcesoCambiarEmpresaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCambiarEmpresaSucursal(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCambiarEmpresaSucursal() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCambiarEmpresaSucursal> getProcesoCambiarEmpresaSucursalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCambiarEmpresaSucursal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals()) {
					if(procesocambiarempresasucursalAux.getIsSelected()) {
						procesocambiarempresasucursalsSeleccionados.add(procesocambiarempresasucursalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:this.procesocambiarempresasucursals) {
					if(procesocambiarempresasucursalAux.getIsSelected()) {
						procesocambiarempresasucursalsSeleccionados.add(procesocambiarempresasucursalAux);				
					}
				}
			}
			
			if(procesocambiarempresasucursalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocambiarempresasucursalsSeleccionados.addAll(this.procesocambiarempresasucursalLogic.getProcesoCambiarEmpresaSucursals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocambiarempresasucursalsSeleccionados.addAll(this.procesocambiarempresasucursals);				
					}
				}
			}
		} else {
			procesocambiarempresasucursalsSeleccionados.add(this.procesocambiarempresasucursal);
		}
		
		return procesocambiarempresasucursalsSeleccionados;
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
	
	public void generarReporteProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCambiarEmpresaSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCambiarEmpresaSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarEmpresaSucursalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarEmpresaSucursalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cambiar Empresa Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCambiarEmpresaSucursalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCambiarEmpresaSucursal();
		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCambiarEmpresaSucursal();
		
		
		//this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados ,procesocambiarempresasucursalImplementable,procesocambiarempresasucursalImplementableHome);
	}
	
	public void mostrarImportacionProcesoCambiarEmpresaSucursals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCambiarEmpresaSucursal();
		
		this.abrirFrameImportacionProcesoCambiarEmpresaSucursal();		
		
			
		//this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados ,procesocambiarempresasucursalImplementable,procesocambiarempresasucursalImplementableHome);
	}
	
	public void importarProcesoCambiarEmpresaSucursals() throws Exception {		
	
	}
	
	public void exportarProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCambiarEmpresaSucursalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCambiarEmpresaSucursalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCambiarEmpresaSucursalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cambiar Empresa Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCambiarEmpresaSucursal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocambiarempresasucursalAux.setsDetalleGeneralEntityReporte(procesocambiarempresasucursalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCambiarEmpresaSucursal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocambiarempresasucursal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarempresasucursal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarempresasucursal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarempresasucursal.getsucursal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCambiarEmpresaSucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCambiarEmpresaSucursal(row);				
				iRow++;
			}				
			
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCambiarEmpresaSucursalsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();		
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarempresasucursal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocambiarempresasucursals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocambiarempresasucursal");
			//elementRoot.appendChild(element);
		
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
				element = document.createElement("procesocambiarempresasucursal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Empresa Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCambiarEmpresaSucursal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarempresasucursal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarempresasucursal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarempresasucursal.getsucursal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoCambiarEmpresaSucursal(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCambiarEmpresaSucursalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocambiarempresasucursal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCambiarEmpresaSucursalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocambiarempresasucursal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoCambiarEmpresaSucursalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesocambiarempresasucursal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoCambiarEmpresaSucursalConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesocambiarempresasucursal.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoCambiarEmpresaSucursalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados=new ArrayList<ProcesoCambiarEmpresaSucursal>();
		
		procesocambiarempresasucursalsSeleccionados=this.getProcesoCambiarEmpresaSucursalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCambiarEmpresaSucursal(procesocambiarempresasucursalsSeleccionados);
		
		this.generarReporteProcesoCambiarEmpresaSucursals("Todos",procesocambiarempresasucursalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCambiarEmpresaSucursal(ArrayList<ProcesoCambiarEmpresaSucursal> procesocambiarempresasucursalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCambiarEmpresaSucursal procesocambiarempresasucursalAux:procesocambiarempresasucursalsSeleccionados) {
				procesocambiarempresasucursalAux.setsDetalleGeneralEntityReporte(procesocambiarempresasucursalAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesocambiarempresasucursalAux.setsDescripcionGeneralEntityReporte1(procesocambiarempresasucursalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesocambiarempresasucursalAux.setsDescripcionGeneralEntityReporte1(procesocambiarempresasucursalAux.getsucursal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCambiarEmpresaSucursal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=true;
		} else {
			this.actualizarEstadoPanelsProcesoCambiarEmpresaSucursal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCambiarEmpresaSucursal=false;
			//this.isVisibilidadCeldaVerFormProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarEmpresaSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			if(!procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;												
			}
			
			this.jButtonCerrarProcesoCambiarEmpresaSucursal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocambiarempresasucursal)) {
			this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCambiarEmpresaSucursal=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEmpresaSucursal=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEmpresaSucursal=false;
		//this.isVisibilidadCeldaModificarProcesoCambiarEmpresaSucursal=true;
		this.isVisibilidadCeldaActualizarProcesoCambiarEmpresaSucursal=false;
		this.isVisibilidadCeldaEliminarProcesoCambiarEmpresaSucursal=false;
		//this.isVisibilidadCeldaCancelarProcesoCambiarEmpresaSucursal=true;			
		this.isVisibilidadCeldaGuardarProcesoCambiarEmpresaSucursal=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarEmpresaSucursal() {
	}
	
	public void actualizarEstadoPanelsProcesoCambiarEmpresaSucursal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal!=null) {
				this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelPaginacionProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
					this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal!=null) {
				this.jPanelParametrosReportesProcesoCambiarEmpresaSucursal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal=isParaEmpresa;
			if(!this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal) {this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.remove(jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal=isParaSucursal;
			if(!this.isVisibilidadBusquedaProcesoCambiarEmpresaSucursal) {this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.remove(jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);}
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
			
			this.inicializarActualizarBindingTablaProcesoCambiarEmpresaSucursal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCambiarEmpresaSucursal() {
		this.updateBorderResaltarBusquedasFormularioProcesoCambiarEmpresaSucursal();
		this.updateVisibilidadBusquedasFormularioProcesoCambiarEmpresaSucursal();
		this.updateHabilitarBusquedasFormularioProcesoCambiarEmpresaSucursal();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCambiarEmpresaSucursal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponents().length>0) {
	

		if(this.procesocambiarempresasucursalConstantesFunciones.resaltarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal!=null) {
			index= this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.indexOfComponent(this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponent(index);
				jPanel.setBorder(this.procesocambiarempresasucursalConstantesFunciones.resaltarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCambiarEmpresaSucursal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.indexOfComponent(this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostrarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			if(!this.procesocambiarempresasucursalConstantesFunciones.mostrarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal && index>-1) {
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCambiarEmpresaSucursal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.indexOfComponent(this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocambiarempresasucursalConstantesFunciones.activarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
				this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setEnabledAt(index,this.procesocambiarempresasucursalConstantesFunciones.activarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCambiarEmpresaSucursal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCambiarEmpresaSucursal")) {
			index= this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.indexOfComponent(this.jPanelBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);

			this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEmpresaSucursal.getComponent(index);

			this.procesocambiarempresasucursalConstantesFunciones.setResaltarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal(resaltar);

			jPanel.setBorder(this.procesocambiarempresasucursalConstantesFunciones.resaltarBusquedaProcesoCambiarEmpresaSucursalProcesoCambiarEmpresaSucursal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCambiarEmpresaSucursal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCambiarEmpresaSucursal() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCambiarEmpresaSucursal();
		this.updateVisibilidadResaltarControlesFormularioProcesoCambiarEmpresaSucursal();
		this.updateHabilitarResaltarControlesFormularioProcesoCambiarEmpresaSucursal();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCambiarEmpresaSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocambiarempresasucursalConstantesFunciones.resaltaridProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setBorder(this.procesocambiarempresasucursalConstantesFunciones.resaltaridProcesoCambiarEmpresaSucursal);}
		if(this.procesocambiarempresasucursalConstantesFunciones.resaltarid_empresaProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setBorder(this.procesocambiarempresasucursalConstantesFunciones.resaltarid_empresaProcesoCambiarEmpresaSucursal);}
		if(this.procesocambiarempresasucursalConstantesFunciones.resaltarid_sucursalProcesoCambiarEmpresaSucursal!=null && this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setBorder(this.procesocambiarempresasucursalConstantesFunciones.resaltarid_sucursalProcesoCambiarEmpresaSucursal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCambiarEmpresaSucursal() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostraridProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelidProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostraridProcesoCambiarEmpresaSucursal);
		//this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostrarid_empresaProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelid_empresaProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostrarid_empresaProcesoCambiarEmpresaSucursal);
		//this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostrarid_sucursalProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jPanelid_sucursalProcesoCambiarEmpresaSucursal.setVisible(this.procesocambiarempresasucursalConstantesFunciones.mostrarid_sucursalProcesoCambiarEmpresaSucursal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCambiarEmpresaSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal!=null) {
	
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jLabelidProcesoCambiarEmpresaSucursal.setEnabled(this.procesocambiarempresasucursalConstantesFunciones.activaridProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setEnabled(this.procesocambiarempresasucursalConstantesFunciones.activarid_empresaProcesoCambiarEmpresaSucursal);
		this.jInternalFrameDetalleFormProcesoCambiarEmpresaSucursal.jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setEnabled(this.procesocambiarempresasucursalConstantesFunciones.activarid_sucursalProcesoCambiarEmpresaSucursal);
		}
	}
	
		
}