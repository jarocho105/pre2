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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ProcesoTestConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoTestParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoTestParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoTestBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoTestBeanSwingJInternalFrame extends ProcesoTestJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoTestBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoTest> procesotestValidator = new ClassValidator<ProcesoTest>(ProcesoTest.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoTest procesotest;	
	public ProcesoTest procesotestAux;
	public ProcesoTest procesotestAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoTest procesotestTotales;
	public Long idProcesoTestActual;
	public Long iIdNuevoProcesoTest=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
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
	
	public Boolean isPermisoTodoProcesoTest;
	public Boolean isPermisoNuevoProcesoTest;
	public Boolean isPermisoActualizarProcesoTest;
	public Boolean isPermisoActualizarOriginalProcesoTest;
	public Boolean isPermisoEliminarProcesoTest;
	public Boolean isPermisoGuardarCambiosProcesoTest;
	public Boolean isPermisoConsultaProcesoTest;
	public Boolean isPermisoBusquedaProcesoTest;
	public Boolean isPermisoReporteProcesoTest;
	public Boolean isPermisoPaginacionMedioProcesoTest;
	public Boolean isPermisoPaginacionAltoProcesoTest;
	public Boolean isPermisoPaginacionTodoProcesoTest;
	public Boolean isPermisoCopiarProcesoTest;
	public Boolean isPermisoVerFormProcesoTest;
	public Boolean isPermisoDuplicarProcesoTest;
	public Boolean isPermisoOrdenProcesoTest;
	
	
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
	
	public ProcesoTestParameterReturnGeneral procesotestReturnGeneral;
	public ProcesoTestParameterReturnGeneral procesotestParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoTest=false;
	public Boolean esParaAccionDesdeFormularioProcesoTest=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoTestSessionBeanAdditional procesotestSessionBeanAdditional=null;
	
	public ProcesoTestSessionBeanAdditional getProcesoTestSessionBeanAdditional() {
		return this.procesotestSessionBeanAdditional;
	}
	
	public void setProcesoTestSessionBeanAdditional(ProcesoTestSessionBeanAdditional procesotestSessionBeanAdditional) {
		try {
			this.procesotestSessionBeanAdditional=procesotestSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoTestBeanSwingJInternalFrameAdditional procesotestBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoTestBeanSwingJInternalFrame
	
	public ProcesoTestBeanSwingJInternalFrameAdditional getProcesoTestBeanSwingJInternalFrameAdditional() {
		return this.procesotestBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoTestBeanSwingJInternalFrameAdditional(ProcesoTestBeanSwingJInternalFrameAdditional procesotestBeanSwingJInternalFrameAdditional) {
		try {
			this.procesotestBeanSwingJInternalFrameAdditional=procesotestBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoTestLogic procesotestLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoTest procesotestBean;
	public ProcesoTestConstantesFunciones procesotestConstantesFunciones;
	//public ProcesoTestParameterReturnGeneral procesotestReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoTest> procesotests;	
	//public List<ProcesoTest> procesotestsEliminados;
	//public List<ProcesoTest> procesotestsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoTest=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoTest=true;
	public Boolean isVisibilidadCeldaCopiarProcesoTest=true;
	public Boolean isVisibilidadCeldaVerFormProcesoTest=true;
	public Boolean isVisibilidadCeldaOrdenProcesoTest=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
	public Boolean isVisibilidadCeldaModificarProcesoTest=false;
	public Boolean isVisibilidadCeldaActualizarProcesoTest=false;
	public Boolean isVisibilidadCeldaEliminarProcesoTest=false;
	public Boolean isVisibilidadCeldaCancelarProcesoTest=false;
	public Boolean isVisibilidadCeldaGuardarProcesoTest=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoTest=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdEmpresaPorIdModulo=false;
	
	public Long getiIdNuevoProcesoTest() {
		return this.iIdNuevoProcesoTest;
	}

	public void setiIdNuevoProcesoTest(Long iIdNuevoProcesoTest) {
		this.iIdNuevoProcesoTest = iIdNuevoProcesoTest;
	}
	
	public Long getidProcesoTestActual() {
		return this.idProcesoTestActual;
	}

	public void setidProcesoTestActual(Long idProcesoTestActual) {
		this.idProcesoTestActual = idProcesoTestActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoTest getprocesotest() {
		return this.procesotest;
	}

	public void setprocesotest(ProcesoTest procesotest) {
		this.procesotest = procesotest;
	}
	
	public ProcesoTest getprocesotestAux() {
		return this.procesotestAux;
	}

	public void setprocesotestAux(ProcesoTest procesotestAux) {
		this.procesotestAux = procesotestAux;
	}				
	
	public ProcesoTest getprocesotestAnterior() {
		return this.procesotestAnterior;
	}

	public void setprocesotestAnterior(ProcesoTest procesotestAnterior) {
		this.procesotestAnterior = procesotestAnterior;
	}	
	
	public ProcesoTest getprocesotestTotales() {
		return this.procesotestTotales;
	}

	public void setprocesotestTotales(ProcesoTest procesotestTotales) {
		this.procesotestTotales = procesotestTotales;
	}	
	
	public ProcesoTest getprocesotestBean() {
		return this.procesotestBean;
	}

	public void setprocesotestBean(ProcesoTest procesotestBean) {
		this.procesotestBean = procesotestBean;
	}	
	
	public ProcesoTestParameterReturnGeneral getprocesotestReturnGeneral() {
		return this.procesotestReturnGeneral;
	}

	public void setprocesotestReturnGeneral(ProcesoTestParameterReturnGeneral procesotestReturnGeneral) {
		this.procesotestReturnGeneral = procesotestReturnGeneral;
	}	
	
	
	public Long id_empresaBusquedaPorIdEmpresaPorIdModulo=-1L;

	public Long getid_empresaBusquedaPorIdEmpresaPorIdModulo() {
		return this.id_empresaBusquedaPorIdEmpresaPorIdModulo;
	}

	public void setid_empresaBusquedaPorIdEmpresaPorIdModulo(Long id_empresaBusquedaPorIdEmpresaPorIdModulo) {
		this.id_empresaBusquedaPorIdEmpresaPorIdModulo = id_empresaBusquedaPorIdEmpresaPorIdModulo;
	}

;
	public Long id_moduloBusquedaPorIdEmpresaPorIdModulo=-1L;

	public Long getid_moduloBusquedaPorIdEmpresaPorIdModulo() {
		return this.id_moduloBusquedaPorIdEmpresaPorIdModulo;
	}

	public void setid_moduloBusquedaPorIdEmpresaPorIdModulo(Long id_moduloBusquedaPorIdEmpresaPorIdModulo) {
		this.id_moduloBusquedaPorIdEmpresaPorIdModulo = id_moduloBusquedaPorIdEmpresaPorIdModulo;
	}

;
	public String nombreBusquedaPorIdEmpresaPorIdModulo="";

	public String getnombreBusquedaPorIdEmpresaPorIdModulo() {
		return this.nombreBusquedaPorIdEmpresaPorIdModulo;
	}

	public void setnombreBusquedaPorIdEmpresaPorIdModulo(String nombreBusquedaPorIdEmpresaPorIdModulo) {
		this.nombreBusquedaPorIdEmpresaPorIdModulo = nombreBusquedaPorIdEmpresaPorIdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoTestLogic getProcesoTestLogic()	{		
		return procesotestLogic;
	}

	public void setProcesoTestLogic(ProcesoTestLogic procesotestLogic) {
		this.procesotestLogic = procesotestLogic;
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
	
	public Boolean getIsEsNuevoProcesoTest() {
		return isEsNuevoProcesoTest;
	}

	public void setIsEsNuevoProcesoTest(Boolean isEsNuevoProcesoTest) {
		this.isEsNuevoProcesoTest = isEsNuevoProcesoTest;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoTest() {
		return esParaAccionDesdeFormularioProcesoTest;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoTest(Boolean esParaAccionDesdeFormularioProcesoTest) {
		this.esParaAccionDesdeFormularioProcesoTest = esParaAccionDesdeFormularioProcesoTest;
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

			if(this.procesotestSessionBean==null) {
				this.procesotestSessionBean=new ProcesoTestSessionBean();
			}

			if(!this.procesotestSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesotestSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.procesotestSessionBean==null) {
				this.procesotestSessionBean=new ProcesoTestSessionBean();
			}

			if(!this.procesotestSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(procesotestSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

					if(this.procesotest!=null) {
						this.procesotest.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoTest!=null) {
						this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoTest.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoTest!=null) {
						if(this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresaTemp!=null && jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest!=null) {
						jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(empresaTemp);
					} else {
						if(jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest!=null) {
							//jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(empresaTemp);
							if(jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.getItemCount()>0) {
								jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoTestGenerico)throws Exception
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
				jComboBoxid_empresaProcesoTestGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoTestGenerico!=null && jComboBoxid_empresaProcesoTestGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoTestGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.procesotest!=null) {
						this.procesotest.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoTest!=null) {
						this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloProcesoTest.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormProcesoTest!=null) {
						if(this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest!=null) {
						jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest!=null) {
							//jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloProcesoTestGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloProcesoTestGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloProcesoTestGenerico!=null && jComboBoxid_moduloProcesoTestGenerico.getItemCount()>0) {
					jComboBoxid_moduloProcesoTestGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoTest procesotest,JComboBox jComboBoxid_empresaProcesoTestGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoTestGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoTestGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesotest.setid_empresa(empresaAux.getId());
				procesotest.setempresa_descripcion(ProcesoTestConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesotest.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(ProcesoTest procesotest,JComboBox jComboBoxid_moduloProcesoTestGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloProcesoTestGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloProcesoTestGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				procesotest.setid_modulo(moduloAux.getId());
				procesotest.setmodulo_descripcion(ProcesoTestConstantesFunciones.getModuloDescripcion(moduloAux));
				procesotest.setModulo(moduloAux);			}
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

					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoTest!=null) { 
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoTest!=null) { 
					}

					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.addItem(empresa);
							}
						}

						if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoTest!=null) { 
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoTest!=null) { 
					}

					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.addItem(modulo);
							}
						}

						if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoTest!=null) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoTest!=null) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(empresa);
						} else {
							this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoTest!=null) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoTest!=null) {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoTest() throws Exception {
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
		
	public ProcesoTestParameterReturnGeneral getProcesoTestParameterGeneral() {
		return this.procesotestParameterGeneral;
	}
	
	public void setProcesoTestParameterGeneral(ProcesoTestParameterReturnGeneral procesotestParameterGeneral) {
		this.procesotestParameterGeneral = procesotestParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoTest() {
		return isPermisoTodoProcesoTest;
	}

	public void setIsPermisoTodoProcesoTest(Boolean isPermisoTodoProcesoTest) {
		this.isPermisoTodoProcesoTest = isPermisoTodoProcesoTest;
	}

	public Boolean getIsPermisoNuevoProcesoTest() {
		return isPermisoNuevoProcesoTest;
	}

	public void setIsPermisoNuevoProcesoTest(Boolean isPermisoNuevoProcesoTest) {
		this.isPermisoNuevoProcesoTest = isPermisoNuevoProcesoTest;
	}

	public Boolean getIsPermisoActualizarProcesoTest() {
		return isPermisoActualizarProcesoTest;
	}

	public void setIsPermisoActualizarProcesoTest(Boolean isPermisoActualizarProcesoTest) {
		this.isPermisoActualizarProcesoTest = isPermisoActualizarProcesoTest;
	}

	public Boolean getIsPermisoEliminarProcesoTest() {
		return isPermisoEliminarProcesoTest;
	}

	public void setIsPermisoEliminarProcesoTest(Boolean isPermisoEliminarProcesoTest) {
		this.isPermisoEliminarProcesoTest = isPermisoEliminarProcesoTest;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoTest() {
		return isPermisoGuardarCambiosProcesoTest;
	}

	public void setIsPermisoGuardarCambiosProcesoTest(Boolean isPermisoGuardarCambiosProcesoTest) {
		this.isPermisoGuardarCambiosProcesoTest = isPermisoGuardarCambiosProcesoTest;
	}
	
	public Boolean getIsPermisoConsultaProcesoTest() {
		return isPermisoConsultaProcesoTest;
	}

	public void setIsPermisoConsultaProcesoTest(Boolean isPermisoConsultaProcesoTest) {
		this.isPermisoConsultaProcesoTest = isPermisoConsultaProcesoTest;
	}

	public Boolean getIsPermisoBusquedaProcesoTest() {
		return isPermisoBusquedaProcesoTest;
	}

	public void setIsPermisoBusquedaProcesoTest(Boolean isPermisoBusquedaProcesoTest) {
		this.isPermisoBusquedaProcesoTest = isPermisoBusquedaProcesoTest;
	}

	public Boolean getIsPermisoReporteProcesoTest() {
		return isPermisoReporteProcesoTest;
	}

	public void setIsPermisoReporteProcesoTest(Boolean isPermisoReporteProcesoTest) {
		this.isPermisoReporteProcesoTest = isPermisoReporteProcesoTest;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoTest() {
		return isPermisoPaginacionMedioProcesoTest;
	}

	public void setIsPermisoPaginacionMedioProcesoTest(Boolean isPermisoPaginacionMedioProcesoTest) {
		this.isPermisoPaginacionMedioProcesoTest = isPermisoPaginacionMedioProcesoTest;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoTest() {
		return isPermisoPaginacionTodoProcesoTest;
	}

	public void setIsPermisoPaginacionTodoProcesoTest(Boolean isPermisoPaginacionTodoProcesoTest) {
		this.isPermisoPaginacionTodoProcesoTest = isPermisoPaginacionTodoProcesoTest;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoTest() {
		return isPermisoPaginacionAltoProcesoTest;
	}

	public void setIsPermisoPaginacionAltoProcesoTest(Boolean isPermisoPaginacionAltoProcesoTest) {
		this.isPermisoPaginacionAltoProcesoTest = isPermisoPaginacionAltoProcesoTest;
	}
	
	public Boolean getIsPermisoCopiarProcesoTest() {
		return isPermisoCopiarProcesoTest;
	}

	public void setIsPermisoCopiarProcesoTest(Boolean isPermisoCopiarProcesoTest) {
		this.isPermisoCopiarProcesoTest = isPermisoCopiarProcesoTest;
	}
	
	public Boolean getIsPermisoVerFormProcesoTest() {
		return isPermisoVerFormProcesoTest;
	}

	public void setIsPermisoVerFormProcesoTest(Boolean isPermisoVerFormProcesoTest) {
		this.isPermisoVerFormProcesoTest = isPermisoVerFormProcesoTest;
	}
	
	public Boolean getIsPermisoDuplicarProcesoTest() {
		return isPermisoDuplicarProcesoTest;
	}

	public void setIsPermisoDuplicarProcesoTest(Boolean isPermisoDuplicarProcesoTest) {
		this.isPermisoDuplicarProcesoTest = isPermisoDuplicarProcesoTest;
	}
	
	public Boolean getIsPermisoOrdenProcesoTest() {
		return isPermisoOrdenProcesoTest;
	}

	public void setIsPermisoOrdenProcesoTest(Boolean isPermisoOrdenProcesoTest) {
		this.isPermisoOrdenProcesoTest = isPermisoOrdenProcesoTest;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoTest() {
		return isVisibilidadCeldaNuevoProcesoTest;
	}

	public void setIsVisibilidadCeldaNuevoProcesoTest(Boolean isVisibilidadCeldaNuevoProcesoTest) {
		this.isVisibilidadCeldaNuevoProcesoTest = isVisibilidadCeldaNuevoProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoTest() {
		return isVisibilidadCeldaDuplicarProcesoTest;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoTest(Boolean isVisibilidadCeldaDuplicarProcesoTest) {
		this.isVisibilidadCeldaDuplicarProcesoTest = isVisibilidadCeldaDuplicarProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoTest() {
		return isVisibilidadCeldaCopiarProcesoTest;
	}

	public void setIsVisibilidadCeldaCopiarProcesoTest(Boolean isVisibilidadCeldaCopiarProcesoTest) {
		this.isVisibilidadCeldaCopiarProcesoTest = isVisibilidadCeldaCopiarProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoTest() {
		return isVisibilidadCeldaVerFormProcesoTest;
	}

	public void setIsVisibilidadCeldaVerFormProcesoTest(Boolean isVisibilidadCeldaVerFormProcesoTest) {
		this.isVisibilidadCeldaVerFormProcesoTest = isVisibilidadCeldaVerFormProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoTest() {
		return isVisibilidadCeldaOrdenProcesoTest;
	}

	public void setIsVisibilidadCeldaOrdenProcesoTest(Boolean isVisibilidadCeldaOrdenProcesoTest) {
		this.isVisibilidadCeldaOrdenProcesoTest = isVisibilidadCeldaOrdenProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoTest() {
		return isVisibilidadCeldaNuevoRelacionesProcesoTest;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoTest(Boolean isVisibilidadCeldaNuevoRelacionesProcesoTest) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoTest = isVisibilidadCeldaNuevoRelacionesProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoTest() {
		return isVisibilidadCeldaModificarProcesoTest;
	}

	public void setIsVisibilidadCeldaModificarProcesoTest(Boolean isVisibilidadCeldaModificarProcesoTest) {
		this.isVisibilidadCeldaModificarProcesoTest = isVisibilidadCeldaModificarProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoTest() {
		return isVisibilidadCeldaActualizarProcesoTest;
	}

	public void setIsVisibilidadCeldaActualizarProcesoTest(Boolean isVisibilidadCeldaActualizarProcesoTest) {
		this.isVisibilidadCeldaActualizarProcesoTest = isVisibilidadCeldaActualizarProcesoTest;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoTest() {
		return isVisibilidadCeldaEliminarProcesoTest;
	}

	public void setIsVisibilidadCeldaEliminarProcesoTest(Boolean isVisibilidadCeldaEliminarProcesoTest) {
		this.isVisibilidadCeldaEliminarProcesoTest = isVisibilidadCeldaEliminarProcesoTest;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoTest() {
		return isVisibilidadCeldaCancelarProcesoTest;
	}

	public void setIsVisibilidadCeldaCancelarProcesoTest(Boolean isVisibilidadCeldaCancelarProcesoTest) {
		this.isVisibilidadCeldaCancelarProcesoTest = isVisibilidadCeldaCancelarProcesoTest;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoTest() {
		return isVisibilidadCeldaGuardarProcesoTest;
	}

	public void setIsVisibilidadCeldaGuardarProcesoTest(Boolean isVisibilidadCeldaGuardarProcesoTest) {
		this.isVisibilidadCeldaGuardarProcesoTest = isVisibilidadCeldaGuardarProcesoTest;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoTest() {
		return isVisibilidadCeldaGuardarCambiosProcesoTest;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoTest(Boolean isVisibilidadCeldaGuardarCambiosProcesoTest) {
		this.isVisibilidadCeldaGuardarCambiosProcesoTest = isVisibilidadCeldaGuardarCambiosProcesoTest;
	}
		
	public ProcesoTestSessionBean getprocesotestSessionBean() {
		return this.procesotestSessionBean;
	}
	
	public void setprocesotestSessionBean(ProcesoTestSessionBean procesotestSessionBean) {
		this.procesotestSessionBean=procesotestSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdEmpresaPorIdModulo() {
		return this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo;
	}

	public void setisVisibilidadBusquedaPorIdEmpresaPorIdModulo(Boolean isVisibilidadBusquedaPorIdEmpresaPorIdModulo) {
		this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo=isVisibilidadBusquedaPorIdEmpresaPorIdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoTest(ProcesoTest procesotest)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesotest,null);
				this.setActualParaGuardarModuloForeignKey(procesotest,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoTest procesotest,ProcesoTest procesotestAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoTest(procesotest);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesotestAux.setId(procesotest.getId());
		procesotestAux.setVersionRow(procesotest.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoTest procesotestLocal) throws Exception {
		
		if(this.procesotestSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoTest procesotestLocal) throws Exception {	
		if(this.procesotestSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesotestLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				procesotestLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoTestActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesotestValidator.getInvalidValues(this.procesotest);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoTest procesotest,List<ProcesoTest> procesotests) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoTest procesotest,List<ProcesoTest> procesotests) throws Exception {
		try	{			
			ProcesoTestConstantesFunciones.actualizarSelectedLista(procesotest,procesotests);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoTest> procesotestsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesotestsLocal=this.procesotestLogic.getProcesoTests();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesotestsLocal=this.procesotests;
			}
			//ARCHITECTURE
		
			for(ProcesoTest procesotestLocal:procesotestsLocal) {
				if(this.permiteMantenimiento(procesotestLocal) && procesotestLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoTestConstantesFunciones.getProcesoTestLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
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
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
		
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
		this.iIdNuevoProcesoTest--;	
		
		
		this.procesotestAux=new ProcesoTest();
		
		this.procesotestAux.setId(this.iIdNuevoProcesoTest);
		this.procesotestAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesotestLogic.getProcesoTests().add(this.procesotestAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesotests.add(this.procesotestAux);
		}
		//ARCHITECTURE
		
		this.procesotest=this.procesotestAux;
		
		if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoTest(this.procesotest);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoTest(this.procesotest);
		}
				
		//this.setDefaultControlesProcesoTest();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoTest();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoTest();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTest();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoTest(this.procesotestBean,this.procesotest,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoTest(this.procesotestReturnGeneral,this.procesotestBean,false);
		
		if(this.procesotestReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoTest(this.procesotestReturnGeneral.getProcesoTest());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoTest(this.procesotestReturnGeneral.getProcesoTest());
		}
		
		if(this.procesotestReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoTest(this.procesotestReturnGeneral.getProcesoTest(),classes);//this.procesotestBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoTest();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoTest();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoTestBeanSwingJInternalFrameAdditional.RecargarFormProcesoTest(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoTest(false);
						
			if(procesotestSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTest();
			}
			
			this.actualizarVisualTableDatosProcesoTest();
			
			this.jTableDatosProcesoTest.setRowSelectionInterval(this.getIndiceNuevoProcesoTest(), this.getIndiceNuevoProcesoTest());
			
			this.seleccionarFilaTablaProcesoTestActual();
						
			this.actualizarEstadoCeldasBotonesProcesoTest("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoTest(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoTest.jTextFieldnombreProcesoTest.setEnabled(isHabilitar && this.procesotestConstantesFunciones.activarnombreProcesoTest);	
		//
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setEnabled(isHabilitar && this.procesotestConstantesFunciones.activarid_empresaProcesoTest);//
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setEnabled(isHabilitar && this.procesotestConstantesFunciones.activarid_moduloProcesoTest);
	};
	
	public void setDefaultControlesProcesoTest() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoTest(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesotestSessionBean.setConGuardarRelaciones(true);			
			this.procesotestSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.setVisible(true);
			
					
		} else {
			//this.procesotestSessionBean.setConGuardarRelaciones(false);			
			this.procesotestSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoTest() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
				if(procesotestAux.getId().equals(this.iIdNuevoProcesoTest)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTest procesotestAux:this.procesotests) {
				if(procesotestAux.getId().equals(this.iIdNuevoProcesoTest)) {
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
	
	public int getIndiceActualProcesoTest(ProcesoTest procesotest,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
				if(procesotestAux.getId().equals(procesotest.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTest procesotestAux:this.procesotests) {
				if(procesotestAux.getId().equals(procesotest.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoTest(ProcesoTest procesotestOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
				if(procesotestAux.getProcesoTestOriginal().getId().equals(procesotestOriginal.getId())) {
					existe=true;
					procesotestOriginal.setId(procesotestAux.getId());
					procesotestOriginal.setVersionRow(procesotestAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTest procesotestAux:this.procesotests) {
				if(procesotestAux.getProcesoTestOriginal().getId().equals(procesotestOriginal.getId())) {
					existe=true;
					procesotestOriginal.setId(procesotestAux.getId());
					procesotestOriginal.setVersionRow(procesotestAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoTest(Boolean esParaCancelar) throws Exception {
		procesotestsAux=new ArrayList<ProcesoTest>();
		procesotestAux=new ProcesoTest();
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
					if(procesotestAux.getId()<0) {
						procesotestsAux.add(procesotestAux);
					}		
				}
				this.iIdNuevoProcesoTest=0L;
				this.procesotestLogic.getProcesoTests().removeAll(procesotestsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTest procesotestAux:this.procesotests) {
					if(procesotestAux.getId()<0) {
						procesotestsAux.add(procesotestAux);
					}		
				}
				this.iIdNuevoProcesoTest=0L;
				this.procesotests.removeAll(procesotestsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoTest 
					&& this.procesotestLogic.getProcesoTests().size()>0
					) {
					procesotestAux=this.procesotestLogic.getProcesoTests().get(this.procesotestLogic.getProcesoTests().size() - 1);
				
					if(procesotestAux.getId()<0) {
						this.procesotestLogic.getProcesoTests().remove(procesotestAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoTest && this.procesotests.size()>0) {
					procesotestAux=this.procesotests.get(this.procesotests.size() - 1);
				
					if(procesotestAux.getId()<0) {
						this.procesotests.remove(procesotestAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoTest(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesotest.getId()<0) {
				this.procesotestLogic.getProcesoTests().remove(this.procesotest);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesotest.getId()<0) {
				this.procesotests.remove(this.procesotest);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoTest(List<ProcesoTest> procesotestsAux) throws Exception {
		ProcesoTestConstantesFunciones.setEstadosInicialesProcesoTest(procesotestsAux);
	}
	
	public void setEstadosInicialesProcesoTest(ProcesoTest procesotestAux) throws Exception {
		ProcesoTestConstantesFunciones.setEstadosInicialesProcesoTest(procesotestAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoTestActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoTestActual()) {
				if(!this.isEsNuevoProcesoTest) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoTest=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoTestActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Test ?", "MANTENIMIENTO DE Proceso Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoTest procesotest) throws Exception {
		ProcesoTestConstantesFunciones.seleccionarAsignar(this.procesotest,procesotest);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoTest=this.isPermisoActualizarOriginalProcesoTest;
			
			
			this.seleccionarAsignar(procesotest);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesotestSessionBean.setsFuncionBusquedaRapida(this.procesotestSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoTest) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoTest(esParaCancelar);				
				this.cancelarNuevoProcesoTest(esParaCancelar);								
			}
			
			this.procesotest=new ProcesoTest();
			
			this.inicializarProcesoTest();
			
			this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoTest() throws Exception {
		try {
			ProcesoTestConstantesFunciones.inicializarProcesoTest(this.procesotest);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesotestLogic.getProcesoTests().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoTests(String sAccionBusqueda,List<ProcesoTest> procesotestsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoTest"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoTestMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoTestMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoTest"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Testes");		
		parameters.put("busquedapor", ProcesoTestConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoTest=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoTestConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoTestConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoTest=new JRBeanArrayDataSource(ProcesoTestJInternalFrame.TraerProcesoTestBeans(procesotestsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoTest);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoTestConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoTestConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoTestBean.TraerProcesoTestBeans(procesotestsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoTestActionPerformed(null);
					//this.generarExcelReporteProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoTests(sAccionBusqueda,sTipoArchivoReporte,procesotestsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTest> procesotestsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTests");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoTest("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoTest procesotest : procesotestsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoTestConstantesFunciones.generarExcelReporteDataProcesoTest("NORMAL",row,workbook,procesotest,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoTest(String sTipo,Row row,Workbook workbook) {
		
		ProcesoTestConstantesFunciones.generarExcelReporteHeaderProcesoTest(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTest> procesotestsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTests");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoTest procesotest : procesotestsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoTestConstantesFunciones.getProcesoTestDescripcion(procesotest));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesotest.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoTestConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesotest.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoTestConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesotest.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoTests(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTest> procesotestsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoTest> procesotestsRespaldo=null;
		
		classes=ProcesoTestConstantesFunciones.getClassesRelationshipsOfProcesoTest(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesotestLogic.setDatosCliente(this.datosCliente);
		this.procesotestLogic.setDatosDeep(this.datosDeep);
		this.procesotestLogic.setIsConDeep(true);
		
		procesotestsRespaldo=this.procesotestLogic.getProcesoTests();
		
		this.procesotestLogic.setProcesoTests(procesotestsParaReportes);	
		this.procesotestLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesotestsParaReportes=this.procesotestLogic.getProcesoTests();
		this.procesotestLogic.setProcesoTests(procesotestsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTests");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoTest("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoTest procesotest : procesotestsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoTest("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoTestConstantesFunciones.generarExcelReporteDataProcesoTest("NORMAL",row,workbook,procesotest,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoTestConstantesFunciones.getProcesoTestDescripcion(procesotest));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTest.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoTest() throws Exception {		
		this.startProcessProcesoTest(true);
	}
	
	public void startProcessProcesoTest(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoTest ,this.jPanelParametrosReportesProcesoTest, this.jScrollPanelDatosProcesoTest,this.jPanelPaginacionProcesoTest, this.jScrollPanelDatosEdicionProcesoTest, this.jPanelAccionesProcesoTest,this.jPanelAccionesFormularioProcesoTest,this.jmenuBarProcesoTest,this.jmenuBarDetalleProcesoTest,this.jTtoolBarProcesoTest,this.jTtoolBarDetalleProcesoTest);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoTest=this.jTabbedPaneBusquedasProcesoTest; 
		
		final JPanel jPanelParametrosReportesProcesoTest=this.jPanelParametrosReportesProcesoTest;
		//final JScrollPane jScrollPanelDatosProcesoTest=this.jScrollPanelDatosProcesoTest;
		final JTable jTableDatosProcesoTest=this.jTableDatosProcesoTest;		
		final JPanel jPanelPaginacionProcesoTest=this.jPanelPaginacionProcesoTest;
		//final JScrollPane jScrollPanelDatosEdicionProcesoTest=this.jScrollPanelDatosEdicionProcesoTest;
		final JPanel jPanelAccionesProcesoTest=this.jPanelAccionesProcesoTest;
		
		JPanel jPanelCamposAuxiliarProcesoTest=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoTest=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			jPanelCamposAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jPanelCamposProcesoTest;
			jPanelAccionesFormularioAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jPanelAccionesFormularioProcesoTest;
		}
		
		final JPanel jPanelCamposProcesoTest=jPanelCamposAuxiliarProcesoTest;
		final JPanel jPanelAccionesFormularioProcesoTest=jPanelAccionesFormularioAuxiliarProcesoTest;
		
		
		final JMenuBar jmenuBarProcesoTest=this.jmenuBarProcesoTest;
		final JToolBar jTtoolBarProcesoTest=this.jTtoolBarProcesoTest;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoTest=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoTest=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			jmenuBarDetalleAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jmenuBarDetalleProcesoTest;
			jTtoolBarDetalleAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jTtoolBarDetalleProcesoTest;
		}
		
		final JMenuBar jmenuBarDetalleProcesoTest=jmenuBarDetalleAuxiliarProcesoTest;
		final JToolBar jTtoolBarDetalleProcesoTest=jTtoolBarDetalleAuxiliarProcesoTest;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoTest;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoTest;
			processRunnable.jTableDatos=jTableDatosProcesoTest;
			processRunnable.jPanelCampos=jPanelCamposProcesoTest;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoTest;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoTest;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoTest;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoTest;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoTest;
			processRunnable.jTtoolBar=jTtoolBarProcesoTest;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoTest;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoTest ,jPanelParametrosReportesProcesoTest,jTableDatosProcesoTest, /*jScrollPanelDatosProcesoTest,*/jPanelCamposProcesoTest,jPanelPaginacionProcesoTest, /*jScrollPanelDatosEdicionProcesoTest,*/ jPanelAccionesProcesoTest,jPanelAccionesFormularioProcesoTest,jmenuBarProcesoTest,jmenuBarDetalleProcesoTest,jTtoolBarProcesoTest,jTtoolBarDetalleProcesoTest);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoTest ,jPanelParametrosReportesProcesoTest, jScrollPanelDatosProcesoTest,jPanelPaginacionProcesoTest, jScrollPanelDatosEdicionProcesoTest, jPanelAccionesProcesoTest,jPanelAccionesFormularioProcesoTest,jmenuBarProcesoTest,jmenuBarDetalleProcesoTest,jTtoolBarProcesoTest,jTtoolBarDetalleProcesoTest);
						
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
	
	public void finishProcessProcesoTest() {// throws Exception 
		this.finishProcessProcesoTest(true);
	}
	
	public void finishProcessProcesoTest(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoTest ,this.jPanelParametrosReportesProcesoTest, this.jScrollPanelDatosProcesoTest,this.jPanelPaginacionProcesoTest, this.jScrollPanelDatosEdicionProcesoTest, this.jPanelAccionesProcesoTest,this.jPanelAccionesFormularioProcesoTest,this.jmenuBarProcesoTest,this.jmenuBarDetalleProcesoTest,this.jTtoolBarProcesoTest,this.jTtoolBarDetalleProcesoTest);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoTest=this.jTabbedPaneBusquedasProcesoTest; 
		
		final JPanel jPanelParametrosReportesProcesoTest=this.jPanelParametrosReportesProcesoTest;
		//final JScrollPane jScrollPanelDatosProcesoTest=this.jScrollPanelDatosProcesoTest;
		final JTable jTableDatosProcesoTest=this.jTableDatosProcesoTest;		
		final JPanel jPanelPaginacionProcesoTest=this.jPanelPaginacionProcesoTest;
		//final JScrollPane jScrollPanelDatosEdicionProcesoTest=this.jScrollPanelDatosEdicionProcesoTest;
		final JPanel jPanelAccionesProcesoTest=this.jPanelAccionesProcesoTest;
		
		JPanel jPanelCamposAuxiliarProcesoTest=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoTest=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			jPanelCamposAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jPanelCamposProcesoTest;
			jPanelAccionesFormularioAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jPanelAccionesFormularioProcesoTest;
		}
		
		final JPanel jPanelCamposProcesoTest=jPanelCamposAuxiliarProcesoTest;
		final JPanel jPanelAccionesFormularioProcesoTest=jPanelAccionesFormularioAuxiliarProcesoTest;
		
		
		final JMenuBar jmenuBarProcesoTest=this.jmenuBarProcesoTest;		
		final JToolBar jTtoolBarProcesoTest=this.jTtoolBarProcesoTest;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoTest=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoTest=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			jmenuBarDetalleAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jmenuBarDetalleProcesoTest;
			jTtoolBarDetalleAuxiliarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jTtoolBarDetalleProcesoTest;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoTest=jmenuBarDetalleAuxiliarProcesoTest;
		final JToolBar jTtoolBarDetalleProcesoTest=jTtoolBarDetalleAuxiliarProcesoTest;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoTest;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoTest;
			processRunnable.jTableDatos=jTableDatosProcesoTest;
			processRunnable.jPanelCampos=jPanelCamposProcesoTest;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoTest;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoTest;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoTest;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoTest;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoTest;
			processRunnable.jTtoolBar=jTtoolBarProcesoTest;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoTest;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoTest ,jPanelParametrosReportesProcesoTest, jTableDatosProcesoTest,/*jScrollPanelDatosProcesoTest,*/jPanelCamposProcesoTest,jPanelPaginacionProcesoTest, /*jScrollPanelDatosEdicionProcesoTest,*/ jPanelAccionesProcesoTest,jPanelAccionesFormularioProcesoTest,jmenuBarProcesoTest,jmenuBarDetalleProcesoTest,jTtoolBarProcesoTest,jTtoolBarDetalleProcesoTest));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoTest(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoTest(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoTest(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoTest(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoTest,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoTest,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoTest(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoTest,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoTest,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesotestConstantesFunciones.getsFinalQueryProcesoTest();
		String  finalQueryPaginacionTodos=this.procesotestConstantesFunciones.getsFinalQueryProcesoTest();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoTestConstantesFunciones.getArrayColumnasGlobalesNoProcesoTest(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoTestConstantesFunciones.getArrayColumnasGlobalesProcesoTest(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoTestConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesotestsEliminados= new ArrayList<ProcesoTest>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoTest();
		
				///*ProcesoTestSessionBean*/this.procesotestSessionBean=new ProcesoTestSessionBean();
			
			if(this.procesotestSessionBean==null) {
				this.procesotestSessionBean=new ProcesoTestSessionBean();
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
					this.iNumeroPaginacion=ProcesoTestConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoTestConstantesFunciones.getClassesForeignKeysOfProcesoTest(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesotest."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesotestsAux= new ArrayList<ProcesoTest>();
			
				
			procesotestLogic.setDatosCliente(this.datosCliente);
			procesotestLogic.setDatosDeep(this.datosDeep);
			procesotestLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo")) {
				this.sDetalleReporte=ProcesoTestConstantesFunciones.getDetalleIndiceBusquedaPorIdEmpresaPorIdModulo(id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesotestLogic.getProcesoTestsBusquedaPorIdEmpresaPorIdModulo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoTestConstantesFunciones.getDetalleIndiceBusquedaPorIdEmpresaPorIdModulo(id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoTestConstantesFunciones.getDetalleIndiceBusquedaPorIdEmpresaPorIdModulo(id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesotestLogic.getProcesoTests()==null||procesotestLogic.getProcesoTests().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesotests==null|| procesotests.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesotestsAux=new ArrayList<ProcesoTest>();
						procesotestsAux.addAll(procesotestLogic.getProcesoTests());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesotestsAux=new ArrayList<ProcesoTest>();
							procesotestsAux.addAll(procesotests);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesotestLogic.getProcesoTestsBusquedaPorIdEmpresaPorIdModulo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoTestConstantesFunciones.getDetalleIndiceBusquedaPorIdEmpresaPorIdModulo(id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoTestConstantesFunciones.getDetalleIndiceBusquedaPorIdEmpresaPorIdModulo(id_empresaBusquedaPorIdEmpresaPorIdModulo,id_moduloBusquedaPorIdEmpresaPorIdModulo,nombreBusquedaPorIdEmpresaPorIdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoTests("BusquedaPorIdEmpresaPorIdModulo",procesotestLogic.getProcesoTests());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoTests("BusquedaPorIdEmpresaPorIdModulo",procesotests);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesotestLogic.setProcesoTests(new ArrayList<ProcesoTest>());
						procesotestLogic.getProcesoTests().addAll(procesotestsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesotests=new ArrayList<ProcesoTest>();
							procesotests.addAll(procesotestsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoTest();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoTest();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesotestLogic.getProcesoTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesotests.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesotestLogic.getProcesoTests().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesotests.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoTest procesotest) {
		Boolean permite=true;
		
		if(this.procesotest.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoTestConstantesFunciones.getOrderByListaProcesoTest();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoTestConstantesFunciones.getOrderByListaProcesoTest();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTest procesotest:procesotestLogic.getProcesoTests()) {
				if(procesotest.getsType().equals(Constantes2.S_TOTALES)) {
					procesotestTotales=procesotest;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTest procesotest:this.procesotests) {
				if(procesotest.getsType().equals(Constantes2.S_TOTALES)) {
					procesotestTotales=procesotest;
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
			this.procesotestAux=new ProcesoTest();
			this.procesotestAux.setsType(Constantes2.S_TOTALES);
			this.procesotestAux.setIsNew(false);
			this.procesotestAux.setIsChanged(false);
			this.procesotestAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoTestConstantesFunciones.TotalizarValoresFilaProcesoTest(this.procesotestLogic.getProcesoTests(),this.procesotestAux);
				
				//this.procesotestLogic.getProcesoTests().add(this.procesotestAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoTestConstantesFunciones.TotalizarValoresFilaProcesoTest(this.procesotests,this.procesotestAux);
				
				this.procesotests.add(this.procesotestAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesotestTotales=new ProcesoTest();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesotestLogic.getProcesoTests().remove(procesotestTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesotests.remove(procesotestTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesotestTotales=new ProcesoTest();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTest procesotest:procesotestLogic.getProcesoTests()) {
				if(procesotest.getsType().equals(Constantes2.S_TOTALES)) {
					procesotestTotales=procesotest;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoTestConstantesFunciones.TotalizarValoresFilaProcesoTest(this.procesotestLogic.getProcesoTests(),procesotestTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTest procesotest:this.procesotests) {
				if(procesotest.getsType().equals(Constantes2.S_TOTALES)) {
					procesotestTotales=procesotest;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoTestConstantesFunciones.TotalizarValoresFilaProcesoTest(this.procesotests,procesotestTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoTestsBusquedaPorIdEmpresaPorIdModulo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdEmpresaPorIdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoTestsBusquedaPorIdEmpresaPorIdModulo(String sFinalQuery,Long id_empresa,Long id_modulo,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesotestLogic.getProcesoTestsBusquedaPorIdEmpresaPorIdModulo(sFinalQuery,this.pagination,id_empresa,id_modulo,nombre);
				
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
	
	public void inicializarPermisosProcesoTest() {
		this.isPermisoTodoProcesoTest=false;
		this.isPermisoNuevoProcesoTest=false;
		this.isPermisoActualizarProcesoTest=false;
		this.isPermisoActualizarOriginalProcesoTest=false;
		this.isPermisoEliminarProcesoTest=false;
		this.isPermisoGuardarCambiosProcesoTest=false;
		this.isPermisoConsultaProcesoTest=true;
		this.isPermisoBusquedaProcesoTest=true;
		this.isPermisoReporteProcesoTest=true;
		this.isPermisoOrdenProcesoTest=false;		
		this.isPermisoPaginacionMedioProcesoTest=false;		
		this.isPermisoPaginacionAltoProcesoTest=false;		
		this.isPermisoPaginacionTodoProcesoTest=false;		
		this.isPermisoCopiarProcesoTest=false;		
		this.isPermisoVerFormProcesoTest=false;		
		this.isPermisoDuplicarProcesoTest=false;
		this.isPermisoOrdenProcesoTest=false;
	}
	
	public void setPermisosUsuarioProcesoTest(Boolean isPermiso) {
		this.isPermisoTodoProcesoTest=isPermiso;
		this.isPermisoNuevoProcesoTest=isPermiso;
		this.isPermisoActualizarProcesoTest=isPermiso;
		this.isPermisoActualizarOriginalProcesoTest=isPermiso;
		this.isPermisoEliminarProcesoTest=isPermiso;
		this.isPermisoGuardarCambiosProcesoTest=isPermiso;
		this.isPermisoConsultaProcesoTest=isPermiso;
		this.isPermisoBusquedaProcesoTest=isPermiso;
		this.isPermisoReporteProcesoTest=isPermiso;
		this.isPermisoOrdenProcesoTest=isPermiso;		
		this.isPermisoPaginacionMedioProcesoTest=isPermiso;		
		this.isPermisoPaginacionAltoProcesoTest=isPermiso;		
		this.isPermisoPaginacionTodoProcesoTest=isPermiso;		
		this.isPermisoCopiarProcesoTest=isPermiso;		
		this.isPermisoVerFormProcesoTest=isPermiso;		
		this.isPermisoDuplicarProcesoTest=isPermiso;
		this.isPermisoOrdenProcesoTest=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoTest(Boolean isPermiso) {
		//this.isPermisoTodoProcesoTest=isPermiso;
		this.isPermisoNuevoProcesoTest=isPermiso;
		this.isPermisoActualizarProcesoTest=isPermiso;
		this.isPermisoActualizarOriginalProcesoTest=isPermiso;
		this.isPermisoEliminarProcesoTest=isPermiso;
		this.isPermisoGuardarCambiosProcesoTest=isPermiso;
		//this.isPermisoConsultaProcesoTest=isPermiso;
		//this.isPermisoBusquedaProcesoTest=isPermiso;
		//this.isPermisoReporteProcesoTest=isPermiso;
		//this.isPermisoOrdenProcesoTest=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoTest=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoTest=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoTest=isPermiso;		
		//this.isPermisoCopiarProcesoTest=isPermiso;		
		//this.isPermisoDuplicarProcesoTest=isPermiso;
		//this.isPermisoOrdenProcesoTest=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoTestClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoTest(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoTestClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoTestClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoTestClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoTestClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoTest() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoTestJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesotestSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoTestConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoTest=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoTest=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoTest=this.isPermisoActualizarProcesoTest;
			this.isPermisoEliminarProcesoTest=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoTest=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoTest=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoTest=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoTest=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoTest=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoTest=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoTest=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoTest=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoTest=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoTest=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoTest=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoTest=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoTest=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesotestSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoTest.setToolTipText(this.jTableDatosProcesoTest.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoTest(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoTest(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoTestJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoTest() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoTestListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoTestListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoTestJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoTest()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.procesotestSessionBean==null) {
				this.procesotestSessionBean=new ProcesoTestSessionBean();
			}

			if(!this.procesotestSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.procesotestSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoTest()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoTest(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoTest()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTest();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoTest(ProcesoTest procesotest)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoTest(ProcesoTest procesotest,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoTest()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTest()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoTest()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoTest()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoTest()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoTest()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoTest(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoTest()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ProcesoTestBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoTestBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoTestBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesotestSessionBean=new ProcesoTestSessionBean(); 
		this.procesotestConstantesFunciones=new ProcesoTestConstantesFunciones(); 
		this.procesotestBean=new ProcesoTest();//(this.procesotestConstantesFunciones); 		
		this.procesotestReturnGeneral=new ProcesoTestParameterReturnGeneral(); 
		
		this.procesotestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesotestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoTestBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoTest(true);
			
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
			
			this.procesotestConstantesFunciones=new ProcesoTestConstantesFunciones(); 
			this.procesotestBean=new ProcesoTest();//this.procesotestConstantesFunciones); 			
			this.procesotestReturnGeneral=new ProcesoTestParameterReturnGeneral(); 
		
			ProcesoTestBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Test Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesotest=new ProcesoTest();
			this.procesotests = new ArrayList<ProcesoTest>();
			this.procesotestsAux = new ArrayList<ProcesoTest>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic=new ProcesoTestLogic();
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			//this.procesotestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesotestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoTest);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoTest);	
					}
					
					if(this.jInternalFrameImportacionProcesoTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoTest);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoTest!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoTest);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoTest!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoTest);
				this.jInternalFrameDetalleFormProcesoTest.setVisible(false);
				this.jInternalFrameDetalleFormProcesoTest.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoTest);
					this.jInternalFrameReporteDinamicoProcesoTest.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoTest.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoTest);
					this.jInternalFrameImportacionProcesoTest.setVisible(false);
					this.jInternalFrameImportacionProcesoTest.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoTest!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoTest);
					this.jInternalFrameOrderByProcesoTest.setVisible(false);
					this.jInternalFrameOrderByProcesoTest.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoTestActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoTestConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesotestReturnGeneral=new ProcesoTestParameterReturnGeneral();
			
			this.procesotestParameterGeneral=new ProcesoTestParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesotestLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoTestJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesotestSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoTestConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesotestSessionBean.getEsGuardarRelacionado(),this.procesotestSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoTestConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesotestSessionBean.getEsGuardarRelacionado(),this.procesotestSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaDuplicarProcesoTest=true;
			this.isVisibilidadCeldaCopiarProcesoTest=true;
			this.isVisibilidadCeldaVerFormProcesoTest=true;
			this.isVisibilidadCeldaOrdenProcesoTest=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=false;
			this.isVisibilidadCeldaGuardarProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			
			
			this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoTest();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoTest(false);
			
			this.setPermisosUsuarioProcesoTest();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesotestSessionBean.getEsGuardarRelacionado() 
				|| (this.procesotestSessionBean.getEsGuardarRelacionado() && this.procesotestSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoTestClasesRelacionadas();
			}
			
			if(this.procesotestSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoTestClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoTest();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoTest();
			}
			
			if(!this.isPermisoBusquedaProcesoTest) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoTest.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoTestConstantesFunciones.getTiposSeleccionarProcesoTest());
				
				this.tiposColumnasSelect=ProcesoTestConstantesFunciones.getTiposSeleccionarProcesoTest(true);
				
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
			//if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoTest();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoTest(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoTest(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTest() ;
			
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
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesotestImplementable= (ProcesoTestImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoTestConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesotestImplementableHome= (ProcesoTestImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoTestConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesotests= new ArrayList<ProcesoTest>();
			this.procesotestsEliminados= new ArrayList<ProcesoTest>();
						
			this.isEsNuevoProcesoTest=false;
			this.esParaAccionDesdeFormularioProcesoTest=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoTest(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoTest();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoTestBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoTestConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoTest("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoTest(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoTest();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoTest();
			}
			
			ProcesoTestBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoTest.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoTest.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoTest.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoTest(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoTest: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoTest() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoTest")) {
				iIndex=this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoTest();	
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
	
	public void cargarCombosForeignKeyProcesoTest(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoTest(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoTest(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoTestListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoTest();
		
		this.cargarCombosFrameForeignKeyProcesoTest();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoTest();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoTest();
		}
	}
	
	
	
	public void jButtonNuevoProcesoTestActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesotestSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			
			if(jTableDatosProcesoTest.getRowCount()>=1) {
				jTableDatosProcesoTest.removeRowSelectionInterval(0, jTableDatosProcesoTest.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoTest=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoTest(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoTest(true);			
			//this.procesotest=new ProcesoTest();
			//this.procesotest.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTest(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTest() ;
			
			if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTest(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesotest);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesotest);				
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			if(this.procesotestSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoTest: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoTestActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoTest.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoTest.getSelectedRows().length;			
			}
			
			procesotestsSeleccionados=this.getProcesoTestsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoTest--;			
				//ProcesoTest procesotestAux= new ProcesoTest();			
				//procesotestAux.setId(this.iIdNuevoProcesoTest);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoTest procesotestOrigen=new ProcesoTest();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoTest procesotestOrigen : procesotestsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesotestOrigen =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesotestOrigen =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoTest();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesotest.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoTest(procesotestOrigen,this.procesotest,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesotestLogic.getProcesoTests().add(this.procesotestAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesotests.add(this.procesotestAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoTest(false);
				
				this.jTableDatosProcesoTest.setRowSelectionInterval(this.getIndiceNuevoProcesoTest(), this.getIndiceNuevoProcesoTest());
				
				int iLastRow =  this.jTableDatosProcesoTest.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoTest.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoTest.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTest(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();									
		
			ProcesoTest procesotestOrigen=new ProcesoTest();
			ProcesoTest procesotestDestino=new ProcesoTest();
				
			procesotestsSeleccionados=this.getProcesoTestsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoTest.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesotestsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoTest.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesotestOrigen =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesotestOrigen =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesotestDestino =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesotestDestino =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesotestOrigen =procesotestsSeleccionados.get(0);
				procesotestDestino =procesotestsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoTest(procesotestOrigen,procesotestDestino,true,false);
				
				procesotestDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesotestDestino,procesotestLogic.getProcesoTests());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesotestDestino,procesotests);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoTest(false);
				
				//this.jTableDatosProcesoTest.setRowSelectionInterval(this.getIndiceNuevoProcesoTest(), this.getIndiceNuevoProcesoTest());
				
				int iLastRow =  this.jTableDatosProcesoTest.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoTest.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoTest.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTest(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoTest.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoTest.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoTest.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoTest.setVisible(!isVisible);
			this.jPanelPaginacionProcesoTest.setVisible(!isVisible);
			this.jPanelAccionesProcesoTest.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoTest();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoTest();
			
			this.abrirFrameOrderByProcesoTest();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoTest();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoTest(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoTest);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoTest.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoTest.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoTest.setSize(this.jInternalFrameDetalleFormProcesoTest.iWidthFormulario,this.jInternalFrameDetalleFormProcesoTest.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoTest.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoTest.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoTest.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoTest.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoTest.jContentPaneDetalleProcesoTest.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoTest.jContentPaneDetalleProcesoTest.getWidth(),ProcesoTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoTest.jContentPaneDetalleProcesoTest.getWidth(),ProcesoTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoTest.jContentPaneDetalleProcesoTest.getWidth(),ProcesoTestConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoTest.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoTest.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoTest() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoTest==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTest,false,this);
				} else {
					this.jInternalFrameOrderByProcesoTest=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTest,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoTest);
				this.jInternalFrameOrderByProcesoTest.setVisible(false);
				this.jInternalFrameOrderByProcesoTest.setSelected(false);
				
				this.jInternalFrameOrderByProcesoTest.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoTest"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoTest();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoTest() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoTest==null) {
				
				this.jInternalFrameImportacionProcesoTest=new ImportacionJInternalFrame(ProcesoTestConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoTest);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoTest);
				this.jInternalFrameImportacionProcesoTest.setVisible(false);
				this.jInternalFrameImportacionProcesoTest.setSelected(false);


				this.jInternalFrameImportacionProcesoTest.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoTest"));
				this.jInternalFrameImportacionProcesoTest.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoTest"));
				this.jInternalFrameImportacionProcesoTest.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoTest"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoTest() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoTest==null) {
				this.jInternalFrameReporteDinamicoProcesoTest=new ReporteDinamicoJInternalFrame(ProcesoTestConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoTest);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoTest);
				this.jInternalFrameReporteDinamicoProcesoTest.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoTest.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTest"));
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTest"));
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTest"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTest();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoTest() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoTest);
			
	       	this.jInternalFrameDetalleFormProcesoTest.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoTest.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoTest.dispose();
			//this.jInternalFrameDetalleFormProcesoTest=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoTest() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoTest.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoTest() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoTest.setVisible(true);
	        this.jInternalFrameImportacionProcesoTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoTest() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoTest.setVisible(true);
	        this.jInternalFrameOrderByProcesoTest.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoTest() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoTest.setVisible(false);
	        this.jInternalFrameOrderByProcesoTest.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoTest() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoTest.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoTest.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoTest() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoTest.setVisible(false);
	        this.jInternalFrameImportacionProcesoTest.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoTest(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoTest(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoTest(true);
			//this.isEsNuevoProcesoTest=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTest(false) ;
			
			if(procesotestSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTest(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTest(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoTestActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoTest(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoTest(true);
			//this.isEsNuevoProcesoTest=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesotest.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoTest("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoTest(false) ;
			
			if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTest(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTest(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoTest(false);
			
			//if(!this.isEsNuevoProcesoTest) {								
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				
			}
			
			if(this.permiteMantenimiento(this.procesotest)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesotestSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoTest=true;
					this.inicializarActualizarBindingTablaProcesoTest(false);
					this.isEsNuevoProcesoTest=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoTest=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoTest=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoTest(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTest(false);
				
				this.habilitarDeshabilitarControlesProcesoTest(false);
			
												
				
				if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoTest();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoTestActionPerformed(evt,procesotestSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoTest(this.procesotest,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoTest.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesotestSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesotest.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoTestActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				this.procesotest.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				this.procesotest.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesotest)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesotestSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoTestModel) this.jTableDatosProcesoTest.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoTest=true;
				this.inicializarActualizarBindingTablaProcesoTest(false);
				this.isEsNuevoProcesoTest=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoTest(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTest(false);
				
				this.habilitarDeshabilitarControlesProcesoTest(false);
				
				
				
				if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoTest();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoTestActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoTest.getRowCount()>=1) {
				jTableDatosProcesoTest.removeRowSelectionInterval(0, jTableDatosProcesoTest.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoTest(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoTest(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTest(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTest(false) ;
			
			this.isEsNuevoProcesoTest=false;
			
			if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoTest();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoTest(false);
				
				//SI ES MANUAL
				if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoTest();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoTest--;			
			//ProcesoTest procesotestAux= new ProcesoTest();			
			//procesotestAux.setId(this.iIdNuevoProcesoTest);
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoTest();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
			
			this.procesotest.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesotestLogic.getProcesoTests().add(this.procesotestAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesotests.add(this.procesotestAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoTest(false);
			
			this.jTableDatosProcesoTest.setRowSelectionInterval(this.getIndiceNuevoProcesoTest(), this.getIndiceNuevoProcesoTest());
			
			int iLastRow =  this.jTableDatosProcesoTest.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoTest.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoTest.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoTest(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoTest(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTest(false);
			
			//SI ES MANUAL
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTest();
			}
			
			//this.abrirFrameTreeProcesoTest();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoTestActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoTestActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoTest.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoTest.setFileImportacion(this.jInternalFrameImportacionProcesoTest.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoTest.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoTest.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoTest.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoTest.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		

		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoTestBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoTestBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoTests("Todos",procesotestsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		if(this.jInternalFrameReporteDinamicoProcesoTest.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
								
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
								
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoTestActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoTests");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoTestConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoTest procesotest:procesotestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesotest.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoTestConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(ProcesoTest procesotest:procesotestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesotest.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoTestConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoTest procesotest:procesotestsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesotest.getnombre());
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
			//	this.getFilaCabeceraExportarExcelProcesoTest(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoTest(procesotestAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoTestBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoTest(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTest(false);
			
			//SI ES MANUAL
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTest();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTest(false);
			
			//SI ES MANUAL
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoTest();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoTestActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTest(false);
			
			//SI ES MANUAL
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoTest();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoTest() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoTest.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoTest.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoTest.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoTest.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoTest.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoTest.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoTest.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoTest(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoTest(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoTest(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoTest(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoTest(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoTest(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTest(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoTest(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoTest() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoTest();
		
		this.inicializarActualizarBindingBotonesManualProcesoTest(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoTest();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTest() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTest(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTest(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoTest.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoTest.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoTest.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoTest!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionNuevoProcesoTest.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionSinCerrarProcesoTest.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionSinMensajeProcesoTest.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoTest.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoTest.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoTest.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoTest!=null) {
				this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionNuevoProcesoTest.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionSinCerrarProcesoTest.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoTest.jCheckBoxPostAccionSinMensajeProcesoTest.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoTest.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoTest.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoTest.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoTest.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoTest.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoTest.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoTest.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoTest.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoTest.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoTest(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTest(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTest() throws Exception {
		try	{
			if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoTest();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoTest() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoTest() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoTest.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoTest.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoTest.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoTest.addItem(reporte);
			}
			
			
			if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoTest.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoTest.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoTest.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoTest.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoTest.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoTest.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoTest.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTest();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTest() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
				this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
				this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoTest.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoTest.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoTest.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoTest.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoTest.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoTest()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.getSelectedItem()!=null){this.id_empresaBusquedaPorIdEmpresaPorIdModulo=((Empresa)this.jComboBoxid_empresaBusquedaPorIdEmpresaPorIdModuloProcesoTest.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.getSelectedItem()!=null){this.id_moduloBusquedaPorIdEmpresaPorIdModulo=((Modulo)this.jComboBoxid_moduloBusquedaPorIdEmpresaPorIdModuloProcesoTest.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdEmpresaPorIdModulo=this.jTextFieldnombreBusquedaPorIdEmpresaPorIdModuloProcesoTest.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoTest(Boolean esInicializar) throws Exception {				
		if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoTest();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoTest() throws Exception {
		this.inicializarActualizarBindingTablaProcesoTest(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoTest() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoTestPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoTestPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoTestOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTestOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoTestPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoTestPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoTest(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesotestLogic.getProcesoTests().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesotests.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoTest.setModel(new ProcesoTestModel(this.procesotestLogic.getProcesoTests(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoTest.setModel(new ProcesoTestModel(this.procesotests,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoTest!=null && this.jInternalFrameOrderByProcesoTest.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoTest();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTest,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoTestPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO,procesotestConstantesFunciones.resaltarSeleccionarProcesoTest,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO,procesotestConstantesFunciones.resaltarSeleccionarProcesoTest,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTest,ProcesoTestConstantesFunciones.LABEL_ID));

		if(this.procesotestConstantesFunciones.mostraridProcesoTest && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoTestConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesotestConstantesFunciones.resaltaridProcesoTest,this.procesotestConstantesFunciones.activaridProcesoTest,this,true,"idProcesoTest","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesotestConstantesFunciones.resaltaridProcesoTest,this.procesotestConstantesFunciones.activaridProcesoTest,this,true,"idProcesoTest","BASICO",false));

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
					
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesotestSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesotestSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoTest.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesotestSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesotestSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoTest.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoTest && this.isPermisoGuardarCambiosProcesoTest) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesotestSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesotestSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoTest.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoTest.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoTest && this.isPermisoGuardarCambiosProcesoTest) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoTest && this.isPermisoGuardarCambiosProcesoTest) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoTest.moveColumn(this.jTableDatosProcesoTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoTest.moveColumn(this.jTableDatosProcesoTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoTest.moveColumn(this.jTableDatosProcesoTest.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoTest.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoTest.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoTest,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoTest.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoTest.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoTest.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoTest.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoTest.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesotestLogic.getProcesoTests().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesotests.size()-1;
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
		//this.jTableDatosProcesoTest.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoTest.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoTest();
			
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
				
				//this.isEsNuevoProcesoTest=false;
					
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
				if(this.procesotestSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoTest==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoTest.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoTest.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesotest.getsType().equals("DUPLICADO")
				   || this.procesotest.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoTest=true;
				
				} else {
					this.isEsNuevoProcesoTest=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
					if(this.procesotest.getId()>=0 && !this.procesotest.getIsNew()) {						
						this.isEsNuevoProcesoTest=false;
						
					} else {
						this.isEsNuevoProcesoTest=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoTest(esRelaciones);						
				
				this.seleccionarProcesoTest(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesotest.getId()<0) {
					this.isEsNuevoProcesoTest=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoTest(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoTest(evt,rowIndex);
				}	
				
				if(this.procesotestSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoTest: " + this.dDif); 
					}
				}								
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoTest(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesotest)) {
					if(this.procesotest.getId()>0) {
						this.procesotest.setIsDeleted(true);
						
						this.procesotestsEliminados.add(this.procesotest);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesotestLogic.getProcesoTests().remove(this.procesotest);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesotests.remove(this.procesotest);				
					}
					
					
					((ProcesoTestModel) this.jTableDatosProcesoTest.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTest(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoTest(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoTest) {
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoTest.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoTest.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoTest(this.procesotest);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoTest("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoTest(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTest() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoTest(ProcesoTest procesotest) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoTest(procesotest,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoTest(ProcesoTest procesotest,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoTest(procesotest);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoTest(procesotest,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoTest(procesotest);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoTest(ProcesoTest procesotest) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setText(procesotest.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoTest procesotestLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesotestLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoTest procesotestLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesotestLocal=this.procesotest;
			} else {
				procesotestLocal=this.procesotestAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesotestLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoTest(procesotestLocal,true);
					
					if(procesotestSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesotestLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesotestSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesotestLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoTest(ProcesoTest procesotest,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoTest(procesotest,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(procesotest);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoTest(ProcesoTest procesotest,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoTest(procesotest,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoTest(ProcesoTest procesotest,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.getText()==null || this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.getText()=="" || this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setText("0");
			}

			if(conColumnasBase) {procesotest.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoTestConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoTest.jLabelIdProcesoTest,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoTest(ProcesoTest procesotestBean,ProcesoTest procesotest,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoTest(ProcesoTest procesotestOrigen,ProcesoTest procesotest,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesotestOrigen.getId()!=null && !procesotestOrigen.getId().equals(0L))) {procesotest.setId(procesotestOrigen.getId());}}
			if(conDefault || (!conDefault && procesotestOrigen.getnombre()!=null && !procesotestOrigen.getnombre().equals(""))) {procesotest.setnombre(procesotestOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoTest(ProcesoTest procesotest) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setText(procesotest.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoTest(ProcesoTestBean procesotestBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setText(procesotestBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoTest(ProcesoTestParameterReturnGeneral procesotestReturnGeneral,ProcesoTestBean procesotestBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoTest procesotestLocal=new ProcesoTest();
			
			procesotestLocal=procesotestReturnGeneral.getProcesoTest();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesotestLocal.getId()!=null && !procesotestLocal.getId().equals(0L))) {procesotestBean.setId(procesotestLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoTestGenerico(Long idProcesoTestSeleccionado,JComboBox jComboBoxProcesoTest,List<ProcesoTest> procesotestsLocal)throws Exception {
		try {
			ProcesoTest  procesotestTemp=null;

			for(ProcesoTest procesotestAux:procesotestsLocal) {
				if(procesotestAux.getId()!=null && procesotestAux.getId().equals(idProcesoTestSeleccionado)) {
					procesotestTemp=procesotestAux;
					break;
				}
			}

			jComboBoxProcesoTest.setSelectedItem(procesotestTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoTestGenerico(JComboBox jComboBoxProcesoTest,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoTest.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoTest.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoTest.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoTest.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesotest=(ProcesoTest) procesotestLogic.getProcesoTests().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesotest =(ProcesoTest) procesotests.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesotest.getIsNew() && !procesotest.getIsChanged() && !procesotest.getIsDeleted()) {
				sDescripcion=procesotest.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesotest.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!procesotest.getIsNew() && !procesotest.getIsChanged() && !procesotest.getIsDeleted()) {
				sDescripcion=procesotest.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=procesotest.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoTest procesotestRow=new ProcesoTest();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesotestRow=(ProcesoTest) procesotestLogic.getProcesoTests().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesotestRow=(ProcesoTest) procesotests.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoTest(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest));			
			this.jButtonDuplicarProcesoTest.setVisible((this.isVisibilidadCeldaDuplicarProcesoTest && this.isPermisoDuplicarProcesoTest));			
			this.jButtonCopiarProcesoTest.setVisible((this.isVisibilidadCeldaCopiarProcesoTest && this.isPermisoCopiarProcesoTest));
			this.jButtonVerFormProcesoTest.setVisible((this.isVisibilidadCeldaVerFormProcesoTest && this.isPermisoVerFormProcesoTest));
			
			this.jButtonAbrirOrderByProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));			
			
			this.jButtonNuevoRelacionesProcesoTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTest && this.isPermisoNuevoProcesoTest));			
			this.jButtonNuevoGuardarCambiosProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest && this.isPermisoGuardarCambiosProcesoTest));
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonModificarProcesoTest.setVisible((this.isVisibilidadCeldaModificarProcesoTest && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.setVisible((this.isVisibilidadCeldaActualizarProcesoTest && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.setVisible((this.isVisibilidadCeldaEliminarProcesoTest && this.isPermisoEliminarProcesoTest));
			this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.setVisible(this.isVisibilidadCeldaCancelarProcesoTest);							
			this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.setVisible((this.isVisibilidadCeldaGuardarProcesoTest && this.isPermisoGuardarCambiosProcesoTest));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoTest.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTest && this.isPermisoGuardarCambiosProcesoTest));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest));						
			this.jButtonDuplicarToolBarProcesoTest.setVisible((this.isVisibilidadCeldaDuplicarProcesoTest && this.isPermisoDuplicarProcesoTest));						
			this.jButtonCopiarToolBarProcesoTest.setVisible((this.isVisibilidadCeldaCopiarProcesoTest && this.isPermisoCopiarProcesoTest));			
			this.jButtonVerFormToolBarProcesoTest.setVisible((this.isVisibilidadCeldaVerFormProcesoTest && this.isPermisoVerFormProcesoTest));			
			this.jButtonAbrirOrderByToolBarProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));
			this.jButtonNuevoRelacionesToolBarProcesoTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTest && this.isPermisoNuevoProcesoTest));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest && this.isPermisoGuardarCambiosProcesoTest));			
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonModificarToolBarProcesoTest.setVisible((this.isVisibilidadCeldaModificarProcesoTest && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarToolBarProcesoTest.setVisible((this.isVisibilidadCeldaActualizarProcesoTest  && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarToolBarProcesoTest.setVisible((this.isVisibilidadCeldaEliminarProcesoTest && this.isPermisoEliminarProcesoTest));
			this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarToolBarProcesoTest.setVisible(this.isVisibilidadCeldaCancelarProcesoTest);				
			this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosToolBarProcesoTest.setVisible((this.isVisibilidadCeldaGuardarProcesoTest && this.isPermisoGuardarCambiosProcesoTest));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoTest.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTest && this.isPermisoGuardarCambiosProcesoTest));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest));			
			this.jMenuItemDuplicarProcesoTest.setVisible((this.isVisibilidadCeldaDuplicarProcesoTest && this.isPermisoDuplicarProcesoTest));			
			this.jMenuItemCopiarProcesoTest.setVisible((this.isVisibilidadCeldaCopiarProcesoTest && this.isPermisoCopiarProcesoTest));			
			this.jMenuItemVerFormProcesoTest.setVisible((this.isVisibilidadCeldaVerFormProcesoTest && this.isPermisoVerFormProcesoTest));			
			this.jMenuItemAbrirOrderByProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));			
			//this.jMenuItemMostrarOcultarProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));
			this.jMenuItemDetalleAbrirOrderByProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));			
			//this.jMenuItemDetalleMostrarOcultarProcesoTest.setVisible((this.isVisibilidadCeldaOrdenProcesoTest && this.isPermisoOrdenProcesoTest));			
			this.jMenuItemNuevoRelacionesProcesoTest.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTest && this.isPermisoNuevoProcesoTest));			
			this.jMenuItemNuevoGuardarCambiosProcesoTest.setVisible((this.isVisibilidadCeldaNuevoProcesoTest && this.isPermisoNuevoProcesoTest && this.isPermisoGuardarCambiosProcesoTest));									
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemModificarProcesoTest.setVisible((this.isVisibilidadCeldaModificarProcesoTest && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemActualizarProcesoTest.setVisible((this.isVisibilidadCeldaActualizarProcesoTest && this.isPermisoActualizarProcesoTest));	
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemEliminarProcesoTest.setVisible((this.isVisibilidadCeldaEliminarProcesoTest && this.isPermisoEliminarProcesoTest));
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemCancelarProcesoTest.setVisible(this.isVisibilidadCeldaCancelarProcesoTest);				
			}
			
			this.jMenuItemGuardarCambiosProcesoTest.setVisible((this.isVisibilidadCeldaGuardarProcesoTest && this.isPermisoGuardarCambiosProcesoTest));						
			this.jMenuItemGuardarCambiosTablaProcesoTest.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTest && this.isPermisoGuardarCambiosProcesoTest));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoTest=this.jButtonNuevoProcesoTest.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoTest=this.jButtonDuplicarProcesoTest.isVisible();
			this.isVisibilidadCeldaCopiarProcesoTest=this.jButtonCopiarProcesoTest.isVisible();
			this.isVisibilidadCeldaVerFormProcesoTest=this.jButtonVerFormProcesoTest.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoTest=this.jButtonAbrirOrderByProcesoTest.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=this.jButtonNuevoRelacionesProcesoTest.isVisible();
			this.isVisibilidadCeldaModificarProcesoTest=this.jButtonModificarProcesoTest.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.isVisibilidadCeldaActualizarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.isVisible();
			this.isVisibilidadCeldaGuardarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=this.jButtonGuardarCambiosTablaProcesoTest.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoTest=this.jButtonNuevoToolBarProcesoTest.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=this.jButtonNuevoRelacionesToolBarProcesoTest.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.isVisibilidadCeldaModificarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonModificarToolBarProcesoTest.isVisible();
			this.isVisibilidadCeldaActualizarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarToolBarProcesoTest.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarToolBarProcesoTest.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarToolBarProcesoTest.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoTest=this.jButtonGuardarCambiosToolBarProcesoTest.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=this.jButtonGuardarCambiosTablaToolBarProcesoTest.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoTest=this.jMenuItemNuevoProcesoTest.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=this.jMenuItemNuevoRelacionesProcesoTest.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.isVisibilidadCeldaModificarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jMenuItemModificarProcesoTest.isVisible();
			this.isVisibilidadCeldaActualizarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jMenuItemActualizarProcesoTest.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jMenuItemEliminarProcesoTest.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTest=this.jInternalFrameDetalleFormProcesoTest.jMenuItemCancelarProcesoTest.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoTest=this.jMenuItemGuardarCambiosProcesoTest.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=this.jMenuItemGuardarCambiosTablaProcesoTest.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoTest(Boolean esInicializar) {
		if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesotestSessionBean.getConGuardarRelaciones()) {
				//if(this.procesotestSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoTest();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoTest(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoTest() {
		this.jButtonNuevoProcesoTest.setVisible(this.isPermisoNuevoProcesoTest);			
		this.jButtonDuplicarProcesoTest.setVisible(this.isPermisoDuplicarProcesoTest);			
		this.jButtonCopiarProcesoTest.setVisible(this.isPermisoCopiarProcesoTest);			
		this.jButtonVerFormProcesoTest.setVisible(this.isPermisoVerFormProcesoTest);			
		
		this.jButtonAbrirOrderByProcesoTest.setVisible(this.isPermisoOrdenProcesoTest);					
		
		this.jButtonNuevoRelacionesProcesoTest.setVisible(this.isPermisoNuevoProcesoTest);			
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonModificarProcesoTest.setVisible(this.isPermisoActualizarProcesoTest);	
			this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.setVisible(this.isPermisoActualizarProcesoTest);	
			this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.setVisible(this.isPermisoEliminarProcesoTest);
			this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.setVisible(this.isVisibilidadCeldaCancelarProcesoTest);						
			this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.setVisible(this.isPermisoGuardarCambiosProcesoTest);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoTest.setVisible(this.isPermisoActualizarProcesoTest);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoTest() {
		this.jInternalFrameDetalleFormProcesoTest.jButtonModificarProcesoTest.setVisible(this.isPermisoActualizarProcesoTest);	
		this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.setVisible(this.isPermisoActualizarProcesoTest);	
		this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.setVisible(this.isPermisoEliminarProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.setVisible(this.isVisibilidadCeldaCancelarProcesoTest);							
		this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.setVisible((this.isVisibilidadCeldaGuardarProcesoTest && this.isPermisoGuardarCambiosProcesoTest));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoTest() {
		if(ProcesoTestJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoTest();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoTest() {
	}
	
	public void jTableDatosProcesoTestListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoTest(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesotest==null) {
						this.procesotest = new ProcesoTest();
					}

					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				}

				if(this.procesotest.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesotest.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoTestUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoTest(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoTest.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoTest.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesotestLogic.getConnexion());

				if(this.procesotest.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesotest.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoTest=(TitledBorder)this.jScrollPanelDatosProcesoTest.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoTest.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesotest==null) {
						this.procesotest = new ProcesoTest();
					}

					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				}

				if(this.procesotest.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesotest.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloProcesoTestUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebProcesoTest(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoTest.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoTest.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.procesotestLogic.getConnexion());

				if(this.procesotest.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.procesotest.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoTest=(TitledBorder)this.jScrollPanelDatosProcesoTest.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderProcesoTest.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloProcesoTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesotest==null) {
						this.procesotest = new ProcesoTest();
					}

					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				}

				if(this.procesotest.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.procesotest.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoTestBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTest(this.getprocesotest(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesotest==null) {
						this.procesotest = new ProcesoTest();
					}

					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);
				}

				if(this.procesotest.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesotest.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTest(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTestActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoTest(false,false);

			this.getProcesoTestsBusquedaPorIdEmpresaPorIdModulo();

			this.inicializarActualizarBindingProcesoTest(false);

			//if(ProcesoTestBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoTest(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesotestLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoTest() {
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
			this.jInternalFrameDetalleFormProcesoTest.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoTest.dispose();
			this.jInternalFrameDetalleFormProcesoTest=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
			this.jInternalFrameReporteDinamicoProcesoTest.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoTest.dispose();
			this.jInternalFrameReporteDinamicoProcesoTest=null;
		}
		
		if(this.jInternalFrameImportacionProcesoTest!=null) {
			this.jInternalFrameImportacionProcesoTest.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoTest.dispose();
			this.jInternalFrameImportacionProcesoTest=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoTest();
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoTest")) {
				jButtonDuplicarProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoTest")) {
				jButtonCopiarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoTest")) {
				jButtonVerFormProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoTest")) {
				jButtonDuplicarProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoTest")) {
				jButtonDuplicarProcesoTestActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoTest")) {
				jButtonModificarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoTest")) {
				jButtonModificarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoTest")) {
				jButtonModificarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoTest")) {
				jButtonActualizarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoTest")) {
				jButtonActualizarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoTest")) {
				jButtonActualizarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoTest")) {
				jButtonEliminarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoTest")) {
				jButtonEliminarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoTest")) {
				jButtonEliminarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoTest")) {
				jButtonCancelarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoTest")) {
				jButtonCancelarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoTest")) {
				jButtonCancelarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoTest")) {
				jButtonCerrarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoTest")) {
				jButtonCerrarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoTest")) {
				jButtonCerrarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoTest")) {
				jButtonMostrarOcultarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoTest")) {
				jButtonCancelarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoTest")) {
				jButtonCopiarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoTest")) {
				jButtonVerFormProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoTest")) {
				jButtonCopiarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoTest")) {
				jButtonVerFormProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoTest")) {
				jButtonRecargarInformacionProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoTest")) {
				jButtonRecargarInformacionProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoTest")) {
				jButtonRecargarInformacionProcesoTestActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoTest")) {
				jButtonAnterioresProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoTest")) {
				jButtonAnterioresProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoTest")) {
				jButtonAnterioresProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoTest")) {
				jButtonSiguientesProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoTest")) {
				jButtonSiguientesProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoTest")) {
				jButtonSiguientesProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoTest") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoTest")) {
				jButtonAbrirOrderByProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoTest") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoTest")) {
				jButtonMostrarOcultarProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoTest")) {
				jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoTest")) {
				jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoTest")) {
				jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoTest")) {
				jButtonProcesarInformacionProcesoTestActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoTest")) {
				jButtonCerrarReporteDinamicoProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoTest")) {
				jButtonGenerarReporteDinamicoProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoTest")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoTest")) {
				jButtonCerrarImportacionProcesoTestActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoTest")) {
				
				jButtonGenerarImportacionProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoTest")) {
				
				jButtonAbrirImportacionProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoTest")) {
				jComboBoxTiposAccionesProcesoTestActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoTest")) {
				jComboBoxTiposRelacionesProcesoTestActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoTest")) {
				jComboBoxTiposAccionesProcesoTestActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoTest")) {
				
				jComboBoxTiposSeleccionarProcesoTestActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoTest")) {
				jTextFieldValorCampoGeneralProcesoTestActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoTest")) {
				jButtonAbrirOrderByProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoTest")) {
				jButtonAbrirOrderByProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoTest")) {
				jButtonCerrarOrderByProcesoTestActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoTestBusqueda")) {
				this.jButtonidProcesoTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoTestUpdate")) {
				this.jButtonid_empresaProcesoTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoTestBusqueda")) {
				this.jButtonid_empresaProcesoTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloProcesoTestUpdate")) {
				this.jButtonid_moduloProcesoTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloProcesoTestBusqueda")) {
				this.jButtonid_moduloProcesoTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoTestBusqueda")) {
				this.jButtonnombreProcesoTestBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdEmpresaPorIdModuloProcesoTest")) {
				this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTestActionPerformed(evt);
			}
			
			;
			
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoTest();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoTest procesotestLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesotestLocal=this.procesotest;
			} else {
				procesotestLocal=this.procesotestAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
							
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
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
			
			


			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
								
						
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
								
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
							
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
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
			
			


			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
								
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoTest")) {
					jCheckBoxSeleccionarTodosProcesoTestItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoTest")) {
					jCheckBoxSeleccionadosProcesoTestItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoTest")) {
					
				}
				
				


				
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
												
				
				


				
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
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
			
			


			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTestActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesotest);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesotest);
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
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
				
				


				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTest.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTest.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTestActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesotestAnterior =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesotestAnterior =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoTest")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoTestListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoTest.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesotest =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesotest =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesotest);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoTest")) {
				
				}
				
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoTest")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoTest.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoTest")) {
			
			}
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoTest();
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoTest")) {
				jButtonDuplicarProcesoTestActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoTest")) {
				jButtonCopiarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoTest")) {
				jButtonVerFormProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoTest")) {
				jButtonNuevoProcesoTestActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoTest")) {
				jButtonModificarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoTest")) {
				jButtonActualizarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoTest")) {
				jButtonEliminarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoTest")) {
				jButtonCancelarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoTest")) {
				jButtonCerrarProcesoTestActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoTest")) {
				jButtonGuardarCambiosProcesoTestActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoTest")) {
				jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoTest")) {
				jButtonAbrirOrderByProcesoTestActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoTest")) {
				jButtonRecargarInformacionProcesoTestActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoTest")) {
				jButtonAnterioresProcesoTestActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoTest")) {
				jButtonSiguientesProcesoTestActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoTestBusqueda")) {
				this.jButtonidProcesoTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoTestUpdate")) {
				this.jButtonid_empresaProcesoTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoTestBusqueda")) {
				this.jButtonid_empresaProcesoTestBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloProcesoTestUpdate")) {
				this.jButtonid_moduloProcesoTestUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloProcesoTestBusqueda")) {
				this.jButtonid_moduloProcesoTestBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoTestBusqueda")) {
				this.jButtonnombreProcesoTestBusquedaActionPerformed(evt);
			}
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoTest();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoTest")) {
				closingInternalFrameProcesoTest();
				
			} else if(sTipo.equals("jButtonCancelarProcesoTest")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoTest = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoTestBeanSwingJInternalFrame jInternalFrameParent=(ProcesoTestBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoTest.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoTestActionPerformed(null);
			}
			
			ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesotest,new Object(),this.procesotestParameterGeneral,this.procesotestReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoTest(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoTest(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoTest(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesotest)) {
			if(!esControlTabla) {
				if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);			
				}
				
				if(this.procesotestSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoTest(this.procesotest,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoTest(this.procesotestReturnGeneral,this.procesotestBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesotestSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoTest(classes,this.procesotestReturnGeneral,this.procesotestBean,false);
					}
						
					if(this.procesotestReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoTest(this.procesotestReturnGeneral.getProcesoTest());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoTest(this.procesotestReturnGeneral.getProcesoTest());	
					}
						
					if(this.procesotestReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoTest(this.procesotestReturnGeneral.getProcesoTest(),classes);//this.procesotestBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoTest(this.procesotest,classes);//this.procesotestBean);									
				}
			
				if(ProcesoTestJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoTest(this.procesotest,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTest(this.procesotest);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesotestAnterior!=null) {
						this.procesotest=this.procesotestAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesotestSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesotestSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesotestReturnGeneral.getProcesoTest(),procesotestLogic.getProcesoTests());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesotestReturnGeneral.getProcesoTest(),this.procesotests);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoTest.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoTest.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoTest();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoTest() throws Exception {
		
		ProcesoTestModel procesotestModel=(ProcesoTestModel)this.jTableDatosProcesoTest.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesotestModel.procesotests=this.procesotestLogic.getProcesoTests();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesotestModel.procesotests=this.procesotests;
		}
		
		
		((ProcesoTestModel) this.jTableDatosProcesoTest.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoTest() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesotestAnterior(),this.procesotestLogic.getProcesoTests());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesotestAnterior(),this.procesotests);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoTest();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoTest(ProcesoTest procesotest,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
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
										
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesotest,new Object(),generalEntityParameterGeneral,this.procesotestReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesotestSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoTestConstantesFunciones.getClassesRelationshipsOfProcesoTest(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoTestConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoTest(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoTest(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoTestBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesotest,new Object(),generalEntityParameterGeneral,this.procesotestReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoTest(ProcesoTestBean procesotestBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoTest(ArrayList<Classe> classes,ProcesoTestReturnGeneral procesotestReturnGeneral,ProcesoTestBean procesotestBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoTest(ProcesoTest procesotest,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesotest)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoTest = new ProcesoTestDetalleFormJInternalFrame(jDesktopPane,this.procesotestSessionBean.getConGuardarRelaciones(),this.procesotestSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.setVisible(false);
		this.jInternalFrameDetalleFormProcesoTest.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoTest.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoTest.procesotestLogic=this.procesotestLogic;
		
		this.cargarCombosFrameForeignKeyProcesoTest("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoTest();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoTest();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoTest("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoTest();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoTest.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoTest"));
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonModificarProcesoTest.addActionListener(new ButtonActionListener(this,"ModificarProcesoTest"));

		
		this.jInternalFrameDetalleFormProcesoTest.jButtonModificarToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoTest"));
					
		this.jInternalFrameDetalleFormProcesoTest.jMenuItemModificarProcesoTest.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoTest"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.addActionListener (new ButtonActionListener(this,"ActualizarProcesoTest"));
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoTest"));
						
		this.jInternalFrameDetalleFormProcesoTest.jMenuItemActualizarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoTest"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.addActionListener (new ButtonActionListener(this,"EliminarProcesoTest"));
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoTest"));
								
		this.jInternalFrameDetalleFormProcesoTest.jMenuItemEliminarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoTest"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.addActionListener (new ButtonActionListener(this,"CancelarProcesoTest"));
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoTest"));
					
		this.jInternalFrameDetalleFormProcesoTest.jMenuItemCancelarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoTest"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jMenuItemDetalleCerrarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoTest"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTest"));
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTest"));
		
		
		
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoTest"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonidProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonnombreProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoTestBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoTest"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoTest"));
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoTest"));
		}
		
		this.jTableDatosProcesoTest.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoTest"));
		
		this.jTableDatosProcesoTest.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoTest"));
		
		this.jButtonNuevoProcesoTest.addActionListener(new ButtonActionListener(this,"NuevoProcesoTest"));
		
		this.jButtonDuplicarProcesoTest.addActionListener(new ButtonActionListener(this,"DuplicarProcesoTest"));
		
		this.jButtonCopiarProcesoTest.addActionListener(new ButtonActionListener(this,"CopiarProcesoTest"));
		
		this.jButtonVerFormProcesoTest.addActionListener(new ButtonActionListener(this,"VerFormProcesoTest"));
		
		
		this.jButtonNuevoToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoTest"));
			
		this.jButtonDuplicarToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoTest"));
			
		this.jMenuItemNuevoProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoTest"));
			
		this.jMenuItemDuplicarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoTest"));		
		
		
		this.jButtonNuevoRelacionesProcesoTest.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoTest"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoTest"));
			
		this.jMenuItemNuevoRelacionesProcesoTest.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoTest"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonModificarProcesoTest.addActionListener(new ButtonActionListener(this,"ModificarProcesoTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonModificarToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoTest"));
			
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemModificarProcesoTest.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarProcesoTest.addActionListener (new ButtonActionListener(this,"ActualizarProcesoTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonActualizarToolBarProcesoTest.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoTest"));
				
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemActualizarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarProcesoTest.addActionListener (new ButtonActionListener(this,"EliminarProcesoTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonEliminarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoTest"));
						
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemEliminarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarProcesoTest.addActionListener (new ButtonActionListener(this,"CancelarProcesoTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonCancelarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoTest"));
			
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemCancelarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoTest"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoTest"));		
		
		
		this.jButtonCerrarProcesoTest.addActionListener (new ButtonActionListener(this,"CerrarProcesoTest"));
		
		
		this.jButtonCerrarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoTest"));
			
		this.jMenuItemCerrarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoTest"));
			
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jMenuItemDetalleCerrarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoTest"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoTest"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTest"));
		}
		
		this.jButtonCopiarToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoTest"));
			
		this.jButtonVerFormToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoTest"));
		
		this.jMenuItemGuardarCambiosProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoTest"));
			
		this.jMenuItemCopiarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoTest"));		
		
		this.jMenuItemVerFormProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoTest"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoTest"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoTest"));
			
		this.jMenuItemGuardarCambiosTablaProcesoTest.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoTest"));		
		
		
		
		this.jButtonRecargarInformacionProcesoTest.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoTest"));
					
		this.jButtonRecargarInformacionToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoTest"));
		
		this.jMenuItemRecargarInformacionProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoTest"));		
		
		
		
		this.jButtonAnterioresProcesoTest.addActionListener (new ButtonActionListener(this,"AnterioresProcesoTest"));
		
		
		this.jButtonAnterioresToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoTest"));
		
		this.jMenuItemAnterioresProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoTest"));		
		
		
		this.jButtonSiguientesProcesoTest.addActionListener (new ButtonActionListener(this,"SiguientesProcesoTest"));
		
		
		this.jButtonSiguientesToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoTest"));
			
		this.jMenuItemSiguientesProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoTest"));
			
		this.jMenuItemAbrirOrderByProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoTest"));
			
		this.jMenuItemMostrarOcultarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoTest"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoTest"));
			
		this.jMenuItemDetalleMostarOcultarProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoTest"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoTest.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoTest"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoTest"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoTest.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoTest"));		
		
		
		this.jButtonProcesarInformacionProcesoTest.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoTest"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoTest.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoTest"));

		this.jCheckBoxSeleccionadosProcesoTest.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoTest"));
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoTest"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoTest.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoTest"));
			
		this.jComboBoxTiposAccionesProcesoTest.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoTest"));
					
		this.jComboBoxTiposSeleccionarProcesoTest.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoTest"));
			
		this.jTextFieldValorCampoGeneralProcesoTest.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoTest"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonidProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonnombreProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoTestBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEmpresaPorIdModuloProcesoTest"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoTest!=null) {
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTest"));
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTest"));
				this.jInternalFrameReporteDinamicoProcesoTest.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTest"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoTest.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTest"));				
			//this.jButtonGenerarReporteDinamicoProcesoTest.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTest"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoTest.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTest"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoTest!=null) {
				this.jInternalFrameImportacionProcesoTest.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoTest"));
				this.jInternalFrameImportacionProcesoTest.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoTest"));
				this.jInternalFrameImportacionProcesoTest.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoTest"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoTest.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoTest"));
			
			this.jButtonAbrirOrderByToolBarProcesoTest.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoTest"));			
			
			if(this.jInternalFrameOrderByProcesoTest!=null) {
				this.jInternalFrameOrderByProcesoTest.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoTest"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoTest!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTest.jTabbedPaneRelacionesProcesoTest.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoTest"));
		
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
            		closingInternalFrameProcesoTest();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoTest.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoTest = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoTestBeanSwingJInternalFrame jInternalFrameParent=(ProcesoTestBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoTest.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoTestActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoTest.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoTestListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoTest.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoTest.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoTest";
		inputMap = this.jButtonNuevoProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoTestActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTestActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoTest";
		inputMap = this.jButtonNuevoRelacionesProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoTestActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoTest";
		inputMap = this.jButtonModificarProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoTest";
		inputMap = this.jButtonActualizarProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoTest";
		inputMap = this.jButtonEliminarProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoTest";
		inputMap = this.jButtonCancelarProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoTest";
		inputMap = this.jButtonCerrarProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoTest";
		inputMap = this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoTest.jButtonGuardarCambiosProcesoTest.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoTestActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoTest.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoTestItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoTest.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoTestActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonidProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_empresaProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoTestBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestUpdate.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonid_moduloProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloProcesoTestBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTest.jButtonnombreProcesoTestBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoTestBusqueda"));
		
		
		this.jButtonBusquedaPorIdEmpresaPorIdModuloProcesoTest.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEmpresaPorIdModuloProcesoTest"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoTest.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoTestActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoTestActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoTest.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoTest(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
					procesotestAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTest procesotestAux:procesotests) {
					procesotestAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoTestItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoTest(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
						procesotestAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTest procesotestAux:procesotests) {
						procesotestAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTest procesotestAux:procesotests) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoTest(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoTest.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoTest.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoTest,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoTestItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoTest(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoTest.getSelectedRows();
			
			ProcesoTest procesotestLocal=new ProcesoTest();
			
			//this.seleccionarTodosProcesoTest(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesotestLocal =(ProcesoTest) this.procesotestLogic.getProcesoTests().toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesotestLocal =(ProcesoTest) this.procesotests.toArray()[this.jTableDatosProcesoTest.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesotestLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
						procesotestAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTest procesotestAux:procesotests) {
						procesotestAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoTest(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoTest.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoTest.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoTest,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoTestItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoTestParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoTestActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoTest(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoTest.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoTest procesotestAux:this.procesotestLogic.getProcesoTests()) {
				
						if(sTipoSeleccionar.equals(ProcesoTestConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesotestAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTest procesotestAux:procesotests) {
					
						if(sTipoSeleccionar.equals(ProcesoTestConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesotestAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoTest(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoTestActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoTest(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoTest=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoTest.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoTest) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoTest(conSplash);
				
					this.generarReporteProcesoTestsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoTestsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoTestsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoTestsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoTest();
				
				this.exportarProcesoTestsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoTests();
				//this.importarProcesoTests();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoTest();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoTestsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoTest();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoTest)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoTest(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoTestBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoTest) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoTest(conSplash);
					
						//this.actualizarParametrosGeneralProcesoTest();
						
						this.generarReporteProcesoAccionProcesoTestsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoTestBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso TestES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Test", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoTest();
				
						this.actualizarParametrosGeneralProcesoTest();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesotestReturnGeneral=procesotestLogic.procesarAccionProcesoTestsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesotestLogic.getProcesoTests(),this.procesotestParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoTestReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoTest();
					
					ProcesoTestBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoTestReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoTest.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoTest.jComboBoxTiposAccionesFormularioProcesoTest.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoTest(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoTestActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoTest();
			
			if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
			ProcesoTest procesotest=new ProcesoTest();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoTest(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoTest.getSelectedItem();
			
			
			
			
			procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesotestsSeleccionados.size()==1) {
				for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
					procesotest=procesotestAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoTest();
			
      		//this.finishProcessProcesoTest(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoTestReturnGeneral() throws Exception {
		if(this.procesotestReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesotestReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesotestReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesotestReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesotestReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesotestReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoTest(false);
		}
		
		if(this.procesotestReturnGeneral.getConRetornoLista() || this.procesotestReturnGeneral.getConRetornoObjeto()) {
			if(this.procesotestReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesotestLogic.setProcesoTests(this.procesotestReturnGeneral.getProcesoTests());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoTest(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoTest() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoTest> getProcesoTestsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoTest) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoTest procesotestAux:procesotestLogic.getProcesoTests()) {
					if(procesotestAux.getIsSelected()) {
						procesotestsSeleccionados.add(procesotestAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTest procesotestAux:this.procesotests) {
					if(procesotestAux.getIsSelected()) {
						procesotestsSeleccionados.add(procesotestAux);				
					}
				}
			}
			
			if(procesotestsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesotestsSeleccionados.addAll(this.procesotestLogic.getProcesoTests());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesotestsSeleccionados.addAll(this.procesotests);				
					}
				}
			}
		} else {
			procesotestsSeleccionados.add(this.procesotest);
		}
		
		return procesotestsSeleccionados;
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
	
	public void generarReporteProcesoTestsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoTestsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoTestsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoTestsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoTestsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Test",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoTests("Todos",procesotestsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoTests("Todos",procesotestsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoTestsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoTests("Todos",procesotestsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoTest();
		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoTest();
		
		
		//this.generarReporteProcesoTests("Todos",procesotestsSeleccionados ,procesotestImplementable,procesotestImplementableHome);
	}
	
	public void mostrarImportacionProcesoTests() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoTest();
		
		this.abrirFrameImportacionProcesoTest();		
		
			
		//this.generarReporteProcesoTests("Todos",procesotestsSeleccionados ,procesotestImplementable,procesotestImplementableHome);
	}
	
	public void importarProcesoTests() throws Exception {		
	
	}
	
	public void exportarProcesoTestsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoTestsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoTestsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoTestsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Test",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoTest(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoTest(procesotestAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesotestAux.setsDetalleGeneralEntityReporte(procesotestAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoTest(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoTestConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTestConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTestConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTestConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTestConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoTest(ProcesoTest procesotest,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesotest.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesotest.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesotest.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesotest.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesotest.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoTests");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoTest(row);				
				iRow++;
			}				
			
			for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoTest(procesotestAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoTestsSeleccionados() throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();		
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesotest.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesotests");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesotest");
			//elementRoot.appendChild(element);
		
			for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
				element = document.createElement("procesotest");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoTest(procesotestAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Test",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoTest(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTestConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoTest(ProcesoTest procesotest,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesotest.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesotest.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesotest.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesotest.getnombre());				
	}
	
	public void setFilaDatosExportarXmlProcesoTest(ProcesoTest procesotest,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoTestConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesotest.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoTestConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesotest.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoTestConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesotest.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(ProcesoTestConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(procesotest.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementnombre = document.createElement(ProcesoTestConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesotest.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoProcesoTestsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoTest> procesotestsSeleccionados=new ArrayList<ProcesoTest>();
		
		procesotestsSeleccionados=this.getProcesoTestsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoTest(procesotestsSeleccionados);
		
		this.generarReporteProcesoTests("Todos",procesotestsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoTest(ArrayList<ProcesoTest> procesotestsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoTest procesotestAux:procesotestsSeleccionados) {
				procesotestAux.setsDetalleGeneralEntityReporte(procesotestAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesotestAux.setsDescripcionGeneralEntityReporte1(procesotestAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoTestConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					procesotestAux.setsDescripcionGeneralEntityReporte1(procesotestAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoTestConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesotestAux.setsDescripcionGeneralEntityReporte1(procesotestAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTestConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoTest(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoTest=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoTest=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoTest=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=true;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=true;
			this.isVisibilidadCeldaEliminarProcesoTest=true;
			this.isVisibilidadCeldaCancelarProcesoTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=true;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoTest=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=true;
			this.isVisibilidadCeldaModificarProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
			this.isVisibilidadCeldaModificarProcesoTest=true;
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
			this.isVisibilidadCeldaCancelarProcesoTest=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTest=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoTestJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoTest=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=true;
		} else {
			this.actualizarEstadoPanelsProcesoTest(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoTest=false;
			//this.isVisibilidadCeldaVerFormProcesoTest=false;
			this.isVisibilidadCeldaDuplicarProcesoTest=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesotestSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoTest=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesotestSessionBean.getEsGuardarRelacionado()) {
			if(!procesotestSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;												
			}
			
			this.jButtonCerrarProcesoTest.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
		}
		
		if(!this.permiteMantenimiento(this.procesotest)) {
			this.isVisibilidadCeldaActualizarProcesoTest=false;
			this.isVisibilidadCeldaEliminarProcesoTest=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoTest=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoTest=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoTest=false;
		//this.isVisibilidadCeldaModificarProcesoTest=true;
		this.isVisibilidadCeldaActualizarProcesoTest=false;
		this.isVisibilidadCeldaEliminarProcesoTest=false;
		//this.isVisibilidadCeldaCancelarProcesoTest=true;			
		this.isVisibilidadCeldaGuardarProcesoTest=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoTest() {
	}
	
	public void actualizarEstadoPanelsProcesoTest(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoTest!=null) {
				this.jScrollPanelDatosEdicionProcesoTest.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTest!=null) {
				this.jScrollPanelDatosProcesoTest.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTest!=null) {
				this.jPanelPaginacionProcesoTest.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesotestSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoTest!=null) {
					this.jTabbedPaneBusquedasProcesoTest.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesotestSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTest!=null) {
				this.jTabbedPaneBusquedasProcesoTest.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoTest!=null) {
				this.jPanelParametrosReportesProcesoTest.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo=isParaEmpresa;
			if(!this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo) {this.jTabbedPaneBusquedasProcesoTest.remove(jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdEmpresaPorIdModulo) {this.jTabbedPaneBusquedasProcesoTest.remove(jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);}
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
			
			this.inicializarActualizarBindingTablaProcesoTest(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoTest() {
		this.updateBorderResaltarBusquedasFormularioProcesoTest();
		this.updateVisibilidadBusquedasFormularioProcesoTest();
		this.updateHabilitarBusquedasFormularioProcesoTest();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoTest() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoTest.getComponents().length>0) {
	

		if(this.procesotestConstantesFunciones.resaltarBusquedaPorIdEmpresaPorIdModuloProcesoTest!=null) {
			index= this.jTabbedPaneBusquedasProcesoTest.indexOfComponent(this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTest.getComponent(index);
				jPanel.setBorder(this.procesotestConstantesFunciones.resaltarBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoTest() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoTest.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoTest.indexOfComponent(this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTest.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesotestConstantesFunciones.mostrarBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			if(!this.procesotestConstantesFunciones.mostrarBusquedaPorIdEmpresaPorIdModuloProcesoTest && index>-1) {
				this.jTabbedPaneBusquedasProcesoTest.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoTest() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoTest.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoTest.indexOfComponent(this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTest.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesotestConstantesFunciones.activarBusquedaPorIdEmpresaPorIdModuloProcesoTest);
				this.jTabbedPaneBusquedasProcesoTest.setEnabledAt(index,this.procesotestConstantesFunciones.activarBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoTest(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdEmpresaPorIdModulo")) {
			index= this.jTabbedPaneBusquedasProcesoTest.indexOfComponent(this.jPanelBusquedaPorIdEmpresaPorIdModuloProcesoTest);

			this.jTabbedPaneBusquedasProcesoTest.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTest.getComponent(index);

			this.procesotestConstantesFunciones.setResaltarBusquedaPorIdEmpresaPorIdModuloProcesoTest(resaltar);

			jPanel.setBorder(this.procesotestConstantesFunciones.resaltarBusquedaPorIdEmpresaPorIdModuloProcesoTest);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoTest.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoTest() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoTest();
		this.updateVisibilidadResaltarControlesFormularioProcesoTest();
		this.updateHabilitarResaltarControlesFormularioProcesoTest();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoTest() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesotestConstantesFunciones.resaltaridProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest!=null) {this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setBorder(this.procesotestConstantesFunciones.resaltaridProcesoTest);}
		if(this.procesotestConstantesFunciones.resaltarid_empresaProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest!=null) {this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setBorder(this.procesotestConstantesFunciones.resaltarid_empresaProcesoTest);}
		if(this.procesotestConstantesFunciones.resaltarid_moduloProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest!=null) {this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setBorder(this.procesotestConstantesFunciones.resaltarid_moduloProcesoTest);}
		if(this.procesotestConstantesFunciones.resaltarnombreProcesoTest!=null && this.jInternalFrameDetalleFormProcesoTest!=null) {this.jInternalFrameDetalleFormProcesoTest.jTextFieldnombreProcesoTest.setBorder(this.procesotestConstantesFunciones.resaltarnombreProcesoTest);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoTest() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
	
		//this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setVisible(this.procesotestConstantesFunciones.mostraridProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jPanelidProcesoTest.setVisible(this.procesotestConstantesFunciones.mostraridProcesoTest);
		//this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarid_empresaProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jPanelid_empresaProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarid_empresaProcesoTest);
		//this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarid_moduloProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jPanelid_moduloProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarid_moduloProcesoTest);
		//this.jInternalFrameDetalleFormProcesoTest.jTextFieldnombreProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarnombreProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jPanelnombreProcesoTest.setVisible(this.procesotestConstantesFunciones.mostrarnombreProcesoTest);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoTest() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoTest==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoTest!=null) {
	
		this.jInternalFrameDetalleFormProcesoTest.jLabelidProcesoTest.setEnabled(this.procesotestConstantesFunciones.activaridProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_empresaProcesoTest.setEnabled(this.procesotestConstantesFunciones.activarid_empresaProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jComboBoxid_moduloProcesoTest.setEnabled(this.procesotestConstantesFunciones.activarid_moduloProcesoTest);
		this.jInternalFrameDetalleFormProcesoTest.jTextFieldnombreProcesoTest.setEnabled(this.procesotestConstantesFunciones.activarnombreProcesoTest);
		}
	}
	
		
}