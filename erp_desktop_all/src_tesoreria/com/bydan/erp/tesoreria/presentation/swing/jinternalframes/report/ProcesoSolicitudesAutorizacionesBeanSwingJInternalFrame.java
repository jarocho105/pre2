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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.ProcesoSolicitudesAutorizacionesConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ProcesoSolicitudesAutorizacionesParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ProcesoSolicitudesAutorizacionesParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.ProcesoSolicitudesAutorizacionesBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame extends ProcesoSolicitudesAutorizacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionesValidator = new ClassValidator<ProcesoSolicitudesAutorizaciones>(ProcesoSolicitudesAutorizaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones;	
	public ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux;
	public ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesTotales;
	public Long idProcesoSolicitudesAutorizacionesActual;
	public Long iIdNuevoProcesoSolicitudesAutorizaciones=0L;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
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
	
	public Boolean isPermisoTodoProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoNuevoProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoActualizarProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoEliminarProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoConsultaProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoBusquedaProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoReporteProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoCopiarProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoVerFormProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoDuplicarProcesoSolicitudesAutorizaciones;
	public Boolean isPermisoOrdenProcesoSolicitudesAutorizaciones;
	
	
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
	
	public ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesReturnGeneral;
	public ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoSolicitudesAutorizaciones=false;
	public Boolean esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoSolicitudesAutorizacionesSessionBeanAdditional procesosolicitudesautorizacionesSessionBeanAdditional=null;
	
	public ProcesoSolicitudesAutorizacionesSessionBeanAdditional getProcesoSolicitudesAutorizacionesSessionBeanAdditional() {
		return this.procesosolicitudesautorizacionesSessionBeanAdditional;
	}
	
	public void setProcesoSolicitudesAutorizacionesSessionBeanAdditional(ProcesoSolicitudesAutorizacionesSessionBeanAdditional procesosolicitudesautorizacionesSessionBeanAdditional) {
		try {
			this.procesosolicitudesautorizacionesSessionBeanAdditional=procesosolicitudesautorizacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional procesosolicitudesautorizacionesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame
	
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional getProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional() {
		return this.procesosolicitudesautorizacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional procesosolicitudesautorizacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesosolicitudesautorizacionesBeanSwingJInternalFrameAdditional=procesosolicitudesautorizacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoSolicitudesAutorizacionesLogic procesosolicitudesautorizacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesBean;
	public ProcesoSolicitudesAutorizacionesConstantesFunciones procesosolicitudesautorizacionesConstantesFunciones;
	//public ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness;	
	//public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessEliminados;
	//public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones=true;
	public Boolean isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones=true;
	public Boolean isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones=true;
	public Boolean isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoSolicitudesAutorizaciones() {
		return this.iIdNuevoProcesoSolicitudesAutorizaciones;
	}

	public void setiIdNuevoProcesoSolicitudesAutorizaciones(Long iIdNuevoProcesoSolicitudesAutorizaciones) {
		this.iIdNuevoProcesoSolicitudesAutorizaciones = iIdNuevoProcesoSolicitudesAutorizaciones;
	}
	
	public Long getidProcesoSolicitudesAutorizacionesActual() {
		return this.idProcesoSolicitudesAutorizacionesActual;
	}

	public void setidProcesoSolicitudesAutorizacionesActual(Long idProcesoSolicitudesAutorizacionesActual) {
		this.idProcesoSolicitudesAutorizacionesActual = idProcesoSolicitudesAutorizacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoSolicitudesAutorizaciones getprocesosolicitudesautorizaciones() {
		return this.procesosolicitudesautorizaciones;
	}

	public void setprocesosolicitudesautorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) {
		this.procesosolicitudesautorizaciones = procesosolicitudesautorizaciones;
	}
	
	public ProcesoSolicitudesAutorizaciones getprocesosolicitudesautorizacionesAux() {
		return this.procesosolicitudesautorizacionesAux;
	}

	public void setprocesosolicitudesautorizacionesAux(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux) {
		this.procesosolicitudesautorizacionesAux = procesosolicitudesautorizacionesAux;
	}				
	
	public ProcesoSolicitudesAutorizaciones getprocesosolicitudesautorizacionesAnterior() {
		return this.procesosolicitudesautorizacionesAnterior;
	}

	public void setprocesosolicitudesautorizacionesAnterior(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAnterior) {
		this.procesosolicitudesautorizacionesAnterior = procesosolicitudesautorizacionesAnterior;
	}	
	
	public ProcesoSolicitudesAutorizaciones getprocesosolicitudesautorizacionesTotales() {
		return this.procesosolicitudesautorizacionesTotales;
	}

	public void setprocesosolicitudesautorizacionesTotales(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesTotales) {
		this.procesosolicitudesautorizacionesTotales = procesosolicitudesautorizacionesTotales;
	}	
	
	public ProcesoSolicitudesAutorizaciones getprocesosolicitudesautorizacionesBean() {
		return this.procesosolicitudesautorizacionesBean;
	}

	public void setprocesosolicitudesautorizacionesBean(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesBean) {
		this.procesosolicitudesautorizacionesBean = procesosolicitudesautorizacionesBean;
	}	
	
	public ProcesoSolicitudesAutorizacionesParameterReturnGeneral getprocesosolicitudesautorizacionesReturnGeneral() {
		return this.procesosolicitudesautorizacionesReturnGeneral;
	}

	public void setprocesosolicitudesautorizacionesReturnGeneral(ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesReturnGeneral) {
		this.procesosolicitudesautorizacionesReturnGeneral = procesosolicitudesautorizacionesReturnGeneral;
	}	
	
	
	public Long id_clienteBusquedaProcesoSolicitudesAutorizaciones=-1L;

	public Long getid_clienteBusquedaProcesoSolicitudesAutorizaciones() {
		return this.id_clienteBusquedaProcesoSolicitudesAutorizaciones;
	}

	public void setid_clienteBusquedaProcesoSolicitudesAutorizaciones(Long id_clienteBusquedaProcesoSolicitudesAutorizaciones) {
		this.id_clienteBusquedaProcesoSolicitudesAutorizaciones = id_clienteBusquedaProcesoSolicitudesAutorizaciones;
	}

;
	public Date fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones=new Date();

	public Date getfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones() {
		return this.fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones;
	}

	public void setfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones(Date fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones) {
		this.fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones = fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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
	
	
	public ProcesoSolicitudesAutorizacionesLogic getProcesoSolicitudesAutorizacionesLogic()	{		
		return procesosolicitudesautorizacionesLogic;
	}

	public void setProcesoSolicitudesAutorizacionesLogic(ProcesoSolicitudesAutorizacionesLogic procesosolicitudesautorizacionesLogic) {
		this.procesosolicitudesautorizacionesLogic = procesosolicitudesautorizacionesLogic;
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
	
	public Boolean getIsEsNuevoProcesoSolicitudesAutorizaciones() {
		return isEsNuevoProcesoSolicitudesAutorizaciones;
	}

	public void setIsEsNuevoProcesoSolicitudesAutorizaciones(Boolean isEsNuevoProcesoSolicitudesAutorizaciones) {
		this.isEsNuevoProcesoSolicitudesAutorizaciones = isEsNuevoProcesoSolicitudesAutorizaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones() {
		return esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones(Boolean esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones) {
		this.esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones = esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones;
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

			if(this.procesosolicitudesautorizacionesSessionBean==null) {
				this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
			}

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesosolicitudesautorizacionesSessionBean.getlidEmpresaActual());
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

			if(this.procesosolicitudesautorizacionesSessionBean==null) {
				this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
			}

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesosolicitudesautorizacionesSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.procesosolicitudesautorizacionesSessionBean==null) {
				this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
			}

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(procesosolicitudesautorizacionesSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

					if(this.procesosolicitudesautorizaciones!=null) {
						this.procesosolicitudesautorizaciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico)throws Exception
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
				jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico!=null && jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico.setSelectedIndex(0);
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

					if(this.procesosolicitudesautorizaciones!=null) {
						this.procesosolicitudesautorizaciones.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico!=null && jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.procesosolicitudesautorizaciones!=null) {
						this.procesosolicitudesautorizaciones.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoSolicitudesAutorizaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones!=null) {
						jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones!=null) {
							//jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.getItemCount()>0) {
								jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico!=null && jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico.getItemCount()>0) {
					jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,JComboBox jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoSolicitudesAutorizacionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesosolicitudesautorizaciones.setid_empresa(empresaAux.getId());
				procesosolicitudesautorizaciones.setempresa_descripcion(ProcesoSolicitudesAutorizacionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesosolicitudesautorizaciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,JComboBox jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoSolicitudesAutorizacionesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesosolicitudesautorizaciones.setid_sucursal(sucursalAux.getId());
				procesosolicitudesautorizaciones.setsucursal_descripcion(ProcesoSolicitudesAutorizacionesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesosolicitudesautorizaciones.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,JComboBox jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteProcesoSolicitudesAutorizacionesGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				procesosolicitudesautorizaciones.setid_cliente(clienteAux.getId());
				procesosolicitudesautorizaciones.setcliente_descripcion(ProcesoSolicitudesAutorizacionesConstantesFunciones.getClienteDescripcion(clienteAux));
				procesosolicitudesautorizaciones.setCliente(clienteAux);			}
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

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
					}

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
					}

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { 
					}

					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoSolicitudesAutorizaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.addItem(cliente);
							}
						}

						if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoSolicitudesAutorizaciones() throws Exception {
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
		
	public ProcesoSolicitudesAutorizacionesParameterReturnGeneral getProcesoSolicitudesAutorizacionesParameterGeneral() {
		return this.procesosolicitudesautorizacionesParameterGeneral;
	}
	
	public void setProcesoSolicitudesAutorizacionesParameterGeneral(ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesParameterGeneral) {
		this.procesosolicitudesautorizacionesParameterGeneral = procesosolicitudesautorizacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoSolicitudesAutorizaciones() {
		return isPermisoTodoProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoTodoProcesoSolicitudesAutorizaciones(Boolean isPermisoTodoProcesoSolicitudesAutorizaciones) {
		this.isPermisoTodoProcesoSolicitudesAutorizaciones = isPermisoTodoProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoNuevoProcesoSolicitudesAutorizaciones() {
		return isPermisoNuevoProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoNuevoProcesoSolicitudesAutorizaciones(Boolean isPermisoNuevoProcesoSolicitudesAutorizaciones) {
		this.isPermisoNuevoProcesoSolicitudesAutorizaciones = isPermisoNuevoProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoActualizarProcesoSolicitudesAutorizaciones() {
		return isPermisoActualizarProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoActualizarProcesoSolicitudesAutorizaciones(Boolean isPermisoActualizarProcesoSolicitudesAutorizaciones) {
		this.isPermisoActualizarProcesoSolicitudesAutorizaciones = isPermisoActualizarProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoEliminarProcesoSolicitudesAutorizaciones() {
		return isPermisoEliminarProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoEliminarProcesoSolicitudesAutorizaciones(Boolean isPermisoEliminarProcesoSolicitudesAutorizaciones) {
		this.isPermisoEliminarProcesoSolicitudesAutorizaciones = isPermisoEliminarProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoSolicitudesAutorizaciones() {
		return isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoGuardarCambiosProcesoSolicitudesAutorizaciones(Boolean isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones) {
		this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones = isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoConsultaProcesoSolicitudesAutorizaciones() {
		return isPermisoConsultaProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoConsultaProcesoSolicitudesAutorizaciones(Boolean isPermisoConsultaProcesoSolicitudesAutorizaciones) {
		this.isPermisoConsultaProcesoSolicitudesAutorizaciones = isPermisoConsultaProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoBusquedaProcesoSolicitudesAutorizaciones() {
		return isPermisoBusquedaProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoBusquedaProcesoSolicitudesAutorizaciones(Boolean isPermisoBusquedaProcesoSolicitudesAutorizaciones) {
		this.isPermisoBusquedaProcesoSolicitudesAutorizaciones = isPermisoBusquedaProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsPermisoReporteProcesoSolicitudesAutorizaciones() {
		return isPermisoReporteProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoReporteProcesoSolicitudesAutorizaciones(Boolean isPermisoReporteProcesoSolicitudesAutorizaciones) {
		this.isPermisoReporteProcesoSolicitudesAutorizaciones = isPermisoReporteProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoSolicitudesAutorizaciones() {
		return isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoPaginacionMedioProcesoSolicitudesAutorizaciones(Boolean isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones) {
		this.isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones = isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoSolicitudesAutorizaciones() {
		return isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoPaginacionTodoProcesoSolicitudesAutorizaciones(Boolean isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones) {
		this.isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones = isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoSolicitudesAutorizaciones() {
		return isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoPaginacionAltoProcesoSolicitudesAutorizaciones(Boolean isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones) {
		this.isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones = isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoCopiarProcesoSolicitudesAutorizaciones() {
		return isPermisoCopiarProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoCopiarProcesoSolicitudesAutorizaciones(Boolean isPermisoCopiarProcesoSolicitudesAutorizaciones) {
		this.isPermisoCopiarProcesoSolicitudesAutorizaciones = isPermisoCopiarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoVerFormProcesoSolicitudesAutorizaciones() {
		return isPermisoVerFormProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoVerFormProcesoSolicitudesAutorizaciones(Boolean isPermisoVerFormProcesoSolicitudesAutorizaciones) {
		this.isPermisoVerFormProcesoSolicitudesAutorizaciones = isPermisoVerFormProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoDuplicarProcesoSolicitudesAutorizaciones() {
		return isPermisoDuplicarProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoDuplicarProcesoSolicitudesAutorizaciones(Boolean isPermisoDuplicarProcesoSolicitudesAutorizaciones) {
		this.isPermisoDuplicarProcesoSolicitudesAutorizaciones = isPermisoDuplicarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsPermisoOrdenProcesoSolicitudesAutorizaciones() {
		return isPermisoOrdenProcesoSolicitudesAutorizaciones;
	}

	public void setIsPermisoOrdenProcesoSolicitudesAutorizaciones(Boolean isPermisoOrdenProcesoSolicitudesAutorizaciones) {
		this.isPermisoOrdenProcesoSolicitudesAutorizaciones = isPermisoOrdenProcesoSolicitudesAutorizaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones = isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones = isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones = isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones = isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones = isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones() {
		return isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones(Boolean isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones = isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones;
	}
		
	public ProcesoSolicitudesAutorizacionesSessionBean getprocesosolicitudesautorizacionesSessionBean() {
		return this.procesosolicitudesautorizacionesSessionBean;
	}
	
	public void setprocesosolicitudesautorizacionesSessionBean(ProcesoSolicitudesAutorizacionesSessionBean procesosolicitudesautorizacionesSessionBean) {
		this.procesosolicitudesautorizacionesSessionBean=procesosolicitudesautorizacionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoSolicitudesAutorizaciones() {
		return this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones;
	}

	public void setisVisibilidadBusquedaProcesoSolicitudesAutorizaciones(Boolean isVisibilidadBusquedaProcesoSolicitudesAutorizaciones) {
		this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=isVisibilidadBusquedaProcesoSolicitudesAutorizaciones;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesosolicitudesautorizaciones,null);
				this.setActualParaGuardarSucursalForeignKey(procesosolicitudesautorizaciones,null);
				this.setActualParaGuardarClienteForeignKey(procesosolicitudesautorizaciones,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesosolicitudesautorizacionesAux.setId(procesosolicitudesautorizaciones.getId());
		procesosolicitudesautorizacionesAux.setVersionRow(procesosolicitudesautorizaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal) throws Exception {
		
		if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal) throws Exception {	
		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesosolicitudesautorizacionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesosolicitudesautorizacionesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				procesosolicitudesautorizacionesLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoSolicitudesAutorizacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesosolicitudesautorizacionesValidator.getInvalidValues(this.procesosolicitudesautorizaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness) throws Exception {
		try	{			
			ProcesoSolicitudesAutorizacionesConstantesFunciones.actualizarSelectedLista(procesosolicitudesautorizaciones,procesosolicitudesautorizacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesosolicitudesautorizacionessLocal=this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesosolicitudesautorizacionessLocal=this.procesosolicitudesautorizacioness;
			}
			//ARCHITECTURE
		
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal:procesosolicitudesautorizacionessLocal) {
				if(this.permiteMantenimiento(procesosolicitudesautorizacionesLocal) && procesosolicitudesautorizacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.getProcesoSolicitudesAutorizacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.NOMBREMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_monedaProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_emisionProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_pagoProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.DEBITOMONEEXTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_monedaProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_emisionProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_pagoProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones,"");
		
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
		this.iIdNuevoProcesoSolicitudesAutorizaciones--;	
		
		
		this.procesosolicitudesautorizacionesAux=new ProcesoSolicitudesAutorizaciones();
		
		this.procesosolicitudesautorizacionesAux.setId(this.iIdNuevoProcesoSolicitudesAutorizaciones);
		this.procesosolicitudesautorizacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().add(this.procesosolicitudesautorizacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesosolicitudesautorizacioness.add(this.procesosolicitudesautorizacionesAux);
		}
		//ARCHITECTURE
		
		this.procesosolicitudesautorizaciones=this.procesosolicitudesautorizacionesAux;
		
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
		}
				
		//this.setDefaultControlesProcesoSolicitudesAutorizaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesBean,this.procesosolicitudesautorizaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral,this.procesosolicitudesautorizacionesBean,false);
		
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones());
		}
		
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones(),classes);//this.procesosolicitudesautorizacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoSolicitudesAutorizaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.RecargarFormProcesoSolicitudesAutorizaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
						
			if(procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();
			}
			
			this.actualizarVisualTableDatosProcesoSolicitudesAutorizaciones();
			
			this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoSolicitudesAutorizaciones(), this.getIndiceNuevoProcesoSolicitudesAutorizaciones());
			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_monedaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_completo_clienteProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_emisionProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_pagoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimientoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_localProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_extraProcesoSolicitudesAutorizaciones);	
		//
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarid_empresaProcesoSolicitudesAutorizaciones);//
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarid_sucursalProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setEnabled(isHabilitar && this.procesosolicitudesautorizacionesConstantesFunciones.activarid_clienteProcesoSolicitudesAutorizaciones);
	};
	
	public void setDefaultControlesProcesoSolicitudesAutorizaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoSolicitudesAutorizaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(true);			
			this.procesosolicitudesautorizacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setVisible(true);
			
					
		} else {
			//this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(false);			
			this.procesosolicitudesautorizacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoSolicitudesAutorizaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				if(procesosolicitudesautorizacionesAux.getId().equals(this.iIdNuevoProcesoSolicitudesAutorizaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacioness) {
				if(procesosolicitudesautorizacionesAux.getId().equals(this.iIdNuevoProcesoSolicitudesAutorizaciones)) {
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
	
	public int getIndiceActualProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				if(procesosolicitudesautorizacionesAux.getId().equals(procesosolicitudesautorizaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacioness) {
				if(procesosolicitudesautorizacionesAux.getId().equals(procesosolicitudesautorizaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				if(procesosolicitudesautorizacionesAux.getProcesoSolicitudesAutorizacionesOriginal().getId().equals(procesosolicitudesautorizacionesOriginal.getId())) {
					existe=true;
					procesosolicitudesautorizacionesOriginal.setId(procesosolicitudesautorizacionesAux.getId());
					procesosolicitudesautorizacionesOriginal.setVersionRow(procesosolicitudesautorizacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacioness) {
				if(procesosolicitudesautorizacionesAux.getProcesoSolicitudesAutorizacionesOriginal().getId().equals(procesosolicitudesautorizacionesOriginal.getId())) {
					existe=true;
					procesosolicitudesautorizacionesOriginal.setId(procesosolicitudesautorizacionesAux.getId());
					procesosolicitudesautorizacionesOriginal.setVersionRow(procesosolicitudesautorizacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoSolicitudesAutorizaciones(Boolean esParaCancelar) throws Exception {
		procesosolicitudesautorizacionessAux=new ArrayList<ProcesoSolicitudesAutorizaciones>();
		procesosolicitudesautorizacionesAux=new ProcesoSolicitudesAutorizaciones();
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
					if(procesosolicitudesautorizacionesAux.getId()<0) {
						procesosolicitudesautorizacionessAux.add(procesosolicitudesautorizacionesAux);
					}		
				}
				this.iIdNuevoProcesoSolicitudesAutorizaciones=0L;
				this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().removeAll(procesosolicitudesautorizacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacioness) {
					if(procesosolicitudesautorizacionesAux.getId()<0) {
						procesosolicitudesautorizacionessAux.add(procesosolicitudesautorizacionesAux);
					}		
				}
				this.iIdNuevoProcesoSolicitudesAutorizaciones=0L;
				this.procesosolicitudesautorizacioness.removeAll(procesosolicitudesautorizacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoSolicitudesAutorizaciones 
					&& this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size()>0
					) {
					procesosolicitudesautorizacionesAux=this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().get(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size() - 1);
				
					if(procesosolicitudesautorizacionesAux.getId()<0) {
						this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().remove(procesosolicitudesautorizacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoSolicitudesAutorizaciones && this.procesosolicitudesautorizacioness.size()>0) {
					procesosolicitudesautorizacionesAux=this.procesosolicitudesautorizacioness.get(this.procesosolicitudesautorizacioness.size() - 1);
				
					if(procesosolicitudesautorizacionesAux.getId()<0) {
						this.procesosolicitudesautorizacioness.remove(procesosolicitudesautorizacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoSolicitudesAutorizaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesosolicitudesautorizaciones.getId()<0) {
				this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().remove(this.procesosolicitudesautorizaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesosolicitudesautorizaciones.getId()<0) {
				this.procesosolicitudesautorizacioness.remove(this.procesosolicitudesautorizaciones);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoSolicitudesAutorizaciones(List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessAux) throws Exception {
		ProcesoSolicitudesAutorizacionesConstantesFunciones.setEstadosInicialesProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionessAux);
	}
	
	public void setEstadosInicialesProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux) throws Exception {
		ProcesoSolicitudesAutorizacionesConstantesFunciones.setEstadosInicialesProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoSolicitudesAutorizacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoSolicitudesAutorizacionesActual()) {
				if(!this.isEsNuevoProcesoSolicitudesAutorizaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoSolicitudesAutorizacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Solicitudes Autorizaciones ?", "MANTENIMIENTO DE Proceso Solicitudes Autorizaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) throws Exception {
		ProcesoSolicitudesAutorizacionesConstantesFunciones.seleccionarAsignar(this.procesosolicitudesautorizaciones,procesosolicitudesautorizaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoSolicitudesAutorizaciones=this.isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones;
			
			
			this.seleccionarAsignar(procesosolicitudesautorizaciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesosolicitudesautorizacionesSessionBean.setsFuncionBusquedaRapida(this.procesosolicitudesautorizacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoSolicitudesAutorizaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoSolicitudesAutorizaciones(esParaCancelar);				
				this.cancelarNuevoProcesoSolicitudesAutorizaciones(esParaCancelar);								
			}
			
			this.procesosolicitudesautorizaciones=new ProcesoSolicitudesAutorizaciones();
			
			this.inicializarProcesoSolicitudesAutorizaciones();
			
			this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoSolicitudesAutorizaciones() throws Exception {
		try {
			ProcesoSolicitudesAutorizacionesConstantesFunciones.inicializarProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoSolicitudesAutorizacioness(String sAccionBusqueda,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoSolicitudesAutorizaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoSolicitudesAutorizacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoSolicitudesAutorizacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoSolicitudesAutorizaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Solicitudes Autorizacioneses");		
		parameters.put("busquedapor", ProcesoSolicitudesAutorizacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoSolicitudesAutorizaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoSolicitudesAutorizacionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoSolicitudesAutorizacionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoSolicitudesAutorizaciones=new JRBeanArrayDataSource(ProcesoSolicitudesAutorizacionesJInternalFrame.TraerProcesoSolicitudesAutorizacionesBeans(procesosolicitudesautorizacionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoSolicitudesAutorizaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoSolicitudesAutorizacionesBean.TraerProcesoSolicitudesAutorizacionesBeans(procesosolicitudesautorizacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(null);
					//this.generarExcelReporteProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoSolicitudesAutorizacioness(sAccionBusqueda,sTipoArchivoReporte,procesosolicitudesautorizacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoSolicitudesAutorizacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSolicitudesAutorizacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoSolicitudesAutorizaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones : procesosolicitudesautorizacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoSolicitudesAutorizacionesConstantesFunciones.generarExcelReporteDataProcesoSolicitudesAutorizaciones("NORMAL",row,workbook,procesosolicitudesautorizaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoSolicitudesAutorizaciones(String sTipo,Row row,Workbook workbook) {
		
		ProcesoSolicitudesAutorizacionesConstantesFunciones.generarExcelReporteHeaderProcesoSolicitudesAutorizaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoSolicitudesAutorizacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSolicitudesAutorizacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones : procesosolicitudesautorizacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.getProcesoSolicitudesAutorizacionesDescripcion(procesosolicitudesautorizaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getnombre_moneda());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getfecha_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_extra());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoSolicitudesAutorizacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessRespaldo=null;
		
		classes=ProcesoSolicitudesAutorizacionesConstantesFunciones.getClassesRelationshipsOfProcesoSolicitudesAutorizaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesosolicitudesautorizacionesLogic.setDatosCliente(this.datosCliente);
		this.procesosolicitudesautorizacionesLogic.setDatosDeep(this.datosDeep);
		this.procesosolicitudesautorizacionesLogic.setIsConDeep(true);
		
		procesosolicitudesautorizacionessRespaldo=this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness();
		
		this.procesosolicitudesautorizacionesLogic.setProcesoSolicitudesAutorizacioness(procesosolicitudesautorizacionessParaReportes);	
		this.procesosolicitudesautorizacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesosolicitudesautorizacionessParaReportes=this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness();
		this.procesosolicitudesautorizacionesLogic.setProcesoSolicitudesAutorizacioness(procesosolicitudesautorizacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSolicitudesAutorizacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoSolicitudesAutorizaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones : procesosolicitudesautorizacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoSolicitudesAutorizaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoSolicitudesAutorizacionesConstantesFunciones.generarExcelReporteDataProcesoSolicitudesAutorizaciones("NORMAL",row,workbook,procesosolicitudesautorizaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.getProcesoSolicitudesAutorizacionesDescripcion(procesosolicitudesautorizaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoSolicitudesAutorizaciones() throws Exception {		
		this.startProcessProcesoSolicitudesAutorizaciones(true);
	}
	
	public void startProcessProcesoSolicitudesAutorizaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones ,this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones, this.jScrollPanelDatosProcesoSolicitudesAutorizaciones,this.jPanelPaginacionProcesoSolicitudesAutorizaciones, this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones, this.jPanelAccionesProcesoSolicitudesAutorizaciones,this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones,this.jmenuBarProcesoSolicitudesAutorizaciones,this.jmenuBarDetalleProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones=this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones; 
		
		final JPanel jPanelParametrosReportesProcesoSolicitudesAutorizaciones=this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones;
		//final JScrollPane jScrollPanelDatosProcesoSolicitudesAutorizaciones=this.jScrollPanelDatosProcesoSolicitudesAutorizaciones;
		final JTable jTableDatosProcesoSolicitudesAutorizaciones=this.jTableDatosProcesoSolicitudesAutorizaciones;		
		final JPanel jPanelPaginacionProcesoSolicitudesAutorizaciones=this.jPanelPaginacionProcesoSolicitudesAutorizaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones=this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones;
		final JPanel jPanelAccionesProcesoSolicitudesAutorizaciones=this.jPanelAccionesProcesoSolicitudesAutorizaciones;
		
		JPanel jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelCamposProcesoSolicitudesAutorizaciones;
			jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones;
		}
		
		final JPanel jPanelCamposProcesoSolicitudesAutorizaciones=jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones;
		final JPanel jPanelAccionesFormularioProcesoSolicitudesAutorizaciones=jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones;
		
		
		final JMenuBar jmenuBarProcesoSolicitudesAutorizaciones=this.jmenuBarProcesoSolicitudesAutorizaciones;
		final JToolBar jTtoolBarProcesoSolicitudesAutorizaciones=this.jTtoolBarProcesoSolicitudesAutorizaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jmenuBarDetalleProcesoSolicitudesAutorizaciones;
			jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTtoolBarDetalleProcesoSolicitudesAutorizaciones;
		}
		
		final JMenuBar jmenuBarDetalleProcesoSolicitudesAutorizaciones=jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones;
		final JToolBar jTtoolBarDetalleProcesoSolicitudesAutorizaciones=jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoSolicitudesAutorizaciones;
			processRunnable.jTableDatos=jTableDatosProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoSolicitudesAutorizaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoSolicitudesAutorizaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoSolicitudesAutorizaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesoSolicitudesAutorizaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoSolicitudesAutorizaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones ,jPanelParametrosReportesProcesoSolicitudesAutorizaciones,jTableDatosProcesoSolicitudesAutorizaciones, /*jScrollPanelDatosProcesoSolicitudesAutorizaciones,*/jPanelCamposProcesoSolicitudesAutorizaciones,jPanelPaginacionProcesoSolicitudesAutorizaciones, /*jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones,*/ jPanelAccionesProcesoSolicitudesAutorizaciones,jPanelAccionesFormularioProcesoSolicitudesAutorizaciones,jmenuBarProcesoSolicitudesAutorizaciones,jmenuBarDetalleProcesoSolicitudesAutorizaciones,jTtoolBarProcesoSolicitudesAutorizaciones,jTtoolBarDetalleProcesoSolicitudesAutorizaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones ,jPanelParametrosReportesProcesoSolicitudesAutorizaciones, jScrollPanelDatosProcesoSolicitudesAutorizaciones,jPanelPaginacionProcesoSolicitudesAutorizaciones, jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones, jPanelAccionesProcesoSolicitudesAutorizaciones,jPanelAccionesFormularioProcesoSolicitudesAutorizaciones,jmenuBarProcesoSolicitudesAutorizaciones,jmenuBarDetalleProcesoSolicitudesAutorizaciones,jTtoolBarProcesoSolicitudesAutorizaciones,jTtoolBarDetalleProcesoSolicitudesAutorizaciones);
						
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
	
	public void finishProcessProcesoSolicitudesAutorizaciones() {// throws Exception 
		this.finishProcessProcesoSolicitudesAutorizaciones(true);
	}
	
	public void finishProcessProcesoSolicitudesAutorizaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones ,this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones, this.jScrollPanelDatosProcesoSolicitudesAutorizaciones,this.jPanelPaginacionProcesoSolicitudesAutorizaciones, this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones, this.jPanelAccionesProcesoSolicitudesAutorizaciones,this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones,this.jmenuBarProcesoSolicitudesAutorizaciones,this.jmenuBarDetalleProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones=this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones; 
		
		final JPanel jPanelParametrosReportesProcesoSolicitudesAutorizaciones=this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones;
		//final JScrollPane jScrollPanelDatosProcesoSolicitudesAutorizaciones=this.jScrollPanelDatosProcesoSolicitudesAutorizaciones;
		final JTable jTableDatosProcesoSolicitudesAutorizaciones=this.jTableDatosProcesoSolicitudesAutorizaciones;		
		final JPanel jPanelPaginacionProcesoSolicitudesAutorizaciones=this.jPanelPaginacionProcesoSolicitudesAutorizaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones=this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones;
		final JPanel jPanelAccionesProcesoSolicitudesAutorizaciones=this.jPanelAccionesProcesoSolicitudesAutorizaciones;
		
		JPanel jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelCamposProcesoSolicitudesAutorizaciones;
			jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones;
		}
		
		final JPanel jPanelCamposProcesoSolicitudesAutorizaciones=jPanelCamposAuxiliarProcesoSolicitudesAutorizaciones;
		final JPanel jPanelAccionesFormularioProcesoSolicitudesAutorizaciones=jPanelAccionesFormularioAuxiliarProcesoSolicitudesAutorizaciones;
		
		
		final JMenuBar jmenuBarProcesoSolicitudesAutorizaciones=this.jmenuBarProcesoSolicitudesAutorizaciones;		
		final JToolBar jTtoolBarProcesoSolicitudesAutorizaciones=this.jTtoolBarProcesoSolicitudesAutorizaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jmenuBarDetalleProcesoSolicitudesAutorizaciones;
			jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTtoolBarDetalleProcesoSolicitudesAutorizaciones;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoSolicitudesAutorizaciones=jmenuBarDetalleAuxiliarProcesoSolicitudesAutorizaciones;
		final JToolBar jTtoolBarDetalleProcesoSolicitudesAutorizaciones=jTtoolBarDetalleAuxiliarProcesoSolicitudesAutorizaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoSolicitudesAutorizaciones;
			processRunnable.jTableDatos=jTableDatosProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoSolicitudesAutorizaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoSolicitudesAutorizaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoSolicitudesAutorizaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoSolicitudesAutorizaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesoSolicitudesAutorizaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoSolicitudesAutorizaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones ,jPanelParametrosReportesProcesoSolicitudesAutorizaciones, jTableDatosProcesoSolicitudesAutorizaciones,/*jScrollPanelDatosProcesoSolicitudesAutorizaciones,*/jPanelCamposProcesoSolicitudesAutorizaciones,jPanelPaginacionProcesoSolicitudesAutorizaciones, /*jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones,*/ jPanelAccionesProcesoSolicitudesAutorizaciones,jPanelAccionesFormularioProcesoSolicitudesAutorizaciones,jmenuBarProcesoSolicitudesAutorizaciones,jmenuBarDetalleProcesoSolicitudesAutorizaciones,jTtoolBarProcesoSolicitudesAutorizaciones,jTtoolBarDetalleProcesoSolicitudesAutorizaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoSolicitudesAutorizaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoSolicitudesAutorizaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoSolicitudesAutorizaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoSolicitudesAutorizaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoSolicitudesAutorizaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoSolicitudesAutorizaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoSolicitudesAutorizaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesosolicitudesautorizacionesConstantesFunciones.getsFinalQueryProcesoSolicitudesAutorizaciones();
		String  finalQueryPaginacionTodos=this.procesosolicitudesautorizacionesConstantesFunciones.getsFinalQueryProcesoSolicitudesAutorizaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoSolicitudesAutorizacionesConstantesFunciones.getArrayColumnasGlobalesNoProcesoSolicitudesAutorizaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoSolicitudesAutorizacionesConstantesFunciones.getArrayColumnasGlobalesProcesoSolicitudesAutorizaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoSolicitudesAutorizacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesosolicitudesautorizacionessEliminados= new ArrayList<ProcesoSolicitudesAutorizaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoSolicitudesAutorizaciones();
		
				///*ProcesoSolicitudesAutorizacionesSessionBean*/this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
			
			if(this.procesosolicitudesautorizacionesSessionBean==null) {
				this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
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
					this.iNumeroPaginacion=ProcesoSolicitudesAutorizacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoSolicitudesAutorizacionesConstantesFunciones.getClassesForeignKeysOfProcesoSolicitudesAutorizaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesosolicitudesautorizaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesosolicitudesautorizacionessAux= new ArrayList<ProcesoSolicitudesAutorizaciones>();
			
				
			procesosolicitudesautorizacionesLogic.setDatosCliente(this.datosCliente);
			procesosolicitudesautorizacionesLogic.setDatosDeep(this.datosDeep);
			procesosolicitudesautorizacionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoSolicitudesAutorizaciones")) {
				this.sDetalleReporte=ProcesoSolicitudesAutorizacionesConstantesFunciones.getDetalleIndiceBusquedaProcesoSolicitudesAutorizaciones(id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoSolicitudesAutorizacionesConstantesFunciones.getDetalleIndiceBusquedaProcesoSolicitudesAutorizaciones(id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoSolicitudesAutorizacionesConstantesFunciones.getDetalleIndiceBusquedaProcesoSolicitudesAutorizaciones(id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()==null||procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesosolicitudesautorizacioness==null|| procesosolicitudesautorizacioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosolicitudesautorizacionessAux=new ArrayList<ProcesoSolicitudesAutorizaciones>();
						procesosolicitudesautorizacionessAux.addAll(procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosolicitudesautorizacionessAux=new ArrayList<ProcesoSolicitudesAutorizaciones>();
							procesosolicitudesautorizacionessAux.addAll(procesosolicitudesautorizacioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoSolicitudesAutorizacionesConstantesFunciones.getDetalleIndiceBusquedaProcesoSolicitudesAutorizaciones(id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoSolicitudesAutorizacionesConstantesFunciones.getDetalleIndiceBusquedaProcesoSolicitudesAutorizaciones(id_clienteBusquedaProcesoSolicitudesAutorizaciones,fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoSolicitudesAutorizacioness("BusquedaProcesoSolicitudesAutorizaciones",procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoSolicitudesAutorizacioness("BusquedaProcesoSolicitudesAutorizaciones",procesosolicitudesautorizacioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosolicitudesautorizacionesLogic.setProcesoSolicitudesAutorizacioness(new ArrayList<ProcesoSolicitudesAutorizaciones>());
						procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().addAll(procesosolicitudesautorizacionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosolicitudesautorizacioness=new ArrayList<ProcesoSolicitudesAutorizaciones>();
							procesosolicitudesautorizacioness.addAll(procesosolicitudesautorizacionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoSolicitudesAutorizaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoSolicitudesAutorizaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosolicitudesautorizacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosolicitudesautorizacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) {
		Boolean permite=true;
		
		if(this.procesosolicitudesautorizaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoSolicitudesAutorizacionesConstantesFunciones.getOrderByListaProcesoSolicitudesAutorizaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoSolicitudesAutorizacionesConstantesFunciones.getOrderByListaProcesoSolicitudesAutorizaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				if(procesosolicitudesautorizaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesosolicitudesautorizacionesTotales=procesosolicitudesautorizaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:this.procesosolicitudesautorizacioness) {
				if(procesosolicitudesautorizaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesosolicitudesautorizacionesTotales=procesosolicitudesautorizaciones;
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
			this.procesosolicitudesautorizacionesAux=new ProcesoSolicitudesAutorizaciones();
			this.procesosolicitudesautorizacionesAux.setsType(Constantes2.S_TOTALES);
			this.procesosolicitudesautorizacionesAux.setIsNew(false);
			this.procesosolicitudesautorizacionesAux.setIsChanged(false);
			this.procesosolicitudesautorizacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoSolicitudesAutorizacionesConstantesFunciones.TotalizarValoresFilaProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness(),this.procesosolicitudesautorizacionesAux);
				
				//this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().add(this.procesosolicitudesautorizacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoSolicitudesAutorizacionesConstantesFunciones.TotalizarValoresFilaProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacioness,this.procesosolicitudesautorizacionesAux);
				
				this.procesosolicitudesautorizacioness.add(this.procesosolicitudesautorizacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesosolicitudesautorizacionesTotales=new ProcesoSolicitudesAutorizaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().remove(procesosolicitudesautorizacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesosolicitudesautorizacioness.remove(procesosolicitudesautorizacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesosolicitudesautorizacionesTotales=new ProcesoSolicitudesAutorizaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				if(procesosolicitudesautorizaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesosolicitudesautorizacionesTotales=procesosolicitudesautorizaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoSolicitudesAutorizacionesConstantesFunciones.TotalizarValoresFilaProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness(),procesosolicitudesautorizacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:this.procesosolicitudesautorizacioness) {
				if(procesosolicitudesautorizaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesosolicitudesautorizacionesTotales=procesosolicitudesautorizaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoSolicitudesAutorizacionesConstantesFunciones.TotalizarValoresFilaProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacioness,procesosolicitudesautorizacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoSolicitudesAutorizaciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones(String sFinalQuery,Long id_cliente,Date fecha_vencimiento_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones(sFinalQuery,this.pagination,id_cliente,fecha_vencimiento_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoSolicitudesAutorizacionessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacionessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoSolicitudesAutorizaciones() {
		this.isPermisoTodoProcesoSolicitudesAutorizaciones=false;
		this.isPermisoNuevoProcesoSolicitudesAutorizaciones=false;
		this.isPermisoActualizarProcesoSolicitudesAutorizaciones=false;
		this.isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones=false;
		this.isPermisoEliminarProcesoSolicitudesAutorizaciones=false;
		this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones=false;
		this.isPermisoConsultaProcesoSolicitudesAutorizaciones=true;
		this.isPermisoBusquedaProcesoSolicitudesAutorizaciones=true;
		this.isPermisoReporteProcesoSolicitudesAutorizaciones=true;
		this.isPermisoOrdenProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoCopiarProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoVerFormProcesoSolicitudesAutorizaciones=false;		
		this.isPermisoDuplicarProcesoSolicitudesAutorizaciones=false;
		this.isPermisoOrdenProcesoSolicitudesAutorizaciones=false;
	}
	
	public void setPermisosUsuarioProcesoSolicitudesAutorizaciones(Boolean isPermiso) {
		this.isPermisoTodoProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoNuevoProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoActualizarProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoEliminarProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoConsultaProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoBusquedaProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoReporteProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoOrdenProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoCopiarProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoVerFormProcesoSolicitudesAutorizaciones=isPermiso;		
		this.isPermisoDuplicarProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoOrdenProcesoSolicitudesAutorizaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoSolicitudesAutorizaciones(Boolean isPermiso) {
		//this.isPermisoTodoProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoNuevoProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoActualizarProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoEliminarProcesoSolicitudesAutorizaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones=isPermiso;
		//this.isPermisoConsultaProcesoSolicitudesAutorizaciones=isPermiso;
		//this.isPermisoBusquedaProcesoSolicitudesAutorizaciones=isPermiso;
		//this.isPermisoReporteProcesoSolicitudesAutorizaciones=isPermiso;
		//this.isPermisoOrdenProcesoSolicitudesAutorizaciones=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones=isPermiso;		
		//this.isPermisoCopiarProcesoSolicitudesAutorizaciones=isPermiso;		
		//this.isPermisoDuplicarProcesoSolicitudesAutorizaciones=isPermiso;
		//this.isPermisoOrdenProcesoSolicitudesAutorizaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoSolicitudesAutorizacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoSolicitudesAutorizaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoSolicitudesAutorizacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoSolicitudesAutorizacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoSolicitudesAutorizacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoSolicitudesAutorizacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoSolicitudesAutorizaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoSolicitudesAutorizacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoSolicitudesAutorizaciones=this.isPermisoActualizarProcesoSolicitudesAutorizaciones;
			this.isPermisoEliminarProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoSolicitudesAutorizaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoSolicitudesAutorizaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.setToolTipText(this.jTableDatosProcesoSolicitudesAutorizaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoSolicitudesAutorizaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoSolicitudesAutorizaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoSolicitudesAutorizaciones() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoSolicitudesAutorizacionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoSolicitudesAutorizacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.procesosolicitudesautorizacionesSessionBean==null) {
				this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
			}

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.procesosolicitudesautorizacionesSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoSolicitudesAutorizaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoSolicitudesAutorizaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoSolicitudesAutorizaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoSolicitudesAutorizaciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean(); 
		this.procesosolicitudesautorizacionesConstantesFunciones=new ProcesoSolicitudesAutorizacionesConstantesFunciones(); 
		this.procesosolicitudesautorizacionesBean=new ProcesoSolicitudesAutorizaciones();//(this.procesosolicitudesautorizacionesConstantesFunciones); 		
		this.procesosolicitudesautorizacionesReturnGeneral=new ProcesoSolicitudesAutorizacionesParameterReturnGeneral(); 
		
		this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosolicitudesautorizacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoSolicitudesAutorizaciones(true);
			
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
			
			this.procesosolicitudesautorizacionesConstantesFunciones=new ProcesoSolicitudesAutorizacionesConstantesFunciones(); 
			this.procesosolicitudesautorizacionesBean=new ProcesoSolicitudesAutorizaciones();//this.procesosolicitudesautorizacionesConstantesFunciones); 			
			this.procesosolicitudesautorizacionesReturnGeneral=new ProcesoSolicitudesAutorizacionesParameterReturnGeneral(); 
		
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Solicitudes Autorizaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesosolicitudesautorizaciones=new ProcesoSolicitudesAutorizaciones();
			this.procesosolicitudesautorizacioness = new ArrayList<ProcesoSolicitudesAutorizaciones>();
			this.procesosolicitudesautorizacionessAux = new ArrayList<ProcesoSolicitudesAutorizaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic=new ProcesoSolicitudesAutorizacionesLogic();
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesosolicitudesautorizacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones);	
					}
					
					if(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones);
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setVisible(false);
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones);
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones);
					this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setVisible(false);
					this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones);
					this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setVisible(false);
					this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoSolicitudesAutorizacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoSolicitudesAutorizacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesosolicitudesautorizacionesReturnGeneral=new ProcesoSolicitudesAutorizacionesParameterReturnGeneral();
			
			this.procesosolicitudesautorizacionesParameterGeneral=new ProcesoSolicitudesAutorizacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesosolicitudesautorizacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoSolicitudesAutorizacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoSolicitudesAutorizacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			
			
			this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoSolicitudesAutorizaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoSolicitudesAutorizaciones(false);
			
			this.setPermisosUsuarioProcesoSolicitudesAutorizaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() && this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoSolicitudesAutorizacionesClasesRelacionadas();
			}
			
			if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoSolicitudesAutorizacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoSolicitudesAutorizaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoSolicitudesAutorizaciones();
			}
			
			if(!this.isPermisoBusquedaProcesoSolicitudesAutorizaciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoSolicitudesAutorizacionesConstantesFunciones.getTiposSeleccionarProcesoSolicitudesAutorizaciones());
				
				this.tiposColumnasSelect=ProcesoSolicitudesAutorizacionesConstantesFunciones.getTiposSeleccionarProcesoSolicitudesAutorizaciones(true);
				
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
			//if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoSolicitudesAutorizaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoSolicitudesAutorizaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoSolicitudesAutorizaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSolicitudesAutorizaciones() ;
			
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
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesosolicitudesautorizacionesImplementable= (ProcesoSolicitudesAutorizacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoSolicitudesAutorizacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesosolicitudesautorizacionesImplementableHome= (ProcesoSolicitudesAutorizacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoSolicitudesAutorizacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesosolicitudesautorizacioness= new ArrayList<ProcesoSolicitudesAutorizaciones>();
			this.procesosolicitudesautorizacionessEliminados= new ArrayList<ProcesoSolicitudesAutorizaciones>();
						
			this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
			this.esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoSolicitudesAutorizaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoSolicitudesAutorizaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoSolicitudesAutorizacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoSolicitudesAutorizaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoSolicitudesAutorizaciones();
			}
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoSolicitudesAutorizaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoSolicitudesAutorizaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoSolicitudesAutorizaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoSolicitudesAutorizaciones")) {
				iIndex=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoSolicitudesAutorizaciones();	
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
	
	public void cargarCombosForeignKeyProcesoSolicitudesAutorizaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoSolicitudesAutorizaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoSolicitudesAutorizaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoSolicitudesAutorizacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoSolicitudesAutorizaciones();
		
		this.cargarCombosFrameForeignKeyProcesoSolicitudesAutorizaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoSolicitudesAutorizaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoSolicitudesAutorizaciones();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			
			if(jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()>=1) {
				jTableDatosProcesoSolicitudesAutorizaciones.removeRowSelectionInterval(0, jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoSolicitudesAutorizaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(true);			
			//this.procesosolicitudesautorizaciones=new ProcesoSolicitudesAutorizaciones();
			//this.procesosolicitudesautorizaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones() ;
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSolicitudesAutorizaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesosolicitudesautorizaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);				
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoSolicitudesAutorizaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRows().length;			
			}
			
			procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoSolicitudesAutorizaciones--;			
				//ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux= new ProcesoSolicitudesAutorizaciones();			
				//procesosolicitudesautorizacionesAux.setId(this.iIdNuevoProcesoSolicitudesAutorizaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesOrigen=new ProcesoSolicitudesAutorizaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesOrigen : procesosolicitudesautorizacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesosolicitudesautorizacionesOrigen =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosolicitudesautorizacionesOrigen =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoSolicitudesAutorizaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesosolicitudesautorizaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesOrigen,this.procesosolicitudesautorizaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().add(this.procesosolicitudesautorizacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizacioness.add(this.procesosolicitudesautorizacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoSolicitudesAutorizaciones(), this.getIndiceNuevoProcesoSolicitudesAutorizaciones());
				
				int iLastRow =  this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoSolicitudesAutorizaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();									
		
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesOrigen=new ProcesoSolicitudesAutorizaciones();
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesDestino=new ProcesoSolicitudesAutorizaciones();
				
			procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesosolicitudesautorizacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosolicitudesautorizacionesOrigen =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesosolicitudesautorizacionesOrigen =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosolicitudesautorizacionesDestino =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesosolicitudesautorizacionesDestino =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesosolicitudesautorizacionesOrigen =procesosolicitudesautorizacionessSeleccionados.get(0);
				procesosolicitudesautorizacionesDestino =procesosolicitudesautorizacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesOrigen,procesosolicitudesautorizacionesDestino,true,false);
				
				procesosolicitudesautorizacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesosolicitudesautorizacionesDestino,procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesosolicitudesautorizacionesDestino,procesosolicitudesautorizacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
				
				//this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoSolicitudesAutorizaciones(), this.getIndiceNuevoProcesoSolicitudesAutorizaciones());
				
				int iLastRow =  this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoSolicitudesAutorizaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(!isVisible);
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(!isVisible);
			this.jPanelAccionesProcesoSolicitudesAutorizaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoSolicitudesAutorizaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoSolicitudesAutorizaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoSolicitudesAutorizaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoSolicitudesAutorizaciones();
			
			this.abrirFrameOrderByProcesoSolicitudesAutorizaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoSolicitudesAutorizaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoSolicitudesAutorizaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSize(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.iWidthFormulario,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jContentPaneDetalleProcesoSolicitudesAutorizaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jContentPaneDetalleProcesoSolicitudesAutorizaciones.getWidth(),ProcesoSolicitudesAutorizacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jContentPaneDetalleProcesoSolicitudesAutorizaciones.getWidth(),ProcesoSolicitudesAutorizacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jContentPaneDetalleProcesoSolicitudesAutorizaciones.getWidth(),ProcesoSolicitudesAutorizacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoSolicitudesAutorizaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,false,this);
				} else {
					this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones);
				this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setVisible(false);
				this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setSelected(false);
				
				this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoSolicitudesAutorizaciones"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoSolicitudesAutorizaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoSolicitudesAutorizaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones==null) {
				
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones=new ImportacionJInternalFrame(ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones);
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setVisible(false);
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSelected(false);


				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoSolicitudesAutorizaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoSolicitudesAutorizaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones==null) {
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones=new ReporteDinamicoJInternalFrame(ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones);
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSolicitudesAutorizaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoSolicitudesAutorizaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones);
			
	       	this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.dispose();
			//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoSolicitudesAutorizaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoSolicitudesAutorizaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setVisible(true);
	        this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoSolicitudesAutorizaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setVisible(true);
	        this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoSolicitudesAutorizaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setVisible(false);
	        this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoSolicitudesAutorizaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoSolicitudesAutorizaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setVisible(false);
	        this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoSolicitudesAutorizaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoSolicitudesAutorizaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(true);
			//this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false) ;
			
			if(procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSolicitudesAutorizaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoSolicitudesAutorizaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(true);
			//this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesosolicitudesautorizaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false) ;
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSolicitudesAutorizaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoSolicitudesAutorizaciones(false);
			
			//if(!this.isEsNuevoProcesoSolicitudesAutorizaciones) {								
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				
			}
			
			if(this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
					this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
					this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(false);
				
				this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(false);
			
												
				
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoSolicitudesAutorizaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesosolicitudesautorizaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesosolicitudesautorizaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesosolicitudesautorizaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoSolicitudesAutorizacionesModel) this.jTableDatosProcesoSolicitudesAutorizaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
				this.isEsNuevoProcesoSolicitudesAutorizaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(false);
				
				this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(false);
				
				
				
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoSolicitudesAutorizaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()>=1) {
				jTableDatosProcesoSolicitudesAutorizaciones.removeRowSelectionInterval(0, jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoSolicitudesAutorizaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(false) ;
			
			this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
			
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoSolicitudesAutorizaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				
				//SI ES MANUAL
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoSolicitudesAutorizaciones--;			
			//ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux= new ProcesoSolicitudesAutorizaciones();			
			//procesosolicitudesautorizacionesAux.setId(this.iIdNuevoProcesoSolicitudesAutorizaciones);
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoSolicitudesAutorizaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
			
			this.procesosolicitudesautorizaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().add(this.procesosolicitudesautorizacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesosolicitudesautorizacioness.add(this.procesosolicitudesautorizacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			
			this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoSolicitudesAutorizaciones(), this.getIndiceNuevoProcesoSolicitudesAutorizaciones());
			
			int iLastRow =  this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoSolicitudesAutorizaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoSolicitudesAutorizaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
			
			//SI ES MANUAL
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();
			}
			
			//this.abrirFrameTreeProcesoSolicitudesAutorizaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setFileImportacion(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoSolicitudesAutorizaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		

		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoSolicitudesAutorizacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoSolicitudesAutorizacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneExtra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneExtra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneExtra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneExtra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoria="nombre_moneda";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoria="fecha_pago";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					sNombreCampoCategoria="debito_mone_extra";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoriaValor="nombre_moneda";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoriaValor="fecha_pago";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					sNombreCampoCategoriaValor="debito_mone_extra";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_moneda");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pago");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Extra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_extra");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoSolicitudesAutorizacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getnombre_moneda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getfecha_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA);
					iRow++;

					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_extra());
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
			//	this.getFilaCabeceraExportarExcelProcesoSolicitudesAutorizaciones(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoSolicitudesAutorizaciones(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
			
			//SI ES MANUAL
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
			
			//SI ES MANUAL
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
			
			//SI ES MANUAL
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoSolicitudesAutorizaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoSolicitudesAutorizaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoSolicitudesAutorizaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoSolicitudesAutorizaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoSolicitudesAutorizaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoSolicitudesAutorizaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoSolicitudesAutorizaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoSolicitudesAutorizaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSolicitudesAutorizaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoSolicitudesAutorizaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoSolicitudesAutorizaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones();
		
		this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoSolicitudesAutorizaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSolicitudesAutorizaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSolicitudesAutorizaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSolicitudesAutorizaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoSolicitudesAutorizaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSolicitudesAutorizaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSolicitudesAutorizaciones() throws Exception {
		try	{
			if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoSolicitudesAutorizaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoSolicitudesAutorizaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoSolicitudesAutorizaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSolicitudesAutorizaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSolicitudesAutorizaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoSolicitudesAutorizacionesConstantesFunciones.getTiposSeleccionarProcesoSolicitudesAutorizaciones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoSolicitudesAutorizacionesConstantesFunciones.getTiposSeleccionarProcesoSolicitudesAutorizaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoSolicitudesAutorizacionesConstantesFunciones.getTiposSeleccionarProcesoSolicitudesAutorizaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoSolicitudesAutorizaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.getSelectedItem()!=null){this.id_clienteBusquedaProcesoSolicitudesAutorizaciones=((Cliente)this.jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.getSelectedItem()).getId();}
		this.fecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizaciones=new Date(this.jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoSolicitudesAutorizaciones(Boolean esInicializar) throws Exception {				
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoSolicitudesAutorizaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones() throws Exception {
		this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoSolicitudesAutorizaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesosolicitudesautorizacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoSolicitudesAutorizaciones.setModel(new ProcesoSolicitudesAutorizacionesModel(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoSolicitudesAutorizaciones.setModel(new ProcesoSolicitudesAutorizacionesModel(this.procesosolicitudesautorizacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoSolicitudesAutorizaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,procesosolicitudesautorizacionesConstantesFunciones.resaltarSeleccionarProcesoSolicitudesAutorizaciones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,procesosolicitudesautorizacionesConstantesFunciones.resaltarSeleccionarProcesoSolicitudesAutorizaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostraridProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltaridProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activaridProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"idProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltaridProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activaridProcesoSolicitudesAutorizaciones,this,true,"idProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_monedaProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_monedaProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_monedaProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"nombre_monedaProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_monedaProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_monedaProcesoSolicitudesAutorizaciones,this,true,"nombre_monedaProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_completo_clienteProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_completo_clienteProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_completo_clienteProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"nombre_completo_clienteProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_completo_clienteProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_completo_clienteProcesoSolicitudesAutorizaciones,this,true,"nombre_completo_clienteProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"numero_pre_impreso_facturaProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,this,true,"numero_pre_impreso_facturaProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_emisionProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_emisionProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_emisionProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"fecha_emisionProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_emisionProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_emisionProcesoSolicitudesAutorizaciones,this,true,"fecha_emisionProcesoSolicitudesAutorizaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_pagoProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_pagoProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_pagoProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"fecha_pagoProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_pagoProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_pagoProcesoSolicitudesAutorizaciones,this,true,"fecha_pagoProcesoSolicitudesAutorizaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_vencimientoProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimientoProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimientoProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"fecha_vencimientoProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimientoProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimientoProcesoSolicitudesAutorizaciones,this,true,"fecha_vencimientoProcesoSolicitudesAutorizaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_localProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_localProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_localProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"debito_mone_localProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_localProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_localProcesoSolicitudesAutorizaciones,this,true,"debito_mone_localProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA));

		if(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_extraProcesoSolicitudesAutorizaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_extraProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_extraProcesoSolicitudesAutorizaciones,iSizeTabla,this,true,"debito_mone_extraProcesoSolicitudesAutorizaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_extraProcesoSolicitudesAutorizaciones,this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_extraProcesoSolicitudesAutorizaciones,this,true,"debito_mone_extraProcesoSolicitudesAutorizaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoSolicitudesAutorizacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoSolicitudesAutorizaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoSolicitudesAutorizaciones.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoSolicitudesAutorizaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoSolicitudesAutorizaciones.moveColumn(this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoSolicitudesAutorizaciones.moveColumn(this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoSolicitudesAutorizaciones.moveColumn(this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoSolicitudesAutorizaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoSolicitudesAutorizaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoSolicitudesAutorizaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoSolicitudesAutorizaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesosolicitudesautorizacioness.size()-1;
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
		//this.jTableDatosProcesoSolicitudesAutorizaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoSolicitudesAutorizaciones();
			
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
				
				//this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
					
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
				if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesosolicitudesautorizaciones.getsType().equals("DUPLICADO")
				   || this.procesosolicitudesautorizaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
				
				} else {
					this.isEsNuevoProcesoSolicitudesAutorizaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesosolicitudesautorizaciones.getId()>=0 && !this.procesosolicitudesautorizaciones.getIsNew()) {						
						this.isEsNuevoProcesoSolicitudesAutorizaciones=false;
						
					} else {
						this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoSolicitudesAutorizaciones(esRelaciones);						
				
				this.seleccionarProcesoSolicitudesAutorizaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesosolicitudesautorizaciones.getId()<0) {
					this.isEsNuevoProcesoSolicitudesAutorizaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoSolicitudesAutorizaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoSolicitudesAutorizaciones(evt,rowIndex);
				}	
				
				if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoSolicitudesAutorizaciones: " + this.dDif); 
					}
				}								
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoSolicitudesAutorizaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {
					if(this.procesosolicitudesautorizaciones.getId()>0) {
						this.procesosolicitudesautorizaciones.setIsDeleted(true);
						
						this.procesosolicitudesautorizacionessEliminados.add(this.procesosolicitudesautorizaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().remove(this.procesosolicitudesautorizaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizacioness.remove(this.procesosolicitudesautorizaciones);				
					}
					
					
					((ProcesoSolicitudesAutorizacionesModel) this.jTableDatosProcesoSolicitudesAutorizaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoSolicitudesAutorizaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoSolicitudesAutorizaciones) {
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getId().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnombre_moneda());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_pago());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_vencimiento());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getdebito_mone_extra().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesosolicitudesautorizacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesosolicitudesautorizacionesLocal=this.procesosolicitudesautorizaciones;
			} else {
				procesosolicitudesautorizacionesLocal=this.procesosolicitudesautorizacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesosolicitudesautorizacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesLocal,true);
					
					if(procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesosolicitudesautorizacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesosolicitudesautorizacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(procesosolicitudesautorizaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.getText()==null || this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.getText()=="" || this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setText("0");
			}

			if(conColumnasBase) {procesosolicitudesautorizaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelIdProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setnombre_moneda(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_monedaProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setnombre_completo_cliente(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setfecha_emision(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_emisionProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setfecha_pago(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_pagoProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setfecha_vencimiento(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesosolicitudesautorizaciones.setdebito_mone_extra(Double.parseDouble(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesBean,ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesOrigen,ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getId()!=null && !procesosolicitudesautorizacionesOrigen.getId().equals(0L))) {procesosolicitudesautorizaciones.setId(procesosolicitudesautorizacionesOrigen.getId());}}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getfecha_vencimiento_hasta()!=null && !procesosolicitudesautorizacionesOrigen.getfecha_vencimiento_hasta().equals(new Date()))) {procesosolicitudesautorizaciones.setfecha_vencimiento_hasta(procesosolicitudesautorizacionesOrigen.getfecha_vencimiento_hasta());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getnombre_moneda()!=null && !procesosolicitudesautorizacionesOrigen.getnombre_moneda().equals(""))) {procesosolicitudesautorizaciones.setnombre_moneda(procesosolicitudesautorizacionesOrigen.getnombre_moneda());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getnombre_completo_cliente()!=null && !procesosolicitudesautorizacionesOrigen.getnombre_completo_cliente().equals(""))) {procesosolicitudesautorizaciones.setnombre_completo_cliente(procesosolicitudesautorizacionesOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getnumero_pre_impreso_factura()!=null && !procesosolicitudesautorizacionesOrigen.getnumero_pre_impreso_factura().equals(""))) {procesosolicitudesautorizaciones.setnumero_pre_impreso_factura(procesosolicitudesautorizacionesOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getfecha_emision()!=null && !procesosolicitudesautorizacionesOrigen.getfecha_emision().equals(new Date()))) {procesosolicitudesautorizaciones.setfecha_emision(procesosolicitudesautorizacionesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getfecha_pago()!=null && !procesosolicitudesautorizacionesOrigen.getfecha_pago().equals(new Date()))) {procesosolicitudesautorizaciones.setfecha_pago(procesosolicitudesautorizacionesOrigen.getfecha_pago());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getfecha_vencimiento()!=null && !procesosolicitudesautorizacionesOrigen.getfecha_vencimiento().equals(new Date()))) {procesosolicitudesautorizaciones.setfecha_vencimiento(procesosolicitudesautorizacionesOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getdebito_mone_local()!=null && !procesosolicitudesautorizacionesOrigen.getdebito_mone_local().equals(0.0))) {procesosolicitudesautorizaciones.setdebito_mone_local(procesosolicitudesautorizacionesOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesOrigen.getdebito_mone_extra()!=null && !procesosolicitudesautorizacionesOrigen.getdebito_mone_extra().equals(0.0))) {procesosolicitudesautorizaciones.setdebito_mone_extra(procesosolicitudesautorizacionesOrigen.getdebito_mone_extra());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getId().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnombre_moneda());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_pago());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizaciones.getfecha_vencimiento());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizaciones.getdebito_mone_extra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizacionesBean procesosolicitudesautorizacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getnombre_moneda());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizacionesBean.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizacionesBean.getfecha_pago());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setDate(procesosolicitudesautorizacionesBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setText(procesosolicitudesautorizacionesBean.getdebito_mone_extra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizacionesParameterReturnGeneral procesosolicitudesautorizacionesReturnGeneral,ProcesoSolicitudesAutorizacionesBean procesosolicitudesautorizacionesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal=new ProcesoSolicitudesAutorizaciones();
			
			procesosolicitudesautorizacionesLocal=procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getId()!=null && !procesosolicitudesautorizacionesLocal.getId().equals(0L))) {procesosolicitudesautorizacionesBean.setId(procesosolicitudesautorizacionesLocal.getId());}}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getnombre_moneda()!=null && !procesosolicitudesautorizacionesLocal.getnombre_moneda().equals(""))) {procesosolicitudesautorizacionesBean.setnombre_moneda(procesosolicitudesautorizacionesLocal.getnombre_moneda());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getnombre_completo_cliente()!=null && !procesosolicitudesautorizacionesLocal.getnombre_completo_cliente().equals(""))) {procesosolicitudesautorizacionesBean.setnombre_completo_cliente(procesosolicitudesautorizacionesLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getnumero_pre_impreso_factura()!=null && !procesosolicitudesautorizacionesLocal.getnumero_pre_impreso_factura().equals(""))) {procesosolicitudesautorizacionesBean.setnumero_pre_impreso_factura(procesosolicitudesautorizacionesLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getfecha_emision()!=null && !procesosolicitudesautorizacionesLocal.getfecha_emision().equals(new Date()))) {procesosolicitudesautorizacionesBean.setfecha_emision(procesosolicitudesautorizacionesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getfecha_pago()!=null && !procesosolicitudesautorizacionesLocal.getfecha_pago().equals(new Date()))) {procesosolicitudesautorizacionesBean.setfecha_pago(procesosolicitudesautorizacionesLocal.getfecha_pago());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getfecha_vencimiento()!=null && !procesosolicitudesautorizacionesLocal.getfecha_vencimiento().equals(new Date()))) {procesosolicitudesautorizacionesBean.setfecha_vencimiento(procesosolicitudesautorizacionesLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getdebito_mone_local()!=null && !procesosolicitudesautorizacionesLocal.getdebito_mone_local().equals(0.0))) {procesosolicitudesautorizacionesBean.setdebito_mone_local(procesosolicitudesautorizacionesLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && procesosolicitudesautorizacionesLocal.getdebito_mone_extra()!=null && !procesosolicitudesautorizacionesLocal.getdebito_mone_extra().equals(0.0))) {procesosolicitudesautorizacionesBean.setdebito_mone_extra(procesosolicitudesautorizacionesLocal.getdebito_mone_extra());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoSolicitudesAutorizacionesGenerico(Long idProcesoSolicitudesAutorizacionesSeleccionado,JComboBox jComboBoxProcesoSolicitudesAutorizaciones,List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessLocal)throws Exception {
		try {
			ProcesoSolicitudesAutorizaciones  procesosolicitudesautorizacionesTemp=null;

			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessLocal) {
				if(procesosolicitudesautorizacionesAux.getId()!=null && procesosolicitudesautorizacionesAux.getId().equals(idProcesoSolicitudesAutorizacionesSeleccionado)) {
					procesosolicitudesautorizacionesTemp=procesosolicitudesautorizacionesAux;
					break;
				}
			}

			jComboBoxProcesoSolicitudesAutorizaciones.setSelectedItem(procesosolicitudesautorizacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoSolicitudesAutorizacionesGenerico(JComboBox jComboBoxProcesoSolicitudesAutorizaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoSolicitudesAutorizaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoSolicitudesAutorizaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoSolicitudesAutorizaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoSolicitudesAutorizaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosolicitudesautorizaciones=(ProcesoSolicitudesAutorizaciones) procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) procesosolicitudesautorizacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesosolicitudesautorizaciones.getIsNew() && !procesosolicitudesautorizaciones.getIsChanged() && !procesosolicitudesautorizaciones.getIsDeleted()) {
				sDescripcion=procesosolicitudesautorizaciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesosolicitudesautorizaciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesosolicitudesautorizaciones.getIsNew() && !procesosolicitudesautorizaciones.getIsChanged() && !procesosolicitudesautorizaciones.getIsDeleted()) {
				sDescripcion=procesosolicitudesautorizaciones.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesosolicitudesautorizaciones.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!procesosolicitudesautorizaciones.getIsNew() && !procesosolicitudesautorizaciones.getIsChanged() && !procesosolicitudesautorizaciones.getIsDeleted()) {
				sDescripcion=procesosolicitudesautorizaciones.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=procesosolicitudesautorizaciones.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesRow=new ProcesoSolicitudesAutorizaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosolicitudesautorizacionesRow=(ProcesoSolicitudesAutorizaciones) procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesosolicitudesautorizacionesRow=(ProcesoSolicitudesAutorizaciones) procesosolicitudesautorizacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));			
			this.jButtonDuplicarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones && this.isPermisoDuplicarProcesoSolicitudesAutorizaciones));			
			this.jButtonCopiarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones && this.isPermisoCopiarProcesoSolicitudesAutorizaciones));
			this.jButtonVerFormProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones && this.isPermisoVerFormProcesoSolicitudesAutorizaciones));
			
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));			
			
			this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));			
			this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones && this.isPermisoEliminarProcesoSolicitudesAutorizaciones));
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones);							
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));						
			this.jButtonDuplicarToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones && this.isPermisoDuplicarProcesoSolicitudesAutorizaciones));						
			this.jButtonCopiarToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones && this.isPermisoCopiarProcesoSolicitudesAutorizaciones));			
			this.jButtonVerFormToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones && this.isPermisoVerFormProcesoSolicitudesAutorizaciones));			
			this.jButtonAbrirOrderByToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));
			this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));			
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones  && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones && this.isPermisoEliminarProcesoSolicitudesAutorizaciones));
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones);				
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));			
			this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones && this.isPermisoDuplicarProcesoSolicitudesAutorizaciones));			
			this.jMenuItemCopiarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones && this.isPermisoCopiarProcesoSolicitudesAutorizaciones));			
			this.jMenuItemVerFormProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones && this.isPermisoVerFormProcesoSolicitudesAutorizaciones));			
			this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));			
			//this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));
			this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));			
			//this.jMenuItemDetalleMostrarOcultarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones && this.isPermisoOrdenProcesoSolicitudesAutorizaciones));			
			this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones));			
			this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones && this.isPermisoNuevoProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));									
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemModificarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemActualizarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones && this.isPermisoActualizarProcesoSolicitudesAutorizaciones));	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemEliminarProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones && this.isPermisoEliminarProcesoSolicitudesAutorizaciones));
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemCancelarProcesoSolicitudesAutorizaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones);				
			}
			
			this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));						
			this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=this.jButtonNuevoProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones=this.jButtonDuplicarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones=this.jButtonCopiarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones=this.jButtonVerFormProcesoSolicitudesAutorizaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoSolicitudesAutorizaciones=this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=this.jButtonModificarProcesoSolicitudesAutorizaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarToolBarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=this.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemModificarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemActualizarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemEliminarProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemCancelarProcesoSolicitudesAutorizaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoSolicitudesAutorizaciones(Boolean esInicializar) {
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoSolicitudesAutorizaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoSolicitudesAutorizaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoSolicitudesAutorizaciones() {
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoNuevoProcesoSolicitudesAutorizaciones);			
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoDuplicarProcesoSolicitudesAutorizaciones);			
		this.jButtonCopiarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoCopiarProcesoSolicitudesAutorizaciones);			
		this.jButtonVerFormProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoVerFormProcesoSolicitudesAutorizaciones);			
		
		this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoOrdenProcesoSolicitudesAutorizaciones);					
		
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoNuevoProcesoSolicitudesAutorizaciones);			
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoActualizarProcesoSolicitudesAutorizaciones);	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoActualizarProcesoSolicitudesAutorizaciones);	
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoEliminarProcesoSolicitudesAutorizaciones);
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones);						
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoActualizarProcesoSolicitudesAutorizaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoSolicitudesAutorizaciones() {
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoActualizarProcesoSolicitudesAutorizaciones);	
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoActualizarProcesoSolicitudesAutorizaciones);	
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.setVisible(this.isPermisoEliminarProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones);							
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones && this.isPermisoGuardarCambiosProcesoSolicitudesAutorizaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoSolicitudesAutorizaciones() {
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoSolicitudesAutorizaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoSolicitudesAutorizaciones() {
	}
	
	public void jTableDatosProcesoSolicitudesAutorizacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoSolicitudesAutorizaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesosolicitudesautorizaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoSolicitudesAutorizacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoSolicitudesAutorizaciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesosolicitudesautorizacionesLogic.getConnexion());

				if(this.procesosolicitudesautorizaciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesosolicitudesautorizaciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoSolicitudesAutorizaciones=(TitledBorder)this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoSolicitudesAutorizaciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesosolicitudesautorizaciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoSolicitudesAutorizaciones(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesosolicitudesautorizacionesLogic.getConnexion());

				if(this.procesosolicitudesautorizaciones.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesosolicitudesautorizaciones.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoSolicitudesAutorizaciones=(TitledBorder)this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoSolicitudesAutorizaciones.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesosolicitudesautorizaciones.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteProcesoSolicitudesAutorizacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebProcesoSolicitudesAutorizaciones(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.procesosolicitudesautorizacionesLogic.getConnexion());

				if(this.procesosolicitudesautorizaciones.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.procesosolicitudesautorizaciones.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoSolicitudesAutorizaciones=(TitledBorder)this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderProcesoSolicitudesAutorizaciones.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.procesosolicitudesautorizaciones.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getfecha_vencimiento_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_hasta = '"+Funciones2.getStringPostgresDate(this.procesosolicitudesautorizaciones.getfecha_vencimiento_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getnombre_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_moneda like '%"+this.procesosolicitudesautorizaciones.getnombre_moneda()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.procesosolicitudesautorizaciones.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.procesosolicitudesautorizaciones.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.procesosolicitudesautorizaciones.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getfecha_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago = '"+Funciones2.getStringPostgresDate(this.procesosolicitudesautorizaciones.getfecha_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.procesosolicitudesautorizaciones.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.procesosolicitudesautorizaciones.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.getprocesosolicitudesautorizaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosolicitudesautorizaciones==null) {
						this.procesosolicitudesautorizaciones = new ProcesoSolicitudesAutorizaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);
				}

				if(this.procesosolicitudesautorizaciones.getdebito_mone_extra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_extra = "+this.procesosolicitudesautorizaciones.getdebito_mone_extra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);

			this.getProcesoSolicitudesAutorizacionessBusquedaProcesoSolicitudesAutorizaciones();

			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);

			//if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);

			this.getProcesoSolicitudesAutorizacionessFK_IdCliente();

			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);

			//if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);

			this.getProcesoSolicitudesAutorizacionessFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);

			//if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoSolicitudesAutorizacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);

			this.getProcesoSolicitudesAutorizacionessFK_IdSucursal();

			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);

			//if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosolicitudesautorizacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoSolicitudesAutorizaciones() {
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.dispose();
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.dispose();
			this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones=null;
		}
		
		if(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones!=null) {
			this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.dispose();
			this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoSolicitudesAutorizaciones();
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoSolicitudesAutorizaciones")) {
				jButtonDuplicarProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoSolicitudesAutorizaciones")) {
				jButtonCopiarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoSolicitudesAutorizaciones")) {
				jButtonVerFormProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonDuplicarProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoSolicitudesAutorizaciones")) {
				jButtonDuplicarProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoSolicitudesAutorizaciones")) {
				jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoSolicitudesAutorizaciones")) {
				jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoSolicitudesAutorizaciones")) {
				jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoSolicitudesAutorizaciones")) {
				jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoSolicitudesAutorizaciones")) {
				jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoSolicitudesAutorizaciones")) {
				jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoSolicitudesAutorizaciones")) {
				jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoSolicitudesAutorizaciones")) {
				jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonMostrarOcultarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoSolicitudesAutorizaciones")) {
				jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonCopiarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonVerFormProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoSolicitudesAutorizaciones")) {
				jButtonCopiarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoSolicitudesAutorizaciones")) {
				jButtonVerFormProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoSolicitudesAutorizaciones")) {
				jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoSolicitudesAutorizaciones")) {
				jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoSolicitudesAutorizaciones")) {
				jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoSolicitudesAutorizaciones")) {
				jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoSolicitudesAutorizaciones")) {
				jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoSolicitudesAutorizaciones")) {
				jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoSolicitudesAutorizaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones")) {
				jButtonAbrirOrderByProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoSolicitudesAutorizaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoSolicitudesAutorizaciones")) {
				jButtonMostrarOcultarProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoSolicitudesAutorizaciones")) {
				jButtonProcesarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoSolicitudesAutorizaciones")) {
				jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoSolicitudesAutorizaciones")) {
				
				jButtonGenerarImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoSolicitudesAutorizaciones")) {
				
				jButtonAbrirImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoSolicitudesAutorizaciones")) {
				jComboBoxTiposAccionesProcesoSolicitudesAutorizacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoSolicitudesAutorizaciones")) {
				jComboBoxTiposRelacionesProcesoSolicitudesAutorizacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoSolicitudesAutorizaciones")) {
				jComboBoxTiposAccionesProcesoSolicitudesAutorizacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoSolicitudesAutorizaciones")) {
				
				jComboBoxTiposSeleccionarProcesoSolicitudesAutorizacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoSolicitudesAutorizaciones")) {
				jTextFieldValorCampoGeneralProcesoSolicitudesAutorizacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoSolicitudesAutorizaciones")) {
				jButtonAbrirOrderByProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoSolicitudesAutorizaciones")) {
				jButtonAbrirOrderByProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarOrderByProcesoSolicitudesAutorizacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonidProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones")) {
				this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizacionesActionPerformed(evt);
			}
			
			;
			
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoSolicitudesAutorizaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesosolicitudesautorizacionesLocal=this.procesosolicitudesautorizaciones;
			} else {
				procesosolicitudesautorizacionesLocal=this.procesosolicitudesautorizacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
							
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
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
			
			


			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
								
						
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
								
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
							
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
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
			
			


			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
								
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoSolicitudesAutorizaciones")) {
					jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoSolicitudesAutorizaciones")) {
					jCheckBoxSeleccionadosProcesoSolicitudesAutorizacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoSolicitudesAutorizaciones")) {
					
				}
				
				


				
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
												
				
				


				
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
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
			
			


			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosolicitudesautorizaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosolicitudesautorizaciones);
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
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
				
				


				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSolicitudesAutorizaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSolicitudesAutorizaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSolicitudesAutorizacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosolicitudesautorizacionesAnterior =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoSolicitudesAutorizaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoSolicitudesAutorizacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesosolicitudesautorizaciones =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesosolicitudesautorizaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoSolicitudesAutorizaciones")) {
				
				}
				
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoSolicitudesAutorizaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoSolicitudesAutorizaciones")) {
			
			}
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoSolicitudesAutorizaciones();
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoSolicitudesAutorizaciones")) {
				jButtonDuplicarProcesoSolicitudesAutorizacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoSolicitudesAutorizaciones")) {
				jButtonCopiarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoSolicitudesAutorizaciones")) {
				jButtonVerFormProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoSolicitudesAutorizaciones")) {
				jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoSolicitudesAutorizaciones")) {
				jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoSolicitudesAutorizaciones")) {
				jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoSolicitudesAutorizaciones")) {
				jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoSolicitudesAutorizaciones")) {
				jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoSolicitudesAutorizaciones")) {
				jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoSolicitudesAutorizaciones")) {
				jButtonAbrirOrderByProcesoSolicitudesAutorizacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoSolicitudesAutorizaciones")) {
				jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoSolicitudesAutorizaciones")) {
				jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoSolicitudesAutorizaciones")) {
				jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonidProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProcesoSolicitudesAutorizacionesUpdate")) {
				this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda")) {
				this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusquedaActionPerformed(evt);
			}
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoSolicitudesAutorizaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoSolicitudesAutorizaciones")) {
				closingInternalFrameProcesoSolicitudesAutorizaciones();
				
			} else if(sTipo.equals("jButtonCancelarProcesoSolicitudesAutorizaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(null);
			}
			
			ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesosolicitudesautorizaciones,new Object(),this.procesosolicitudesautorizacionesParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoSolicitudesAutorizaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoSolicitudesAutorizaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoSolicitudesAutorizaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {
			if(!esControlTabla) {
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);			
				}
				
				if(this.procesosolicitudesautorizacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral,this.procesosolicitudesautorizacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesosolicitudesautorizacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoSolicitudesAutorizaciones(classes,this.procesosolicitudesautorizacionesReturnGeneral,this.procesosolicitudesautorizacionesBean,false);
					}
						
					if(this.procesosolicitudesautorizacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones());	
					}
						
					if(this.procesosolicitudesautorizacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones(),classes);//this.procesosolicitudesautorizacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,classes);//this.procesosolicitudesautorizacionesBean);									
				}
			
				if(ProcesoSolicitudesAutorizacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSolicitudesAutorizaciones(this.procesosolicitudesautorizaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesosolicitudesautorizacionesAnterior!=null) {
						this.procesosolicitudesautorizaciones=this.procesosolicitudesautorizacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesosolicitudesautorizacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones(),procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizaciones(),this.procesosolicitudesautorizacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoSolicitudesAutorizaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoSolicitudesAutorizaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoSolicitudesAutorizaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoSolicitudesAutorizaciones() throws Exception {
		
		ProcesoSolicitudesAutorizacionesModel procesosolicitudesautorizacionesModel=(ProcesoSolicitudesAutorizacionesModel)this.jTableDatosProcesoSolicitudesAutorizaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosolicitudesautorizacionesModel.procesosolicitudesautorizacioness=this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesosolicitudesautorizacionesModel.procesosolicitudesautorizacioness=this.procesosolicitudesautorizacioness;
		}
		
		
		((ProcesoSolicitudesAutorizacionesModel) this.jTableDatosProcesoSolicitudesAutorizaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoSolicitudesAutorizaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesosolicitudesautorizacionesAnterior(),this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesosolicitudesautorizacionesAnterior(),this.procesosolicitudesautorizacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoSolicitudesAutorizaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
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
										
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesosolicitudesautorizaciones,new Object(),generalEntityParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoSolicitudesAutorizacionesConstantesFunciones.getClassesRelationshipsOfProcesoSolicitudesAutorizaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoSolicitudesAutorizacionesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoSolicitudesAutorizaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoSolicitudesAutorizaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesosolicitudesautorizaciones,new Object(),generalEntityParameterGeneral,this.procesosolicitudesautorizacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizacionesBean procesosolicitudesautorizacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoSolicitudesAutorizaciones(ArrayList<Classe> classes,ProcesoSolicitudesAutorizacionesReturnGeneral procesosolicitudesautorizacionesReturnGeneral,ProcesoSolicitudesAutorizacionesBean procesosolicitudesautorizacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones = new ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(jDesktopPane,this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones(),this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setVisible(false);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.procesosolicitudesautorizacionesLogic=this.procesosolicitudesautorizacionesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoSolicitudesAutorizaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoSolicitudesAutorizaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoSolicitudesAutorizaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoSolicitudesAutorizaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoSolicitudesAutorizaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoSolicitudesAutorizaciones"));
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesoSolicitudesAutorizaciones"));

		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoSolicitudesAutorizaciones"));
					
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemModificarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesoSolicitudesAutorizaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoSolicitudesAutorizaciones"));
						
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemActualizarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesoSolicitudesAutorizaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoSolicitudesAutorizaciones"));
								
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemEliminarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesoSolicitudesAutorizaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoSolicitudesAutorizaciones"));
					
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemCancelarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoSolicitudesAutorizaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSolicitudesAutorizaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSolicitudesAutorizaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoSolicitudesAutorizaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonidProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoSolicitudesAutorizaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoSolicitudesAutorizaciones"));
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoSolicitudesAutorizaciones"));
		}
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoSolicitudesAutorizaciones"));
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoSolicitudesAutorizaciones"));
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"NuevoProcesoSolicitudesAutorizaciones"));
		
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"DuplicarProcesoSolicitudesAutorizaciones"));
		
		this.jButtonCopiarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"CopiarProcesoSolicitudesAutorizaciones"));
		
		this.jButtonVerFormProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"VerFormProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jButtonDuplicarToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesoSolicitudesAutorizaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonModificarToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoSolicitudesAutorizaciones"));
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemModificarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoSolicitudesAutorizaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesoSolicitudesAutorizaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoSolicitudesAutorizaciones"));
				
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemActualizarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoSolicitudesAutorizaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesoSolicitudesAutorizaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoSolicitudesAutorizaciones"));
						
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemEliminarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoSolicitudesAutorizaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesoSolicitudesAutorizaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoSolicitudesAutorizaciones"));
			
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemCancelarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoSolicitudesAutorizaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CerrarProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonCerrarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoSolicitudesAutorizaciones"));
			
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoSolicitudesAutorizaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoSolicitudesAutorizaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSolicitudesAutorizaciones"));
		}
		
		this.jButtonCopiarToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jButtonVerFormToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoSolicitudesAutorizaciones"));
		
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemCopiarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoSolicitudesAutorizaciones"));		
		
		this.jMenuItemVerFormProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoSolicitudesAutorizaciones"));
					
		this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoSolicitudesAutorizaciones"));
		
		this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoSolicitudesAutorizaciones"));		
		
		
		
		this.jButtonAnterioresProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"AnterioresProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonAnterioresToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoSolicitudesAutorizaciones"));
		
		this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonSiguientesProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"SiguientesProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonSiguientesToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoSolicitudesAutorizaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones"));		
		
		
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoSolicitudesAutorizaciones"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoSolicitudesAutorizaciones"));

		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoSolicitudesAutorizaciones"));
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoSolicitudesAutorizaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoSolicitudesAutorizaciones"));
			
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoSolicitudesAutorizaciones"));
					
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoSolicitudesAutorizaciones"));
			
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoSolicitudesAutorizaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonidProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"BusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSolicitudesAutorizaciones"));				
			//this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSolicitudesAutorizaciones"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoSolicitudesAutorizaciones"));
				this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoSolicitudesAutorizaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoSolicitudesAutorizaciones"));
			
			this.jButtonAbrirOrderByToolBarProcesoSolicitudesAutorizaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoSolicitudesAutorizaciones"));			
			
			if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones!=null) {
				this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoSolicitudesAutorizaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoSolicitudesAutorizaciones"));
		
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
            		closingInternalFrameProcesoSolicitudesAutorizaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoSolicitudesAutorizacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoSolicitudesAutorizacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonModificarProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonActualizarProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonEliminarProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCancelarProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCerrarProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoSolicitudesAutorizaciones";
		inputMap = this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoSolicitudesAutorizacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoSolicitudesAutorizacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoSolicitudesAutorizacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonidProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoSolicitudesAutorizacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localProcesoSolicitudesAutorizacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda"));
		
		
		this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.addActionListener(new ButtonActionListener(this,"BusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoSolicitudesAutorizacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoSolicitudesAutorizacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoSolicitudesAutorizaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
					procesosolicitudesautorizacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacioness) {
					procesosolicitudesautorizacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
						procesosolicitudesautorizacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacioness) {
						procesosolicitudesautorizacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoSolicitudesAutorizaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoSolicitudesAutorizacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoSolicitudesAutorizaciones.getSelectedRows();
			
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesLocal=new ProcesoSolicitudesAutorizaciones();
			
			//this.seleccionarTodosProcesoSolicitudesAutorizaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesosolicitudesautorizacionesLocal =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesosolicitudesautorizacionesLocal =(ProcesoSolicitudesAutorizaciones) this.procesosolicitudesautorizacioness.toArray()[this.jTableDatosProcesoSolicitudesAutorizaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesosolicitudesautorizacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
						procesosolicitudesautorizacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacioness) {
						procesosolicitudesautorizacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoSolicitudesAutorizaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoSolicitudesAutorizaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoSolicitudesAutorizaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoSolicitudesAutorizacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoSolicitudesAutorizacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoSolicitudesAutorizacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
				
						if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setdebito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacioness) {
					
						if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA)) {
							existe=true;
							procesosolicitudesautorizacionesAux.setdebito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoSolicitudesAutorizacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoSolicitudesAutorizaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoSolicitudesAutorizaciones(conSplash);
				
					this.generarReporteProcesoSolicitudesAutorizacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoSolicitudesAutorizacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoSolicitudesAutorizacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoSolicitudesAutorizacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoSolicitudesAutorizaciones();
				
				this.exportarProcesoSolicitudesAutorizacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoSolicitudesAutorizacioness();
				//this.importarProcesoSolicitudesAutorizacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoSolicitudesAutorizaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoSolicitudesAutorizacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Solicitudes Autorizaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoSolicitudesAutorizaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoSolicitudesAutorizaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoSolicitudesAutorizaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoSolicitudesAutorizaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoSolicitudesAutorizaciones(conSplash);
					
						//this.actualizarParametrosGeneralProcesoSolicitudesAutorizaciones();
						
						this.generarReporteProcesoAccionProcesoSolicitudesAutorizacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Solicitudes AutorizacionesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Solicitudes Autorizaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoSolicitudesAutorizaciones();
				
						this.actualizarParametrosGeneralProcesoSolicitudesAutorizaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesosolicitudesautorizacionesReturnGeneral=procesosolicitudesautorizacionesLogic.procesarAccionProcesoSolicitudesAutorizacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness(),this.procesosolicitudesautorizacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoSolicitudesAutorizacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoSolicitudesAutorizaciones();
					
					ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoSolicitudesAutorizacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoSolicitudesAutorizaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoSolicitudesAutorizacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoSolicitudesAutorizaciones();
			
			if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
			ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones=new ProcesoSolicitudesAutorizaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.getSelectedItem();
			
			
			
			
			procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesosolicitudesautorizacionessSeleccionados.size()==1) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
					procesosolicitudesautorizaciones=procesosolicitudesautorizacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoSolicitudesAutorizaciones();
			
      		//this.finishProcessProcesoSolicitudesAutorizaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoSolicitudesAutorizacionesReturnGeneral() throws Exception {
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesosolicitudesautorizacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesosolicitudesautorizacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesosolicitudesautorizacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
		}
		
		if(this.procesosolicitudesautorizacionesReturnGeneral.getConRetornoLista() || this.procesosolicitudesautorizacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesosolicitudesautorizacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesosolicitudesautorizacionesLogic.setProcesoSolicitudesAutorizacioness(this.procesosolicitudesautorizacionesReturnGeneral.getProcesoSolicitudesAutorizacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoSolicitudesAutorizaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoSolicitudesAutorizaciones() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoSolicitudesAutorizaciones> getProcesoSolicitudesAutorizacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoSolicitudesAutorizaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness()) {
					if(procesosolicitudesautorizacionesAux.getIsSelected()) {
						procesosolicitudesautorizacionessSeleccionados.add(procesosolicitudesautorizacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:this.procesosolicitudesautorizacioness) {
					if(procesosolicitudesautorizacionesAux.getIsSelected()) {
						procesosolicitudesautorizacionessSeleccionados.add(procesosolicitudesautorizacionesAux);				
					}
				}
			}
			
			if(procesosolicitudesautorizacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesosolicitudesautorizacionessSeleccionados.addAll(this.procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesosolicitudesautorizacionessSeleccionados.addAll(this.procesosolicitudesautorizacioness);				
					}
				}
			}
		} else {
			procesosolicitudesautorizacionessSeleccionados.add(this.procesosolicitudesautorizaciones);
		}
		
		return procesosolicitudesautorizacionessSeleccionados;
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
	
	public void generarReporteProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoSolicitudesAutorizacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoSolicitudesAutorizacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoSolicitudesAutorizacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoSolicitudesAutorizacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Solicitudes Autorizaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoSolicitudesAutorizacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoSolicitudesAutorizaciones();
		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoSolicitudesAutorizaciones();
		
		
		//this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados ,procesosolicitudesautorizacionesImplementable,procesosolicitudesautorizacionesImplementableHome);
	}
	
	public void mostrarImportacionProcesoSolicitudesAutorizacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoSolicitudesAutorizaciones();
		
		this.abrirFrameImportacionProcesoSolicitudesAutorizaciones();		
		
			
		//this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados ,procesosolicitudesautorizacionesImplementable,procesosolicitudesautorizacionesImplementableHome);
	}
	
	public void importarProcesoSolicitudesAutorizacioness() throws Exception {		
	
	}
	
	public void exportarProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoSolicitudesAutorizacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoSolicitudesAutorizacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoSolicitudesAutorizacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Solicitudes Autorizaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoSolicitudesAutorizaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesosolicitudesautorizacionesAux.setsDetalleGeneralEntityReporte(procesosolicitudesautorizacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoSolicitudesAutorizaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesosolicitudesautorizaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getfecha_vencimiento_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getnombre_moneda();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getfecha_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosolicitudesautorizaciones.getdebito_mone_extra().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoSolicitudesAutorizacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoSolicitudesAutorizaciones(row);				
				iRow++;
			}				
			
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoSolicitudesAutorizacionessSeleccionados() throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();		
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosolicitudesautorizaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesosolicitudesautorizacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesosolicitudesautorizaciones");
			//elementRoot.appendChild(element);
		
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
				element = document.createElement("procesosolicitudesautorizaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Solicitudes Autorizaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoSolicitudesAutorizaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getnombre_moneda());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getfecha_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosolicitudesautorizaciones.getdebito_mone_extra());				
	}
	
	public void setFilaDatosExportarXmlProcesoSolicitudesAutorizaciones(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha_vencimiento_hasta = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAVENCIMIENTOHASTA);
		elementfecha_vencimiento_hasta.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getfecha_vencimiento_hasta().toString().trim()));
		element.appendChild(elementfecha_vencimiento_hasta);

		Element elementnombre_moneda = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.NOMBREMONEDA);
		elementnombre_moneda.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getnombre_moneda().trim()));
		element.appendChild(elementnombre_moneda);

		Element elementnombre_completo_cliente = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_pre_impreso_factura = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementfecha_emision = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_pago = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAPAGO);
		elementfecha_pago.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getfecha_pago().toString().trim()));
		element.appendChild(elementfecha_pago);

		Element elementfecha_vencimiento = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementdebito_mone_local = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementdebito_mone_extra = document.createElement(ProcesoSolicitudesAutorizacionesConstantesFunciones.DEBITOMONEEXTRA);
		elementdebito_mone_extra.appendChild(document.createTextNode(procesosolicitudesautorizaciones.getdebito_mone_extra().toString().trim()));
		element.appendChild(elementdebito_mone_extra);
	}
	
	public void generarReporteGroupGenericoProcesoSolicitudesAutorizacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados=new ArrayList<ProcesoSolicitudesAutorizaciones>();
		
		procesosolicitudesautorizacionessSeleccionados=this.getProcesoSolicitudesAutorizacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoSolicitudesAutorizaciones(procesosolicitudesautorizacionessSeleccionados);
		
		this.generarReporteProcesoSolicitudesAutorizacioness("Todos",procesosolicitudesautorizacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoSolicitudesAutorizaciones(ArrayList<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizacionesAux:procesosolicitudesautorizacionessSeleccionados) {
				procesosolicitudesautorizacionesAux.setsDetalleGeneralEntityReporte(procesosolicitudesautorizacionesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesosolicitudesautorizacionesAux.getfecha_vencimiento_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getnombre_moneda());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(procesosolicitudesautorizacionesAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesosolicitudesautorizacionesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesosolicitudesautorizacionesAux.getfecha_pago()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					procesosolicitudesautorizacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesosolicitudesautorizacionesAux.getfecha_vencimiento()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoSolicitudesAutorizaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=true;
		} else {
			this.actualizarEstadoPanelsProcesoSolicitudesAutorizaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoSolicitudesAutorizaciones=false;
			//this.isVisibilidadCeldaVerFormProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaDuplicarProcesoSolicitudesAutorizaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			if(!procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;												
			}
			
			this.jButtonCerrarProcesoSolicitudesAutorizaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.procesosolicitudesautorizaciones)) {
			this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
			this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoSolicitudesAutorizaciones=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoSolicitudesAutorizaciones=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoSolicitudesAutorizaciones=false;
		//this.isVisibilidadCeldaModificarProcesoSolicitudesAutorizaciones=true;
		this.isVisibilidadCeldaActualizarProcesoSolicitudesAutorizaciones=false;
		this.isVisibilidadCeldaEliminarProcesoSolicitudesAutorizaciones=false;
		//this.isVisibilidadCeldaCancelarProcesoSolicitudesAutorizaciones=true;			
		this.isVisibilidadCeldaGuardarProcesoSolicitudesAutorizaciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoSolicitudesAutorizaciones() {
	}
	
	public void actualizarEstadoPanelsProcesoSolicitudesAutorizaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones!=null) {
				this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
					this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones!=null) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones!=null) {
				this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones) {this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.remove(jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones) {this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.remove(jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones=isParaCliente;
			if(!this.isVisibilidadBusquedaProcesoSolicitudesAutorizaciones) {this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.remove(jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);}
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
			
			this.inicializarActualizarBindingTablaProcesoSolicitudesAutorizaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoSolicitudesAutorizaciones() {
		this.updateBorderResaltarBusquedasFormularioProcesoSolicitudesAutorizaciones();
		this.updateVisibilidadBusquedasFormularioProcesoSolicitudesAutorizaciones();
		this.updateHabilitarBusquedasFormularioProcesoSolicitudesAutorizaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoSolicitudesAutorizaciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponents().length>0) {
	

		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones!=null) {
			index= this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.indexOfComponent(this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponent(index);
				jPanel.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoSolicitudesAutorizaciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.indexOfComponent(this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			if(!this.procesosolicitudesautorizacionesConstantesFunciones.mostrarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones && index>-1) {
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoSolicitudesAutorizaciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.indexOfComponent(this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
				this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setEnabledAt(index,this.procesosolicitudesautorizacionesConstantesFunciones.activarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoSolicitudesAutorizaciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoSolicitudesAutorizaciones")) {
			index= this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.indexOfComponent(this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);

			this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.getComponent(index);

			this.procesosolicitudesautorizacionesConstantesFunciones.setResaltarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones(resaltar);

			jPanel.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoSolicitudesAutorizaciones() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoSolicitudesAutorizaciones();
		this.updateVisibilidadResaltarControlesFormularioProcesoSolicitudesAutorizaciones();
		this.updateHabilitarResaltarControlesFormularioProcesoSolicitudesAutorizaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoSolicitudesAutorizaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltaridProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltaridProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_empresaProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_empresaProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_sucursalProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_sucursalProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_clienteProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarid_clienteProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_monedaProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_monedaProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_completo_clienteProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnombre_completo_clienteProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_emisionProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_emisionProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_pagoProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_pagoProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimientoProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltarfecha_vencimientoProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_localProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_localProcesoSolicitudesAutorizaciones);}
		if(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_extraProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setBorder(this.procesosolicitudesautorizacionesConstantesFunciones.resaltardebito_mone_extraProcesoSolicitudesAutorizaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoSolicitudesAutorizaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
	
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostraridProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelidProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostraridProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_empresaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelid_empresaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_empresaProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_sucursalProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelid_sucursalProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_sucursalProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_clienteProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelid_clienteProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarid_clienteProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_monedaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_monedaProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_completo_clienteProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnombre_completo_clienteProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_emisionProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_emisionProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_pagoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_pagoProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_vencimientoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrarfecha_vencimientoProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_localProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_localProcesoSolicitudesAutorizaciones);
		//this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_extraProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.setVisible(this.procesosolicitudesautorizacionesConstantesFunciones.mostrardebito_mone_extraProcesoSolicitudesAutorizaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoSolicitudesAutorizaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones!=null) {
	
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jLabelidProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activaridProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarid_empresaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarid_sucursalProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarid_clienteProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_monedaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarnombre_completo_clienteProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_emisionProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_pagoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activarfecha_vencimientoProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_localProcesoSolicitudesAutorizaciones);
		this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones.jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setEnabled(this.procesosolicitudesautorizacionesConstantesFunciones.activardebito_mone_extraProcesoSolicitudesAutorizaciones);
		}
	}
	
		
}