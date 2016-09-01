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

import com.bydan.erp.contabilidad.util.EstadoPeriodoConstantesFunciones;
import com.bydan.erp.contabilidad.util.EstadoPeriodoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.EstadoPeriodoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.EstadoPeriodoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class EstadoPeriodoBeanSwingJInternalFrame extends EstadoPeriodoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPeriodoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPeriodo> estadoperiodoValidator = new ClassValidator<EstadoPeriodo>(EstadoPeriodo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPeriodo estadoperiodo;	
	public EstadoPeriodo estadoperiodoAux;
	public EstadoPeriodo estadoperiodoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPeriodo estadoperiodoTotales;
	public Long idEstadoPeriodoActual;
	public Long iIdNuevoEstadoPeriodo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoPeriodo;
	public Boolean isPermisoNuevoEstadoPeriodo;
	public Boolean isPermisoActualizarEstadoPeriodo;
	public Boolean isPermisoActualizarOriginalEstadoPeriodo;
	public Boolean isPermisoEliminarEstadoPeriodo;
	public Boolean isPermisoGuardarCambiosEstadoPeriodo;
	public Boolean isPermisoConsultaEstadoPeriodo;
	public Boolean isPermisoBusquedaEstadoPeriodo;
	public Boolean isPermisoReporteEstadoPeriodo;
	public Boolean isPermisoPaginacionMedioEstadoPeriodo;
	public Boolean isPermisoPaginacionAltoEstadoPeriodo;
	public Boolean isPermisoPaginacionTodoEstadoPeriodo;
	public Boolean isPermisoCopiarEstadoPeriodo;
	public Boolean isPermisoVerFormEstadoPeriodo;
	public Boolean isPermisoDuplicarEstadoPeriodo;
	public Boolean isPermisoOrdenEstadoPeriodo;
	
	
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
	
	public EstadoPeriodoParameterReturnGeneral estadoperiodoReturnGeneral;
	public EstadoPeriodoParameterReturnGeneral estadoperiodoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPeriodo=false;
	public Boolean esParaAccionDesdeFormularioEstadoPeriodo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPeriodoLogic estadoperiodoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPeriodo estadoperiodoBean;
	public EstadoPeriodoConstantesFunciones estadoperiodoConstantesFunciones;
	//public EstadoPeriodoParameterReturnGeneral estadoperiodoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoPeriodo> estadoperiodos;	
	//public List<EstadoPeriodo> estadoperiodosEliminados;
	//public List<EstadoPeriodo> estadoperiodosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPeriodo=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPeriodo=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPeriodo=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPeriodo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaModificarEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPeriodo=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPeriodo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;	
	
	
	
	public Long getiIdNuevoEstadoPeriodo() {
		return this.iIdNuevoEstadoPeriodo;
	}

	public void setiIdNuevoEstadoPeriodo(Long iIdNuevoEstadoPeriodo) {
		this.iIdNuevoEstadoPeriodo = iIdNuevoEstadoPeriodo;
	}
	
	public Long getidEstadoPeriodoActual() {
		return this.idEstadoPeriodoActual;
	}

	public void setidEstadoPeriodoActual(Long idEstadoPeriodoActual) {
		this.idEstadoPeriodoActual = idEstadoPeriodoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPeriodo getestadoperiodo() {
		return this.estadoperiodo;
	}

	public void setestadoperiodo(EstadoPeriodo estadoperiodo) {
		this.estadoperiodo = estadoperiodo;
	}
	
	public EstadoPeriodo getestadoperiodoAux() {
		return this.estadoperiodoAux;
	}

	public void setestadoperiodoAux(EstadoPeriodo estadoperiodoAux) {
		this.estadoperiodoAux = estadoperiodoAux;
	}				
	
	public EstadoPeriodo getestadoperiodoAnterior() {
		return this.estadoperiodoAnterior;
	}

	public void setestadoperiodoAnterior(EstadoPeriodo estadoperiodoAnterior) {
		this.estadoperiodoAnterior = estadoperiodoAnterior;
	}	
	
	public EstadoPeriodo getestadoperiodoTotales() {
		return this.estadoperiodoTotales;
	}

	public void setestadoperiodoTotales(EstadoPeriodo estadoperiodoTotales) {
		this.estadoperiodoTotales = estadoperiodoTotales;
	}	
	
	public EstadoPeriodo getestadoperiodoBean() {
		return this.estadoperiodoBean;
	}

	public void setestadoperiodoBean(EstadoPeriodo estadoperiodoBean) {
		this.estadoperiodoBean = estadoperiodoBean;
	}	
	
	public EstadoPeriodoParameterReturnGeneral getestadoperiodoReturnGeneral() {
		return this.estadoperiodoReturnGeneral;
	}

	public void setestadoperiodoReturnGeneral(EstadoPeriodoParameterReturnGeneral estadoperiodoReturnGeneral) {
		this.estadoperiodoReturnGeneral = estadoperiodoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPeriodoLogic getEstadoPeriodoLogic()	{		
		return estadoperiodoLogic;
	}

	public void setEstadoPeriodoLogic(EstadoPeriodoLogic estadoperiodoLogic) {
		this.estadoperiodoLogic = estadoperiodoLogic;
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
	
	public Boolean getIsEsNuevoEstadoPeriodo() {
		return isEsNuevoEstadoPeriodo;
	}

	public void setIsEsNuevoEstadoPeriodo(Boolean isEsNuevoEstadoPeriodo) {
		this.isEsNuevoEstadoPeriodo = isEsNuevoEstadoPeriodo;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPeriodo() {
		return esParaAccionDesdeFormularioEstadoPeriodo;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPeriodo(Boolean esParaAccionDesdeFormularioEstadoPeriodo) {
		this.esParaAccionDesdeFormularioEstadoPeriodo = esParaAccionDesdeFormularioEstadoPeriodo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoPeriodo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPeriodoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPeriodo(this.estadoperiodoLogic.getEstadoPeriodos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPeriodoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPeriodo(this.estadoperiodos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoperiodoLogic.setEstadoPeriodos(this.estadoperiodos);
			estadoperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoPeriodoParameterReturnGeneral getEstadoPeriodoParameterGeneral() {
		return this.estadoperiodoParameterGeneral;
	}
	
	public void setEstadoPeriodoParameterGeneral(EstadoPeriodoParameterReturnGeneral estadoperiodoParameterGeneral) {
		this.estadoperiodoParameterGeneral = estadoperiodoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoPeriodo() {
		return isPermisoTodoEstadoPeriodo;
	}

	public void setIsPermisoTodoEstadoPeriodo(Boolean isPermisoTodoEstadoPeriodo) {
		this.isPermisoTodoEstadoPeriodo = isPermisoTodoEstadoPeriodo;
	}

	public Boolean getIsPermisoNuevoEstadoPeriodo() {
		return isPermisoNuevoEstadoPeriodo;
	}

	public void setIsPermisoNuevoEstadoPeriodo(Boolean isPermisoNuevoEstadoPeriodo) {
		this.isPermisoNuevoEstadoPeriodo = isPermisoNuevoEstadoPeriodo;
	}

	public Boolean getIsPermisoActualizarEstadoPeriodo() {
		return isPermisoActualizarEstadoPeriodo;
	}

	public void setIsPermisoActualizarEstadoPeriodo(Boolean isPermisoActualizarEstadoPeriodo) {
		this.isPermisoActualizarEstadoPeriodo = isPermisoActualizarEstadoPeriodo;
	}

	public Boolean getIsPermisoEliminarEstadoPeriodo() {
		return isPermisoEliminarEstadoPeriodo;
	}

	public void setIsPermisoEliminarEstadoPeriodo(Boolean isPermisoEliminarEstadoPeriodo) {
		this.isPermisoEliminarEstadoPeriodo = isPermisoEliminarEstadoPeriodo;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPeriodo() {
		return isPermisoGuardarCambiosEstadoPeriodo;
	}

	public void setIsPermisoGuardarCambiosEstadoPeriodo(Boolean isPermisoGuardarCambiosEstadoPeriodo) {
		this.isPermisoGuardarCambiosEstadoPeriodo = isPermisoGuardarCambiosEstadoPeriodo;
	}
	
	public Boolean getIsPermisoConsultaEstadoPeriodo() {
		return isPermisoConsultaEstadoPeriodo;
	}

	public void setIsPermisoConsultaEstadoPeriodo(Boolean isPermisoConsultaEstadoPeriodo) {
		this.isPermisoConsultaEstadoPeriodo = isPermisoConsultaEstadoPeriodo;
	}

	public Boolean getIsPermisoBusquedaEstadoPeriodo() {
		return isPermisoBusquedaEstadoPeriodo;
	}

	public void setIsPermisoBusquedaEstadoPeriodo(Boolean isPermisoBusquedaEstadoPeriodo) {
		this.isPermisoBusquedaEstadoPeriodo = isPermisoBusquedaEstadoPeriodo;
	}

	public Boolean getIsPermisoReporteEstadoPeriodo() {
		return isPermisoReporteEstadoPeriodo;
	}

	public void setIsPermisoReporteEstadoPeriodo(Boolean isPermisoReporteEstadoPeriodo) {
		this.isPermisoReporteEstadoPeriodo = isPermisoReporteEstadoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPeriodo() {
		return isPermisoPaginacionMedioEstadoPeriodo;
	}

	public void setIsPermisoPaginacionMedioEstadoPeriodo(Boolean isPermisoPaginacionMedioEstadoPeriodo) {
		this.isPermisoPaginacionMedioEstadoPeriodo = isPermisoPaginacionMedioEstadoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPeriodo() {
		return isPermisoPaginacionTodoEstadoPeriodo;
	}

	public void setIsPermisoPaginacionTodoEstadoPeriodo(Boolean isPermisoPaginacionTodoEstadoPeriodo) {
		this.isPermisoPaginacionTodoEstadoPeriodo = isPermisoPaginacionTodoEstadoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPeriodo() {
		return isPermisoPaginacionAltoEstadoPeriodo;
	}

	public void setIsPermisoPaginacionAltoEstadoPeriodo(Boolean isPermisoPaginacionAltoEstadoPeriodo) {
		this.isPermisoPaginacionAltoEstadoPeriodo = isPermisoPaginacionAltoEstadoPeriodo;
	}
	
	public Boolean getIsPermisoCopiarEstadoPeriodo() {
		return isPermisoCopiarEstadoPeriodo;
	}

	public void setIsPermisoCopiarEstadoPeriodo(Boolean isPermisoCopiarEstadoPeriodo) {
		this.isPermisoCopiarEstadoPeriodo = isPermisoCopiarEstadoPeriodo;
	}
	
	public Boolean getIsPermisoVerFormEstadoPeriodo() {
		return isPermisoVerFormEstadoPeriodo;
	}

	public void setIsPermisoVerFormEstadoPeriodo(Boolean isPermisoVerFormEstadoPeriodo) {
		this.isPermisoVerFormEstadoPeriodo = isPermisoVerFormEstadoPeriodo;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPeriodo() {
		return isPermisoDuplicarEstadoPeriodo;
	}

	public void setIsPermisoDuplicarEstadoPeriodo(Boolean isPermisoDuplicarEstadoPeriodo) {
		this.isPermisoDuplicarEstadoPeriodo = isPermisoDuplicarEstadoPeriodo;
	}
	
	public Boolean getIsPermisoOrdenEstadoPeriodo() {
		return isPermisoOrdenEstadoPeriodo;
	}

	public void setIsPermisoOrdenEstadoPeriodo(Boolean isPermisoOrdenEstadoPeriodo) {
		this.isPermisoOrdenEstadoPeriodo = isPermisoOrdenEstadoPeriodo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPeriodo() {
		return isVisibilidadCeldaNuevoEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPeriodo(Boolean isVisibilidadCeldaNuevoEstadoPeriodo) {
		this.isVisibilidadCeldaNuevoEstadoPeriodo = isVisibilidadCeldaNuevoEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPeriodo() {
		return isVisibilidadCeldaDuplicarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPeriodo(Boolean isVisibilidadCeldaDuplicarEstadoPeriodo) {
		this.isVisibilidadCeldaDuplicarEstadoPeriodo = isVisibilidadCeldaDuplicarEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPeriodo() {
		return isVisibilidadCeldaCopiarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPeriodo(Boolean isVisibilidadCeldaCopiarEstadoPeriodo) {
		this.isVisibilidadCeldaCopiarEstadoPeriodo = isVisibilidadCeldaCopiarEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPeriodo() {
		return isVisibilidadCeldaVerFormEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPeriodo(Boolean isVisibilidadCeldaVerFormEstadoPeriodo) {
		this.isVisibilidadCeldaVerFormEstadoPeriodo = isVisibilidadCeldaVerFormEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPeriodo() {
		return isVisibilidadCeldaOrdenEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPeriodo(Boolean isVisibilidadCeldaOrdenEstadoPeriodo) {
		this.isVisibilidadCeldaOrdenEstadoPeriodo = isVisibilidadCeldaOrdenEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPeriodo() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPeriodo(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPeriodo) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo = isVisibilidadCeldaNuevoRelacionesEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPeriodo() {
		return isVisibilidadCeldaModificarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaModificarEstadoPeriodo(Boolean isVisibilidadCeldaModificarEstadoPeriodo) {
		this.isVisibilidadCeldaModificarEstadoPeriodo = isVisibilidadCeldaModificarEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPeriodo() {
		return isVisibilidadCeldaActualizarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPeriodo(Boolean isVisibilidadCeldaActualizarEstadoPeriodo) {
		this.isVisibilidadCeldaActualizarEstadoPeriodo = isVisibilidadCeldaActualizarEstadoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPeriodo() {
		return isVisibilidadCeldaEliminarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPeriodo(Boolean isVisibilidadCeldaEliminarEstadoPeriodo) {
		this.isVisibilidadCeldaEliminarEstadoPeriodo = isVisibilidadCeldaEliminarEstadoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPeriodo() {
		return isVisibilidadCeldaCancelarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPeriodo(Boolean isVisibilidadCeldaCancelarEstadoPeriodo) {
		this.isVisibilidadCeldaCancelarEstadoPeriodo = isVisibilidadCeldaCancelarEstadoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPeriodo() {
		return isVisibilidadCeldaGuardarEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPeriodo(Boolean isVisibilidadCeldaGuardarEstadoPeriodo) {
		this.isVisibilidadCeldaGuardarEstadoPeriodo = isVisibilidadCeldaGuardarEstadoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPeriodo() {
		return isVisibilidadCeldaGuardarCambiosEstadoPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPeriodo(Boolean isVisibilidadCeldaGuardarCambiosEstadoPeriodo) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo = isVisibilidadCeldaGuardarCambiosEstadoPeriodo;
	}
		
	public EstadoPeriodoSessionBean getestadoperiodoSessionBean() {
		return this.estadoperiodoSessionBean;
	}
	
	public void setestadoperiodoSessionBean(EstadoPeriodoSessionBean estadoperiodoSessionBean) {
		this.estadoperiodoSessionBean=estadoperiodoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(EstadoPeriodo estadoperiodo)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoPeriodo estadoperiodo,EstadoPeriodo estadoperiodoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPeriodo(estadoperiodo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoperiodoAux.setId(estadoperiodo.getId());
		estadoperiodoAux.setVersionRow(estadoperiodo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPeriodo();
		
			int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoperiodoValidator.getInvalidValues(this.estadoperiodo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoperiodoLogic.setDatosCliente(datosCliente);
			estadoperiodoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoperiodoAux=new  EstadoPeriodo();
				
				estadoperiodoAux.setIsNew(true);
				estadoperiodoAux.setIsChanged(true);
				
				estadoperiodoAux.setEstadoPeriodoOriginal(this.estadoperiodo);
				
				estadoperiodoAux.setId(this.estadoperiodo.getId());	
				estadoperiodoAux.setVersionRow(this.estadoperiodo.getVersionRow());	
				estadoperiodoAux.setcodigo(this.estadoperiodo.getcodigo());	
				estadoperiodoAux.setnombre(this.estadoperiodo.getnombre());	
				estadoperiodoAux.setes_defecto(this.estadoperiodo.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoperiodoAux,estadoperiodoLogic.getEstadoPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoperiodoAux,estadoperiodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoperiodoLogic.saveEstadoPeriodos();//WithConnection
						//estadoperiodoLogic.getSetVersionRowEstadoPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoperiodo,estadoperiodoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoperiodoAux=new  EstadoPeriodo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoperiodoSessionBean.getEsGuardarRelacionado() && this.estadoperiodo.getId()>=0)) {
						
					estadoperiodoAux.setIsNew(false);
				}
				
				estadoperiodoAux.setIsDeleted(false);
			
				estadoperiodoAux.setId(this.estadoperiodo.getId());	
				estadoperiodoAux.setVersionRow(this.estadoperiodo.getVersionRow());	
				estadoperiodoAux.setcodigo(this.estadoperiodo.getcodigo());	
				estadoperiodoAux.setnombre(this.estadoperiodo.getnombre());	
				estadoperiodoAux.setes_defecto(this.estadoperiodo.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoperiodoAux,estadoperiodoLogic.getEstadoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoperiodoAux,estadoperiodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoperiodoLogic.saveEstadoPeriodos();//WithConnection
						//estadoperiodoLogic.getSetVersionRowEstadoPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoperiodo,estadoperiodoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoperiodoAux=new  EstadoPeriodo();
				
				estadoperiodoAux.setIsNew(false);
				estadoperiodoAux.setIsChanged(false);
				
				estadoperiodoAux.setIsDeleted(true);
				
				estadoperiodoAux.setId(this.estadoperiodo.getId());	
				estadoperiodoAux.setVersionRow(this.estadoperiodo.getVersionRow());	
				estadoperiodoAux.setcodigo(this.estadoperiodo.getcodigo());	
				estadoperiodoAux.setnombre(this.estadoperiodo.getnombre());	
				estadoperiodoAux.setes_defecto(this.estadoperiodo.getes_defecto());	
				
				if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoperiodoAux.getId()>=0) {	
						this.estadoperiodosEliminados.add(estadoperiodoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoperiodoAux,estadoperiodoLogic.getEstadoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoperiodoAux,estadoperiodos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoperiodoLogic.saveEstadoPeriodos();//WithConnection
						//estadoperiodoLogic.getSetVersionRowEstadoPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoperiodoAux,estadoperiodoLogic.getEstadoPeriodos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoperiodoAux,estadoperiodos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.getEstadoPeriodos().addAll(this.estadoperiodosEliminados);
					
					estadoperiodoLogic.saveEstadoPeriodos();//WithConnection
					//estadoperiodoLogic.getSetVersionRowEstadoPeriodos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoperiodosEliminados= new ArrayList<EstadoPeriodo>();		
			}
			
			if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Periodo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoperiodo=estadoperiodoAux;
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
      		//this.finishProcessEstadoPeriodo();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPeriodo estadoperiodoLocal) throws Exception {
		
		if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPeriodo estadoperiodoLocal) throws Exception {	
		if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoPeriodoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoperiodoValidator.getInvalidValues(this.estadoperiodo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPeriodo estadoperiodo,List<EstadoPeriodo> estadoperiodos) throws Exception {
		try	{		
			EstadoPeriodoConstantesFunciones.actualizarLista(estadoperiodo,estadoperiodos,this.estadoperiodoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPeriodo estadoperiodo,List<EstadoPeriodo> estadoperiodos) throws Exception {
		try	{			
			EstadoPeriodoConstantesFunciones.actualizarSelectedLista(estadoperiodo,estadoperiodos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPeriodo> estadoperiodosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoperiodosLocal=this.estadoperiodoLogic.getEstadoPeriodos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoperiodosLocal=this.estadoperiodos;
			}
			//ARCHITECTURE
		
			for(EstadoPeriodo estadoperiodoLocal:estadoperiodosLocal) {
				if(this.permiteMantenimiento(estadoperiodoLocal) && estadoperiodoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoPeriodoConstantesFunciones.getEstadoPeriodoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPeriodoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelcodigoEstadoPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPeriodoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelnombreEstadoPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPeriodoConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabeles_defectoEstadoPeriodo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelcodigoEstadoPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelnombreEstadoPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPeriodo.jLabeles_defectoEstadoPeriodo,"");
		
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
		this.iIdNuevoEstadoPeriodo--;	
		
		
		this.estadoperiodoAux=new EstadoPeriodo();
		
		this.estadoperiodoAux.setId(this.iIdNuevoEstadoPeriodo);
		this.estadoperiodoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoperiodoLogic.getEstadoPeriodos().add(this.estadoperiodoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoperiodos.add(this.estadoperiodoAux);
		}
		//ARCHITECTURE
		
		this.estadoperiodo=this.estadoperiodoAux;
		
		if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodo);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPeriodo(this.estadoperiodo);
		}
				
		//this.setDefaultControlesEstadoPeriodo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPeriodo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPeriodo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPeriodo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPeriodo(this.estadoperiodoBean,this.estadoperiodo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPeriodoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPeriodoConstantesFunciones.getClassesRelationshipsOfEstadoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoperiodoReturnGeneral=estadoperiodoLogic.procesarEventosEstadoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoperiodoLogic.getEstadoPeriodos(),this.estadoperiodo,this.estadoperiodoParameterGeneral,this.isEsNuevoEstadoPeriodo,classes);//this.estadoperiodoLogic.getEstadoPeriodo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPeriodo(this.estadoperiodoReturnGeneral,this.estadoperiodoBean,false);
		
		if(this.estadoperiodoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo());
		}
		
		if(this.estadoperiodoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo(),classes);//this.estadoperiodoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPeriodo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPeriodo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPeriodo(false);
						
			if(estadoperiodoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPeriodo();
			}
			
			this.actualizarVisualTableDatosEstadoPeriodo();
			
			this.jTableDatosEstadoPeriodo.setRowSelectionInterval(this.getIndiceNuevoEstadoPeriodo(), this.getIndiceNuevoEstadoPeriodo());
			
			this.seleccionarFilaTablaEstadoPeriodoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPeriodo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPeriodo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setEnabled(isHabilitar && this.estadoperiodoConstantesFunciones.activarcodigoEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setEnabled(isHabilitar && this.estadoperiodoConstantesFunciones.activarnombreEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setEnabled(isHabilitar && this.estadoperiodoConstantesFunciones.activares_defectoEstadoPeriodo);	
		
	};
	
	public void setDefaultControlesEstadoPeriodo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPeriodo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoperiodoSessionBean.setConGuardarRelaciones(true);			
			this.estadoperiodoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.setVisible(true);
			
					
		} else {
			//this.estadoperiodoSessionBean.setConGuardarRelaciones(false);			
			this.estadoperiodoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoPeriodo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
				if(estadoperiodoAux.getId().equals(this.iIdNuevoEstadoPeriodo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodos) {
				if(estadoperiodoAux.getId().equals(this.iIdNuevoEstadoPeriodo)) {
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
	
	public int getIndiceActualEstadoPeriodo(EstadoPeriodo estadoperiodo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
				if(estadoperiodoAux.getId().equals(estadoperiodo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodos) {
				if(estadoperiodoAux.getId().equals(estadoperiodo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoPeriodo(EstadoPeriodo estadoperiodoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
				if(estadoperiodoAux.getEstadoPeriodoOriginal().getId().equals(estadoperiodoOriginal.getId())) {
					existe=true;
					estadoperiodoOriginal.setId(estadoperiodoAux.getId());
					estadoperiodoOriginal.setVersionRow(estadoperiodoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPeriodo estadoperiodoAux:this.estadoperiodos) {
				if(estadoperiodoAux.getEstadoPeriodoOriginal().getId().equals(estadoperiodoOriginal.getId())) {
					existe=true;
					estadoperiodoOriginal.setId(estadoperiodoAux.getId());
					estadoperiodoOriginal.setVersionRow(estadoperiodoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPeriodo(Boolean esParaCancelar) throws Exception {
		estadoperiodosAux=new ArrayList<EstadoPeriodo>();
		estadoperiodoAux=new EstadoPeriodo();
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
					if(estadoperiodoAux.getId()<0) {
						estadoperiodosAux.add(estadoperiodoAux);
					}		
				}
				this.iIdNuevoEstadoPeriodo=0L;
				this.estadoperiodoLogic.getEstadoPeriodos().removeAll(estadoperiodosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPeriodo estadoperiodoAux:this.estadoperiodos) {
					if(estadoperiodoAux.getId()<0) {
						estadoperiodosAux.add(estadoperiodoAux);
					}		
				}
				this.iIdNuevoEstadoPeriodo=0L;
				this.estadoperiodos.removeAll(estadoperiodosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPeriodo 
					&& this.estadoperiodoLogic.getEstadoPeriodos().size()>0
					) {
					estadoperiodoAux=this.estadoperiodoLogic.getEstadoPeriodos().get(this.estadoperiodoLogic.getEstadoPeriodos().size() - 1);
				
					if(estadoperiodoAux.getId()<0) {
						this.estadoperiodoLogic.getEstadoPeriodos().remove(estadoperiodoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPeriodo && this.estadoperiodos.size()>0) {
					estadoperiodoAux=this.estadoperiodos.get(this.estadoperiodos.size() - 1);
				
					if(estadoperiodoAux.getId()<0) {
						this.estadoperiodos.remove(estadoperiodoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPeriodo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoperiodo.getId()<0) {
				this.estadoperiodoLogic.getEstadoPeriodos().remove(this.estadoperiodo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoperiodo.getId()<0) {
				this.estadoperiodos.remove(this.estadoperiodo);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPeriodo(List<EstadoPeriodo> estadoperiodosAux) throws Exception {
		EstadoPeriodoConstantesFunciones.setEstadosInicialesEstadoPeriodo(estadoperiodosAux);
	}
	
	public void setEstadosInicialesEstadoPeriodo(EstadoPeriodo estadoperiodoAux) throws Exception {
		EstadoPeriodoConstantesFunciones.setEstadosInicialesEstadoPeriodo(estadoperiodoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPeriodoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPeriodoActual()) {
				if(!this.isEsNuevoEstadoPeriodo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPeriodo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPeriodoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Periodo ?", "MANTENIMIENTO DE Estado Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPeriodo estadoperiodo) throws Exception {
		EstadoPeriodoConstantesFunciones.seleccionarAsignar(this.estadoperiodo,estadoperiodo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPeriodo=this.isPermisoActualizarOriginalEstadoPeriodo;
			
			
			this.seleccionarAsignar(estadoperiodo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPeriodoConstantesFunciones.quitarEspaciosEstadoPeriodo(this.estadoperiodo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoperiodoSessionBean.setsFuncionBusquedaRapida(this.estadoperiodoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPeriodo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPeriodo(esParaCancelar);				
				this.cancelarNuevoEstadoPeriodo(esParaCancelar);								
			}
			
			this.estadoperiodo=new EstadoPeriodo();
			
			this.inicializarEstadoPeriodo();
			
			this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPeriodo() throws Exception {
		try {
			EstadoPeriodoConstantesFunciones.inicializarEstadoPeriodo(this.estadoperiodo);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoperiodoLogic.getEstadoPeriodos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPeriodos(String sAccionBusqueda,List<EstadoPeriodo> estadoperiodosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoPeriodo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPeriodoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPeriodoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPeriodo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Periodos");		
		parameters.put("busquedapor", EstadoPeriodoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPeriodo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPeriodo=new JRBeanArrayDataSource(EstadoPeriodoJInternalFrame.TraerEstadoPeriodoBeans(estadoperiodosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPeriodo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPeriodoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPeriodoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPeriodoBean.TraerEstadoPeriodoBeans(estadoperiodosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPeriodoActionPerformed(null);
					//this.generarExcelReporteEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPeriodos(sAccionBusqueda,sTipoArchivoReporte,estadoperiodosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPeriodo> estadoperiodosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPeriodos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPeriodo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPeriodo estadoperiodo : estadoperiodosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPeriodoConstantesFunciones.generarExcelReporteDataEstadoPeriodo("NORMAL",row,workbook,estadoperiodo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPeriodo(String sTipo,Row row,Workbook workbook) {
		
		EstadoPeriodoConstantesFunciones.generarExcelReporteHeaderEstadoPeriodo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPeriodo> estadoperiodosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPeriodo estadoperiodo : estadoperiodosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPeriodoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoperiodo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoperiodo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadoperiodo.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPeriodo> estadoperiodosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPeriodo> estadoperiodosRespaldo=null;
		
		classes=EstadoPeriodoConstantesFunciones.getClassesRelationshipsOfEstadoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoperiodoLogic.setDatosCliente(this.datosCliente);
		this.estadoperiodoLogic.setDatosDeep(this.datosDeep);
		this.estadoperiodoLogic.setIsConDeep(true);
		
		estadoperiodosRespaldo=this.estadoperiodoLogic.getEstadoPeriodos();
		
		this.estadoperiodoLogic.setEstadoPeriodos(estadoperiodosParaReportes);	
		this.estadoperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoperiodosParaReportes=this.estadoperiodoLogic.getEstadoPeriodos();
		this.estadoperiodoLogic.setEstadoPeriodos(estadoperiodosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPeriodo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPeriodo estadoperiodo : estadoperiodosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPeriodo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPeriodoConstantesFunciones.generarExcelReporteDataEstadoPeriodo("NORMAL",row,workbook,estadoperiodo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoPeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPeriodo() throws Exception {		
		this.startProcessEstadoPeriodo(true);
	}
	
	public void startProcessEstadoPeriodo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoPeriodo, this.jScrollPanelDatosEstadoPeriodo,this.jPanelPaginacionEstadoPeriodo, this.jScrollPanelDatosEdicionEstadoPeriodo, this.jPanelAccionesEstadoPeriodo,this.jPanelAccionesFormularioEstadoPeriodo,this.jmenuBarEstadoPeriodo,this.jmenuBarDetalleEstadoPeriodo,this.jTtoolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPeriodo=null; 
		
		final JPanel jPanelParametrosReportesEstadoPeriodo=this.jPanelParametrosReportesEstadoPeriodo;
		//final JScrollPane jScrollPanelDatosEstadoPeriodo=this.jScrollPanelDatosEstadoPeriodo;
		final JTable jTableDatosEstadoPeriodo=this.jTableDatosEstadoPeriodo;		
		final JPanel jPanelPaginacionEstadoPeriodo=this.jPanelPaginacionEstadoPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPeriodo=this.jScrollPanelDatosEdicionEstadoPeriodo;
		final JPanel jPanelAccionesEstadoPeriodo=this.jPanelAccionesEstadoPeriodo;
		
		JPanel jPanelCamposAuxiliarEstadoPeriodo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPeriodo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			jPanelCamposAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jPanelCamposEstadoPeriodo;
			jPanelAccionesFormularioAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jPanelAccionesFormularioEstadoPeriodo;
		}
		
		final JPanel jPanelCamposEstadoPeriodo=jPanelCamposAuxiliarEstadoPeriodo;
		final JPanel jPanelAccionesFormularioEstadoPeriodo=jPanelAccionesFormularioAuxiliarEstadoPeriodo;
		
		
		final JMenuBar jmenuBarEstadoPeriodo=this.jmenuBarEstadoPeriodo;
		final JToolBar jTtoolBarEstadoPeriodo=this.jTtoolBarEstadoPeriodo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPeriodo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			jmenuBarDetalleAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jmenuBarDetalleEstadoPeriodo;
			jTtoolBarDetalleAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jTtoolBarDetalleEstadoPeriodo;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPeriodo=jmenuBarDetalleAuxiliarEstadoPeriodo;
		final JToolBar jTtoolBarDetalleEstadoPeriodo=jTtoolBarDetalleAuxiliarEstadoPeriodo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPeriodo;
			processRunnable.jTableDatos=jTableDatosEstadoPeriodo;
			processRunnable.jPanelCampos=jPanelCamposEstadoPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPeriodo;
			processRunnable.jTtoolBar=jTtoolBarEstadoPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPeriodo ,jPanelParametrosReportesEstadoPeriodo,jTableDatosEstadoPeriodo, /*jScrollPanelDatosEstadoPeriodo,*/jPanelCamposEstadoPeriodo,jPanelPaginacionEstadoPeriodo, /*jScrollPanelDatosEdicionEstadoPeriodo,*/ jPanelAccionesEstadoPeriodo,jPanelAccionesFormularioEstadoPeriodo,jmenuBarEstadoPeriodo,jmenuBarDetalleEstadoPeriodo,jTtoolBarEstadoPeriodo,jTtoolBarDetalleEstadoPeriodo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoPeriodo, jScrollPanelDatosEstadoPeriodo,jPanelPaginacionEstadoPeriodo, jScrollPanelDatosEdicionEstadoPeriodo, jPanelAccionesEstadoPeriodo,jPanelAccionesFormularioEstadoPeriodo,jmenuBarEstadoPeriodo,jmenuBarDetalleEstadoPeriodo,jTtoolBarEstadoPeriodo,jTtoolBarDetalleEstadoPeriodo);
						
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
	
	public void finishProcessEstadoPeriodo() {// throws Exception 
		this.finishProcessEstadoPeriodo(true);
	}
	
	public void finishProcessEstadoPeriodo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoPeriodo, this.jScrollPanelDatosEstadoPeriodo,this.jPanelPaginacionEstadoPeriodo, this.jScrollPanelDatosEdicionEstadoPeriodo, this.jPanelAccionesEstadoPeriodo,this.jPanelAccionesFormularioEstadoPeriodo,this.jmenuBarEstadoPeriodo,this.jmenuBarDetalleEstadoPeriodo,this.jTtoolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPeriodo=null; 
		
		final JPanel jPanelParametrosReportesEstadoPeriodo=this.jPanelParametrosReportesEstadoPeriodo;
		//final JScrollPane jScrollPanelDatosEstadoPeriodo=this.jScrollPanelDatosEstadoPeriodo;
		final JTable jTableDatosEstadoPeriodo=this.jTableDatosEstadoPeriodo;		
		final JPanel jPanelPaginacionEstadoPeriodo=this.jPanelPaginacionEstadoPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPeriodo=this.jScrollPanelDatosEdicionEstadoPeriodo;
		final JPanel jPanelAccionesEstadoPeriodo=this.jPanelAccionesEstadoPeriodo;
		
		JPanel jPanelCamposAuxiliarEstadoPeriodo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPeriodo=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			jPanelCamposAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jPanelCamposEstadoPeriodo;
			jPanelAccionesFormularioAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jPanelAccionesFormularioEstadoPeriodo;
		}
		
		final JPanel jPanelCamposEstadoPeriodo=jPanelCamposAuxiliarEstadoPeriodo;
		final JPanel jPanelAccionesFormularioEstadoPeriodo=jPanelAccionesFormularioAuxiliarEstadoPeriodo;
		
		
		final JMenuBar jmenuBarEstadoPeriodo=this.jmenuBarEstadoPeriodo;		
		final JToolBar jTtoolBarEstadoPeriodo=this.jTtoolBarEstadoPeriodo;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPeriodo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			jmenuBarDetalleAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jmenuBarDetalleEstadoPeriodo;
			jTtoolBarDetalleAuxiliarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jTtoolBarDetalleEstadoPeriodo;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPeriodo=jmenuBarDetalleAuxiliarEstadoPeriodo;
		final JToolBar jTtoolBarDetalleEstadoPeriodo=jTtoolBarDetalleAuxiliarEstadoPeriodo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPeriodo;
			processRunnable.jTableDatos=jTableDatosEstadoPeriodo;
			processRunnable.jPanelCampos=jPanelCamposEstadoPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPeriodo;
			processRunnable.jTtoolBar=jTtoolBarEstadoPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPeriodo ,jPanelParametrosReportesEstadoPeriodo, jTableDatosEstadoPeriodo,/*jScrollPanelDatosEstadoPeriodo,*/jPanelCamposEstadoPeriodo,jPanelPaginacionEstadoPeriodo, /*jScrollPanelDatosEdicionEstadoPeriodo,*/ jPanelAccionesEstadoPeriodo,jPanelAccionesFormularioEstadoPeriodo,jmenuBarEstadoPeriodo,jmenuBarDetalleEstadoPeriodo,jTtoolBarEstadoPeriodo,jTtoolBarDetalleEstadoPeriodo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPeriodo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPeriodo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPeriodo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPeriodo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoperiodoConstantesFunciones.getsFinalQueryEstadoPeriodo();
		String  finalQueryPaginacionTodos=this.estadoperiodoConstantesFunciones.getsFinalQueryEstadoPeriodo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPeriodoConstantesFunciones.getArrayColumnasGlobalesNoEstadoPeriodo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPeriodoConstantesFunciones.getArrayColumnasGlobalesEstadoPeriodo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPeriodoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoperiodosEliminados= new ArrayList<EstadoPeriodo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPeriodo();
		
				///*EstadoPeriodoSessionBean*/this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
			
			if(this.estadoperiodoSessionBean==null) {
				this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
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
					this.iNumeroPaginacion=EstadoPeriodoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPeriodoConstantesFunciones.getClassesForeignKeysOfEstadoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoperiodo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoperiodosAux= new ArrayList<EstadoPeriodo>();
			
				
			estadoperiodoLogic.setDatosCliente(this.datosCliente);
			estadoperiodoLogic.setDatosDeep(this.datosDeep);
			estadoperiodoLogic.setIsConDeep(true);
			
			
			estadoperiodoLogic.getEstadoPeriodoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoperiodoLogic.getTodosEstadoPeriodos(finalQueryGlobal,pagination);
					
					//estadoperiodoLogic.getTodosEstadoPeriodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoperiodoLogic.getEstadoPeriodos()==null|| estadoperiodoLogic.getEstadoPeriodos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoperiodosAux= new ArrayList<EstadoPeriodo>();
							estadoperiodosAux.addAll(estadoperiodoLogic.getEstadoPeriodos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoperiodosAux= new ArrayList<EstadoPeriodo>();
							estadoperiodosAux.addAll(estadoperiodos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoperiodoLogic.getTodosEstadoPeriodos(finalQueryGlobal+"",this.pagination);												
							
							//estadoperiodoLogic.getTodosEstadoPeriodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPeriodos("Todos",estadoperiodoLogic.getEstadoPeriodos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoperiodoLogic.setEstadoPeriodos(new ArrayList<EstadoPeriodo>());					
							estadoperiodoLogic.getEstadoPeriodos().addAll(estadoperiodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoperiodos=new ArrayList<EstadoPeriodo>();
							estadoperiodos.addAll(estadoperiodosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPeriodo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPeriodo=this.idActual;
				
				} else if(this.idEstadoPeriodoActual!=null && this.idEstadoPeriodoActual!=0L) {
					idEstadoPeriodo=idEstadoPeriodoActual;
				}
				
					
				this.sDetalleReporte=EstadoPeriodoConstantesFunciones.getDetalleIndicePorId(idEstadoPeriodo);
				
				this.estadoperiodos=new ArrayList<EstadoPeriodo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoperiodoLogic.getEntity(idEstadoPeriodo);
					
					//estadoperiodoLogic.getEntityWithConnection(idEstadoPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoperiodoLogic.setEstadoPeriodos(new ArrayList<EstadoPeriodo>());
					estadoperiodoLogic.getEstadoPeriodos().add(estadoperiodoLogic.getEstadoPeriodo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoperiodos=new ArrayList<EstadoPeriodo>();
					this.estadoperiodos.add(estadoperiodo);
				}
				
				if(estadoperiodoLogic.getEstadoPeriodo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPeriodo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPeriodo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoperiodoLogic.getEstadoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoperiodos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoperiodoLogic.getEstadoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoperiodos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPeriodo estadoperiodo) {
		Boolean permite=true;
		
		if(this.estadoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPeriodoConstantesFunciones.getOrderByListaEstadoPeriodo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPeriodoConstantesFunciones.getOrderByListaEstadoPeriodo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPeriodo estadoperiodo:estadoperiodoLogic.getEstadoPeriodos()) {
				if(estadoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoperiodoTotales=estadoperiodo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPeriodo estadoperiodo:this.estadoperiodos) {
				if(estadoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoperiodoTotales=estadoperiodo;
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
			this.estadoperiodoAux=new EstadoPeriodo();
			this.estadoperiodoAux.setsType(Constantes2.S_TOTALES);
			this.estadoperiodoAux.setIsNew(false);
			this.estadoperiodoAux.setIsChanged(false);
			this.estadoperiodoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPeriodoConstantesFunciones.TotalizarValoresFilaEstadoPeriodo(this.estadoperiodoLogic.getEstadoPeriodos(),this.estadoperiodoAux);
				
				this.estadoperiodoLogic.getEstadoPeriodos().add(this.estadoperiodoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPeriodoConstantesFunciones.TotalizarValoresFilaEstadoPeriodo(this.estadoperiodos,this.estadoperiodoAux);
				
				this.estadoperiodos.add(this.estadoperiodoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoperiodoTotales=new EstadoPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoperiodoLogic.getEstadoPeriodos().remove(estadoperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoperiodos.remove(estadoperiodoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoperiodoTotales=new EstadoPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPeriodo estadoperiodo:estadoperiodoLogic.getEstadoPeriodos()) {
				if(estadoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoperiodoTotales=estadoperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPeriodoConstantesFunciones.TotalizarValoresFilaEstadoPeriodo(this.estadoperiodoLogic.getEstadoPeriodos(),estadoperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPeriodo estadoperiodo:this.estadoperiodos) {
				if(estadoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoperiodoTotales=estadoperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPeriodoConstantesFunciones.TotalizarValoresFilaEstadoPeriodo(this.estadoperiodos,estadoperiodoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoPeriodoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoPeriodoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoperiodoLogic.getEstadoPeriodoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoPeriodo() {
		this.isPermisoTodoEstadoPeriodo=false;
		this.isPermisoNuevoEstadoPeriodo=false;
		this.isPermisoActualizarEstadoPeriodo=false;
		this.isPermisoActualizarOriginalEstadoPeriodo=false;
		this.isPermisoEliminarEstadoPeriodo=false;
		this.isPermisoGuardarCambiosEstadoPeriodo=false;
		this.isPermisoConsultaEstadoPeriodo=false;
		this.isPermisoBusquedaEstadoPeriodo=false;
		this.isPermisoReporteEstadoPeriodo=false;		
		this.isPermisoOrdenEstadoPeriodo=false;		
		this.isPermisoPaginacionMedioEstadoPeriodo=false;		
		this.isPermisoPaginacionAltoEstadoPeriodo=false;
		this.isPermisoPaginacionTodoEstadoPeriodo=false;
		this.isPermisoCopiarEstadoPeriodo=false;		
		this.isPermisoVerFormEstadoPeriodo=false;		
		this.isPermisoDuplicarEstadoPeriodo=false;		
		this.isPermisoOrdenEstadoPeriodo=false;		
	}
	
	public void setPermisosUsuarioEstadoPeriodo(Boolean isPermiso) {
		this.isPermisoTodoEstadoPeriodo=isPermiso;
		this.isPermisoNuevoEstadoPeriodo=isPermiso;
		this.isPermisoActualizarEstadoPeriodo=isPermiso;
		this.isPermisoActualizarOriginalEstadoPeriodo=isPermiso;
		this.isPermisoEliminarEstadoPeriodo=isPermiso;
		this.isPermisoGuardarCambiosEstadoPeriodo=isPermiso;
		this.isPermisoConsultaEstadoPeriodo=isPermiso;
		this.isPermisoBusquedaEstadoPeriodo=isPermiso;
		this.isPermisoReporteEstadoPeriodo=isPermiso;
		this.isPermisoOrdenEstadoPeriodo=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPeriodo=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPeriodo=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPeriodo=isPermiso;		
		this.isPermisoCopiarEstadoPeriodo=isPermiso;		
		this.isPermisoVerFormEstadoPeriodo=isPermiso;		
		this.isPermisoDuplicarEstadoPeriodo=isPermiso;
		this.isPermisoOrdenEstadoPeriodo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPeriodo(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPeriodo=isPermiso;
		this.isPermisoNuevoEstadoPeriodo=isPermiso;
		this.isPermisoActualizarEstadoPeriodo=isPermiso;
		this.isPermisoActualizarOriginalEstadoPeriodo=isPermiso;
		this.isPermisoEliminarEstadoPeriodo=isPermiso;
		this.isPermisoGuardarCambiosEstadoPeriodo=isPermiso;
		//this.isPermisoConsultaEstadoPeriodo=isPermiso;
		//this.isPermisoBusquedaEstadoPeriodo=isPermiso;
		//this.isPermisoReporteEstadoPeriodo=isPermiso;
		//this.isPermisoOrdenEstadoPeriodo=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPeriodo=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPeriodo=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPeriodo=isPermiso;		
		//this.isPermisoCopiarEstadoPeriodo=isPermiso;		
		//this.isPermisoDuplicarEstadoPeriodo=isPermiso;
		//this.isPermisoOrdenEstadoPeriodo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPeriodoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPeriodo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPeriodoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPeriodoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPeriodoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPeriodoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoPeriodo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPeriodoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPeriodo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPeriodo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPeriodo=this.isPermisoActualizarEstadoPeriodo;
			this.isPermisoEliminarEstadoPeriodo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPeriodo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPeriodo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPeriodo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPeriodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPeriodo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPeriodo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPeriodo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPeriodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPeriodo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPeriodo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPeriodo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPeriodo.setToolTipText(this.jTableDatosEstadoPeriodo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPeriodo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPeriodo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoPeriodo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoPeriodoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPeriodoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPeriodoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPeriodo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPeriodo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPeriodo(EstadoPeriodo estadoperiodo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPeriodo(EstadoPeriodo estadoperiodo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPeriodo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPeriodo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPeriodo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoPeriodoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPeriodoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPeriodoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean(); 
		this.estadoperiodoConstantesFunciones=new EstadoPeriodoConstantesFunciones(); 
		this.estadoperiodoBean=new EstadoPeriodo();//(this.estadoperiodoConstantesFunciones); 		
		this.estadoperiodoReturnGeneral=new EstadoPeriodoParameterReturnGeneral(); 
		
		this.estadoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPeriodo(true);
			
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
			
			this.estadoperiodoConstantesFunciones=new EstadoPeriodoConstantesFunciones(); 
			this.estadoperiodoBean=new EstadoPeriodo();//this.estadoperiodoConstantesFunciones); 			
			this.estadoperiodoReturnGeneral=new EstadoPeriodoParameterReturnGeneral(); 
		
			EstadoPeriodoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Periodo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoperiodo=new EstadoPeriodo();
			this.estadoperiodos = new ArrayList<EstadoPeriodo>();
			this.estadoperiodosAux = new ArrayList<EstadoPeriodo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic=new EstadoPeriodoLogic();
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPeriodo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPeriodo);	
					}
					
					if(this.jInternalFrameImportacionEstadoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPeriodo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPeriodo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPeriodo);
				this.jInternalFrameDetalleFormEstadoPeriodo.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPeriodo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPeriodo);
					this.jInternalFrameReporteDinamicoEstadoPeriodo.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPeriodo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPeriodo);
					this.jInternalFrameImportacionEstadoPeriodo.setVisible(false);
					this.jInternalFrameImportacionEstadoPeriodo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPeriodo);
					this.jInternalFrameOrderByEstadoPeriodo.setVisible(false);
					this.jInternalFrameOrderByEstadoPeriodo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPeriodoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPeriodoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoperiodoReturnGeneral=new EstadoPeriodoParameterReturnGeneral();
			
			this.estadoperiodoParameterGeneral=new EstadoPeriodoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoperiodoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoperiodoSessionBean.getEsGuardarRelacionado(),this.estadoperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoperiodoSessionBean.getEsGuardarRelacionado(),this.estadoperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaDuplicarEstadoPeriodo=true;
			this.isVisibilidadCeldaCopiarEstadoPeriodo=true;
			this.isVisibilidadCeldaVerFormEstadoPeriodo=true;
			this.isVisibilidadCeldaOrdenEstadoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPeriodo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPeriodo(false);
			
			this.setPermisosUsuarioEstadoPeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoperiodoSessionBean.getEsGuardarRelacionado() && this.estadoperiodoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPeriodoClasesRelacionadas();
			}
			
			if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPeriodoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPeriodo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPeriodo();
			}
			
			if(!this.isPermisoBusquedaEstadoPeriodo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPeriodo,this.isPermisoPaginacionMedioEstadoPeriodo,this.isPermisoPaginacionTodoEstadoPeriodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPeriodoConstantesFunciones.getTiposSeleccionarEstadoPeriodo());
				
				this.tiposColumnasSelect=EstadoPeriodoConstantesFunciones.getTiposSeleccionarEstadoPeriodo(true);
				
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
			//if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPeriodo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoPeriodo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoPeriodo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPeriodo() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoperiodoImplementable= (EstadoPeriodoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoperiodoImplementableHome= (EstadoPeriodoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoperiodos= new ArrayList<EstadoPeriodo>();
			this.estadoperiodosEliminados= new ArrayList<EstadoPeriodo>();
						
			this.isEsNuevoEstadoPeriodo=false;
			this.esParaAccionDesdeFormularioEstadoPeriodo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPeriodo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPeriodo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPeriodoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPeriodo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPeriodo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPeriodo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPeriodo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPeriodo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPeriodo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPeriodo")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPeriodo();	
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
	
	public void cargarCombosForeignKeyEstadoPeriodo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPeriodo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPeriodoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPeriodo();
		
		this.cargarCombosFrameForeignKeyEstadoPeriodo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPeriodo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPeriodo();
		}
	}
	
	
	
	public void jButtonNuevoEstadoPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			
			if(jTableDatosEstadoPeriodo.getRowCount()>=1) {
				jTableDatosEstadoPeriodo.removeRowSelectionInterval(0, jTableDatosEstadoPeriodo.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPeriodo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPeriodo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPeriodo(true);			
			//this.estadoperiodo=new EstadoPeriodo();
			//this.estadoperiodo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPeriodo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPeriodo() ;
			
			if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPeriodo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoperiodo);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);				
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPeriodo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPeriodo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPeriodo.getSelectedRows().length;			
			}
			
			estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPeriodo--;			
				//EstadoPeriodo estadoperiodoAux= new EstadoPeriodo();			
				//estadoperiodoAux.setId(this.iIdNuevoEstadoPeriodo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPeriodo estadoperiodoOrigen=new EstadoPeriodo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPeriodo estadoperiodoOrigen : estadoperiodosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoperiodoOrigen =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoperiodoOrigen =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPeriodo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoperiodo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPeriodo(estadoperiodoOrigen,this.estadoperiodo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoperiodoLogic.getEstadoPeriodos().add(this.estadoperiodoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoperiodos.add(this.estadoperiodoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
				
				this.jTableDatosEstadoPeriodo.setRowSelectionInterval(this.getIndiceNuevoEstadoPeriodo(), this.getIndiceNuevoEstadoPeriodo());
				
				int iLastRow =  this.jTableDatosEstadoPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPeriodo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();									
		
			EstadoPeriodo estadoperiodoOrigen=new EstadoPeriodo();
			EstadoPeriodo estadoperiodoDestino=new EstadoPeriodo();
				
			estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPeriodo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoperiodosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPeriodo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoperiodoOrigen =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoperiodoOrigen =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoperiodoDestino =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoperiodoDestino =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoperiodoOrigen =estadoperiodosSeleccionados.get(0);
				estadoperiodoDestino =estadoperiodosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPeriodo(estadoperiodoOrigen,estadoperiodoDestino,true,false);
				
				estadoperiodoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoperiodoDestino,estadoperiodoLogic.getEstadoPeriodos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoperiodoDestino,estadoperiodos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
				
				//this.jTableDatosEstadoPeriodo.setRowSelectionInterval(this.getIndiceNuevoEstadoPeriodo(), this.getIndiceNuevoEstadoPeriodo());
				
				int iLastRow =  this.jTableDatosEstadoPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPeriodo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPeriodo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPeriodo.isVisible();
			
			
			this.jPanelParametrosReportesEstadoPeriodo.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPeriodo.setVisible(!isVisible);
			this.jPanelAccionesEstadoPeriodo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPeriodo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPeriodo();
			
			this.abrirFrameOrderByEstadoPeriodo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPeriodo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPeriodo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPeriodo.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPeriodo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPeriodo.setSize(this.jInternalFrameDetalleFormEstadoPeriodo.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPeriodo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPeriodo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPeriodo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPeriodo.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPeriodo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPeriodo.jContentPaneDetalleEstadoPeriodo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPeriodo.jContentPaneDetalleEstadoPeriodo.getWidth(),EstadoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPeriodo.jContentPaneDetalleEstadoPeriodo.getWidth(),EstadoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPeriodo.jContentPaneDetalleEstadoPeriodo.getWidth(),EstadoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPeriodo.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPeriodo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPeriodo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPeriodo,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPeriodo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPeriodo);
				this.jInternalFrameOrderByEstadoPeriodo.setVisible(false);
				this.jInternalFrameOrderByEstadoPeriodo.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPeriodo"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPeriodo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPeriodo==null) {
				
				this.jInternalFrameImportacionEstadoPeriodo=new ImportacionJInternalFrame(EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPeriodo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPeriodo);
				this.jInternalFrameImportacionEstadoPeriodo.setVisible(false);
				this.jInternalFrameImportacionEstadoPeriodo.setSelected(false);


				this.jInternalFrameImportacionEstadoPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPeriodo"));
				this.jInternalFrameImportacionEstadoPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPeriodo"));
				this.jInternalFrameImportacionEstadoPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPeriodo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPeriodo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPeriodo==null) {
				this.jInternalFrameReporteDinamicoEstadoPeriodo=new ReporteDinamicoJInternalFrame(EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPeriodo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPeriodo);
				this.jInternalFrameReporteDinamicoEstadoPeriodo.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPeriodo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPeriodo"));
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPeriodo"));
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPeriodo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPeriodo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoPeriodo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPeriodo);
			
	       	this.jInternalFrameDetalleFormEstadoPeriodo.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPeriodo.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPeriodo.dispose();
			//this.jInternalFrameDetalleFormEstadoPeriodo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPeriodo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPeriodo.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPeriodo.setVisible(true);
	        this.jInternalFrameImportacionEstadoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPeriodo.setVisible(true);
	        this.jInternalFrameOrderByEstadoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPeriodo.setVisible(false);
	        this.jInternalFrameOrderByEstadoPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPeriodo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPeriodo.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPeriodo.setVisible(false);
	        this.jInternalFrameImportacionEstadoPeriodo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPeriodo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPeriodo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPeriodo(true);
			//this.isEsNuevoEstadoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPeriodo(false) ;
			
			if(estadoperiodoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPeriodo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPeriodoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPeriodo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPeriodo(true);
			//this.isEsNuevoEstadoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoperiodo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPeriodo(false) ;
			
			if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPeriodo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPeriodo(false);
			
			//if(!this.isEsNuevoEstadoPeriodo) {								
				int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				
			}
			
			if(this.permiteMantenimiento(this.estadoperiodo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPeriodo=true;
					this.inicializarActualizarBindingTablaEstadoPeriodo(false);
					this.isEsNuevoEstadoPeriodo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPeriodo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPeriodo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPeriodo(false);
				
				this.habilitarDeshabilitarControlesEstadoPeriodo(false);
			
												
				
				if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPeriodo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPeriodoActionPerformed(evt,estadoperiodoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPeriodo(this.estadoperiodo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPeriodo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoperiodoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoperiodo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.estadoperiodo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.estadoperiodo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoperiodo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPeriodoModel) this.jTableDatosEstadoPeriodo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPeriodo=true;
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
				this.isEsNuevoEstadoPeriodo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPeriodo(false);
				
				this.habilitarDeshabilitarControlesEstadoPeriodo(false);
				
				
				
				if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPeriodo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPeriodo.getRowCount()>=1) {
				jTableDatosEstadoPeriodo.removeRowSelectionInterval(0, jTableDatosEstadoPeriodo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPeriodo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPeriodo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPeriodo(false) ;
			
			this.isEsNuevoEstadoPeriodo=false;
			
			if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPeriodo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPeriodo(false);
				
				//SI ES MANUAL
				if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPeriodo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPeriodo--;			
			//EstadoPeriodo estadoperiodoAux= new EstadoPeriodo();			
			//estadoperiodoAux.setId(this.iIdNuevoEstadoPeriodo);
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPeriodo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
			
			this.estadoperiodo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoperiodoLogic.getEstadoPeriodos().add(this.estadoperiodoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoperiodos.add(this.estadoperiodoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			
			this.jTableDatosEstadoPeriodo.setRowSelectionInterval(this.getIndiceNuevoEstadoPeriodo(), this.getIndiceNuevoEstadoPeriodo());
			
			int iLastRow =  this.jTableDatosEstadoPeriodo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPeriodo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPeriodo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPeriodo(false);
			
			//SI ES MANUAL
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPeriodo();
			}
			
			//this.abrirFrameTreeEstadoPeriodo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado PeriodoS ?", "MANTENIMIENTO DE Estado Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPeriodo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPeriodo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoperiodoReturnGeneral=estadoperiodoLogic.procesarImportacionEstadoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoperiodoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPeriodoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPeriodo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPeriodo.setFileImportacion(this.jInternalFrameImportacionEstadoPeriodo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPeriodo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPeriodo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPeriodo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPeriodo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		

		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPeriodoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPeriodoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPeriodoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPeriodoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoPeriodo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPeriodoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPeriodoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPeriodoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPeriodoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoPeriodo estadoperiodo:estadoperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoperiodo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPeriodo estadoperiodo:estadoperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoperiodo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(EstadoPeriodo estadoperiodo:estadoperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoperiodo.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelEstadoPeriodo(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPeriodo(estadoperiodoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPeriodo(false);
			
			//SI ES MANUAL
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPeriodo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPeriodo(false);
			
			//SI ES MANUAL
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPeriodo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPeriodo(false);
			
			//SI ES MANUAL
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPeriodo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPeriodo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPeriodo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPeriodo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPeriodo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPeriodo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPeriodo.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPeriodo.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPeriodo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPeriodo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPeriodo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPeriodo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPeriodo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPeriodo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPeriodo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPeriodo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPeriodo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPeriodo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPeriodo();
		
		this.inicializarActualizarBindingBotonesManualEstadoPeriodo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPeriodo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPeriodo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPeriodo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPeriodo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPeriodo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPeriodo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPeriodo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionNuevoEstadoPeriodo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionSinCerrarEstadoPeriodo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionSinMensajeEstadoPeriodo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPeriodo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPeriodo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPeriodo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
				this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionNuevoEstadoPeriodo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionSinCerrarEstadoPeriodo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxPostAccionSinMensajeEstadoPeriodo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPeriodo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPeriodo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPeriodo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPeriodo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPeriodo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPeriodo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPeriodo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPeriodo(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPeriodo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPeriodo() throws Exception {
		try	{
			if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPeriodo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPeriodo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPeriodo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPeriodo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPeriodo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPeriodo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPeriodo.addItem(reporte);
			}
			
			
			if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPeriodo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPeriodo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPeriodo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPeriodo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPeriodo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPeriodo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPeriodo(Boolean esInicializar) throws Exception {				
		if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPeriodo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPeriodo() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPeriodo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPeriodo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPeriodoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPeriodo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoperiodoLogic.getEstadoPeriodos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoperiodos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPeriodo.setModel(new EstadoPeriodoModel(this.estadoperiodoLogic.getEstadoPeriodos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPeriodo.setModel(new EstadoPeriodoModel(this.estadoperiodos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPeriodo!=null && this.jInternalFrameOrderByEstadoPeriodo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPeriodo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,estadoperiodoConstantesFunciones.resaltarSeleccionarEstadoPeriodo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO,estadoperiodoConstantesFunciones.resaltarSeleccionarEstadoPeriodo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,EstadoPeriodoConstantesFunciones.LABEL_ID));

		if(this.estadoperiodoConstantesFunciones.mostraridEstadoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPeriodoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoperiodoConstantesFunciones.resaltaridEstadoPeriodo,this.estadoperiodoConstantesFunciones.activaridEstadoPeriodo,this,true,"idEstadoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoperiodoConstantesFunciones.resaltaridEstadoPeriodo,this.estadoperiodoConstantesFunciones.activaridEstadoPeriodo,this,true,"idEstadoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,EstadoPeriodoConstantesFunciones.LABEL_CODIGO));

		if(this.estadoperiodoConstantesFunciones.mostrarcodigoEstadoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPeriodoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoperiodoConstantesFunciones.resaltarcodigoEstadoPeriodo,this.estadoperiodoConstantesFunciones.activarcodigoEstadoPeriodo,this,true,"codigoEstadoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoperiodoConstantesFunciones.resaltarcodigoEstadoPeriodo,this.estadoperiodoConstantesFunciones.activarcodigoEstadoPeriodo,this,true,"codigoEstadoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,EstadoPeriodoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoperiodoConstantesFunciones.mostrarnombreEstadoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPeriodoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoperiodoConstantesFunciones.resaltarnombreEstadoPeriodo,this.estadoperiodoConstantesFunciones.activarnombreEstadoPeriodo,this,true,"nombreEstadoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoperiodoConstantesFunciones.resaltarnombreEstadoPeriodo,this.estadoperiodoConstantesFunciones.activarnombreEstadoPeriodo,this,true,"nombreEstadoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO));

		if(this.estadoperiodoConstantesFunciones.mostrares_defectoEstadoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadoperiodoConstantesFunciones.resaltares_defectoEstadoPeriodo,this.estadoperiodoConstantesFunciones.activares_defectoEstadoPeriodo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadoperiodoConstantesFunciones.resaltares_defectoEstadoPeriodo,this.estadoperiodoConstantesFunciones.activares_defectoEstadoPeriodo,this,true,"es_defectoEstadoPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoPeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPeriodo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPeriodo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoperiodoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPeriodo.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoPeriodo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPeriodo.moveColumn(this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPeriodo.moveColumn(this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPeriodo.moveColumn(this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPeriodo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPeriodo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPeriodo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPeriodo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPeriodo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPeriodo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPeriodo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoperiodoLogic.getEstadoPeriodos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoperiodos.size()-1;
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
		//this.jTableDatosEstadoPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPeriodo();
			
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
				
				//this.isEsNuevoEstadoPeriodo=false;
					
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
				if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPeriodo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPeriodo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoperiodo.getsType().equals("DUPLICADO")
				   || this.estadoperiodo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPeriodo=true;
				
				} else {
					this.isEsNuevoEstadoPeriodo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoperiodo.getId()>=0 && !this.estadoperiodo.getIsNew()) {						
						this.isEsNuevoEstadoPeriodo=false;
						
					} else {
						this.isEsNuevoEstadoPeriodo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPeriodo(esRelaciones);						
				
				this.seleccionarEstadoPeriodo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoperiodo.getId()<0) {
					this.isEsNuevoEstadoPeriodo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPeriodo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPeriodo(evt,rowIndex);
				}	
				
				if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPeriodo: " + this.dDif); 
					}
				}								
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPeriodo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoperiodo)) {
					if(this.estadoperiodo.getId()>0) {
						this.estadoperiodo.setIsDeleted(true);
						
						this.estadoperiodosEliminados.add(this.estadoperiodo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoperiodoLogic.getEstadoPeriodos().remove(this.estadoperiodo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoperiodos.remove(this.estadoperiodo);				
					}
					
					
					((EstadoPeriodoModel) this.jTableDatosEstadoPeriodo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPeriodo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPeriodo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPeriodo) {
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPeriodo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPeriodo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPeriodo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPeriodo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPeriodo(EstadoPeriodo estadoperiodo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPeriodo(estadoperiodo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPeriodo(EstadoPeriodo estadoperiodo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPeriodo(estadoperiodo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPeriodo(estadoperiodo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPeriodo(estadoperiodo);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPeriodo(EstadoPeriodo estadoperiodo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setText(estadoperiodo.getId().toString());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setText(estadoperiodo.getcodigo());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setText(estadoperiodo.getnombre());
			this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setSelected(estadoperiodo.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPeriodo estadoperiodoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoperiodoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPeriodo estadoperiodoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoperiodoLocal=this.estadoperiodo;
			} else {
				estadoperiodoLocal=this.estadoperiodoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoperiodoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPeriodo(estadoperiodoLocal,true);
					
					if(estadoperiodoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoperiodoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoperiodoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPeriodo(EstadoPeriodo estadoperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPeriodo(estadoperiodo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(estadoperiodo);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPeriodo(EstadoPeriodo estadoperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPeriodo(estadoperiodo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPeriodo(EstadoPeriodo estadoperiodo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.getText()==null || this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.getText()=="" || this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setText("0");
			}

			if(conColumnasBase) {estadoperiodo.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPeriodoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelIdEstadoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoperiodo.setcodigo(this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPeriodoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelcodigoEstadoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoperiodo.setnombre(this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPeriodoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabelnombreEstadoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoperiodo.setes_defecto(this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPeriodo.jLabeles_defectoEstadoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPeriodo(EstadoPeriodo estadoperiodoBean,EstadoPeriodo estadoperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPeriodo(EstadoPeriodo estadoperiodoOrigen,EstadoPeriodo estadoperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoperiodoOrigen.getId()!=null && !estadoperiodoOrigen.getId().equals(0L))) {estadoperiodo.setId(estadoperiodoOrigen.getId());}}
			if(conDefault || (!conDefault && estadoperiodoOrigen.getcodigo()!=null && !estadoperiodoOrigen.getcodigo().equals(""))) {estadoperiodo.setcodigo(estadoperiodoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoperiodoOrigen.getnombre()!=null && !estadoperiodoOrigen.getnombre().equals(""))) {estadoperiodo.setnombre(estadoperiodoOrigen.getnombre());}
			if(conDefault || (!conDefault && estadoperiodoOrigen.getes_defecto()!=null && !estadoperiodoOrigen.getes_defecto().equals(false))) {estadoperiodo.setes_defecto(estadoperiodoOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPeriodo(EstadoPeriodo estadoperiodo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setText(estadoperiodo.getId().toString());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setText(estadoperiodo.getcodigo());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setText(estadoperiodo.getnombre());
			this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setSelected(estadoperiodo.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPeriodo(EstadoPeriodoBean estadoperiodoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setText(estadoperiodoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setText(estadoperiodoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setText(estadoperiodoBean.getnombre());
			this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setSelected(estadoperiodoBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPeriodo(EstadoPeriodoParameterReturnGeneral estadoperiodoReturnGeneral,EstadoPeriodoBean estadoperiodoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPeriodo estadoperiodoLocal=new EstadoPeriodo();
			
			estadoperiodoLocal=estadoperiodoReturnGeneral.getEstadoPeriodo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoperiodoLocal.getId()!=null && !estadoperiodoLocal.getId().equals(0L))) {estadoperiodoBean.setId(estadoperiodoLocal.getId());}}
			if(conDefault || (!conDefault && estadoperiodoLocal.getcodigo()!=null && !estadoperiodoLocal.getcodigo().equals(""))) {estadoperiodoBean.setcodigo(estadoperiodoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoperiodoLocal.getnombre()!=null && !estadoperiodoLocal.getnombre().equals(""))) {estadoperiodoBean.setnombre(estadoperiodoLocal.getnombre());}
			if(conDefault || (!conDefault && estadoperiodoLocal.getes_defecto()!=null && !estadoperiodoLocal.getes_defecto().equals(false))) {estadoperiodoBean.setes_defecto(estadoperiodoLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPeriodoGenerico(Long idEstadoPeriodoSeleccionado,JComboBox jComboBoxEstadoPeriodo,List<EstadoPeriodo> estadoperiodosLocal)throws Exception {
		try {
			EstadoPeriodo  estadoperiodoTemp=null;

			for(EstadoPeriodo estadoperiodoAux:estadoperiodosLocal) {
				if(estadoperiodoAux.getId()!=null && estadoperiodoAux.getId().equals(idEstadoPeriodoSeleccionado)) {
					estadoperiodoTemp=estadoperiodoAux;
					break;
				}
			}

			jComboBoxEstadoPeriodo.setSelectedItem(estadoperiodoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPeriodoGenerico(JComboBox jComboBoxEstadoPeriodo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPeriodo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPeriodo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoperiodo=(EstadoPeriodo) estadoperiodoLogic.getEstadoPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoperiodo =(EstadoPeriodo) estadoperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPeriodo estadoperiodoRow=new EstadoPeriodo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoperiodoRow=(EstadoPeriodo) estadoperiodoLogic.getEstadoPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoperiodoRow=(EstadoPeriodo) estadoperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPeriodo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));			
			this.jButtonDuplicarEstadoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarEstadoPeriodo && this.isPermisoDuplicarEstadoPeriodo));			
			this.jButtonCopiarEstadoPeriodo.setVisible((this.isVisibilidadCeldaCopiarEstadoPeriodo && this.isPermisoCopiarEstadoPeriodo));
			this.jButtonVerFormEstadoPeriodo.setVisible((this.isVisibilidadCeldaVerFormEstadoPeriodo && this.isPermisoVerFormEstadoPeriodo));
			
			this.jButtonAbrirOrderByEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));			
			
			this.jButtonNuevoRelacionesEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));			
			this.jButtonNuevoGuardarCambiosEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarEstadoPeriodo.setVisible((this.isVisibilidadCeldaModificarEstadoPeriodo && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.setVisible((this.isVisibilidadCeldaActualizarEstadoPeriodo && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.setVisible((this.isVisibilidadCeldaEliminarEstadoPeriodo && this.isPermisoEliminarEstadoPeriodo));
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.setVisible(this.isVisibilidadCeldaCancelarEstadoPeriodo);							
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));						
			this.jButtonDuplicarToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarEstadoPeriodo && this.isPermisoDuplicarEstadoPeriodo));						
			this.jButtonCopiarToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaCopiarEstadoPeriodo && this.isPermisoCopiarEstadoPeriodo));			
			this.jButtonVerFormToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaVerFormEstadoPeriodo && this.isPermisoVerFormEstadoPeriodo));			
			this.jButtonAbrirOrderByToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));
			this.jButtonNuevoRelacionesToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));			
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaModificarEstadoPeriodo && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaActualizarEstadoPeriodo  && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaEliminarEstadoPeriodo && this.isPermisoEliminarEstadoPeriodo));
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarToolBarEstadoPeriodo.setVisible(this.isVisibilidadCeldaCancelarEstadoPeriodo);				
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));			
			this.jMenuItemDuplicarEstadoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarEstadoPeriodo && this.isPermisoDuplicarEstadoPeriodo));			
			this.jMenuItemCopiarEstadoPeriodo.setVisible((this.isVisibilidadCeldaCopiarEstadoPeriodo && this.isPermisoCopiarEstadoPeriodo));			
			this.jMenuItemVerFormEstadoPeriodo.setVisible((this.isVisibilidadCeldaVerFormEstadoPeriodo && this.isPermisoVerFormEstadoPeriodo));			
			this.jMenuItemAbrirOrderByEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));			
			//this.jMenuItemMostrarOcultarEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));
			this.jMenuItemDetalleAbrirOrderByEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPeriodo.setVisible((this.isVisibilidadCeldaOrdenEstadoPeriodo && this.isPermisoOrdenEstadoPeriodo));			
			this.jMenuItemNuevoRelacionesEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo));			
			this.jMenuItemNuevoGuardarCambiosEstadoPeriodo.setVisible((this.isVisibilidadCeldaNuevoEstadoPeriodo && this.isPermisoNuevoEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));									
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemModificarEstadoPeriodo.setVisible((this.isVisibilidadCeldaModificarEstadoPeriodo && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemActualizarEstadoPeriodo.setVisible((this.isVisibilidadCeldaActualizarEstadoPeriodo && this.isPermisoActualizarEstadoPeriodo));	
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemEliminarEstadoPeriodo.setVisible((this.isVisibilidadCeldaEliminarEstadoPeriodo && this.isPermisoEliminarEstadoPeriodo));
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemCancelarEstadoPeriodo.setVisible(this.isVisibilidadCeldaCancelarEstadoPeriodo);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));						
			this.jMenuItemGuardarCambiosTablaEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=this.jButtonNuevoEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPeriodo=this.jButtonDuplicarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPeriodo=this.jButtonCopiarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPeriodo=this.jButtonVerFormEstadoPeriodo.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPeriodo=this.jButtonAbrirOrderByEstadoPeriodo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=this.jButtonNuevoRelacionesEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaModificarEstadoPeriodo=this.jButtonModificarEstadoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.isVisibilidadCeldaActualizarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=this.jButtonGuardarCambiosTablaEstadoPeriodo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPeriodo=this.jButtonNuevoToolBarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=this.jButtonNuevoRelacionesToolBarEstadoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.isVisibilidadCeldaModificarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarToolBarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarToolBarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarToolBarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarToolBarEstadoPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPeriodo=this.jButtonGuardarCambiosToolBarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPeriodo=this.jMenuItemNuevoEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=this.jMenuItemNuevoRelacionesEstadoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.isVisibilidadCeldaModificarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemModificarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemActualizarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemEliminarEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPeriodo=this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemCancelarEstadoPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPeriodo=this.jMenuItemGuardarCambiosEstadoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=this.jMenuItemGuardarCambiosTablaEstadoPeriodo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPeriodo(Boolean esInicializar) {
		if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPeriodo();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPeriodo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPeriodo() {
		this.jButtonNuevoEstadoPeriodo.setVisible(this.isPermisoNuevoEstadoPeriodo);			
		this.jButtonDuplicarEstadoPeriodo.setVisible(this.isPermisoDuplicarEstadoPeriodo);			
		this.jButtonCopiarEstadoPeriodo.setVisible(this.isPermisoCopiarEstadoPeriodo);			
		this.jButtonVerFormEstadoPeriodo.setVisible(this.isPermisoVerFormEstadoPeriodo);			
		
		this.jButtonAbrirOrderByEstadoPeriodo.setVisible(this.isPermisoOrdenEstadoPeriodo);					
		
		this.jButtonNuevoRelacionesEstadoPeriodo.setVisible(this.isPermisoNuevoEstadoPeriodo);			
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarEstadoPeriodo.setVisible(this.isPermisoActualizarEstadoPeriodo);	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.setVisible(this.isPermisoActualizarEstadoPeriodo);	
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.setVisible(this.isPermisoEliminarEstadoPeriodo);
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.setVisible(this.isVisibilidadCeldaCancelarEstadoPeriodo);						
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.setVisible(this.isPermisoGuardarCambiosEstadoPeriodo);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.setVisible(this.isPermisoActualizarEstadoPeriodo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPeriodo() {
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarEstadoPeriodo.setVisible(this.isPermisoActualizarEstadoPeriodo);	
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.setVisible(this.isPermisoActualizarEstadoPeriodo);	
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.setVisible(this.isPermisoEliminarEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.setVisible(this.isVisibilidadCeldaCancelarEstadoPeriodo);							
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.setVisible((this.isVisibilidadCeldaGuardarEstadoPeriodo && this.isPermisoGuardarCambiosEstadoPeriodo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPeriodo() {
		if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPeriodo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPeriodo() {
	}
	
	public void jTableDatosEstadoPeriodoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPeriodo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.getestadoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoperiodo==null) {
						this.estadoperiodo = new EstadoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				}

				if(this.estadoperiodo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoperiodo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.getestadoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoperiodo==null) {
						this.estadoperiodo = new EstadoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				}

				if(this.estadoperiodo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoperiodo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.getestadoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoperiodo==null) {
						this.estadoperiodo = new EstadoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				}

				if(this.estadoperiodo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoperiodo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoEstadoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.getestadoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoperiodo==null) {
						this.estadoperiodo = new EstadoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);
				}

				if(this.estadoperiodo.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.estadoperiodo.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoPeriodo() {
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
			this.jInternalFrameDetalleFormEstadoPeriodo.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPeriodo.dispose();
			this.jInternalFrameDetalleFormEstadoPeriodo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
			this.jInternalFrameReporteDinamicoEstadoPeriodo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPeriodo.dispose();
			this.jInternalFrameReporteDinamicoEstadoPeriodo=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPeriodo!=null) {
			this.jInternalFrameImportacionEstadoPeriodo.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPeriodo.dispose();
			this.jInternalFrameImportacionEstadoPeriodo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPeriodo();
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPeriodo")) {
				jButtonDuplicarEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPeriodo")) {
				jButtonCopiarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPeriodo")) {
				jButtonVerFormEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPeriodo")) {
				jButtonDuplicarEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPeriodo")) {
				jButtonDuplicarEstadoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPeriodo")) {
				jButtonModificarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPeriodo")) {
				jButtonModificarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPeriodo")) {
				jButtonModificarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPeriodo")) {
				jButtonActualizarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPeriodo")) {
				jButtonActualizarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPeriodo")) {
				jButtonActualizarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPeriodo")) {
				jButtonEliminarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPeriodo")) {
				jButtonEliminarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPeriodo")) {
				jButtonEliminarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPeriodo")) {
				jButtonCancelarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPeriodo")) {
				jButtonCancelarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPeriodo")) {
				jButtonCancelarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPeriodo")) {
				jButtonCerrarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPeriodo")) {
				jButtonCerrarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPeriodo")) {
				jButtonCerrarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPeriodo")) {
				jButtonMostrarOcultarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPeriodo")) {
				jButtonCancelarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPeriodo")) {
				jButtonCopiarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPeriodo")) {
				jButtonVerFormEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPeriodo")) {
				jButtonCopiarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPeriodo")) {
				jButtonVerFormEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPeriodo")) {
				jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPeriodo")) {
				jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPeriodo")) {
				jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPeriodo")) {
				jButtonAnterioresEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPeriodo")) {
				jButtonAnterioresEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPeriodo")) {
				jButtonAnterioresEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPeriodo")) {
				jButtonSiguientesEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPeriodo")) {
				jButtonSiguientesEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPeriodo")) {
				jButtonSiguientesEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPeriodo") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPeriodo")) {
				jButtonAbrirOrderByEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPeriodo") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPeriodo")) {
				jButtonMostrarOcultarEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPeriodo")) {
				jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPeriodo")) {
				jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPeriodo")) {
				jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPeriodo")) {
				jButtonCerrarReporteDinamicoEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPeriodo")) {
				jButtonGenerarReporteDinamicoEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPeriodo")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPeriodo")) {
				jButtonCerrarImportacionEstadoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPeriodo")) {
				
				jButtonGenerarImportacionEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPeriodo")) {
				
				jButtonAbrirImportacionEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPeriodo")) {
				jComboBoxTiposAccionesEstadoPeriodoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPeriodo")) {
				jComboBoxTiposRelacionesEstadoPeriodoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPeriodo")) {
				jComboBoxTiposAccionesEstadoPeriodoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPeriodo")) {
				
				jComboBoxTiposSeleccionarEstadoPeriodoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPeriodo")) {
				jTextFieldValorCampoGeneralEstadoPeriodoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPeriodo")) {
				jButtonAbrirOrderByEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPeriodo")) {
				jButtonAbrirOrderByEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPeriodo")) {
				jButtonCerrarOrderByEstadoPeriodoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPeriodoBusqueda")) {
				this.jButtonidEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPeriodoBusqueda")) {
				this.jButtoncodigoEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPeriodoBusqueda")) {
				this.jButtonnombreEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoPeriodoBusqueda")) {
				this.jButtones_defectoEstadoPeriodoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPeriodo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPeriodo estadoperiodoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoperiodoLocal=this.estadoperiodo;
			} else {
				estadoperiodoLocal=this.estadoperiodoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
							
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
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
			
			


			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
								
						
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
								
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
							
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
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
			
			


			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
								
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPeriodo")) {
					jCheckBoxSeleccionarTodosEstadoPeriodoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPeriodo")) {
					jCheckBoxSeleccionadosEstadoPeriodoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPeriodo")) {
					
				}
				
				


				
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
												
				
				


				
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
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
			
			


			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoperiodo);
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
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
				
				


				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPeriodo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoperiodoAnterior =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPeriodo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPeriodo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoperiodo =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoperiodo =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoperiodo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPeriodo")) {
				
				}
				
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPeriodo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPeriodo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPeriodo")) {
			
			}
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPeriodo();
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPeriodo")) {
				jButtonDuplicarEstadoPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPeriodo")) {
				jButtonCopiarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPeriodo")) {
				jButtonVerFormEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPeriodo")) {
				jButtonNuevoEstadoPeriodoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPeriodo")) {
				jButtonModificarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPeriodo")) {
				jButtonActualizarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPeriodo")) {
				jButtonEliminarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPeriodo")) {
				jButtonCancelarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPeriodo")) {
				jButtonCerrarEstadoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPeriodo")) {
				jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPeriodo")) {
				jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPeriodo")) {
				jButtonAbrirOrderByEstadoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPeriodo")) {
				jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPeriodo")) {
				jButtonAnterioresEstadoPeriodoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPeriodo")) {
				jButtonSiguientesEstadoPeriodoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPeriodoBusqueda")) {
				this.jButtonidEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPeriodoBusqueda")) {
				this.jButtoncodigoEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPeriodoBusqueda")) {
				this.jButtonnombreEstadoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoPeriodoBusqueda")) {
				this.jButtones_defectoEstadoPeriodoBusquedaActionPerformed(evt);
			}
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPeriodo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPeriodo")) {
				closingInternalFrameEstadoPeriodo();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPeriodo")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPeriodo = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPeriodoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPeriodo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPeriodoActionPerformed(null);
			}
			
			EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoperiodo,new Object(),this.estadoperiodoParameterGeneral,this.estadoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoperiodo)) {
			if(!esControlTabla) {
				if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);			
				}
				
				if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPeriodo(this.estadoperiodo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoperiodoReturnGeneral=estadoperiodoLogic.procesarEventosEstadoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoperiodoLogic.getEstadoPeriodos(),this.estadoperiodo,this.estadoperiodoParameterGeneral,this.isEsNuevoEstadoPeriodo,classes);//this.estadoperiodoLogic.getEstadoPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPeriodo(this.estadoperiodoReturnGeneral,this.estadoperiodoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPeriodo(classes,this.estadoperiodoReturnGeneral,this.estadoperiodoBean,false);
					}
						
					if(this.estadoperiodoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo());	
					}
						
					if(this.estadoperiodoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo(),classes);//this.estadoperiodoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPeriodo(this.estadoperiodo,classes);//this.estadoperiodoBean);									
				}
			
				if(EstadoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPeriodo(this.estadoperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPeriodo(this.estadoperiodo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoperiodoAnterior!=null) {
						this.estadoperiodo=this.estadoperiodoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoperiodoReturnGeneral=estadoperiodoLogic.procesarEventosEstadoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoperiodoLogic.getEstadoPeriodos(),this.estadoperiodo,this.estadoperiodoParameterGeneral,this.isEsNuevoEstadoPeriodo,classes);//this.estadoperiodoLogic.getEstadoPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoperiodoReturnGeneral.getEstadoPeriodo(),estadoperiodoLogic.getEstadoPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoperiodoReturnGeneral.getEstadoPeriodo(),this.estadoperiodos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPeriodo.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPeriodo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPeriodo();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPeriodo() throws Exception {
		
		EstadoPeriodoModel estadoperiodoModel=(EstadoPeriodoModel)this.jTableDatosEstadoPeriodo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoperiodoModel.estadoperiodos=this.estadoperiodoLogic.getEstadoPeriodos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoperiodoModel.estadoperiodos=this.estadoperiodos;
		}
		
		
		((EstadoPeriodoModel) this.jTableDatosEstadoPeriodo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPeriodo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoperiodoAnterior(),this.estadoperiodoLogic.getEstadoPeriodos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoperiodoAnterior(),this.estadoperiodos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPeriodo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPeriodo(EstadoPeriodo estadoperiodo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
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
										
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoperiodo,new Object(),generalEntityParameterGeneral,this.estadoperiodoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPeriodoConstantesFunciones.getClassesRelationshipsOfEstadoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPeriodoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPeriodo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoperiodo,new Object(),generalEntityParameterGeneral,this.estadoperiodoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPeriodo(EstadoPeriodoBean estadoperiodoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPeriodo(ArrayList<Classe> classes,EstadoPeriodoReturnGeneral estadoperiodoReturnGeneral,EstadoPeriodoBean estadoperiodoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPeriodo(EstadoPeriodo estadoperiodo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoperiodo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPeriodo = new EstadoPeriodoDetalleFormJInternalFrame(jDesktopPane,this.estadoperiodoSessionBean.getConGuardarRelaciones(),this.estadoperiodoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPeriodo.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPeriodo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPeriodo.estadoperiodoLogic=this.estadoperiodoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPeriodo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPeriodo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPeriodo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPeriodo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPeriodo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPeriodo"));
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarEstadoPeriodo"));

		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPeriodo"));
					
		this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemModificarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPeriodo"));
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPeriodo"));
						
		this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemActualizarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarEstadoPeriodo"));
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPeriodo"));
								
		this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemEliminarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarEstadoPeriodo"));
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPeriodo"));
					
		this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemCancelarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPeriodo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemDetalleCerrarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPeriodo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonidEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtoncodigoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonnombreEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtones_defectoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoPeriodoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPeriodo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPeriodo"));
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPeriodo"));
		}
		
		this.jTableDatosEstadoPeriodo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPeriodo"));
		
		this.jTableDatosEstadoPeriodo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPeriodo"));
		
		this.jButtonNuevoEstadoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoEstadoPeriodo"));
		
		this.jButtonDuplicarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPeriodo"));
		
		this.jButtonCopiarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"CopiarEstadoPeriodo"));
		
		this.jButtonVerFormEstadoPeriodo.addActionListener(new ButtonActionListener(this,"VerFormEstadoPeriodo"));
		
		
		this.jButtonNuevoToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPeriodo"));
			
		this.jButtonDuplicarToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPeriodo"));
			
		this.jMenuItemNuevoEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPeriodo"));
			
		this.jMenuItemDuplicarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPeriodo"));		
		
		
		this.jButtonNuevoRelacionesEstadoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPeriodo"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPeriodo"));
			
		this.jMenuItemNuevoRelacionesEstadoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarEstadoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonModificarToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPeriodo"));
			
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemModificarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonActualizarToolBarEstadoPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPeriodo"));
				
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemActualizarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarEstadoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonEliminarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPeriodo"));
						
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemEliminarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarEstadoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonCancelarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPeriodo"));
			
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemCancelarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPeriodo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPeriodo"));		
		
		
		this.jButtonCerrarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarEstadoPeriodo"));
		
		
		this.jButtonCerrarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPeriodo"));
			
		this.jMenuItemCerrarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPeriodo"));
			
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jMenuItemDetalleCerrarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPeriodo"));
		}
		
		this.jButtonCopiarToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPeriodo"));
			
		this.jButtonVerFormToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPeriodo"));
		
		this.jMenuItemGuardarCambiosEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPeriodo"));
			
		this.jMenuItemCopiarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPeriodo"));		
		
		this.jMenuItemVerFormEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPeriodo"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPeriodo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPeriodo"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPeriodo"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPeriodo"));
					
		this.jButtonRecargarInformacionToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPeriodo"));
		
		this.jMenuItemRecargarInformacionEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPeriodo"));		
		
		
		
		this.jButtonAnterioresEstadoPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPeriodo"));
		
		
		this.jButtonAnterioresToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPeriodo"));
		
		this.jMenuItemAnterioresEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPeriodo"));		
		
		
		this.jButtonSiguientesEstadoPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPeriodo"));
		
		
		this.jButtonSiguientesToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPeriodo"));
			
		this.jMenuItemSiguientesEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPeriodo"));
			
		this.jMenuItemAbrirOrderByEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPeriodo"));
			
		this.jMenuItemMostrarOcultarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPeriodo"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPeriodo"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPeriodo"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPeriodo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPeriodo"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPeriodo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPeriodo"));

		this.jCheckBoxSeleccionadosEstadoPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPeriodo"));
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPeriodo"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPeriodo.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPeriodo"));
			
		this.jComboBoxTiposAccionesEstadoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPeriodo"));
					
		this.jComboBoxTiposSeleccionarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPeriodo"));
			
		this.jTextFieldValorCampoGeneralEstadoPeriodo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonidEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtoncodigoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonnombreEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtones_defectoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoPeriodoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPeriodo"));
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPeriodo"));
				this.jInternalFrameReporteDinamicoEstadoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPeriodo"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPeriodo"));				
			//this.jButtonGenerarReporteDinamicoEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPeriodo"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPeriodo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPeriodo!=null) {
				this.jInternalFrameImportacionEstadoPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPeriodo"));
				this.jInternalFrameImportacionEstadoPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPeriodo"));
				this.jInternalFrameImportacionEstadoPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPeriodo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPeriodo"));
			
			this.jButtonAbrirOrderByToolBarEstadoPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPeriodo"));			
			
			if(this.jInternalFrameOrderByEstadoPeriodo!=null) {
				this.jInternalFrameOrderByEstadoPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPeriodo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPeriodo.jTabbedPaneRelacionesEstadoPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPeriodo"));
		
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
            		closingInternalFrameEstadoPeriodo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPeriodo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPeriodo = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPeriodoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPeriodo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPeriodoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPeriodo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPeriodo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPeriodo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPeriodo";
		inputMap = this.jButtonNuevoEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPeriodoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPeriodo";
		inputMap = this.jButtonNuevoRelacionesEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPeriodoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPeriodo";
		inputMap = this.jButtonModificarEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPeriodo";
		inputMap = this.jButtonActualizarEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPeriodo";
		inputMap = this.jButtonEliminarEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPeriodo";
		inputMap = this.jButtonCancelarEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPeriodo";
		inputMap = this.jButtonCerrarEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPeriodo";
		inputMap = this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonGuardarCambiosEstadoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPeriodo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPeriodoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonidEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtoncodigoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtonnombreEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPeriodo.jButtones_defectoEstadoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoPeriodoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPeriodo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPeriodo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
					estadoperiodoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPeriodo estadoperiodoAux:estadoperiodos) {
					estadoperiodoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
						estadoperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPeriodo estadoperiodoAux:estadoperiodos) {
						estadoperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
					
						if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoperiodoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPeriodo estadoperiodoAux:estadoperiodos) {
						
						if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoperiodoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPeriodo.getSelectedRows();
			
			EstadoPeriodo estadoperiodoLocal=new EstadoPeriodo();
			
			//this.seleccionarTodosEstadoPeriodo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoperiodoLocal =(EstadoPeriodo) this.estadoperiodoLogic.getEstadoPeriodos().toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoperiodoLocal =(EstadoPeriodo) this.estadoperiodos.toArray()[this.jTableDatosEstadoPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoperiodoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
						estadoperiodoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPeriodo estadoperiodoAux:estadoperiodos) {
						estadoperiodoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPeriodoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPeriodoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPeriodo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPeriodo estadoperiodoAux:this.estadoperiodoLogic.getEstadoPeriodos()) {
				
						if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoperiodoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoperiodoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPeriodo estadoperiodoAux:estadoperiodos) {
					
						if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoperiodoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoperiodoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPeriodoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPeriodo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPeriodo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPeriodo) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPeriodo(conSplash);
				
					this.generarReporteEstadoPeriodosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPeriodosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPeriodosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPeriodo();
				
				this.exportarEstadoPeriodosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPeriodos();
				//this.importarEstadoPeriodos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPeriodo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPeriodo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPeriodo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPeriodo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPeriodo.jComboBoxTiposAccionesFormularioEstadoPeriodo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPeriodo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPeriodo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPeriodoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPeriodo();
			
			if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
			EstadoPeriodo estadoperiodo=new EstadoPeriodo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPeriodo.getSelectedItem();
			
			
			
			
			estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoperiodosSeleccionados.size()==1) {
				for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
					estadoperiodo=estadoperiodoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPeriodo();
			
      		//this.finishProcessEstadoPeriodo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPeriodoReturnGeneral() throws Exception {
		if(this.estadoperiodoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoperiodoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoperiodoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoperiodoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPeriodo(false);
		}
		
		if(this.estadoperiodoReturnGeneral.getConRetornoLista() || this.estadoperiodoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoperiodoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoperiodoLogic.setEstadoPeriodos(this.estadoperiodoReturnGeneral.getEstadoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoperiodoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoperiodoLogic.setEstadoPeriodo(this.estadoperiodoReturnGeneral.getEstadoPeriodo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPeriodo(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPeriodo() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPeriodo> getEstadoPeriodosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPeriodo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPeriodo estadoperiodoAux:estadoperiodoLogic.getEstadoPeriodos()) {
					if(estadoperiodoAux.getIsSelected()) {
						estadoperiodosSeleccionados.add(estadoperiodoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPeriodo estadoperiodoAux:this.estadoperiodos) {
					if(estadoperiodoAux.getIsSelected()) {
						estadoperiodosSeleccionados.add(estadoperiodoAux);				
					}
				}
			}
			
			if(estadoperiodosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoperiodosSeleccionados.addAll(this.estadoperiodoLogic.getEstadoPeriodos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoperiodosSeleccionados.addAll(this.estadoperiodos);				
					}
				}
			}
		} else {
			estadoperiodosSeleccionados.add(this.estadoperiodo);
		}
		
		return estadoperiodosSeleccionados;
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
	
	public void generarReporteEstadoPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPeriodosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPeriodosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPeriodosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPeriodo();
		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPeriodo();
		
		
		//this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados ,estadoperiodoImplementable,estadoperiodoImplementableHome);
	}
	
	public void mostrarImportacionEstadoPeriodos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPeriodo();
		
		this.abrirFrameImportacionEstadoPeriodo();		
		
			
		//this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados ,estadoperiodoImplementable,estadoperiodoImplementableHome);
	}
	
	public void importarEstadoPeriodos() throws Exception {		
	
	}
	
	public void exportarEstadoPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPeriodosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPeriodosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPeriodosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPeriodo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPeriodo(estadoperiodoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoperiodoAux.setsDetalleGeneralEntityReporte(estadoperiodoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPeriodo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPeriodoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPeriodoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPeriodoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPeriodoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPeriodo(EstadoPeriodo estadoperiodo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoperiodo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoperiodo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoperiodo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoperiodo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoperiodo.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPeriodo(row);				
				iRow++;
			}				
			
			for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPeriodo(estadoperiodoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPeriodosSeleccionados() throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();		
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoperiodo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoperiodos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoperiodo");
			//elementRoot.appendChild(element);
		
			for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
				element = document.createElement("estadoperiodo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPeriodo(estadoperiodoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPeriodo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPeriodo(EstadoPeriodo estadoperiodo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoperiodo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoperiodo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoperiodo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoperiodo.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlEstadoPeriodo(EstadoPeriodo estadoperiodo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPeriodoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoperiodo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPeriodoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoperiodo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoPeriodoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoperiodo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoPeriodoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoperiodo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(EstadoPeriodoConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(estadoperiodo.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoEstadoPeriodosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPeriodo> estadoperiodosSeleccionados=new ArrayList<EstadoPeriodo>();
		
		estadoperiodosSeleccionados=this.getEstadoPeriodosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPeriodo(estadoperiodosSeleccionados);
		
		this.generarReporteEstadoPeriodos("Todos",estadoperiodosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPeriodo(ArrayList<EstadoPeriodo> estadoperiodosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPeriodo estadoperiodoAux:estadoperiodosSeleccionados) {
				estadoperiodoAux.setsDetalleGeneralEntityReporte(estadoperiodoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoperiodoAux.setsDescripcionGeneralEntityReporte1(estadoperiodoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoperiodoAux.setsDescripcionGeneralEntityReporte1(estadoperiodoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					estadoperiodoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadoperiodoAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPeriodo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPeriodo=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=true;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=true;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=true;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=true;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=true;
			this.isVisibilidadCeldaModificarEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
			this.isVisibilidadCeldaModificarEstadoPeriodo=true;
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
			this.isVisibilidadCeldaCancelarEstadoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPeriodo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=true;
		} else {
			this.actualizarEstadoPanelsEstadoPeriodo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPeriodo=false;
			//this.isVisibilidadCeldaVerFormEstadoPeriodo=false;
			this.isVisibilidadCeldaDuplicarEstadoPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoperiodoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!estadoperiodoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;												
			}
			
			this.jButtonCerrarEstadoPeriodo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPeriodo=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoperiodo)) {
			this.isVisibilidadCeldaActualizarEstadoPeriodo=false;
			this.isVisibilidadCeldaEliminarEstadoPeriodo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPeriodo() {
	}
	
	public void actualizarEstadoPanelsEstadoPeriodo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPeriodo!=null) {
				this.jScrollPanelDatosEdicionEstadoPeriodo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPeriodo!=null) {
				this.jScrollPanelDatosEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPeriodo!=null) {
				this.jPanelPaginacionEstadoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPeriodo!=null) {
				this.jPanelParametrosReportesEstadoPeriodo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPeriodoSessionBean estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		
		if(this.estadoperiodoSessionBean==null) {
			this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		}
		
		this.estadoperiodoSessionBean.setsUltimaBusquedaEstadoPeriodo(this.getsAccionBusqueda());
		this.estadoperiodoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoperiodoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPeriodoSessionBean estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		
		if(this.estadoperiodoSessionBean==null) {
			this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		}
		
		if(this.estadoperiodoSessionBean.getsUltimaBusquedaEstadoPeriodo()!=null&&!this.estadoperiodoSessionBean.getsUltimaBusquedaEstadoPeriodo().equals("")) {
			this.setsAccionBusqueda(estadoperiodoSessionBean.getsUltimaBusquedaEstadoPeriodo());
			this.setiNumeroPaginacion(estadoperiodoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoperiodoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoperiodoSessionBean.setsUltimaBusquedaEstadoPeriodo("");
		this.estadoperiodoSessionBean.setiNumeroPaginacion(EstadoPeriodoConstantesFunciones.INUMEROPAGINACION);
		this.estadoperiodoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPeriodo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPeriodo() {
		this.updateBorderResaltarBusquedasFormularioEstadoPeriodo();
		this.updateVisibilidadBusquedasFormularioEstadoPeriodo();
		this.updateHabilitarBusquedasFormularioEstadoPeriodo();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPeriodo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPeriodo() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPeriodo() {
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
	
	public void updateControlesFormularioEstadoPeriodo() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPeriodo();
		this.updateVisibilidadResaltarControlesFormularioEstadoPeriodo();
		this.updateHabilitarResaltarControlesFormularioEstadoPeriodo();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoperiodoConstantesFunciones.resaltaridEstadoPeriodo!=null && this.jInternalFrameDetalleFormEstadoPeriodo!=null) {this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setBorder(this.estadoperiodoConstantesFunciones.resaltaridEstadoPeriodo);}
		if(this.estadoperiodoConstantesFunciones.resaltarcodigoEstadoPeriodo!=null && this.jInternalFrameDetalleFormEstadoPeriodo!=null) {this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setBorder(this.estadoperiodoConstantesFunciones.resaltarcodigoEstadoPeriodo);}
		if(this.estadoperiodoConstantesFunciones.resaltarnombreEstadoPeriodo!=null && this.jInternalFrameDetalleFormEstadoPeriodo!=null) {this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setBorder(this.estadoperiodoConstantesFunciones.resaltarnombreEstadoPeriodo);}
		if(this.estadoperiodoConstantesFunciones.resaltares_defectoEstadoPeriodo!=null && this.jInternalFrameDetalleFormEstadoPeriodo!=null) {this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setBorder(this.estadoperiodoConstantesFunciones.resaltares_defectoEstadoPeriodo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPeriodo() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostraridEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jPanelidEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostraridEstadoPeriodo);
		//this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrarcodigoEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jPanelcodigoEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrarcodigoEstadoPeriodo);
		//this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrarnombreEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jPanelnombreEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrarnombreEstadoPeriodo);
		//this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrares_defectoEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jPaneles_defectoEstadoPeriodo.setVisible(this.estadoperiodoConstantesFunciones.mostrares_defectoEstadoPeriodo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPeriodo!=null) {
	
		this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldidEstadoPeriodo.setEnabled(this.estadoperiodoConstantesFunciones.activaridEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jTextFieldcodigoEstadoPeriodo.setEnabled(this.estadoperiodoConstantesFunciones.activarcodigoEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jTextAreanombreEstadoPeriodo.setEnabled(this.estadoperiodoConstantesFunciones.activarnombreEstadoPeriodo);
		this.jInternalFrameDetalleFormEstadoPeriodo.jCheckBoxes_defectoEstadoPeriodo.setEnabled(this.estadoperiodoConstantesFunciones.activares_defectoEstadoPeriodo);
		}
	}
	
		
}