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

//import com.bydan.erp.tesoreria.util.PagosAutorizadosProcesoConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosProcesoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PagosAutorizadosProcesoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.PagosAutorizadosProcesoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PagosAutorizadosProcesoBeanSwingJInternalFrame extends PagosAutorizadosProcesoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PagosAutorizadosProcesoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PagosAutorizadosProceso> pagosautorizadosprocesoValidator = new ClassValidator<PagosAutorizadosProceso>(PagosAutorizadosProceso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PagosAutorizadosProceso pagosautorizadosproceso;	
	public PagosAutorizadosProceso pagosautorizadosprocesoAux;
	public PagosAutorizadosProceso pagosautorizadosprocesoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PagosAutorizadosProceso pagosautorizadosprocesoTotales;
	public Long idPagosAutorizadosProcesoActual;
	public Long iIdNuevoPagosAutorizadosProceso=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
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
	
	public Boolean isPermisoTodoPagosAutorizadosProceso;
	public Boolean isPermisoNuevoPagosAutorizadosProceso;
	public Boolean isPermisoActualizarPagosAutorizadosProceso;
	public Boolean isPermisoActualizarOriginalPagosAutorizadosProceso;
	public Boolean isPermisoEliminarPagosAutorizadosProceso;
	public Boolean isPermisoGuardarCambiosPagosAutorizadosProceso;
	public Boolean isPermisoConsultaPagosAutorizadosProceso;
	public Boolean isPermisoBusquedaPagosAutorizadosProceso;
	public Boolean isPermisoReportePagosAutorizadosProceso;
	public Boolean isPermisoPaginacionMedioPagosAutorizadosProceso;
	public Boolean isPermisoPaginacionAltoPagosAutorizadosProceso;
	public Boolean isPermisoPaginacionTodoPagosAutorizadosProceso;
	public Boolean isPermisoCopiarPagosAutorizadosProceso;
	public Boolean isPermisoVerFormPagosAutorizadosProceso;
	public Boolean isPermisoDuplicarPagosAutorizadosProceso;
	public Boolean isPermisoOrdenPagosAutorizadosProceso;
	
	
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
	
	public PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoReturnGeneral;
	public PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPagosAutorizadosProceso=false;
	public Boolean esParaAccionDesdeFormularioPagosAutorizadosProceso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PagosAutorizadosProcesoSessionBeanAdditional pagosautorizadosprocesoSessionBeanAdditional=null;
	
	public PagosAutorizadosProcesoSessionBeanAdditional getPagosAutorizadosProcesoSessionBeanAdditional() {
		return this.pagosautorizadosprocesoSessionBeanAdditional;
	}
	
	public void setPagosAutorizadosProcesoSessionBeanAdditional(PagosAutorizadosProcesoSessionBeanAdditional pagosautorizadosprocesoSessionBeanAdditional) {
		try {
			this.pagosautorizadosprocesoSessionBeanAdditional=pagosautorizadosprocesoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional pagosautorizadosprocesoBeanSwingJInternalFrameAdditional=null;
	//public class PagosAutorizadosProcesoBeanSwingJInternalFrame
	
	public PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional getPagosAutorizadosProcesoBeanSwingJInternalFrameAdditional() {
		return this.pagosautorizadosprocesoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPagosAutorizadosProcesoBeanSwingJInternalFrameAdditional(PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional pagosautorizadosprocesoBeanSwingJInternalFrameAdditional) {
		try {
			this.pagosautorizadosprocesoBeanSwingJInternalFrameAdditional=pagosautorizadosprocesoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PagosAutorizadosProcesoLogic pagosautorizadosprocesoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PagosAutorizadosProceso pagosautorizadosprocesoBean;
	public PagosAutorizadosProcesoConstantesFunciones pagosautorizadosprocesoConstantesFunciones;
	//public PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<PagosAutorizadosProceso> pagosautorizadosprocesos;	
	//public List<PagosAutorizadosProceso> pagosautorizadosprocesosEliminados;
	//public List<PagosAutorizadosProceso> pagosautorizadosprocesosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaDuplicarPagosAutorizadosProceso=true;
	public Boolean isVisibilidadCeldaCopiarPagosAutorizadosProceso=true;
	public Boolean isVisibilidadCeldaVerFormPagosAutorizadosProceso=true;
	public Boolean isVisibilidadCeldaOrdenPagosAutorizadosProceso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaCancelarPagosAutorizadosProceso=false;
	public Boolean isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;	
	
	
	public Boolean isVisibilidadBusquedaPagosAutorizadosProceso=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPagosAutorizadosProceso() {
		return this.iIdNuevoPagosAutorizadosProceso;
	}

	public void setiIdNuevoPagosAutorizadosProceso(Long iIdNuevoPagosAutorizadosProceso) {
		this.iIdNuevoPagosAutorizadosProceso = iIdNuevoPagosAutorizadosProceso;
	}
	
	public Long getidPagosAutorizadosProcesoActual() {
		return this.idPagosAutorizadosProcesoActual;
	}

	public void setidPagosAutorizadosProcesoActual(Long idPagosAutorizadosProcesoActual) {
		this.idPagosAutorizadosProcesoActual = idPagosAutorizadosProcesoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PagosAutorizadosProceso getpagosautorizadosproceso() {
		return this.pagosautorizadosproceso;
	}

	public void setpagosautorizadosproceso(PagosAutorizadosProceso pagosautorizadosproceso) {
		this.pagosautorizadosproceso = pagosautorizadosproceso;
	}
	
	public PagosAutorizadosProceso getpagosautorizadosprocesoAux() {
		return this.pagosautorizadosprocesoAux;
	}

	public void setpagosautorizadosprocesoAux(PagosAutorizadosProceso pagosautorizadosprocesoAux) {
		this.pagosautorizadosprocesoAux = pagosautorizadosprocesoAux;
	}				
	
	public PagosAutorizadosProceso getpagosautorizadosprocesoAnterior() {
		return this.pagosautorizadosprocesoAnterior;
	}

	public void setpagosautorizadosprocesoAnterior(PagosAutorizadosProceso pagosautorizadosprocesoAnterior) {
		this.pagosautorizadosprocesoAnterior = pagosautorizadosprocesoAnterior;
	}	
	
	public PagosAutorizadosProceso getpagosautorizadosprocesoTotales() {
		return this.pagosautorizadosprocesoTotales;
	}

	public void setpagosautorizadosprocesoTotales(PagosAutorizadosProceso pagosautorizadosprocesoTotales) {
		this.pagosautorizadosprocesoTotales = pagosautorizadosprocesoTotales;
	}	
	
	public PagosAutorizadosProceso getpagosautorizadosprocesoBean() {
		return this.pagosautorizadosprocesoBean;
	}

	public void setpagosautorizadosprocesoBean(PagosAutorizadosProceso pagosautorizadosprocesoBean) {
		this.pagosautorizadosprocesoBean = pagosautorizadosprocesoBean;
	}	
	
	public PagosAutorizadosProcesoParameterReturnGeneral getpagosautorizadosprocesoReturnGeneral() {
		return this.pagosautorizadosprocesoReturnGeneral;
	}

	public void setpagosautorizadosprocesoReturnGeneral(PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoReturnGeneral) {
		this.pagosautorizadosprocesoReturnGeneral = pagosautorizadosprocesoReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPagosAutorizadosProceso=-1L;

	public Long getid_ejercicioBusquedaPagosAutorizadosProceso() {
		return this.id_ejercicioBusquedaPagosAutorizadosProceso;
	}

	public void setid_ejercicioBusquedaPagosAutorizadosProceso(Long id_ejercicioBusquedaPagosAutorizadosProceso) {
		this.id_ejercicioBusquedaPagosAutorizadosProceso = id_ejercicioBusquedaPagosAutorizadosProceso;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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
	
	
	public PagosAutorizadosProcesoLogic getPagosAutorizadosProcesoLogic()	{		
		return pagosautorizadosprocesoLogic;
	}

	public void setPagosAutorizadosProcesoLogic(PagosAutorizadosProcesoLogic pagosautorizadosprocesoLogic) {
		this.pagosautorizadosprocesoLogic = pagosautorizadosprocesoLogic;
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
	
	public Boolean getIsEsNuevoPagosAutorizadosProceso() {
		return isEsNuevoPagosAutorizadosProceso;
	}

	public void setIsEsNuevoPagosAutorizadosProceso(Boolean isEsNuevoPagosAutorizadosProceso) {
		this.isEsNuevoPagosAutorizadosProceso = isEsNuevoPagosAutorizadosProceso;
	}

	public Boolean getEsParaAccionDesdeFormularioPagosAutorizadosProceso() {
		return esParaAccionDesdeFormularioPagosAutorizadosProceso;
	}
	
	public void setEsParaAccionDesdeFormularioPagosAutorizadosProceso(Boolean esParaAccionDesdeFormularioPagosAutorizadosProceso) {
		this.esParaAccionDesdeFormularioPagosAutorizadosProceso = esParaAccionDesdeFormularioPagosAutorizadosProceso;
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

			if(this.pagosautorizadosprocesoSessionBean==null) {
				this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
			}

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pagosautorizadosprocesoSessionBean.getlidEmpresaActual());
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

			if(this.pagosautorizadosprocesoSessionBean==null) {
				this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
			}

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(pagosautorizadosprocesoSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.pagosautorizadosprocesoSessionBean==null) {
				this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
			}

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(pagosautorizadosprocesoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

					if(this.pagosautorizadosproceso!=null) {
						this.pagosautorizadosproceso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPagosAutorizadosProceso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPagosAutorizadosProcesoGenerico)throws Exception
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
				jComboBoxid_empresaPagosAutorizadosProcesoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPagosAutorizadosProcesoGenerico!=null && jComboBoxid_empresaPagosAutorizadosProcesoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPagosAutorizadosProcesoGenerico.setSelectedIndex(0);
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

					if(this.pagosautorizadosproceso!=null) {
						this.pagosautorizadosproceso.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPagosAutorizadosProcesoGenerico)throws Exception
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
				jComboBoxid_sucursalPagosAutorizadosProcesoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPagosAutorizadosProcesoGenerico!=null && jComboBoxid_sucursalPagosAutorizadosProcesoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPagosAutorizadosProcesoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.pagosautorizadosproceso!=null) {
						this.pagosautorizadosproceso.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPagosAutorizadosProceso") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso!=null) {
						jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso!=null) {
							//jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico!=null && jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PagosAutorizadosProceso pagosautorizadosproceso,JComboBox jComboBoxid_empresaPagosAutorizadosProcesoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPagosAutorizadosProcesoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPagosAutorizadosProcesoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pagosautorizadosproceso.setid_empresa(empresaAux.getId());
				pagosautorizadosproceso.setempresa_descripcion(PagosAutorizadosProcesoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pagosautorizadosproceso.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PagosAutorizadosProceso pagosautorizadosproceso,JComboBox jComboBoxid_sucursalPagosAutorizadosProcesoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPagosAutorizadosProcesoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPagosAutorizadosProcesoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				pagosautorizadosproceso.setid_sucursal(sucursalAux.getId());
				pagosautorizadosproceso.setsucursal_descripcion(PagosAutorizadosProcesoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				pagosautorizadosproceso.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PagosAutorizadosProceso pagosautorizadosproceso,JComboBox jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPagosAutorizadosProcesoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				pagosautorizadosproceso.setid_ejercicio(ejercicioAux.getId());
				pagosautorizadosproceso.setejercicio_descripcion(PagosAutorizadosProcesoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				pagosautorizadosproceso.setEjercicio(ejercicioAux);			}
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

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
					}

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
					}

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { 
					}

					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPagosAutorizadosProceso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.addItem(ejercicio);
							}
						}

						if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPagosAutorizadosProceso() throws Exception {
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
		
	public PagosAutorizadosProcesoParameterReturnGeneral getPagosAutorizadosProcesoParameterGeneral() {
		return this.pagosautorizadosprocesoParameterGeneral;
	}
	
	public void setPagosAutorizadosProcesoParameterGeneral(PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoParameterGeneral) {
		this.pagosautorizadosprocesoParameterGeneral = pagosautorizadosprocesoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPagosAutorizadosProceso() {
		return isPermisoTodoPagosAutorizadosProceso;
	}

	public void setIsPermisoTodoPagosAutorizadosProceso(Boolean isPermisoTodoPagosAutorizadosProceso) {
		this.isPermisoTodoPagosAutorizadosProceso = isPermisoTodoPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoNuevoPagosAutorizadosProceso() {
		return isPermisoNuevoPagosAutorizadosProceso;
	}

	public void setIsPermisoNuevoPagosAutorizadosProceso(Boolean isPermisoNuevoPagosAutorizadosProceso) {
		this.isPermisoNuevoPagosAutorizadosProceso = isPermisoNuevoPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoActualizarPagosAutorizadosProceso() {
		return isPermisoActualizarPagosAutorizadosProceso;
	}

	public void setIsPermisoActualizarPagosAutorizadosProceso(Boolean isPermisoActualizarPagosAutorizadosProceso) {
		this.isPermisoActualizarPagosAutorizadosProceso = isPermisoActualizarPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoEliminarPagosAutorizadosProceso() {
		return isPermisoEliminarPagosAutorizadosProceso;
	}

	public void setIsPermisoEliminarPagosAutorizadosProceso(Boolean isPermisoEliminarPagosAutorizadosProceso) {
		this.isPermisoEliminarPagosAutorizadosProceso = isPermisoEliminarPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoGuardarCambiosPagosAutorizadosProceso() {
		return isPermisoGuardarCambiosPagosAutorizadosProceso;
	}

	public void setIsPermisoGuardarCambiosPagosAutorizadosProceso(Boolean isPermisoGuardarCambiosPagosAutorizadosProceso) {
		this.isPermisoGuardarCambiosPagosAutorizadosProceso = isPermisoGuardarCambiosPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoConsultaPagosAutorizadosProceso() {
		return isPermisoConsultaPagosAutorizadosProceso;
	}

	public void setIsPermisoConsultaPagosAutorizadosProceso(Boolean isPermisoConsultaPagosAutorizadosProceso) {
		this.isPermisoConsultaPagosAutorizadosProceso = isPermisoConsultaPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoBusquedaPagosAutorizadosProceso() {
		return isPermisoBusquedaPagosAutorizadosProceso;
	}

	public void setIsPermisoBusquedaPagosAutorizadosProceso(Boolean isPermisoBusquedaPagosAutorizadosProceso) {
		this.isPermisoBusquedaPagosAutorizadosProceso = isPermisoBusquedaPagosAutorizadosProceso;
	}

	public Boolean getIsPermisoReportePagosAutorizadosProceso() {
		return isPermisoReportePagosAutorizadosProceso;
	}

	public void setIsPermisoReportePagosAutorizadosProceso(Boolean isPermisoReportePagosAutorizadosProceso) {
		this.isPermisoReportePagosAutorizadosProceso = isPermisoReportePagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoPaginacionMedioPagosAutorizadosProceso() {
		return isPermisoPaginacionMedioPagosAutorizadosProceso;
	}

	public void setIsPermisoPaginacionMedioPagosAutorizadosProceso(Boolean isPermisoPaginacionMedioPagosAutorizadosProceso) {
		this.isPermisoPaginacionMedioPagosAutorizadosProceso = isPermisoPaginacionMedioPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoPaginacionTodoPagosAutorizadosProceso() {
		return isPermisoPaginacionTodoPagosAutorizadosProceso;
	}

	public void setIsPermisoPaginacionTodoPagosAutorizadosProceso(Boolean isPermisoPaginacionTodoPagosAutorizadosProceso) {
		this.isPermisoPaginacionTodoPagosAutorizadosProceso = isPermisoPaginacionTodoPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoPaginacionAltoPagosAutorizadosProceso() {
		return isPermisoPaginacionAltoPagosAutorizadosProceso;
	}

	public void setIsPermisoPaginacionAltoPagosAutorizadosProceso(Boolean isPermisoPaginacionAltoPagosAutorizadosProceso) {
		this.isPermisoPaginacionAltoPagosAutorizadosProceso = isPermisoPaginacionAltoPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoCopiarPagosAutorizadosProceso() {
		return isPermisoCopiarPagosAutorizadosProceso;
	}

	public void setIsPermisoCopiarPagosAutorizadosProceso(Boolean isPermisoCopiarPagosAutorizadosProceso) {
		this.isPermisoCopiarPagosAutorizadosProceso = isPermisoCopiarPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoVerFormPagosAutorizadosProceso() {
		return isPermisoVerFormPagosAutorizadosProceso;
	}

	public void setIsPermisoVerFormPagosAutorizadosProceso(Boolean isPermisoVerFormPagosAutorizadosProceso) {
		this.isPermisoVerFormPagosAutorizadosProceso = isPermisoVerFormPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoDuplicarPagosAutorizadosProceso() {
		return isPermisoDuplicarPagosAutorizadosProceso;
	}

	public void setIsPermisoDuplicarPagosAutorizadosProceso(Boolean isPermisoDuplicarPagosAutorizadosProceso) {
		this.isPermisoDuplicarPagosAutorizadosProceso = isPermisoDuplicarPagosAutorizadosProceso;
	}
	
	public Boolean getIsPermisoOrdenPagosAutorizadosProceso() {
		return isPermisoOrdenPagosAutorizadosProceso;
	}

	public void setIsPermisoOrdenPagosAutorizadosProceso(Boolean isPermisoOrdenPagosAutorizadosProceso) {
		this.isPermisoOrdenPagosAutorizadosProceso = isPermisoOrdenPagosAutorizadosProceso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPagosAutorizadosProceso() {
		return isVisibilidadCeldaNuevoPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaNuevoPagosAutorizadosProceso(Boolean isVisibilidadCeldaNuevoPagosAutorizadosProceso) {
		this.isVisibilidadCeldaNuevoPagosAutorizadosProceso = isVisibilidadCeldaNuevoPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPagosAutorizadosProceso() {
		return isVisibilidadCeldaDuplicarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaDuplicarPagosAutorizadosProceso(Boolean isVisibilidadCeldaDuplicarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso = isVisibilidadCeldaDuplicarPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPagosAutorizadosProceso() {
		return isVisibilidadCeldaCopiarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaCopiarPagosAutorizadosProceso(Boolean isVisibilidadCeldaCopiarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaCopiarPagosAutorizadosProceso = isVisibilidadCeldaCopiarPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPagosAutorizadosProceso() {
		return isVisibilidadCeldaVerFormPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaVerFormPagosAutorizadosProceso(Boolean isVisibilidadCeldaVerFormPagosAutorizadosProceso) {
		this.isVisibilidadCeldaVerFormPagosAutorizadosProceso = isVisibilidadCeldaVerFormPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPagosAutorizadosProceso() {
		return isVisibilidadCeldaOrdenPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaOrdenPagosAutorizadosProceso(Boolean isVisibilidadCeldaOrdenPagosAutorizadosProceso) {
		this.isVisibilidadCeldaOrdenPagosAutorizadosProceso = isVisibilidadCeldaOrdenPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso() {
		return isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso(Boolean isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso) {
		this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso = isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPagosAutorizadosProceso() {
		return isVisibilidadCeldaModificarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaModificarPagosAutorizadosProceso(Boolean isVisibilidadCeldaModificarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaModificarPagosAutorizadosProceso = isVisibilidadCeldaModificarPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPagosAutorizadosProceso() {
		return isVisibilidadCeldaActualizarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaActualizarPagosAutorizadosProceso(Boolean isVisibilidadCeldaActualizarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaActualizarPagosAutorizadosProceso = isVisibilidadCeldaActualizarPagosAutorizadosProceso;
	}

	public Boolean getIsVisibilidadCeldaEliminarPagosAutorizadosProceso() {
		return isVisibilidadCeldaEliminarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaEliminarPagosAutorizadosProceso(Boolean isVisibilidadCeldaEliminarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaEliminarPagosAutorizadosProceso = isVisibilidadCeldaEliminarPagosAutorizadosProceso;
	}

	public Boolean getIsVisibilidadCeldaCancelarPagosAutorizadosProceso() {
		return isVisibilidadCeldaCancelarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaCancelarPagosAutorizadosProceso(Boolean isVisibilidadCeldaCancelarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaCancelarPagosAutorizadosProceso = isVisibilidadCeldaCancelarPagosAutorizadosProceso;
	}

	public Boolean getIsVisibilidadCeldaGuardarPagosAutorizadosProceso() {
		return isVisibilidadCeldaGuardarPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaGuardarPagosAutorizadosProceso(Boolean isVisibilidadCeldaGuardarPagosAutorizadosProceso) {
		this.isVisibilidadCeldaGuardarPagosAutorizadosProceso = isVisibilidadCeldaGuardarPagosAutorizadosProceso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso() {
		return isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso(Boolean isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso) {
		this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso = isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso;
	}
		
	public PagosAutorizadosProcesoSessionBean getpagosautorizadosprocesoSessionBean() {
		return this.pagosautorizadosprocesoSessionBean;
	}
	
	public void setpagosautorizadosprocesoSessionBean(PagosAutorizadosProcesoSessionBean pagosautorizadosprocesoSessionBean) {
		this.pagosautorizadosprocesoSessionBean=pagosautorizadosprocesoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPagosAutorizadosProceso() {
		return this.isVisibilidadBusquedaPagosAutorizadosProceso;
	}

	public void setisVisibilidadBusquedaPagosAutorizadosProceso(Boolean isVisibilidadBusquedaPagosAutorizadosProceso) {
		this.isVisibilidadBusquedaPagosAutorizadosProceso=isVisibilidadBusquedaPagosAutorizadosProceso;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pagosautorizadosproceso,null);
				this.setActualParaGuardarSucursalForeignKey(pagosautorizadosproceso,null);
				this.setActualParaGuardarEjercicioForeignKey(pagosautorizadosproceso,null);
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
	
	public void bugActualizarReferenciaActual(PagosAutorizadosProceso pagosautorizadosproceso,PagosAutorizadosProceso pagosautorizadosprocesoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPagosAutorizadosProceso(pagosautorizadosproceso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pagosautorizadosprocesoAux.setId(pagosautorizadosproceso.getId());
		pagosautorizadosprocesoAux.setVersionRow(pagosautorizadosproceso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PagosAutorizadosProceso pagosautorizadosprocesoLocal) throws Exception {
		
		if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PagosAutorizadosProceso pagosautorizadosprocesoLocal) throws Exception {	
		if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pagosautorizadosprocesoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				pagosautorizadosprocesoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				pagosautorizadosprocesoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPagosAutorizadosProcesoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pagosautorizadosprocesoValidator.getInvalidValues(this.pagosautorizadosproceso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PagosAutorizadosProceso pagosautorizadosproceso,List<PagosAutorizadosProceso> pagosautorizadosprocesos) throws Exception {
	}		
	
	public void actualizarSelectedLista(PagosAutorizadosProceso pagosautorizadosproceso,List<PagosAutorizadosProceso> pagosautorizadosprocesos) throws Exception {
		try	{			
			PagosAutorizadosProcesoConstantesFunciones.actualizarSelectedLista(pagosautorizadosproceso,pagosautorizadosprocesos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PagosAutorizadosProceso> pagosautorizadosprocesosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pagosautorizadosprocesosLocal=this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pagosautorizadosprocesosLocal=this.pagosautorizadosprocesos;
			}
			//ARCHITECTURE
		
			for(PagosAutorizadosProceso pagosautorizadosprocesoLocal:pagosautorizadosprocesosLocal) {
				if(this.permiteMantenimiento(pagosautorizadosprocesoLocal) && pagosautorizadosprocesoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.getPagosAutorizadosProcesoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.NOMBRETIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnombre_tipo_documentoPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigoPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiarioPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfechaPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfecha_emisionPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.CODIGOTIPOMOVIMIENTOMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_mayorPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelvalorPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.CODIGOCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_chequePagosAutorizadosProceso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosProcesoConstantesFunciones.BENEFICIARIODETALLECHEQUEGIRADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnombre_tipo_documentoPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigoPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiarioPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfechaPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfecha_emisionPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_mayorPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelvalorPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_chequePagosAutorizadosProceso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,"");
		
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
		this.iIdNuevoPagosAutorizadosProceso--;	
		
		
		this.pagosautorizadosprocesoAux=new PagosAutorizadosProceso();
		
		this.pagosautorizadosprocesoAux.setId(this.iIdNuevoPagosAutorizadosProceso);
		this.pagosautorizadosprocesoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().add(this.pagosautorizadosprocesoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pagosautorizadosprocesos.add(this.pagosautorizadosprocesoAux);
		}
		//ARCHITECTURE
		
		this.pagosautorizadosproceso=this.pagosautorizadosprocesoAux;
		
		if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosproceso);
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizadosProceso(this.pagosautorizadosproceso);
		}
				
		//this.setDefaultControlesPagosAutorizadosProceso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPagosAutorizadosProceso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPagosAutorizadosProceso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizadosProceso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosprocesoBean,this.pagosautorizadosproceso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral,this.pagosautorizadosprocesoBean,false);
		
		if(this.pagosautorizadosprocesoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso());
		}
		
		if(this.pagosautorizadosprocesoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso(),classes);//this.pagosautorizadosprocesoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPagosAutorizadosProceso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPagosAutorizadosProceso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.RecargarFormPagosAutorizadosProceso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
						
			if(pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizadosProceso();
			}
			
			this.actualizarVisualTableDatosPagosAutorizadosProceso();
			
			this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizadosProceso(), this.getIndiceNuevoPagosAutorizadosProceso());
			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
						
			this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPagosAutorizadosProceso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarnombre_tipo_documentoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarcodigoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiarioPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarfechaPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarfecha_emisionPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarnumero_mayorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarvalorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_cuenta_bancoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarnumero_chequePagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);	
		//
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarid_empresaPagosAutorizadosProceso);//
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarid_sucursalPagosAutorizadosProceso);//
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setEnabled(isHabilitar && this.pagosautorizadosprocesoConstantesFunciones.activarid_ejercicioPagosAutorizadosProceso);
	};
	
	public void setDefaultControlesPagosAutorizadosProceso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPagosAutorizadosProceso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(true);			
			this.pagosautorizadosprocesoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.setVisible(true);
			
					
		} else {
			//this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(false);			
			this.pagosautorizadosprocesoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPagosAutorizadosProceso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				if(pagosautorizadosprocesoAux.getId().equals(this.iIdNuevoPagosAutorizadosProceso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesos) {
				if(pagosautorizadosprocesoAux.getId().equals(this.iIdNuevoPagosAutorizadosProceso)) {
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
	
	public int getIndiceActualPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				if(pagosautorizadosprocesoAux.getId().equals(pagosautorizadosproceso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesos) {
				if(pagosautorizadosprocesoAux.getId().equals(pagosautorizadosproceso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosprocesoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				if(pagosautorizadosprocesoAux.getPagosAutorizadosProcesoOriginal().getId().equals(pagosautorizadosprocesoOriginal.getId())) {
					existe=true;
					pagosautorizadosprocesoOriginal.setId(pagosautorizadosprocesoAux.getId());
					pagosautorizadosprocesoOriginal.setVersionRow(pagosautorizadosprocesoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesos) {
				if(pagosautorizadosprocesoAux.getPagosAutorizadosProcesoOriginal().getId().equals(pagosautorizadosprocesoOriginal.getId())) {
					existe=true;
					pagosautorizadosprocesoOriginal.setId(pagosautorizadosprocesoAux.getId());
					pagosautorizadosprocesoOriginal.setVersionRow(pagosautorizadosprocesoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPagosAutorizadosProceso(Boolean esParaCancelar) throws Exception {
		pagosautorizadosprocesosAux=new ArrayList<PagosAutorizadosProceso>();
		pagosautorizadosprocesoAux=new PagosAutorizadosProceso();
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
					if(pagosautorizadosprocesoAux.getId()<0) {
						pagosautorizadosprocesosAux.add(pagosautorizadosprocesoAux);
					}		
				}
				this.iIdNuevoPagosAutorizadosProceso=0L;
				this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().removeAll(pagosautorizadosprocesosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesos) {
					if(pagosautorizadosprocesoAux.getId()<0) {
						pagosautorizadosprocesosAux.add(pagosautorizadosprocesoAux);
					}		
				}
				this.iIdNuevoPagosAutorizadosProceso=0L;
				this.pagosautorizadosprocesos.removeAll(pagosautorizadosprocesosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPagosAutorizadosProceso 
					&& this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size()>0
					) {
					pagosautorizadosprocesoAux=this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().get(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size() - 1);
				
					if(pagosautorizadosprocesoAux.getId()<0) {
						this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().remove(pagosautorizadosprocesoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPagosAutorizadosProceso && this.pagosautorizadosprocesos.size()>0) {
					pagosautorizadosprocesoAux=this.pagosautorizadosprocesos.get(this.pagosautorizadosprocesos.size() - 1);
				
					if(pagosautorizadosprocesoAux.getId()<0) {
						this.pagosautorizadosprocesos.remove(pagosautorizadosprocesoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPagosAutorizadosProceso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pagosautorizadosproceso.getId()<0) {
				this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().remove(this.pagosautorizadosproceso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pagosautorizadosproceso.getId()<0) {
				this.pagosautorizadosprocesos.remove(this.pagosautorizadosproceso);
			}
		}			
	}
	
	public void setEstadosInicialesPagosAutorizadosProceso(List<PagosAutorizadosProceso> pagosautorizadosprocesosAux) throws Exception {
		PagosAutorizadosProcesoConstantesFunciones.setEstadosInicialesPagosAutorizadosProceso(pagosautorizadosprocesosAux);
	}
	
	public void setEstadosInicialesPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosprocesoAux) throws Exception {
		PagosAutorizadosProcesoConstantesFunciones.setEstadosInicialesPagosAutorizadosProceso(pagosautorizadosprocesoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPagosAutorizadosProcesoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPagosAutorizadosProcesoActual()) {
				if(!this.isEsNuevoPagosAutorizadosProceso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPagosAutorizadosProceso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPagosAutorizadosProcesoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pagos Autorizados Proceso ?", "MANTENIMIENTO DE Pagos Autorizados Proceso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PagosAutorizadosProceso pagosautorizadosproceso) throws Exception {
		PagosAutorizadosProcesoConstantesFunciones.seleccionarAsignar(this.pagosautorizadosproceso,pagosautorizadosproceso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPagosAutorizadosProceso=this.isPermisoActualizarOriginalPagosAutorizadosProceso;
			
			
			this.seleccionarAsignar(pagosautorizadosproceso);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pagosautorizadosprocesoSessionBean.setsFuncionBusquedaRapida(this.pagosautorizadosprocesoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPagosAutorizadosProceso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPagosAutorizadosProceso(esParaCancelar);				
				this.cancelarNuevoPagosAutorizadosProceso(esParaCancelar);								
			}
			
			this.pagosautorizadosproceso=new PagosAutorizadosProceso();
			
			this.inicializarPagosAutorizadosProceso();
			
			this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPagosAutorizadosProceso() throws Exception {
		try {
			PagosAutorizadosProcesoConstantesFunciones.inicializarPagosAutorizadosProceso(this.pagosautorizadosproceso);
			
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
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePagosAutorizadosProcesos(String sAccionBusqueda,List<PagosAutorizadosProceso> pagosautorizadosprocesosParaReportes) throws Exception {
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
					sPathReporteFinal="PagosAutorizadosProceso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PagosAutorizadosProcesoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PagosAutorizadosProcesoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PagosAutorizadosProceso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pagos Autorizados Procesos");		
		parameters.put("busquedapor", PagosAutorizadosProcesoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePagosAutorizadosProceso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PagosAutorizadosProcesoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PagosAutorizadosProcesoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePagosAutorizadosProceso=new JRBeanArrayDataSource(PagosAutorizadosProcesoJInternalFrame.TraerPagosAutorizadosProcesoBeans(pagosautorizadosprocesosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePagosAutorizadosProceso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PagosAutorizadosProcesoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PagosAutorizadosProcesoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PagosAutorizadosProcesoBean.TraerPagosAutorizadosProcesoBeans(pagosautorizadosprocesosParaReportes).toArray()));
							
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
				this.generarExcelReportePagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProcesoActionPerformed(null);
					//this.generarExcelReportePagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPagosAutorizadosProcesos(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadosprocesosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePagosAutorizadosProcesos(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizadosProceso> pagosautorizadosprocesosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadosProcesos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutorizadosProceso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PagosAutorizadosProceso pagosautorizadosproceso : pagosautorizadosprocesosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PagosAutorizadosProcesoConstantesFunciones.generarExcelReporteDataPagosAutorizadosProceso("NORMAL",row,workbook,pagosautorizadosproceso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPagosAutorizadosProceso(String sTipo,Row row,Workbook workbook) {
		
		PagosAutorizadosProcesoConstantesFunciones.generarExcelReporteHeaderPagosAutorizadosProceso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPagosAutorizadosProcesos(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizadosProceso> pagosautorizadosprocesosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadosProcesos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PagosAutorizadosProceso pagosautorizadosproceso : pagosautorizadosprocesosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.getPagosAutorizadosProcesoDescripcion(pagosautorizadosproceso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getnombre_tipo_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getcodigo_cuenta_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPagosAutorizadosProcesos(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizadosProceso> pagosautorizadosprocesosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PagosAutorizadosProceso> pagosautorizadosprocesosRespaldo=null;
		
		classes=PagosAutorizadosProcesoConstantesFunciones.getClassesRelationshipsOfPagosAutorizadosProceso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pagosautorizadosprocesoLogic.setDatosCliente(this.datosCliente);
		this.pagosautorizadosprocesoLogic.setDatosDeep(this.datosDeep);
		this.pagosautorizadosprocesoLogic.setIsConDeep(true);
		
		pagosautorizadosprocesosRespaldo=this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos();
		
		this.pagosautorizadosprocesoLogic.setPagosAutorizadosProcesos(pagosautorizadosprocesosParaReportes);	
		this.pagosautorizadosprocesoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pagosautorizadosprocesosParaReportes=this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos();
		this.pagosautorizadosprocesoLogic.setPagosAutorizadosProcesos(pagosautorizadosprocesosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadosProcesos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutorizadosProceso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PagosAutorizadosProceso pagosautorizadosproceso : pagosautorizadosprocesosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPagosAutorizadosProceso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PagosAutorizadosProcesoConstantesFunciones.generarExcelReporteDataPagosAutorizadosProceso("NORMAL",row,workbook,pagosautorizadosproceso,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.getPagosAutorizadosProcesoDescripcion(pagosautorizadosproceso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPagosAutorizadosProceso() throws Exception {		
		this.startProcessPagosAutorizadosProceso(true);
	}
	
	public void startProcessPagosAutorizadosProceso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPagosAutorizadosProceso ,this.jPanelParametrosReportesPagosAutorizadosProceso, this.jScrollPanelDatosPagosAutorizadosProceso,this.jPanelPaginacionPagosAutorizadosProceso, this.jScrollPanelDatosEdicionPagosAutorizadosProceso, this.jPanelAccionesPagosAutorizadosProceso,this.jPanelAccionesFormularioPagosAutorizadosProceso,this.jmenuBarPagosAutorizadosProceso,this.jmenuBarDetallePagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutorizadosProceso=this.jTabbedPaneBusquedasPagosAutorizadosProceso; 
		
		final JPanel jPanelParametrosReportesPagosAutorizadosProceso=this.jPanelParametrosReportesPagosAutorizadosProceso;
		//final JScrollPane jScrollPanelDatosPagosAutorizadosProceso=this.jScrollPanelDatosPagosAutorizadosProceso;
		final JTable jTableDatosPagosAutorizadosProceso=this.jTableDatosPagosAutorizadosProceso;		
		final JPanel jPanelPaginacionPagosAutorizadosProceso=this.jPanelPaginacionPagosAutorizadosProceso;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutorizadosProceso=this.jScrollPanelDatosEdicionPagosAutorizadosProceso;
		final JPanel jPanelAccionesPagosAutorizadosProceso=this.jPanelAccionesPagosAutorizadosProceso;
		
		JPanel jPanelCamposAuxiliarPagosAutorizadosProceso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			jPanelCamposAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelCamposPagosAutorizadosProceso;
			jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelAccionesFormularioPagosAutorizadosProceso;
		}
		
		final JPanel jPanelCamposPagosAutorizadosProceso=jPanelCamposAuxiliarPagosAutorizadosProceso;
		final JPanel jPanelAccionesFormularioPagosAutorizadosProceso=jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso;
		
		
		final JMenuBar jmenuBarPagosAutorizadosProceso=this.jmenuBarPagosAutorizadosProceso;
		final JToolBar jTtoolBarPagosAutorizadosProceso=this.jTtoolBarPagosAutorizadosProceso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPagosAutorizadosProceso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutorizadosProceso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			jmenuBarDetalleAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jmenuBarDetallePagosAutorizadosProceso;
			jTtoolBarDetalleAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTtoolBarDetallePagosAutorizadosProceso;
		}
		
		final JMenuBar jmenuBarDetallePagosAutorizadosProceso=jmenuBarDetalleAuxiliarPagosAutorizadosProceso;
		final JToolBar jTtoolBarDetallePagosAutorizadosProceso=jTtoolBarDetalleAuxiliarPagosAutorizadosProceso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutorizadosProceso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutorizadosProceso;
			processRunnable.jTableDatos=jTableDatosPagosAutorizadosProceso;
			processRunnable.jPanelCampos=jPanelCamposPagosAutorizadosProceso;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutorizadosProceso;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutorizadosProceso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutorizadosProceso;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutorizadosProceso;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutorizadosProceso;
			processRunnable.jTtoolBar=jTtoolBarPagosAutorizadosProceso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutorizadosProceso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutorizadosProceso ,jPanelParametrosReportesPagosAutorizadosProceso,jTableDatosPagosAutorizadosProceso, /*jScrollPanelDatosPagosAutorizadosProceso,*/jPanelCamposPagosAutorizadosProceso,jPanelPaginacionPagosAutorizadosProceso, /*jScrollPanelDatosEdicionPagosAutorizadosProceso,*/ jPanelAccionesPagosAutorizadosProceso,jPanelAccionesFormularioPagosAutorizadosProceso,jmenuBarPagosAutorizadosProceso,jmenuBarDetallePagosAutorizadosProceso,jTtoolBarPagosAutorizadosProceso,jTtoolBarDetallePagosAutorizadosProceso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutorizadosProceso ,jPanelParametrosReportesPagosAutorizadosProceso, jScrollPanelDatosPagosAutorizadosProceso,jPanelPaginacionPagosAutorizadosProceso, jScrollPanelDatosEdicionPagosAutorizadosProceso, jPanelAccionesPagosAutorizadosProceso,jPanelAccionesFormularioPagosAutorizadosProceso,jmenuBarPagosAutorizadosProceso,jmenuBarDetallePagosAutorizadosProceso,jTtoolBarPagosAutorizadosProceso,jTtoolBarDetallePagosAutorizadosProceso);
						
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
	
	public void finishProcessPagosAutorizadosProceso() {// throws Exception 
		this.finishProcessPagosAutorizadosProceso(true);
	}
	
	public void finishProcessPagosAutorizadosProceso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPagosAutorizadosProceso ,this.jPanelParametrosReportesPagosAutorizadosProceso, this.jScrollPanelDatosPagosAutorizadosProceso,this.jPanelPaginacionPagosAutorizadosProceso, this.jScrollPanelDatosEdicionPagosAutorizadosProceso, this.jPanelAccionesPagosAutorizadosProceso,this.jPanelAccionesFormularioPagosAutorizadosProceso,this.jmenuBarPagosAutorizadosProceso,this.jmenuBarDetallePagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,this.jTtoolBarDetallePagosAutorizadosProceso);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutorizadosProceso=this.jTabbedPaneBusquedasPagosAutorizadosProceso; 
		
		final JPanel jPanelParametrosReportesPagosAutorizadosProceso=this.jPanelParametrosReportesPagosAutorizadosProceso;
		//final JScrollPane jScrollPanelDatosPagosAutorizadosProceso=this.jScrollPanelDatosPagosAutorizadosProceso;
		final JTable jTableDatosPagosAutorizadosProceso=this.jTableDatosPagosAutorizadosProceso;		
		final JPanel jPanelPaginacionPagosAutorizadosProceso=this.jPanelPaginacionPagosAutorizadosProceso;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutorizadosProceso=this.jScrollPanelDatosEdicionPagosAutorizadosProceso;
		final JPanel jPanelAccionesPagosAutorizadosProceso=this.jPanelAccionesPagosAutorizadosProceso;
		
		JPanel jPanelCamposAuxiliarPagosAutorizadosProceso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso=new JPanel();
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			jPanelCamposAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelCamposPagosAutorizadosProceso;
			jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelAccionesFormularioPagosAutorizadosProceso;
		}
		
		final JPanel jPanelCamposPagosAutorizadosProceso=jPanelCamposAuxiliarPagosAutorizadosProceso;
		final JPanel jPanelAccionesFormularioPagosAutorizadosProceso=jPanelAccionesFormularioAuxiliarPagosAutorizadosProceso;
		
		
		final JMenuBar jmenuBarPagosAutorizadosProceso=this.jmenuBarPagosAutorizadosProceso;		
		final JToolBar jTtoolBarPagosAutorizadosProceso=this.jTtoolBarPagosAutorizadosProceso;
				
		JMenuBar jmenuBarDetalleAuxiliarPagosAutorizadosProceso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutorizadosProceso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			jmenuBarDetalleAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jmenuBarDetallePagosAutorizadosProceso;
			jTtoolBarDetalleAuxiliarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTtoolBarDetallePagosAutorizadosProceso;		
		}
		
		final JMenuBar jmenuBarDetallePagosAutorizadosProceso=jmenuBarDetalleAuxiliarPagosAutorizadosProceso;
		final JToolBar jTtoolBarDetallePagosAutorizadosProceso=jTtoolBarDetalleAuxiliarPagosAutorizadosProceso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutorizadosProceso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutorizadosProceso;
			processRunnable.jTableDatos=jTableDatosPagosAutorizadosProceso;
			processRunnable.jPanelCampos=jPanelCamposPagosAutorizadosProceso;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutorizadosProceso;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutorizadosProceso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutorizadosProceso;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutorizadosProceso;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutorizadosProceso;
			processRunnable.jTtoolBar=jTtoolBarPagosAutorizadosProceso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutorizadosProceso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPagosAutorizadosProceso ,jPanelParametrosReportesPagosAutorizadosProceso, jTableDatosPagosAutorizadosProceso,/*jScrollPanelDatosPagosAutorizadosProceso,*/jPanelCamposPagosAutorizadosProceso,jPanelPaginacionPagosAutorizadosProceso, /*jScrollPanelDatosEdicionPagosAutorizadosProceso,*/ jPanelAccionesPagosAutorizadosProceso,jPanelAccionesFormularioPagosAutorizadosProceso,jmenuBarPagosAutorizadosProceso,jmenuBarDetallePagosAutorizadosProceso,jTtoolBarPagosAutorizadosProceso,jTtoolBarDetallePagosAutorizadosProceso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPagosAutorizadosProceso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPagosAutorizadosProceso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPagosAutorizadosProceso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPagosAutorizadosProceso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPagosAutorizadosProceso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagosAutorizadosProceso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPagosAutorizadosProceso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPagosAutorizadosProceso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagosAutorizadosProceso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pagosautorizadosprocesoConstantesFunciones.getsFinalQueryPagosAutorizadosProceso();
		String  finalQueryPaginacionTodos=this.pagosautorizadosprocesoConstantesFunciones.getsFinalQueryPagosAutorizadosProceso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PagosAutorizadosProcesoConstantesFunciones.getArrayColumnasGlobalesNoPagosAutorizadosProceso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PagosAutorizadosProcesoConstantesFunciones.getArrayColumnasGlobalesPagosAutorizadosProceso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PagosAutorizadosProcesoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pagosautorizadosprocesosEliminados= new ArrayList<PagosAutorizadosProceso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPagosAutorizadosProceso();
		
				///*PagosAutorizadosProcesoSessionBean*/this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
			
			if(this.pagosautorizadosprocesoSessionBean==null) {
				this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
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
					this.iNumeroPaginacion=PagosAutorizadosProcesoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PagosAutorizadosProcesoConstantesFunciones.getClassesForeignKeysOfPagosAutorizadosProceso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pagosautorizadosproceso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pagosautorizadosprocesosAux= new ArrayList<PagosAutorizadosProceso>();
			
				
			pagosautorizadosprocesoLogic.setDatosCliente(this.datosCliente);
			pagosautorizadosprocesoLogic.setDatosDeep(this.datosDeep);
			pagosautorizadosprocesoLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPagosAutorizadosProceso")) {
				this.sDetalleReporte=PagosAutorizadosProcesoConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizadosProceso(id_ejercicioBusquedaPagosAutorizadosProceso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPagosAutorizadosProceso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutorizadosProcesoConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizadosProceso(id_ejercicioBusquedaPagosAutorizadosProceso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutorizadosProcesoConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizadosProceso(id_ejercicioBusquedaPagosAutorizadosProceso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()==null||pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pagosautorizadosprocesos==null|| pagosautorizadosprocesos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosprocesosAux=new ArrayList<PagosAutorizadosProceso>();
						pagosautorizadosprocesosAux.addAll(pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadosprocesosAux=new ArrayList<PagosAutorizadosProceso>();
							pagosautorizadosprocesosAux.addAll(pagosautorizadosprocesos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPagosAutorizadosProceso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutorizadosProcesoConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizadosProceso(id_ejercicioBusquedaPagosAutorizadosProceso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutorizadosProcesoConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizadosProceso(id_ejercicioBusquedaPagosAutorizadosProceso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePagosAutorizadosProcesos("BusquedaPagosAutorizadosProceso",pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePagosAutorizadosProcesos("BusquedaPagosAutorizadosProceso",pagosautorizadosprocesos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosprocesoLogic.setPagosAutorizadosProcesos(new ArrayList<PagosAutorizadosProceso>());
						pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().addAll(pagosautorizadosprocesosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadosprocesos=new ArrayList<PagosAutorizadosProceso>();
							pagosautorizadosprocesos.addAll(pagosautorizadosprocesosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPagosAutorizadosProceso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPagosAutorizadosProceso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadosprocesos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadosprocesos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PagosAutorizadosProceso pagosautorizadosproceso) {
		Boolean permite=true;
		
		if(this.pagosautorizadosproceso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PagosAutorizadosProcesoConstantesFunciones.getOrderByListaPagosAutorizadosProceso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PagosAutorizadosProcesoConstantesFunciones.getOrderByListaPagosAutorizadosProceso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				if(pagosautorizadosproceso.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosprocesoTotales=pagosautorizadosproceso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizadosProceso pagosautorizadosproceso:this.pagosautorizadosprocesos) {
				if(pagosautorizadosproceso.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosprocesoTotales=pagosautorizadosproceso;
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
			this.pagosautorizadosprocesoAux=new PagosAutorizadosProceso();
			this.pagosautorizadosprocesoAux.setsType(Constantes2.S_TOTALES);
			this.pagosautorizadosprocesoAux.setIsNew(false);
			this.pagosautorizadosprocesoAux.setIsChanged(false);
			this.pagosautorizadosprocesoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PagosAutorizadosProcesoConstantesFunciones.TotalizarValoresFilaPagosAutorizadosProceso(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos(),this.pagosautorizadosprocesoAux);
				
				//this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().add(this.pagosautorizadosprocesoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PagosAutorizadosProcesoConstantesFunciones.TotalizarValoresFilaPagosAutorizadosProceso(this.pagosautorizadosprocesos,this.pagosautorizadosprocesoAux);
				
				this.pagosautorizadosprocesos.add(this.pagosautorizadosprocesoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pagosautorizadosprocesoTotales=new PagosAutorizadosProceso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().remove(pagosautorizadosprocesoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautorizadosprocesos.remove(pagosautorizadosprocesoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pagosautorizadosprocesoTotales=new PagosAutorizadosProceso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				if(pagosautorizadosproceso.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosprocesoTotales=pagosautorizadosproceso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutorizadosProcesoConstantesFunciones.TotalizarValoresFilaPagosAutorizadosProceso(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos(),pagosautorizadosprocesoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizadosProceso pagosautorizadosproceso:this.pagosautorizadosprocesos) {
				if(pagosautorizadosproceso.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosprocesoTotales=pagosautorizadosproceso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutorizadosProcesoConstantesFunciones.TotalizarValoresFilaPagosAutorizadosProceso(this.pagosautorizadosprocesos,pagosautorizadosprocesoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso()throws Exception {
		try {
			sAccionBusqueda="BusquedaPagosAutorizadosProceso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosAutorizadosProcesosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosAutorizadosProcesosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosAutorizadosProcesosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosAutorizadosProcesosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosAutorizadosProcesosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosAutorizadosProcesosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosprocesoLogic.getPagosAutorizadosProcesosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPagosAutorizadosProceso() {
		this.isPermisoTodoPagosAutorizadosProceso=false;
		this.isPermisoNuevoPagosAutorizadosProceso=false;
		this.isPermisoActualizarPagosAutorizadosProceso=false;
		this.isPermisoActualizarOriginalPagosAutorizadosProceso=false;
		this.isPermisoEliminarPagosAutorizadosProceso=false;
		this.isPermisoGuardarCambiosPagosAutorizadosProceso=false;
		this.isPermisoConsultaPagosAutorizadosProceso=true;
		this.isPermisoBusquedaPagosAutorizadosProceso=true;
		this.isPermisoReportePagosAutorizadosProceso=true;
		this.isPermisoOrdenPagosAutorizadosProceso=false;		
		this.isPermisoPaginacionMedioPagosAutorizadosProceso=false;		
		this.isPermisoPaginacionAltoPagosAutorizadosProceso=false;		
		this.isPermisoPaginacionTodoPagosAutorizadosProceso=false;		
		this.isPermisoCopiarPagosAutorizadosProceso=false;		
		this.isPermisoVerFormPagosAutorizadosProceso=false;		
		this.isPermisoDuplicarPagosAutorizadosProceso=false;
		this.isPermisoOrdenPagosAutorizadosProceso=false;
	}
	
	public void setPermisosUsuarioPagosAutorizadosProceso(Boolean isPermiso) {
		this.isPermisoTodoPagosAutorizadosProceso=isPermiso;
		this.isPermisoNuevoPagosAutorizadosProceso=isPermiso;
		this.isPermisoActualizarPagosAutorizadosProceso=isPermiso;
		this.isPermisoActualizarOriginalPagosAutorizadosProceso=isPermiso;
		this.isPermisoEliminarPagosAutorizadosProceso=isPermiso;
		this.isPermisoGuardarCambiosPagosAutorizadosProceso=isPermiso;
		this.isPermisoConsultaPagosAutorizadosProceso=isPermiso;
		this.isPermisoBusquedaPagosAutorizadosProceso=isPermiso;
		this.isPermisoReportePagosAutorizadosProceso=isPermiso;
		this.isPermisoOrdenPagosAutorizadosProceso=isPermiso;		
		this.isPermisoPaginacionMedioPagosAutorizadosProceso=isPermiso;		
		this.isPermisoPaginacionAltoPagosAutorizadosProceso=isPermiso;		
		this.isPermisoPaginacionTodoPagosAutorizadosProceso=isPermiso;		
		this.isPermisoCopiarPagosAutorizadosProceso=isPermiso;		
		this.isPermisoVerFormPagosAutorizadosProceso=isPermiso;		
		this.isPermisoDuplicarPagosAutorizadosProceso=isPermiso;
		this.isPermisoOrdenPagosAutorizadosProceso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPagosAutorizadosProceso(Boolean isPermiso) {
		//this.isPermisoTodoPagosAutorizadosProceso=isPermiso;
		this.isPermisoNuevoPagosAutorizadosProceso=isPermiso;
		this.isPermisoActualizarPagosAutorizadosProceso=isPermiso;
		this.isPermisoActualizarOriginalPagosAutorizadosProceso=isPermiso;
		this.isPermisoEliminarPagosAutorizadosProceso=isPermiso;
		this.isPermisoGuardarCambiosPagosAutorizadosProceso=isPermiso;
		//this.isPermisoConsultaPagosAutorizadosProceso=isPermiso;
		//this.isPermisoBusquedaPagosAutorizadosProceso=isPermiso;
		//this.isPermisoReportePagosAutorizadosProceso=isPermiso;
		//this.isPermisoOrdenPagosAutorizadosProceso=isPermiso;		
		//this.isPermisoPaginacionMedioPagosAutorizadosProceso=isPermiso;		
		//this.isPermisoPaginacionAltoPagosAutorizadosProceso=isPermiso;		
		//this.isPermisoPaginacionTodoPagosAutorizadosProceso=isPermiso;		
		//this.isPermisoCopiarPagosAutorizadosProceso=isPermiso;		
		//this.isPermisoDuplicarPagosAutorizadosProceso=isPermiso;
		//this.isPermisoOrdenPagosAutorizadosProceso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutorizadosProcesoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PagosAutorizadosProcesoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPagosAutorizadosProceso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutorizadosProcesoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPagosAutorizadosProcesoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPagosAutorizadosProcesoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPagosAutorizadosProcesoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPagosAutorizadosProceso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PagosAutorizadosProcesoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PagosAutorizadosProcesoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPagosAutorizadosProceso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPagosAutorizadosProceso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPagosAutorizadosProceso=this.isPermisoActualizarPagosAutorizadosProceso;
			this.isPermisoEliminarPagosAutorizadosProceso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPagosAutorizadosProceso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPagosAutorizadosProceso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPagosAutorizadosProceso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPagosAutorizadosProceso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePagosAutorizadosProceso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutorizadosProceso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPagosAutorizadosProceso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPagosAutorizadosProceso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPagosAutorizadosProceso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPagosAutorizadosProceso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPagosAutorizadosProceso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPagosAutorizadosProceso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutorizadosProceso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPagosAutorizadosProceso.setToolTipText(this.jTableDatosPagosAutorizadosProceso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPagosAutorizadosProceso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPagosAutorizadosProceso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPagosAutorizadosProceso() throws Exception {
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
	public void inicializarCombosForeignKeyPagosAutorizadosProcesoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPagosAutorizadosProcesoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PagosAutorizadosProcesoJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyPagosAutorizadosProceso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pagosautorizadosprocesoSessionBean==null) {
				this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
			}

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.pagosautorizadosprocesoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPagosAutorizadosProceso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPagosAutorizadosProceso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPagosAutorizadosProceso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizadosProceso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPagosAutorizadosProceso()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizadosProceso()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPagosAutorizadosProceso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPagosAutorizadosProceso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPagosAutorizadosProceso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPagosAutorizadosProceso()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPagosAutorizadosProceso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPagosAutorizadosProceso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public PagosAutorizadosProcesoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PagosAutorizadosProcesoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PagosAutorizadosProcesoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean(); 
		this.pagosautorizadosprocesoConstantesFunciones=new PagosAutorizadosProcesoConstantesFunciones(); 
		this.pagosautorizadosprocesoBean=new PagosAutorizadosProceso();//(this.pagosautorizadosprocesoConstantesFunciones); 		
		this.pagosautorizadosprocesoReturnGeneral=new PagosAutorizadosProcesoParameterReturnGeneral(); 
		
		this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosprocesoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PagosAutorizadosProcesoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PagosAutorizadosProcesoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PagosAutorizadosProcesoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPagosAutorizadosProceso(true);
			
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
			
			this.pagosautorizadosprocesoConstantesFunciones=new PagosAutorizadosProcesoConstantesFunciones(); 
			this.pagosautorizadosprocesoBean=new PagosAutorizadosProceso();//this.pagosautorizadosprocesoConstantesFunciones); 			
			this.pagosautorizadosprocesoReturnGeneral=new PagosAutorizadosProcesoParameterReturnGeneral(); 
		
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Autorizados Proceso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pagosautorizadosproceso=new PagosAutorizadosProceso();
			this.pagosautorizadosprocesos = new ArrayList<PagosAutorizadosProceso>();
			this.pagosautorizadosprocesosAux = new ArrayList<PagosAutorizadosProceso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic=new PagosAutorizadosProcesoLogic();
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			//this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pagosautorizadosprocesoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPagosAutorizadosProceso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutorizadosProceso);	
					}
					
					if(this.jInternalFrameImportacionPagosAutorizadosProceso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutorizadosProceso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPagosAutorizadosProceso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPagosAutorizadosProceso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutorizadosProceso);
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.setVisible(false);
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso);
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setVisible(false);
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPagosAutorizadosProceso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutorizadosProceso);
					this.jInternalFrameImportacionPagosAutorizadosProceso.setVisible(false);
					this.jInternalFrameImportacionPagosAutorizadosProceso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPagosAutorizadosProceso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutorizadosProceso);
					this.jInternalFrameOrderByPagosAutorizadosProceso.setVisible(false);
					this.jInternalFrameOrderByPagosAutorizadosProceso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPagosAutorizadosProcesoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PagosAutorizadosProcesoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pagosautorizadosprocesoReturnGeneral=new PagosAutorizadosProcesoParameterReturnGeneral();
			
			this.pagosautorizadosprocesoParameterGeneral=new PagosAutorizadosProcesoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pagosautorizadosprocesoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutorizadosProcesoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutorizadosProcesoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaCopiarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaVerFormPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaOrdenPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			
			
			this.isVisibilidadBusquedaPagosAutorizadosProceso=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPagosAutorizadosProceso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPagosAutorizadosProceso(false);
			
			this.setPermisosUsuarioPagosAutorizadosProceso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() 
				|| (this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado() && this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPagosAutorizadosProcesoClasesRelacionadas();
			}
			
			if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPagosAutorizadosProcesoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPagosAutorizadosProceso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPagosAutorizadosProceso();
			}
			
			if(!this.isPermisoBusquedaPagosAutorizadosProceso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PagosAutorizadosProcesoConstantesFunciones.getTiposSeleccionarPagosAutorizadosProceso());
				
				this.tiposColumnasSelect=PagosAutorizadosProcesoConstantesFunciones.getTiposSeleccionarPagosAutorizadosProceso(true);
				
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
			//if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPagosAutorizadosProceso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPagosAutorizadosProceso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPagosAutorizadosProceso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizadosProceso() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				pagosautorizadosprocesoImplementable= (PagosAutorizadosProcesoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutorizadosProcesoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pagosautorizadosprocesoImplementableHome= (PagosAutorizadosProcesoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutorizadosProcesoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pagosautorizadosprocesos= new ArrayList<PagosAutorizadosProceso>();
			this.pagosautorizadosprocesosEliminados= new ArrayList<PagosAutorizadosProceso>();
						
			this.isEsNuevoPagosAutorizadosProceso=false;
			this.esParaAccionDesdeFormularioPagosAutorizadosProceso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPagosAutorizadosProceso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPagosAutorizadosProceso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PagosAutorizadosProcesoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPagosAutorizadosProceso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPagosAutorizadosProceso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPagosAutorizadosProceso();
			}
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPagosAutorizadosProceso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPagosAutorizadosProceso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPagosAutorizadosProceso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPagosAutorizadosProceso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PagosAutorizadosProceso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPagosAutorizadosProceso() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPagosAutorizadosProceso")) {
				iIndex=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPagosAutorizadosProceso();	
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
	
	public void cargarCombosForeignKeyPagosAutorizadosProceso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPagosAutorizadosProceso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPagosAutorizadosProceso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPagosAutorizadosProcesoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPagosAutorizadosProceso();
		
		this.cargarCombosFrameForeignKeyPagosAutorizadosProceso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPagosAutorizadosProceso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPagosAutorizadosProceso();
		}
	}
	
	
	
	public void jButtonNuevoPagosAutorizadosProcesoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			
			if(jTableDatosPagosAutorizadosProceso.getRowCount()>=1) {
				jTableDatosPagosAutorizadosProceso.removeRowSelectionInterval(0, jTableDatosPagosAutorizadosProceso.getRowCount()-1);						
			}
			
			this.isEsNuevoPagosAutorizadosProceso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPagosAutorizadosProceso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPagosAutorizadosProceso(true);			
			//this.pagosautorizadosproceso=new PagosAutorizadosProceso();
			//this.pagosautorizadosproceso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso() ;
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizadosProceso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pagosautorizadosproceso);	
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);				
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PagosAutorizadosProceso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPagosAutorizadosProcesoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPagosAutorizadosProceso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPagosAutorizadosProceso.getSelectedRows().length;			
			}
			
			pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPagosAutorizadosProceso--;			
				//PagosAutorizadosProceso pagosautorizadosprocesoAux= new PagosAutorizadosProceso();			
				//pagosautorizadosprocesoAux.setId(this.iIdNuevoPagosAutorizadosProceso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PagosAutorizadosProceso pagosautorizadosprocesoOrigen=new PagosAutorizadosProceso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PagosAutorizadosProceso pagosautorizadosprocesoOrigen : pagosautorizadosprocesosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pagosautorizadosprocesoOrigen =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadosprocesoOrigen =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPagosAutorizadosProceso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pagosautorizadosproceso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPagosAutorizadosProceso(pagosautorizadosprocesoOrigen,this.pagosautorizadosproceso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().add(this.pagosautorizadosprocesoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosprocesos.add(this.pagosautorizadosprocesoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
				
				this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizadosProceso(), this.getIndiceNuevoPagosAutorizadosProceso());
				
				int iLastRow =  this.jTableDatosPagosAutorizadosProceso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutorizadosProceso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutorizadosProceso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();									
		
			PagosAutorizadosProceso pagosautorizadosprocesoOrigen=new PagosAutorizadosProceso();
			PagosAutorizadosProceso pagosautorizadosprocesoDestino=new PagosAutorizadosProceso();
				
			pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPagosAutorizadosProceso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pagosautorizadosprocesosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPagosAutorizadosProceso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosprocesoOrigen =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautorizadosprocesoOrigen =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosprocesoDestino =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautorizadosprocesoDestino =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pagosautorizadosprocesoOrigen =pagosautorizadosprocesosSeleccionados.get(0);
				pagosautorizadosprocesoDestino =pagosautorizadosprocesosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPagosAutorizadosProceso(pagosautorizadosprocesoOrigen,pagosautorizadosprocesoDestino,true,false);
				
				pagosautorizadosprocesoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pagosautorizadosprocesoDestino,pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pagosautorizadosprocesoDestino,pagosautorizadosprocesos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
				
				//this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizadosProceso(), this.getIndiceNuevoPagosAutorizadosProceso());
				
				int iLastRow =  this.jTableDatosPagosAutorizadosProceso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutorizadosProceso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutorizadosProceso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPagosAutorizadosProceso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(!isVisible);
			this.jPanelPaginacionPagosAutorizadosProceso.setVisible(!isVisible);
			this.jPanelAccionesPagosAutorizadosProceso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePagosAutorizadosProceso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPagosAutorizadosProceso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPagosAutorizadosProceso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPagosAutorizadosProceso();
			
			this.abrirFrameOrderByPagosAutorizadosProceso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPagosAutorizadosProceso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePagosAutorizadosProceso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutorizadosProceso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.isMaximum()) {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSize(this.jInternalFrameDetalleFormPagosAutorizadosProceso.iWidthFormulario,this.jInternalFrameDetalleFormPagosAutorizadosProceso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPagosAutorizadosProceso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPagosAutorizadosProceso.isMaximum()) {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jContentPaneDetallePagosAutorizadosProceso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jContentPaneDetallePagosAutorizadosProceso.getWidth(),PagosAutorizadosProcesoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jContentPaneDetallePagosAutorizadosProceso.getWidth(),PagosAutorizadosProcesoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jContentPaneDetallePagosAutorizadosProceso.getWidth(),PagosAutorizadosProcesoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPagosAutorizadosProceso.setVisible(true);
	        this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPagosAutorizadosProceso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPagosAutorizadosProceso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPagosAutorizadosProceso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizadosProceso,false,this);
				} else {
					this.jInternalFrameOrderByPagosAutorizadosProceso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizadosProceso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutorizadosProceso);
				this.jInternalFrameOrderByPagosAutorizadosProceso.setVisible(false);
				this.jInternalFrameOrderByPagosAutorizadosProceso.setSelected(false);
				
				this.jInternalFrameOrderByPagosAutorizadosProceso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutorizadosProceso"));
				
				this.inicializarActualizarBindingTablaOrderByPagosAutorizadosProceso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPagosAutorizadosProceso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPagosAutorizadosProceso==null) {
				
				this.jInternalFrameImportacionPagosAutorizadosProceso=new ImportacionJInternalFrame(PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutorizadosProceso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutorizadosProceso);
				this.jInternalFrameImportacionPagosAutorizadosProceso.setVisible(false);
				this.jInternalFrameImportacionPagosAutorizadosProceso.setSelected(false);


				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutorizadosProceso"));
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutorizadosProceso"));
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutorizadosProceso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPagosAutorizadosProceso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso==null) {
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso=new ReporteDinamicoJInternalFrame(PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutorizadosProceso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso);
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setVisible(false);
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizadosProceso"));
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizadosProceso"));
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizadosProceso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizadosProceso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePagosAutorizadosProceso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutorizadosProceso);
			
	       	this.jInternalFrameDetalleFormPagosAutorizadosProceso.setVisible(false);
	        this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSelected(false);
			
			//this.jInternalFrameDetalleFormPagosAutorizadosProceso.dispose();
			//this.jInternalFrameDetalleFormPagosAutorizadosProceso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPagosAutorizadosProceso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setVisible(true);
	        this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPagosAutorizadosProceso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPagosAutorizadosProceso.setVisible(true);
	        this.jInternalFrameImportacionPagosAutorizadosProceso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPagosAutorizadosProceso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPagosAutorizadosProceso.setVisible(true);
	        this.jInternalFrameOrderByPagosAutorizadosProceso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPagosAutorizadosProceso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPagosAutorizadosProceso.setVisible(false);
	        this.jInternalFrameOrderByPagosAutorizadosProceso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPagosAutorizadosProceso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setVisible(false);
	        this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPagosAutorizadosProceso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPagosAutorizadosProceso.setVisible(false);
	        this.jInternalFrameImportacionPagosAutorizadosProceso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPagosAutorizadosProceso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPagosAutorizadosProceso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPagosAutorizadosProceso(true);
			//this.isEsNuevoPagosAutorizadosProceso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false) ;
			
			if(pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizadosProceso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPagosAutorizadosProcesoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPagosAutorizadosProceso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPagosAutorizadosProceso(true);
			//this.isEsNuevoPagosAutorizadosProceso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pagosautorizadosproceso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false) ;
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizadosProceso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPagosAutorizadosProceso(false);
			
			//if(!this.isEsNuevoPagosAutorizadosProceso) {								
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				
			}
			
			if(this.permiteMantenimiento(this.pagosautorizadosproceso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPagosAutorizadosProceso=true;
					this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
					this.isEsNuevoPagosAutorizadosProceso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPagosAutorizadosProceso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPagosAutorizadosProceso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(false);
				
				this.habilitarDeshabilitarControlesPagosAutorizadosProceso(false);
			
												
				
				if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePagosAutorizadosProceso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,pagosautorizadosprocesoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPagosAutorizadosProceso(this.pagosautorizadosproceso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pagosautorizadosprocesoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pagosautorizadosproceso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				this.pagosautorizadosproceso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				this.pagosautorizadosproceso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pagosautorizadosproceso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PagosAutorizadosProcesoModel) this.jTableDatosPagosAutorizadosProceso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPagosAutorizadosProceso=true;
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
				this.isEsNuevoPagosAutorizadosProceso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(false);
				
				this.habilitarDeshabilitarControlesPagosAutorizadosProceso(false);
				
				
				
				if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePagosAutorizadosProceso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPagosAutorizadosProceso.getRowCount()>=1) {
				jTableDatosPagosAutorizadosProceso.removeRowSelectionInterval(0, jTableDatosPagosAutorizadosProceso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPagosAutorizadosProceso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(false) ;
			
			this.isEsNuevoPagosAutorizadosProceso=false;
			
			if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePagosAutorizadosProceso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				
				//SI ES MANUAL
				if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPagosAutorizadosProceso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPagosAutorizadosProceso--;			
			//PagosAutorizadosProceso pagosautorizadosprocesoAux= new PagosAutorizadosProceso();			
			//pagosautorizadosprocesoAux.setId(this.iIdNuevoPagosAutorizadosProceso);
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPagosAutorizadosProceso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
			
			this.pagosautorizadosproceso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().add(this.pagosautorizadosprocesoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pagosautorizadosprocesos.add(this.pagosautorizadosprocesoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			
			this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizadosProceso(), this.getIndiceNuevoPagosAutorizadosProceso());
			
			int iLastRow =  this.jTableDatosPagosAutorizadosProceso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPagosAutorizadosProceso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPagosAutorizadosProceso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizadosProceso();
			}
			
			//this.abrirFrameTreePagosAutorizadosProceso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPagosAutorizadosProceso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPagosAutorizadosProceso.setFileImportacion(this.jInternalFrameImportacionPagosAutorizadosProceso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPagosAutorizadosProceso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPagosAutorizadosProceso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		

		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PagosAutorizadosProcesoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PagosAutorizadosProcesoBaseDesign.jrxml";
			
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
			
			this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoMovimientoModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoMovimientoModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoMovimientoModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoMovimientoModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiarioDetalleChequeGirado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiarioDetalleChequeGirado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiarioDetalleChequeGirado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiarioDetalleChequeGirado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO:
					sNombreCampoCategoria="nombre_tipo_documento";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoria="codigo_tipo_movimiento_modulo";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO:
					sNombreCampoCategoria="codigo_cuenta_banco";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO:
					sNombreCampoCategoria="beneficiario_detalle_cheque_girado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO:
					sNombreCampoCategoriaValor="nombre_tipo_documento";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoriaValor="codigo_tipo_movimiento_modulo";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO:
					sNombreCampoCategoriaValor="codigo_cuenta_banco";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO:
					sNombreCampoCategoriaValor="beneficiario_detalle_cheque_girado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_documento");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Movimiento Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_movimiento_modulo");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_banco");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario Detalle Cheque Girado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario_detalle_cheque_girado");
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
	
	public void jButtonGenerarExcelReporteDinamicoPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PagosAutorizadosProcesos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getnombre_tipo_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getcodigo_cuenta_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO);
					iRow++;

					for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado());
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
			//	this.getFilaCabeceraExportarExcelPagosAutorizadosProceso(row);				
			//	iRow++;
			//}				
			
			//for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPagosAutorizadosProceso(pagosautorizadosprocesoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
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
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizadosProceso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutorizadosProceso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutorizadosProceso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPagosAutorizadosProceso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPagosAutorizadosProceso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPagosAutorizadosProceso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPagosAutorizadosProceso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPagosAutorizadosProceso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPagosAutorizadosProceso.setMinimumSize(dimensionMinimum);
		this.jTableDatosPagosAutorizadosProceso.setMaximumSize(dimensionMaximum);
		this.jTableDatosPagosAutorizadosProceso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPagosAutorizadosProceso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPagosAutorizadosProceso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPagosAutorizadosProceso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPagosAutorizadosProceso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPagosAutorizadosProceso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizadosProceso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPagosAutorizadosProceso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPagosAutorizadosProceso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPagosAutorizadosProceso();
		
		this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutorizadosProceso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizadosProceso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizadosProceso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizadosProceso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPagosAutorizadosProceso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePagosAutorizadosProceso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionNuevoPagosAutorizadosProceso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionNuevoPagosAutorizadosProceso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionSinCerrarPagosAutorizadosProceso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jCheckBoxPostAccionSinMensajePagosAutorizadosProceso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPagosAutorizadosProceso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPagosAutorizadosProceso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPagosAutorizadosProceso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPagosAutorizadosProceso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPagosAutorizadosProceso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPagosAutorizadosProceso(Boolean esInicializar) throws Exception {
		try	{	
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizadosProceso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizadosProceso() throws Exception {
		try	{
			if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutorizadosProceso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutorizadosProceso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutorizadosProceso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPagosAutorizadosProceso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPagosAutorizadosProceso.addItem(reporte);
			}
			
			
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPagosAutorizadosProceso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPagosAutorizadosProceso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizadosProceso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizadosProceso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
				
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PagosAutorizadosProcesoConstantesFunciones.getTiposSeleccionarPagosAutorizadosProceso(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PagosAutorizadosProcesoConstantesFunciones.getTiposSeleccionarPagosAutorizadosProceso(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PagosAutorizadosProcesoConstantesFunciones.getTiposSeleccionarPagosAutorizadosProceso(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPagosAutorizadosProceso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.getSelectedItem()!=null){this.id_ejercicioBusquedaPagosAutorizadosProceso=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPagosAutorizadosProceso(Boolean esInicializar) throws Exception {				
		if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutorizadosProceso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPagosAutorizadosProceso() throws Exception {
		this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPagosAutorizadosProceso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPagosAutorizadosProcesoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProcesoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPagosAutorizadosProceso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pagosautorizadosprocesos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPagosAutorizadosProceso.setModel(new PagosAutorizadosProcesoModel(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPagosAutorizadosProceso.setModel(new PagosAutorizadosProcesoModel(this.pagosautorizadosprocesos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPagosAutorizadosProceso!=null && this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPagosAutorizadosProceso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,pagosautorizadosprocesoConstantesFunciones.resaltarSeleccionarPagosAutorizadosProceso,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,pagosautorizadosprocesoConstantesFunciones.resaltarSeleccionarPagosAutorizadosProceso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_ID));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostraridPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltaridPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activaridPagosAutorizadosProceso,iSizeTabla,this,true,"idPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltaridPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activaridPagosAutorizadosProceso,this,true,"idPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarnombre_tipo_documentoPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnombre_tipo_documentoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnombre_tipo_documentoPagosAutorizadosProceso,iSizeTabla,this,true,"nombre_tipo_documentoPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnombre_tipo_documentoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnombre_tipo_documentoPagosAutorizadosProceso,this,true,"nombre_tipo_documentoPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigoPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigoPagosAutorizadosProceso,iSizeTabla,this,true,"codigoPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigoPagosAutorizadosProceso,this,true,"codigoPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiarioPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiarioPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiarioPagosAutorizadosProceso,iSizeTabla,this,true,"beneficiarioPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiarioPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiarioPagosAutorizadosProceso,this,true,"beneficiarioPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarfechaPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarfechaPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarfechaPagosAutorizadosProceso,iSizeTabla,this,true,"fechaPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarfechaPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarfechaPagosAutorizadosProceso,this,true,"fechaPagosAutorizadosProceso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarfecha_emisionPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarfecha_emisionPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarfecha_emisionPagosAutorizadosProceso,iSizeTabla,this,true,"fecha_emisionPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarfecha_emisionPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarfecha_emisionPagosAutorizadosProceso,this,true,"fecha_emisionPagosAutorizadosProceso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,iSizeTabla,this,true,"codigo_tipo_movimiento_moduloPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,this,true,"codigo_tipo_movimiento_moduloPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_mayorPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_mayorPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnumero_mayorPagosAutorizadosProceso,iSizeTabla,this,true,"numero_mayorPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_mayorPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnumero_mayorPagosAutorizadosProceso,this,true,"numero_mayorPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarvalorPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarvalorPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarvalorPagosAutorizadosProceso,iSizeTabla,this,true,"valorPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarvalorPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarvalorPagosAutorizadosProceso,this,true,"valorPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_cuenta_bancoPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_cuenta_bancoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_cuenta_bancoPagosAutorizadosProceso,iSizeTabla,this,true,"codigo_cuenta_bancoPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_cuenta_bancoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_cuenta_bancoPagosAutorizadosProceso,this,true,"codigo_cuenta_bancoPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_chequePagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_chequePagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnumero_chequePagosAutorizadosProceso,iSizeTabla,this,true,"numero_chequePagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_chequePagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarnumero_chequePagosAutorizadosProceso,this,true,"numero_chequePagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO));

		if(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,iSizeTabla,this,true,"beneficiario_detalle_cheque_giradoPagosAutorizadosProceso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,this,true,"beneficiario_detalle_cheque_giradoPagosAutorizadosProceso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosProcesoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutorizadosProceso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutorizadosProceso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPagosAutorizadosProceso.addColumn(tableColumn);
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
			
			this.jTableDatosPagosAutorizadosProceso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPagosAutorizadosProceso.moveColumn(this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPagosAutorizadosProceso.moveColumn(this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPagosAutorizadosProceso.moveColumn(this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPagosAutorizadosProceso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPagosAutorizadosProceso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPagosAutorizadosProceso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPagosAutorizadosProceso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPagosAutorizadosProceso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPagosAutorizadosProceso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pagosautorizadosprocesos.size()-1;
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
		//this.jTableDatosPagosAutorizadosProceso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPagosAutorizadosProceso();
			
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
				
				//this.isEsNuevoPagosAutorizadosProceso=false;
					
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
				if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutorizadosProceso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutorizadosProceso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pagosautorizadosproceso.getsType().equals("DUPLICADO")
				   || this.pagosautorizadosproceso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPagosAutorizadosProceso=true;
				
				} else {
					this.isEsNuevoPagosAutorizadosProceso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
					if(this.pagosautorizadosproceso.getId()>=0 && !this.pagosautorizadosproceso.getIsNew()) {						
						this.isEsNuevoPagosAutorizadosProceso=false;
						
					} else {
						this.isEsNuevoPagosAutorizadosProceso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPagosAutorizadosProceso(esRelaciones);						
				
				this.seleccionarPagosAutorizadosProceso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pagosautorizadosproceso.getId()<0) {
					this.isEsNuevoPagosAutorizadosProceso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPagosAutorizadosProceso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPagosAutorizadosProceso(evt,rowIndex);
				}	
				
				if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PagosAutorizadosProceso: " + this.dDif); 
					}
				}								
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPagosAutorizadosProceso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pagosautorizadosproceso)) {
					if(this.pagosautorizadosproceso.getId()>0) {
						this.pagosautorizadosproceso.setIsDeleted(true);
						
						this.pagosautorizadosprocesosEliminados.add(this.pagosautorizadosproceso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().remove(this.pagosautorizadosproceso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosprocesos.remove(this.pagosautorizadosproceso);				
					}
					
					
					((PagosAutorizadosProcesoModel) this.jTableDatosPagosAutorizadosProceso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPagosAutorizadosProceso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPagosAutorizadosProceso) {
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutorizadosProceso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutorizadosProceso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPagosAutorizadosProceso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPagosAutorizadosProceso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPagosAutorizadosProceso(pagosautorizadosproceso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPagosAutorizadosProceso(pagosautorizadosproceso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPagosAutorizadosProceso(pagosautorizadosproceso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizadosProceso(pagosautorizadosproceso);
	}
	
	public void setVariablesObjetoActualToFormularioPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setText(pagosautorizadosproceso.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getnombre_tipo_documento());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setText(pagosautorizadosproceso.getbeneficiario());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setDate(pagosautorizadosproceso.getfecha());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setDate(pagosautorizadosproceso.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setText(pagosautorizadosproceso.getnumero_mayor());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setText(pagosautorizadosproceso.getvalor().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo_cuenta_banco());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setText(pagosautorizadosproceso.getnumero_cheque());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PagosAutorizadosProceso pagosautorizadosprocesoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pagosautorizadosprocesoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PagosAutorizadosProceso pagosautorizadosprocesoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pagosautorizadosprocesoLocal=this.pagosautorizadosproceso;
			} else {
				pagosautorizadosprocesoLocal=this.pagosautorizadosprocesoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pagosautorizadosprocesoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPagosAutorizadosProceso(pagosautorizadosprocesoLocal,true);
					
					if(pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pagosautorizadosprocesoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pagosautorizadosprocesoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(pagosautorizadosproceso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(pagosautorizadosproceso);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(pagosautorizadosproceso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.getText()==null || this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.getText()=="" || this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.getText()=="Id") {
				this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setText("0");
			}

			if(conColumnasBase) {pagosautorizadosproceso.setId(Long.parseLong(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelIdPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setnombre_tipo_documento(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnombre_tipo_documentoPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setcodigo(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigoPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setbeneficiario(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiarioPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setfecha(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfechaPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setfecha_emision(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelfecha_emisionPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setcodigo_tipo_movimiento_modulo(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setnumero_mayor(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_mayorPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelvalorPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setcodigo_cuenta_banco(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelcodigo_cuenta_bancoPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setnumero_cheque(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelnumero_chequePagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizadosproceso.setbeneficiario_detalle_cheque_girado(this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosprocesoBean,PagosAutorizadosProceso pagosautorizadosproceso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosprocesoOrigen,PagosAutorizadosProceso pagosautorizadosproceso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getId()!=null && !pagosautorizadosprocesoOrigen.getId().equals(0L))) {pagosautorizadosproceso.setId(pagosautorizadosprocesoOrigen.getId());}}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getnombre_tipo_documento()!=null && !pagosautorizadosprocesoOrigen.getnombre_tipo_documento().equals(""))) {pagosautorizadosproceso.setnombre_tipo_documento(pagosautorizadosprocesoOrigen.getnombre_tipo_documento());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getcodigo()!=null && !pagosautorizadosprocesoOrigen.getcodigo().equals(""))) {pagosautorizadosproceso.setcodigo(pagosautorizadosprocesoOrigen.getcodigo());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getbeneficiario()!=null && !pagosautorizadosprocesoOrigen.getbeneficiario().equals(""))) {pagosautorizadosproceso.setbeneficiario(pagosautorizadosprocesoOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getfecha()!=null && !pagosautorizadosprocesoOrigen.getfecha().equals(new Date()))) {pagosautorizadosproceso.setfecha(pagosautorizadosprocesoOrigen.getfecha());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getfecha_emision()!=null && !pagosautorizadosprocesoOrigen.getfecha_emision().equals(new Date()))) {pagosautorizadosproceso.setfecha_emision(pagosautorizadosprocesoOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getcodigo_tipo_movimiento_modulo()!=null && !pagosautorizadosprocesoOrigen.getcodigo_tipo_movimiento_modulo().equals(""))) {pagosautorizadosproceso.setcodigo_tipo_movimiento_modulo(pagosautorizadosprocesoOrigen.getcodigo_tipo_movimiento_modulo());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getnumero_mayor()!=null && !pagosautorizadosprocesoOrigen.getnumero_mayor().equals(""))) {pagosautorizadosproceso.setnumero_mayor(pagosautorizadosprocesoOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getvalor()!=null && !pagosautorizadosprocesoOrigen.getvalor().equals(0.0))) {pagosautorizadosproceso.setvalor(pagosautorizadosprocesoOrigen.getvalor());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getcodigo_cuenta_banco()!=null && !pagosautorizadosprocesoOrigen.getcodigo_cuenta_banco().equals(""))) {pagosautorizadosproceso.setcodigo_cuenta_banco(pagosautorizadosprocesoOrigen.getcodigo_cuenta_banco());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getnumero_cheque()!=null && !pagosautorizadosprocesoOrigen.getnumero_cheque().equals(""))) {pagosautorizadosproceso.setnumero_cheque(pagosautorizadosprocesoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoOrigen.getbeneficiario_detalle_cheque_girado()!=null && !pagosautorizadosprocesoOrigen.getbeneficiario_detalle_cheque_girado().equals(""))) {pagosautorizadosproceso.setbeneficiario_detalle_cheque_girado(pagosautorizadosprocesoOrigen.getbeneficiario_detalle_cheque_girado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setText(pagosautorizadosproceso.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getnombre_tipo_documento());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setText(pagosautorizadosproceso.getbeneficiario());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setDate(pagosautorizadosproceso.getfecha());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setDate(pagosautorizadosproceso.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setText(pagosautorizadosproceso.getnumero_mayor());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setText(pagosautorizadosproceso.getvalor().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getcodigo_cuenta_banco());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setText(pagosautorizadosproceso.getnumero_cheque());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setText(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutorizadosProceso(PagosAutorizadosProcesoBean pagosautorizadosprocesoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getnombre_tipo_documento());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getcodigo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getbeneficiario());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setDate(pagosautorizadosprocesoBean.getfecha());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setDate(pagosautorizadosprocesoBean.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getcodigo_tipo_movimiento_modulo());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getnumero_mayor());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getvalor().toString());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getcodigo_cuenta_banco());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setText(pagosautorizadosprocesoBean.getbeneficiario_detalle_cheque_girado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPagosAutorizadosProceso(PagosAutorizadosProcesoParameterReturnGeneral pagosautorizadosprocesoReturnGeneral,PagosAutorizadosProcesoBean pagosautorizadosprocesoBean,Boolean conDefault) throws Exception { 
		try {
			PagosAutorizadosProceso pagosautorizadosprocesoLocal=new PagosAutorizadosProceso();
			
			pagosautorizadosprocesoLocal=pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getId()!=null && !pagosautorizadosprocesoLocal.getId().equals(0L))) {pagosautorizadosprocesoBean.setId(pagosautorizadosprocesoLocal.getId());}}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getnombre_tipo_documento()!=null && !pagosautorizadosprocesoLocal.getnombre_tipo_documento().equals(""))) {pagosautorizadosprocesoBean.setnombre_tipo_documento(pagosautorizadosprocesoLocal.getnombre_tipo_documento());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getcodigo()!=null && !pagosautorizadosprocesoLocal.getcodigo().equals(""))) {pagosautorizadosprocesoBean.setcodigo(pagosautorizadosprocesoLocal.getcodigo());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getbeneficiario()!=null && !pagosautorizadosprocesoLocal.getbeneficiario().equals(""))) {pagosautorizadosprocesoBean.setbeneficiario(pagosautorizadosprocesoLocal.getbeneficiario());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getfecha()!=null && !pagosautorizadosprocesoLocal.getfecha().equals(new Date()))) {pagosautorizadosprocesoBean.setfecha(pagosautorizadosprocesoLocal.getfecha());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getfecha_emision()!=null && !pagosautorizadosprocesoLocal.getfecha_emision().equals(new Date()))) {pagosautorizadosprocesoBean.setfecha_emision(pagosautorizadosprocesoLocal.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getcodigo_tipo_movimiento_modulo()!=null && !pagosautorizadosprocesoLocal.getcodigo_tipo_movimiento_modulo().equals(""))) {pagosautorizadosprocesoBean.setcodigo_tipo_movimiento_modulo(pagosautorizadosprocesoLocal.getcodigo_tipo_movimiento_modulo());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getnumero_mayor()!=null && !pagosautorizadosprocesoLocal.getnumero_mayor().equals(""))) {pagosautorizadosprocesoBean.setnumero_mayor(pagosautorizadosprocesoLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getvalor()!=null && !pagosautorizadosprocesoLocal.getvalor().equals(0.0))) {pagosautorizadosprocesoBean.setvalor(pagosautorizadosprocesoLocal.getvalor());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getcodigo_cuenta_banco()!=null && !pagosautorizadosprocesoLocal.getcodigo_cuenta_banco().equals(""))) {pagosautorizadosprocesoBean.setcodigo_cuenta_banco(pagosautorizadosprocesoLocal.getcodigo_cuenta_banco());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getnumero_cheque()!=null && !pagosautorizadosprocesoLocal.getnumero_cheque().equals(""))) {pagosautorizadosprocesoBean.setnumero_cheque(pagosautorizadosprocesoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && pagosautorizadosprocesoLocal.getbeneficiario_detalle_cheque_girado()!=null && !pagosautorizadosprocesoLocal.getbeneficiario_detalle_cheque_girado().equals(""))) {pagosautorizadosprocesoBean.setbeneficiario_detalle_cheque_girado(pagosautorizadosprocesoLocal.getbeneficiario_detalle_cheque_girado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPagosAutorizadosProcesoGenerico(Long idPagosAutorizadosProcesoSeleccionado,JComboBox jComboBoxPagosAutorizadosProceso,List<PagosAutorizadosProceso> pagosautorizadosprocesosLocal)throws Exception {
		try {
			PagosAutorizadosProceso  pagosautorizadosprocesoTemp=null;

			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosLocal) {
				if(pagosautorizadosprocesoAux.getId()!=null && pagosautorizadosprocesoAux.getId().equals(idPagosAutorizadosProcesoSeleccionado)) {
					pagosautorizadosprocesoTemp=pagosautorizadosprocesoAux;
					break;
				}
			}

			jComboBoxPagosAutorizadosProceso.setSelectedItem(pagosautorizadosprocesoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPagosAutorizadosProcesoGenerico(JComboBox jComboBoxPagosAutorizadosProceso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutorizadosProceso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPagosAutorizadosProceso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutorizadosProceso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPagosAutorizadosProceso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPagosAutorizadosProceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPagosAutorizadosProceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizadosproceso=(PagosAutorizadosProceso) pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautorizadosproceso =(PagosAutorizadosProceso) pagosautorizadosprocesos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pagosautorizadosproceso.getIsNew() && !pagosautorizadosproceso.getIsChanged() && !pagosautorizadosproceso.getIsDeleted()) {
				sDescripcion=pagosautorizadosproceso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pagosautorizadosproceso.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!pagosautorizadosproceso.getIsNew() && !pagosautorizadosproceso.getIsChanged() && !pagosautorizadosproceso.getIsDeleted()) {
				sDescripcion=pagosautorizadosproceso.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=pagosautorizadosproceso.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!pagosautorizadosproceso.getIsNew() && !pagosautorizadosproceso.getIsChanged() && !pagosautorizadosproceso.getIsDeleted()) {
				sDescripcion=pagosautorizadosproceso.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=pagosautorizadosproceso.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PagosAutorizadosProceso pagosautorizadosprocesoRow=new PagosAutorizadosProceso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizadosprocesoRow=(PagosAutorizadosProceso) pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautorizadosprocesoRow=(PagosAutorizadosProceso) pagosautorizadosprocesos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));			
			this.jButtonDuplicarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso && this.isPermisoDuplicarPagosAutorizadosProceso));			
			this.jButtonCopiarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizadosProceso && this.isPermisoCopiarPagosAutorizadosProceso));
			this.jButtonVerFormPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizadosProceso && this.isPermisoVerFormPagosAutorizadosProceso));
			
			this.jButtonAbrirOrderByPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));			
			
			this.jButtonNuevoRelacionesPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));			
			this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaModificarPagosAutorizadosProceso && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizadosProceso && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizadosProceso && this.isPermisoEliminarPagosAutorizadosProceso));
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizadosProceso);							
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));			
			
			}
						
			this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));						
			this.jButtonDuplicarToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso && this.isPermisoDuplicarPagosAutorizadosProceso));						
			this.jButtonCopiarToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizadosProceso && this.isPermisoCopiarPagosAutorizadosProceso));			
			this.jButtonVerFormToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizadosProceso && this.isPermisoVerFormPagosAutorizadosProceso));			
			this.jButtonAbrirOrderByToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));
			this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));			
			this.jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));			
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaModificarPagosAutorizadosProceso && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizadosProceso  && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizadosProceso && this.isPermisoEliminarPagosAutorizadosProceso));
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarToolBarPagosAutorizadosProceso.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizadosProceso);				
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));			
			this.jMenuItemDuplicarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso && this.isPermisoDuplicarPagosAutorizadosProceso));			
			this.jMenuItemCopiarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizadosProceso && this.isPermisoCopiarPagosAutorizadosProceso));			
			this.jMenuItemVerFormPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizadosProceso && this.isPermisoVerFormPagosAutorizadosProceso));			
			this.jMenuItemAbrirOrderByPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));			
			//this.jMenuItemMostrarOcultarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));
			this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));			
			//this.jMenuItemDetalleMostrarOcultarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizadosProceso && this.isPermisoOrdenPagosAutorizadosProceso));			
			this.jMenuItemNuevoRelacionesPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso));			
			this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizadosProceso && this.isPermisoNuevoPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));									
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemModificarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaModificarPagosAutorizadosProceso && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemActualizarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizadosProceso && this.isPermisoActualizarPagosAutorizadosProceso));	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemEliminarPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizadosProceso && this.isPermisoEliminarPagosAutorizadosProceso));
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemCancelarPagosAutorizadosProceso.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizadosProceso);				
			}
			
			this.jMenuItemGuardarCambiosPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));						
			this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=this.jButtonNuevoPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso=this.jButtonDuplicarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaCopiarPagosAutorizadosProceso=this.jButtonCopiarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaVerFormPagosAutorizadosProceso=this.jButtonVerFormPagosAutorizadosProceso.isVisible();
			
			this.isVisibilidadCeldaOrdenPagosAutorizadosProceso=this.jButtonAbrirOrderByPagosAutorizadosProceso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=this.jButtonNuevoRelacionesPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=this.jButtonModificarPagosAutorizadosProceso.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=this.jButtonNuevoToolBarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarToolBarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarToolBarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarToolBarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarToolBarPagosAutorizadosProceso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=this.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=this.jMenuItemNuevoPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=this.jMenuItemNuevoRelacionesPagosAutorizadosProceso.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemModificarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemActualizarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemEliminarPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemCancelarPagosAutorizadosProceso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=this.jMenuItemGuardarCambiosPagosAutorizadosProceso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPagosAutorizadosProceso(Boolean esInicializar) {
		if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
				//if(this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutorizadosProceso();
			}
			
			this.inicializarActualizarBindingBotonesManualPagosAutorizadosProceso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPagosAutorizadosProceso() {
		this.jButtonNuevoPagosAutorizadosProceso.setVisible(this.isPermisoNuevoPagosAutorizadosProceso);			
		this.jButtonDuplicarPagosAutorizadosProceso.setVisible(this.isPermisoDuplicarPagosAutorizadosProceso);			
		this.jButtonCopiarPagosAutorizadosProceso.setVisible(this.isPermisoCopiarPagosAutorizadosProceso);			
		this.jButtonVerFormPagosAutorizadosProceso.setVisible(this.isPermisoVerFormPagosAutorizadosProceso);			
		
		this.jButtonAbrirOrderByPagosAutorizadosProceso.setVisible(this.isPermisoOrdenPagosAutorizadosProceso);					
		
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.setVisible(this.isPermisoNuevoPagosAutorizadosProceso);			
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarPagosAutorizadosProceso.setVisible(this.isPermisoActualizarPagosAutorizadosProceso);	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.setVisible(this.isPermisoActualizarPagosAutorizadosProceso);	
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.setVisible(this.isPermisoEliminarPagosAutorizadosProceso);
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizadosProceso);						
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.setVisible(this.isPermisoGuardarCambiosPagosAutorizadosProceso);							
		}
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setVisible(this.isPermisoActualizarPagosAutorizadosProceso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutorizadosProceso() {
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarPagosAutorizadosProceso.setVisible(this.isPermisoActualizarPagosAutorizadosProceso);	
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.setVisible(this.isPermisoActualizarPagosAutorizadosProceso);	
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.setVisible(this.isPermisoEliminarPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizadosProceso);							
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizadosProceso && this.isPermisoGuardarCambiosPagosAutorizadosProceso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPagosAutorizadosProceso() {
		if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPagosAutorizadosProceso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPagosAutorizadosProceso() {
	}
	
	public void jTableDatosPagosAutorizadosProcesoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPagosAutorizadosProceso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pagosautorizadosproceso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPagosAutorizadosProcesoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPagosAutorizadosProceso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosAutorizadosProceso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pagosautorizadosprocesoLogic.getConnexion());

				if(this.pagosautorizadosproceso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pagosautorizadosproceso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosAutorizadosProceso=(TitledBorder)this.jScrollPanelDatosPagosAutorizadosProceso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPagosAutorizadosProceso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pagosautorizadosproceso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPagosAutorizadosProcesoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPagosAutorizadosProceso(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosAutorizadosProceso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.pagosautorizadosprocesoLogic.getConnexion());

				if(this.pagosautorizadosproceso.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.pagosautorizadosproceso.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosAutorizadosProceso=(TitledBorder)this.jScrollPanelDatosPagosAutorizadosProceso.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPagosAutorizadosProceso.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.pagosautorizadosproceso.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPagosAutorizadosProcesoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPagosAutorizadosProceso(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosAutorizadosProceso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosAutorizadosProceso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.pagosautorizadosprocesoLogic.getConnexion());

				if(this.pagosautorizadosproceso.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.pagosautorizadosproceso.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosAutorizadosProceso=(TitledBorder)this.jScrollPanelDatosPagosAutorizadosProceso.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPagosAutorizadosProceso.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.pagosautorizadosproceso.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getnombre_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_documento like '%"+this.pagosautorizadosproceso.getnombre_tipo_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.pagosautorizadosproceso.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.pagosautorizadosproceso.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.pagosautorizadosproceso.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.pagosautorizadosproceso.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_movimiento_modulo like '%"+this.pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.pagosautorizadosproceso.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.pagosautorizadosproceso.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getcodigo_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_banco like '%"+this.pagosautorizadosproceso.getcodigo_cuenta_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequePagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.pagosautorizadosproceso.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.getpagosautorizadosproceso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizadosproceso==null) {
						this.pagosautorizadosproceso = new PagosAutorizadosProceso();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);
				}

				if(this.pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario_detalle_cheque_girado like '%"+this.pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizadosProceso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);

			this.getPagosAutorizadosProcesosBusquedaPagosAutorizadosProceso();

			this.inicializarActualizarBindingPagosAutorizadosProceso(false);

			//if(PagosAutorizadosProcesoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);

			this.getPagosAutorizadosProcesosFK_IdEjercicio();

			this.inicializarActualizarBindingPagosAutorizadosProceso(false);

			//if(PagosAutorizadosProcesoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);

			this.getPagosAutorizadosProcesosFK_IdEmpresa();

			this.inicializarActualizarBindingPagosAutorizadosProceso(false);

			//if(PagosAutorizadosProcesoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPagosAutorizadosProcesoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);

			this.getPagosAutorizadosProcesosFK_IdSucursal();

			this.inicializarActualizarBindingPagosAutorizadosProceso(false);

			//if(PagosAutorizadosProcesoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosprocesoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePagosAutorizadosProceso() {
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.setVisible(false);	    			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.dispose();
			this.jInternalFrameDetalleFormPagosAutorizadosProceso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
			this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.dispose();
			this.jInternalFrameReporteDinamicoPagosAutorizadosProceso=null;
		}
		
		if(this.jInternalFrameImportacionPagosAutorizadosProceso!=null) {
			this.jInternalFrameImportacionPagosAutorizadosProceso.setVisible(false);	    			
			this.jInternalFrameImportacionPagosAutorizadosProceso.dispose();
			this.jInternalFrameImportacionPagosAutorizadosProceso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPagosAutorizadosProceso();
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPagosAutorizadosProceso")) {
				jButtonDuplicarPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPagosAutorizadosProceso")) {
				jButtonCopiarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPagosAutorizadosProceso")) {
				jButtonVerFormPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPagosAutorizadosProceso")) {
				jButtonDuplicarPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPagosAutorizadosProceso")) {
				jButtonDuplicarPagosAutorizadosProcesoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPagosAutorizadosProceso")) {
				jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPagosAutorizadosProceso")) {
				jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPagosAutorizadosProceso")) {
				jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPagosAutorizadosProceso")) {
				jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPagosAutorizadosProceso")) {
				jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPagosAutorizadosProceso")) {
				jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPagosAutorizadosProceso")) {
				jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPagosAutorizadosProceso")) {
				jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPagosAutorizadosProceso")) {
				jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPagosAutorizadosProceso")) {
				jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPagosAutorizadosProceso")) {
				jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPagosAutorizadosProceso")) {
				jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPagosAutorizadosProceso")) {
				jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPagosAutorizadosProceso")) {
				jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPagosAutorizadosProceso")) {
				jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPagosAutorizadosProceso")) {
				jButtonMostrarOcultarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPagosAutorizadosProceso")) {
				jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPagosAutorizadosProceso")) {
				jButtonCopiarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPagosAutorizadosProceso")) {
				jButtonVerFormPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPagosAutorizadosProceso")) {
				jButtonCopiarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPagosAutorizadosProceso")) {
				jButtonVerFormPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPagosAutorizadosProceso")) {
				jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPagosAutorizadosProceso")) {
				jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPagosAutorizadosProceso")) {
				jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPagosAutorizadosProceso")) {
				jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPagosAutorizadosProceso")) {
				jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePagosAutorizadosProceso")) {
				jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPagosAutorizadosProceso")) {
				jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPagosAutorizadosProceso")) {
				jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPagosAutorizadosProceso")) {
				jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPagosAutorizadosProceso") || sTipo.equals("MenuItemDetalleAbrirOrderByPagosAutorizadosProceso")) {
				jButtonAbrirOrderByPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPagosAutorizadosProceso") || sTipo.equals("MenuItemDetalleMostrarOcultarPagosAutorizadosProceso")) {
				jButtonMostrarOcultarPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutorizadosProceso")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPagosAutorizadosProceso")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPagosAutorizadosProceso")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPagosAutorizadosProceso")) {
				jButtonCerrarReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPagosAutorizadosProceso")) {
				jButtonGenerarReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPagosAutorizadosProceso")) {
				
				jButtonGenerarExcelReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPagosAutorizadosProceso")) {
				jButtonCerrarImportacionPagosAutorizadosProcesoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPagosAutorizadosProceso")) {
				
				jButtonGenerarImportacionPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPagosAutorizadosProceso")) {
				
				jButtonAbrirImportacionPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPagosAutorizadosProceso")) {
				jComboBoxTiposAccionesPagosAutorizadosProcesoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPagosAutorizadosProceso")) {
				jComboBoxTiposRelacionesPagosAutorizadosProcesoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPagosAutorizadosProceso")) {
				jComboBoxTiposAccionesPagosAutorizadosProcesoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPagosAutorizadosProceso")) {
				
				jComboBoxTiposSeleccionarPagosAutorizadosProcesoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPagosAutorizadosProceso")) {
				jTextFieldValorCampoGeneralPagosAutorizadosProcesoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPagosAutorizadosProceso")) {
				jButtonAbrirOrderByPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPagosAutorizadosProceso")) {
				jButtonAbrirOrderByPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPagosAutorizadosProceso")) {
				jButtonCerrarOrderByPagosAutorizadosProcesoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutorizadosProcesoBusqueda")) {
				this.jButtonidPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_empresaPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_empresaPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_sucursalPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_sucursalPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_ejercicioPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_ejercicioPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_documentoPagosAutorizadosProcesoBusqueda")) {
				this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioPagosAutorizadosProcesoBusqueda")) {
				this.jButtonbeneficiarioPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPagosAutorizadosProcesoBusqueda")) {
				this.jButtonfechaPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutorizadosProcesoBusqueda")) {
				this.jButtonfecha_emisionPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorPagosAutorizadosProcesoBusqueda")) {
				this.jButtonnumero_mayorPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPagosAutorizadosProcesoBusqueda")) {
				this.jButtonvalorPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequePagosAutorizadosProcesoBusqueda")) {
				this.jButtonnumero_chequePagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda")) {
				this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPagosAutorizadosProcesoPagosAutorizadosProceso")) {
				this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProcesoActionPerformed(evt);
			}
			
			;
			
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPagosAutorizadosProceso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PagosAutorizadosProceso pagosautorizadosprocesoLocal=null;
			
			if(!this.getEsControlTabla()) {
				pagosautorizadosprocesoLocal=this.pagosautorizadosproceso;
			} else {
				pagosautorizadosprocesoLocal=this.pagosautorizadosprocesoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
							
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
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
			
			


			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
								
						
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
								
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
							
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
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
			
			


			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
								
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPagosAutorizadosProceso")) {
					jCheckBoxSeleccionarTodosPagosAutorizadosProcesoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPagosAutorizadosProceso")) {
					jCheckBoxSeleccionadosPagosAutorizadosProcesoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPagosAutorizadosProceso")) {
					
				}
				
				


				
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
												
				
				


				
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
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
			
			


			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizadosproceso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizadosproceso);
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
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
				
				


				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizadosProceso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizadosProceso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosProcesoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosprocesoAnterior =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPagosAutorizadosProceso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPagosAutorizadosProcesoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPagosAutorizadosProceso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pagosautorizadosproceso =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pagosautorizadosproceso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPagosAutorizadosProceso")) {
				
				}
				
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPagosAutorizadosProceso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPagosAutorizadosProceso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPagosAutorizadosProceso")) {
			
			}
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPagosAutorizadosProceso();
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			if(sTipo.equals("NuevoPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPagosAutorizadosProceso")) {
				jButtonDuplicarPagosAutorizadosProcesoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPagosAutorizadosProceso")) {
				jButtonCopiarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPagosAutorizadosProceso")) {
				jButtonVerFormPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPagosAutorizadosProceso")) {
				jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPagosAutorizadosProceso")) {
				jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPagosAutorizadosProceso")) {
				jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPagosAutorizadosProceso")) {
				jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPagosAutorizadosProceso")) {
				jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPagosAutorizadosProceso")) {
				jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPagosAutorizadosProceso")) {
				jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutorizadosProceso")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPagosAutorizadosProceso")) {
				jButtonAbrirOrderByPagosAutorizadosProcesoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPagosAutorizadosProceso")) {
				jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPagosAutorizadosProceso")) {
				jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPagosAutorizadosProceso")) {
				jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutorizadosProcesoBusqueda")) {
				this.jButtonidPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_empresaPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_empresaPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_sucursalPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_sucursalPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPagosAutorizadosProcesoUpdate")) {
				this.jButtonid_ejercicioPagosAutorizadosProcesoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPagosAutorizadosProcesoBusqueda")) {
				this.jButtonid_ejercicioPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_documentoPagosAutorizadosProcesoBusqueda")) {
				this.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioPagosAutorizadosProcesoBusqueda")) {
				this.jButtonbeneficiarioPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPagosAutorizadosProcesoBusqueda")) {
				this.jButtonfechaPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutorizadosProcesoBusqueda")) {
				this.jButtonfecha_emisionPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorPagosAutorizadosProcesoBusqueda")) {
				this.jButtonnumero_mayorPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPagosAutorizadosProcesoBusqueda")) {
				this.jButtonvalorPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda")) {
				this.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequePagosAutorizadosProcesoBusqueda")) {
				this.jButtonnumero_chequePagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda")) {
				this.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusquedaActionPerformed(evt);
			}
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPagosAutorizadosProceso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePagosAutorizadosProceso")) {
				closingInternalFramePagosAutorizadosProceso();
				
			} else if(sTipo.equals("jButtonCancelarPagosAutorizadosProceso")) {
				JInternalFrameBase jInternalFrameDetalleFormPagosAutorizadosProceso = (JInternalFrameBase)evt.getSource();
	            	
	            PagosAutorizadosProcesoBeanSwingJInternalFrame jInternalFrameParent=(PagosAutorizadosProcesoBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutorizadosProceso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPagosAutorizadosProcesoActionPerformed(null);
			}
			
			PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautorizadosproceso,new Object(),this.pagosautorizadosprocesoParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPagosAutorizadosProceso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPagosAutorizadosProceso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPagosAutorizadosProceso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pagosautorizadosproceso)) {
			if(!esControlTabla) {
				if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);			
				}
				
				if(this.pagosautorizadosprocesoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral,this.pagosautorizadosprocesoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pagosautorizadosprocesoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutorizadosProceso(classes,this.pagosautorizadosprocesoReturnGeneral,this.pagosautorizadosprocesoBean,false);
					}
						
					if(this.pagosautorizadosprocesoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso());	
					}
						
					if(this.pagosautorizadosprocesoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso(),classes);//this.pagosautorizadosprocesoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizadosProceso(this.pagosautorizadosproceso,classes);//this.pagosautorizadosprocesoBean);									
				}
			
				if(PagosAutorizadosProcesoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPagosAutorizadosProceso(this.pagosautorizadosproceso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizadosProceso(this.pagosautorizadosproceso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pagosautorizadosprocesoAnterior!=null) {
						this.pagosautorizadosproceso=this.pagosautorizadosprocesoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pagosautorizadosprocesoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso(),pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProceso(),this.pagosautorizadosprocesos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPagosAutorizadosProceso.repaint();
				
				//((AbstractTableModel) this.jTableDatosPagosAutorizadosProceso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPagosAutorizadosProceso();
			}
		}
	}
	
	public void actualizarVisualTableDatosPagosAutorizadosProceso() throws Exception {
		
		PagosAutorizadosProcesoModel pagosautorizadosprocesoModel=(PagosAutorizadosProcesoModel)this.jTableDatosPagosAutorizadosProceso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizadosprocesoModel.pagosautorizadosprocesos=this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pagosautorizadosprocesoModel.pagosautorizadosprocesos=this.pagosautorizadosprocesos;
		}
		
		
		((PagosAutorizadosProcesoModel) this.jTableDatosPagosAutorizadosProceso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPagosAutorizadosProceso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpagosautorizadosprocesoAnterior(),this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpagosautorizadosprocesoAnterior(),this.pagosautorizadosprocesos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPagosAutorizadosProceso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
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
										
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautorizadosproceso,new Object(),generalEntityParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PagosAutorizadosProcesoConstantesFunciones.getClassesRelationshipsOfPagosAutorizadosProceso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PagosAutorizadosProcesoConstantesFunciones.getClassesRelationshipsFromStringsOfPagosAutorizadosProceso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPagosAutorizadosProceso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautorizadosproceso,new Object(),generalEntityParameterGeneral,this.pagosautorizadosprocesoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPagosAutorizadosProceso(PagosAutorizadosProcesoBean pagosautorizadosprocesoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutorizadosProceso(ArrayList<Classe> classes,PagosAutorizadosProcesoReturnGeneral pagosautorizadosprocesoReturnGeneral,PagosAutorizadosProcesoBean pagosautorizadosprocesoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pagosautorizadosproceso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso = new PagosAutorizadosProcesoDetalleFormJInternalFrame(jDesktopPane,this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones(),this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.setVisible(false);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.setSelected(false);						
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.pagosautorizadosprocesoLogic=this.pagosautorizadosprocesoLogic;
		
		this.cargarCombosFrameForeignKeyPagosAutorizadosProceso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutorizadosProceso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutorizadosProceso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPagosAutorizadosProceso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPagosAutorizadosProceso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutorizadosProceso"));
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ModificarPagosAutorizadosProceso"));

		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutorizadosProceso"));
					
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemModificarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutorizadosProceso"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutorizadosProceso"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutorizadosProceso"));
						
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemActualizarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutorizadosProceso"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"EliminarPagosAutorizadosProceso"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutorizadosProceso"));
								
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemEliminarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutorizadosProceso"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CancelarPagosAutorizadosProceso"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutorizadosProceso"));
					
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemCancelarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutorizadosProceso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemDetalleCerrarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutorizadosProceso"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizadosProceso"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizadosProceso"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutorizadosProceso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonidPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_documentoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfechaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonvalorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequePagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutorizadosProceso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePagosAutorizadosProceso"));
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutorizadosProceso"));
		}
		
		this.jTableDatosPagosAutorizadosProceso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPagosAutorizadosProceso"));
		
		this.jTableDatosPagosAutorizadosProceso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPagosAutorizadosProceso"));
		
		this.jButtonNuevoPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"NuevoPagosAutorizadosProceso"));
		
		this.jButtonDuplicarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"DuplicarPagosAutorizadosProceso"));
		
		this.jButtonCopiarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"CopiarPagosAutorizadosProceso"));
		
		this.jButtonVerFormPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"VerFormPagosAutorizadosProceso"));
		
		
		this.jButtonNuevoToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"NuevoToolBarPagosAutorizadosProceso"));
			
		this.jButtonDuplicarToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemNuevoPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPagosAutorizadosProceso"));
			
		this.jMenuItemDuplicarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPagosAutorizadosProceso"));		
		
		
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPagosAutorizadosProceso"));
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemNuevoRelacionesPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPagosAutorizadosProceso"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ModificarPagosAutorizadosProceso"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonModificarToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutorizadosProceso"));
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemModificarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutorizadosProceso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutorizadosProceso"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonActualizarToolBarPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutorizadosProceso"));
				
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemActualizarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutorizadosProceso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"EliminarPagosAutorizadosProceso"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonEliminarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutorizadosProceso"));
						
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemEliminarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutorizadosProceso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CancelarPagosAutorizadosProceso"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonCancelarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutorizadosProceso"));
			
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemCancelarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutorizadosProceso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPagosAutorizadosProceso"));		
		
		
		this.jButtonCerrarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CerrarPagosAutorizadosProceso"));
		
		
		this.jButtonCerrarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CerrarToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemCerrarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPagosAutorizadosProceso"));
			
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jMenuItemDetalleCerrarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutorizadosProceso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosPagosAutorizadosProceso"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizadosProceso"));
		}
		
		this.jButtonCopiarToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CopiarToolBarPagosAutorizadosProceso"));
			
		this.jButtonVerFormToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"VerFormToolBarPagosAutorizadosProceso"));
		
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPagosAutorizadosProceso"));
			
		this.jMenuItemCopiarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPagosAutorizadosProceso"));		
		
		this.jMenuItemVerFormPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPagosAutorizadosProceso"));		
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutorizadosProceso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutorizadosProceso"));		
		
		
		
		this.jButtonRecargarInformacionPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"RecargarInformacionPagosAutorizadosProceso"));
					
		this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPagosAutorizadosProceso"));
		
		this.jMenuItemRecargarInformacionPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPagosAutorizadosProceso"));		
		
		
		
		this.jButtonAnterioresPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"AnterioresPagosAutorizadosProceso"));
		
		
		this.jButtonAnterioresToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPagosAutorizadosProceso"));
		
		this.jMenuItemAnterioresPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPagosAutorizadosProceso"));		
		
		
		this.jButtonSiguientesPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"SiguientesPagosAutorizadosProceso"));
		
		
		this.jButtonSiguientesToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemSiguientesPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPagosAutorizadosProceso"));
			
		this.jMenuItemAbrirOrderByPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPagosAutorizadosProceso"));
			
		this.jMenuItemMostrarOcultarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPagosAutorizadosProceso"));
			
		this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPagosAutorizadosProceso"));
			
		this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPagosAutorizadosProceso"));		
		
		
		this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPagosAutorizadosProceso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPagosAutorizadosProceso"));
			
		this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPagosAutorizadosProceso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPagosAutorizadosProceso"));

		this.jCheckBoxSeleccionadosPagosAutorizadosProceso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPagosAutorizadosProceso"));
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutorizadosProceso"));
		}
		
		
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"TiposRelacionesPagosAutorizadosProceso"));
			
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"TiposAccionesPagosAutorizadosProceso"));
					
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPagosAutorizadosProceso"));
			
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPagosAutorizadosProceso"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonidPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_documentoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfechaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonvalorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequePagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutorizadosProcesoPagosAutorizadosProceso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizadosProceso!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizadosProceso"));
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizadosProceso"));
				this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizadosProceso"));
			}
			
			//this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizadosProceso"));				
			//this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizadosProceso"));
			//this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizadosProceso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPagosAutorizadosProceso!=null) {
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutorizadosProceso"));
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutorizadosProceso"));
				this.jInternalFrameImportacionPagosAutorizadosProceso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutorizadosProceso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"AbrirOrderByPagosAutorizadosProceso"));
			
			this.jButtonAbrirOrderByToolBarPagosAutorizadosProceso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPagosAutorizadosProceso"));			
			
			if(this.jInternalFrameOrderByPagosAutorizadosProceso!=null) {
				this.jInternalFrameOrderByPagosAutorizadosProceso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutorizadosProceso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTabbedPaneRelacionesPagosAutorizadosProceso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutorizadosProceso"));
		
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
            		closingInternalFramePagosAutorizadosProceso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPagosAutorizadosProceso = (JInternalFrameBase)event.getSource();
	            	
	            PagosAutorizadosProcesoBeanSwingJInternalFrame jInternalFrameParent=(PagosAutorizadosProcesoBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutorizadosProceso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPagosAutorizadosProcesoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPagosAutorizadosProceso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPagosAutorizadosProcesoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPagosAutorizadosProceso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPagosAutorizadosProceso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoRelacionesPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutorizadosProcesoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPagosAutorizadosProceso";
		inputMap = this.jButtonModificarPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPagosAutorizadosProceso";
		inputMap = this.jButtonActualizarPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPagosAutorizadosProceso";
		inputMap = this.jButtonEliminarPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPagosAutorizadosProceso";
		inputMap = this.jButtonCancelarPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPagosAutorizadosProceso";
		inputMap = this.jButtonCerrarPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPagosAutorizadosProceso";
		inputMap = this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonGuardarCambiosPagosAutorizadosProceso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPagosAutorizadosProcesoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPagosAutorizadosProceso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPagosAutorizadosProcesoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPagosAutorizadosProcesoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPagosAutorizadosProcesoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonidPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_empresaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_sucursalPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPagosAutorizadosProcesoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonid_ejercicioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnombre_tipo_documentoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_documentoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiarioPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfechaPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonfecha_emisionPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimiento_moduloPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_mayorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonvalorPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"valorPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtoncodigo_cuenta_bancoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_bancoPagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonnumero_chequePagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequePagosAutorizadosProcesoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jButtonbeneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_detalle_cheque_giradoPagosAutorizadosProcesoBusqueda"));
		
		
		this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutorizadosProcesoPagosAutorizadosProceso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPagosAutorizadosProceso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPagosAutorizadosProcesoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPagosAutorizadosProcesoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPagosAutorizadosProceso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
					pagosautorizadosprocesoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesos) {
					pagosautorizadosprocesoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPagosAutorizadosProcesoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
						pagosautorizadosprocesoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesos) {
						pagosautorizadosprocesoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutorizadosProceso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutorizadosProceso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPagosAutorizadosProcesoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPagosAutorizadosProceso.getSelectedRows();
			
			PagosAutorizadosProceso pagosautorizadosprocesoLocal=new PagosAutorizadosProceso();
			
			//this.seleccionarTodosPagosAutorizadosProceso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pagosautorizadosprocesoLocal =(PagosAutorizadosProceso) this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pagosautorizadosprocesoLocal =(PagosAutorizadosProceso) this.pagosautorizadosprocesos.toArray()[this.jTableDatosPagosAutorizadosProceso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pagosautorizadosprocesoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
						pagosautorizadosprocesoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesos) {
						pagosautorizadosprocesoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutorizadosProceso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutorizadosProceso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosProceso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPagosAutorizadosProcesoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPagosAutorizadosProcesoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPagosAutorizadosProcesoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
				
						if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO)) {
							existe=true;
							pagosautorizadosprocesoAux.setnombre_tipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							pagosautorizadosprocesoAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pagosautorizadosprocesoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautorizadosprocesoAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo_tipo_movimiento_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							pagosautorizadosprocesoAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							pagosautorizadosprocesoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo_cuenta_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							pagosautorizadosprocesoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO)) {
							existe=true;
							pagosautorizadosprocesoAux.setbeneficiario_detalle_cheque_girado(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesos) {
					
						if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO)) {
							existe=true;
							pagosautorizadosprocesoAux.setnombre_tipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							pagosautorizadosprocesoAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pagosautorizadosprocesoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautorizadosprocesoAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo_tipo_movimiento_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							pagosautorizadosprocesoAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							pagosautorizadosprocesoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO)) {
							existe=true;
							pagosautorizadosprocesoAux.setcodigo_cuenta_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							pagosautorizadosprocesoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO)) {
							existe=true;
							pagosautorizadosprocesoAux.setbeneficiario_detalle_cheque_girado(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPagosAutorizadosProcesoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPagosAutorizadosProceso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPagosAutorizadosProceso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePagosAutorizadosProceso) {				
					conSplash=true;//false;										
					
					//this.startProcessPagosAutorizadosProceso(conSplash);
				
					this.generarReportePagosAutorizadosProcesosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPagosAutorizadosProcesosSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutorizadosProcesosSeleccionados(false);
				//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutorizadosProcesosSeleccionados(true);
				//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutorizadosProceso();
				
				this.exportarPagosAutorizadosProcesosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPagosAutorizadosProcesos();
				//this.importarPagosAutorizadosProcesos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutorizadosProceso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPagosAutorizadosProcesosSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pagos Autorizados Proceso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPagosAutorizadosProceso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPagosAutorizadosProceso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPagosAutorizadosProceso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
				}	
			} 			
			else if(PagosAutorizadosProcesoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePagosAutorizadosProceso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPagosAutorizadosProceso(conSplash);
					
						//this.actualizarParametrosGeneralPagosAutorizadosProceso();
						
						this.generarReporteProcesoAccionPagosAutorizadosProcesosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pagos Autorizados ProcesoS SELECCIONADOS?", "MANTENIMIENTO DE Pagos Autorizados Proceso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPagosAutorizadosProceso();
				
						this.actualizarParametrosGeneralPagosAutorizadosProceso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pagosautorizadosprocesoReturnGeneral=pagosautorizadosprocesoLogic.procesarAccionPagosAutorizadosProcesosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos(),this.pagosautorizadosprocesoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPagosAutorizadosProcesoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPagosAutorizadosProceso();
					
					PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPagosAutorizadosProcesoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutorizadosProceso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxTiposAccionesFormularioPagosAutorizadosProceso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPagosAutorizadosProceso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPagosAutorizadosProcesoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPagosAutorizadosProceso();
			
			if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
			PagosAutorizadosProceso pagosautorizadosproceso=new PagosAutorizadosProceso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPagosAutorizadosProceso.getSelectedItem();
			
			
			
			
			pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
			//this.sTipoAccion;
			
			if(pagosautorizadosprocesosSeleccionados.size()==1) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
					pagosautorizadosproceso=pagosautorizadosprocesoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPagosAutorizadosProceso();
			
      		//this.finishProcessPagosAutorizadosProceso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPagosAutorizadosProcesoReturnGeneral() throws Exception {
		if(this.pagosautorizadosprocesoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pagosautorizadosprocesoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pagosautorizadosprocesoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pagosautorizadosprocesoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pagosautorizadosprocesoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pagosautorizadosprocesoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
		}
		
		if(this.pagosautorizadosprocesoReturnGeneral.getConRetornoLista() || this.pagosautorizadosprocesoReturnGeneral.getConRetornoObjeto()) {
			if(this.pagosautorizadosprocesoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pagosautorizadosprocesoLogic.setPagosAutorizadosProcesos(this.pagosautorizadosprocesoReturnGeneral.getPagosAutorizadosProcesos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPagosAutorizadosProceso(false);
		}
	}
	
	public void actualizarParametrosGeneralPagosAutorizadosProceso() throws Exception {
		
		
	}
	
	public ArrayList<PagosAutorizadosProceso> getPagosAutorizadosProcesosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPagosAutorizadosProceso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos()) {
					if(pagosautorizadosprocesoAux.getIsSelected()) {
						pagosautorizadosprocesosSeleccionados.add(pagosautorizadosprocesoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizadosProceso pagosautorizadosprocesoAux:this.pagosautorizadosprocesos) {
					if(pagosautorizadosprocesoAux.getIsSelected()) {
						pagosautorizadosprocesosSeleccionados.add(pagosautorizadosprocesoAux);				
					}
				}
			}
			
			if(pagosautorizadosprocesosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pagosautorizadosprocesosSeleccionados.addAll(this.pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pagosautorizadosprocesosSeleccionados.addAll(this.pagosautorizadosprocesos);				
					}
				}
			}
		} else {
			pagosautorizadosprocesosSeleccionados.add(this.pagosautorizadosproceso);
		}
		
		return pagosautorizadosprocesosSeleccionados;
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
	
	public void generarReportePagosAutorizadosProcesosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPagosAutorizadosProcesosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPagosAutorizadosProcesosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutorizadosProcesosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutorizadosProcesosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pagos Autorizados Proceso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados);
		
	}	
	
	public void generarReporteNormalPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPagosAutorizadosProcesosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPagosAutorizadosProceso();
		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPagosAutorizadosProceso();
		
		
		//this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados ,pagosautorizadosprocesoImplementable,pagosautorizadosprocesoImplementableHome);
	}
	
	public void mostrarImportacionPagosAutorizadosProcesos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPagosAutorizadosProceso();
		
		this.abrirFrameImportacionPagosAutorizadosProceso();		
		
			
		//this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados ,pagosautorizadosprocesoImplementable,pagosautorizadosprocesoImplementableHome);
	}
	
	public void importarPagosAutorizadosProcesos() throws Exception {		
	
	}
	
	public void exportarPagosAutorizadosProcesosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPagosAutorizadosProcesosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPagosAutorizadosProcesosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPagosAutorizadosProcesosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pagos Autorizados Proceso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPagosAutorizadosProceso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPagosAutorizadosProceso(pagosautorizadosprocesoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pagosautorizadosprocesoAux.setsDetalleGeneralEntityReporte(pagosautorizadosprocesoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPagosAutorizadosProceso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pagosautorizadosproceso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getnombre_tipo_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getcodigo_cuenta_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PagosAutorizadosProcesos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPagosAutorizadosProceso(row);				
				iRow++;
			}				
			
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPagosAutorizadosProceso(pagosautorizadosprocesoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPagosAutorizadosProcesosSeleccionados() throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();		
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizadosproceso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pagosautorizadosprocesos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pagosautorizadosproceso");
			//elementRoot.appendChild(element);
		
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
				element = document.createElement("pagosautorizadosproceso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPagosAutorizadosProceso(pagosautorizadosprocesoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados Proceso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPagosAutorizadosProceso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getnombre_tipo_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getcodigo_cuenta_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado());				
	}
	
	public void setFilaDatosExportarXmlPagosAutorizadosProceso(PagosAutorizadosProceso pagosautorizadosproceso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PagosAutorizadosProcesoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pagosautorizadosproceso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PagosAutorizadosProcesoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pagosautorizadosproceso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PagosAutorizadosProcesoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pagosautorizadosproceso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PagosAutorizadosProcesoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(pagosautorizadosproceso.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PagosAutorizadosProcesoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(pagosautorizadosproceso.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementnombre_tipo_documento = document.createElement(PagosAutorizadosProcesoConstantesFunciones.NOMBRETIPODOCUMENTO);
		elementnombre_tipo_documento.appendChild(document.createTextNode(pagosautorizadosproceso.getnombre_tipo_documento().trim()));
		element.appendChild(elementnombre_tipo_documento);

		Element elementcodigo = document.createElement(PagosAutorizadosProcesoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(pagosautorizadosproceso.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementbeneficiario = document.createElement(PagosAutorizadosProcesoConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(pagosautorizadosproceso.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementfecha = document.createElement(PagosAutorizadosProcesoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(pagosautorizadosproceso.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_emision = document.createElement(PagosAutorizadosProcesoConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(pagosautorizadosproceso.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementcodigo_tipo_movimiento_modulo = document.createElement(PagosAutorizadosProcesoConstantesFunciones.CODIGOTIPOMOVIMIENTOMODULO);
		elementcodigo_tipo_movimiento_modulo.appendChild(document.createTextNode(pagosautorizadosproceso.getcodigo_tipo_movimiento_modulo().trim()));
		element.appendChild(elementcodigo_tipo_movimiento_modulo);

		Element elementnumero_mayor = document.createElement(PagosAutorizadosProcesoConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(pagosautorizadosproceso.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementvalor = document.createElement(PagosAutorizadosProcesoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(pagosautorizadosproceso.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementcodigo_cuenta_banco = document.createElement(PagosAutorizadosProcesoConstantesFunciones.CODIGOCUENTABANCO);
		elementcodigo_cuenta_banco.appendChild(document.createTextNode(pagosautorizadosproceso.getcodigo_cuenta_banco().trim()));
		element.appendChild(elementcodigo_cuenta_banco);

		Element elementnumero_cheque = document.createElement(PagosAutorizadosProcesoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(pagosautorizadosproceso.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementbeneficiario_detalle_cheque_girado = document.createElement(PagosAutorizadosProcesoConstantesFunciones.BENEFICIARIODETALLECHEQUEGIRADO);
		elementbeneficiario_detalle_cheque_girado.appendChild(document.createTextNode(pagosautorizadosproceso.getbeneficiario_detalle_cheque_girado().trim()));
		element.appendChild(elementbeneficiario_detalle_cheque_girado);
	}
	
	public void generarReporteGroupGenericoPagosAutorizadosProcesosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados=new ArrayList<PagosAutorizadosProceso>();
		
		pagosautorizadosprocesosSeleccionados=this.getPagosAutorizadosProcesosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPagosAutorizadosProceso(pagosautorizadosprocesosSeleccionados);
		
		this.generarReportePagosAutorizadosProcesos("Todos",pagosautorizadosprocesosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPagosAutorizadosProceso(ArrayList<PagosAutorizadosProceso> pagosautorizadosprocesosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PagosAutorizadosProceso pagosautorizadosprocesoAux:pagosautorizadosprocesosSeleccionados) {
				pagosautorizadosprocesoAux.setsDetalleGeneralEntityReporte(pagosautorizadosprocesoAux.toString());
			
				if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NOMBRETIPODOCUMENTO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getnombre_tipo_documento());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosprocesoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosprocesoAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTOMODULO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getcodigo_tipo_movimiento_modulo());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_CODIGOCUENTABANCO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getcodigo_cuenta_banco());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosProcesoConstantesFunciones.LABEL_BENEFICIARIODETALLECHEQUEGIRADO)) {
					existe=true;
					pagosautorizadosprocesoAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosprocesoAux.getbeneficiario_detalle_cheque_girado());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosProcesoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPagosAutorizadosProceso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=true;
				this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=true;
				this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=true;
			}
			
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaModificarPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=true;
		} else {
			this.actualizarEstadoPanelsPagosAutorizadosProceso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPagosAutorizadosProceso=false;
			//this.isVisibilidadCeldaVerFormPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaDuplicarPagosAutorizadosProceso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
		} else {
			this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			if(!pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;												
			}
			
			this.jButtonCerrarPagosAutorizadosProceso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
		}
		
		if(!this.permiteMantenimiento(this.pagosautorizadosproceso)) {
			this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
			this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPagosAutorizadosProceso=false;
		this.isVisibilidadCeldaNuevoRelacionesPagosAutorizadosProceso=false;
		this.isVisibilidadCeldaGuardarCambiosPagosAutorizadosProceso=false;
		//this.isVisibilidadCeldaModificarPagosAutorizadosProceso=true;
		this.isVisibilidadCeldaActualizarPagosAutorizadosProceso=false;
		this.isVisibilidadCeldaEliminarPagosAutorizadosProceso=false;
		//this.isVisibilidadCeldaCancelarPagosAutorizadosProceso=true;			
		this.isVisibilidadCeldaGuardarPagosAutorizadosProceso=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutorizadosProceso() {
	}
	
	public void actualizarEstadoPanelsPagosAutorizadosProceso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizadosProceso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizadosProceso!=null) {
				this.jScrollPanelDatosPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizadosProceso!=null) {
				this.jPanelPaginacionPagosAutorizadosProceso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
					this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizadosProceso!=null) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPagosAutorizadosProceso!=null) {
				this.jPanelParametrosReportesPagosAutorizadosProceso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPagosAutorizadosProceso=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPagosAutorizadosProceso) {this.jTabbedPaneBusquedasPagosAutorizadosProceso.remove(jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPagosAutorizadosProceso=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPagosAutorizadosProceso) {this.jTabbedPaneBusquedasPagosAutorizadosProceso.remove(jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPagosAutorizadosProceso=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPagosAutorizadosProceso) {this.jTabbedPaneBusquedasPagosAutorizadosProceso.remove(jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);}
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
			
			this.inicializarActualizarBindingTablaPagosAutorizadosProceso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPagosAutorizadosProceso() {
		this.updateBorderResaltarBusquedasFormularioPagosAutorizadosProceso();
		this.updateVisibilidadBusquedasFormularioPagosAutorizadosProceso();
		this.updateHabilitarBusquedasFormularioPagosAutorizadosProceso();
	}
	
	public void updateBorderResaltarBusquedasFormularioPagosAutorizadosProceso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponents().length>0) {
	

		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso!=null) {
			index= this.jTabbedPaneBusquedasPagosAutorizadosProceso.indexOfComponent(this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponent(index);
				jPanel.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPagosAutorizadosProceso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutorizadosProceso.indexOfComponent(this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			if(!this.pagosautorizadosprocesoConstantesFunciones.mostrarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso && index>-1) {
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPagosAutorizadosProceso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutorizadosProceso.indexOfComponent(this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
				this.jTabbedPaneBusquedasPagosAutorizadosProceso.setEnabledAt(index,this.pagosautorizadosprocesoConstantesFunciones.activarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPagosAutorizadosProceso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPagosAutorizadosProceso")) {
			index= this.jTabbedPaneBusquedasPagosAutorizadosProceso.indexOfComponent(this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);

			this.jTabbedPaneBusquedasPagosAutorizadosProceso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizadosProceso.getComponent(index);

			this.pagosautorizadosprocesoConstantesFunciones.setResaltarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso(resaltar);

			jPanel.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPagosAutorizadosProceso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPagosAutorizadosProceso() throws Exception {

		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPagosAutorizadosProceso();
		this.updateVisibilidadResaltarControlesFormularioPagosAutorizadosProceso();
		this.updateHabilitarResaltarControlesFormularioPagosAutorizadosProceso();
		
	}
	
	public void updateBorderResaltarControlesFormularioPagosAutorizadosProceso() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltaridPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltaridPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_empresaPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_empresaPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_sucursalPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_sucursalPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_ejercicioPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarid_ejercicioPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarnombre_tipo_documentoPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarnombre_tipo_documentoPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigoPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigoPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiarioPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiarioPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarfechaPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarfechaPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarfecha_emisionPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarfecha_emisionPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_mayorPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_mayorPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarvalorPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarvalorPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_cuenta_bancoPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarcodigo_cuenta_bancoPagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_chequePagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarnumero_chequePagosAutorizadosProceso);}
		if(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso!=null && this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setBorder(this.pagosautorizadosprocesoConstantesFunciones.resaltarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPagosAutorizadosProceso() throws Exception {		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
	
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostraridPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelidPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostraridPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_empresaPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelid_empresaPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_empresaPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_sucursalPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelid_sucursalPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_sucursalPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_ejercicioPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelid_ejercicioPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarid_ejercicioPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnombre_tipo_documentoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelnombre_tipo_documentoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnombre_tipo_documentoPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelcodigoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigoPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiarioPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelbeneficiarioPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiarioPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarfechaPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelfechaPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarfechaPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarfecha_emisionPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelfecha_emisionPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarfecha_emisionPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_mayorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelnumero_mayorPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_mayorPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarvalorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelvalorPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarvalorPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_cuenta_bancoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelcodigo_cuenta_bancoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarcodigo_cuenta_bancoPagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_chequePagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelnumero_chequePagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarnumero_chequePagosAutorizadosProceso);
		//this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jPanelbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setVisible(this.pagosautorizadosprocesoConstantesFunciones.mostrarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPagosAutorizadosProceso() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizadosProceso!=null) {
	
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jLabelidPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activaridPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_empresaPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarid_empresaPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_sucursalPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarid_sucursalPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jComboBoxid_ejercicioPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarid_ejercicioPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanombre_tipo_documentoPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarnombre_tipo_documentoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigoPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarcodigoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiarioPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiarioPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfechaPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarfechaPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jDateChooserfecha_emisionPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarfecha_emisionPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldcodigo_tipo_movimiento_moduloPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_tipo_movimiento_moduloPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreanumero_mayorPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarnumero_mayorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldvalorPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarvalorPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreacodigo_cuenta_bancoPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarcodigo_cuenta_bancoPagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextFieldnumero_chequePagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarnumero_chequePagosAutorizadosProceso);
		this.jInternalFrameDetalleFormPagosAutorizadosProceso.jTextAreabeneficiario_detalle_cheque_giradoPagosAutorizadosProceso.setEnabled(this.pagosautorizadosprocesoConstantesFunciones.activarbeneficiario_detalle_cheque_giradoPagosAutorizadosProceso);
		}
	}
	
		
}