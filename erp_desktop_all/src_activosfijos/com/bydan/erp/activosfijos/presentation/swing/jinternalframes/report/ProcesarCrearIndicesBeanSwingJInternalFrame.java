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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.ProcesarCrearIndicesConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ProcesarCrearIndicesParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ProcesarCrearIndicesParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ProcesarCrearIndicesBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesarCrearIndicesBeanSwingJInternalFrame extends ProcesarCrearIndicesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesarCrearIndicesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesarCrearIndices> procesarcrearindicesValidator = new ClassValidator<ProcesarCrearIndices>(ProcesarCrearIndices.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesarCrearIndices procesarcrearindices;	
	public ProcesarCrearIndices procesarcrearindicesAux;
	public ProcesarCrearIndices procesarcrearindicesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesarCrearIndices procesarcrearindicesTotales;
	public Long idProcesarCrearIndicesActual;
	public Long iIdNuevoProcesarCrearIndices=0L;
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
	
	public Boolean isPermisoTodoProcesarCrearIndices;
	public Boolean isPermisoNuevoProcesarCrearIndices;
	public Boolean isPermisoActualizarProcesarCrearIndices;
	public Boolean isPermisoActualizarOriginalProcesarCrearIndices;
	public Boolean isPermisoEliminarProcesarCrearIndices;
	public Boolean isPermisoGuardarCambiosProcesarCrearIndices;
	public Boolean isPermisoConsultaProcesarCrearIndices;
	public Boolean isPermisoBusquedaProcesarCrearIndices;
	public Boolean isPermisoReporteProcesarCrearIndices;
	public Boolean isPermisoPaginacionMedioProcesarCrearIndices;
	public Boolean isPermisoPaginacionAltoProcesarCrearIndices;
	public Boolean isPermisoPaginacionTodoProcesarCrearIndices;
	public Boolean isPermisoCopiarProcesarCrearIndices;
	public Boolean isPermisoVerFormProcesarCrearIndices;
	public Boolean isPermisoDuplicarProcesarCrearIndices;
	public Boolean isPermisoOrdenProcesarCrearIndices;
	
	
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
	
	public ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesReturnGeneral;
	public ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesarCrearIndices=false;
	public Boolean esParaAccionDesdeFormularioProcesarCrearIndices=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesarCrearIndicesSessionBeanAdditional procesarcrearindicesSessionBeanAdditional=null;
	
	public ProcesarCrearIndicesSessionBeanAdditional getProcesarCrearIndicesSessionBeanAdditional() {
		return this.procesarcrearindicesSessionBeanAdditional;
	}
	
	public void setProcesarCrearIndicesSessionBeanAdditional(ProcesarCrearIndicesSessionBeanAdditional procesarcrearindicesSessionBeanAdditional) {
		try {
			this.procesarcrearindicesSessionBeanAdditional=procesarcrearindicesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesarCrearIndicesBeanSwingJInternalFrameAdditional procesarcrearindicesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesarCrearIndicesBeanSwingJInternalFrame
	
	public ProcesarCrearIndicesBeanSwingJInternalFrameAdditional getProcesarCrearIndicesBeanSwingJInternalFrameAdditional() {
		return this.procesarcrearindicesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesarCrearIndicesBeanSwingJInternalFrameAdditional(ProcesarCrearIndicesBeanSwingJInternalFrameAdditional procesarcrearindicesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesarcrearindicesBeanSwingJInternalFrameAdditional=procesarcrearindicesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesarCrearIndicesLogic procesarcrearindicesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesarCrearIndices procesarcrearindicesBean;
	public ProcesarCrearIndicesConstantesFunciones procesarcrearindicesConstantesFunciones;
	//public ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ProcesarCrearIndices> procesarcrearindicess;	
	//public List<ProcesarCrearIndices> procesarcrearindicessEliminados;
	//public List<ProcesarCrearIndices> procesarcrearindicessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaDuplicarProcesarCrearIndices=true;
	public Boolean isVisibilidadCeldaCopiarProcesarCrearIndices=true;
	public Boolean isVisibilidadCeldaVerFormProcesarCrearIndices=true;
	public Boolean isVisibilidadCeldaOrdenProcesarCrearIndices=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaModificarProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaActualizarProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaEliminarProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaCancelarProcesarCrearIndices=false;
	public Boolean isVisibilidadCeldaGuardarProcesarCrearIndices=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesarCrearIndices=false;
	
	public Long getiIdNuevoProcesarCrearIndices() {
		return this.iIdNuevoProcesarCrearIndices;
	}

	public void setiIdNuevoProcesarCrearIndices(Long iIdNuevoProcesarCrearIndices) {
		this.iIdNuevoProcesarCrearIndices = iIdNuevoProcesarCrearIndices;
	}
	
	public Long getidProcesarCrearIndicesActual() {
		return this.idProcesarCrearIndicesActual;
	}

	public void setidProcesarCrearIndicesActual(Long idProcesarCrearIndicesActual) {
		this.idProcesarCrearIndicesActual = idProcesarCrearIndicesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesarCrearIndices getprocesarcrearindices() {
		return this.procesarcrearindices;
	}

	public void setprocesarcrearindices(ProcesarCrearIndices procesarcrearindices) {
		this.procesarcrearindices = procesarcrearindices;
	}
	
	public ProcesarCrearIndices getprocesarcrearindicesAux() {
		return this.procesarcrearindicesAux;
	}

	public void setprocesarcrearindicesAux(ProcesarCrearIndices procesarcrearindicesAux) {
		this.procesarcrearindicesAux = procesarcrearindicesAux;
	}				
	
	public ProcesarCrearIndices getprocesarcrearindicesAnterior() {
		return this.procesarcrearindicesAnterior;
	}

	public void setprocesarcrearindicesAnterior(ProcesarCrearIndices procesarcrearindicesAnterior) {
		this.procesarcrearindicesAnterior = procesarcrearindicesAnterior;
	}	
	
	public ProcesarCrearIndices getprocesarcrearindicesTotales() {
		return this.procesarcrearindicesTotales;
	}

	public void setprocesarcrearindicesTotales(ProcesarCrearIndices procesarcrearindicesTotales) {
		this.procesarcrearindicesTotales = procesarcrearindicesTotales;
	}	
	
	public ProcesarCrearIndices getprocesarcrearindicesBean() {
		return this.procesarcrearindicesBean;
	}

	public void setprocesarcrearindicesBean(ProcesarCrearIndices procesarcrearindicesBean) {
		this.procesarcrearindicesBean = procesarcrearindicesBean;
	}	
	
	public ProcesarCrearIndicesParameterReturnGeneral getprocesarcrearindicesReturnGeneral() {
		return this.procesarcrearindicesReturnGeneral;
	}

	public void setprocesarcrearindicesReturnGeneral(ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesReturnGeneral) {
		this.procesarcrearindicesReturnGeneral = procesarcrearindicesReturnGeneral;
	}	
	
	
	public Long idBusquedaProcesarCrearIndices=0L;

	public Long getidBusquedaProcesarCrearIndices() {
		return this.idBusquedaProcesarCrearIndices;
	}

	public void setidBusquedaProcesarCrearIndices(Long idBusquedaProcesarCrearIndices) {
		this.idBusquedaProcesarCrearIndices = idBusquedaProcesarCrearIndices;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesarCrearIndicesLogic getProcesarCrearIndicesLogic()	{		
		return procesarcrearindicesLogic;
	}

	public void setProcesarCrearIndicesLogic(ProcesarCrearIndicesLogic procesarcrearindicesLogic) {
		this.procesarcrearindicesLogic = procesarcrearindicesLogic;
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
	
	public Boolean getIsEsNuevoProcesarCrearIndices() {
		return isEsNuevoProcesarCrearIndices;
	}

	public void setIsEsNuevoProcesarCrearIndices(Boolean isEsNuevoProcesarCrearIndices) {
		this.isEsNuevoProcesarCrearIndices = isEsNuevoProcesarCrearIndices;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesarCrearIndices() {
		return esParaAccionDesdeFormularioProcesarCrearIndices;
	}
	
	public void setEsParaAccionDesdeFormularioProcesarCrearIndices(Boolean esParaAccionDesdeFormularioProcesarCrearIndices) {
		this.esParaAccionDesdeFormularioProcesarCrearIndices = esParaAccionDesdeFormularioProcesarCrearIndices;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProcesarCrearIndices() throws Exception {
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
		
	public ProcesarCrearIndicesParameterReturnGeneral getProcesarCrearIndicesParameterGeneral() {
		return this.procesarcrearindicesParameterGeneral;
	}
	
	public void setProcesarCrearIndicesParameterGeneral(ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesParameterGeneral) {
		this.procesarcrearindicesParameterGeneral = procesarcrearindicesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesarCrearIndices() {
		return isPermisoTodoProcesarCrearIndices;
	}

	public void setIsPermisoTodoProcesarCrearIndices(Boolean isPermisoTodoProcesarCrearIndices) {
		this.isPermisoTodoProcesarCrearIndices = isPermisoTodoProcesarCrearIndices;
	}

	public Boolean getIsPermisoNuevoProcesarCrearIndices() {
		return isPermisoNuevoProcesarCrearIndices;
	}

	public void setIsPermisoNuevoProcesarCrearIndices(Boolean isPermisoNuevoProcesarCrearIndices) {
		this.isPermisoNuevoProcesarCrearIndices = isPermisoNuevoProcesarCrearIndices;
	}

	public Boolean getIsPermisoActualizarProcesarCrearIndices() {
		return isPermisoActualizarProcesarCrearIndices;
	}

	public void setIsPermisoActualizarProcesarCrearIndices(Boolean isPermisoActualizarProcesarCrearIndices) {
		this.isPermisoActualizarProcesarCrearIndices = isPermisoActualizarProcesarCrearIndices;
	}

	public Boolean getIsPermisoEliminarProcesarCrearIndices() {
		return isPermisoEliminarProcesarCrearIndices;
	}

	public void setIsPermisoEliminarProcesarCrearIndices(Boolean isPermisoEliminarProcesarCrearIndices) {
		this.isPermisoEliminarProcesarCrearIndices = isPermisoEliminarProcesarCrearIndices;
	}

	public Boolean getIsPermisoGuardarCambiosProcesarCrearIndices() {
		return isPermisoGuardarCambiosProcesarCrearIndices;
	}

	public void setIsPermisoGuardarCambiosProcesarCrearIndices(Boolean isPermisoGuardarCambiosProcesarCrearIndices) {
		this.isPermisoGuardarCambiosProcesarCrearIndices = isPermisoGuardarCambiosProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoConsultaProcesarCrearIndices() {
		return isPermisoConsultaProcesarCrearIndices;
	}

	public void setIsPermisoConsultaProcesarCrearIndices(Boolean isPermisoConsultaProcesarCrearIndices) {
		this.isPermisoConsultaProcesarCrearIndices = isPermisoConsultaProcesarCrearIndices;
	}

	public Boolean getIsPermisoBusquedaProcesarCrearIndices() {
		return isPermisoBusquedaProcesarCrearIndices;
	}

	public void setIsPermisoBusquedaProcesarCrearIndices(Boolean isPermisoBusquedaProcesarCrearIndices) {
		this.isPermisoBusquedaProcesarCrearIndices = isPermisoBusquedaProcesarCrearIndices;
	}

	public Boolean getIsPermisoReporteProcesarCrearIndices() {
		return isPermisoReporteProcesarCrearIndices;
	}

	public void setIsPermisoReporteProcesarCrearIndices(Boolean isPermisoReporteProcesarCrearIndices) {
		this.isPermisoReporteProcesarCrearIndices = isPermisoReporteProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesarCrearIndices() {
		return isPermisoPaginacionMedioProcesarCrearIndices;
	}

	public void setIsPermisoPaginacionMedioProcesarCrearIndices(Boolean isPermisoPaginacionMedioProcesarCrearIndices) {
		this.isPermisoPaginacionMedioProcesarCrearIndices = isPermisoPaginacionMedioProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesarCrearIndices() {
		return isPermisoPaginacionTodoProcesarCrearIndices;
	}

	public void setIsPermisoPaginacionTodoProcesarCrearIndices(Boolean isPermisoPaginacionTodoProcesarCrearIndices) {
		this.isPermisoPaginacionTodoProcesarCrearIndices = isPermisoPaginacionTodoProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesarCrearIndices() {
		return isPermisoPaginacionAltoProcesarCrearIndices;
	}

	public void setIsPermisoPaginacionAltoProcesarCrearIndices(Boolean isPermisoPaginacionAltoProcesarCrearIndices) {
		this.isPermisoPaginacionAltoProcesarCrearIndices = isPermisoPaginacionAltoProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoCopiarProcesarCrearIndices() {
		return isPermisoCopiarProcesarCrearIndices;
	}

	public void setIsPermisoCopiarProcesarCrearIndices(Boolean isPermisoCopiarProcesarCrearIndices) {
		this.isPermisoCopiarProcesarCrearIndices = isPermisoCopiarProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoVerFormProcesarCrearIndices() {
		return isPermisoVerFormProcesarCrearIndices;
	}

	public void setIsPermisoVerFormProcesarCrearIndices(Boolean isPermisoVerFormProcesarCrearIndices) {
		this.isPermisoVerFormProcesarCrearIndices = isPermisoVerFormProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoDuplicarProcesarCrearIndices() {
		return isPermisoDuplicarProcesarCrearIndices;
	}

	public void setIsPermisoDuplicarProcesarCrearIndices(Boolean isPermisoDuplicarProcesarCrearIndices) {
		this.isPermisoDuplicarProcesarCrearIndices = isPermisoDuplicarProcesarCrearIndices;
	}
	
	public Boolean getIsPermisoOrdenProcesarCrearIndices() {
		return isPermisoOrdenProcesarCrearIndices;
	}

	public void setIsPermisoOrdenProcesarCrearIndices(Boolean isPermisoOrdenProcesarCrearIndices) {
		this.isPermisoOrdenProcesarCrearIndices = isPermisoOrdenProcesarCrearIndices;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesarCrearIndices() {
		return isVisibilidadCeldaNuevoProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaNuevoProcesarCrearIndices(Boolean isVisibilidadCeldaNuevoProcesarCrearIndices) {
		this.isVisibilidadCeldaNuevoProcesarCrearIndices = isVisibilidadCeldaNuevoProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesarCrearIndices() {
		return isVisibilidadCeldaDuplicarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaDuplicarProcesarCrearIndices(Boolean isVisibilidadCeldaDuplicarProcesarCrearIndices) {
		this.isVisibilidadCeldaDuplicarProcesarCrearIndices = isVisibilidadCeldaDuplicarProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesarCrearIndices() {
		return isVisibilidadCeldaCopiarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaCopiarProcesarCrearIndices(Boolean isVisibilidadCeldaCopiarProcesarCrearIndices) {
		this.isVisibilidadCeldaCopiarProcesarCrearIndices = isVisibilidadCeldaCopiarProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesarCrearIndices() {
		return isVisibilidadCeldaVerFormProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaVerFormProcesarCrearIndices(Boolean isVisibilidadCeldaVerFormProcesarCrearIndices) {
		this.isVisibilidadCeldaVerFormProcesarCrearIndices = isVisibilidadCeldaVerFormProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesarCrearIndices() {
		return isVisibilidadCeldaOrdenProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaOrdenProcesarCrearIndices(Boolean isVisibilidadCeldaOrdenProcesarCrearIndices) {
		this.isVisibilidadCeldaOrdenProcesarCrearIndices = isVisibilidadCeldaOrdenProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesarCrearIndices() {
		return isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesarCrearIndices(Boolean isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices) {
		this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices = isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesarCrearIndices() {
		return isVisibilidadCeldaModificarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaModificarProcesarCrearIndices(Boolean isVisibilidadCeldaModificarProcesarCrearIndices) {
		this.isVisibilidadCeldaModificarProcesarCrearIndices = isVisibilidadCeldaModificarProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesarCrearIndices() {
		return isVisibilidadCeldaActualizarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaActualizarProcesarCrearIndices(Boolean isVisibilidadCeldaActualizarProcesarCrearIndices) {
		this.isVisibilidadCeldaActualizarProcesarCrearIndices = isVisibilidadCeldaActualizarProcesarCrearIndices;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesarCrearIndices() {
		return isVisibilidadCeldaEliminarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaEliminarProcesarCrearIndices(Boolean isVisibilidadCeldaEliminarProcesarCrearIndices) {
		this.isVisibilidadCeldaEliminarProcesarCrearIndices = isVisibilidadCeldaEliminarProcesarCrearIndices;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesarCrearIndices() {
		return isVisibilidadCeldaCancelarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaCancelarProcesarCrearIndices(Boolean isVisibilidadCeldaCancelarProcesarCrearIndices) {
		this.isVisibilidadCeldaCancelarProcesarCrearIndices = isVisibilidadCeldaCancelarProcesarCrearIndices;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesarCrearIndices() {
		return isVisibilidadCeldaGuardarProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaGuardarProcesarCrearIndices(Boolean isVisibilidadCeldaGuardarProcesarCrearIndices) {
		this.isVisibilidadCeldaGuardarProcesarCrearIndices = isVisibilidadCeldaGuardarProcesarCrearIndices;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesarCrearIndices() {
		return isVisibilidadCeldaGuardarCambiosProcesarCrearIndices;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesarCrearIndices(Boolean isVisibilidadCeldaGuardarCambiosProcesarCrearIndices) {
		this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices = isVisibilidadCeldaGuardarCambiosProcesarCrearIndices;
	}
		
	public ProcesarCrearIndicesSessionBean getprocesarcrearindicesSessionBean() {
		return this.procesarcrearindicesSessionBean;
	}
	
	public void setprocesarcrearindicesSessionBean(ProcesarCrearIndicesSessionBean procesarcrearindicesSessionBean) {
		this.procesarcrearindicesSessionBean=procesarcrearindicesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesarCrearIndices() {
		return this.isVisibilidadBusquedaProcesarCrearIndices;
	}

	public void setisVisibilidadBusquedaProcesarCrearIndices(Boolean isVisibilidadBusquedaProcesarCrearIndices) {
		this.isVisibilidadBusquedaProcesarCrearIndices=isVisibilidadBusquedaProcesarCrearIndices;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ProcesarCrearIndices procesarcrearindices,ProcesarCrearIndices procesarcrearindicesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesarCrearIndices(procesarcrearindices);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesarcrearindicesAux.setId(procesarcrearindices.getId());
		procesarcrearindicesAux.setVersionRow(procesarcrearindices.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesarCrearIndices procesarcrearindicesLocal) throws Exception {
		
		if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesarCrearIndices procesarcrearindicesLocal) throws Exception {	
		if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProcesarCrearIndicesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesarcrearindicesValidator.getInvalidValues(this.procesarcrearindices);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesarCrearIndices procesarcrearindices,List<ProcesarCrearIndices> procesarcrearindicess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesarCrearIndices procesarcrearindices,List<ProcesarCrearIndices> procesarcrearindicess) throws Exception {
		try	{			
			ProcesarCrearIndicesConstantesFunciones.actualizarSelectedLista(procesarcrearindices,procesarcrearindicess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesarCrearIndices> procesarcrearindicessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesarcrearindicessLocal=this.procesarcrearindicesLogic.getProcesarCrearIndicess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesarcrearindicessLocal=this.procesarcrearindicess;
			}
			//ARCHITECTURE
		
			for(ProcesarCrearIndices procesarcrearindicesLocal:procesarcrearindicessLocal) {
				if(this.permiteMantenimiento(procesarcrearindicesLocal) && procesarcrearindicesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesarCrearIndicesConstantesFunciones.getProcesarCrearIndicesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
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
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
		
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
		this.iIdNuevoProcesarCrearIndices--;	
		
		
		this.procesarcrearindicesAux=new ProcesarCrearIndices();
		
		this.procesarcrearindicesAux.setId(this.iIdNuevoProcesarCrearIndices);
		this.procesarcrearindicesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesarcrearindicesLogic.getProcesarCrearIndicess().add(this.procesarcrearindicesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesarcrearindicess.add(this.procesarcrearindicesAux);
		}
		//ARCHITECTURE
		
		this.procesarcrearindices=this.procesarcrearindicesAux;
		
		if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindices);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarCrearIndices(this.procesarcrearindices);
		}
				
		//this.setDefaultControlesProcesarCrearIndices();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesarCrearIndices();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesarCrearIndices();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCrearIndices();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarCrearIndices(this.procesarcrearindicesBean,this.procesarcrearindices,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesarCrearIndices(this.procesarcrearindicesReturnGeneral,this.procesarcrearindicesBean,false);
		
		if(this.procesarcrearindicesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices());
		}
		
		if(this.procesarcrearindicesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices(),classes);//this.procesarcrearindicesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.procesarcrearindices,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesarCrearIndices();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesarCrearIndices();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.RecargarFormProcesarCrearIndices(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesarCrearIndices(false);
						
			if(procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCrearIndices();
			}
			
			this.actualizarVisualTableDatosProcesarCrearIndices();
			
			this.jTableDatosProcesarCrearIndices.setRowSelectionInterval(this.getIndiceNuevoProcesarCrearIndices(), this.getIndiceNuevoProcesarCrearIndices());
			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
						
			this.actualizarEstadoCeldasBotonesProcesarCrearIndices("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesarCrearIndices(Boolean isHabilitar) throws Exception {
			
		
	};
	
	public void setDefaultControlesProcesarCrearIndices() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesarCrearIndices(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesarcrearindicesSessionBean.setConGuardarRelaciones(true);			
			this.procesarcrearindicesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.setVisible(true);
			
					
		} else {
			//this.procesarcrearindicesSessionBean.setConGuardarRelaciones(false);			
			this.procesarcrearindicesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesarCrearIndices() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				if(procesarcrearindicesAux.getId().equals(this.iIdNuevoProcesarCrearIndices)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicess) {
				if(procesarcrearindicesAux.getId().equals(this.iIdNuevoProcesarCrearIndices)) {
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
	
	public int getIndiceActualProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				if(procesarcrearindicesAux.getId().equals(procesarcrearindices.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicess) {
				if(procesarcrearindicesAux.getId().equals(procesarcrearindices.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesarCrearIndices(ProcesarCrearIndices procesarcrearindicesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				if(procesarcrearindicesAux.getProcesarCrearIndicesOriginal().getId().equals(procesarcrearindicesOriginal.getId())) {
					existe=true;
					procesarcrearindicesOriginal.setId(procesarcrearindicesAux.getId());
					procesarcrearindicesOriginal.setVersionRow(procesarcrearindicesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicess) {
				if(procesarcrearindicesAux.getProcesarCrearIndicesOriginal().getId().equals(procesarcrearindicesOriginal.getId())) {
					existe=true;
					procesarcrearindicesOriginal.setId(procesarcrearindicesAux.getId());
					procesarcrearindicesOriginal.setVersionRow(procesarcrearindicesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesarCrearIndices(Boolean esParaCancelar) throws Exception {
		procesarcrearindicessAux=new ArrayList<ProcesarCrearIndices>();
		procesarcrearindicesAux=new ProcesarCrearIndices();
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
					if(procesarcrearindicesAux.getId()<0) {
						procesarcrearindicessAux.add(procesarcrearindicesAux);
					}		
				}
				this.iIdNuevoProcesarCrearIndices=0L;
				this.procesarcrearindicesLogic.getProcesarCrearIndicess().removeAll(procesarcrearindicessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicess) {
					if(procesarcrearindicesAux.getId()<0) {
						procesarcrearindicessAux.add(procesarcrearindicesAux);
					}		
				}
				this.iIdNuevoProcesarCrearIndices=0L;
				this.procesarcrearindicess.removeAll(procesarcrearindicessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesarCrearIndices 
					&& this.procesarcrearindicesLogic.getProcesarCrearIndicess().size()>0
					) {
					procesarcrearindicesAux=this.procesarcrearindicesLogic.getProcesarCrearIndicess().get(this.procesarcrearindicesLogic.getProcesarCrearIndicess().size() - 1);
				
					if(procesarcrearindicesAux.getId()<0) {
						this.procesarcrearindicesLogic.getProcesarCrearIndicess().remove(procesarcrearindicesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesarCrearIndices && this.procesarcrearindicess.size()>0) {
					procesarcrearindicesAux=this.procesarcrearindicess.get(this.procesarcrearindicess.size() - 1);
				
					if(procesarcrearindicesAux.getId()<0) {
						this.procesarcrearindicess.remove(procesarcrearindicesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesarCrearIndices(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesarcrearindices.getId()<0) {
				this.procesarcrearindicesLogic.getProcesarCrearIndicess().remove(this.procesarcrearindices);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesarcrearindices.getId()<0) {
				this.procesarcrearindicess.remove(this.procesarcrearindices);
			}
		}			
	}
	
	public void setEstadosInicialesProcesarCrearIndices(List<ProcesarCrearIndices> procesarcrearindicessAux) throws Exception {
		ProcesarCrearIndicesConstantesFunciones.setEstadosInicialesProcesarCrearIndices(procesarcrearindicessAux);
	}
	
	public void setEstadosInicialesProcesarCrearIndices(ProcesarCrearIndices procesarcrearindicesAux) throws Exception {
		ProcesarCrearIndicesConstantesFunciones.setEstadosInicialesProcesarCrearIndices(procesarcrearindicesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesarCrearIndicesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesarCrearIndicesActual()) {
				if(!this.isEsNuevoProcesarCrearIndices) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesarCrearIndices=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesarCrearIndicesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Procesar Crear Indices ?", "MANTENIMIENTO DE Procesar Crear Indices", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesarCrearIndices procesarcrearindices) throws Exception {
		ProcesarCrearIndicesConstantesFunciones.seleccionarAsignar(this.procesarcrearindices,procesarcrearindices);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesarCrearIndices=this.isPermisoActualizarOriginalProcesarCrearIndices;
			
			
			this.seleccionarAsignar(procesarcrearindices);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesarCrearIndices("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesarcrearindicesSessionBean.setsFuncionBusquedaRapida(this.procesarcrearindicesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesarCrearIndices) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesarCrearIndices(esParaCancelar);				
				this.cancelarNuevoProcesarCrearIndices(esParaCancelar);								
			}
			
			this.procesarcrearindices=new ProcesarCrearIndices();
			
			this.inicializarProcesarCrearIndices();
			
			this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesarCrearIndices() throws Exception {
		try {
			ProcesarCrearIndicesConstantesFunciones.inicializarProcesarCrearIndices(this.procesarcrearindices);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesarcrearindicesLogic.getProcesarCrearIndicess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesarCrearIndicess(String sAccionBusqueda,List<ProcesarCrearIndices> procesarcrearindicessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesarCrearIndices"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesarCrearIndicesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesarCrearIndicesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesarCrearIndices"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Procesar Crear Indiceses");		
		parameters.put("busquedapor", ProcesarCrearIndicesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesarCrearIndices=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesarCrearIndices);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesarCrearIndicesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesarCrearIndicesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesarCrearIndicesBean.TraerProcesarCrearIndicesBeans(procesarcrearindicessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndicesActionPerformed(null);
					//this.generarExcelReporteProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesarCrearIndicess(sAccionBusqueda,sTipoArchivoReporte,procesarcrearindicessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesarCrearIndicess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCrearIndices> procesarcrearindicessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCrearIndicess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarCrearIndices("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesarCrearIndices procesarcrearindices : procesarcrearindicessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesarCrearIndicesConstantesFunciones.generarExcelReporteDataProcesarCrearIndices("NORMAL",row,workbook,procesarcrearindices,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesarCrearIndices(String sTipo,Row row,Workbook workbook) {
		
		ProcesarCrearIndicesConstantesFunciones.generarExcelReporteHeaderProcesarCrearIndices(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesarCrearIndicess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCrearIndices> procesarcrearindicessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCrearIndicess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesarCrearIndices procesarcrearindices : procesarcrearindicessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesarCrearIndicesConstantesFunciones.getProcesarCrearIndicesDescripcion(procesarcrearindices));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
									
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesarCrearIndicess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesarCrearIndices> procesarcrearindicessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesarCrearIndices> procesarcrearindicessRespaldo=null;
		
		classes=ProcesarCrearIndicesConstantesFunciones.getClassesRelationshipsOfProcesarCrearIndices(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesarcrearindicesLogic.setDatosCliente(this.datosCliente);
		this.procesarcrearindicesLogic.setDatosDeep(this.datosDeep);
		this.procesarcrearindicesLogic.setIsConDeep(true);
		
		procesarcrearindicessRespaldo=this.procesarcrearindicesLogic.getProcesarCrearIndicess();
		
		this.procesarcrearindicesLogic.setProcesarCrearIndicess(procesarcrearindicessParaReportes);	
		this.procesarcrearindicesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesarcrearindicessParaReportes=this.procesarcrearindicesLogic.getProcesarCrearIndicess();
		this.procesarcrearindicesLogic.setProcesarCrearIndicess(procesarcrearindicessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesarCrearIndicess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesarCrearIndices("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesarCrearIndices procesarcrearindices : procesarcrearindicessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesarCrearIndices("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesarCrearIndicesConstantesFunciones.generarExcelReporteDataProcesarCrearIndices("NORMAL",row,workbook,procesarcrearindices,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesarCrearIndicesConstantesFunciones.getProcesarCrearIndicesDescripcion(procesarcrearindices));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesarCrearIndices() throws Exception {		
		this.startProcessProcesarCrearIndices(true);
	}
	
	public void startProcessProcesarCrearIndices(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesarCrearIndices ,this.jPanelParametrosReportesProcesarCrearIndices, this.jScrollPanelDatosProcesarCrearIndices,this.jPanelPaginacionProcesarCrearIndices, this.jScrollPanelDatosEdicionProcesarCrearIndices, this.jPanelAccionesProcesarCrearIndices,this.jPanelAccionesFormularioProcesarCrearIndices,this.jmenuBarProcesarCrearIndices,this.jmenuBarDetalleProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarCrearIndices=this.jTabbedPaneBusquedasProcesarCrearIndices; 
		
		final JPanel jPanelParametrosReportesProcesarCrearIndices=this.jPanelParametrosReportesProcesarCrearIndices;
		//final JScrollPane jScrollPanelDatosProcesarCrearIndices=this.jScrollPanelDatosProcesarCrearIndices;
		final JTable jTableDatosProcesarCrearIndices=this.jTableDatosProcesarCrearIndices;		
		final JPanel jPanelPaginacionProcesarCrearIndices=this.jPanelPaginacionProcesarCrearIndices;
		//final JScrollPane jScrollPanelDatosEdicionProcesarCrearIndices=this.jScrollPanelDatosEdicionProcesarCrearIndices;
		final JPanel jPanelAccionesProcesarCrearIndices=this.jPanelAccionesProcesarCrearIndices;
		
		JPanel jPanelCamposAuxiliarProcesarCrearIndices=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesarCrearIndices=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			jPanelCamposAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jPanelCamposProcesarCrearIndices;
			jPanelAccionesFormularioAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jPanelAccionesFormularioProcesarCrearIndices;
		}
		
		final JPanel jPanelCamposProcesarCrearIndices=jPanelCamposAuxiliarProcesarCrearIndices;
		final JPanel jPanelAccionesFormularioProcesarCrearIndices=jPanelAccionesFormularioAuxiliarProcesarCrearIndices;
		
		
		final JMenuBar jmenuBarProcesarCrearIndices=this.jmenuBarProcesarCrearIndices;
		final JToolBar jTtoolBarProcesarCrearIndices=this.jTtoolBarProcesarCrearIndices;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesarCrearIndices=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarCrearIndices=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			jmenuBarDetalleAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jmenuBarDetalleProcesarCrearIndices;
			jTtoolBarDetalleAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jTtoolBarDetalleProcesarCrearIndices;
		}
		
		final JMenuBar jmenuBarDetalleProcesarCrearIndices=jmenuBarDetalleAuxiliarProcesarCrearIndices;
		final JToolBar jTtoolBarDetalleProcesarCrearIndices=jTtoolBarDetalleAuxiliarProcesarCrearIndices;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarCrearIndices;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarCrearIndices;
			processRunnable.jTableDatos=jTableDatosProcesarCrearIndices;
			processRunnable.jPanelCampos=jPanelCamposProcesarCrearIndices;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarCrearIndices;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarCrearIndices;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarCrearIndices;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarCrearIndices;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarCrearIndices;
			processRunnable.jTtoolBar=jTtoolBarProcesarCrearIndices;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarCrearIndices;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarCrearIndices ,jPanelParametrosReportesProcesarCrearIndices,jTableDatosProcesarCrearIndices, /*jScrollPanelDatosProcesarCrearIndices,*/jPanelCamposProcesarCrearIndices,jPanelPaginacionProcesarCrearIndices, /*jScrollPanelDatosEdicionProcesarCrearIndices,*/ jPanelAccionesProcesarCrearIndices,jPanelAccionesFormularioProcesarCrearIndices,jmenuBarProcesarCrearIndices,jmenuBarDetalleProcesarCrearIndices,jTtoolBarProcesarCrearIndices,jTtoolBarDetalleProcesarCrearIndices);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesarCrearIndices ,jPanelParametrosReportesProcesarCrearIndices, jScrollPanelDatosProcesarCrearIndices,jPanelPaginacionProcesarCrearIndices, jScrollPanelDatosEdicionProcesarCrearIndices, jPanelAccionesProcesarCrearIndices,jPanelAccionesFormularioProcesarCrearIndices,jmenuBarProcesarCrearIndices,jmenuBarDetalleProcesarCrearIndices,jTtoolBarProcesarCrearIndices,jTtoolBarDetalleProcesarCrearIndices);
						
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
	
	public void finishProcessProcesarCrearIndices() {// throws Exception 
		this.finishProcessProcesarCrearIndices(true);
	}
	
	public void finishProcessProcesarCrearIndices(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesarCrearIndices ,this.jPanelParametrosReportesProcesarCrearIndices, this.jScrollPanelDatosProcesarCrearIndices,this.jPanelPaginacionProcesarCrearIndices, this.jScrollPanelDatosEdicionProcesarCrearIndices, this.jPanelAccionesProcesarCrearIndices,this.jPanelAccionesFormularioProcesarCrearIndices,this.jmenuBarProcesarCrearIndices,this.jmenuBarDetalleProcesarCrearIndices,this.jTtoolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesarCrearIndices=this.jTabbedPaneBusquedasProcesarCrearIndices; 
		
		final JPanel jPanelParametrosReportesProcesarCrearIndices=this.jPanelParametrosReportesProcesarCrearIndices;
		//final JScrollPane jScrollPanelDatosProcesarCrearIndices=this.jScrollPanelDatosProcesarCrearIndices;
		final JTable jTableDatosProcesarCrearIndices=this.jTableDatosProcesarCrearIndices;		
		final JPanel jPanelPaginacionProcesarCrearIndices=this.jPanelPaginacionProcesarCrearIndices;
		//final JScrollPane jScrollPanelDatosEdicionProcesarCrearIndices=this.jScrollPanelDatosEdicionProcesarCrearIndices;
		final JPanel jPanelAccionesProcesarCrearIndices=this.jPanelAccionesProcesarCrearIndices;
		
		JPanel jPanelCamposAuxiliarProcesarCrearIndices=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesarCrearIndices=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			jPanelCamposAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jPanelCamposProcesarCrearIndices;
			jPanelAccionesFormularioAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jPanelAccionesFormularioProcesarCrearIndices;
		}
		
		final JPanel jPanelCamposProcesarCrearIndices=jPanelCamposAuxiliarProcesarCrearIndices;
		final JPanel jPanelAccionesFormularioProcesarCrearIndices=jPanelAccionesFormularioAuxiliarProcesarCrearIndices;
		
		
		final JMenuBar jmenuBarProcesarCrearIndices=this.jmenuBarProcesarCrearIndices;		
		final JToolBar jTtoolBarProcesarCrearIndices=this.jTtoolBarProcesarCrearIndices;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesarCrearIndices=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesarCrearIndices=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			jmenuBarDetalleAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jmenuBarDetalleProcesarCrearIndices;
			jTtoolBarDetalleAuxiliarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jTtoolBarDetalleProcesarCrearIndices;		
		}
		
		final JMenuBar jmenuBarDetalleProcesarCrearIndices=jmenuBarDetalleAuxiliarProcesarCrearIndices;
		final JToolBar jTtoolBarDetalleProcesarCrearIndices=jTtoolBarDetalleAuxiliarProcesarCrearIndices;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesarCrearIndices;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesarCrearIndices;
			processRunnable.jTableDatos=jTableDatosProcesarCrearIndices;
			processRunnable.jPanelCampos=jPanelCamposProcesarCrearIndices;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesarCrearIndices;
			processRunnable.jPanelAcciones=jPanelAccionesProcesarCrearIndices;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesarCrearIndices;
			
			
			processRunnable.jmenuBar=jmenuBarProcesarCrearIndices;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesarCrearIndices;
			processRunnable.jTtoolBar=jTtoolBarProcesarCrearIndices;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesarCrearIndices;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesarCrearIndices ,jPanelParametrosReportesProcesarCrearIndices, jTableDatosProcesarCrearIndices,/*jScrollPanelDatosProcesarCrearIndices,*/jPanelCamposProcesarCrearIndices,jPanelPaginacionProcesarCrearIndices, /*jScrollPanelDatosEdicionProcesarCrearIndices,*/ jPanelAccionesProcesarCrearIndices,jPanelAccionesFormularioProcesarCrearIndices,jmenuBarProcesarCrearIndices,jmenuBarDetalleProcesarCrearIndices,jTtoolBarProcesarCrearIndices,jTtoolBarDetalleProcesarCrearIndices));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesarCrearIndices(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesarCrearIndices(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesarCrearIndices(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesarCrearIndices(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesarCrearIndices,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesarCrearIndices,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesarCrearIndices(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesarCrearIndices,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesarCrearIndices,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesarcrearindicesConstantesFunciones.getsFinalQueryProcesarCrearIndices();
		String  finalQueryPaginacionTodos=this.procesarcrearindicesConstantesFunciones.getsFinalQueryProcesarCrearIndices();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesarCrearIndicesConstantesFunciones.getArrayColumnasGlobalesNoProcesarCrearIndices(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesarCrearIndicesConstantesFunciones.getArrayColumnasGlobalesProcesarCrearIndices(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesarCrearIndicesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesarcrearindicessEliminados= new ArrayList<ProcesarCrearIndices>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesarCrearIndices();
		
				///*ProcesarCrearIndicesSessionBean*/this.procesarcrearindicesSessionBean=new ProcesarCrearIndicesSessionBean();
			
			if(this.procesarcrearindicesSessionBean==null) {
				this.procesarcrearindicesSessionBean=new ProcesarCrearIndicesSessionBean();
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
					this.iNumeroPaginacion=ProcesarCrearIndicesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesarCrearIndicesConstantesFunciones.getClassesForeignKeysOfProcesarCrearIndices(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesarcrearindices."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesarcrearindicessAux= new ArrayList<ProcesarCrearIndices>();
			
				
			procesarcrearindicesLogic.setDatosCliente(this.datosCliente);
			procesarcrearindicesLogic.setDatosDeep(this.datosDeep);
			procesarcrearindicesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesarCrearIndices")) {
				this.sDetalleReporte=ProcesarCrearIndicesConstantesFunciones.getDetalleIndiceBusquedaProcesarCrearIndices(idBusquedaProcesarCrearIndices);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesarcrearindicesLogic.getProcesarCrearIndicessBusquedaProcesarCrearIndices(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaProcesarCrearIndices);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarCrearIndicesConstantesFunciones.getDetalleIndiceBusquedaProcesarCrearIndices(idBusquedaProcesarCrearIndices);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarCrearIndicesConstantesFunciones.getDetalleIndiceBusquedaProcesarCrearIndices(idBusquedaProcesarCrearIndices);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesarcrearindicesLogic.getProcesarCrearIndicess()==null||procesarcrearindicesLogic.getProcesarCrearIndicess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesarcrearindicess==null|| procesarcrearindicess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcrearindicessAux=new ArrayList<ProcesarCrearIndices>();
						procesarcrearindicessAux.addAll(procesarcrearindicesLogic.getProcesarCrearIndicess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcrearindicessAux=new ArrayList<ProcesarCrearIndices>();
							procesarcrearindicessAux.addAll(procesarcrearindicess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesarcrearindicesLogic.getProcesarCrearIndicessBusquedaProcesarCrearIndices(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaProcesarCrearIndices);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesarCrearIndicesConstantesFunciones.getDetalleIndiceBusquedaProcesarCrearIndices(idBusquedaProcesarCrearIndices);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesarCrearIndicesConstantesFunciones.getDetalleIndiceBusquedaProcesarCrearIndices(idBusquedaProcesarCrearIndices);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesarCrearIndicess("BusquedaProcesarCrearIndices",procesarcrearindicesLogic.getProcesarCrearIndicess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesarCrearIndicess("BusquedaProcesarCrearIndices",procesarcrearindicess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcrearindicesLogic.setProcesarCrearIndicess(new ArrayList<ProcesarCrearIndices>());
						procesarcrearindicesLogic.getProcesarCrearIndicess().addAll(procesarcrearindicessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcrearindicess=new ArrayList<ProcesarCrearIndices>();
							procesarcrearindicess.addAll(procesarcrearindicessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesarCrearIndices();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesarCrearIndices();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarcrearindicesLogic.getProcesarCrearIndicess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcrearindicess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesarcrearindicesLogic.getProcesarCrearIndicess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesarcrearindicess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesarCrearIndices procesarcrearindices) {
		Boolean permite=true;
		
		if(this.procesarcrearindices.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesarCrearIndicesConstantesFunciones.getOrderByListaProcesarCrearIndices();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesarCrearIndicesConstantesFunciones.getOrderByListaProcesarCrearIndices();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCrearIndices procesarcrearindices:procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				if(procesarcrearindices.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcrearindicesTotales=procesarcrearindices;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCrearIndices procesarcrearindices:this.procesarcrearindicess) {
				if(procesarcrearindices.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcrearindicesTotales=procesarcrearindices;
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
			this.procesarcrearindicesAux=new ProcesarCrearIndices();
			this.procesarcrearindicesAux.setsType(Constantes2.S_TOTALES);
			this.procesarcrearindicesAux.setIsNew(false);
			this.procesarcrearindicesAux.setIsChanged(false);
			this.procesarcrearindicesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesarCrearIndicesConstantesFunciones.TotalizarValoresFilaProcesarCrearIndices(this.procesarcrearindicesLogic.getProcesarCrearIndicess(),this.procesarcrearindicesAux);
				
				//this.procesarcrearindicesLogic.getProcesarCrearIndicess().add(this.procesarcrearindicesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesarCrearIndicesConstantesFunciones.TotalizarValoresFilaProcesarCrearIndices(this.procesarcrearindicess,this.procesarcrearindicesAux);
				
				this.procesarcrearindicess.add(this.procesarcrearindicesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesarcrearindicesTotales=new ProcesarCrearIndices();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarcrearindicesLogic.getProcesarCrearIndicess().remove(procesarcrearindicesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesarcrearindicess.remove(procesarcrearindicesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesarcrearindicesTotales=new ProcesarCrearIndices();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesarCrearIndices procesarcrearindices:procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				if(procesarcrearindices.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcrearindicesTotales=procesarcrearindices;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarCrearIndicesConstantesFunciones.TotalizarValoresFilaProcesarCrearIndices(this.procesarcrearindicesLogic.getProcesarCrearIndicess(),procesarcrearindicesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesarCrearIndices procesarcrearindices:this.procesarcrearindicess) {
				if(procesarcrearindices.getsType().equals(Constantes2.S_TOTALES)) {
					procesarcrearindicesTotales=procesarcrearindices;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesarCrearIndicesConstantesFunciones.TotalizarValoresFilaProcesarCrearIndices(this.procesarcrearindicess,procesarcrearindicesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesarCrearIndicessBusquedaProcesarCrearIndices()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesarCrearIndices";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesarCrearIndicessBusquedaProcesarCrearIndices(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesarcrearindicesLogic.getProcesarCrearIndicessBusquedaProcesarCrearIndices(sFinalQuery,this.pagination,id);
				
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
	
	public void inicializarPermisosProcesarCrearIndices() {
		this.isPermisoTodoProcesarCrearIndices=false;
		this.isPermisoNuevoProcesarCrearIndices=false;
		this.isPermisoActualizarProcesarCrearIndices=false;
		this.isPermisoActualizarOriginalProcesarCrearIndices=false;
		this.isPermisoEliminarProcesarCrearIndices=false;
		this.isPermisoGuardarCambiosProcesarCrearIndices=false;
		this.isPermisoConsultaProcesarCrearIndices=true;
		this.isPermisoBusquedaProcesarCrearIndices=true;
		this.isPermisoReporteProcesarCrearIndices=true;
		this.isPermisoOrdenProcesarCrearIndices=false;		
		this.isPermisoPaginacionMedioProcesarCrearIndices=false;		
		this.isPermisoPaginacionAltoProcesarCrearIndices=false;		
		this.isPermisoPaginacionTodoProcesarCrearIndices=false;		
		this.isPermisoCopiarProcesarCrearIndices=false;		
		this.isPermisoVerFormProcesarCrearIndices=false;		
		this.isPermisoDuplicarProcesarCrearIndices=false;
		this.isPermisoOrdenProcesarCrearIndices=false;
	}
	
	public void setPermisosUsuarioProcesarCrearIndices(Boolean isPermiso) {
		this.isPermisoTodoProcesarCrearIndices=isPermiso;
		this.isPermisoNuevoProcesarCrearIndices=isPermiso;
		this.isPermisoActualizarProcesarCrearIndices=isPermiso;
		this.isPermisoActualizarOriginalProcesarCrearIndices=isPermiso;
		this.isPermisoEliminarProcesarCrearIndices=isPermiso;
		this.isPermisoGuardarCambiosProcesarCrearIndices=isPermiso;
		this.isPermisoConsultaProcesarCrearIndices=isPermiso;
		this.isPermisoBusquedaProcesarCrearIndices=isPermiso;
		this.isPermisoReporteProcesarCrearIndices=isPermiso;
		this.isPermisoOrdenProcesarCrearIndices=isPermiso;		
		this.isPermisoPaginacionMedioProcesarCrearIndices=isPermiso;		
		this.isPermisoPaginacionAltoProcesarCrearIndices=isPermiso;		
		this.isPermisoPaginacionTodoProcesarCrearIndices=isPermiso;		
		this.isPermisoCopiarProcesarCrearIndices=isPermiso;		
		this.isPermisoVerFormProcesarCrearIndices=isPermiso;		
		this.isPermisoDuplicarProcesarCrearIndices=isPermiso;
		this.isPermisoOrdenProcesarCrearIndices=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesarCrearIndices(Boolean isPermiso) {
		//this.isPermisoTodoProcesarCrearIndices=isPermiso;
		this.isPermisoNuevoProcesarCrearIndices=isPermiso;
		this.isPermisoActualizarProcesarCrearIndices=isPermiso;
		this.isPermisoActualizarOriginalProcesarCrearIndices=isPermiso;
		this.isPermisoEliminarProcesarCrearIndices=isPermiso;
		this.isPermisoGuardarCambiosProcesarCrearIndices=isPermiso;
		//this.isPermisoConsultaProcesarCrearIndices=isPermiso;
		//this.isPermisoBusquedaProcesarCrearIndices=isPermiso;
		//this.isPermisoReporteProcesarCrearIndices=isPermiso;
		//this.isPermisoOrdenProcesarCrearIndices=isPermiso;		
		//this.isPermisoPaginacionMedioProcesarCrearIndices=isPermiso;		
		//this.isPermisoPaginacionAltoProcesarCrearIndices=isPermiso;		
		//this.isPermisoPaginacionTodoProcesarCrearIndices=isPermiso;		
		//this.isPermisoCopiarProcesarCrearIndices=isPermiso;		
		//this.isPermisoDuplicarProcesarCrearIndices=isPermiso;
		//this.isPermisoOrdenProcesarCrearIndices=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesarCrearIndicesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesarCrearIndicesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesarCrearIndices(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesarCrearIndicesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesarCrearIndicesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesarCrearIndicesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesarCrearIndicesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesarCrearIndices() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesarCrearIndicesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesarCrearIndicesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesarCrearIndices=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesarCrearIndices=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesarCrearIndices=this.isPermisoActualizarProcesarCrearIndices;
			this.isPermisoEliminarProcesarCrearIndices=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesarCrearIndices=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesarCrearIndices=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesarCrearIndices=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesarCrearIndices=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesarCrearIndices=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarCrearIndices=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesarCrearIndices=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesarCrearIndices=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesarCrearIndices=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesarCrearIndices=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesarCrearIndices=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesarCrearIndices=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesarCrearIndices=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesarCrearIndices.setToolTipText(this.jTableDatosProcesarCrearIndices.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesarCrearIndices(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesarCrearIndices(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesarCrearIndicesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesarCrearIndicesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesarCrearIndices() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyProcesarCrearIndicesListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesarCrearIndicesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesarCrearIndicesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesarCrearIndices()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProcesarCrearIndices()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesarCrearIndices(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesarCrearIndices()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCrearIndices();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesarCrearIndices()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesarCrearIndices()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesarCrearIndices()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesarCrearIndices()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesarCrearIndices()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesarCrearIndices()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesarCrearIndices(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesarCrearIndices()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProcesarCrearIndicesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesarCrearIndicesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesarCrearIndicesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesarcrearindicesSessionBean=new ProcesarCrearIndicesSessionBean(); 
		this.procesarcrearindicesConstantesFunciones=new ProcesarCrearIndicesConstantesFunciones(); 
		this.procesarcrearindicesBean=new ProcesarCrearIndices();//(this.procesarcrearindicesConstantesFunciones); 		
		this.procesarcrearindicesReturnGeneral=new ProcesarCrearIndicesParameterReturnGeneral(); 
		
		this.procesarcrearindicesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcrearindicesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesarCrearIndicesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesarCrearIndicesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesarCrearIndicesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesarCrearIndices(true);
			
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
			
			this.procesarcrearindicesConstantesFunciones=new ProcesarCrearIndicesConstantesFunciones(); 
			this.procesarcrearindicesBean=new ProcesarCrearIndices();//this.procesarcrearindicesConstantesFunciones); 			
			this.procesarcrearindicesReturnGeneral=new ProcesarCrearIndicesParameterReturnGeneral(); 
		
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Crear Indices Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesarcrearindices=new ProcesarCrearIndices();
			this.procesarcrearindicess = new ArrayList<ProcesarCrearIndices>();
			this.procesarcrearindicessAux = new ArrayList<ProcesarCrearIndices>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic=new ProcesarCrearIndicesLogic();
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesarcrearindicesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesarcrearindicesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesarCrearIndices);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarCrearIndices);	
					}
					
					if(this.jInternalFrameImportacionProcesarCrearIndices!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarCrearIndices);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesarCrearIndices!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesarCrearIndices);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarCrearIndices);
				this.jInternalFrameDetalleFormProcesarCrearIndices.setVisible(false);
				this.jInternalFrameDetalleFormProcesarCrearIndices.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarCrearIndices);
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesarCrearIndices!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesarCrearIndices);
					this.jInternalFrameImportacionProcesarCrearIndices.setVisible(false);
					this.jInternalFrameImportacionProcesarCrearIndices.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesarCrearIndices!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesarCrearIndices);
					this.jInternalFrameOrderByProcesarCrearIndices.setVisible(false);
					this.jInternalFrameOrderByProcesarCrearIndices.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesarCrearIndicesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesarCrearIndicesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesarcrearindicesReturnGeneral=new ProcesarCrearIndicesParameterReturnGeneral();
			
			this.procesarcrearindicesParameterGeneral=new ProcesarCrearIndicesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesarcrearindicesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesarCrearIndicesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarCrearIndicesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado(),this.procesarcrearindicesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesarCrearIndicesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado(),this.procesarcrearindicesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaDuplicarProcesarCrearIndices=true;
			this.isVisibilidadCeldaCopiarProcesarCrearIndices=true;
			this.isVisibilidadCeldaVerFormProcesarCrearIndices=true;
			this.isVisibilidadCeldaOrdenProcesarCrearIndices=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			
			
			this.isVisibilidadBusquedaProcesarCrearIndices=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesarCrearIndices();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesarCrearIndices(false);
			
			this.setPermisosUsuarioProcesarCrearIndices();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesarcrearindicesSessionBean.getEsGuardarRelacionado() && this.procesarcrearindicesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesarCrearIndicesClasesRelacionadas();
			}
			
			if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesarCrearIndicesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesarCrearIndices();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesarCrearIndices();
			}
			
			if(!this.isPermisoBusquedaProcesarCrearIndices) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesarCrearIndicesConstantesFunciones.getTiposSeleccionarProcesarCrearIndices());
				
				this.tiposColumnasSelect=ProcesarCrearIndicesConstantesFunciones.getTiposSeleccionarProcesarCrearIndices(true);
				
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
			//if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesarCrearIndices();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProcesarCrearIndices(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProcesarCrearIndices(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCrearIndices() ;
			
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
				procesarcrearindicesImplementable= (ProcesarCrearIndicesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarCrearIndicesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesarcrearindicesImplementableHome= (ProcesarCrearIndicesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesarCrearIndicesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesarcrearindicess= new ArrayList<ProcesarCrearIndices>();
			this.procesarcrearindicessEliminados= new ArrayList<ProcesarCrearIndices>();
						
			this.isEsNuevoProcesarCrearIndices=false;
			this.esParaAccionDesdeFormularioProcesarCrearIndices=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesarCrearIndices(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesarCrearIndices();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesarCrearIndicesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesarCrearIndices("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesarCrearIndices(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesarCrearIndices();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesarCrearIndices();
			}
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesarCrearIndices.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesarCrearIndices.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesarCrearIndices.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesarCrearIndices(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesarCrearIndices: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesarCrearIndices() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesarCrearIndices")) {
				iIndex=this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesarCrearIndices();	
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
	
	public void cargarCombosForeignKeyProcesarCrearIndices(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesarCrearIndices(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesarCrearIndices(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesarCrearIndicesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesarCrearIndices();
		
		this.cargarCombosFrameForeignKeyProcesarCrearIndices();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesarCrearIndices();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesarCrearIndices();
		}
	}
	
	
	
	public void jButtonNuevoProcesarCrearIndicesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			
			if(jTableDatosProcesarCrearIndices.getRowCount()>=1) {
				jTableDatosProcesarCrearIndices.removeRowSelectionInterval(0, jTableDatosProcesarCrearIndices.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesarCrearIndices=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesarCrearIndices(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesarCrearIndices(true);			
			//this.procesarcrearindices=new ProcesarCrearIndices();
			//this.procesarcrearindices.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCrearIndices(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices() ;
			
			if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCrearIndices(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesarcrearindices);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);				
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesarCrearIndices: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesarCrearIndicesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesarCrearIndices.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesarCrearIndices.getSelectedRows().length;			
			}
			
			procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesarCrearIndices--;			
				//ProcesarCrearIndices procesarcrearindicesAux= new ProcesarCrearIndices();			
				//procesarcrearindicesAux.setId(this.iIdNuevoProcesarCrearIndices);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesarCrearIndices procesarcrearindicesOrigen=new ProcesarCrearIndices();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesarCrearIndices procesarcrearindicesOrigen : procesarcrearindicessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesarcrearindicesOrigen =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesarcrearindicesOrigen =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesarCrearIndices();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesarcrearindices.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesarCrearIndices(procesarcrearindicesOrigen,this.procesarcrearindices,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarcrearindicesLogic.getProcesarCrearIndicess().add(this.procesarcrearindicesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarcrearindicess.add(this.procesarcrearindicesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
				
				this.jTableDatosProcesarCrearIndices.setRowSelectionInterval(this.getIndiceNuevoProcesarCrearIndices(), this.getIndiceNuevoProcesarCrearIndices());
				
				int iLastRow =  this.jTableDatosProcesarCrearIndices.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarCrearIndices.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarCrearIndices.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();									
		
			ProcesarCrearIndices procesarcrearindicesOrigen=new ProcesarCrearIndices();
			ProcesarCrearIndices procesarcrearindicesDestino=new ProcesarCrearIndices();
				
			procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesarCrearIndices.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesarcrearindicessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesarCrearIndices.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcrearindicesOrigen =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarcrearindicesOrigen =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesarcrearindicesDestino =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesarcrearindicesDestino =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesarcrearindicesOrigen =procesarcrearindicessSeleccionados.get(0);
				procesarcrearindicesDestino =procesarcrearindicessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesarCrearIndices(procesarcrearindicesOrigen,procesarcrearindicesDestino,true,false);
				
				procesarcrearindicesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesarcrearindicesDestino,procesarcrearindicesLogic.getProcesarCrearIndicess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesarcrearindicesDestino,procesarcrearindicess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
				
				//this.jTableDatosProcesarCrearIndices.setRowSelectionInterval(this.getIndiceNuevoProcesarCrearIndices(), this.getIndiceNuevoProcesarCrearIndices());
				
				int iLastRow =  this.jTableDatosProcesarCrearIndices.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesarCrearIndices.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesarCrearIndices.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesarCrearIndices.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesarCrearIndices.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesarCrearIndices.setVisible(!isVisible);
			this.jPanelPaginacionProcesarCrearIndices.setVisible(!isVisible);
			this.jPanelAccionesProcesarCrearIndices.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesarCrearIndices();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesarCrearIndices();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesarCrearIndices();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesarCrearIndices();
			
			this.abrirFrameOrderByProcesarCrearIndices();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesarCrearIndices();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesarCrearIndices(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarCrearIndices);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesarCrearIndices.isMaximum()) {
					this.jInternalFrameDetalleFormProcesarCrearIndices.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesarCrearIndices.setSize(this.jInternalFrameDetalleFormProcesarCrearIndices.iWidthFormulario,this.jInternalFrameDetalleFormProcesarCrearIndices.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesarCrearIndices.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesarCrearIndices.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesarCrearIndices.isMaximum()) {
						this.jInternalFrameDetalleFormProcesarCrearIndices.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesarCrearIndices.jContentPaneDetalleProcesarCrearIndices.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesarCrearIndices.jContentPaneDetalleProcesarCrearIndices.getWidth(),ProcesarCrearIndicesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesarCrearIndices.jContentPaneDetalleProcesarCrearIndices.getWidth(),ProcesarCrearIndicesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesarCrearIndices.jContentPaneDetalleProcesarCrearIndices.getWidth(),ProcesarCrearIndicesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesarCrearIndices.setVisible(true);
	        this.jInternalFrameDetalleFormProcesarCrearIndices.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesarCrearIndices() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesarCrearIndices==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesarCrearIndices=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCrearIndices,false,this);
				} else {
					this.jInternalFrameOrderByProcesarCrearIndices=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesarCrearIndices,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesarCrearIndices);
				this.jInternalFrameOrderByProcesarCrearIndices.setVisible(false);
				this.jInternalFrameOrderByProcesarCrearIndices.setSelected(false);
				
				this.jInternalFrameOrderByProcesarCrearIndices.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarCrearIndices"));
				
				this.inicializarActualizarBindingTablaOrderByProcesarCrearIndices();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesarCrearIndices() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesarCrearIndices==null) {
				
				this.jInternalFrameImportacionProcesarCrearIndices=new ImportacionJInternalFrame(ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesarCrearIndices);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesarCrearIndices);
				this.jInternalFrameImportacionProcesarCrearIndices.setVisible(false);
				this.jInternalFrameImportacionProcesarCrearIndices.setSelected(false);


				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarCrearIndices"));
				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarCrearIndices"));
				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarCrearIndices"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesarCrearIndices() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesarCrearIndices==null) {
				this.jInternalFrameReporteDinamicoProcesarCrearIndices=new ReporteDinamicoJInternalFrame(ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesarCrearIndices);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesarCrearIndices);
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCrearIndices"));
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCrearIndices"));
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCrearIndices"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCrearIndices();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesarCrearIndices() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesarCrearIndices);
			
	       	this.jInternalFrameDetalleFormProcesarCrearIndices.setVisible(false);
	        this.jInternalFrameDetalleFormProcesarCrearIndices.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesarCrearIndices.dispose();
			//this.jInternalFrameDetalleFormProcesarCrearIndices=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesarCrearIndices() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesarCrearIndices.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesarCrearIndices.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesarCrearIndices() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesarCrearIndices.setVisible(true);
	        this.jInternalFrameImportacionProcesarCrearIndices.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesarCrearIndices() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesarCrearIndices.setVisible(true);
	        this.jInternalFrameOrderByProcesarCrearIndices.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesarCrearIndices() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesarCrearIndices.setVisible(false);
	        this.jInternalFrameOrderByProcesarCrearIndices.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesarCrearIndices() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesarCrearIndices.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesarCrearIndices.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesarCrearIndices() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesarCrearIndices.setVisible(false);
	        this.jInternalFrameImportacionProcesarCrearIndices.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesarCrearIndices(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesarCrearIndices(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesarCrearIndices(true);
			//this.isEsNuevoProcesarCrearIndices=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesarCrearIndices("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCrearIndices(false) ;
			
			if(procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCrearIndices(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesarCrearIndicesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesarCrearIndices(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesarCrearIndices(true);
			//this.isEsNuevoProcesarCrearIndices=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesarcrearindices.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesarCrearIndices("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesarCrearIndices(false) ;
			
			if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesarCrearIndices(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesarCrearIndices(false);
			
			//if(!this.isEsNuevoProcesarCrearIndices) {								
				int intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.procesarcrearindices,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
				
			}
			
			if(this.permiteMantenimiento(this.procesarcrearindices)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesarCrearIndices=true;
					this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
					this.isEsNuevoProcesarCrearIndices=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesarCrearIndices=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesarCrearIndices=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarCrearIndices(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(false);
				
				this.habilitarDeshabilitarControlesProcesarCrearIndices(false);
			
												
				
				if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesarCrearIndices();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesarCrearIndicesActionPerformed(evt,procesarcrearindicesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesarCrearIndices(this.procesarcrearindices,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesarCrearIndices.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesarcrearindicesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesarcrearindices.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				this.procesarcrearindices.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				this.procesarcrearindices.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesarcrearindices)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesarCrearIndicesModel) this.jTableDatosProcesarCrearIndices.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesarCrearIndices=true;
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
				this.isEsNuevoProcesarCrearIndices=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesarCrearIndices(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(false);
				
				this.habilitarDeshabilitarControlesProcesarCrearIndices(false);
				
				
				
				if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesarCrearIndices();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesarCrearIndices.getRowCount()>=1) {
				jTableDatosProcesarCrearIndices.removeRowSelectionInterval(0, jTableDatosProcesarCrearIndices.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesarCrearIndices(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesarCrearIndices(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(false) ;
			
			this.isEsNuevoProcesarCrearIndices=false;
			
			if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesarCrearIndices();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesarCrearIndices(false);
				
				//SI ES MANUAL
				if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesarCrearIndices();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesarCrearIndices--;			
			//ProcesarCrearIndices procesarcrearindicesAux= new ProcesarCrearIndices();			
			//procesarcrearindicesAux.setId(this.iIdNuevoProcesarCrearIndices);
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesarCrearIndices();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
			
			this.procesarcrearindices.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesarcrearindicesLogic.getProcesarCrearIndicess().add(this.procesarcrearindicesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesarcrearindicess.add(this.procesarcrearindicesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			
			this.jTableDatosProcesarCrearIndices.setRowSelectionInterval(this.getIndiceNuevoProcesarCrearIndices(), this.getIndiceNuevoProcesarCrearIndices());
			
			int iLastRow =  this.jTableDatosProcesarCrearIndices.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesarCrearIndices.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesarCrearIndices.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCrearIndices(false);
			
			//SI ES MANUAL
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCrearIndices();
			}
			
			//this.abrirFrameTreeProcesarCrearIndices();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesarCrearIndices.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesarCrearIndices.setFileImportacion(this.jInternalFrameImportacionProcesarCrearIndices.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesarCrearIndices.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesarCrearIndices.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesarCrearIndices.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesarCrearIndices.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		

		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesarCrearIndicesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesarCrearIndicesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		if(this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
								
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
								
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
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
	
	
	
	public void jButtonGenerarExcelReporteDinamicoProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesarCrearIndicess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
										
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelProcesarCrearIndices(row);				
			//	iRow++;
			//}				
			
			//for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesarCrearIndices(procesarcrearindicesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesarCrearIndices(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCrearIndices(false);
			
			//SI ES MANUAL
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesarCrearIndices();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCrearIndices(false);
			
			//SI ES MANUAL
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarCrearIndices();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesarCrearIndices(false);
			
			//SI ES MANUAL
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesarCrearIndices();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesarCrearIndices() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesarCrearIndices.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesarCrearIndices.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesarCrearIndices.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesarCrearIndices.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesarCrearIndices.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesarCrearIndices.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesarCrearIndices.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesarCrearIndices(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesarCrearIndices(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesarCrearIndices(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesarCrearIndices(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesarCrearIndices(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesarCrearIndices(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCrearIndices(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesarCrearIndices(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesarCrearIndices() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesarCrearIndices();
		
		this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarCrearIndices();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCrearIndices() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCrearIndices(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCrearIndices(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesarCrearIndices.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesarCrearIndices.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesarCrearIndices.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionNuevoProcesarCrearIndices.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionSinCerrarProcesarCrearIndices.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionSinMensajeProcesarCrearIndices.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesarCrearIndices.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesarCrearIndices.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesarCrearIndices.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
				this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionNuevoProcesarCrearIndices.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionSinCerrarProcesarCrearIndices.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesarCrearIndices.jCheckBoxPostAccionSinMensajeProcesarCrearIndices.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesarCrearIndices.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesarCrearIndices.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesarCrearIndices.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesarCrearIndices.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesarCrearIndices.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesarCrearIndices.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesarCrearIndices.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesarCrearIndices.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesarCrearIndices.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesarCrearIndices(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesarCrearIndices(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesarCrearIndices() throws Exception {
		try	{
			if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarCrearIndices();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarCrearIndices() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesarCrearIndices() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesarCrearIndices.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesarCrearIndices.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesarCrearIndices.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesarCrearIndices.addItem(reporte);
			}
			
			
			if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesarCrearIndices.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesarCrearIndices.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesarCrearIndices.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesarCrearIndices.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesarCrearIndices.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesarCrearIndices.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesarCrearIndices.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCrearIndices();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesarCrearIndices() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesarCrearIndices()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaProcesarCrearIndices=Long.parseLong(this.jLabelidProcesarCrearIndicesBusquedaProcesarCrearIndices.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesarCrearIndices(Boolean esInicializar) throws Exception {				
		if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesarCrearIndices();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesarCrearIndices() throws Exception {
		this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesarCrearIndices() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesarCrearIndicesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesarCrearIndicesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesarCrearIndicesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCrearIndicesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesarCrearIndicesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesarCrearIndicesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesarCrearIndices(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesarcrearindicesLogic.getProcesarCrearIndicess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesarcrearindicess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesarCrearIndices.setModel(new ProcesarCrearIndicesModel(this.procesarcrearindicesLogic.getProcesarCrearIndicess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesarCrearIndices.setModel(new ProcesarCrearIndicesModel(this.procesarcrearindicess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesarCrearIndices!=null && this.jInternalFrameOrderByProcesarCrearIndices.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesarCrearIndices();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesarCrearIndices.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesarCrearIndices,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesarCrearIndicesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,procesarcrearindicesConstantesFunciones.resaltarSeleccionarProcesarCrearIndices,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO,procesarcrearindicesConstantesFunciones.resaltarSeleccionarProcesarCrearIndices,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			
			
		} else {
		}			
					
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarCrearIndices.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesarCrearIndices.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesarCrearIndices.addColumn(tableColumn);
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
			
			this.jTableDatosProcesarCrearIndices.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesarCrearIndices.moveColumn(this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesarCrearIndices.moveColumn(this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesarCrearIndices.moveColumn(this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesarCrearIndices.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesarCrearIndices.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesarCrearIndices,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesarCrearIndices.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesarCrearIndices.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesarCrearIndices.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesarCrearIndices.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesarCrearIndices.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesarcrearindicesLogic.getProcesarCrearIndicess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesarcrearindicess.size()-1;
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
		//this.jTableDatosProcesarCrearIndices.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesarCrearIndices.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesarCrearIndices();
			
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
				
				//this.isEsNuevoProcesarCrearIndices=false;
					
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
				if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarCrearIndices.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarCrearIndices.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesarcrearindices.getsType().equals("DUPLICADO")
				   || this.procesarcrearindices.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesarCrearIndices=true;
				
				} else {
					this.isEsNuevoProcesarCrearIndices=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesarcrearindices.getId()>=0 && !this.procesarcrearindices.getIsNew()) {						
						this.isEsNuevoProcesarCrearIndices=false;
						
					} else {
						this.isEsNuevoProcesarCrearIndices=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesarCrearIndices(esRelaciones);						
				
				this.seleccionarProcesarCrearIndices(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesarcrearindices.getId()<0) {
					this.isEsNuevoProcesarCrearIndices=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesarCrearIndices(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesarCrearIndices(evt,rowIndex);
				}	
				
				if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesarCrearIndices: " + this.dDif); 
					}
				}								
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesarCrearIndices(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesarcrearindices)) {
					if(this.procesarcrearindices.getId()>0) {
						this.procesarcrearindices.setIsDeleted(true);
						
						this.procesarcrearindicessEliminados.add(this.procesarcrearindices);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesarcrearindicesLogic.getProcesarCrearIndicess().remove(this.procesarcrearindices);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesarcrearindicess.remove(this.procesarcrearindices);				
					}
					
					
					((ProcesarCrearIndicesModel) this.jTableDatosProcesarCrearIndices.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesarCrearIndices(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesarCrearIndices(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesarCrearIndices) {
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesarCrearIndices.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesarCrearIndices.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindices);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesarCrearIndices("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesarCrearIndices(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesarCrearIndices() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesarCrearIndices(procesarcrearindices,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesarCrearIndices(procesarcrearindices);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesarCrearIndices(procesarcrearindices,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesarCrearIndices(procesarcrearindices);
	}
	
	public void setVariablesObjetoActualToFormularioProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesarCrearIndices procesarcrearindicesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesarcrearindicesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesarCrearIndices procesarcrearindicesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesarcrearindicesLocal=this.procesarcrearindices;
			} else {
				procesarcrearindicesLocal=this.procesarcrearindicesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesarcrearindicesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesarCrearIndices(procesarcrearindicesLocal,true);
					
					if(procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesarcrearindicesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesarcrearindicesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarCrearIndices(procesarcrearindices,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(procesarcrearindices);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesarCrearIndices(procesarcrearindices,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesarCrearIndices(ProcesarCrearIndices procesarcrearindicesBean,ProcesarCrearIndices procesarcrearindices,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesarCrearIndices(ProcesarCrearIndices procesarcrearindicesOrigen,ProcesarCrearIndices procesarcrearindices,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesarcrearindicesOrigen.getId()!=null && !procesarcrearindicesOrigen.getId().equals(0L))) {procesarcrearindices.setId(procesarcrearindicesOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesarCrearIndices(ProcesarCrearIndicesBean procesarcrearindicesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesarCrearIndices(ProcesarCrearIndicesParameterReturnGeneral procesarcrearindicesReturnGeneral,ProcesarCrearIndicesBean procesarcrearindicesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesarCrearIndices procesarcrearindicesLocal=new ProcesarCrearIndices();
			
			procesarcrearindicesLocal=procesarcrearindicesReturnGeneral.getProcesarCrearIndices();
			
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesarCrearIndicesGenerico(Long idProcesarCrearIndicesSeleccionado,JComboBox jComboBoxProcesarCrearIndices,List<ProcesarCrearIndices> procesarcrearindicessLocal)throws Exception {
		try {
			ProcesarCrearIndices  procesarcrearindicesTemp=null;

			for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessLocal) {
				if(procesarcrearindicesAux.getId()!=null && procesarcrearindicesAux.getId().equals(idProcesarCrearIndicesSeleccionado)) {
					procesarcrearindicesTemp=procesarcrearindicesAux;
					break;
				}
			}

			jComboBoxProcesarCrearIndices.setSelectedItem(procesarcrearindicesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesarCrearIndicesGenerico(JComboBox jComboBoxProcesarCrearIndices,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesarCrearIndices.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarCrearIndices.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesarCrearIndices.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesarCrearIndices.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarCrearIndices.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesarCrearIndices.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesarCrearIndices.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesarCrearIndices.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesarCrearIndices.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesarCrearIndices.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcrearindices=(ProcesarCrearIndices) procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarcrearindices =(ProcesarCrearIndices) procesarcrearindicess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesarCrearIndices procesarcrearindicesRow=new ProcesarCrearIndices();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcrearindicesRow=(ProcesarCrearIndices) procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesarcrearindicesRow=(ProcesarCrearIndices) procesarcrearindicess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesarCrearIndices(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));			
			this.jButtonDuplicarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaDuplicarProcesarCrearIndices && this.isPermisoDuplicarProcesarCrearIndices));			
			this.jButtonCopiarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaCopiarProcesarCrearIndices && this.isPermisoCopiarProcesarCrearIndices));
			this.jButtonVerFormProcesarCrearIndices.setVisible((this.isVisibilidadCeldaVerFormProcesarCrearIndices && this.isPermisoVerFormProcesarCrearIndices));
			
			this.jButtonAbrirOrderByProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));			
			
			this.jButtonNuevoRelacionesProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));			
			this.jButtonNuevoGuardarCambiosProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaModificarProcesarCrearIndices && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaActualizarProcesarCrearIndices && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaEliminarProcesarCrearIndices && this.isPermisoEliminarProcesarCrearIndices));
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.setVisible(this.isVisibilidadCeldaCancelarProcesarCrearIndices);							
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));						
			this.jButtonDuplicarToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaDuplicarProcesarCrearIndices && this.isPermisoDuplicarProcesarCrearIndices));						
			this.jButtonCopiarToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaCopiarProcesarCrearIndices && this.isPermisoCopiarProcesarCrearIndices));			
			this.jButtonVerFormToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaVerFormProcesarCrearIndices && this.isPermisoVerFormProcesarCrearIndices));			
			this.jButtonAbrirOrderByToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));
			this.jButtonNuevoRelacionesToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));			
			this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));			
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaModificarProcesarCrearIndices && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaActualizarProcesarCrearIndices  && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaEliminarProcesarCrearIndices && this.isPermisoEliminarProcesarCrearIndices));
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarToolBarProcesarCrearIndices.setVisible(this.isVisibilidadCeldaCancelarProcesarCrearIndices);				
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));			
			this.jMenuItemDuplicarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaDuplicarProcesarCrearIndices && this.isPermisoDuplicarProcesarCrearIndices));			
			this.jMenuItemCopiarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaCopiarProcesarCrearIndices && this.isPermisoCopiarProcesarCrearIndices));			
			this.jMenuItemVerFormProcesarCrearIndices.setVisible((this.isVisibilidadCeldaVerFormProcesarCrearIndices && this.isPermisoVerFormProcesarCrearIndices));			
			this.jMenuItemAbrirOrderByProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));			
			//this.jMenuItemMostrarOcultarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));
			this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));			
			//this.jMenuItemDetalleMostrarOcultarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaOrdenProcesarCrearIndices && this.isPermisoOrdenProcesarCrearIndices));			
			this.jMenuItemNuevoRelacionesProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices));			
			this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices.setVisible((this.isVisibilidadCeldaNuevoProcesarCrearIndices && this.isPermisoNuevoProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));									
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemModificarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaModificarProcesarCrearIndices && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemActualizarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaActualizarProcesarCrearIndices && this.isPermisoActualizarProcesarCrearIndices));	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemEliminarProcesarCrearIndices.setVisible((this.isVisibilidadCeldaEliminarProcesarCrearIndices && this.isPermisoEliminarProcesarCrearIndices));
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemCancelarProcesarCrearIndices.setVisible(this.isVisibilidadCeldaCancelarProcesarCrearIndices);				
			}
			
			this.jMenuItemGuardarCambiosProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));						
			this.jMenuItemGuardarCambiosTablaProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=this.jButtonNuevoProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaDuplicarProcesarCrearIndices=this.jButtonDuplicarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaCopiarProcesarCrearIndices=this.jButtonCopiarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaVerFormProcesarCrearIndices=this.jButtonVerFormProcesarCrearIndices.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesarCrearIndices=this.jButtonAbrirOrderByProcesarCrearIndices.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=this.jButtonNuevoRelacionesProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaModificarProcesarCrearIndices=this.jButtonModificarProcesarCrearIndices.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaGuardarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=this.jButtonGuardarCambiosTablaProcesarCrearIndices.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=this.jButtonNuevoToolBarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=this.jButtonNuevoRelacionesToolBarProcesarCrearIndices.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.isVisibilidadCeldaModificarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarToolBarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarToolBarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarToolBarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarToolBarProcesarCrearIndices.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarCrearIndices=this.jButtonGuardarCambiosToolBarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=this.jMenuItemNuevoProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=this.jMenuItemNuevoRelacionesProcesarCrearIndices.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.isVisibilidadCeldaModificarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemModificarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemActualizarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemEliminarProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemCancelarProcesarCrearIndices.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesarCrearIndices=this.jMenuItemGuardarCambiosProcesarCrearIndices.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=this.jMenuItemGuardarCambiosTablaProcesarCrearIndices.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesarCrearIndices(Boolean esInicializar) {
		if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarCrearIndices();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesarCrearIndices(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesarCrearIndices() {
		this.jButtonNuevoProcesarCrearIndices.setVisible(this.isPermisoNuevoProcesarCrearIndices);			
		this.jButtonDuplicarProcesarCrearIndices.setVisible(this.isPermisoDuplicarProcesarCrearIndices);			
		this.jButtonCopiarProcesarCrearIndices.setVisible(this.isPermisoCopiarProcesarCrearIndices);			
		this.jButtonVerFormProcesarCrearIndices.setVisible(this.isPermisoVerFormProcesarCrearIndices);			
		
		this.jButtonAbrirOrderByProcesarCrearIndices.setVisible(this.isPermisoOrdenProcesarCrearIndices);					
		
		this.jButtonNuevoRelacionesProcesarCrearIndices.setVisible(this.isPermisoNuevoProcesarCrearIndices);			
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarProcesarCrearIndices.setVisible(this.isPermisoActualizarProcesarCrearIndices);	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.setVisible(this.isPermisoActualizarProcesarCrearIndices);	
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.setVisible(this.isPermisoEliminarProcesarCrearIndices);
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.setVisible(this.isVisibilidadCeldaCancelarProcesarCrearIndices);						
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.setVisible(this.isPermisoGuardarCambiosProcesarCrearIndices);							
		}
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.setVisible(this.isPermisoActualizarProcesarCrearIndices);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarCrearIndices() {
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarProcesarCrearIndices.setVisible(this.isPermisoActualizarProcesarCrearIndices);	
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.setVisible(this.isPermisoActualizarProcesarCrearIndices);	
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.setVisible(this.isPermisoEliminarProcesarCrearIndices);
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.setVisible(this.isVisibilidadCeldaCancelarProcesarCrearIndices);							
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.setVisible((this.isVisibilidadCeldaGuardarProcesarCrearIndices && this.isPermisoGuardarCambiosProcesarCrearIndices));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesarCrearIndices() {
		if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesarCrearIndices();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesarCrearIndices() {
	}
	
	public void jTableDatosProcesarCrearIndicesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesarCrearIndices(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesarCrearIndicesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.getprocesarcrearindices(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesarcrearindices==null) {
						this.procesarcrearindices = new ProcesarCrearIndices();
					}

					this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.procesarcrearindices,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);
				}

				if(this.procesarcrearindices.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesarcrearindices.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesarCrearIndices(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesarCrearIndicesProcesarCrearIndicesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);

			this.getProcesarCrearIndicessBusquedaProcesarCrearIndices();

			this.inicializarActualizarBindingProcesarCrearIndices(false);

			//if(ProcesarCrearIndicesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesarcrearindicesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesarCrearIndices() {
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesarCrearIndices.dispose();
			this.jInternalFrameDetalleFormProcesarCrearIndices=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
			this.jInternalFrameReporteDinamicoProcesarCrearIndices.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesarCrearIndices.dispose();
			this.jInternalFrameReporteDinamicoProcesarCrearIndices=null;
		}
		
		if(this.jInternalFrameImportacionProcesarCrearIndices!=null) {
			this.jInternalFrameImportacionProcesarCrearIndices.setVisible(false);	    			
			this.jInternalFrameImportacionProcesarCrearIndices.dispose();
			this.jInternalFrameImportacionProcesarCrearIndices=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesarCrearIndices();
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesarCrearIndices")) {
				jButtonDuplicarProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesarCrearIndices")) {
				jButtonCopiarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesarCrearIndices")) {
				jButtonVerFormProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesarCrearIndices")) {
				jButtonDuplicarProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesarCrearIndices")) {
				jButtonDuplicarProcesarCrearIndicesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesarCrearIndices")) {
				jButtonModificarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesarCrearIndices")) {
				jButtonModificarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesarCrearIndices")) {
				jButtonModificarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesarCrearIndices")) {
				jButtonActualizarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesarCrearIndices")) {
				jButtonActualizarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesarCrearIndices")) {
				jButtonActualizarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesarCrearIndices")) {
				jButtonEliminarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesarCrearIndices")) {
				jButtonEliminarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesarCrearIndices")) {
				jButtonEliminarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesarCrearIndices")) {
				jButtonCancelarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesarCrearIndices")) {
				jButtonCancelarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesarCrearIndices")) {
				jButtonCancelarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesarCrearIndices")) {
				jButtonCerrarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesarCrearIndices")) {
				jButtonCerrarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesarCrearIndices")) {
				jButtonCerrarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesarCrearIndices")) {
				jButtonMostrarOcultarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesarCrearIndices")) {
				jButtonCancelarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesarCrearIndices")) {
				jButtonCopiarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesarCrearIndices")) {
				jButtonVerFormProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesarCrearIndices")) {
				jButtonCopiarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesarCrearIndices")) {
				jButtonVerFormProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesarCrearIndices")) {
				jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesarCrearIndices")) {
				jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesarCrearIndices")) {
				jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesarCrearIndices")) {
				jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesarCrearIndices")) {
				jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesarCrearIndices")) {
				jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesarCrearIndices")) {
				jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesarCrearIndices")) {
				jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesarCrearIndices")) {
				jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesarCrearIndices") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesarCrearIndices")) {
				jButtonAbrirOrderByProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesarCrearIndices") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesarCrearIndices")) {
				jButtonMostrarOcultarProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarCrearIndices")) {
				jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesarCrearIndices")) {
				jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesarCrearIndices")) {
				jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesarCrearIndices")) {
				jButtonProcesarInformacionProcesarCrearIndicesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesarCrearIndices")) {
				jButtonCerrarReporteDinamicoProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesarCrearIndices")) {
				jButtonGenerarReporteDinamicoProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesarCrearIndices")) {
				
				jButtonGenerarExcelReporteDinamicoProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesarCrearIndices")) {
				jButtonCerrarImportacionProcesarCrearIndicesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesarCrearIndices")) {
				
				jButtonGenerarImportacionProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesarCrearIndices")) {
				
				jButtonAbrirImportacionProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesarCrearIndices")) {
				jComboBoxTiposAccionesProcesarCrearIndicesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesarCrearIndices")) {
				jComboBoxTiposRelacionesProcesarCrearIndicesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesarCrearIndices")) {
				jComboBoxTiposAccionesProcesarCrearIndicesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesarCrearIndices")) {
				
				jComboBoxTiposSeleccionarProcesarCrearIndicesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesarCrearIndices")) {
				jTextFieldValorCampoGeneralProcesarCrearIndicesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesarCrearIndices")) {
				jButtonAbrirOrderByProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesarCrearIndices")) {
				jButtonAbrirOrderByProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesarCrearIndices")) {
				jButtonCerrarOrderByProcesarCrearIndicesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarCrearIndicesBusqueda")) {
				this.jButtonidProcesarCrearIndicesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesarCrearIndicesProcesarCrearIndices")) {
				this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndicesActionPerformed(evt);
			}
			
			;
			
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesarCrearIndices();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesarCrearIndices procesarcrearindicesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesarcrearindicesLocal=this.procesarcrearindices;
			} else {
				procesarcrearindicesLocal=this.procesarcrearindicesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
							
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
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
			
			


			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
								
						
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
								
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
							
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
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
			
			


			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
								
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesarCrearIndices")) {
					jCheckBoxSeleccionarTodosProcesarCrearIndicesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesarCrearIndices")) {
					jCheckBoxSeleccionadosProcesarCrearIndicesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesarCrearIndices")) {
					
				}
				
				


				
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
												
				
				


				
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
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
			
			


			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesarcrearindices);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesarcrearindices);
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
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
				
				


				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesarCrearIndices.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesarCrearIndices.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesarCrearIndicesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesarcrearindicesAnterior =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesarCrearIndices")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesarCrearIndicesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesarCrearIndices.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesarcrearindices =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesarcrearindices);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesarCrearIndices")) {
				
				}
				
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesarCrearIndices")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesarCrearIndices.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesarCrearIndices")) {
			
			}
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesarCrearIndices();
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesarCrearIndices")) {
				jButtonDuplicarProcesarCrearIndicesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesarCrearIndices")) {
				jButtonCopiarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesarCrearIndices")) {
				jButtonVerFormProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesarCrearIndices")) {
				jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesarCrearIndices")) {
				jButtonModificarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesarCrearIndices")) {
				jButtonActualizarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesarCrearIndices")) {
				jButtonEliminarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesarCrearIndices")) {
				jButtonCancelarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesarCrearIndices")) {
				jButtonCerrarProcesarCrearIndicesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesarCrearIndices")) {
				jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesarCrearIndices")) {
				jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesarCrearIndices")) {
				jButtonAbrirOrderByProcesarCrearIndicesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesarCrearIndices")) {
				jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesarCrearIndices")) {
				jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesarCrearIndices")) {
				jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesarCrearIndicesBusqueda")) {
				this.jButtonidProcesarCrearIndicesBusquedaActionPerformed(evt);
			}
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesarCrearIndices();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesarCrearIndices")) {
				closingInternalFrameProcesarCrearIndices();
				
			} else if(sTipo.equals("jButtonCancelarProcesarCrearIndices")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesarCrearIndices = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesarCrearIndicesBeanSwingJInternalFrame jInternalFrameParent=(ProcesarCrearIndicesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarCrearIndices.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesarCrearIndicesActionPerformed(null);
			}
			
			ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesarcrearindices,new Object(),this.procesarcrearindicesParameterGeneral,this.procesarcrearindicesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesarCrearIndices(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesarCrearIndices(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesarCrearIndices(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesarcrearindices)) {
			if(!esControlTabla) {
				if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.procesarcrearindices,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);			
				}
				
				if(this.procesarcrearindicesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesarCrearIndices(this.procesarcrearindices,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesarCrearIndices(this.procesarcrearindicesReturnGeneral,this.procesarcrearindicesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesarcrearindicesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesarCrearIndices(classes,this.procesarcrearindicesReturnGeneral,this.procesarcrearindicesBean,false);
					}
						
					if(this.procesarcrearindicesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices());	
					}
						
					if(this.procesarcrearindicesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices(),classes);//this.procesarcrearindicesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesarCrearIndices(this.procesarcrearindices,classes);//this.procesarcrearindicesBean);									
				}
			
				if(ProcesarCrearIndicesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesarCrearIndices(this.procesarcrearindices,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesarCrearIndices(this.procesarcrearindices);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesarcrearindicesAnterior!=null) {
						this.procesarcrearindices=this.procesarcrearindicesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesarcrearindicesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesarcrearindicesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices(),procesarcrearindicesLogic.getProcesarCrearIndicess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndices(),this.procesarcrearindicess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesarCrearIndices.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesarCrearIndices.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesarCrearIndices();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesarCrearIndices() throws Exception {
		
		ProcesarCrearIndicesModel procesarcrearindicesModel=(ProcesarCrearIndicesModel)this.jTableDatosProcesarCrearIndices.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesarcrearindicesModel.procesarcrearindicess=this.procesarcrearindicesLogic.getProcesarCrearIndicess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesarcrearindicesModel.procesarcrearindicess=this.procesarcrearindicess;
		}
		
		
		((ProcesarCrearIndicesModel) this.jTableDatosProcesarCrearIndices.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesarCrearIndices() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesarcrearindicesAnterior(),this.procesarcrearindicesLogic.getProcesarCrearIndicess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesarcrearindicesAnterior(),this.procesarcrearindicess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesarCrearIndices();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
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
										
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarcrearindices,new Object(),generalEntityParameterGeneral,this.procesarcrearindicesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesarCrearIndicesConstantesFunciones.getClassesRelationshipsOfProcesarCrearIndices(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesarCrearIndicesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesarCrearIndices(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesarCrearIndices(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesarcrearindices,new Object(),generalEntityParameterGeneral,this.procesarcrearindicesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesarCrearIndices(ProcesarCrearIndicesBean procesarcrearindicesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesarCrearIndices(ArrayList<Classe> classes,ProcesarCrearIndicesReturnGeneral procesarcrearindicesReturnGeneral,ProcesarCrearIndicesBean procesarcrearindicesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesarcrearindices)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesarCrearIndices = new ProcesarCrearIndicesDetalleFormJInternalFrame(jDesktopPane,this.procesarcrearindicesSessionBean.getConGuardarRelaciones(),this.procesarcrearindicesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesarCrearIndices);
		this.jInternalFrameDetalleFormProcesarCrearIndices.setVisible(false);
		this.jInternalFrameDetalleFormProcesarCrearIndices.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.procesarcrearindicesLogic=this.procesarcrearindicesLogic;
		
		this.cargarCombosFrameForeignKeyProcesarCrearIndices("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesarCrearIndices();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesarCrearIndices();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesarCrearIndices("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesarCrearIndices();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarCrearIndices"));
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ModificarProcesarCrearIndices"));

		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarCrearIndices"));
					
		this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemModificarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarCrearIndices"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"ActualizarProcesarCrearIndices"));
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarCrearIndices"));
						
		this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemActualizarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarCrearIndices"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"EliminarProcesarCrearIndices"));
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarCrearIndices"));
								
		this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemEliminarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarCrearIndices"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CancelarProcesarCrearIndices"));
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarCrearIndices"));
					
		this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemCancelarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarCrearIndices"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemDetalleCerrarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarCrearIndices"));		
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCrearIndices"));
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCrearIndices"));
		
		
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarCrearIndices"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonidProcesarCrearIndicesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCrearIndicesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarCrearIndices"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesarCrearIndices"));
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesarCrearIndices"));
		}
		
		this.jTableDatosProcesarCrearIndices.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesarCrearIndices"));
		
		this.jTableDatosProcesarCrearIndices.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesarCrearIndices"));
		
		this.jButtonNuevoProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"NuevoProcesarCrearIndices"));
		
		this.jButtonDuplicarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"DuplicarProcesarCrearIndices"));
		
		this.jButtonCopiarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"CopiarProcesarCrearIndices"));
		
		this.jButtonVerFormProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"VerFormProcesarCrearIndices"));
		
		
		this.jButtonNuevoToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesarCrearIndices"));
			
		this.jButtonDuplicarToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesarCrearIndices"));
			
		this.jMenuItemNuevoProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesarCrearIndices"));
			
		this.jMenuItemDuplicarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesarCrearIndices"));		
		
		
		this.jButtonNuevoRelacionesProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesarCrearIndices"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesarCrearIndices"));
			
		this.jMenuItemNuevoRelacionesProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesarCrearIndices"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ModificarProcesarCrearIndices"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonModificarToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesarCrearIndices"));
			
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemModificarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesarCrearIndices"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"ActualizarProcesarCrearIndices"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonActualizarToolBarProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesarCrearIndices"));
				
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemActualizarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesarCrearIndices"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"EliminarProcesarCrearIndices"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonEliminarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesarCrearIndices"));
						
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemEliminarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesarCrearIndices"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CancelarProcesarCrearIndices"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonCancelarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesarCrearIndices"));
			
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemCancelarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesarCrearIndices"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesarCrearIndices"));		
		
		
		this.jButtonCerrarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CerrarProcesarCrearIndices"));
		
		
		this.jButtonCerrarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesarCrearIndices"));
			
		this.jMenuItemCerrarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesarCrearIndices"));
			
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jMenuItemDetalleCerrarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesarCrearIndices"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesarCrearIndices"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesarCrearIndices"));
		}
		
		this.jButtonCopiarToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesarCrearIndices"));
			
		this.jButtonVerFormToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesarCrearIndices"));
		
		this.jMenuItemGuardarCambiosProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesarCrearIndices"));
			
		this.jMenuItemCopiarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesarCrearIndices"));		
		
		this.jMenuItemVerFormProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesarCrearIndices"));		
		
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarCrearIndices"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesarCrearIndices"));
			
		this.jMenuItemGuardarCambiosTablaProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesarCrearIndices"));		
		
		
		
		this.jButtonRecargarInformacionProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesarCrearIndices"));
					
		this.jButtonRecargarInformacionToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesarCrearIndices"));
		
		this.jMenuItemRecargarInformacionProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesarCrearIndices"));		
		
		
		
		this.jButtonAnterioresProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"AnterioresProcesarCrearIndices"));
		
		
		this.jButtonAnterioresToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesarCrearIndices"));
		
		this.jMenuItemAnterioresProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesarCrearIndices"));		
		
		
		this.jButtonSiguientesProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"SiguientesProcesarCrearIndices"));
		
		
		this.jButtonSiguientesToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesarCrearIndices"));
			
		this.jMenuItemSiguientesProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesarCrearIndices"));
			
		this.jMenuItemAbrirOrderByProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesarCrearIndices"));
			
		this.jMenuItemMostrarOcultarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesarCrearIndices"));
			
		this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesarCrearIndices"));
			
		this.jMenuItemDetalleMostarOcultarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesarCrearIndices"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesarCrearIndices"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesarCrearIndices"));
			
		this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesarCrearIndices"));		
		
		
		this.jButtonProcesarInformacionProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesarCrearIndices"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesarCrearIndices"));

		this.jCheckBoxSeleccionadosProcesarCrearIndices.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesarCrearIndices"));
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesarCrearIndices"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesarCrearIndices"));
			
		this.jComboBoxTiposAccionesProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesarCrearIndices"));
					
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesarCrearIndices"));
			
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesarCrearIndices"));		
		
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonidProcesarCrearIndicesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCrearIndicesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"BusquedaProcesarCrearIndicesProcesarCrearIndices"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesarCrearIndices!=null) {
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCrearIndices"));
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCrearIndices"));
				this.jInternalFrameReporteDinamicoProcesarCrearIndices.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCrearIndices"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesarCrearIndices"));				
			//this.jButtonGenerarReporteDinamicoProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesarCrearIndices"));
			//this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesarCrearIndices"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesarCrearIndices!=null) {
				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesarCrearIndices"));
				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesarCrearIndices"));
				this.jInternalFrameImportacionProcesarCrearIndices.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesarCrearIndices"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesarCrearIndices"));
			
			this.jButtonAbrirOrderByToolBarProcesarCrearIndices.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesarCrearIndices"));			
			
			if(this.jInternalFrameOrderByProcesarCrearIndices!=null) {
				this.jInternalFrameOrderByProcesarCrearIndices.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesarCrearIndices"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesarCrearIndices.jTabbedPaneRelacionesProcesarCrearIndices.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesarCrearIndices"));
		
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
            		closingInternalFrameProcesarCrearIndices();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesarCrearIndices = (JInternalFrameBase)event.getSource();
	            	
	            ProcesarCrearIndicesBeanSwingJInternalFrame jInternalFrameParent=(ProcesarCrearIndicesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesarCrearIndices.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesarCrearIndicesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesarCrearIndices.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesarCrearIndicesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesarCrearIndices.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesarCrearIndices.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesarCrearIndices";
		inputMap = this.jButtonNuevoProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesarCrearIndices";
		inputMap = this.jButtonNuevoRelacionesProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesarCrearIndicesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesarCrearIndices";
		inputMap = this.jButtonModificarProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesarCrearIndices";
		inputMap = this.jButtonActualizarProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesarCrearIndices";
		inputMap = this.jButtonEliminarProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesarCrearIndices";
		inputMap = this.jButtonCancelarProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesarCrearIndices";
		inputMap = this.jButtonCerrarProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesarCrearIndices";
		inputMap = this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonGuardarCambiosProcesarCrearIndices.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesarCrearIndicesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesarCrearIndices.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesarCrearIndicesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesarCrearIndices.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesarCrearIndicesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesarCrearIndices.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesarCrearIndicesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesarCrearIndices.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesarCrearIndicesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesarCrearIndices.jButtonidProcesarCrearIndicesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesarCrearIndicesBusqueda"));
		
		
		this.jButtonBusquedaProcesarCrearIndicesProcesarCrearIndices.addActionListener(new ButtonActionListener(this,"BusquedaProcesarCrearIndicesProcesarCrearIndices"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesarCrearIndices.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesarCrearIndicesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesarCrearIndicesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesarCrearIndices.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesarCrearIndices(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
					procesarcrearindicesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicess) {
					procesarcrearindicesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesarCrearIndicesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
						procesarcrearindicesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicess) {
						procesarcrearindicesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarCrearIndices.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarCrearIndices.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarCrearIndices,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesarCrearIndicesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesarCrearIndices.getSelectedRows();
			
			ProcesarCrearIndices procesarcrearindicesLocal=new ProcesarCrearIndices();
			
			//this.seleccionarTodosProcesarCrearIndices(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesarcrearindicesLocal =(ProcesarCrearIndices) this.procesarcrearindicesLogic.getProcesarCrearIndicess().toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesarcrearindicesLocal =(ProcesarCrearIndices) this.procesarcrearindicess.toArray()[this.jTableDatosProcesarCrearIndices.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesarcrearindicesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
						procesarcrearindicesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicess) {
						procesarcrearindicesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesarCrearIndices.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesarCrearIndices.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesarCrearIndices,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesarCrearIndicesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesarCrearIndicesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesarCrearIndicesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesarCrearIndices.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicesLogic.getProcesarCrearIndicess()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicess) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesarCrearIndicesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesarCrearIndices=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesarCrearIndices.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesarCrearIndices) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesarCrearIndices(conSplash);
				
					this.generarReporteProcesarCrearIndicessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesarCrearIndicessSeleccionados();
				//this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarCrearIndicessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesarCrearIndicessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarCrearIndices();
				
				this.exportarProcesarCrearIndicessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesarCrearIndicess();
				//this.importarProcesarCrearIndicess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesarCrearIndices();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesarCrearIndicessSeleccionados();
				//this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Procesar Crear Indices", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesarCrearIndices();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesarCrearIndices)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesarCrearIndices(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesarCrearIndicesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesarCrearIndices) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesarCrearIndices(conSplash);
					
						//this.actualizarParametrosGeneralProcesarCrearIndices();
						
						this.generarReporteProcesoAccionProcesarCrearIndicessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Procesar Crear IndicesES SELECCIONADOS?", "MANTENIMIENTO DE Procesar Crear Indices", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesarCrearIndices();
				
						this.actualizarParametrosGeneralProcesarCrearIndices();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesarcrearindicesReturnGeneral=procesarcrearindicesLogic.procesarAccionProcesarCrearIndicessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesarcrearindicesLogic.getProcesarCrearIndicess(),this.procesarcrearindicesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesarCrearIndicesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesarCrearIndices();
					
					ProcesarCrearIndicesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesarCrearIndicesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesarCrearIndices.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesarCrearIndices.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesarCrearIndices(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesarCrearIndicesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesarCrearIndices();
			
			if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
			ProcesarCrearIndices procesarcrearindices=new ProcesarCrearIndices();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesarCrearIndices(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesarCrearIndices.getSelectedItem();
			
			
			
			
			procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesarcrearindicessSeleccionados.size()==1) {
				for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
					procesarcrearindices=procesarcrearindicesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesarCrearIndices();
			
      		//this.finishProcessProcesarCrearIndices(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesarCrearIndicesReturnGeneral() throws Exception {
		if(this.procesarcrearindicesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesarcrearindicesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesarcrearindicesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesarcrearindicesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesarcrearindicesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesarcrearindicesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesarCrearIndices(false);
		}
		
		if(this.procesarcrearindicesReturnGeneral.getConRetornoLista() || this.procesarcrearindicesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesarcrearindicesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesarcrearindicesLogic.setProcesarCrearIndicess(this.procesarcrearindicesReturnGeneral.getProcesarCrearIndicess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesarCrearIndices(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesarCrearIndices() throws Exception {
		
		
	}
	
	public ArrayList<ProcesarCrearIndices> getProcesarCrearIndicessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesarCrearIndices) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicesLogic.getProcesarCrearIndicess()) {
					if(procesarcrearindicesAux.getIsSelected()) {
						procesarcrearindicessSeleccionados.add(procesarcrearindicesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesarCrearIndices procesarcrearindicesAux:this.procesarcrearindicess) {
					if(procesarcrearindicesAux.getIsSelected()) {
						procesarcrearindicessSeleccionados.add(procesarcrearindicesAux);				
					}
				}
			}
			
			if(procesarcrearindicessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesarcrearindicessSeleccionados.addAll(this.procesarcrearindicesLogic.getProcesarCrearIndicess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesarcrearindicessSeleccionados.addAll(this.procesarcrearindicess);				
					}
				}
			}
		} else {
			procesarcrearindicessSeleccionados.add(this.procesarcrearindices);
		}
		
		return procesarcrearindicessSeleccionados;
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
	
	public void generarReporteProcesarCrearIndicessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesarCrearIndicessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesarCrearIndicessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarCrearIndicessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesarCrearIndicessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Procesar Crear Indices",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesarCrearIndicessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesarCrearIndices();
		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesarCrearIndices();
		
		
		//this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados ,procesarcrearindicesImplementable,procesarcrearindicesImplementableHome);
	}
	
	public void mostrarImportacionProcesarCrearIndicess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesarCrearIndices();
		
		this.abrirFrameImportacionProcesarCrearIndices();		
		
			
		//this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados ,procesarcrearindicesImplementable,procesarcrearindicesImplementableHome);
	}
	
	public void importarProcesarCrearIndicess() throws Exception {		
	
	}
	
	public void exportarProcesarCrearIndicessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesarCrearIndicessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesarCrearIndicessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesarCrearIndicessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Procesar Crear Indices",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesarCrearIndices(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesarCrearIndices(procesarcrearindicesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesarcrearindicesAux.setsDetalleGeneralEntityReporte(procesarcrearindicesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesarCrearIndices(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesarCrearIndicesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesarCrearIndicesConstantesFunciones.LABEL_VERSIONROW;
		}

		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesarcrearindices.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesarcrearindices.getVersionRow().toString();
		}

		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesarCrearIndicess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesarCrearIndices(row);				
				iRow++;
			}				
			
			for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesarCrearIndices(procesarcrearindicesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesarCrearIndicessSeleccionados() throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();		
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesarcrearindices.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesarcrearindicess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesarcrearindices");
			//elementRoot.appendChild(element);
		
			for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
				element = document.createElement("procesarcrearindices");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesarCrearIndices(procesarcrearindicesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Procesar Crear Indices",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesarCrearIndices(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCrearIndicesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesarCrearIndicesConstantesFunciones.LABEL_VERSIONROW);
		}

	}
	
	public void getFilaDatosExportarExcelProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesarcrearindices.getId());				
	}
	
	public void setFilaDatosExportarXmlProcesarCrearIndices(ProcesarCrearIndices procesarcrearindices,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesarCrearIndicesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesarcrearindices.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesarCrearIndicesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesarcrearindices.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}

	}
	
	public void generarReporteGroupGenericoProcesarCrearIndicessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados=new ArrayList<ProcesarCrearIndices>();
		
		procesarcrearindicessSeleccionados=this.getProcesarCrearIndicessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesarCrearIndices(procesarcrearindicessSeleccionados);
		
		this.generarReporteProcesarCrearIndicess("Todos",procesarcrearindicessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesarCrearIndices(ArrayList<ProcesarCrearIndices> procesarcrearindicessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesarCrearIndices procesarcrearindicesAux:procesarcrearindicessSeleccionados) {
				procesarcrearindicesAux.setsDetalleGeneralEntityReporte(procesarcrearindicesAux.toString());
			
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesarCrearIndicesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesarCrearIndices(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesarCrearIndices=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=true;
				this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=true;
			}
			
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=true;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=true;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=true;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=true;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=true;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
			this.isVisibilidadCeldaModificarProcesarCrearIndices=true;
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
			this.isVisibilidadCeldaCancelarProcesarCrearIndices=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=true;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=true;
		} else {
			this.actualizarEstadoPanelsProcesarCrearIndices(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesarCrearIndices=false;
			//this.isVisibilidadCeldaVerFormProcesarCrearIndices=false;
			this.isVisibilidadCeldaDuplicarProcesarCrearIndices=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
			this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			if(!procesarcrearindicesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;												
			}
			
			this.jButtonCerrarProcesarCrearIndices.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
		}
		
		if(!this.permiteMantenimiento(this.procesarcrearindices)) {
			this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
			this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesarCrearIndices=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesarCrearIndices=false;
		this.isVisibilidadCeldaGuardarCambiosProcesarCrearIndices=false;
		//this.isVisibilidadCeldaModificarProcesarCrearIndices=true;
		this.isVisibilidadCeldaActualizarProcesarCrearIndices=false;
		this.isVisibilidadCeldaEliminarProcesarCrearIndices=false;
		//this.isVisibilidadCeldaCancelarProcesarCrearIndices=true;			
		this.isVisibilidadCeldaGuardarProcesarCrearIndices=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesarCrearIndices() {
	}
	
	public void actualizarEstadoPanelsProcesarCrearIndices(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesarCrearIndices!=null) {
				this.jScrollPanelDatosEdicionProcesarCrearIndices.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesarCrearIndices!=null) {
				this.jScrollPanelDatosProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesarCrearIndices!=null) {
				this.jPanelPaginacionProcesarCrearIndices.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
					this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesarCrearIndices!=null) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesarCrearIndices!=null) {
				this.jPanelParametrosReportesProcesarCrearIndices.setVisible(true);
			}
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
			
			this.inicializarActualizarBindingTablaProcesarCrearIndices(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesarCrearIndices() {
		this.updateBorderResaltarBusquedasFormularioProcesarCrearIndices();
		this.updateVisibilidadBusquedasFormularioProcesarCrearIndices();
		this.updateHabilitarBusquedasFormularioProcesarCrearIndices();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesarCrearIndices() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesarCrearIndices.getComponents().length>0) {
	

		if(this.procesarcrearindicesConstantesFunciones.resaltarBusquedaProcesarCrearIndicesProcesarCrearIndices!=null) {
			index= this.jTabbedPaneBusquedasProcesarCrearIndices.indexOfComponent(this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCrearIndices.getComponent(index);
				jPanel.setBorder(this.procesarcrearindicesConstantesFunciones.resaltarBusquedaProcesarCrearIndicesProcesarCrearIndices);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesarCrearIndices() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesarCrearIndices.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarCrearIndices.indexOfComponent(this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCrearIndices.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesarcrearindicesConstantesFunciones.mostrarBusquedaProcesarCrearIndicesProcesarCrearIndices);
			if(!this.procesarcrearindicesConstantesFunciones.mostrarBusquedaProcesarCrearIndicesProcesarCrearIndices && index>-1) {
				this.jTabbedPaneBusquedasProcesarCrearIndices.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesarCrearIndices() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesarCrearIndices.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesarCrearIndices.indexOfComponent(this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCrearIndices.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesarcrearindicesConstantesFunciones.activarBusquedaProcesarCrearIndicesProcesarCrearIndices);
				this.jTabbedPaneBusquedasProcesarCrearIndices.setEnabledAt(index,this.procesarcrearindicesConstantesFunciones.activarBusquedaProcesarCrearIndicesProcesarCrearIndices);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesarCrearIndices(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesarCrearIndices")) {
			index= this.jTabbedPaneBusquedasProcesarCrearIndices.indexOfComponent(this.jPanelBusquedaProcesarCrearIndicesProcesarCrearIndices);

			this.jTabbedPaneBusquedasProcesarCrearIndices.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesarCrearIndices.getComponent(index);

			this.procesarcrearindicesConstantesFunciones.setResaltarBusquedaProcesarCrearIndicesProcesarCrearIndices(resaltar);

			jPanel.setBorder(this.procesarcrearindicesConstantesFunciones.resaltarBusquedaProcesarCrearIndicesProcesarCrearIndices);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesarCrearIndices.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesarCrearIndices() throws Exception {

		if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesarCrearIndices();
		this.updateVisibilidadResaltarControlesFormularioProcesarCrearIndices();
		this.updateHabilitarResaltarControlesFormularioProcesarCrearIndices();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesarCrearIndices() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesarcrearindicesConstantesFunciones.resaltaridProcesarCrearIndices!=null && this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {this.jInternalFrameDetalleFormProcesarCrearIndices.jLabelidProcesarCrearIndices.setBorder(this.procesarcrearindicesConstantesFunciones.resaltaridProcesarCrearIndices);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesarCrearIndices() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
	
		//this.jInternalFrameDetalleFormProcesarCrearIndices.jLabelidProcesarCrearIndices.setVisible(this.procesarcrearindicesConstantesFunciones.mostraridProcesarCrearIndices);
		this.jInternalFrameDetalleFormProcesarCrearIndices.jPanelidProcesarCrearIndices.setVisible(this.procesarcrearindicesConstantesFunciones.mostraridProcesarCrearIndices);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesarCrearIndices() throws Exception {
		if(this.jInternalFrameDetalleFormProcesarCrearIndices==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesarCrearIndices!=null) {
	
		this.jInternalFrameDetalleFormProcesarCrearIndices.jLabelidProcesarCrearIndices.setEnabled(this.procesarcrearindicesConstantesFunciones.activaridProcesarCrearIndices);
		}
	}
	
		
}